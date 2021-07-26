SHADER
#define WR_FRAGMENT_SHADER
uTransformuModeFailed to link shader program: Warnings detected on shader: Failed to compile shader: #version 150
#include //  is already included
.glsl/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#if defined(GL_ES)
    #if GL_ES == 1
        #ifdef GL_FRAGMENT_PRECISION_HIGH
        precision highp sampler2DArray;
        #else
        precision mediump sampler2DArray;
        #endif

        // Sampler default precision is lowp on mobile GPUs.
        // This causes RGBA32F texture data to be clamped to 16 bit floats on some GPUs (e.g. Mali-T880).
        // Define highp precision macro to allow lossless FLOAT texture sampling.
        #define HIGHP_SAMPLER_FLOAT highp

        // Default int precision in GLES 3 is highp (32 bits) in vertex shaders
        // and mediump (16 bits) in fragment shaders. If an int is being used as
        // a texel address in a fragment shader it, and therefore requires > 16
        // bits, it must be qualified with this.
        #define HIGHP_FS_ADDRESS highp

        // texelFetchOffset is buggy on some Android GPUs (see issue #1694).
        // Fallback to texelFetch on mobile GPUs.
        #define TEXEL_FETCH(sampler, position, lod, offset) texelFetch(sampler, position + offset, lod)
    #else
        #define HIGHP_SAMPLER_FLOAT
        #define HIGHP_FS_ADDRESS
        #define TEXEL_FETCH(sampler, position, lod, offset) texelFetchOffset(sampler, position, lod, offset)
    #endif
#else
    #define HIGHP_SAMPLER_FLOAT
    #define HIGHP_FS_ADDRESS
    #define TEXEL_FETCH(sampler, position, lod, offset) texelFetchOffset(sampler, position, lod, offset)
#endif

#ifdef WR_VERTEX_SHADER
    #define varying out
#endif

#ifdef WR_FRAGMENT_SHADER
    precision highp float;
    #define varying in
#endif
98411b18b7b42c5260f164e2382d8519474509b8f3421ce8b30522b1bd1a70fb/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

/// # Brush vertex shaders memory layout
///
/// The overall memory layout is the same for all brush shaders.
///
/// The vertex shader receives a minimal amount of data from vertex attributes (packed into a single
/// ivec4 per instance) and the rest is fetched from various uniform samplers using offsets decoded
/// from the vertex attributes.
///
/// The diagram below shows the the various pieces of data fectched in the vertex shader:
///
///```ascii
///                                                                         (sPrimitiveHeadersI)
///                          (VBO)                                     +-----------------------+
/// +----------------------------+      +----------------------------> | Int header            |
/// | Instance vertex attributes |      |        (sPrimitiveHeadersF)  |                       |
/// |                            |      |     +---------------------+  |   z                   |
/// | x: prim_header_address    +-------+---> | Float header        |  |   specific_address  +-----+
/// | y: picture_task_address   +---------+   |                     |  |   transform_address +---+ |
/// |    clip_address           +-----+   |   |    local_rect       |  |   user_data           | | |
/// | z: flags                   |    |   |   |    local_clip_rect  |  +-----------------------+ | |
/// |    segment_index           |    |   |   +---------------------+                            | |
/// | w: resource_address       +--+  |   |                                                      | |
/// +----------------------------+ |  |   |                                 (sGpuCache)          | |
///                                |  |   |         (sGpuCache)          +------------+          | |
///                                |  |   |   +---------------+          | Transform  | <--------+ |
///                (sGpuCache)     |  |   +-> | Picture task  |          +------------+            |
///            +-------------+     |  |       |               |                                    |
///            |  Resource   | <---+  |       |         ...   |                                    |
///            |             |        |       +---------------+   +--------------------------------+
///            |             |        |                           |
///            +-------------+        |             (sGpuCache)   v                        (sGpuCache)
///                                   |       +---------------+  +--------------+---------------+-+-+
///                                   +-----> | Clip area     |  | Brush data   |  Segment data | | |
///                                           |               |  |              |               | | |
///                                           |         ...   |  |         ...  |          ...  | | | ...
///                                           +---------------+  +--------------+---------------+-+-+
///```
///
/// - Segment data address is obtained by combining the address stored in the int header and the
///   segment index decoded from the vertex attributes.
/// - Resource data is optional, some brush types (such as images) store some extra data there while
///   other brush types don't use it.
///

#ifdef WR_FEATURE_MULTI_BRUSH
flat varying int v_brush_kind;
#endif

// A few varying slots for the brushes to use.
// Using these instead of adding dedicated varyings avoids using a high
// number of varyings in the multi-brush shader.
flat varying vec4 flat_varying_vec4_0;
flat varying vec4 flat_varying_vec4_1;
flat varying vec4 flat_varying_vec4_2;
flat varying vec4 flat_varying_vec4_3;
flat varying vec4 flat_varying_vec4_4;

flat varying ivec4 flat_varying_ivec4_0;

varying vec4 varying_vec4_0;
varying vec4 varying_vec4_1;

flat varying HIGHP_FS_ADDRESS int flat_varying_highp_int_address_0;

#ifdef WR_VERTEX_SHADER

#define FWD_DECLARE_VS_FUNCTION(name)   \
void name(                              \
    VertexInfo vi,                      \
    int prim_address,                   \
    RectWithSize local_rect,            \
    RectWithSize segment_rect,          \
    ivec4 prim_user_data,               \
    int specific_resource_address,      \
    mat4 transform,                     \
    PictureTask pic_task,               \
    int brush_flags,                    \
    vec4 segment_data                   \
);

// Forward-declare all brush vertex entry points.
FWD_DECLARE_VS_FUNCTION(image_brush_vs)
FWD_DECLARE_VS_FUNCTION(solid_brush_vs)
FWD_DECLARE_VS_FUNCTION(blend_brush_vs)
FWD_DECLARE_VS_FUNCTION(mix_blend_brush_vs)
FWD_DECLARE_VS_FUNCTION(linear_gradient_brush_vs)
FWD_DECLARE_VS_FUNCTION(radial_gradient_brush_vs)
FWD_DECLARE_VS_FUNCTION(conic_gradient_brush_vs)
FWD_DECLARE_VS_FUNCTION(yuv_brush_vs)
FWD_DECLARE_VS_FUNCTION(opacity_brush_vs)

void multi_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 texel_rect,
    int brush_kind
);

#define VECS_PER_SEGMENT                    2

#define BRUSH_FLAG_PERSPECTIVE_INTERPOLATION    1
#define BRUSH_FLAG_SEGMENT_RELATIVE             2
#define BRUSH_FLAG_SEGMENT_REPEAT_X             4
#define BRUSH_FLAG_SEGMENT_REPEAT_Y             8
#define BRUSH_FLAG_SEGMENT_REPEAT_X_ROUND      16
#define BRUSH_FLAG_SEGMENT_REPEAT_Y_ROUND      32
#define BRUSH_FLAG_SEGMENT_NINEPATCH_MIDDLE    64
#define BRUSH_FLAG_TEXEL_RECT                 128

#define INVALID_SEGMENT_INDEX                   0xffff

void main(void) {
    // Load the brush instance from vertex attributes.
    Instance instance = decode_instance_attributes();
    int edge_flags = instance.flags & 0xff;
    int brush_flags = (instance.flags >> 8) & 0xff;
    PrimitiveHeader ph = fetch_prim_header(instance.prim_header_address);

    // Fetch the segment of this brush primitive we are drawing.
    vec4 segment_data;
    RectWithSize segment_rect;
    if (instance.segment_index == INVALID_SEGMENT_INDEX) {
        segment_rect = ph.local_rect;
        segment_data = vec4(0.0);
    } else {
        // This contraption is needed by the Mac GLSL compiler which falls
        // over (generating garbage values) if:
        // - we use a variable insead of the ACTUAL_VECS_PER_BRUSH define,
        // - this compile time condition is done inside of vecs_per_brush.
        #ifdef WR_FEATURE_MULTI_BRUSH
        #define ACTUAL_VECS_PER_BRUSH vecs_per_brush(instance.brush_kind)
        #else
        #define ACTUAL_VECS_PER_BRUSH VECS_PER_SPECIFIC_BRUSH
        #endif

        int segment_address = ph.specific_prim_address +
                              ACTUAL_VECS_PER_BRUSH +
                              instance.segment_index * VECS_PER_SEGMENT;

        vec4[2] segment_info = fetch_from_gpu_cache_2(segment_address);
        segment_rect = RectWithSize(segment_info[0].xy, segment_info[0].zw);
        segment_rect.p0 += ph.local_rect.p0;
        segment_data = segment_info[1];
    }

    VertexInfo vi;

    // Fetch the dynamic picture that we are drawing on.
    PictureTask pic_task = fetch_picture_task(instance.picture_task_address);
    ClipArea clip_area = fetch_clip_area(instance.clip_address);

    Transform transform = fetch_transform(ph.transform_id);

    // Write the normal vertex information out.
    if (transform.is_axis_aligned) {

        // Select the corner of the local rect that we are processing.
        vec2 local_pos = segment_rect.p0 + segment_rect.size * aPosition.xy;

        vi = write_vertex(
            local_pos,
            ph.local_clip_rect,
            ph.z,
            transform,
            pic_task
        );

        // TODO(gw): transform bounds may be referenced by
        //           the fragment shader when running in
        //           the alpha pass, even on non-transformed
        //           items. For now, just ensure it has no
        //           effect. We can tidy this up as we move
        //           more items to be brush shaders.
#ifdef WR_FEATURE_ALPHA_PASS
        init_transform_vs(vec4(vec2(-1.0e16), vec2(1.0e16)));
#endif
    } else {
        bvec4 edge_mask = notEqual(edge_flags & ivec4(1, 2, 4, 8), ivec4(0));

        vi = write_transform_vertex(
            segment_rect,
            ph.local_rect,
            ph.local_clip_rect,
            mix(vec4(0.0), vec4(1.0), edge_mask),
            ph.z,
            transform,
            pic_task
        );
    }

    // For brush instances in the alpha pass, always write
    // out clip information.
    // TODO(gw): It's possible that we might want alpha
    //           shaders that don't clip in the future,
    //           but it's reasonable to assume that one
    //           implies the other, for now.
#ifdef WR_FEATURE_ALPHA_PASS
    write_clip(
        vi.world_pos,
        clip_area
    );
#endif

    // Run the specific brush VS code to write interpolators.
#ifdef WR_FEATURE_MULTI_BRUSH
    v_brush_kind = instance.brush_kind;
    multi_brush_vs(
        vi,
        ph.specific_prim_address,
        ph.local_rect,
        segment_rect,
        ph.user_data,
        instance.resource_address,
        transform.m,
        pic_task,
        brush_flags,
        segment_data,
        instance.brush_kind
    );
#else
    WR_BRUSH_VS_FUNCTION(
        vi,
        ph.specific_prim_address,
        ph.local_rect,
        segment_rect,
        ph.user_data,
        instance.resource_address,
        transform.m,
        pic_task,
        brush_flags,
        segment_data
    );
#endif

}

#endif

#ifdef WR_FRAGMENT_SHADER

// Foward-declare all brush entry-points.
Fragment image_brush_fs();
Fragment solid_brush_fs();
Fragment blend_brush_fs();
Fragment mix_blend_brush_fs();
Fragment linear_gradient_brush_fs();
Fragment radial_gradient_brush_fs();
Fragment conic_gradient_brush_fs();
Fragment yuv_brush_fs();
Fragment opacity_brush_fs();
Fragment text_brush_fs();
Fragment multi_brush_fs(int brush_kind);

void main(void) {
#ifdef WR_FEATURE_DEBUG_OVERDRAW
    oFragColor = WR_DEBUG_OVERDRAW_COLOR;
#else

    // Run the specific brush FS code to output the color.
#ifdef WR_FEATURE_MULTI_BRUSH
    Fragment frag = multi_brush_fs(v_brush_kind);
#else
    Fragment frag = WR_BRUSH_FS_FUNCTION();
#endif


#ifdef WR_FEATURE_ALPHA_PASS
    // Apply the clip mask
    float clip_alpha = do_clip();

    frag.color *= clip_alpha;

    #ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
        oFragBlend = frag.blend * clip_alpha;
    #endif
#endif

    write_output(frag.color);
#endif
}
#endif
fa18f59e9933a532fe82e1c03b4ffc8cf521e9b516f186c77520fd5583affee1brush/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_BLEND_BRUSH 3
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_BLEND_BRUSH

#define WR_BRUSH_VS_FUNCTION blend_brush_vs
#define WR_BRUSH_FS_FUNCTION blend_brush_fs

#define COMPONENT_TRANSFER_IDENTITY 0
#define COMPONENT_TRANSFER_TABLE 1
#define COMPONENT_TRANSFER_DISCRETE 2
#define COMPONENT_TRANSFER_LINEAR 3
#define COMPONENT_TRANSFER_GAMMA 4

// Must be kept in sync with `Filter::as_int` in internal_types.rs
// Not all filters are defined here because some filter use different shaders.
#define FILTER_CONTRAST            0
#define FILTER_GRAYSCALE           1
#define FILTER_HUE_ROTATE          2
#define FILTER_INVERT              3
#define FILTER_SATURATE            4
#define FILTER_SEPIA               5
#define FILTER_BRIGHTNESS          6
#define FILTER_COLOR_MATRIX        7
#define FILTER_SRGB_TO_LINEAR      8
#define FILTER_LINEAR_TO_SRGB      9
#define FILTER_FLOOD               10
#define FILTER_COMPONENT_TRANSFER  11

#include shared,prim_shared,brush

// Interpolated UV coordinates to sample.
#define V_UV                varying_vec4_0.zw
#define V_LOCAL_POS         varying_vec4_0.xy

#define V_FLOOD_COLOR       flat_varying_vec4_1

// Normalized bounds of the source image in the texture.
#define V_UV_BOUNDS         flat_varying_vec4_2

#define V_COLOR_OFFSET      flat_varying_vec4_3

// Layer index to sample.
#define V_LAYER             flat_varying_vec4_4.x
// Flag to allow perspective interpolation of UV.
#define V_PERSPECTIVE       flat_varying_vec4_4.y

#define V_AMOUNT            flat_varying_vec4_4.z

#define V_OP                flat_varying_ivec4_0.x
#define V_TABLE_ADDRESS     flat_varying_ivec4_0.y

flat varying mat4 vColorMat;

flat varying int vFuncs[4];

#ifdef WR_VERTEX_SHADER

void blend_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 unused
) {
    ImageResource res = fetch_image_resource(prim_user_data.x);
    vec2 uv0 = res.uv_rect.p0;
    vec2 uv1 = res.uv_rect.p1;

    vec2 texture_size = vec2(textureSize(sColor0, 0).xy);
    vec2 f = (vi.local_pos - local_rect.p0) / local_rect.size;
    f = get_image_quad_uv(prim_user_data.x, f);
    vec2 uv = mix(uv0, uv1, f);
    float perspective_interpolate = (brush_flags & BRUSH_FLAG_PERSPECTIVE_INTERPOLATION) != 0 ? 1.0 : 0.0;

    V_UV = uv / texture_size * mix(vi.world_pos.w, 1.0, perspective_interpolate);
    V_LAYER = res.layer;
    V_PERSPECTIVE = perspective_interpolate;

    // TODO: The image shader treats this differently: deflate the rect by half a pixel on each side and
    // clamp the uv in the frame shader. Does it make sense to do the same here?
    V_UV_BOUNDS = vec4(uv0, uv1) / texture_size.xyxy;
    V_LOCAL_POS = vi.local_pos;

    float lumR = 0.2126;
    float lumG = 0.7152;
    float lumB = 0.0722;
    float oneMinusLumR = 1.0 - lumR;
    float oneMinusLumG = 1.0 - lumG;
    float oneMinusLumB = 1.0 - lumB;

    float amount = float(prim_user_data.z) / 65536.0;
    float invAmount = 1.0 - amount;

    V_OP = prim_user_data.y & 0xffff;
    V_AMOUNT = amount;

    // This assignment is only used for component transfer filters but this
    // assignment has to be done here and not in the component transfer case
    // below because it doesn't get executed on Windows because of a suspected
    // miscompile of this shader on Windows. See
    // https://github.com/servo/webrender/wiki/Driver-issues#bug-1505871---assignment-to-varying-flat-arrays-inside-switch-statement-of-vertex-shader-suspected-miscompile-on-windows
    // default: just to satisfy angle_shader_validation.rs which needs one
    // default: for every switch, even in comments.
    vFuncs[0] = (prim_user_data.y >> 28) & 0xf; // R
    vFuncs[1] = (prim_user_data.y >> 24) & 0xf; // G
    vFuncs[2] = (prim_user_data.y >> 20) & 0xf; // B
    vFuncs[3] = (prim_user_data.y >> 16) & 0xf; // A

    switch (V_OP) {
        case FILTER_GRAYSCALE: {
            vColorMat = mat4(
                vec4(lumR + oneMinusLumR * invAmount, lumR - lumR * invAmount, lumR - lumR * invAmount, 0.0),
                vec4(lumG - lumG * invAmount, lumG + oneMinusLumG * invAmount, lumG - lumG * invAmount, 0.0),
                vec4(lumB - lumB * invAmount, lumB - lumB * invAmount, lumB + oneMinusLumB * invAmount, 0.0),
                vec4(0.0, 0.0, 0.0, 1.0)
            );
            V_COLOR_OFFSET = vec4(0.0);
            break;
        }
        case FILTER_HUE_ROTATE: {
            float c = cos(amount);
            float s = sin(amount);
            vColorMat = mat4(
                vec4(lumR + oneMinusLumR * c - lumR * s, lumR - lumR * c + 0.143 * s, lumR - lumR * c - oneMinusLumR * s, 0.0),
                vec4(lumG - lumG * c - lumG * s, lumG + oneMinusLumG * c + 0.140 * s, lumG - lumG * c + lumG * s, 0.0),
                vec4(lumB - lumB * c + oneMinusLumB * s, lumB - lumB * c - 0.283 * s, lumB + oneMinusLumB * c + lumB * s, 0.0),
                vec4(0.0, 0.0, 0.0, 1.0)
            );
            V_COLOR_OFFSET = vec4(0.0);
            break;
        }
        case FILTER_SATURATE: {
            vColorMat = mat4(
                vec4(invAmount * lumR + amount, invAmount * lumR, invAmount * lumR, 0.0),
                vec4(invAmount * lumG, invAmount * lumG + amount, invAmount * lumG, 0.0),
                vec4(invAmount * lumB, invAmount * lumB, invAmount * lumB + amount, 0.0),
                vec4(0.0, 0.0, 0.0, 1.0)
            );
            V_COLOR_OFFSET = vec4(0.0);
            break;
        }
        case FILTER_SEPIA: {
            vColorMat = mat4(
                vec4(0.393 + 0.607 * invAmount, 0.349 - 0.349 * invAmount, 0.272 - 0.272 * invAmount, 0.0),
                vec4(0.769 - 0.769 * invAmount, 0.686 + 0.314 * invAmount, 0.534 - 0.534 * invAmount, 0.0),
                vec4(0.189 - 0.189 * invAmount, 0.168 - 0.168 * invAmount, 0.131 + 0.869 * invAmount, 0.0),
                vec4(0.0, 0.0, 0.0, 1.0)
            );
            V_COLOR_OFFSET = vec4(0.0);
            break;
        }
        case FILTER_COLOR_MATRIX: {
            vec4 mat_data[4] = fetch_from_gpu_cache_4(prim_user_data.z);
            vec4 offset_data = fetch_from_gpu_cache_1(prim_user_data.z + 4);
            vColorMat = mat4(mat_data[0], mat_data[1], mat_data[2], mat_data[3]);
            V_COLOR_OFFSET = offset_data;
            break;
        }
        case FILTER_COMPONENT_TRANSFER: {
            V_TABLE_ADDRESS = prim_user_data.z;
            break;
        }
        case FILTER_FLOOD: {
            V_FLOOD_COLOR = fetch_from_gpu_cache_1(prim_user_data.z);
            break;
        }
        default: break;
    }
}
#endif

#ifdef WR_FRAGMENT_SHADER
vec3 Contrast(vec3 Cs, float amount) {
    return Cs.rgb * amount - 0.5 * amount + 0.5;
}

vec3 Invert(vec3 Cs, float amount) {
    return mix(Cs.rgb, vec3(1.0) - Cs.rgb, amount);
}

vec3 Brightness(vec3 Cs, float amount) {
    // Apply the brightness factor.
    // Resulting color needs to be clamped to output range
    // since we are pre-multiplying alpha in the shader.
    return clamp(Cs.rgb * amount, vec3(0.0), vec3(1.0));
}

// Based on the Gecko's implementation in
// https://hg.mozilla.org/mozilla-central/file/91b4c3687d75/gfx/src/FilterSupport.cpp#l24
// These could be made faster by sampling a lookup table stored in a float texture
// with linear interpolation.

vec3 SrgbToLinear(vec3 color) {
    vec3 c1 = color / 12.92;
    vec3 c2 = pow(color / 1.055 + vec3(0.055 / 1.055), vec3(2.4));
    return if_then_else(lessThanEqual(color, vec3(0.04045)), c1, c2);
}

vec3 LinearToSrgb(vec3 color) {
    vec3 c1 = color * 12.92;
    vec3 c2 = vec3(1.055) * pow(color, vec3(1.0 / 2.4)) - vec3(0.055);
    return if_then_else(lessThanEqual(color, vec3(0.0031308)), c1, c2);
}

// This function has to be factored out due to the following issue:
// https://github.com/servo/webrender/wiki/Driver-issues#bug-1532245---switch-statement-inside-control-flow-inside-switch-statement-fails-to-compile-on-some-android-phones
// (and now the words "default: default:" so angle_shader_validation.rs passes)
vec4 ComponentTransfer(vec4 colora) {
    // We push a different amount of data to the gpu cache depending on the
    // function type.
    // Identity => 0 blocks
    // Table/Discrete => 64 blocks (256 values)
    // Linear => 1 block (2 values)
    // Gamma => 1 block (3 values)
    // We loop through the color components and increment the offset (for the
    // next color component) into the gpu cache based on how many blocks that
    // function type put into the gpu cache.
    // Table/Discrete use a 256 entry look up table.
    // Linear/Gamma are a simple calculation.
    int offset = 0;
    vec4 texel;
    int k;

    for (int i = 0; i < 4; i++) {
        switch (vFuncs[i]) {
            case COMPONENT_TRANSFER_IDENTITY:
                break;
            case COMPONENT_TRANSFER_TABLE:
            case COMPONENT_TRANSFER_DISCRETE: {
                // fetch value from lookup table
                k = int(floor(colora[i]*255.0));
                texel = fetch_from_gpu_cache_1(V_TABLE_ADDRESS + offset + k/4);
                colora[i] = clamp(texel[k % 4], 0.0, 1.0);
                // offset plus 256/4 blocks
                offset = offset + 64;
                break;
            }
            case COMPONENT_TRANSFER_LINEAR: {
                // fetch the two values for use in the linear equation
                texel = fetch_from_gpu_cache_1(V_TABLE_ADDRESS + offset);
                colora[i] = clamp(texel[0] * colora[i] + texel[1], 0.0, 1.0);
                // offset plus 1 block
                offset = offset + 1;
                break;
            }
            case COMPONENT_TRANSFER_GAMMA: {
                // fetch the three values for use in the gamma equation
                texel = fetch_from_gpu_cache_1(V_TABLE_ADDRESS + offset);
                colora[i] = clamp(texel[0] * pow(colora[i], texel[1]) + texel[2], 0.0, 1.0);
                // offset plus 1 block
                offset = offset + 1;
                break;
            }
            default:
                // shouldn't happen
                break;
        }
    }
    return colora;
}

Fragment blend_brush_fs() {
    float perspective_divisor = mix(gl_FragCoord.w, 1.0, V_PERSPECTIVE);
    vec2 uv = V_UV * perspective_divisor;
    vec4 Cs = texture(sColor0, vec3(uv, V_LAYER));

    // Un-premultiply the input.
    float alpha = Cs.a;
    vec3 color = alpha != 0.0 ? Cs.rgb / alpha : Cs.rgb;

    switch (V_OP) {
        case FILTER_CONTRAST:
            color = Contrast(color, V_AMOUNT);
            break;
        case FILTER_INVERT:
            color = Invert(color, V_AMOUNT);
            break;
        case FILTER_BRIGHTNESS:
            color = Brightness(color, V_AMOUNT);
            break;
        case FILTER_SRGB_TO_LINEAR:
            color = SrgbToLinear(color);
            break;
        case FILTER_LINEAR_TO_SRGB:
            color = LinearToSrgb(color);
            break;
        case FILTER_COMPONENT_TRANSFER: {
            // Get the unpremultiplied color with alpha.
            vec4 colora = vec4(color, alpha);
            colora = ComponentTransfer(colora);
            color = colora.rgb;
            alpha = colora.a;
            break;
        }
        case FILTER_FLOOD:
            color = V_FLOOD_COLOR.rgb;
            alpha = V_FLOOD_COLOR.a;
            break;
        default:
            // Color matrix type filters (sepia, hue-rotate, etc...)
            vec4 result = vColorMat * vec4(color, alpha) + V_COLOR_OFFSET;
            result = clamp(result, vec4(0.0), vec4(1.0));
            color = result.rgb;
            alpha = result.a;
    }

    // Fail-safe to ensure that we don't sample outside the rendered
    // portion of a blend source.
    alpha *= min(point_inside_rect(uv, V_UV_BOUNDS.xy, V_UV_BOUNDS.zw),
                 init_transform_fs(V_LOCAL_POS));

    // Pre-multiply the alpha into the output value.
    return Fragment(alpha * vec4(color, 1.0));
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_UV
#undef V_LOCAL_POS
#undef V_FLOOD_COLOR
#undef V_UV_BOUNDS
#undef V_COLOR_OFFSET
#undef V_AMOUNT
#undef V_LAYER
#undef V_PERSPECTIVE
#undef V_OP
#undef V_TABLE_ADDRESS
37d806ec5c39740c6ef485915c546da84a30a0ace21a1fd86277ad2ed0c8f89cbrush_blend/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_CONIC_GRADIENT_BRUSH 2
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_CONIC_GRADIENT_BRUSH

#define WR_BRUSH_VS_FUNCTION conic_gradient_brush_vs
#define WR_BRUSH_FS_FUNCTION conic_gradient_brush_fs

#include shared,prim_shared,brush

#define V_GRADIENT_ADDRESS  flat_varying_highp_int_address_0

#define V_CENTER            flat_varying_vec4_0.xy
#define V_START_OFFSET      flat_varying_vec4_0.z
#define V_END_OFFSET        flat_varying_vec4_0.w
#define V_ANGLE             flat_varying_vec4_1.w

// Size of the gradient pattern's rectangle, used to compute horizontal and vertical
// repetitions. Not to be confused with another kind of repetition of the pattern
// which happens along the gradient stops.
#define V_REPEATED_SIZE     flat_varying_vec4_1.xy
// Repetition along the gradient stops.
#define V_GRADIENT_REPEAT   flat_varying_vec4_1.z

#define V_POS               varying_vec4_0.zw

#ifdef WR_FEATURE_ALPHA_PASS
#define V_LOCAL_POS         varying_vec4_0.xy
#define V_TILE_REPEAT       flat_varying_vec4_2.xy
#endif

#define PI                  3.141592653589793

#ifdef WR_VERTEX_SHADER

struct ConicGradient {
    vec2 center_point;
    vec2 start_end_offset;
    float angle;
    int extend_mode;
    vec2 stretch_size;
};

ConicGradient fetch_gradient(int address) {
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    return ConicGradient(
        data[0].xy,
        data[0].zw,
        float(data[1].x),
        int(data[1].y),
        data[1].zw
    );
}

void conic_gradient_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 texel_rect
) {
    ConicGradient gradient = fetch_gradient(prim_address);

    if ((brush_flags & BRUSH_FLAG_SEGMENT_RELATIVE) != 0) {
        V_POS = (vi.local_pos - segment_rect.p0) / segment_rect.size;
        V_POS = V_POS * (texel_rect.zw - texel_rect.xy) + texel_rect.xy;
        V_POS = V_POS * local_rect.size;
    } else {
        V_POS = vi.local_pos - local_rect.p0;
    }

    V_CENTER = gradient.center_point;
    V_ANGLE = gradient.angle;
    V_START_OFFSET = gradient.start_end_offset.x;
    V_END_OFFSET = gradient.start_end_offset.y;

    vec2 tile_repeat = local_rect.size / gradient.stretch_size;
    V_REPEATED_SIZE = gradient.stretch_size;

    V_GRADIENT_ADDRESS = prim_user_data.x;

    // Whether to repeat the gradient along the line instead of clamping.
    V_GRADIENT_REPEAT = float(gradient.extend_mode != EXTEND_MODE_CLAMP);

#ifdef WR_FEATURE_ALPHA_PASS
    V_TILE_REPEAT = tile_repeat;
    V_LOCAL_POS = vi.local_pos;
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER
Fragment conic_gradient_brush_fs() {

#ifdef WR_FEATURE_ALPHA_PASS
    // Handle top and left inflated edges (see brush_image).
    vec2 local_pos = max(V_POS, vec2(0.0));

    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(local_pos, V_REPEATED_SIZE);

    vec2 prim_size = V_REPEATED_SIZE * V_TILE_REPEAT;
    // Handle bottom and right inflated edges (see brush_image).
    if (local_pos.x >= prim_size.x) {
        pos.x = V_REPEATED_SIZE.x;
    }
    if (local_pos.y >= prim_size.y) {
        pos.y = V_REPEATED_SIZE.y;
    }
#else
    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(V_POS, V_REPEATED_SIZE);
#endif

    vec2 current_dir = pos - V_CENTER;
    float current_angle = atan(current_dir.y, current_dir.x) + (PI / 2.0 - V_ANGLE);
    float offset = mod(current_angle / (2.0 * PI), 1.0) - V_START_OFFSET;
    offset = offset / (V_END_OFFSET - V_START_OFFSET);

    vec4 color = sample_gradient(V_GRADIENT_ADDRESS,
                                 offset,
                                 V_GRADIENT_REPEAT);

#ifdef WR_FEATURE_ALPHA_PASS
    color *= init_transform_fs(V_LOCAL_POS);
#endif

    return Fragment(color);
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_GRADIENT_ADDRESS
#undef V_START_POINT
#undef V_SCALE_DIR
#undef V_REPEATED_SIZE
#undef V_GRADIENT_REPEAT
#undef V_POS
#undef V_LOCAL_POS
#undef V_TILE_REPEAT
29dc860ce011d492cd205066512b77ddad9768cc06fbc8073f9c854e8c399c2ebrush_conic_gradient/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_IMAGE_BRUSH 3
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_IMAGE_BRUSH

#define WR_BRUSH_VS_FUNCTION image_brush_vs
#define WR_BRUSH_FS_FUNCTION image_brush_fs

#include shared,prim_shared,brush

#ifdef WR_FEATURE_ALPHA_PASS
#define V_LOCAL_POS         varying_vec4_0.xy
#endif

// Interpolated UV coordinates to sample.
#define V_UV                varying_vec4_0.zw

#ifdef WR_FEATURE_ALPHA_PASS
#define V_COLOR             flat_varying_vec4_0
#define V_MASK_SWIZZLE      flat_varying_vec4_1.xy
#define V_TILE_REPEAT       flat_varying_vec4_1.zw
#endif

// Normalized bounds of the source image in the texture.
#define V_UV_BOUNDS         flat_varying_vec4_2
// Normalized bounds of the source image in the texture, adjusted to avoid
// sampling artifacts.
#define V_UV_SAMPLE_BOUNDS  flat_varying_vec4_3
// Layer index to sample.
#define V_LAYER             flat_varying_vec4_4.x
// Flag to allow perspective interpolation of UV.
#define V_PERSPECTIVE       flat_varying_vec4_4.y

#ifdef WR_VERTEX_SHADER

// Must match the AlphaType enum.
#define BLEND_MODE_ALPHA            0
#define BLEND_MODE_PREMUL_ALPHA     1

struct ImageBrushData {
    vec4 color;
    vec4 background_color;
    vec2 stretch_size;
};

ImageBrushData fetch_image_data(int address) {
    vec4[3] raw_data = fetch_from_gpu_cache_3(address);
    ImageBrushData data = ImageBrushData(
        raw_data[0],
        raw_data[1],
        raw_data[2].xy
    );
    return data;
}

void image_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize prim_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 segment_data
) {
    ImageBrushData image_data = fetch_image_data(prim_address);

    // If this is in WR_FEATURE_TEXTURE_RECT mode, the rect and size use
    // non-normalized texture coordinates.
#ifdef WR_FEATURE_TEXTURE_RECT
    vec2 texture_size = vec2(1, 1);
#else
    vec2 texture_size = vec2(textureSize(sColor0, 0));
#endif

    ImageResource res = fetch_image_resource(specific_resource_address);
    vec2 uv0 = res.uv_rect.p0;
    vec2 uv1 = res.uv_rect.p1;

    RectWithSize local_rect = prim_rect;
    vec2 stretch_size = image_data.stretch_size;
    if (stretch_size.x < 0.0) {
        stretch_size = local_rect.size;
    }

    // If this segment should interpolate relative to the
    // segment, modify the parameters for that.
    if ((brush_flags & BRUSH_FLAG_SEGMENT_RELATIVE) != 0) {
        local_rect = segment_rect;
        stretch_size = local_rect.size;

        // If the extra data is a texel rect, modify the UVs.
        if ((brush_flags & BRUSH_FLAG_TEXEL_RECT) != 0) {
            vec2 uv_size = res.uv_rect.p1 - res.uv_rect.p0;
            uv0 = res.uv_rect.p0 + segment_data.xy * uv_size;
            uv1 = res.uv_rect.p0 + segment_data.zw * uv_size;

            // Size of the uv rect of the segment we are considering when computing
            // the repetitions. In most case it is the current segment, but for the
            // middle area we look at the border size instead.
            vec2 segment_uv_size = uv1 - uv0;

            #ifdef WR_FEATURE_REPETITION
            // The repetition parameters for the middle area of a nine-patch are based
            // on the size of the border segments rather than the middle segment itself,
            // taking top and left by default, falling back to bottom and right when a
            // size is empty.
            // TODO(bug 1609893): Move this logic to the CPU as well as other sources of
            // branchiness in this shader.
            if ((brush_flags & BRUSH_FLAG_SEGMENT_NINEPATCH_MIDDLE) != 0) {
                segment_uv_size = uv0 - res.uv_rect.p0;
                stretch_size.x = segment_rect.p0.x - prim_rect.p0.x;
                stretch_size.y = segment_rect.p0.y - prim_rect.p0.y;
                float epsilon = 0.001;
                if (segment_uv_size.x < epsilon || stretch_size.x < epsilon) {
                    segment_uv_size.x = res.uv_rect.p1.x - uv1.x;
                    stretch_size.x = prim_rect.p0.x + prim_rect.size.x
                        - segment_rect.p0.x - segment_rect.size.x;
                }
                if (segment_uv_size.y < epsilon || stretch_size.y < epsilon) {
                    segment_uv_size.y = res.uv_rect.p1.y - uv1.y;
                    stretch_size.y = prim_rect.p0.y + prim_rect.size.y
                        - segment_rect.p0.y - segment_rect.size.y;
                }
            }

            vec2 original_stretch_size = stretch_size;
            if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_X) != 0) {
              stretch_size.x = original_stretch_size.y / segment_uv_size.y * segment_uv_size.x;
            }
            if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_Y) != 0) {
              stretch_size.y = original_stretch_size.x / segment_uv_size.x * segment_uv_size.y;
            }
            #endif

        } else {
            #ifdef WR_FEATURE_REPETITION
            if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_X) != 0) {
                stretch_size.x = segment_data.z - segment_data.x;
            }
            if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_Y) != 0) {
                stretch_size.y = segment_data.w - segment_data.y;
            }
            #endif
        }

        #ifdef WR_FEATURE_REPETITION
        if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_X_ROUND) != 0) {
            float nx = max(1.0, round(segment_rect.size.x / stretch_size.x));
            stretch_size.x = segment_rect.size.x / nx;
        }
        if ((brush_flags & BRUSH_FLAG_SEGMENT_REPEAT_Y_ROUND) != 0) {
            float ny = max(1.0, round(segment_rect.size.y / stretch_size.y));
            stretch_size.y = segment_rect.size.y / ny;
        }
        #endif
    }

    float perspective_interpolate = (brush_flags & BRUSH_FLAG_PERSPECTIVE_INTERPOLATION) != 0 ? 1.0 : 0.0;
    V_LAYER = res.layer;
    V_PERSPECTIVE = perspective_interpolate;

    // Handle case where the UV coords are inverted (e.g. from an
    // external image).
    vec2 min_uv = min(uv0, uv1);
    vec2 max_uv = max(uv0, uv1);

    V_UV_SAMPLE_BOUNDS = vec4(
        min_uv + vec2(0.5),
        max_uv - vec2(0.5)
    ) / texture_size.xyxy;

    vec2 f = (vi.local_pos - local_rect.p0) / local_rect.size;

#ifdef WR_FEATURE_ALPHA_PASS
    int color_mode = prim_user_data.x & 0xffff;
    int blend_mode = prim_user_data.x >> 16;
    int raster_space = prim_user_data.y;

    if (color_mode == COLOR_MODE_FROM_PASS) {
        color_mode = uMode;
    }

    // Derive the texture coordinates for this image, based on
    // whether the source image is a local-space or screen-space
    // image.
    switch (raster_space) {
        case RASTER_SCREEN: {
            // Since the screen space UVs specify an arbitrary quad, do
            // a bilinear interpolation to get the correct UV for this
            // local position.
            f = get_image_quad_uv(specific_resource_address, f);
            break;
        }
        default:
            break;
    }
#endif

    // Offset and scale V_UV here to avoid doing it in the fragment shader.
    vec2 repeat = local_rect.size / stretch_size;
    V_UV = mix(uv0, uv1, f) - min_uv;
    V_UV /= texture_size;
    V_UV *= repeat.xy;
    if (perspective_interpolate == 0.0) {
        V_UV *= vi.world_pos.w;
    }

#ifdef WR_FEATURE_TEXTURE_RECT
    V_UV_BOUNDS = vec4(0.0, 0.0, vec2(textureSize(sColor0)));
#else
    V_UV_BOUNDS = vec4(min_uv, max_uv) / texture_size.xyxy;
#endif

#ifdef WR_FEATURE_ALPHA_PASS
    V_TILE_REPEAT = repeat.xy;

    float opacity = float(prim_user_data.z) / 65535.0;
    switch (blend_mode) {
        case BLEND_MODE_ALPHA:
            image_data.color.a *= opacity;
            break;
        case BLEND_MODE_PREMUL_ALPHA:
        default:
            image_data.color *= opacity;
            break;
    }

    switch (color_mode) {
        case COLOR_MODE_ALPHA:
        case COLOR_MODE_BITMAP:
            V_MASK_SWIZZLE = vec2(0.0, 1.0);
            V_COLOR = image_data.color;
            break;
        case COLOR_MODE_SUBPX_BG_PASS2:
        case COLOR_MODE_SUBPX_DUAL_SOURCE:
        case COLOR_MODE_IMAGE:
            V_MASK_SWIZZLE = vec2(1.0, 0.0);
            V_COLOR = image_data.color;
            break;
        case COLOR_MODE_SUBPX_CONST_COLOR:
        case COLOR_MODE_SUBPX_BG_PASS0:
        case COLOR_MODE_COLOR_BITMAP:
            V_MASK_SWIZZLE = vec2(1.0, 0.0);
            V_COLOR = vec4(image_data.color.a);
            break;
        case COLOR_MODE_SUBPX_BG_PASS1:
            V_MASK_SWIZZLE = vec2(-1.0, 1.0);
            V_COLOR = vec4(image_data.color.a) * image_data.background_color;
            break;
        default:
            V_MASK_SWIZZLE = vec2(0.0);
            V_COLOR = vec4(1.0);
    }

    V_LOCAL_POS = vi.local_pos;
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER

vec2 compute_repeated_uvs(float perspective_divisor) {
    vec2 uv_size = V_UV_BOUNDS.zw - V_UV_BOUNDS.xy;

#ifdef WR_FEATURE_ALPHA_PASS
    // This prevents the uv on the top and left parts of the primitive that was inflated
    // for anti-aliasing purposes from going beyound the range covered by the regular
    // (non-inflated) primitive.
    vec2 local_uv = max(V_UV * perspective_divisor, vec2(0.0));

    // Handle horizontal and vertical repetitions.
    vec2 repeated_uv = mod(local_uv, uv_size) + V_UV_BOUNDS.xy;

    // This takes care of the bottom and right inflated parts.
    // We do it after the modulo because the latter wraps around the values exactly on
    // the right and bottom edges, which we do not want.
    if (local_uv.x >= V_TILE_REPEAT.x * uv_size.x) {
        repeated_uv.x = V_UV_BOUNDS.z;
    }
    if (local_uv.y >= V_TILE_REPEAT.y * uv_size.y) {
        repeated_uv.y = V_UV_BOUNDS.w;
    }
#else
    vec2 repeated_uv = mod(V_UV * perspective_divisor, uv_size) + V_UV_BOUNDS.xy;
#endif

    return repeated_uv;
}

Fragment image_brush_fs() {
    float perspective_divisor = mix(gl_FragCoord.w, 1.0, V_PERSPECTIVE);

#ifdef WR_FEATURE_REPETITION
    vec2 repeated_uv = compute_repeated_uvs(perspective_divisor);
#else
    vec2 repeated_uv = V_UV * perspective_divisor + V_UV_BOUNDS.xy;
#endif

    // Clamp the uvs to avoid sampling artifacts.
    vec2 uv = clamp(repeated_uv, V_UV_SAMPLE_BOUNDS.xy, V_UV_SAMPLE_BOUNDS.zw);

    vec4 texel = TEX_SAMPLE(sColor0, vec3(uv, V_LAYER));

    Fragment frag;

#ifdef WR_FEATURE_ALPHA_PASS
    #ifdef WR_FEATURE_ANTIALIASING
        float alpha = init_transform_fs(V_LOCAL_POS);
    #else
        float alpha = 1.0;
    #endif
    texel.rgb = texel.rgb * V_MASK_SWIZZLE.x + texel.aaa * V_MASK_SWIZZLE.y;

    vec4 alpha_mask = texel * alpha;
    frag.color = V_COLOR * alpha_mask;

    #ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
        frag.blend = alpha_mask * V_COLOR.a;
    #endif
#else
    frag.color = texel;
#endif

    return frag;
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_LOCAL_POS
#undef V_UV
#undef V_COLOR
#undef V_MASK_SWIZZLE
#undef V_TILE_REPEAT
#undef V_UV_BOUNDS
#undef V_UV_SAMPLE_BOUNDS
#undef V_LAYER
#undef V_PERSPECTIVE
15d6a65fc27061f72a588efc6a552b78811a7c36cebf85d1250418e942c88b85brush_image/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_LINEAR_GRADIENT_BRUSH 2
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_LINEAR_GRADIENT_BRUSH

#define WR_BRUSH_VS_FUNCTION linear_gradient_brush_vs
#define WR_BRUSH_FS_FUNCTION linear_gradient_brush_fs

#include shared,prim_shared,brush

#define V_GRADIENT_ADDRESS  flat_varying_highp_int_address_0

#define V_START_POINT       flat_varying_vec4_0.xy
#define V_SCALE_DIR         flat_varying_vec4_0.zw
// Size of the gradient pattern's rectangle, used to compute horizontal and vertical
// repetitions. Not to be confused with another kind of repetition of the pattern
// which happens along the gradient stops.
#define V_REPEATED_SIZE     flat_varying_vec4_1.xy
// Repetition along the gradient stops.
#define V_GRADIENT_REPEAT   flat_varying_vec4_1.z

#define V_POS               varying_vec4_0.zw

#ifdef WR_FEATURE_ALPHA_PASS
#define V_LOCAL_POS         varying_vec4_0.xy
#define V_TILE_REPEAT       flat_varying_vec4_2.xy
#endif

#ifdef WR_VERTEX_SHADER

struct Gradient {
    vec4 start_end_point;
    int extend_mode;
    vec2 stretch_size;
};

Gradient fetch_gradient(int address) {
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    return Gradient(
        data[0],
        int(data[1].x),
        data[1].yz
    );
}

void linear_gradient_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 texel_rect
) {
    Gradient gradient = fetch_gradient(prim_address);

    if ((brush_flags & BRUSH_FLAG_SEGMENT_RELATIVE) != 0) {
        V_POS = (vi.local_pos - segment_rect.p0) / segment_rect.size;
        V_POS = V_POS * (texel_rect.zw - texel_rect.xy) + texel_rect.xy;
        V_POS = V_POS * local_rect.size;
    } else {
        V_POS = vi.local_pos - local_rect.p0;
    }

    vec2 start_point = gradient.start_end_point.xy;
    vec2 end_point = gradient.start_end_point.zw;
    vec2 dir = end_point - start_point;

    V_START_POINT = start_point;
    V_SCALE_DIR = dir / dot(dir, dir);

    vec2 tile_repeat = local_rect.size / gradient.stretch_size;
    V_REPEATED_SIZE = gradient.stretch_size;

    V_GRADIENT_ADDRESS = prim_user_data.x;

    // Whether to repeat the gradient along the line instead of clamping.
    V_GRADIENT_REPEAT = float(gradient.extend_mode != EXTEND_MODE_CLAMP);

#ifdef WR_FEATURE_ALPHA_PASS
    V_TILE_REPEAT = tile_repeat;
    V_LOCAL_POS = vi.local_pos;
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER
Fragment linear_gradient_brush_fs() {

#ifdef WR_FEATURE_ALPHA_PASS
    // Handle top and left inflated edges (see brush_image).
    vec2 local_pos = max(V_POS, vec2(0.0));

    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(local_pos, V_REPEATED_SIZE);

    vec2 prim_size = V_REPEATED_SIZE * V_TILE_REPEAT;
    // Handle bottom and right inflated edges (see brush_image).
    if (local_pos.x >= prim_size.x) {
        pos.x = V_REPEATED_SIZE.x;
    }
    if (local_pos.y >= prim_size.y) {
        pos.y = V_REPEATED_SIZE.y;
    }
#else
    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(V_POS, V_REPEATED_SIZE);
#endif

    float offset = dot(pos - V_START_POINT, V_SCALE_DIR);

    vec4 color = sample_gradient(V_GRADIENT_ADDRESS,
                                 offset,
                                 V_GRADIENT_REPEAT);

#ifdef WR_FEATURE_ALPHA_PASS
    color *= init_transform_fs(V_LOCAL_POS);
#endif

    return Fragment(color);
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_GRADIENT_ADDRESS
#undef V_START_POINT
#undef V_SCALE_DIR
#undef V_REPEATED_SIZE
#undef V_GRADIENT_REPEAT
#undef V_POS
#undef V_LOCAL_POS
#undef V_TILE_REPEAT
e4327b64f720363b7deee526fbfbb28d8f91cec8b06ce4daed398133a05ee4c8brush_linear_gradient/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_MIX_BLEND_BRUSH 3
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_MIX_BLEND_BRUSH

#define WR_BRUSH_VS_FUNCTION mix_blend_brush_vs
#define WR_BRUSH_FS_FUNCTION mix_blend_brush_fs

#include shared,prim_shared,brush

#define V_SRC_UV            varying_vec4_0.xy
#define V_SRC_LAYER         varying_vec4_0.w

#define V_BACKDROP_UV       varying_vec4_1.xy
#define V_BACKDROP_LAYER    varying_vec4_1.w

#define V_OP                flat_varying_ivec4_0.x

#ifdef WR_VERTEX_SHADER

void mix_blend_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 unused
) {
    //Note: this is unsafe for `vi.world_pos.w <= 0.0`
    vec2 device_pos = vi.world_pos.xy * pic_task.device_pixel_scale / max(0.0, vi.world_pos.w);
    vec2 texture_size = vec2(textureSize(sPrevPassColor, 0));
    V_OP = prim_user_data.x;

    PictureTask src_task = fetch_picture_task(prim_user_data.z);
    vec2 src_device_pos = vi.world_pos.xy * (src_task.device_pixel_scale / max(0.0, vi.world_pos.w));
    vec2 src_uv = src_device_pos +
                  src_task.common_data.task_rect.p0 -
                  src_task.content_origin;
    V_SRC_UV = src_uv / texture_size;
    V_SRC_LAYER = src_task.common_data.texture_layer_index;

    RenderTaskCommonData backdrop_task = fetch_render_task_common_data(prim_user_data.y);
    float src_to_backdrop_scale = pic_task.device_pixel_scale / src_task.device_pixel_scale;
    vec2 backdrop_uv = device_pos +
                       backdrop_task.task_rect.p0 -
                       src_task.content_origin * src_to_backdrop_scale;
    V_BACKDROP_UV = backdrop_uv / texture_size;
    V_BACKDROP_LAYER = backdrop_task.texture_layer_index;
}
#endif

#ifdef WR_FRAGMENT_SHADER
vec3 Multiply(vec3 Cb, vec3 Cs) {
    return Cb * Cs;
}

vec3 Screen(vec3 Cb, vec3 Cs) {
    return Cb + Cs - (Cb * Cs);
}

vec3 HardLight(vec3 Cb, vec3 Cs) {
    vec3 m = Multiply(Cb, 2.0 * Cs);
    vec3 s = Screen(Cb, 2.0 * Cs - 1.0);
    vec3 edge = vec3(0.5, 0.5, 0.5);
    return mix(m, s, step(edge, Cs));
}

// TODO: Worth doing with mix/step? Check GLSL output.
float ColorDodge(float Cb, float Cs) {
    if (Cb == 0.0)
        return 0.0;
    else if (Cs == 1.0)
        return 1.0;
    else
        return min(1.0, Cb / (1.0 - Cs));
}

// TODO: Worth doing with mix/step? Check GLSL output.
float ColorBurn(float Cb, float Cs) {
    if (Cb == 1.0)
        return 1.0;
    else if (Cs == 0.0)
        return 0.0;
    else
        return 1.0 - min(1.0, (1.0 - Cb) / Cs);
}

float SoftLight(float Cb, float Cs) {
    if (Cs <= 0.5) {
        return Cb - (1.0 - 2.0 * Cs) * Cb * (1.0 - Cb);
    } else {
        float D;

        if (Cb <= 0.25)
            D = ((16.0 * Cb - 12.0) * Cb + 4.0) * Cb;
        else
            D = sqrt(Cb);

        return Cb + (2.0 * Cs - 1.0) * (D - Cb);
    }
}

vec3 Difference(vec3 Cb, vec3 Cs) {
    return abs(Cb - Cs);
}

vec3 Exclusion(vec3 Cb, vec3 Cs) {
    return Cb + Cs - 2.0 * Cb * Cs;
}

// These functions below are taken from the spec.
// There's probably a much quicker way to implement
// them in GLSL...
float Sat(vec3 c) {
    return max(c.r, max(c.g, c.b)) - min(c.r, min(c.g, c.b));
}

float Lum(vec3 c) {
    vec3 f = vec3(0.3, 0.59, 0.11);
    return dot(c, f);
}

vec3 ClipColor(vec3 C) {
    float L = Lum(C);
    float n = min(C.r, min(C.g, C.b));
    float x = max(C.r, max(C.g, C.b));

    if (n < 0.0)
        C = L + (((C - L) * L) / (L - n));

    if (x > 1.0)
        C = L + (((C - L) * (1.0 - L)) / (x - L));

    return C;
}

vec3 SetLum(vec3 C, float l) {
    float d = l - Lum(C);
    return ClipColor(C + d);
}

void SetSatInner(inout float Cmin, inout float Cmid, inout float Cmax, float s) {
    if (Cmax > Cmin) {
        Cmid = (((Cmid - Cmin) * s) / (Cmax - Cmin));
        Cmax = s;
    } else {
        Cmid = 0.0;
        Cmax = 0.0;
    }
    Cmin = 0.0;
}

vec3 SetSat(vec3 C, float s) {
    if (C.r <= C.g) {
        if (C.g <= C.b) {
            SetSatInner(C.r, C.g, C.b, s);
        } else {
            if (C.r <= C.b) {
                SetSatInner(C.r, C.b, C.g, s);
            } else {
                SetSatInner(C.b, C.r, C.g, s);
            }
        }
    } else {
        if (C.r <= C.b) {
            SetSatInner(C.g, C.r, C.b, s);
        } else {
            if (C.g <= C.b) {
                SetSatInner(C.g, C.b, C.r, s);
            } else {
                SetSatInner(C.b, C.g, C.r, s);
            }
        }
    }
    return C;
}

vec3 Hue(vec3 Cb, vec3 Cs) {
    return SetLum(SetSat(Cs, Sat(Cb)), Lum(Cb));
}

vec3 Saturation(vec3 Cb, vec3 Cs) {
    return SetLum(SetSat(Cb, Sat(Cs)), Lum(Cb));
}

vec3 Color(vec3 Cb, vec3 Cs) {
    return SetLum(Cs, Lum(Cb));
}

vec3 Luminosity(vec3 Cb, vec3 Cs) {
    return SetLum(Cb, Lum(Cs));
}

const int MixBlendMode_Multiply    = 1;
const int MixBlendMode_Screen      = 2;
const int MixBlendMode_Overlay     = 3;
const int MixBlendMode_Darken      = 4;
const int MixBlendMode_Lighten     = 5;
const int MixBlendMode_ColorDodge  = 6;
const int MixBlendMode_ColorBurn   = 7;
const int MixBlendMode_HardLight   = 8;
const int MixBlendMode_SoftLight   = 9;
const int MixBlendMode_Difference  = 10;
const int MixBlendMode_Exclusion   = 11;
const int MixBlendMode_Hue         = 12;
const int MixBlendMode_Saturation  = 13;
const int MixBlendMode_Color       = 14;
const int MixBlendMode_Luminosity  = 15;

Fragment mix_blend_brush_fs() {
    vec4 Cb = textureLod(sPrevPassColor, vec3(V_BACKDROP_UV, V_BACKDROP_LAYER), 0.0);
    vec4 Cs = textureLod(sPrevPassColor, vec3(V_SRC_UV, V_SRC_LAYER), 0.0);

    // The mix-blend-mode functions assume no premultiplied alpha
    if (Cb.a != 0.0) {
        Cb.rgb /= Cb.a;
    }

    if (Cs.a != 0.0) {
        Cs.rgb /= Cs.a;
    }

    // Return yellow if none of the branches match (shouldn't happen).
    vec4 result = vec4(1.0, 1.0, 0.0, 1.0);

    switch (V_OP) {
        case MixBlendMode_Multiply:
            result.rgb = Multiply(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Screen:
            result.rgb = Screen(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Overlay:
            // Overlay is inverse of Hardlight
            result.rgb = HardLight(Cs.rgb, Cb.rgb);
            break;
        case MixBlendMode_Darken:
            result.rgb = min(Cs.rgb, Cb.rgb);
            break;
        case MixBlendMode_Lighten:
            result.rgb = max(Cs.rgb, Cb.rgb);
            break;
        case MixBlendMode_ColorDodge:
            result.r = ColorDodge(Cb.r, Cs.r);
            result.g = ColorDodge(Cb.g, Cs.g);
            result.b = ColorDodge(Cb.b, Cs.b);
            break;
        case MixBlendMode_ColorBurn:
            result.r = ColorBurn(Cb.r, Cs.r);
            result.g = ColorBurn(Cb.g, Cs.g);
            result.b = ColorBurn(Cb.b, Cs.b);
            break;
        case MixBlendMode_HardLight:
            result.rgb = HardLight(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_SoftLight:
            result.r = SoftLight(Cb.r, Cs.r);
            result.g = SoftLight(Cb.g, Cs.g);
            result.b = SoftLight(Cb.b, Cs.b);
            break;
        case MixBlendMode_Difference:
            result.rgb = Difference(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Exclusion:
            result.rgb = Exclusion(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Hue:
            result.rgb = Hue(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Saturation:
            result.rgb = Saturation(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Color:
            result.rgb = Color(Cb.rgb, Cs.rgb);
            break;
        case MixBlendMode_Luminosity:
            result.rgb = Luminosity(Cb.rgb, Cs.rgb);
            break;
        default: break;
    }

    result.rgb = (1.0 - Cb.a) * Cs.rgb + Cb.a * result.rgb;
    result.a = Cs.a;

    result.rgb *= result.a;

    return Fragment(result);
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_SRC_UV
#undef V_SRC_LAYER
#undef V_BACKDROP_UV
#undef V_BACKDROP_LAYER
#undef V_OP
5087adb0d5d8ad822d166684cfb7766858c8e488c28bbd538baab90c77c73a23brush_mix_blend/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// The multi-brush shader is capable of rendering most types of brushes
// if they are enabled via WR_FEATURE_*_BRUSH defines.
// This type of uber-shader comes at a cost so the goal for this is to
// provide opportunities for aggressive batching when the number of draw
// calls so high that reducing the number of draw calls is worth the
// cost of this "über-shader".


#define WR_FEATURE_MULTI_BRUSH

// These constants must match the BrushShaderKind enum in gpu_types.rs.
#define BRUSH_KIND_SOLID            1
#define BRUSH_KIND_IMAGE            2
#define BRUSH_KIND_TEXT             3
#define BRUSH_KIND_LINEAR_GRADIENT  4
#define BRUSH_KIND_RADIAL_GRADIENT  5
#define BRUSH_KIND_CONIC_GRADIENT   6
#define BRUSH_KIND_BLEND            7
#define BRUSH_KIND_MIX_BLEND        8
#define BRUSH_KIND_YV               9
#define BRUSH_KIND_OPACITY          10

int vecs_per_brush(int brush_kind);

#include shared,prim_shared,brush

#ifdef WR_FEATURE_IMAGE_BRUSH
#include brush_image
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_SOLID_BRUSH
#include brush_solid
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_BLEND_BRUSH
#include brush_blend
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_MIX_BLEND_BRUSH
#include brush_mix_blend
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_LINEAR_GRADIENT_BRUSH
#include brush_linear_gradient
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_RADIAL_GRADIENT_BRUSH
#include brush_radial_gradient
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_CONIC_GRADIENT_BRUSH
#include brush_conic_gradient
#endif

#undef VECS_PER_SPECIFIC_BRUSH
#undef WR_BRUSH_VS_FUNCTION
#undef WR_BRUSH_FS_FUNCTION

#ifdef WR_FEATURE_OPACITY_BRUSH
#include brush_opacity
#endif

int vecs_per_brush(int brush_kind) {
    switch (brush_kind) {
        // The default arm should never be taken, we let it point to whichever shader
        // is enabled first to satisfy ANGLE validation.
        default:

        #ifdef WR_FEATURE_IMAGE_BRUSH
        case BRUSH_KIND_IMAGE: return VECS_PER_IMAGE_BRUSH;
        #endif

        #ifdef WR_FEATURE_IMAGE_BRUSH
        case BRUSH_KIND_SOLID: return VECS_PER_SOLID_BRUSH;
        #endif

        #ifdef WR_FEATURE_BLEND_BRUSH
        case BRUSH_KIND_BLEND: return VECS_PER_BLEND_BRUSH;
        #endif

        #ifdef WR_FEATURE_MIX_BLEND_BRUSH
        case BRUSH_KIND_MIX_BLEND: return VECS_PER_MIX_BLEND_BRUSH;
        #endif

        #ifdef WR_FEATURE_LINEAR_GRADIENT_BRUSH
        case BRUSH_KIND_LINEAR_GRADIENT: return VECS_PER_LINEAR_GRADIENT_BRUSH;
        #endif

        #ifdef WR_FEATURE_RADIAL_GRADIENT_BRUSH
        case BRUSH_KIND_RADIAL_GRADIENT: return VECS_PER_RADIAL_GRADIENT_BRUSH;
        #endif


        #ifdef WR_FEATURE_CONIC_GRADIENT_BRUSH
        case BRUSH_KIND_CONIC_GRADIENT: return VECS_PER_CONIC_GRADIENT_BRUSH;
        #endif

        #ifdef WR_FEATURE_OPACITY_BRUSH
        case BRUSH_KIND_OPACITY: return VECS_PER_OPACITY_BRUSH;
        #endif
    }
}

#define BRUSH_VS_PARAMS vi, prim_address, local_rect, segment_rect, \
    prim_user_data, specific_resource_address, transform, pic_task, \
    brush_flags, texel_rect


#ifdef WR_VERTEX_SHADER
void multi_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 texel_rect,
    int brush_kind
) {
    switch (brush_kind) {
        default:

        #ifdef WR_FEATURE_IMAGE_BRUSH
        case BRUSH_KIND_IMAGE:
            image_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_SOLID_BRUSH
        case BRUSH_KIND_SOLID:
            solid_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_BLEND_BRUSH
        case BRUSH_KIND_BLEND:
            blend_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_MIX_BLEND_BRUSH
        case BRUSH_KIND_MIX_BLEND:
            mix_blend_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_LINEAR_GRADIENT_BRUSH
        case BRUSH_KIND_LINEAR_GRADIENT:
            linear_gradient_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_RADIAL_GRADIENT_BRUSH
        case BRUSH_KIND_RADIAL_GRADIENT:
            radial_gradient_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_CONIC_GRADIENT_BRUSH
        case BRUSH_KIND_CONIC_GRADIENT:
            conic_gradient_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif

        #ifdef WR_FEATURE_OPACITY_BRUSH
        case BRUSH_KIND_OPACITY:
            opacity_brush_vs(BRUSH_VS_PARAMS);
            break;
        #endif
    }
}

#endif // WR_VERTEX_SHADER

#ifdef WR_FRAGMENT_SHADER

Fragment multi_brush_fs(int brush_kind) {
    switch (brush_kind) {
        default:

        #ifdef WR_FEATURE_IMAGE_BRUSH
        case BRUSH_KIND_IMAGE: return image_brush_fs();
        #endif

        #ifdef WR_FEATURE_SOLID_BRUSH
        case BRUSH_KIND_SOLID: return solid_brush_fs();
        #endif

        #ifdef WR_FEATURE_BLEND_BRUSH
        case BRUSH_KIND_BLEND: return blend_brush_fs();
        #endif

        #ifdef WR_FEATURE_MIX_BLEND_BRUSH
        case BRUSH_KIND_MIX_BLEND: return mix_blend_brush_fs();
        #endif

        #ifdef WR_FEATURE_LINEAR_GRADIENT_BRUSH
        case BRUSH_KIND_LINEAR_GRADIENT: return linear_gradient_brush_fs();
        #endif

        #ifdef WR_FEATURE_RADIAL_GRADIENT_BRUSH
        case BRUSH_KIND_RADIAL_GRADIENT: return radial_gradient_brush_fs();
        #endif

        #ifdef WR_FEATURE_CONIC_GRADIENT_BRUSH
        case BRUSH_KIND_CONIC_GRADIENT: return conic_gradient_brush_fs();
        #endif

        #ifdef WR_FEATURE_OPACITY_BRUSH
        case BRUSH_KIND_OPACITY: return opacity_brush_fs();
        #endif
    }
}

#endif
f0faec0b8c4e16bdb92ab2be4d3346e5bb5aaca52837dbc0af7e1a7f8e4da17cbrush_multi/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_OPACITY_BRUSH 3
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_OPACITY_BRUSH

#define WR_BRUSH_VS_FUNCTION opacity_brush_vs
#define WR_BRUSH_FS_FUNCTION opacity_brush_fs

#include shared,prim_shared,brush

// Interpolated UV coordinates to sample.
#define V_UV                varying_vec4_0.zw
#define V_LOCAL_POS         varying_vec4_0.xy

// Normalized bounds of the source image in the texture.
#define V_UV_BOUNDS         flat_varying_vec4_1

// Layer index to sample.
#define V_LAYER             flat_varying_vec4_2.x
// Flag to allow perspective interpolation of UV.
#define V_PERSPECTIVE       flat_varying_vec4_2.y

#define V_OPACITY           flat_varying_vec4_2.z

#ifdef WR_VERTEX_SHADER
void opacity_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 unused
) {
    ImageResource res = fetch_image_resource(prim_user_data.x);
    vec2 uv0 = res.uv_rect.p0;
    vec2 uv1 = res.uv_rect.p1;

    vec2 texture_size = vec2(textureSize(sColor0, 0).xy);
    vec2 f = (vi.local_pos - local_rect.p0) / local_rect.size;
    f = get_image_quad_uv(prim_user_data.x, f);
    vec2 uv = mix(uv0, uv1, f);
    float perspective_interpolate = (brush_flags & BRUSH_FLAG_PERSPECTIVE_INTERPOLATION) != 0 ? 1.0 : 0.0;

    V_UV = uv / texture_size * mix(vi.world_pos.w, 1.0, perspective_interpolate);
    V_LAYER = res.layer;
    V_PERSPECTIVE = perspective_interpolate;

    // TODO: The image shader treats this differently: deflate the rect by half a pixel on each side and
    // clamp the uv in the frame shader. Does it make sense to do the same here?
    V_UV_BOUNDS = vec4(uv0, uv1) / texture_size.xyxy;
    V_LOCAL_POS = vi.local_pos;

    V_OPACITY = float(prim_user_data.y) / 65536.0;
}
#endif

#ifdef WR_FRAGMENT_SHADER
Fragment opacity_brush_fs() {
    float perspective_divisor = mix(gl_FragCoord.w, 1.0, V_PERSPECTIVE);
    vec2 uv = V_UV * perspective_divisor;
    vec4 Cs = texture(sColor0, vec3(uv, V_LAYER));

    // Un-premultiply the input.
    float alpha = Cs.a;
    vec3 color = alpha != 0.0 ? Cs.rgb / alpha : Cs.rgb;

    alpha *= V_OPACITY;

    // Fail-safe to ensure that we don't sample outside the rendered
    // portion of a blend source.
    alpha *= min(point_inside_rect(uv, V_UV_BOUNDS.xy, V_UV_BOUNDS.zw),
                 init_transform_fs(V_LOCAL_POS));

    // Pre-multiply the alpha into the output value.
    return Fragment(alpha * vec4(color, 1.0));
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_UV
#undef V_LOCAL_POS
#undef V_UV_BOUNDS
#undef V_LAYER
#undef V_PERSPECTIVE
#undef V_OPACITY
faf1d9b9b19bcb1b4ec26f34703b4b6c3ace70c2ecad9ae8abed0b4aee03cb9dbrush_opacity/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_RADIAL_GRADIENT_BRUSH 2
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_RADIAL_GRADIENT_BRUSH

#define WR_BRUSH_VS_FUNCTION radial_gradient_brush_vs
#define WR_BRUSH_FS_FUNCTION radial_gradient_brush_fs

#include shared,prim_shared,brush

#define V_GRADIENT_ADDRESS  flat_varying_highp_int_address_0

#define V_CENTER            flat_varying_vec4_0.xy
#define V_START_RADIUS      flat_varying_vec4_0.z
#define V_END_RADIUS        flat_varying_vec4_0.w

#define V_REPEATED_SIZE     flat_varying_vec4_1.xy
#define V_GRADIENT_REPEAT   flat_varying_vec4_1.z

#define V_POS               varying_vec4_0.zw

#ifdef WR_FEATURE_ALPHA_PASS
#define V_LOCAL_POS         varying_vec4_0.xy
#define V_TILE_REPEAT       flat_varying_vec4_2.xy
#endif

#ifdef WR_VERTEX_SHADER

struct RadialGradient {
    vec4 center_start_end_radius;
    float ratio_xy;
    int extend_mode;
    vec2 stretch_size;
};

RadialGradient fetch_radial_gradient(int address) {
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    return RadialGradient(
        data[0],
        data[1].x,
        int(data[1].y),
        data[1].zw
    );
}

void radial_gradient_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 texel_rect
) {
    RadialGradient gradient = fetch_radial_gradient(prim_address);

    if ((brush_flags & BRUSH_FLAG_SEGMENT_RELATIVE) != 0) {
        V_POS = (vi.local_pos - segment_rect.p0) / segment_rect.size;
        V_POS = V_POS * (texel_rect.zw - texel_rect.xy) + texel_rect.xy;
        V_POS = V_POS * local_rect.size;
    } else {
        V_POS = vi.local_pos - local_rect.p0;
    }

    V_CENTER = gradient.center_start_end_radius.xy;
    V_START_RADIUS = gradient.center_start_end_radius.z;
    V_END_RADIUS = gradient.center_start_end_radius.w;

    // Transform all coordinates by the y scale so the
    // fragment shader can work with circles
    vec2 tile_repeat = local_rect.size / gradient.stretch_size;
    V_POS.y *= gradient.ratio_xy;
    V_CENTER.y *= gradient.ratio_xy;
    V_REPEATED_SIZE = gradient.stretch_size;
    V_REPEATED_SIZE.y *=  gradient.ratio_xy;

    V_GRADIENT_ADDRESS = prim_user_data.x;

    // Whether to repeat the gradient instead of clamping.
    V_GRADIENT_REPEAT = float(gradient.extend_mode != EXTEND_MODE_CLAMP);

#ifdef WR_FEATURE_ALPHA_PASS
    V_TILE_REPEAT = tile_repeat.xy;
    V_LOCAL_POS = vi.local_pos;
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER
Fragment radial_gradient_brush_fs() {

#ifdef WR_FEATURE_ALPHA_PASS
    // Handle top and left inflated edges (see brush_image).
    vec2 local_pos = max(V_POS, vec2(0.0));

    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(local_pos, V_REPEATED_SIZE);

    vec2 prim_size = V_REPEATED_SIZE * V_TILE_REPEAT;
    // Handle bottom and right inflated edges (see brush_image).
    if (local_pos.x >= prim_size.x) {
        pos.x = V_REPEATED_SIZE.x;
    }
    if (local_pos.y >= prim_size.y) {
        pos.y = V_REPEATED_SIZE.y;
    }
#else
    // Apply potential horizontal and vertical repetitions.
    vec2 pos = mod(V_POS, V_REPEATED_SIZE);
#endif

    vec2 pd = pos - V_CENTER;
    float rd = V_END_RADIUS - V_START_RADIUS;

    // Solve for t in length(t - pd) = V_START_RADIUS + t * rd
    // using a quadratic equation in form of At^2 - 2Bt + C = 0
    float A = -(rd * rd);
    float B = V_START_RADIUS * rd;
    float C = dot(pd, pd) - V_START_RADIUS * V_START_RADIUS;

    float offset;
    if (A == 0.0) {
        // Since A is 0, just solve for -2Bt + C = 0
        if (B == 0.0) {
            discard;
        }
        float t = 0.5 * C / B;
        if (V_START_RADIUS + rd * t >= 0.0) {
            offset = t;
        } else {
            discard;
        }
    } else {
        float discr = B * B - A * C;
        if (discr < 0.0) {
            discard;
        }
        discr = sqrt(discr);
        float t0 = (B + discr) / A;
        float t1 = (B - discr) / A;
        if (V_START_RADIUS + rd * t0 >= 0.0) {
            offset = t0;
        } else if (V_START_RADIUS + rd * t1 >= 0.0) {
            offset = t1;
        } else {
            discard;
        }
    }

    vec4 color = sample_gradient(V_GRADIENT_ADDRESS,
                                 offset,
                                 V_GRADIENT_REPEAT);

#ifdef WR_FEATURE_ALPHA_PASS
    color *= init_transform_fs(V_LOCAL_POS);
#endif

    return Fragment(color);
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_GRADIENT_ADDRESS
#undef V_CENTER
#undef V_START_RADIUS
#undef V_END_RADIUS
#undef V_REPEATED_SIZE
#undef V_GRADIENT_REPEAT
#undef V_POS
#undef V_LOCAL_POS
#undef V_TILE_REPEAT
cf841348812231b098d090583f6848a8172cac3207b10aa500f9533a5d5b2fcdbrush_radial_gradient/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_SOLID_BRUSH 1
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_SOLID_BRUSH

#define WR_BRUSH_VS_FUNCTION solid_brush_vs
#define WR_BRUSH_FS_FUNCTION solid_brush_fs

#include shared,prim_shared,brush

#define V_COLOR             flat_varying_vec4_0

#ifdef WR_FEATURE_ALPHA_PASS
#define V_LOCAL_POS         varying_vec4_0.xy
#endif

#ifdef WR_VERTEX_SHADER

struct SolidBrush {
    vec4 color;
};

SolidBrush fetch_solid_primitive(int address) {
    vec4 data = fetch_from_gpu_cache_1(address);
    return SolidBrush(data);
}

void solid_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 unused
) {
    SolidBrush prim = fetch_solid_primitive(prim_address);

    float opacity = float(prim_user_data.x) / 65535.0;
    V_COLOR = prim.color * opacity;

#ifdef WR_FEATURE_ALPHA_PASS
    V_LOCAL_POS = vi.local_pos;
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER
Fragment solid_brush_fs() {
    vec4 color = V_COLOR;
#ifdef WR_FEATURE_ALPHA_PASS
    color *= init_transform_fs(V_LOCAL_POS);
#endif
    return Fragment(color);
}
#endif

// Undef macro names that could be re-defined by other shaders.
#undef V_COLOR
#undef V_LOCAL_POS
2db7586a30e1ce212440062a443f8288ce5a2799f08fdc1908c964df4aeda647brush_solid/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#define VECS_PER_YUV_BRUSH 1
#define VECS_PER_SPECIFIC_BRUSH VECS_PER_YUV_BRUSH

#define WR_BRUSH_VS_FUNCTION yuv_brush_vs
#define WR_BRUSH_FS_FUNCTION yuv_brush_fs

#include shared,prim_shared,brush,yuv

#ifdef WR_FEATURE_ALPHA_PASS
varying vec2 vLocalPos;
#endif

varying vec3 vUv_Y;
flat varying vec4 vUvBounds_Y;

varying vec3 vUv_U;
flat varying vec4 vUvBounds_U;

varying vec3 vUv_V;
flat varying vec4 vUvBounds_V;

flat varying float vCoefficient;
flat varying mat3 vYuvColorMatrix;
flat varying int vFormat;

#ifdef WR_VERTEX_SHADER

struct YuvPrimitive {
    float coefficient;
    int color_space;
    int yuv_format;
};

YuvPrimitive fetch_yuv_primitive(int address) {
    vec4 data = fetch_from_gpu_cache_1(address);
    return YuvPrimitive(data.x, int(data.y), int(data.z));
}

void yuv_brush_vs(
    VertexInfo vi,
    int prim_address,
    RectWithSize local_rect,
    RectWithSize segment_rect,
    ivec4 prim_user_data,
    int specific_resource_address,
    mat4 transform,
    PictureTask pic_task,
    int brush_flags,
    vec4 unused
) {
    vec2 f = (vi.local_pos - local_rect.p0) / local_rect.size;

    YuvPrimitive prim = fetch_yuv_primitive(prim_address);
    vCoefficient = prim.coefficient;

    vYuvColorMatrix = get_yuv_color_matrix(prim.color_space);
    vFormat = prim.yuv_format;

#ifdef WR_FEATURE_ALPHA_PASS
    vLocalPos = vi.local_pos;
#endif

    if (vFormat == YUV_FORMAT_PLANAR) {
        ImageResource res_y = fetch_image_resource(prim_user_data.x);
        ImageResource res_u = fetch_image_resource(prim_user_data.y);
        ImageResource res_v = fetch_image_resource(prim_user_data.z);
        write_uv_rect(res_y.uv_rect.p0, res_y.uv_rect.p1, res_y.layer, f, TEX_SIZE(sColor0), vUv_Y, vUvBounds_Y);
        write_uv_rect(res_u.uv_rect.p0, res_u.uv_rect.p1, res_u.layer, f, TEX_SIZE(sColor1), vUv_U, vUvBounds_U);
        write_uv_rect(res_v.uv_rect.p0, res_v.uv_rect.p1, res_v.layer, f, TEX_SIZE(sColor2), vUv_V, vUvBounds_V);
    } else if (vFormat == YUV_FORMAT_NV12) {
        ImageResource res_y = fetch_image_resource(prim_user_data.x);
        ImageResource res_u = fetch_image_resource(prim_user_data.y);
        write_uv_rect(res_y.uv_rect.p0, res_y.uv_rect.p1, res_y.layer, f, TEX_SIZE(sColor0), vUv_Y, vUvBounds_Y);
        write_uv_rect(res_u.uv_rect.p0, res_u.uv_rect.p1, res_u.layer, f, TEX_SIZE(sColor1), vUv_U, vUvBounds_U);
    } else if (vFormat == YUV_FORMAT_INTERLEAVED) {
        ImageResource res_y = fetch_image_resource(prim_user_data.x);
        write_uv_rect(res_y.uv_rect.p0, res_y.uv_rect.p1, res_y.layer, f, TEX_SIZE(sColor0), vUv_Y, vUvBounds_Y);
    }
}
#endif

#ifdef WR_FRAGMENT_SHADER

Fragment yuv_brush_fs() {
    vec4 color = sample_yuv(
        vFormat,
        vYuvColorMatrix,
        vCoefficient,
        vUv_Y,
        vUv_U,
        vUv_V,
        vUvBounds_Y,
        vUvBounds_U,
        vUvBounds_V
    );

#ifdef WR_FEATURE_ALPHA_PASS
    color *= init_transform_fs(vLocalPos);
#endif

    return Fragment(color);
}
#endif
8de30d5e10e3a9268dd6888f4bc3fd9b2e159374cd03398c96a87324f39674debrush_yuv_image/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include rect,render_task,gpu_cache,transform

#ifdef WR_VERTEX_SHADER

in ivec2 aTransformIds;
in ivec4 aClipDataResourceAddress;
in vec2 aClipLocalPos;
in vec4 aClipTileRect;
in vec4 aClipDeviceArea;
in vec4 aClipOrigins;
in float aDevicePixelScale;

struct ClipMaskInstance {
    int clip_transform_id;
    int prim_transform_id;
    ivec2 clip_data_address;
    ivec2 resource_address;
    vec2 local_pos;
    RectWithSize tile_rect;
    RectWithSize sub_rect;
    vec2 task_origin;
    vec2 screen_origin;
    float device_pixel_scale;
};

ClipMaskInstance fetch_clip_item() {
    ClipMaskInstance cmi;

    cmi.clip_transform_id = aTransformIds.x;
    cmi.prim_transform_id = aTransformIds.y;
    cmi.clip_data_address = aClipDataResourceAddress.xy;
    cmi.resource_address = aClipDataResourceAddress.zw;
    cmi.local_pos = aClipLocalPos;
    cmi.tile_rect = RectWithSize(aClipTileRect.xy, aClipTileRect.zw);
    cmi.sub_rect = RectWithSize(aClipDeviceArea.xy, aClipDeviceArea.zw);
    cmi.task_origin = aClipOrigins.xy;
    cmi.screen_origin = aClipOrigins.zw;
    cmi.device_pixel_scale = aDevicePixelScale;

    return cmi;
}

struct ClipVertexInfo {
    vec4 local_pos;
    RectWithSize clipped_local_rect;
};

RectWithSize intersect_rect(RectWithSize a, RectWithSize b) {
    vec4 p = clamp(vec4(a.p0, a.p0 + a.size), b.p0.xyxy, b.p0.xyxy + b.size.xyxy);
    return RectWithSize(p.xy, max(vec2(0.0), p.zw - p.xy));
}


// The transformed vertex function that always covers the whole clip area,
// which is the intersection of all clip instances of a given primitive
ClipVertexInfo write_clip_tile_vertex(RectWithSize local_clip_rect,
                                      Transform prim_transform,
                                      Transform clip_transform,
                                      RectWithSize sub_rect,
                                      vec2 task_origin,
                                      vec2 screen_origin,
                                      float device_pixel_scale) {
    vec2 device_pos = screen_origin + sub_rect.p0 + aPosition.xy * sub_rect.size;
    vec2 world_pos = device_pos / device_pixel_scale;

    vec4 pos = prim_transform.m * vec4(world_pos, 0.0, 1.0);
    pos.xyz /= pos.w;

    vec4 p = get_node_pos(pos.xy, clip_transform);
    vec4 local_pos = p * pos.w;

    //TODO: Interpolate in clip space, where "local_pos.w" contains
    // the W of the homogeneous transform *from* clip space into the world.
    //    float interpolate_w = 1.0 / local_pos.w;
    // This is problematic today, because the W<=0 hemisphere is going to be
    // clipped, while we currently want this shader to fill out the whole rect.
    // We can therefore simplify this when the clip construction is rewritten
    // to only affect the areas touched by a clip.
    vec4 vertex_pos = vec4(
        task_origin + sub_rect.p0 + aPosition.xy * sub_rect.size,
        0.0,
        1.0
    );

    gl_Position = uTransform * vertex_pos;

    init_transform_vs(vec4(local_clip_rect.p0, local_clip_rect.p0 + local_clip_rect.size));

    ClipVertexInfo vi = ClipVertexInfo(local_pos, local_clip_rect);
    return vi;
}

#endif //WR_VERTEX_SHADER
c645761b29f4e0194b2ae2c7c0941371ba38f1e43d2aa3be613444b060e4595fclip_shared/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// Composite a picture cache tile into the framebuffer.

#include shared,yuv

#ifdef WR_FEATURE_YUV
flat varying mat3 vYuvColorMatrix;
flat varying float vYuvCoefficient;
flat varying int vYuvFormat;
varying vec3 vUV_y;
varying vec3 vUV_u;
varying vec3 vUV_v;
flat varying vec4 vUVBounds_y;
flat varying vec4 vUVBounds_u;
flat varying vec4 vUVBounds_v;
#else
flat varying vec4 vColor;
flat varying float vLayer;
varying vec2 vUv;
#endif

#ifdef WR_VERTEX_SHADER
in vec4 aDeviceRect;
in vec4 aDeviceClipRect;
in vec4 aColor;
in vec4 aParams;
in vec3 aTextureLayers;

#ifdef WR_FEATURE_YUV
in vec4 aUvRect0;
in vec4 aUvRect1;
in vec4 aUvRect2;
#endif

void main(void) {
	// Get world position
    vec2 world_pos = aDeviceRect.xy + aPosition.xy * aDeviceRect.zw;

    // Clip the position to the world space clip rect
    vec2 clipped_world_pos = clamp(world_pos, aDeviceClipRect.xy, aDeviceClipRect.xy + aDeviceClipRect.zw);

    // Derive the normalized UV from the clipped vertex position
    vec2 uv = (clipped_world_pos - aDeviceRect.xy) / aDeviceRect.zw;

#ifdef WR_FEATURE_YUV
    int yuv_color_space = int(aParams.y);
    int yuv_format = int(aParams.z);
    float yuv_coefficient = aParams.w;

    vYuvColorMatrix = get_yuv_color_matrix(yuv_color_space);
    vYuvCoefficient = yuv_coefficient;
    vYuvFormat = yuv_format;

    write_uv_rect(
        aUvRect0.xy,
        aUvRect0.zw,
        aTextureLayers.x,
        uv,
        TEX_SIZE(sColor0),
        vUV_y,
        vUVBounds_y
    );
    write_uv_rect(
        aUvRect1.xy,
        aUvRect1.zw,
        aTextureLayers.y,
        uv,
        TEX_SIZE(sColor1),
        vUV_u,
        vUVBounds_u
    );
    write_uv_rect(
        aUvRect2.xy,
        aUvRect2.zw,
        aTextureLayers.z,
        uv,
        TEX_SIZE(sColor2),
        vUV_v,
        vUVBounds_v
    );
#else
    vUv = uv;
    // Pass through color and texture array layer
    vColor = aColor;
    vLayer = aTextureLayers.x;
#endif

    gl_Position = uTransform * vec4(clipped_world_pos, aParams.x /* z_id */, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
#ifdef WR_FEATURE_YUV
    vec4 color = sample_yuv(
        vYuvFormat,
        vYuvColorMatrix,
        vYuvCoefficient,
        vUV_y,
        vUV_u,
        vUV_v,
        vUVBounds_y,
        vUVBounds_u,
        vUVBounds_v
    );
#else
    // The color is just the texture sample modulated by a supplied color
	vec4 texel = textureLod(sColor0, vec3(vUv, vLayer), 0.0);
    vec4 color = vColor * texel;
#endif
	write_output(color);
}
#endif
43ba29cc8946215cd28f56a5922964c21f214c9b925ffb0cc82c83e2302fbaa1composite/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,prim_shared

varying vec3 vUv;
flat varying vec4 vUvRect;
flat varying vec2 vOffsetScale;
flat varying float vSigma;
// The number of pixels on each end that we apply the blur filter over.
flat varying int vSupport;

#ifdef WR_VERTEX_SHADER
// Applies a separable gaussian blur in one direction, as specified
// by the dir field in the blur command.

#define DIR_HORIZONTAL  0
#define DIR_VERTICAL    1

in int aBlurRenderTaskAddress;
in int aBlurSourceTaskAddress;
in int aBlurDirection;

struct BlurTask {
    RenderTaskCommonData common_data;
    float blur_radius;
    vec2 blur_region;
};

BlurTask fetch_blur_task(int address) {
    RenderTaskData task_data = fetch_render_task_data(address);

    BlurTask task = BlurTask(
        task_data.common_data,
        task_data.user_data.x,
        task_data.user_data.yz
    );

    return task;
}

void main(void) {
    BlurTask blur_task = fetch_blur_task(aBlurRenderTaskAddress);
    RenderTaskCommonData src_task = fetch_render_task_common_data(aBlurSourceTaskAddress);

    RectWithSize src_rect = src_task.task_rect;
    RectWithSize target_rect = blur_task.common_data.task_rect;

#if defined WR_FEATURE_COLOR_TARGET
    vec2 texture_size = vec2(textureSize(sPrevPassColor, 0).xy);
#else
    vec2 texture_size = vec2(textureSize(sPrevPassAlpha, 0).xy);
#endif
    vUv.z = src_task.texture_layer_index;
    vSigma = blur_task.blur_radius;

    // Ensure that the support is an even number of pixels to simplify the
    // fragment shader logic.
    //
    // TODO(pcwalton): Actually make use of this fact and use the texture
    // hardware for linear filtering.
    vSupport = int(ceil(1.5 * blur_task.blur_radius)) * 2;

    switch (aBlurDirection) {
        case DIR_HORIZONTAL:
            vOffsetScale = vec2(1.0 / texture_size.x, 0.0);
            break;
        case DIR_VERTICAL:
            vOffsetScale = vec2(0.0, 1.0 / texture_size.y);
            break;
        default:
            vOffsetScale = vec2(0.0);
    }

    vUvRect = vec4(src_rect.p0 + vec2(0.5),
                   src_rect.p0 + blur_task.blur_region - vec2(0.5));
    vUvRect /= texture_size.xyxy;

    vec2 pos = target_rect.p0 + target_rect.size * aPosition.xy;

    vec2 uv0 = src_rect.p0 / texture_size;
    vec2 uv1 = (src_rect.p0 + src_rect.size) / texture_size;
    vUv.xy = mix(uv0, uv1, aPosition.xy);

    gl_Position = uTransform * vec4(pos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER

#if defined WR_FEATURE_COLOR_TARGET
#define SAMPLE_TYPE vec4
#define SAMPLE_TEXTURE(uv)  texture(sPrevPassColor, uv)
#else
#define SAMPLE_TYPE float
#define SAMPLE_TEXTURE(uv)  texture(sPrevPassAlpha, uv).r
#endif

// TODO(gw): Write a fast path blur that handles smaller blur radii
//           with a offset / weight uniform table and a constant
//           loop iteration count!

void main(void) {
    SAMPLE_TYPE original_color = SAMPLE_TEXTURE(vUv);

    // TODO(gw): The gauss function gets NaNs when blur radius
    //           is zero. In the future, detect this earlier
    //           and skip the blur passes completely.
    if (vSupport == 0) {
        oFragColor = vec4(original_color);
        return;
    }

    // Incremental Gaussian Coefficent Calculation (See GPU Gems 3 pp. 877 - 889)
    vec3 gauss_coefficient;
    gauss_coefficient.x = 1.0 / (sqrt(2.0 * 3.14159265) * vSigma);
    gauss_coefficient.y = exp(-0.5 / (vSigma * vSigma));
    gauss_coefficient.z = gauss_coefficient.y * gauss_coefficient.y;

    float gauss_coefficient_total = gauss_coefficient.x;
    SAMPLE_TYPE avg_color = original_color * gauss_coefficient.x;
    gauss_coefficient.xy *= gauss_coefficient.yz;

    // Evaluate two adjacent texels at a time. We can do this because, if c0
    // and c1 are colors of adjacent texels and k0 and k1 are arbitrary
    // factors, this formula:
    //
    //     k0 * c0 + k1 * c1          (Equation 1)
    //
    // is equivalent to:
    //
    //                                 k1
    //     (k0 + k1) * lerp(c0, c1, -------)
    //                              k0 + k1
    //
    // A texture lookup of adjacent texels evaluates this formula:
    //
    //     lerp(c0, c1, t)
    //
    // for some t. So we can let `t = k1/(k0 + k1)` and effectively evaluate
    // Equation 1 with a single texture lookup.

    for (int i = 1; i <= vSupport; i += 2) {
        float gauss_coefficient_subtotal = gauss_coefficient.x;
        gauss_coefficient.xy *= gauss_coefficient.yz;
        gauss_coefficient_subtotal += gauss_coefficient.x;
        float gauss_ratio = gauss_coefficient.x / gauss_coefficient_subtotal;

        vec2 offset = vOffsetScale * (float(i) + gauss_ratio);

        vec2 st0 = clamp(vUv.xy - offset, vUvRect.xy, vUvRect.zw);
        avg_color += SAMPLE_TEXTURE(vec3(st0, vUv.z)) * gauss_coefficient_subtotal;

        vec2 st1 = clamp(vUv.xy + offset, vUvRect.xy, vUvRect.zw);
        avg_color += SAMPLE_TEXTURE(vec3(st1, vUv.z)) * gauss_coefficient_subtotal;

        gauss_coefficient_total += 2.0 * gauss_coefficient_subtotal;
        gauss_coefficient.xy *= gauss_coefficient.yz;
    }

    oFragColor = vec4(avg_color) / gauss_coefficient_total;
}
#endif
60768034704f1803448dee3b36ac11aea8038bc6153fd083c0d35be3bf44b6c2cs_blur/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,ellipse

// For edges, the colors are the same. For corners, these
// are the colors of each edge making up the corner.
flat varying vec4 vColor00;
flat varying vec4 vColor01;
flat varying vec4 vColor10;
flat varying vec4 vColor11;

// A point + tangent defining the line where the edge
// transition occurs. Used for corners only.
flat varying vec4 vColorLine;

// x = segment, y = styles, z = edge axes, w = clip mode
// Since by default in GLES the vertex shader uses highp 
// and the fragment shader uses mediump, we explicitely 
// use mediump precision so we align with the default 
// mediump precision in the fragment shader.
flat varying mediump ivec4 vConfig;

// xy = Local space position of the clip center.
// zw = Scale the rect origin by this to get the outer
// corner from the segment rectangle.
flat varying vec4 vClipCenter_Sign;

// An outer and inner elliptical radii for border
// corner clipping.
flat varying vec4 vClipRadii;

// Reference point for determine edge clip lines.
flat varying vec4 vEdgeReference;

// Stores widths/2 and widths/3 to save doing this in FS.
flat varying vec4 vPartialWidths;

// Clipping parameters for dot or dash.
flat varying vec4 vClipParams1;
flat varying vec4 vClipParams2;

// Local space position
varying vec2 vPos;

#define SEGMENT_TOP_LEFT        0
#define SEGMENT_TOP_RIGHT       1
#define SEGMENT_BOTTOM_RIGHT    2
#define SEGMENT_BOTTOM_LEFT     3
#define SEGMENT_LEFT            4
#define SEGMENT_TOP             5
#define SEGMENT_RIGHT           6
#define SEGMENT_BOTTOM          7

// Border styles as defined in webrender_api/types.rs
#define BORDER_STYLE_NONE         0
#define BORDER_STYLE_SOLID        1
#define BORDER_STYLE_DOUBLE       2
#define BORDER_STYLE_DOTTED       3
#define BORDER_STYLE_DASHED       4
#define BORDER_STYLE_HIDDEN       5
#define BORDER_STYLE_GROOVE       6
#define BORDER_STYLE_RIDGE        7
#define BORDER_STYLE_INSET        8
#define BORDER_STYLE_OUTSET       9

#define CLIP_NONE        0
#define CLIP_DASH_CORNER 1
#define CLIP_DASH_EDGE   2
#define CLIP_DOT         3

#ifdef WR_VERTEX_SHADER

in vec2 aTaskOrigin;
in vec4 aRect;
in vec4 aColor0;
in vec4 aColor1;
in int aFlags;
in vec2 aWidths;
in vec2 aRadii;
in vec4 aClipParams1;
in vec4 aClipParams2;

vec2 get_outer_corner_scale(int segment) {
    vec2 p;

    switch (segment) {
        case SEGMENT_TOP_LEFT:
            p = vec2(0.0, 0.0);
            break;
        case SEGMENT_TOP_RIGHT:
            p = vec2(1.0, 0.0);
            break;
        case SEGMENT_BOTTOM_RIGHT:
            p = vec2(1.0, 1.0);
            break;
        case SEGMENT_BOTTOM_LEFT:
            p = vec2(0.0, 1.0);
            break;
        default:
            // The result is only used for non-default segment cases
            p = vec2(0.0);
            break;
    }

    return p;
}

// NOTE(emilio): If you change this algorithm, do the same change
// in border.rs
vec4 mod_color(vec4 color, bool is_black, bool lighter) {
    const float light_black = 0.7;
    const float dark_black = 0.3;

    const float dark_scale = 0.66666666;
    const float light_scale = 1.0;

    if (is_black) {
        if (lighter) {
            return vec4(vec3(light_black), color.a);
        }
        return vec4(vec3(dark_black), color.a);
    }

    if (lighter) {
        return vec4(color.rgb * light_scale, color.a);
    }
    return vec4(color.rgb * dark_scale, color.a);
}

vec4[2] get_colors_for_side(vec4 color, int style) {
    vec4 result[2];

    bool is_black = color.rgb == vec3(0.0, 0.0, 0.0);

    switch (style) {
        case BORDER_STYLE_GROOVE:
            result[0] = mod_color(color, is_black, true);
            result[1] = mod_color(color, is_black, false);
            break;
        case BORDER_STYLE_RIDGE:
            result[0] = mod_color(color, is_black, false);
            result[1] = mod_color(color, is_black, true);
            break;
        default:
            result[0] = color;
            result[1] = color;
            break;
    }

    return result;
}

void main(void) {
    int segment = aFlags & 0xff;
    int style0 = (aFlags >> 8) & 0xff;
    int style1 = (aFlags >> 16) & 0xff;
    int clip_mode = (aFlags >> 24) & 0x0f;

    vec2 outer_scale = get_outer_corner_scale(segment);
    vec2 outer = outer_scale * aRect.zw;
    vec2 clip_sign = 1.0 - 2.0 * outer_scale;

    // Set some flags used by the FS to determine the
    // orientation of the two edges in this corner.
    ivec2 edge_axis = ivec2(0, 0);
    // Derive the positions for the edge clips, which must be handled
    // differently between corners and edges.
    vec2 edge_reference = vec2(0.0);
    switch (segment) {
        case SEGMENT_TOP_LEFT:
            edge_axis = ivec2(0, 1);
            edge_reference = outer;
            break;
        case SEGMENT_TOP_RIGHT:
            edge_axis = ivec2(1, 0);
            edge_reference = vec2(outer.x - aWidths.x, outer.y);
            break;
        case SEGMENT_BOTTOM_RIGHT:
            edge_axis = ivec2(0, 1);
            edge_reference = outer - aWidths;
            break;
        case SEGMENT_BOTTOM_LEFT:
            edge_axis = ivec2(1, 0);
            edge_reference = vec2(outer.x, outer.y - aWidths.y);
            break;
        case SEGMENT_TOP:
        case SEGMENT_BOTTOM:
            edge_axis = ivec2(1, 1);
            break;
        case SEGMENT_LEFT:
        case SEGMENT_RIGHT:
        default:
            break;
    }

    vConfig = ivec4(
        segment,
        style0 | (style1 << 8),
        edge_axis.x | (edge_axis.y << 8),
        clip_mode
    );
    vPartialWidths = vec4(aWidths / 3.0, aWidths / 2.0);
    vPos = aRect.zw * aPosition.xy;

    vec4[2] color0 = get_colors_for_side(aColor0, style0);
    vColor00 = color0[0];
    vColor01 = color0[1];
    vec4[2] color1 = get_colors_for_side(aColor1, style1);
    vColor10 = color1[0];
    vColor11 = color1[1];
    vClipCenter_Sign = vec4(outer + clip_sign * aRadii, clip_sign);
    vClipRadii = vec4(aRadii, max(aRadii - aWidths, 0.0));
    vColorLine = vec4(outer, aWidths.y * -clip_sign.y, aWidths.x * clip_sign.x);
    vEdgeReference = vec4(edge_reference, edge_reference + aWidths);
    vClipParams1 = aClipParams1;
    vClipParams2 = aClipParams2;

    // For the case of dot and dash clips, optimize the number of pixels that
    // are hit to just include the dot itself.
    if (clip_mode == CLIP_DOT) {
        float radius = aClipParams1.z;

        // Expand by a small amount to allow room for AA around
        // the dot if it's big enough.
        if (radius > 0.5)
            radius += 2.0;

        vPos = vClipParams1.xy + radius * (2.0 * aPosition.xy - 1.0);
        vPos = clamp(vPos, vec2(0.0), aRect.zw);
    } else if (clip_mode == CLIP_DASH_CORNER) {
        vec2 center = (aClipParams1.xy + aClipParams2.xy) * 0.5;
        // This is a gross approximation which works out because dashes don't have
        // a strong curvature and we will overshoot by inflating the geometry by
        // this amount on each side (sqrt(2) * length(dash) would be enough and we
        // compute 2 * approx_length(dash)).
        float dash_length = length(aClipParams1.xy - aClipParams2.xy);
        float width = max(aWidths.x, aWidths.y);
        // expand by a small amout for AA just like we do for dots.
        vec2 r = vec2(max(dash_length, width)) + 2.0;
        vPos = clamp(vPos, center - r, center + r);
    }

    gl_Position = uTransform * vec4(aTaskOrigin + aRect.xy + vPos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
vec4 evaluate_color_for_style_in_corner(
    vec2 clip_relative_pos,
    int style,
    vec4 color0,
    vec4 color1,
    vec4 clip_radii,
    float mix_factor,
    int segment,
    float aa_range
) {
    switch (style) {
        case BORDER_STYLE_DOUBLE: {
            // Get the distances from 0.33 of the radii, and
            // also 0.67 of the radii. Use these to form a
            // SDF subtraction which will clip out the inside
            // third of the rounded edge.
            float d_radii_a = distance_to_ellipse(
                clip_relative_pos,
                clip_radii.xy - vPartialWidths.xy,
                aa_range
            );
            float d_radii_b = distance_to_ellipse(
                clip_relative_pos,
                clip_radii.xy - 2.0 * vPartialWidths.xy,
                aa_range
            );
            float d = min(-d_radii_a, d_radii_b);
            color0 *= distance_aa(aa_range, d);
            break;
        }
        case BORDER_STYLE_GROOVE:
        case BORDER_STYLE_RIDGE: {
            float d = distance_to_ellipse(
                clip_relative_pos,
                clip_radii.xy - vPartialWidths.zw,
                aa_range
            );
            float alpha = distance_aa(aa_range, d);
            float swizzled_factor;
            switch (segment) {
                case SEGMENT_TOP_LEFT: swizzled_factor = 0.0; break;
                case SEGMENT_TOP_RIGHT: swizzled_factor = mix_factor; break;
                case SEGMENT_BOTTOM_RIGHT: swizzled_factor = 1.0; break;
                case SEGMENT_BOTTOM_LEFT: swizzled_factor = 1.0 - mix_factor; break;
                default: swizzled_factor = 0.0; break;
            };
            vec4 c0 = mix(color1, color0, swizzled_factor);
            vec4 c1 = mix(color0, color1, swizzled_factor);
            color0 = mix(c0, c1, alpha);
            break;
        }
        default:
            break;
    }

    return color0;
}

vec4 evaluate_color_for_style_in_edge(
    vec2 pos_vec,
    int style,
    vec4 color0,
    vec4 color1,
    float aa_range,
    int edge_axis_id
) {
    vec2 edge_axis = edge_axis_id != 0 ? vec2(0.0, 1.0) : vec2(1.0, 0.0);
    float pos = dot(pos_vec, edge_axis);
    switch (style) {
        case BORDER_STYLE_DOUBLE: {
            float d = -1.0;
            float partial_width = dot(vPartialWidths.xy, edge_axis);
            if (partial_width >= 1.0) {
                vec2 ref = vec2(
                    dot(vEdgeReference.xy, edge_axis) + partial_width,
                    dot(vEdgeReference.zw, edge_axis) - partial_width
                );
                d = min(pos - ref.x, ref.y - pos);
            }
            color0 *= distance_aa(aa_range, d);
            break;
        }
        case BORDER_STYLE_GROOVE:
        case BORDER_STYLE_RIDGE: {
            float ref = dot(vEdgeReference.xy + vPartialWidths.zw, edge_axis);
            float d = pos - ref;
            float alpha = distance_aa(aa_range, d);
            color0 = mix(color0, color1, alpha);
            break;
        }
        default:
            break;
    }

    return color0;
}

void main(void) {
    float aa_range = compute_aa_range(vPos);
    vec4 color0, color1;

    int segment = vConfig.x;
    ivec2 style = ivec2(vConfig.y & 0xff, vConfig.y >> 8);
    ivec2 edge_axis = ivec2(vConfig.z & 0xff, vConfig.z >> 8);
    int clip_mode = vConfig.w;

    float mix_factor = 0.0;
    if (edge_axis.x != edge_axis.y) {
        float d_line = distance_to_line(vColorLine.xy, vColorLine.zw, vPos);
        mix_factor = distance_aa(aa_range, -d_line);
    }

    // Check if inside corner clip-region
    vec2 clip_relative_pos = vPos - vClipCenter_Sign.xy;
    bool in_clip_region = all(lessThan(vClipCenter_Sign.zw * clip_relative_pos, vec2(0.0)));
    float d = -1.0;

    switch (clip_mode) {
        case CLIP_DOT: {
            // Set clip distance based or dot position and radius.
            d = distance(vClipParams1.xy, vPos) - vClipParams1.z;
            break;
        }
        case CLIP_DASH_EDGE: {
            bool is_vertical = vClipParams1.x == 0.;
            float half_dash = is_vertical ? vClipParams1.y : vClipParams1.x;
            // We want to draw something like:
            // +---+---+---+---+
            // |xxx|   |   |xxx|
            // +---+---+---+---+
            float pos = is_vertical ? vPos.y : vPos.x;
            bool in_dash = pos < half_dash || pos > 3.0 * half_dash;
            if (!in_dash) {
                d = 1.;
            }
            break;
        }
        case CLIP_DASH_CORNER: {
            // Get SDF for the two line/tangent clip lines,
            // do SDF subtract to get clip distance.
            float d0 = distance_to_line(vClipParams1.xy,
                                        vClipParams1.zw,
                                        vPos);
            float d1 = distance_to_line(vClipParams2.xy,
                                        vClipParams2.zw,
                                        vPos);
            d = max(d0, -d1);
            break;
        }
        case CLIP_NONE:
        default:
            break;
    }

    if (in_clip_region) {
        float d_radii_a = distance_to_ellipse(clip_relative_pos, vClipRadii.xy, aa_range);
        float d_radii_b = distance_to_ellipse(clip_relative_pos, vClipRadii.zw, aa_range);
        float d_radii = max(d_radii_a, -d_radii_b);
        d = max(d, d_radii);

        color0 = evaluate_color_for_style_in_corner(
            clip_relative_pos,
            style.x,
            vColor00,
            vColor01,
            vClipRadii,
            mix_factor,
            segment,
            aa_range
        );
        color1 = evaluate_color_for_style_in_corner(
            clip_relative_pos,
            style.y,
            vColor10,
            vColor11,
            vClipRadii,
            mix_factor,
            segment,
            aa_range
        );
    } else {
        color0 = evaluate_color_for_style_in_edge(
            vPos,
            style.x,
            vColor00,
            vColor01,
            aa_range,
            edge_axis.x
        );
        color1 = evaluate_color_for_style_in_edge(
            vPos,
            style.y,
            vColor10,
            vColor11,
            aa_range,
            edge_axis.y
        );
    }

    float alpha = distance_aa(aa_range, d);
    vec4 color = mix(color0, color1, mix_factor);
    oFragColor = color * alpha;
}
#endif
ae236854fc23429a6ea0edac980ac424eb743f551ea034fef6d390ee613d4954cs_border_segment/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,ellipse

#define DONT_MIX 0
#define MIX_AA 1
#define MIX_NO_AA 2

// For edges, the colors are the same. For corners, these
// are the colors of each edge making up the corner.
flat varying vec4 vColor0;
flat varying vec4 vColor1;

// A point + tangent defining the line where the edge
// transition occurs. Used for corners only.
flat varying vec4 vColorLine;

// A boolean indicating that we should be mixing between edge colors.
flat varying int vMixColors;

// xy = Local space position of the clip center.
// zw = Scale the rect origin by this to get the outer
// corner from the segment rectangle.
flat varying vec4 vClipCenter_Sign;

// An outer and inner elliptical radii for border
// corner clipping.
flat varying vec4 vClipRadii;

// Position, scale, and radii of horizontally and vertically adjacent corner clips.
flat varying vec4 vHorizontalClipCenter_Sign;
flat varying vec2 vHorizontalClipRadii;
flat varying vec4 vVerticalClipCenter_Sign;
flat varying vec2 vVerticalClipRadii;

// Local space position
varying vec2 vPos;

#define SEGMENT_TOP_LEFT        0
#define SEGMENT_TOP_RIGHT       1
#define SEGMENT_BOTTOM_RIGHT    2
#define SEGMENT_BOTTOM_LEFT     3

#ifdef WR_VERTEX_SHADER

in vec2 aTaskOrigin;
in vec4 aRect;
in vec4 aColor0;
in vec4 aColor1;
in int aFlags;
in vec2 aWidths;
in vec2 aRadii;
in vec4 aClipParams1;
in vec4 aClipParams2;

vec2 get_outer_corner_scale(int segment) {
    vec2 p;

    switch (segment) {
        case SEGMENT_TOP_LEFT:
            p = vec2(0.0, 0.0);
            break;
        case SEGMENT_TOP_RIGHT:
            p = vec2(1.0, 0.0);
            break;
        case SEGMENT_BOTTOM_RIGHT:
            p = vec2(1.0, 1.0);
            break;
        case SEGMENT_BOTTOM_LEFT:
            p = vec2(0.0, 1.0);
            break;
        default:
            // The result is only used for non-default segment cases
            p = vec2(0.0);
            break;
    }

    return p;
}

void main(void) {
    int segment = aFlags & 0xff;
    bool do_aa = ((aFlags >> 24) & 0xf0) != 0;

    vec2 outer_scale = get_outer_corner_scale(segment);
    vec2 outer = outer_scale * aRect.zw;
    vec2 clip_sign = 1.0 - 2.0 * outer_scale;

    int mix_colors;
    switch (segment) {
        case SEGMENT_TOP_LEFT:
        case SEGMENT_TOP_RIGHT:
        case SEGMENT_BOTTOM_RIGHT:
        case SEGMENT_BOTTOM_LEFT: {
            mix_colors = do_aa ? MIX_AA : MIX_NO_AA;
            break;
        }
        default:
            mix_colors = DONT_MIX;
            break;
    }

    vMixColors = mix_colors;
    vPos = aRect.zw * aPosition.xy;

    vColor0 = aColor0;
    vColor1 = aColor1;
    vClipCenter_Sign = vec4(outer + clip_sign * aRadii, clip_sign);
    vClipRadii = vec4(aRadii, max(aRadii - aWidths, 0.0));
    vColorLine = vec4(outer, aWidths.y * -clip_sign.y, aWidths.x * clip_sign.x);

    vec2 horizontal_clip_sign = vec2(-clip_sign.x, clip_sign.y);
    vHorizontalClipCenter_Sign = vec4(aClipParams1.xy +
                                      horizontal_clip_sign * aClipParams1.zw,
                                      horizontal_clip_sign);
    vHorizontalClipRadii = aClipParams1.zw;

    vec2 vertical_clip_sign = vec2(clip_sign.x, -clip_sign.y);
    vVerticalClipCenter_Sign = vec4(aClipParams2.xy +
                                    vertical_clip_sign * aClipParams2.zw,
                                    vertical_clip_sign);
    vVerticalClipRadii = aClipParams2.zw;

    gl_Position = uTransform * vec4(aTaskOrigin + aRect.xy + vPos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    float aa_range = compute_aa_range(vPos);
    bool do_aa = vMixColors != MIX_NO_AA;

    float mix_factor = 0.0;
    if (vMixColors != DONT_MIX) {
        float d_line = distance_to_line(vColorLine.xy, vColorLine.zw, vPos);
        if (do_aa) {
            mix_factor = distance_aa(aa_range, -d_line);
        } else {
            mix_factor = d_line + EPSILON >= 0. ? 1.0 : 0.0;
        }
    }

    // Check if inside main corner clip-region
    vec2 clip_relative_pos = vPos - vClipCenter_Sign.xy;
    bool in_clip_region = all(lessThan(vClipCenter_Sign.zw * clip_relative_pos, vec2(0.0)));

    float d = -1.0;
    if (in_clip_region) {
        float d_radii_a = distance_to_ellipse(clip_relative_pos, vClipRadii.xy, aa_range);
        float d_radii_b = distance_to_ellipse(clip_relative_pos, vClipRadii.zw, aa_range);
        d = max(d_radii_a, -d_radii_b);
    }

    // And again for horizontally-adjacent corner
    clip_relative_pos = vPos - vHorizontalClipCenter_Sign.xy;
    in_clip_region = all(lessThan(vHorizontalClipCenter_Sign.zw * clip_relative_pos, vec2(0.0)));
    if (in_clip_region) {
        float d_radii = distance_to_ellipse(clip_relative_pos, vHorizontalClipRadii.xy, aa_range);
        d = max(d_radii, d);
    }

    // And finally for vertically-adjacent corner
    clip_relative_pos = vPos - vVerticalClipCenter_Sign.xy;
    in_clip_region = all(lessThan(vVerticalClipCenter_Sign.zw * clip_relative_pos, vec2(0.0)));
    if (in_clip_region) {
        float d_radii = distance_to_ellipse(clip_relative_pos, vVerticalClipRadii.xy, aa_range);
        d = max(d_radii, d);
    }

    float alpha = do_aa ? distance_aa(aa_range, d) : 1.0;
    vec4 color = mix(vColor0, vColor1, mix_factor);
    oFragColor = color * alpha;
}
#endif
11fe2a56d925b26aab671db7cbd57a46507b79c0f58d3755a537800aeeb81cbfcs_border_solid/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,clip_shared

varying vec4 vLocalPos;
varying vec2 vUv;
flat varying vec4 vUvBounds;
flat varying float vLayer;
flat varying vec4 vEdge;
flat varying vec4 vUvBounds_NoClamp;
flat varying float vClipMode;

#define MODE_STRETCH        0
#define MODE_SIMPLE         1

#ifdef WR_VERTEX_SHADER

struct BoxShadowData {
    vec2 src_rect_size;
    float clip_mode;
    int stretch_mode_x;
    int stretch_mode_y;
    RectWithSize dest_rect;
};

BoxShadowData fetch_data(ivec2 address) {
    vec4 data[3] = fetch_from_gpu_cache_3_direct(address);
    RectWithSize dest_rect = RectWithSize(data[2].xy, data[2].zw);
    BoxShadowData bs_data = BoxShadowData(
        data[0].xy,
        data[0].z,
        int(data[1].x),
        int(data[1].y),
        dest_rect
    );
    return bs_data;
}

void main(void) {
    ClipMaskInstance cmi = fetch_clip_item();
    Transform clip_transform = fetch_transform(cmi.clip_transform_id);
    Transform prim_transform = fetch_transform(cmi.prim_transform_id);
    BoxShadowData bs_data = fetch_data(cmi.clip_data_address);
    ImageResource res = fetch_image_resource_direct(cmi.resource_address);

    RectWithSize dest_rect = bs_data.dest_rect;

    ClipVertexInfo vi = write_clip_tile_vertex(
        dest_rect,
        prim_transform,
        clip_transform,
        cmi.sub_rect,
        cmi.task_origin,
        cmi.screen_origin,
        cmi.device_pixel_scale
    );
    vLayer = res.layer;
    vClipMode = bs_data.clip_mode;

    vec2 texture_size = vec2(textureSize(sColor0, 0));
    vec2 local_pos = vi.local_pos.xy / vi.local_pos.w;
    vLocalPos = vi.local_pos;

    switch (bs_data.stretch_mode_x) {
        case MODE_STRETCH: {
            vEdge.x = 0.5;
            vEdge.z = (dest_rect.size.x / bs_data.src_rect_size.x) - 0.5;
            vUv.x = (local_pos.x - dest_rect.p0.x) / bs_data.src_rect_size.x;
            break;
        }
        case MODE_SIMPLE:
        default: {
            vEdge.xz = vec2(1.0);
            vUv.x = (local_pos.x - dest_rect.p0.x) / dest_rect.size.x;
            break;
        }
    }

    switch (bs_data.stretch_mode_y) {
        case MODE_STRETCH: {
            vEdge.y = 0.5;
            vEdge.w = (dest_rect.size.y / bs_data.src_rect_size.y) - 0.5;
            vUv.y = (local_pos.y - dest_rect.p0.y) / bs_data.src_rect_size.y;
            break;
        }
        case MODE_SIMPLE:
        default: {
            vEdge.yw = vec2(1.0);
            vUv.y = (local_pos.y - dest_rect.p0.y) / dest_rect.size.y;
            break;
        }
    }

    vUv *= vi.local_pos.w;
    vec2 uv0 = res.uv_rect.p0;
    vec2 uv1 = res.uv_rect.p1;
    vUvBounds = vec4(uv0 + vec2(0.5), uv1 - vec2(0.5)) / texture_size.xyxy;
    vUvBounds_NoClamp = vec4(uv0, uv1) / texture_size.xyxy;
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    vec2 uv_linear = vUv / vLocalPos.w;
    vec2 uv = clamp(uv_linear, vec2(0.0), vEdge.xy);
    uv += max(vec2(0.0), uv_linear - vEdge.zw);
    uv = mix(vUvBounds_NoClamp.xy, vUvBounds_NoClamp.zw, uv);
    uv = clamp(uv, vUvBounds.xy, vUvBounds.zw);

    float in_shadow_rect = init_transform_rough_fs(vLocalPos.xy / vLocalPos.w);

    float texel = TEX_SAMPLE(sColor0, vec3(uv, vLayer)).r;

    float alpha = mix(texel, 1.0 - texel, vClipMode);
    float result = vLocalPos.w > 0.0 ? mix(vClipMode, alpha, in_shadow_rect) : 0.0;

    oFragColor = vec4(result);
}
#endif
fa69bfa7d8d867d2e245e67cf96b3d234c3e4a198ecbc9a24af65457b7d22cfbcs_clip_box_shadow/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,clip_shared

varying vec4 vLocalPos;
varying vec2 vClipMaskImageUv;

flat varying vec4 vClipMaskUvRect;
flat varying vec4 vClipMaskUvInnerRect;
flat varying float vLayer;

#ifdef WR_VERTEX_SHADER
struct ImageMaskData {
    vec2 local_mask_size;
};

ImageMaskData fetch_mask_data(ivec2 address) {
    vec4 data = fetch_from_gpu_cache_1_direct(address);
    ImageMaskData mask_data = ImageMaskData(data.xy);
    return mask_data;
}

void main(void) {
    ClipMaskInstance cmi = fetch_clip_item();
    Transform clip_transform = fetch_transform(cmi.clip_transform_id);
    Transform prim_transform = fetch_transform(cmi.prim_transform_id);
    ImageMaskData mask = fetch_mask_data(cmi.clip_data_address);
    RectWithSize local_rect = RectWithSize(cmi.local_pos, mask.local_mask_size);
    ImageResource res = fetch_image_resource_direct(cmi.resource_address);

    ClipVertexInfo vi = write_clip_tile_vertex(
        local_rect,
        prim_transform,
        clip_transform,
        cmi.sub_rect,
        cmi.task_origin,
        cmi.screen_origin,
        cmi.device_pixel_scale
    );
    vLocalPos = vi.local_pos;
    vLayer = res.layer;
    vClipMaskImageUv = (vi.local_pos.xy - cmi.tile_rect.p0 * vi.local_pos.w) / cmi.tile_rect.size;

    vec2 texture_size = vec2(textureSize(sColor0, 0));
    vClipMaskUvRect = vec4(res.uv_rect.p0, res.uv_rect.p1 - res.uv_rect.p0) / texture_size.xyxy;
    // applying a half-texel offset to the UV boundaries to prevent linear samples from the outside
    vec4 inner_rect = vec4(res.uv_rect.p0, res.uv_rect.p1);
    vClipMaskUvInnerRect = (inner_rect + vec4(0.5, 0.5, -0.5, -0.5)) / texture_size.xyxy;
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    vec2 local_pos = vLocalPos.xy / vLocalPos.w;
    float alpha = vLocalPos.w > 0.0 ? init_transform_fs(local_pos) : 0.0;

    // TODO: Handle repeating masks?
    vec2 clamped_mask_uv = clamp(vClipMaskImageUv, vec2(0.0, 0.0), vLocalPos.ww);

    // Ensure we don't draw outside of our tile.
    // FIXME(emilio): Can we do this earlier?
    if (clamped_mask_uv != vClipMaskImageUv)
        discard;

    vec2 source_uv = clamp(
        clamped_mask_uv / vLocalPos.w * vClipMaskUvRect.zw + vClipMaskUvRect.xy,
        vClipMaskUvInnerRect.xy, vClipMaskUvInnerRect.zw);
    float clip_alpha = texture(sColor0, vec3(source_uv, vLayer)).r; //careful: texture has type A8
    oFragColor = vec4(alpha * clip_alpha, 1.0, 1.0, 1.0);
}
#endif
7630c1d532359a4abe2ae8c808190499bea1811990e9848357596db415f40e97cs_clip_image/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,clip_shared,ellipse

varying vec4 vLocalPos;
#ifdef WR_FEATURE_FAST_PATH
flat varying vec3 vClipParams;      // xy = box size, z = radius
#else
flat varying vec4 vClipCenter_Radius_TL;
flat varying vec4 vClipCenter_Radius_TR;
flat varying vec4 vClipCenter_Radius_BL;
flat varying vec4 vClipCenter_Radius_BR;
#endif

flat varying float vClipMode;

#ifdef WR_VERTEX_SHADER
struct ClipRect {
    RectWithSize rect;
    vec4 mode;
};

ClipRect fetch_clip_rect(ivec2 address) {
    vec4 data[2] = fetch_from_gpu_cache_2_direct(address);
    ClipRect rect = ClipRect(RectWithSize(data[0].xy, data[0].zw), data[1]);
    return rect;
}

struct ClipCorner {
    RectWithSize rect;
    vec4 outer_inner_radius;
};

// index is of type float instead of int because using an int led to shader
// miscompilations with a macOS 10.12 Intel driver.
ClipCorner fetch_clip_corner(ivec2 address, float index) {
    address += ivec2(2 + 2 * int(index), 0);
    vec4 data[2] = fetch_from_gpu_cache_2_direct(address);
    ClipCorner corner = ClipCorner(RectWithSize(data[0].xy, data[0].zw), data[1]);
    return corner;
}

struct ClipData {
    ClipRect rect;
    ClipCorner top_left;
    ClipCorner top_right;
    ClipCorner bottom_left;
    ClipCorner bottom_right;
};

ClipData fetch_clip(ivec2 address) {
    ClipData clip;

    clip.rect = fetch_clip_rect(address);
    clip.top_left = fetch_clip_corner(address, 0.0);
    clip.top_right = fetch_clip_corner(address, 1.0);
    clip.bottom_left = fetch_clip_corner(address, 2.0);
    clip.bottom_right = fetch_clip_corner(address, 3.0);

    return clip;
}

void main(void) {
    ClipMaskInstance cmi = fetch_clip_item();
    Transform clip_transform = fetch_transform(cmi.clip_transform_id);
    Transform prim_transform = fetch_transform(cmi.prim_transform_id);
    ClipData clip = fetch_clip(cmi.clip_data_address);

    RectWithSize local_rect = clip.rect.rect;
    local_rect.p0 = cmi.local_pos;

    ClipVertexInfo vi = write_clip_tile_vertex(
        local_rect,
        prim_transform,
        clip_transform,
        cmi.sub_rect,
        cmi.task_origin,
        cmi.screen_origin,
        cmi.device_pixel_scale
    );

    vClipMode = clip.rect.mode.x;
    vLocalPos = vi.local_pos;

#ifdef WR_FEATURE_FAST_PATH
    // If the radii are all uniform, we can use a much simpler 2d
    // signed distance function to get a rounded rect clip.
    vec2 half_size = 0.5 * local_rect.size;
    float radius = clip.top_left.outer_inner_radius.x;
    vLocalPos.xy -= (half_size + cmi.local_pos) * vi.local_pos.w;
    vClipParams = vec3(half_size - vec2(radius), radius);
#else
    RectWithEndpoint clip_rect = to_rect_with_endpoint(local_rect);

    vec2 r_tl = clip.top_left.outer_inner_radius.xy;
    vec2 r_tr = clip.top_right.outer_inner_radius.xy;
    vec2 r_br = clip.bottom_right.outer_inner_radius.xy;
    vec2 r_bl = clip.bottom_left.outer_inner_radius.xy;

    vClipCenter_Radius_TL = vec4(clip_rect.p0 + r_tl, r_tl);

    vClipCenter_Radius_TR = vec4(clip_rect.p1.x - r_tr.x,
                                 clip_rect.p0.y + r_tr.y,
                                 r_tr);

    vClipCenter_Radius_BR = vec4(clip_rect.p1 - r_br, r_br);

    vClipCenter_Radius_BL = vec4(clip_rect.p0.x + r_bl.x,
                                 clip_rect.p1.y - r_bl.y,
                                 r_bl);
#endif
}
#endif

#ifdef WR_FRAGMENT_SHADER

#ifdef WR_FEATURE_FAST_PATH
// See http://www.iquilezles.org/www/articles/distfunctions2d/distfunctions2d.htm
float sd_box(in vec2 pos, in vec2 box_size) {
    vec2 d = abs(pos) - box_size;
    return length(max(d, vec2(0.0))) + min(max(d.x,d.y), 0.0);
}

float sd_rounded_box(in vec2 pos, in vec2 box_size, in float radius) {
    return sd_box(pos, box_size) - radius;
}
#endif

void main(void) {
    vec2 local_pos = vLocalPos.xy / vLocalPos.w;
    float aa_range = compute_aa_range(local_pos);

#ifdef WR_FEATURE_FAST_PATH
    float d = sd_rounded_box(local_pos, vClipParams.xy, vClipParams.z);
    float f = distance_aa(aa_range, d);
    float final_alpha = mix(f, 1.0 - f, vClipMode);
#else
    float alpha = init_transform_fs(local_pos);

    float clip_alpha = rounded_rect(local_pos,
                                    vClipCenter_Radius_TL,
                                    vClipCenter_Radius_TR,
                                    vClipCenter_Radius_BR,
                                    vClipCenter_Radius_BL,
                                    aa_range);

    float combined_alpha = alpha * clip_alpha;

    // Select alpha or inverse alpha depending on clip in/out.
    float final_alpha = mix(combined_alpha, 1.0 - combined_alpha, vClipMode);
#endif

    float final_final_alpha = vLocalPos.w > 0.0 ? final_alpha : 0.0;
    oFragColor = vec4(final_final_alpha, 0.0, 0.0, 1.0);
}
#endif
e2ab19bfccaca46ccd37f159853b61011380d93e0d94bdaa790ca87734ac1707cs_clip_rectangle/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared

varying float vPos;
flat varying vec4 vStops;
flat varying vec4 vColor0;
flat varying vec4 vColor1;
flat varying vec4 vColor2;
flat varying vec4 vColor3;

#ifdef WR_VERTEX_SHADER

in vec4 aTaskRect;
in float aAxisSelect;
in vec4 aStops;
in vec4 aColor0;
in vec4 aColor1;
in vec4 aColor2;
in vec4 aColor3;
in vec2 aStartStop;

void main(void) {
    vPos = mix(aStartStop.x, aStartStop.y, mix(aPosition.x, aPosition.y, aAxisSelect));

    vStops = aStops;
    vColor0 = aColor0;
    vColor1 = aColor1;
    vColor2 = aColor2;
    vColor3 = aColor3;

    gl_Position = uTransform * vec4(aTaskRect.xy + aTaskRect.zw * aPosition.xy, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
float linear_step(float edge0, float edge1, float x) {
    if (edge0 >= edge1) {
        return 0.0;
    }

    return clamp((x - edge0) / (edge1 - edge0), 0.0, 1.0);
}

void main(void) {
    vec4 color = vColor0;

    color = mix(color, vColor1, linear_step(vStops.x, vStops.y, vPos));
    color = mix(color, vColor2, linear_step(vStops.y, vStops.z, vPos));
    color = mix(color, vColor3, linear_step(vStops.z, vStops.w, vPos));

    oFragColor = color;
}
#endif
71adc4a734161ab6748c6e3a8d59e2a22ccd0e2879efdf379d9459e210b24ba0cs_gradient/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared

#define LINE_STYLE_SOLID        0
#define LINE_STYLE_DOTTED       1
#define LINE_STYLE_DASHED       2
#define LINE_STYLE_WAVY         3

// Fragment position in the coordinate system used for positioning decorations.
// To keep the code independent of whether the line is horizontal or vertical,
// vLocalPos.x is always parallel, and .y always perpendicular, to the line
// being decorated.
varying vec2 vLocalPos;

flat varying int vStyle;
flat varying vec4 vParams;

#ifdef WR_VERTEX_SHADER

// The size of the mask tile we're rendering, in pixels.
in vec4 aTaskRect;

// The size of the mask tile. aLocalSize.x is always horizontal and .y vertical,
// regardless of the line's orientation. The size is chosen by
// prim_store::get_line_decoration_sizes.
in vec2 aLocalSize;

// A LINE_STYLE_* value, indicating what sort of line to draw.
in int aStyle;

// 0.0 for a horizontal line, 1.0 for a vertical line.
in float aAxisSelect;

// The thickness of the wavy line itself, not the amplitude of the waves (i.e.,
// the thickness of the final decorated line).
in float aWavyLineThickness;

void main(void) {
    vec2 size = mix(aLocalSize, aLocalSize.yx, aAxisSelect);
    vStyle = aStyle;

    switch (vStyle) {
        case LINE_STYLE_SOLID: {
            break;
        }
        case LINE_STYLE_DASHED: {
            vParams = vec4(size.x,          // period
                           0.5 * size.x,    // dash length
                           0.0,
                           0.0);
            break;
        }
        case LINE_STYLE_DOTTED: {
            float diameter = size.y;
            float period = diameter * 2.0;
            float center_line = 0.5 * size.y;
            vParams = vec4(period,
                           diameter / 2.0, // radius
                           center_line,
                           0.0);
            break;
        }
        case LINE_STYLE_WAVY: {
            // This logic copied from gecko to get the same results
            float line_thickness = max(aWavyLineThickness, 1.0);
            // Difference in height between peaks and troughs
            // (and since slopes are 45 degrees, the length of each slope)
            float slope_length = size.y - line_thickness;
            // Length of flat runs
            float flat_length = max((line_thickness - 1.0) * 2.0, 1.0);

            vParams = vec4(line_thickness / 2.0,
                           slope_length,
                           flat_length,
                           size.y);
            break;
        }
        default:
            vParams = vec4(0.0);
    }

    vLocalPos = mix(aPosition.xy, aPosition.yx, aAxisSelect) * size;

    gl_Position = uTransform * vec4(aTaskRect.xy + aTaskRect.zw * aPosition.xy, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER

#define MAGIC_WAVY_LINE_AA_SNAP         0.5

void main(void) {
    // Find the appropriate distance to apply the step over.
    vec2 pos = vLocalPos;
    float aa_range = compute_aa_range(pos);
    float alpha = 1.0;

    switch (vStyle) {
        case LINE_STYLE_SOLID: {
            break;
        }
        case LINE_STYLE_DASHED: {
            // Calculate dash alpha (on/off) based on dash length
            alpha = step(floor(pos.x + 0.5), vParams.y);
            break;
        }
        case LINE_STYLE_DOTTED: {
            // Get the dot alpha
            vec2 dot_relative_pos = pos - vParams.yz;
            float dot_distance = length(dot_relative_pos) - vParams.y;
            alpha = distance_aa(aa_range, dot_distance);
            break;
        }
        case LINE_STYLE_WAVY: {
            float half_line_thickness = vParams.x;
            float slope_length = vParams.y;
            float flat_length = vParams.z;
            float vertical_bounds = vParams.w;
            // Our pattern is just two slopes and two flats
            float half_period = slope_length + flat_length;

            float mid_height = vertical_bounds / 2.0;
            float peak_offset = mid_height - half_line_thickness;
            // Flip the wave every half period
            float flip = -2.0 * (step(mod(pos.x, 2.0 * half_period), half_period) - 0.5);
            // float flip = -1.0;
            peak_offset *= flip;
            float peak_height = mid_height + peak_offset;

            // Convert pos to a local position within one half period
            pos.x = mod(pos.x, half_period);

            // Compute signed distance to the 3 lines that make up an arc
            float dist1 = distance_to_line(vec2(0.0, peak_height),
                                           vec2(1.0, -flip),
                                           pos);
            float dist2 = distance_to_line(vec2(0.0, peak_height),
                                           vec2(0, -flip),
                                           pos);
            float dist3 = distance_to_line(vec2(flat_length, peak_height),
                                           vec2(-1.0, -flip),
                                           pos);
            float dist = abs(max(max(dist1, dist2), dist3));

            // Apply AA based on the thickness of the wave
            alpha = distance_aa(aa_range, dist - half_line_thickness);

            // Disable AA for thin lines
            if (half_line_thickness <= 1.0) {
                alpha = 1.0 - step(alpha, MAGIC_WAVY_LINE_AA_SNAP);
            }

            break;
        }
        default: break;
    }

    oFragColor = vec4(alpha);
}
#endif
dd4657a6eba0c089847bef68e1013f36598b5d84505680f0a6b732437b1776d9cs_line_decoration/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,prim_shared

varying vec3 vUv;
flat varying vec4 vUvRect;

#ifdef WR_VERTEX_SHADER

in vec4 aScaleTargetRect;
in ivec4 aScaleSourceRect;
in int aScaleSourceLayer;

void main(void) {
    RectWithSize src_rect = RectWithSize(vec2(aScaleSourceRect.xy), vec2(aScaleSourceRect.zw));

    vec2 texture_size = vec2(textureSize(sColor0, 0).xy);
    vUv.z = float(aScaleSourceLayer);

    vUvRect = vec4(src_rect.p0 + vec2(0.5),
                   src_rect.p0 + src_rect.size - vec2(0.5)) / texture_size.xyxy;

    vec2 pos = aScaleTargetRect.xy + aScaleTargetRect.zw * aPosition.xy;
    vUv.xy = (src_rect.p0 + src_rect.size * aPosition.xy) / texture_size;

    gl_Position = uTransform * vec4(pos, 0.0, 1.0);
}

#endif

#ifdef WR_FRAGMENT_SHADER

void main(void) {
    vec2 st = clamp(vUv.xy, vUvRect.xy, vUvRect.zw);
    oFragColor = texture(sColor0, vec3(st, vUv.z));
}

#endif
aaac538ec5d9a4bb5a3472b04c6a5580a86a1fd824596dfbf49d26e2accb242a/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,prim_shared

varying vec3 vInput1Uv;
varying vec3 vInput2Uv;
flat varying vec4 vInput1UvRect;
flat varying vec4 vInput2UvRect;
flat varying int vFilterInputCount;
flat varying int vFilterKind;
flat varying ivec4 vData;
flat varying vec4 vFilterData0;
flat varying vec4 vFilterData1;
flat varying float vFloat0;
flat varying mat4 vColorMat;
flat varying int vFuncs[4];

#define FILTER_BLEND                0
#define FILTER_FLOOD                1
#define FILTER_LINEAR_TO_SRGB       2
#define FILTER_SRGB_TO_LINEAR       3
#define FILTER_OPACITY              4
#define FILTER_COLOR_MATRIX         5
#define FILTER_DROP_SHADOW          6
#define FILTER_OFFSET               7
#define FILTER_COMPONENT_TRANSFER   8
#define FILTER_IDENTITY             9
#define FILTER_COMPOSITE            10

#define COMPOSITE_OVER       0
#define COMPOSITE_IN         1
#define COMPOSITE_OUT        2
#define COMPOSITE_ATOP       3
#define COMPOSITE_XOR        4
#define COMPOSITE_LIGHTER    5
#define COMPOSITE_ARITHMETIC 6

#ifdef WR_VERTEX_SHADER

in int aFilterRenderTaskAddress;
in int aFilterInput1TaskAddress;
in int aFilterInput2TaskAddress;
in int aFilterKind;
in int aFilterInputCount;
in int aFilterGenericInt;
in ivec2 aFilterExtraDataAddress;

struct FilterTask {
    RenderTaskCommonData common_data;
    vec3 user_data;
};

FilterTask fetch_filter_task(int address) {
    RenderTaskData task_data = fetch_render_task_data(address);

    FilterTask task = FilterTask(
        task_data.common_data,
        task_data.user_data.xyz
    );

    return task;
}

vec4 compute_uv_rect(RenderTaskCommonData task, vec2 texture_size) {
    RectWithSize task_rect = task.task_rect;

    vec4 uvRect = vec4(task_rect.p0 + vec2(0.5),
                       task_rect.p0 + task_rect.size - vec2(0.5));
    uvRect /= texture_size.xyxy;
    return uvRect;
}

vec3 compute_uv(RenderTaskCommonData task, vec2 texture_size) {
    RectWithSize task_rect = task.task_rect;
    vec3 uv = vec3(0.0, 0.0, task.texture_layer_index);

    vec2 uv0 = task_rect.p0 / texture_size;
    vec2 uv1 = floor(task_rect.p0 + task_rect.size) / texture_size;
    uv.xy = mix(uv0, uv1, aPosition.xy);

    return uv;
}

void main(void) {
    FilterTask filter_task = fetch_filter_task(aFilterRenderTaskAddress);
    RectWithSize target_rect = filter_task.common_data.task_rect;

    vec2 pos = target_rect.p0 + target_rect.size * aPosition.xy;

    RenderTaskCommonData input_1_task;
    if (aFilterInputCount > 0) {
        vec2 texture_size = vec2(textureSize(sColor0, 0).xy);
        input_1_task = fetch_render_task_common_data(aFilterInput1TaskAddress);
        vInput1UvRect = compute_uv_rect(input_1_task, texture_size);
        vInput1Uv = compute_uv(input_1_task, texture_size);
    }

    RenderTaskCommonData input_2_task;
    if (aFilterInputCount > 1) {
        vec2 texture_size = vec2(textureSize(sColor1, 0).xy);
        input_2_task = fetch_render_task_common_data(aFilterInput2TaskAddress);
        vInput2UvRect = compute_uv_rect(input_2_task, texture_size);
        vInput2Uv = compute_uv(input_2_task, texture_size);
    }

    vFilterInputCount = aFilterInputCount;
    vFilterKind = aFilterKind;

    // This assignment is only used for component transfer filters but this
    // assignment has to be done here and not in the component transfer case
    // below because it doesn't get executed on Windows because of a suspected
    // miscompile of this shader on Windows. See
    // https://github.com/servo/webrender/wiki/Driver-issues#bug-1505871---assignment-to-varying-flat-arrays-inside-switch-statement-of-vertex-shader-suspected-miscompile-on-windows
    // default: just to satisfy angle_shader_validation.rs which needs one
    // default: for every switch, even in comments.
    vFuncs[0] = (aFilterGenericInt >> 12) & 0xf; // R
    vFuncs[1] = (aFilterGenericInt >> 8)  & 0xf; // G
    vFuncs[2] = (aFilterGenericInt >> 4)  & 0xf; // B
    vFuncs[3] = (aFilterGenericInt)       & 0xf; // A

    switch (aFilterKind) {
        case FILTER_BLEND:
            vData = ivec4(aFilterGenericInt, 0, 0, 0);
            break;
        case FILTER_FLOOD:
            vFilterData0 = fetch_from_gpu_cache_1_direct(aFilterExtraDataAddress);
            break;
        case FILTER_OPACITY:
            vFloat0 = filter_task.user_data.x;
            break;
        case FILTER_COLOR_MATRIX:
            vec4 mat_data[4] = fetch_from_gpu_cache_4_direct(aFilterExtraDataAddress);
            vColorMat = mat4(mat_data[0], mat_data[1], mat_data[2], mat_data[3]);
            vFilterData0 = fetch_from_gpu_cache_1_direct(aFilterExtraDataAddress + ivec2(4, 0));
            break;
        case FILTER_DROP_SHADOW:
            vFilterData0 = fetch_from_gpu_cache_1_direct(aFilterExtraDataAddress);
            break;
        case FILTER_OFFSET:
            vec2 texture_size = vec2(textureSize(sColor0, 0).xy);
            vFilterData0 = vec4(-filter_task.user_data.xy / texture_size, vec2(0.0));

            RectWithSize task_rect = input_1_task.task_rect;
            vec4 clipRect = vec4(task_rect.p0, task_rect.p0 + task_rect.size);
            clipRect /= texture_size.xyxy;
            vFilterData1 = clipRect;
            break;
        case FILTER_COMPONENT_TRANSFER:
            vData = ivec4(aFilterExtraDataAddress, 0, 0);
            break;
        case FILTER_COMPOSITE:
            vData = ivec4(aFilterGenericInt, 0, 0, 0);
            if (aFilterGenericInt == COMPOSITE_ARITHMETIC) {
              vFilterData0 = fetch_from_gpu_cache_1_direct(aFilterExtraDataAddress);
            }
            break;
        default:
            break;
    }

    gl_Position = uTransform * vec4(pos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER

#define COMPONENT_TRANSFER_IDENTITY 0
#define COMPONENT_TRANSFER_TABLE 1
#define COMPONENT_TRANSFER_DISCRETE 2
#define COMPONENT_TRANSFER_LINEAR 3
#define COMPONENT_TRANSFER_GAMMA 4

vec3 Multiply(vec3 Cb, vec3 Cs) {
    return Cb * Cs;
}

vec3 Screen(vec3 Cb, vec3 Cs) {
    return Cb + Cs - (Cb * Cs);
}

vec3 HardLight(vec3 Cb, vec3 Cs) {
    vec3 m = Multiply(Cb, 2.0 * Cs);
    vec3 s = Screen(Cb, 2.0 * Cs - 1.0);
    vec3 edge = vec3(0.5, 0.5, 0.5);
    return mix(m, s, step(edge, Cs));
}

// TODO: Worth doing with mix/step? Check GLSL output.
float ColorDodge(float Cb, float Cs) {
    if (Cb == 0.0)
        return 0.0;
    else if (Cs == 1.0)
        return 1.0;
    else
        return min(1.0, Cb / (1.0 - Cs));
}

// TODO: Worth doing with mix/step? Check GLSL output.
float ColorBurn(float Cb, float Cs) {
    if (Cb == 1.0)
        return 1.0;
    else if (Cs == 0.0)
        return 0.0;
    else
        return 1.0 - min(1.0, (1.0 - Cb) / Cs);
}

float SoftLight(float Cb, float Cs) {
    if (Cs <= 0.5) {
        return Cb - (1.0 - 2.0 * Cs) * Cb * (1.0 - Cb);
    } else {
        float D;

        if (Cb <= 0.25)
            D = ((16.0 * Cb - 12.0) * Cb + 4.0) * Cb;
        else
            D = sqrt(Cb);

        return Cb + (2.0 * Cs - 1.0) * (D - Cb);
    }
}

vec3 Difference(vec3 Cb, vec3 Cs) {
    return abs(Cb - Cs);
}

vec3 Exclusion(vec3 Cb, vec3 Cs) {
    return Cb + Cs - 2.0 * Cb * Cs;
}

// These functions below are taken from the spec.
// There's probably a much quicker way to implement
// them in GLSL...
float Sat(vec3 c) {
    return max(c.r, max(c.g, c.b)) - min(c.r, min(c.g, c.b));
}

float Lum(vec3 c) {
    vec3 f = vec3(0.3, 0.59, 0.11);
    return dot(c, f);
}

vec3 ClipColor(vec3 C) {
    float L = Lum(C);
    float n = min(C.r, min(C.g, C.b));
    float x = max(C.r, max(C.g, C.b));

    if (n < 0.0)
        C = L + (((C - L) * L) / (L - n));

    if (x > 1.0)
        C = L + (((C - L) * (1.0 - L)) / (x - L));

    return C;
}

vec3 SetLum(vec3 C, float l) {
    float d = l - Lum(C);
    return ClipColor(C + d);
}

void SetSatInner(inout float Cmin, inout float Cmid, inout float Cmax, float s) {
    if (Cmax > Cmin) {
        Cmid = (((Cmid - Cmin) * s) / (Cmax - Cmin));
        Cmax = s;
    } else {
        Cmid = 0.0;
        Cmax = 0.0;
    }
    Cmin = 0.0;
}

vec3 SetSat(vec3 C, float s) {
    if (C.r <= C.g) {
        if (C.g <= C.b) {
            SetSatInner(C.r, C.g, C.b, s);
        } else {
            if (C.r <= C.b) {
                SetSatInner(C.r, C.b, C.g, s);
            } else {
                SetSatInner(C.b, C.r, C.g, s);
            }
        }
    } else {
        if (C.r <= C.b) {
            SetSatInner(C.g, C.r, C.b, s);
        } else {
            if (C.g <= C.b) {
                SetSatInner(C.g, C.b, C.r, s);
            } else {
                SetSatInner(C.b, C.g, C.r, s);
            }
        }
    }
    return C;
}

vec3 Hue(vec3 Cb, vec3 Cs) {
    return SetLum(SetSat(Cs, Sat(Cb)), Lum(Cb));
}

vec3 Saturation(vec3 Cb, vec3 Cs) {
    return SetLum(SetSat(Cb, Sat(Cs)), Lum(Cb));
}

vec3 Color(vec3 Cb, vec3 Cs) {
    return SetLum(Cs, Lum(Cb));
}

vec3 Luminosity(vec3 Cb, vec3 Cs) {
    return SetLum(Cb, Lum(Cs));
}

const int BlendMode_Normal      = 0;
const int BlendMode_Multiply    = 1;
const int BlendMode_Screen      = 2;
const int BlendMode_Overlay     = 3;
const int BlendMode_Darken      = 4;
const int BlendMode_Lighten     = 5;
const int BlendMode_ColorDodge  = 6;
const int BlendMode_ColorBurn   = 7;
const int BlendMode_HardLight   = 8;
const int BlendMode_SoftLight   = 9;
const int BlendMode_Difference  = 10;
const int BlendMode_Exclusion   = 11;
const int BlendMode_Hue         = 12;
const int BlendMode_Saturation  = 13;
const int BlendMode_Color       = 14;
const int BlendMode_Luminosity  = 15;

vec4 blend(vec4 Cs, vec4 Cb, int mode) {
    vec4 result = vec4(1.0, 0.0, 0.0, 1.0);

    switch (mode) {
        case BlendMode_Normal:
            result.rgb = Cs.rgb;
            break;
        case BlendMode_Multiply:
            result.rgb = Multiply(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Screen:
            result.rgb = Screen(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Overlay:
            // Overlay is inverse of Hardlight
            result.rgb = HardLight(Cs.rgb, Cb.rgb);
            break;
        case BlendMode_Darken:
            result.rgb = min(Cs.rgb, Cb.rgb);
            break;
        case BlendMode_Lighten:
            result.rgb = max(Cs.rgb, Cb.rgb);
            break;
        case BlendMode_ColorDodge:
            result.r = ColorDodge(Cb.r, Cs.r);
            result.g = ColorDodge(Cb.g, Cs.g);
            result.b = ColorDodge(Cb.b, Cs.b);
            break;
        case BlendMode_ColorBurn:
            result.r = ColorBurn(Cb.r, Cs.r);
            result.g = ColorBurn(Cb.g, Cs.g);
            result.b = ColorBurn(Cb.b, Cs.b);
            break;
        case BlendMode_HardLight:
            result.rgb = HardLight(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_SoftLight:
            result.r = SoftLight(Cb.r, Cs.r);
            result.g = SoftLight(Cb.g, Cs.g);
            result.b = SoftLight(Cb.b, Cs.b);
            break;
        case BlendMode_Difference:
            result.rgb = Difference(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Exclusion:
            result.rgb = Exclusion(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Hue:
            result.rgb = Hue(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Saturation:
            result.rgb = Saturation(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Color:
            result.rgb = Color(Cb.rgb, Cs.rgb);
            break;
        case BlendMode_Luminosity:
            result.rgb = Luminosity(Cb.rgb, Cs.rgb);
            break;
        default: break;
    }
    vec3 rgb = (1.0 - Cb.a) * Cs.rgb + Cb.a * result.rgb;
    result = mix(vec4(Cb.rgb * Cb.a, Cb.a), vec4(rgb, 1.0), Cs.a);
    return result;
}

// Based on the Gecko's implementation in
// https://hg.mozilla.org/mozilla-central/file/91b4c3687d75/gfx/src/FilterSupport.cpp#l24
// These could be made faster by sampling a lookup table stored in a float texture
// with linear interpolation.

vec3 SrgbToLinear(vec3 color) {
    vec3 c1 = color / 12.92;
    vec3 c2 = pow(color / 1.055 + vec3(0.055 / 1.055), vec3(2.4));
    return if_then_else(lessThanEqual(color, vec3(0.04045)), c1, c2);
}

vec3 LinearToSrgb(vec3 color) {
    vec3 c1 = color * 12.92;
    vec3 c2 = vec3(1.055) * pow(color, vec3(1.0 / 2.4)) - vec3(0.055);
    return if_then_else(lessThanEqual(color, vec3(0.0031308)), c1, c2);
}

// This function has to be factored out due to the following issue:
// https://github.com/servo/webrender/wiki/Driver-issues#bug-1532245---switch-statement-inside-control-flow-inside-switch-statement-fails-to-compile-on-some-android-phones
// (and now the words "default: default:" so angle_shader_validation.rs passes)
vec4 ComponentTransfer(vec4 colora) {
    // We push a different amount of data to the gpu cache depending on the
    // function type.
    // Identity => 0 blocks
    // Table/Discrete => 64 blocks (256 values)
    // Linear => 1 block (2 values)
    // Gamma => 1 block (3 values)
    // We loop through the color components and increment the offset (for the
    // next color component) into the gpu cache based on how many blocks that
    // function type put into the gpu cache.
    // Table/Discrete use a 256 entry look up table.
    // Linear/Gamma are a simple calculation.
    int offset = 0;
    vec4 texel;
    int k;

    for (int i = 0; i < 4; i++) {
        switch (vFuncs[i]) {
            case COMPONENT_TRANSFER_IDENTITY:
                break;
            case COMPONENT_TRANSFER_TABLE:
            case COMPONENT_TRANSFER_DISCRETE:
                // fetch value from lookup table
                k = int(floor(colora[i]*255.0));
                texel = fetch_from_gpu_cache_1_direct(vData.xy + ivec2(offset + k/4, 0));
                colora[i] = clamp(texel[k % 4], 0.0, 1.0);
                // offset plus 256/4 blocks
                offset = offset + 64;
                break;
            case COMPONENT_TRANSFER_LINEAR:
                // fetch the two values for use in the linear equation
                texel = fetch_from_gpu_cache_1_direct(vData.xy + ivec2(offset, 0));
                colora[i] = clamp(texel[0] * colora[i] + texel[1], 0.0, 1.0);
                // offset plus 1 block
                offset = offset + 1;
                break;
            case COMPONENT_TRANSFER_GAMMA:
                // fetch the three values for use in the gamma equation
                texel = fetch_from_gpu_cache_1_direct(vData.xy + ivec2(offset, 0));
                colora[i] = clamp(texel[0] * pow(colora[i], texel[1]) + texel[2], 0.0, 1.0);
                // offset plus 1 block
                offset = offset + 1;
                break;
            default:
                // shouldn't happen
                break;
        }
    }
    return colora;
}

// Composite Filter

vec4 composite(vec4 Cs, vec4 Cb, int mode) {
    vec4 Cr = vec4(0.0, 1.0, 0.0, 1.0);
    switch (mode) {
        case COMPOSITE_OVER:
            Cr.rgb = Cs.a * Cs.rgb + Cb.a * Cb.rgb * (1.0 - Cs.a);
            Cr.a = Cs.a + Cb.a * (1.0 - Cs.a);
            break;
        case COMPOSITE_IN:
            Cr.rgb = Cs.a * Cs.rgb * Cb.a;
            Cr.a = Cs.a * Cb.a;
            break;
        case COMPOSITE_OUT:
            Cr.rgb = Cs.a * Cs.rgb * (1.0 - Cb.a);
            Cr.a = Cs.a * (1.0 - Cb.a);
            break;
        case COMPOSITE_ATOP:
            Cr.rgb = Cs.a * Cs.rgb * Cb.a + Cb.a * Cb.rgb * (1.0 - Cs.a);
            Cr.a = Cs.a * Cb.a + Cb.a * (1.0 - Cs.a);
            break;
        case COMPOSITE_XOR:
            Cr.rgb = Cs.a * Cs.rgb * (1.0 - Cb.a) + Cb.a * Cb.rgb * (1.0 - Cs.a);
            Cr.a = Cs.a * (1.0 - Cb.a) + Cb.a * (1.0 - Cs.a);
            break;
        case COMPOSITE_LIGHTER:
            Cr.rgb = Cs.a * Cs.rgb + Cb.a * Cb.rgb;
            Cr.a = Cs.a + Cb.a;
            Cr = clamp(Cr, vec4(0.0), vec4(1.0));
            break;
        case COMPOSITE_ARITHMETIC:
            Cr = vec4(vFilterData0.x) * Cs * Cb + vec4(vFilterData0.y) * Cs + vec4(vFilterData0.z) * Cb + vec4(vFilterData0.w);
            Cr = clamp(Cr, vec4(0.0), vec4(1.0));
            break;
        default:
            break;
    }
    return Cr;
}

vec4 sampleInUvRect(sampler2DArray sampler, vec3 uv, vec4 uvRect) {
    vec2 clamped = clamp(uv.xy, uvRect.xy, uvRect.zw);
    return texture(sampler, vec3(clamped, uv.z), 0.0);
}

void main(void) {
    vec4 Ca = vec4(0.0, 0.0, 0.0, 0.0);
    vec4 Cb = vec4(0.0, 0.0, 0.0, 0.0);
    if (vFilterInputCount > 0) {
        Ca = sampleInUvRect(sColor0, vInput1Uv, vInput1UvRect);
        if (Ca.a != 0.0) {
            Ca.rgb /= Ca.a;
        }
    }
    if (vFilterInputCount > 1) {
        Cb = sampleInUvRect(sColor1, vInput2Uv, vInput2UvRect);
        if (Cb.a != 0.0) {
            Cb.rgb /= Cb.a;
        }
    }

    vec4 result = vec4(1.0, 0.0, 0.0, 1.0);

    bool needsPremul = true;

    switch (vFilterKind) {
        case FILTER_BLEND:
            result = blend(Ca, Cb, vData.x);
            needsPremul = false;
            break;
        case FILTER_FLOOD:
            result = vFilterData0;
            needsPremul = false;
            break;
        case FILTER_LINEAR_TO_SRGB:
            result.rgb = LinearToSrgb(Ca.rgb);
            result.a = Ca.a;
            break;
        case FILTER_SRGB_TO_LINEAR:
            result.rgb = SrgbToLinear(Ca.rgb);
            result.a = Ca.a;
            break;
        case FILTER_OPACITY:
            result.rgb = Ca.rgb;
            result.a = Ca.a * vFloat0;
            break;
        case FILTER_COLOR_MATRIX:
            result = vColorMat * Ca + vFilterData0;
            result = clamp(result, vec4(0.0), vec4(1.0));
            break;
        case FILTER_DROP_SHADOW:
            vec4 shadow = vec4(vFilterData0.rgb, Cb.a * vFilterData0.a);
            // Normal blend + source-over coposite
            result = blend(Ca, shadow, BlendMode_Normal);
            needsPremul = false;
            break;
        case FILTER_OFFSET:
            vec2 offsetUv = vInput1Uv.xy + vFilterData0.xy;
            result = sampleInUvRect(sColor0, vec3(offsetUv, vInput1Uv.z), vInput1UvRect);
            result *= point_inside_rect(offsetUv, vFilterData1.xy, vFilterData1.zw);
            needsPremul = false;
            break;
        case FILTER_COMPONENT_TRANSFER:
            result = ComponentTransfer(Ca);
            break;
        case FILTER_IDENTITY:
            result = Ca;
            break;
        case FILTER_COMPOSITE:
            result = composite(Ca, Cb, vData.x);
            needsPremul = false;
        default:
            break;
    }

    if (needsPremul) {
        result.rgb *= result.a;
    }

    oFragColor = result;
}
#endif
1e152b772a53f2d6ab57fe44cb3f75b22b5a82c44b28d217368e40465d476a49cs_svg_filter/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,shared_other

varying vec4 vColor;

#ifdef WR_VERTEX_SHADER
in vec4 aColor;

void main(void) {
    vColor = vec4(aColor.rgb * aColor.a, aColor.a);
    vec4 pos = vec4(aPosition, 1.0);
    pos.xy = floor(pos.xy + 0.5);
    gl_Position = uTransform * pos;
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    oFragColor = vColor;
}
#endif
0c41758f6c5627c4dbc1f5eb0c277dbba34b7ae9d70b7a76387b68b95c60b9a8/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,shared_other

varying vec2 vColorTexCoord;
varying vec4 vColor;

#ifdef WR_VERTEX_SHADER
in vec4 aColor;
in vec2 aColorTexCoord;

void main(void) {
    vColor = aColor;
    vColorTexCoord = aColorTexCoord;
    vec4 pos = vec4(aPosition, 1.0);
    pos.xy = floor(pos.xy + 0.5);
    gl_Position = uTransform * pos;
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    float alpha = texture(sColor0, vec3(vColorTexCoord.xy, 0.0)).r;
    oFragColor = vColor * alpha;
}
#endif
9dbe20a33c54ca8e318a27248035f507a85233cd754515ec9cd28a27bbb948e1/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#ifdef WR_FRAGMENT_SHADER

// One iteration of Newton's method on the 2D equation of an ellipse:
//
//     E(x, y) = x^2/a^2 + y^2/b^2 - 1
//
// The Jacobian of this equation is:
//
//     J(E(x, y)) = [ 2*x/a^2 2*y/b^2 ]
//
// We approximate the distance with:
//
//     E(x, y) / ||J(E(x, y))||
//
// See G. Taubin, "Distance Approximations for Rasterizing Implicit
// Curves", section 3.
float distance_to_ellipse(vec2 p, vec2 radii, float aa_range) {
    float dist;
    if (any(lessThanEqual(radii, vec2(0.0)))) {
        dist = length(p);
    } else {
        vec2 invRadiiSq = 1.0 / (radii * radii);
        float g = dot(p * p * invRadiiSq, vec2(1.0)) - 1.0;
        vec2 dG = 2.0 * p * invRadiiSq;
        dist = g * inversesqrt(dot(dG, dG));
    }
    return clamp(dist, -aa_range, aa_range);
}

float clip_against_ellipse_if_needed(
    vec2 pos,
    float current_distance,
    vec4 ellipse_center_radius,
    vec2 sign_modifier,
    float aa_range
) {
    if (!all(lessThan(sign_modifier * pos, sign_modifier * ellipse_center_radius.xy))) {
      return current_distance;
    }

    float distance = distance_to_ellipse(pos - ellipse_center_radius.xy,
                                         ellipse_center_radius.zw,
                                         aa_range);

    return max(distance, current_distance);
}

float rounded_rect(vec2 pos,
                   vec4 clip_center_radius_tl,
                   vec4 clip_center_radius_tr,
                   vec4 clip_center_radius_br,
                   vec4 clip_center_radius_bl,
                   float aa_range) {
    // Start with a negative value (means "inside") for all fragments that are not
    // in a corner. If the fragment is in a corner, one of the clip_against_ellipse_if_needed
    // calls below will update it.
    float current_distance = -aa_range;

    // Clip against each ellipse.
    current_distance = clip_against_ellipse_if_needed(pos,
                                                      current_distance,
                                                      clip_center_radius_tl,
                                                      vec2(1.0),
                                                      aa_range);

    current_distance = clip_against_ellipse_if_needed(pos,
                                                      current_distance,
                                                      clip_center_radius_tr,
                                                      vec2(-1.0, 1.0),
                                                      aa_range);

    current_distance = clip_against_ellipse_if_needed(pos,
                                                      current_distance,
                                                      clip_center_radius_br,
                                                      vec2(-1.0),
                                                      aa_range);

    current_distance = clip_against_ellipse_if_needed(pos,
                                                      current_distance,
                                                      clip_center_radius_bl,
                                                      vec2(1.0, -1.0),
                                                      aa_range);

    // Apply AA
    // See comment in ps_border_corner about the choice of constants.

    return distance_aa(aa_range, current_distance);
}
#endif
fd039f57b39676e5dada17cc16a47ddefddb673f4651260200e547dece93d47fellipse/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

uniform HIGHP_SAMPLER_FLOAT sampler2D sGpuCache;

#define VECS_PER_IMAGE_RESOURCE     2

// TODO(gw): This is here temporarily while we have
//           both GPU store and cache. When the GPU
//           store code is removed, we can change the
//           PrimitiveInstance instance structure to
//           use 2x unsigned shorts as vertex attributes
//           instead of an int, and encode the UV directly
//           in the vertices.
ivec2 get_gpu_cache_uv(HIGHP_FS_ADDRESS int address) {
    return ivec2(uint(address) % WR_MAX_VERTEX_TEXTURE_WIDTH,
                 uint(address) / WR_MAX_VERTEX_TEXTURE_WIDTH);
}

vec4[2] fetch_from_gpu_cache_2_direct(ivec2 address) {
    return vec4[2](
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(1, 0))
    );
}

vec4[2] fetch_from_gpu_cache_2(HIGHP_FS_ADDRESS int address) {
    ivec2 uv = get_gpu_cache_uv(address);
    return vec4[2](
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(1, 0))
    );
}

vec4 fetch_from_gpu_cache_1_direct(ivec2 address) {
    return texelFetch(sGpuCache, address, 0);
}

vec4 fetch_from_gpu_cache_1(HIGHP_FS_ADDRESS int address) {
    ivec2 uv = get_gpu_cache_uv(address);
    return texelFetch(sGpuCache, uv, 0);
}

#ifdef WR_VERTEX_SHADER

vec4[8] fetch_from_gpu_cache_8(int address) {
    ivec2 uv = get_gpu_cache_uv(address);
    return vec4[8](
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(1, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(2, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(3, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(4, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(5, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(6, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(7, 0))
    );
}

vec4[3] fetch_from_gpu_cache_3(int address) {
    ivec2 uv = get_gpu_cache_uv(address);
    return vec4[3](
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(1, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(2, 0))
    );
}

vec4[3] fetch_from_gpu_cache_3_direct(ivec2 address) {
    return vec4[3](
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(1, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(2, 0))
    );
}

vec4[4] fetch_from_gpu_cache_4_direct(ivec2 address) {
    return vec4[4](
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(1, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(2, 0)),
        TEXEL_FETCH(sGpuCache, address, 0, ivec2(3, 0))
    );
}

vec4[4] fetch_from_gpu_cache_4(int address) {
    ivec2 uv = get_gpu_cache_uv(address);
    return vec4[4](
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(0, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(1, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(2, 0)),
        TEXEL_FETCH(sGpuCache, uv, 0, ivec2(3, 0))
    );
}

//TODO: image resource is too specific for this module

struct ImageResource {
    RectWithEndpoint uv_rect;
    float layer;
    vec3 user_data;
};

ImageResource fetch_image_resource(int address) {
    //Note: number of blocks has to match `renderer::BLOCKS_PER_UV_RECT`
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    RectWithEndpoint uv_rect = RectWithEndpoint(data[0].xy, data[0].zw);
    return ImageResource(uv_rect, data[1].x, data[1].yzw);
}

ImageResource fetch_image_resource_direct(ivec2 address) {
    vec4 data[2] = fetch_from_gpu_cache_2_direct(address);
    RectWithEndpoint uv_rect = RectWithEndpoint(data[0].xy, data[0].zw);
    return ImageResource(uv_rect, data[1].x, data[1].yzw);
}

// Fetch optional extra data for a texture cache resource. This can contain
// a polygon defining a UV rect within the texture cache resource.
// Note: the polygon coordinates are in homogeneous space.
struct ImageResourceExtra {
    vec4 st_tl;
    vec4 st_tr;
    vec4 st_bl;
    vec4 st_br;
};

ImageResourceExtra fetch_image_resource_extra(int address) {
    vec4 data[4] = fetch_from_gpu_cache_4(address + VECS_PER_IMAGE_RESOURCE);
    return ImageResourceExtra(
        data[0],
        data[1],
        data[2],
        data[3]
    );
}

#endif //WR_VERTEX_SHADER
b0f7896ddb60129b256ce1bf2556cef3b90a82785fb26e9b5813d4de647b86cagpu_cache/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include base

varying vec4 vData;

#ifdef WR_VERTEX_SHADER
in vec4 aValue;
in vec2 aPosition;

void main() {
    vData = aValue;
    gl_Position = vec4(aPosition * 2.0 - 1.0, 0.0, 1.0);
    gl_PointSize = 1.0;
}

#endif //WR_VERTEX_SHADER

#ifdef WR_FRAGMENT_SHADER
out vec4 oValue;

void main() {
    oValue = vData;
}
#endif //WR_FRAGMENT_SHADER
4eeec6efb93a45db879d4a5362c360fce20651289da14179b7a776bcbb429de9/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared

#ifdef WR_VERTEX_SHADER

in ivec4 aTargetRect;
in ivec2 aStencilOrigin;
in int aSubpixel;
in int aPad;

out vec2 vStencilUV;
flat out int vSubpixel;

void main(void) {
    vec4 targetRect = vec4(aTargetRect);
    vec2 stencilOrigin = vec2(aStencilOrigin);

    vec2 targetOffset = mix(vec2(0.0), targetRect.zw, aPosition.xy);
    vec2 targetPosition = targetRect.xy + targetOffset;
    vec2 stencilOffset = targetOffset * vec2(aSubpixel == 0 ? 1.0 : 3.0, 1.0);
    vec2 stencilPosition = stencilOrigin + stencilOffset;

    gl_Position = uTransform * vec4(targetPosition, aPosition.z, 1.0);
    vStencilUV = stencilPosition;
    vSubpixel = aSubpixel;
}

#endif

#ifdef WR_FRAGMENT_SHADER

#define LCD_FILTER_FACTOR_0     (86.0 / 255.0)
#define LCD_FILTER_FACTOR_1     (77.0 / 255.0)
#define LCD_FILTER_FACTOR_2     (8.0  / 255.0)

in vec2 vStencilUV;
flat in int vSubpixel;

/// Applies a slight horizontal blur to reduce color fringing on LCD screens
/// when performing subpixel AA.
///
/// The algorithm should be identical to that of FreeType:
/// https://www.freetype.org/freetype2/docs/reference/ft2-lcd_filtering.html
float lcdFilter(float shadeL2, float shadeL1, float shade0, float shadeR1, float shadeR2) {
    return LCD_FILTER_FACTOR_2 * shadeL2 +
        LCD_FILTER_FACTOR_1 * shadeL1 +
        LCD_FILTER_FACTOR_0 * shade0 +
        LCD_FILTER_FACTOR_1 * shadeR1 +
        LCD_FILTER_FACTOR_2 * shadeR2;
}

void main(void) {
    ivec2 stencilUV = ivec2(vStencilUV);
    float shade0 = abs(TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(0, 0)).r);

    if (vSubpixel == 0) {
        oFragColor = vec4(shade0);
        return;
    }

    vec3 shadeL = abs(vec3(TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(-1, 0)).r,
                           TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(-2, 0)).r,
                           TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(-3, 0)).r));
    vec3 shadeR = abs(vec3(TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(1, 0)).r,
                           TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(2, 0)).r,
                           TEXEL_FETCH(sColor0, stencilUV, 0, ivec2(3, 0)).r));

    oFragColor = vec4(lcdFilter(shadeL.z, shadeL.y, shadeL.x, shade0,   shadeR.x),
                      lcdFilter(shadeL.y, shadeL.x, shade0,   shadeR.x, shadeR.y),
                      lcdFilter(shadeL.x, shade0,   shadeR.x, shadeR.y, shadeR.z),
                      1.0);
}

#endif
2ebb79c9c1a8d074fc71d9f89e32d3429b2ea56fda8b7da947064643b9e4fa1dpf_vector_cover/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared

#ifdef WR_VERTEX_SHADER

in vec2 aFromPosition;
in vec2 aCtrlPosition;
in vec2 aToPosition;
in vec2 aFromNormal;
in vec2 aCtrlNormal;
in vec2 aToNormal;
in int aPathID;
in int aPad;

out vec2 vFrom;
out vec2 vCtrl;
out vec2 vTo;

void main(void) {
    // Unpack.
    int pathID = int(aPathID);

    ivec2 pathAddress = ivec2(0.0, aPathID);
    mat2 transformLinear = mat2(TEXEL_FETCH(sColor1, pathAddress, 0, ivec2(0, 0)));
    vec2 transformTranslation = TEXEL_FETCH(sColor1, pathAddress, 0, ivec2(1, 0)).xy;

    vec4 miscInfo = TEXEL_FETCH(sColor1, pathAddress, 0, ivec2(2, 0));
    float rectHeight = miscInfo.y;
    vec2 emboldenAmount = miscInfo.zw * 0.5;

    // TODO(pcwalton): Hint positions.
    vec2 from = aFromPosition;
    vec2 ctrl = aCtrlPosition;
    vec2 to = aToPosition;

    // Embolden as necessary.
    from -= aFromNormal * emboldenAmount;
    ctrl -= aCtrlNormal * emboldenAmount;
    to -= aToNormal * emboldenAmount;

    // Perform the transform.
    from = transformLinear * from + transformTranslation;
    ctrl = transformLinear * ctrl + transformTranslation;
    to = transformLinear * to + transformTranslation;

    // Choose correct quadrant for rotation.
    vec2 corner = vec2(0.0, rectHeight) + transformTranslation;

    // Compute edge vectors. De Casteljau subdivide if necessary.
    // TODO(pcwalton): Actually do the two-pass rendering.

    // Compute position and dilate. If too thin, discard to avoid artefacts.
    vec2 position;
    if (abs(from.x - to.x) < 0.0001)
        position.x = 0.0;
    else if (aPosition.x < 0.5)
        position.x = floor(min(min(from.x, to.x), ctrl.x));
    else
        position.x = ceil(max(max(from.x, to.x), ctrl.x));
    if (aPosition.y < 0.5)
        position.y = floor(min(min(from.y, to.y), ctrl.y));
    else
        position.y = corner.y;

    // Compute final position and depth.
    vec4 clipPosition = uTransform * vec4(position, aPosition.z, 1.0);

    // Finish up.
    gl_Position = clipPosition;
    vFrom = from - position;
    vCtrl = ctrl - position;
    vTo = to - position;
}

#endif

#ifdef WR_FRAGMENT_SHADER

uniform sampler2D uAreaLUT;

in vec2 vFrom;
in vec2 vCtrl;
in vec2 vTo;

void main(void) {
    // Unpack.
    vec2 from = vFrom, ctrl = vCtrl, to = vTo;

    // Determine winding, and sort into a consistent order so we only need to find one root below.
    bool winding = from.x < to.x;
    vec2 left = winding ? from : to, right = winding ? to : from;
    vec2 v0 = ctrl - left, v1 = right - ctrl;

    // Shoot a vertical ray toward the curve.
    vec2 window = clamp(vec2(from.x, to.x), -0.5, 0.5);
    float offset = mix(window.x, window.y, 0.5) - left.x;
    float t = offset / (v0.x + sqrt(v1.x * offset - v0.x * (offset - v0.x)));

    // Compute position and derivative to form a line approximation.
    float y = mix(mix(left.y, ctrl.y, t), mix(ctrl.y, right.y, t), t);
    float d = mix(v0.y, v1.y, t) / mix(v0.x, v1.x, t);

    // Look up area under that line, and scale horizontally to the window size.
    float dX = window.x - window.y;
    oFragColor = vec4(texture(sColor0, vec2(y + 8.0, abs(d * dX)) / 16.0).r * dX);
}

#endif
eaef296c4b21afcd03fba190841b25af2d681ada97a509ddbf6657ae6154d317pf_vector_stencil/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// Initialize the pixel local storage area by reading the current
// framebuffer color. We might be able to skip this in future by
// making the opaque pass also write to pixel local storage.

#define PLS_WRITEONLY

#include shared

#ifdef WR_VERTEX_SHADER
in vec4 aRect;

void main(void) {
    vec2 pos = aRect.xy + aPosition.xy * aRect.zw;
    gl_Position = uTransform * vec4(pos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    // Store current framebuffer color in our custom PLS struct.
	PLS.color = gl_LastFragColorARM;
}
#endif
3d53d333429b93c91c4780d7b42ea698a751e90b2876cb0bd6b377c5304e13cf/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// Write the final value stored in pixel local store out to normal
// fragment outputs. This will be the color that gets resolved out
// to main memory.

#define PLS_READONLY

#include shared

#ifdef WR_VERTEX_SHADER
in vec4 aRect;

void main(void) {
    vec2 pos = aRect.xy + aPosition.xy * aRect.zw;
    gl_Position = uTransform * vec4(pos, 0.0, 1.0);
}
#endif

#ifdef WR_FRAGMENT_SHADER
out vec4 oFragColor;

void main(void) {
	// Write the final color value in pixel local storage out as a fragment color.
    oFragColor = PLS.color;
}
#endif
cc864bb0f1ca43c45e5d08fdfce17f05e45d7576481280f93594c2b0a2063721pls_resolve/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include rect,render_task,gpu_cache,transform

#define EXTEND_MODE_CLAMP  0
#define EXTEND_MODE_REPEAT 1

#define SUBPX_DIR_NONE        0
#define SUBPX_DIR_HORIZONTAL  1
#define SUBPX_DIR_VERTICAL    2
#define SUBPX_DIR_MIXED       3

#define RASTER_LOCAL            0
#define RASTER_SCREEN           1

uniform sampler2DArray sPrevPassAlpha;
uniform sampler2DArray sPrevPassColor;

vec2 clamp_rect(vec2 pt, RectWithSize rect) {
    return clamp(pt, rect.p0, rect.p0 + rect.size);
}

// TODO: convert back to RectWithEndPoint if driver issues are resolved, if ever.
flat varying vec4 vClipMaskUvBounds;
// XY and W are homogeneous coordinates, Z is the layer index
varying vec4 vClipMaskUv;


#ifdef WR_VERTEX_SHADER

#define COLOR_MODE_FROM_PASS          0
#define COLOR_MODE_ALPHA              1
#define COLOR_MODE_SUBPX_CONST_COLOR  2
#define COLOR_MODE_SUBPX_BG_PASS0     3
#define COLOR_MODE_SUBPX_BG_PASS1     4
#define COLOR_MODE_SUBPX_BG_PASS2     5
#define COLOR_MODE_SUBPX_DUAL_SOURCE  6
#define COLOR_MODE_BITMAP             7
#define COLOR_MODE_COLOR_BITMAP       8
#define COLOR_MODE_IMAGE              9

uniform HIGHP_SAMPLER_FLOAT sampler2D sPrimitiveHeadersF;
uniform HIGHP_SAMPLER_FLOAT isampler2D sPrimitiveHeadersI;

// Instanced attributes
in ivec4 aData;

#define VECS_PER_PRIM_HEADER_F 2U
#define VECS_PER_PRIM_HEADER_I 2U

struct Instance
{
    int prim_header_address;
    int picture_task_address;
    int clip_address;
    int segment_index;
    int flags;
    int resource_address;
    int brush_kind;
};

Instance decode_instance_attributes() {
    Instance instance;

    instance.prim_header_address = aData.x;
    instance.picture_task_address = aData.y >> 16;
    instance.clip_address = aData.y & 0xffff;
    instance.segment_index = aData.z & 0xffff;
    instance.flags = aData.z >> 16;
    instance.resource_address = aData.w & 0xffffff;
    instance.brush_kind = aData.w >> 24;

    return instance;
}

struct PrimitiveHeader {
    RectWithSize local_rect;
    RectWithSize local_clip_rect;
    float z;
    int specific_prim_address;
    int transform_id;
    ivec4 user_data;
};

PrimitiveHeader fetch_prim_header(int index) {
    PrimitiveHeader ph;

    ivec2 uv_f = get_fetch_uv(index, VECS_PER_PRIM_HEADER_F);
    vec4 local_rect = TEXEL_FETCH(sPrimitiveHeadersF, uv_f, 0, ivec2(0, 0));
    vec4 local_clip_rect = TEXEL_FETCH(sPrimitiveHeadersF, uv_f, 0, ivec2(1, 0));
    ph.local_rect = RectWithSize(local_rect.xy, local_rect.zw);
    ph.local_clip_rect = RectWithSize(local_clip_rect.xy, local_clip_rect.zw);

    ivec2 uv_i = get_fetch_uv(index, VECS_PER_PRIM_HEADER_I);
    ivec4 data0 = TEXEL_FETCH(sPrimitiveHeadersI, uv_i, 0, ivec2(0, 0));
    ivec4 data1 = TEXEL_FETCH(sPrimitiveHeadersI, uv_i, 0, ivec2(1, 0));
    ph.z = float(data0.x);
    ph.specific_prim_address = data0.y;
    ph.transform_id = data0.z;
    ph.user_data = data1;

    return ph;
}

struct VertexInfo {
    vec2 local_pos;
    vec4 world_pos;
};

VertexInfo write_vertex(vec2 local_pos,
                        RectWithSize local_clip_rect,
                        float z,
                        Transform transform,
                        PictureTask task) {
    // Clamp to the two local clip rects.
    vec2 clamped_local_pos = clamp_rect(local_pos, local_clip_rect);

    // Transform the current vertex to world space.
    vec4 world_pos = transform.m * vec4(clamped_local_pos, 0.0, 1.0);

    // Convert the world positions to device pixel space.
    vec2 device_pos = world_pos.xy * task.device_pixel_scale;

    // Apply offsets for the render task to get correct screen location.
    vec2 final_offset = -task.content_origin + task.common_data.task_rect.p0;

    gl_Position = uTransform * vec4(device_pos + final_offset * world_pos.w, z * world_pos.w, world_pos.w);

    VertexInfo vi = VertexInfo(
        clamped_local_pos,
        world_pos
    );

    return vi;
}

float cross2(vec2 v0, vec2 v1) {
    return v0.x * v1.y - v0.y * v1.x;
}

// Return intersection of line (p0,p1) and line (p2,p3)
vec2 intersect_lines(vec2 p0, vec2 p1, vec2 p2, vec2 p3) {
    vec2 d0 = p0 - p1;
    vec2 d1 = p2 - p3;

    float s0 = cross2(p0, p1);
    float s1 = cross2(p2, p3);

    float d = cross2(d0, d1);
    float nx = s0 * d1.x - d0.x * s1;
    float ny = s0 * d1.y - d0.y * s1;

    return vec2(nx / d, ny / d);
}

VertexInfo write_transform_vertex(RectWithSize local_segment_rect,
                                  RectWithSize local_prim_rect,
                                  RectWithSize local_clip_rect,
                                  vec4 clip_edge_mask,
                                  float z,
                                  Transform transform,
                                  PictureTask task) {
    // Calculate a clip rect from local_rect + local clip
    RectWithEndpoint clip_rect = to_rect_with_endpoint(local_clip_rect);
    RectWithEndpoint segment_rect = to_rect_with_endpoint(local_segment_rect);
    segment_rect.p0 = clamp(segment_rect.p0, clip_rect.p0, clip_rect.p1);
    segment_rect.p1 = clamp(segment_rect.p1, clip_rect.p0, clip_rect.p1);

    // Calculate a clip rect from local_rect + local clip
    RectWithEndpoint prim_rect = to_rect_with_endpoint(local_prim_rect);
    prim_rect.p0 = clamp(prim_rect.p0, clip_rect.p0, clip_rect.p1);
    prim_rect.p1 = clamp(prim_rect.p1, clip_rect.p0, clip_rect.p1);

    // As this is a transform shader, extrude by 2 (local space) pixels
    // in each direction. This gives enough space around the edge to
    // apply distance anti-aliasing. Technically, it:
    // (a) slightly over-estimates the number of required pixels in the simple case.
    // (b) might not provide enough edge in edge case perspective projections.
    // However, it's fast and simple. If / when we ever run into issues, we
    // can do some math on the projection matrix to work out a variable
    // amount to extrude.

    // Only extrude along edges where we are going to apply AA.
    float extrude_amount = 2.0;
    vec4 extrude_distance = vec4(extrude_amount) * clip_edge_mask;
    local_segment_rect.p0 -= extrude_distance.xy;
    local_segment_rect.size += extrude_distance.xy + extrude_distance.zw;

    // Select the corner of the local rect that we are processing.
    vec2 local_pos = local_segment_rect.p0 + local_segment_rect.size * aPosition.xy;

    // Convert the world positions to device pixel space.
    vec2 task_offset = task.common_data.task_rect.p0 - task.content_origin;

    // Transform the current vertex to the world cpace.
    vec4 world_pos = transform.m * vec4(local_pos, 0.0, 1.0);
    vec4 final_pos = vec4(
        world_pos.xy * task.device_pixel_scale + task_offset * world_pos.w,
        z * world_pos.w,
        world_pos.w
    );

    gl_Position = uTransform * final_pos;

    init_transform_vs(mix(
        vec4(prim_rect.p0, prim_rect.p1),
        vec4(segment_rect.p0, segment_rect.p1),
        clip_edge_mask
    ));

    VertexInfo vi = VertexInfo(
        local_pos,
        world_pos
    );

    return vi;
}

void write_clip(vec4 world_pos, ClipArea area) {
    vec2 uv = world_pos.xy * area.device_pixel_scale +
        world_pos.w * (area.common_data.task_rect.p0 - area.screen_origin);
    vClipMaskUvBounds = vec4(
        area.common_data.task_rect.p0,
        area.common_data.task_rect.p0 + area.common_data.task_rect.size
    );
    vClipMaskUv = vec4(uv, area.common_data.texture_layer_index, world_pos.w);
}

// Read the exta image data containing the homogeneous screen space coordinates
// of the corners, interpolate between them, and return real screen space UV.
vec2 get_image_quad_uv(int address, vec2 f) {
    ImageResourceExtra extra_data = fetch_image_resource_extra(address);
    vec4 x = mix(extra_data.st_tl, extra_data.st_tr, f.x);
    vec4 y = mix(extra_data.st_bl, extra_data.st_br, f.x);
    vec4 z = mix(x, y, f.y);
    return z.xy / z.w;
}
#endif //WR_VERTEX_SHADER

#ifdef WR_FRAGMENT_SHADER

struct Fragment {
    vec4 color;
#ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
    vec4 blend;
#endif
};


float do_clip() {
    // check for the dummy bounds, which are given to the opaque objects
    if (vClipMaskUvBounds.xy == vClipMaskUvBounds.zw) {
        return 1.0;
    }
    // anything outside of the mask is considered transparent
    //Note: we assume gl_FragCoord.w == interpolated(1 / vClipMaskUv.w)
    vec2 mask_uv = vClipMaskUv.xy * gl_FragCoord.w;
    bvec2 left = lessThanEqual(vClipMaskUvBounds.xy, mask_uv); // inclusive
    bvec2 right = greaterThan(vClipMaskUvBounds.zw, mask_uv); // non-inclusive
    // bail out if the pixel is outside the valid bounds
    if (!all(bvec4(left, right))) {
        return 0.0;
    }
    // finally, the slow path - fetch the mask value from an image
    // Note the Z getting rounded to the nearest integer because the variable
    // is still interpolated and becomes a subject of precision-caused
    // fluctuations, see https://bugzilla.mozilla.org/show_bug.cgi?id=1491911
    ivec3 tc = ivec3(mask_uv, vClipMaskUv.z + 0.5);
    return texelFetch(sPrevPassAlpha, tc, 0).r;
}

#ifdef WR_FEATURE_DITHERING
vec4 dither(vec4 color) {
    const int matrix_mask = 7;

    ivec2 pos = ivec2(gl_FragCoord.xy) & ivec2(matrix_mask);
    float noise_normalized = (texelFetch(sDither, pos, 0).r * 255.0 + 0.5) / 64.0;
    float noise = (noise_normalized - 0.5) / 256.0; // scale down to the unit length

    return color + vec4(noise, noise, noise, 0);
}
#else
vec4 dither(vec4 color) {
    return color;
}
#endif //WR_FEATURE_DITHERING

vec4 sample_gradient(HIGHP_FS_ADDRESS int address, float offset, float gradient_repeat) {
    // Modulo the offset if the gradient repeats.
    float x = mix(offset, fract(offset), gradient_repeat);

    // Calculate the color entry index to use for this offset:
    //     offsets < 0 use the first color entry, 0
    //     offsets from [0, 1) use the color entries in the range of [1, N-1)
    //     offsets >= 1 use the last color entry, N-1
    //     so transform the range [0, 1) -> [1, N-1)

    // TODO(gw): In the future we might consider making the size of the
    // LUT vary based on number / distribution of stops in the gradient.
    const int GRADIENT_ENTRIES = 128;
    x = 1.0 + x * float(GRADIENT_ENTRIES);

    // Calculate the texel to index into the gradient color entries:
    //     floor(x) is the gradient color entry index
    //     fract(x) is the linear filtering factor between start and end
    int lut_offset = 2 * int(floor(x));     // There is a [start, end] color per entry.

    // Ensure we don't fetch outside the valid range of the LUT.
    lut_offset = clamp(lut_offset, 0, 2 * (GRADIENT_ENTRIES + 1));

    // Fetch the start and end color.
    vec4 texels[2] = fetch_from_gpu_cache_2(address + lut_offset);

    // Finally interpolate and apply dithering
    return dither(mix(texels[0], texels[1], fract(x)));
}

#endif //WR_FRAGMENT_SHADER
1f96f19c343d2f7b5aeca8dd23535ac2ee80b23fdc5d33980684f6f95b375c3dprim_shared/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,prim_shared

// interpolated UV coordinates to sample.
varying vec2 vUv;
// X = layer index to sample, Y = flag to allow perspective interpolation of UV.
flat varying vec2 vLayerAndPerspective;
flat varying vec4 vUvSampleBounds;

#ifdef WR_VERTEX_SHADER
struct SplitGeometry {
    vec2 local[4];
};

SplitGeometry fetch_split_geometry(int address) {
    ivec2 uv = get_gpu_cache_uv(address);

    vec4 data0 = TEXEL_FETCH(sGpuCache, uv, 0, ivec2(0, 0));
    vec4 data1 = TEXEL_FETCH(sGpuCache, uv, 0, ivec2(1, 0));

    SplitGeometry geo;
    geo.local = vec2[4](
        data0.xy,
        data0.zw,
        data1.xy,
        data1.zw
    );

    return geo;
}

vec2 bilerp(vec2 a, vec2 b, vec2 c, vec2 d, float s, float t) {
    vec2 x = mix(a, b, t);
    vec2 y = mix(c, d, t);
    return mix(x, y, s);
}

struct SplitCompositeInstance {
    int prim_header_index;
    int polygons_address;
    float z;
    int render_task_index;
};

SplitCompositeInstance fetch_composite_instance() {
    SplitCompositeInstance ci;

    ci.prim_header_index = aData.x;
    ci.polygons_address = aData.y;
    ci.z = float(aData.z);
    ci.render_task_index = aData.w;

    return ci;
}

void main(void) {
    SplitCompositeInstance ci = fetch_composite_instance();
    SplitGeometry geometry = fetch_split_geometry(ci.polygons_address);
    PrimitiveHeader ph = fetch_prim_header(ci.prim_header_index);
    PictureTask dest_task = fetch_picture_task(ci.render_task_index);
    Transform transform = fetch_transform(ph.transform_id);
    ImageResource res = fetch_image_resource(ph.user_data.x);
    ClipArea clip_area = fetch_clip_area(ph.user_data.w);

    vec2 dest_origin = dest_task.common_data.task_rect.p0 -
                       dest_task.content_origin;

    vec2 local_pos = bilerp(geometry.local[0], geometry.local[1],
                            geometry.local[3], geometry.local[2],
                            aPosition.y, aPosition.x);
    vec4 world_pos = transform.m * vec4(local_pos, 0.0, 1.0);

    vec4 final_pos = vec4(
        dest_origin * world_pos.w + world_pos.xy * dest_task.device_pixel_scale,
        world_pos.w * ci.z,
        world_pos.w
    );

    write_clip(
        world_pos,
        clip_area
    );

    gl_Position = uTransform * final_pos;

    vec2 texture_size = vec2(textureSize(sPrevPassColor, 0));
    vec2 uv0 = res.uv_rect.p0;
    vec2 uv1 = res.uv_rect.p1;

    vec2 min_uv = min(uv0, uv1);
    vec2 max_uv = max(uv0, uv1);

    vUvSampleBounds = vec4(
        min_uv + vec2(0.5),
        max_uv - vec2(0.5)
    ) / texture_size.xyxy;

    vec2 f = (local_pos - ph.local_rect.p0) / ph.local_rect.size;
    f = get_image_quad_uv(ph.user_data.x, f);
    vec2 uv = mix(uv0, uv1, f);
    float perspective_interpolate = float(ph.user_data.y);

    vUv = uv / texture_size * mix(gl_Position.w, 1.0, perspective_interpolate);
    vLayerAndPerspective = vec2(res.layer, perspective_interpolate);
}
#endif

#ifdef WR_FRAGMENT_SHADER
void main(void) {
    float alpha = do_clip();
    float perspective_divisor = mix(gl_FragCoord.w, 1.0, vLayerAndPerspective.y);
    vec2 uv = clamp(vUv * perspective_divisor, vUvSampleBounds.xy, vUvSampleBounds.zw);
    write_output(alpha * textureLod(sPrevPassColor, vec3(uv, vLayerAndPerspective.x), 0.0));
}
#endif
36821b7ada490a8eab32730fc86f20b43ac8fcdb4ae40b501867ed09ce9bd6a7ps_split_composite/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared,prim_shared

// A few varying slots for the brushes to use.
// Using these instead of adding dedicated varyings avoids using a high
// number of varyings in the multi-brush shader.
//
// TODO: This is duplicated from the brush shader code and will be merged
//       back once text runs use the brush infrastructure.
flat varying vec4 flat_varying_vec4_0;
flat varying vec4 flat_varying_vec4_1;
flat varying vec4 flat_varying_vec4_2;
varying vec4 varying_vec4_0;
varying vec4 varying_vec4_1;

#define V_COLOR             flat_varying_vec4_0
#define V_MASK_SWIZZLE      flat_varying_vec4_1.xy
// Normalized bounds of the source image in the texture.
#define V_UV_BOUNDS         flat_varying_vec4_2

// Interpolated UV coordinates to sample.
#define V_UV                varying_vec4_0.xy
#define V_LAYER             varying_vec4_0.z


#ifdef WR_FEATURE_GLYPH_TRANSFORM
#define V_UV_CLIP           varying_vec4_1
#endif

#ifdef WR_VERTEX_SHADER

#define VECS_PER_TEXT_RUN           2
#define GLYPHS_PER_GPU_BLOCK        2U

#ifdef WR_FEATURE_GLYPH_TRANSFORM
RectWithSize transform_rect(RectWithSize rect, mat2 transform) {
    vec2 center = transform * (rect.p0 + rect.size * 0.5);
    vec2 radius = mat2(abs(transform[0]), abs(transform[1])) * (rect.size * 0.5);
    return RectWithSize(center - radius, radius * 2.0);
}

bool rect_inside_rect(RectWithSize little, RectWithSize big) {
    return all(lessThanEqual(vec4(big.p0, little.p0 + little.size),
                             vec4(little.p0, big.p0 + big.size)));
}
#endif //WR_FEATURE_GLYPH_TRANSFORM

struct Glyph {
    vec2 offset;
};

Glyph fetch_glyph(int specific_prim_address,
                  int glyph_index) {
    // Two glyphs are packed in each texel in the GPU cache.
    int glyph_address = specific_prim_address +
                        VECS_PER_TEXT_RUN +
                        int(uint(glyph_index) / GLYPHS_PER_GPU_BLOCK);
    vec4 data = fetch_from_gpu_cache_1(glyph_address);
    // Select XY or ZW based on glyph index.
    // We use "!= 0" instead of "== 1" here in order to work around a driver
    // bug with equality comparisons on integers.
    vec2 glyph = mix(data.xy, data.zw,
                     bvec2(uint(glyph_index) % GLYPHS_PER_GPU_BLOCK != 0U));

    return Glyph(glyph);
}

struct GlyphResource {
    vec4 uv_rect;
    float layer;
    vec2 offset;
    float scale;
};

GlyphResource fetch_glyph_resource(int address) {
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    return GlyphResource(data[0], data[1].x, data[1].yz, data[1].w);
}

struct TextRun {
    vec4 color;
    vec4 bg_color;
};

TextRun fetch_text_run(int address) {
    vec4 data[2] = fetch_from_gpu_cache_2(address);
    return TextRun(data[0], data[1]);
}

vec2 get_snap_bias(int subpx_dir) {
    // In subpixel mode, the subpixel offset has already been
    // accounted for while rasterizing the glyph. However, we
    // must still round with a subpixel bias rather than rounding
    // to the nearest whole pixel, depending on subpixel direciton.
    switch (subpx_dir) {
        case SUBPX_DIR_NONE:
        default:
            return vec2(0.5);
        case SUBPX_DIR_HORIZONTAL:
            // Glyphs positioned [-0.125, 0.125] get a
            // subpx position of zero. So include that
            // offset in the glyph position to ensure
            // we round to the correct whole position.
            return vec2(0.125, 0.5);
        case SUBPX_DIR_VERTICAL:
            return vec2(0.5, 0.125);
        case SUBPX_DIR_MIXED:
            return vec2(0.125);
    }
}

void main(void) {
    Instance instance = decode_instance_attributes();

    int glyph_index = instance.segment_index;
    int subpx_dir = (instance.flags >> 8) & 0xff;
    int color_mode = instance.flags & 0xff;

    PrimitiveHeader ph = fetch_prim_header(instance.prim_header_address);
    Transform transform = fetch_transform(ph.transform_id);
    ClipArea clip_area = fetch_clip_area(instance.clip_address);
    PictureTask task = fetch_picture_task(instance.picture_task_address);

    // Note that the reference frame relative offset is stored in the prim local
    // rect size during batching, instead of the actual size of the primitive.
    TextRun text = fetch_text_run(ph.specific_prim_address);
    vec2 text_offset = ph.local_rect.size;

    if (color_mode == COLOR_MODE_FROM_PASS) {
        color_mode = uMode;
    }

    // Note that the unsnapped reference frame relative offset has already
    // been subtracted from the prim local rect origin during batching.
    // It was done this way to avoid pushing both the snapped and the
    // unsnapped offsets to the shader.
    Glyph glyph = fetch_glyph(ph.specific_prim_address, glyph_index);
    glyph.offset += ph.local_rect.p0;

    GlyphResource res = fetch_glyph_resource(instance.resource_address);

    vec2 snap_bias = get_snap_bias(subpx_dir);

    // Glyph space refers to the pixel space used by glyph rasterization during frame
    // building. If a non-identity transform was used, WR_FEATURE_GLYPH_TRANSFORM will
    // be set. Otherwise, regardless of whether the raster space is LOCAL or SCREEN,
    // we ignored the transform during glyph rasterization, and need to snap just using
    // the device pixel scale and the raster scale.
#ifdef WR_FEATURE_GLYPH_TRANSFORM
    // Transform from local space to glyph space.
    mat2 glyph_transform = mat2(transform.m) * task.device_pixel_scale;
    vec2 glyph_translation = transform.m[3].xy * task.device_pixel_scale;

    // Transform from glyph space back to local space.
    mat2 glyph_transform_inv = inverse(glyph_transform);

    // Glyph raster pixels include the impact of the transform. This path can only be
    // entered for 3d transforms that can be coerced into a 2d transform; they have no
    // perspective, and have a 2d inverse. This is a looser condition than axis aligned
    // transforms because it also allows 2d rotations.
    vec2 raster_glyph_offset = floor(glyph_transform * glyph.offset + snap_bias);

    // We want to eliminate any subpixel translation in device space to ensure glyph
    // snapping is stable for equivalent glyph subpixel positions. Note that we must take
    // into account the translation from the transform for snapping purposes.
    vec2 raster_text_offset = floor(glyph_transform * text_offset + glyph_translation + 0.5) - glyph_translation;

    // Compute the glyph rect in glyph space.
    RectWithSize glyph_rect = RectWithSize(res.offset + raster_glyph_offset + raster_text_offset,
                                           res.uv_rect.zw - res.uv_rect.xy);

    // The glyph rect is in glyph space, so transform it back to local space.
    RectWithSize local_rect = transform_rect(glyph_rect, glyph_transform_inv);

    // Select the corner of the glyph's local space rect that we are processing.
    vec2 local_pos = local_rect.p0 + local_rect.size * aPosition.xy;

    // If the glyph's local rect would fit inside the local clip rect, then select a corner from
    // the device space glyph rect to reduce overdraw of clipped pixels in the fragment shader.
    // Otherwise, fall back to clamping the glyph's local rect to the local clip rect.
    if (rect_inside_rect(local_rect, ph.local_clip_rect)) {
        local_pos = glyph_transform_inv * (glyph_rect.p0 + glyph_rect.size * aPosition.xy);
    }
#else
    float raster_scale = float(ph.user_data.x) / 65535.0;

    // Scale in which the glyph is snapped when rasterized.
    float glyph_raster_scale = raster_scale * task.device_pixel_scale;

    // Scale from glyph space to local space.
    float glyph_scale_inv = res.scale / glyph_raster_scale;

    // Glyph raster pixels do not include the impact of the transform. Instead it was
    // replaced with an identity transform during glyph rasterization. As such only the
    // impact of the raster scale (if in local space) and the device pixel scale (for both
    // local and screen space) are included.
    //
    // This implies one or more of the following conditions:
    // - The transform is an identity. In that case, setting WR_FEATURE_GLYPH_TRANSFORM
    //   should have the same output result as not. We just distingush which path to use
    //   based on the transform used during glyph rasterization. (Screen space).
    // - The transform contains an animation. We will imply local raster space in such
    //   cases to avoid constantly rerasterizing the glyphs.
    // - The transform has perspective or does not have a 2d inverse (Screen or local space).
    // - The transform's scale will result in result in very large rasterized glyphs and
    //   we clamped the size. This will imply local raster space.
    vec2 raster_glyph_offset = floor(glyph.offset * glyph_raster_scale + snap_bias) / res.scale;

    // Compute the glyph rect in local space.
    //
    // The transform may be animated, so we don't want to do any snapping here for the
    // text offset to avoid glyphs wiggling. The text offset should have been snapped
    // already for axis aligned transforms excluding any animations during frame building.
    RectWithSize glyph_rect = RectWithSize(glyph_scale_inv * (res.offset + raster_glyph_offset) + text_offset,
                                           glyph_scale_inv * (res.uv_rect.zw - res.uv_rect.xy));

    // Select the corner of the glyph rect that we are processing.
    vec2 local_pos = glyph_rect.p0 + glyph_rect.size * aPosition.xy;
#endif

    VertexInfo vi = write_vertex(
        local_pos,
        ph.local_clip_rect,
        ph.z,
        transform,
        task
    );

#ifdef WR_FEATURE_GLYPH_TRANSFORM
    vec2 f = (glyph_transform * vi.local_pos - glyph_rect.p0) / glyph_rect.size;
    V_UV_CLIP = vec4(f, 1.0 - f);
#else
    vec2 f = (vi.local_pos - glyph_rect.p0) / glyph_rect.size;
#endif

    write_clip(vi.world_pos, clip_area);

    switch (color_mode) {
        case COLOR_MODE_ALPHA:
        case COLOR_MODE_BITMAP:
            V_MASK_SWIZZLE = vec2(0.0, 1.0);
            V_COLOR = text.color;
            break;
        case COLOR_MODE_SUBPX_BG_PASS2:
        case COLOR_MODE_SUBPX_DUAL_SOURCE:
            V_MASK_SWIZZLE = vec2(1.0, 0.0);
            V_COLOR = text.color;
            break;
        case COLOR_MODE_SUBPX_CONST_COLOR:
        case COLOR_MODE_SUBPX_BG_PASS0:
        case COLOR_MODE_COLOR_BITMAP:
            V_MASK_SWIZZLE = vec2(1.0, 0.0);
            V_COLOR = vec4(text.color.a);
            break;
        case COLOR_MODE_SUBPX_BG_PASS1:
            V_MASK_SWIZZLE = vec2(-1.0, 1.0);
            V_COLOR = vec4(text.color.a) * text.bg_color;
            break;
        default:
            V_MASK_SWIZZLE = vec2(0.0);
            V_COLOR = vec4(1.0);
    }

    vec2 texture_size = vec2(textureSize(sColor0, 0));
    vec2 st0 = res.uv_rect.xy / texture_size;
    vec2 st1 = res.uv_rect.zw / texture_size;

    V_UV = mix(st0, st1, f);
    V_LAYER = res.layer;
    V_UV_BOUNDS = (res.uv_rect + vec4(0.5, 0.5, -0.5, -0.5)) / texture_size.xyxy;
}
#endif

#ifdef WR_FRAGMENT_SHADER

Fragment text_brush_fs(void) {
    Fragment frag;

    vec3 tc = vec3(clamp(V_UV, V_UV_BOUNDS.xy, V_UV_BOUNDS.zw), V_LAYER);
    vec4 mask = texture(sColor0, tc);
    mask.rgb = mask.rgb * V_MASK_SWIZZLE.x + mask.aaa * V_MASK_SWIZZLE.y;

    #ifdef WR_FEATURE_GLYPH_TRANSFORM
        mask *= float(all(greaterThanEqual(V_UV_CLIP, vec4(0.0))));
    #endif

    frag.color = V_COLOR * mask;

    #ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
        frag.blend = V_COLOR.a * mask;
    #endif

    return frag;
}

void main(void) {
    Fragment frag = text_brush_fs();

    float clip_mask = do_clip();
    frag.color *= clip_mask;

    #if defined(WR_FEATURE_DEBUG_OVERDRAW)
        oFragColor = WR_DEBUG_OVERDRAW_COLOR;
    #elif defined(WR_FEATURE_DUAL_SOURCE_BLENDING)
        oFragColor = frag.color;
        oFragBlend = frag.blend * clip_mask;
    #else
        write_output(frag.color);
    #endif
}

#endif // WR_FRAGMENT_SHADER
bafbceb2b2d97afdd52a5afb11e47c22374ad21317f7f6d3a0c5a77da1d5bc56ps_text_run/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

struct RectWithSize {
    vec2 p0;
    vec2 size;
};

struct RectWithEndpoint {
    vec2 p0;
    vec2 p1;
};

RectWithEndpoint to_rect_with_endpoint(RectWithSize rect) {
    RectWithEndpoint result;
    result.p0 = rect.p0;
    result.p1 = rect.p0 + rect.size;

    return result;
}

RectWithSize to_rect_with_size(RectWithEndpoint rect) {
    RectWithSize result;
    result.p0 = rect.p0;
    result.size = rect.p1 - rect.p0;

    return result;
}

RectWithSize intersect_rects(RectWithSize a, RectWithSize b) {
    RectWithSize result;
    result.p0 = max(a.p0, b.p0);
    result.size = min(a.p0 + a.size, b.p0 + b.size) - result.p0;

    return result;
}

float point_inside_rect(vec2 p, vec2 p0, vec2 p1) {
    vec2 s = step(p0, p) - step(p1, p);
    return s.x * s.y;
}
3b7fe6f5eebe3769d07db4d6a6fb17a4c3fb9d8c4935708457684eb224f73dd1/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */


#ifdef WR_VERTEX_SHADER
#define VECS_PER_RENDER_TASK        2U

uniform HIGHP_SAMPLER_FLOAT sampler2D sRenderTasks;

struct RenderTaskCommonData {
    RectWithSize task_rect;
    float texture_layer_index;
};

struct RenderTaskData {
    RenderTaskCommonData common_data;
    vec3 user_data;
};

RenderTaskData fetch_render_task_data(int index) {
    ivec2 uv = get_fetch_uv(index, VECS_PER_RENDER_TASK);

    vec4 texel0 = TEXEL_FETCH(sRenderTasks, uv, 0, ivec2(0, 0));
    vec4 texel1 = TEXEL_FETCH(sRenderTasks, uv, 0, ivec2(1, 0));

    RectWithSize task_rect = RectWithSize(
        texel0.xy,
        texel0.zw
    );

    RenderTaskCommonData common_data = RenderTaskCommonData(
        task_rect,
        texel1.x
    );

    RenderTaskData data = RenderTaskData(
        common_data,
        texel1.yzw
    );

    return data;
}

RenderTaskCommonData fetch_render_task_common_data(int index) {
    ivec2 uv = get_fetch_uv(index, VECS_PER_RENDER_TASK);

    vec4 texel0 = TEXEL_FETCH(sRenderTasks, uv, 0, ivec2(0, 0));
    vec4 texel1 = TEXEL_FETCH(sRenderTasks, uv, 0, ivec2(1, 0));

    RectWithSize task_rect = RectWithSize(
        texel0.xy,
        texel0.zw
    );

    RenderTaskCommonData data = RenderTaskCommonData(
        task_rect,
        texel1.x
    );

    return data;
}

#define PIC_TYPE_IMAGE          1
#define PIC_TYPE_TEXT_SHADOW    2

/*
 The dynamic picture that this brush exists on. Right now, it
 contains minimal information. In the future, it will describe
 the transform mode of primitives on this picture, among other things.
 */
struct PictureTask {
    RenderTaskCommonData common_data;
    float device_pixel_scale;
    vec2 content_origin;
};

PictureTask fetch_picture_task(int address) {
    RenderTaskData task_data = fetch_render_task_data(address);

    PictureTask task = PictureTask(
        task_data.common_data,
        task_data.user_data.x,
        task_data.user_data.yz
    );

    return task;
}

#define CLIP_TASK_EMPTY 0x7FFF

struct ClipArea {
    RenderTaskCommonData common_data;
    float device_pixel_scale;
    vec2 screen_origin;
};

ClipArea fetch_clip_area(int index) {
    ClipArea area;

    if (index >= CLIP_TASK_EMPTY) {
        RectWithSize rect = RectWithSize(vec2(0.0), vec2(0.0));

        area.common_data = RenderTaskCommonData(rect, 0.0);
        area.device_pixel_scale = 0.0;
        area.screen_origin = vec2(0.0);
    } else {
        RenderTaskData task_data = fetch_render_task_data(index);

        area.common_data = task_data.common_data;
        area.device_pixel_scale = task_data.user_data.x;
        area.screen_origin = task_data.user_data.yz;
    }

    return area;
}

#endif //WR_VERTEX_SHADER
c653b65fdc6a383f7abe89ab645656cfedb07bac8466a05b70df47572bbbf064render_task/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#ifdef WR_FEATURE_PIXEL_LOCAL_STORAGE
// For now, we need both extensions here, in order to initialize
// the PLS to the current framebuffer color. In future, we can
// possibly remove that requirement, or at least support the
// other framebuffer fetch extensions that provide the same
// functionality.
#extension GL_EXT_shader_pixel_local_storage : require
#extension GL_ARM_shader_framebuffer_fetch : require
#endif

#ifdef WR_FEATURE_TEXTURE_EXTERNAL
// Please check https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image_external_essl3.txt
// for this extension.
#extension GL_OES_EGL_image_external_essl3 : require
#endif

#ifdef WR_FEATURE_ADVANCED_BLEND
#extension GL_KHR_blend_equation_advanced : require
#endif

#ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
#ifdef GL_ES
#extension GL_EXT_blend_func_extended : require
#else
#extension GL_ARB_explicit_attrib_location : require
#endif
#endif

#include base

#if defined(WR_FEATURE_TEXTURE_EXTERNAL) || defined(WR_FEATURE_TEXTURE_RECT) || defined(WR_FEATURE_TEXTURE_2D)
#define TEX_SAMPLE(sampler, tex_coord) texture(sampler, tex_coord.xy)
#else
#define TEX_SAMPLE(sampler, tex_coord) texture(sampler, tex_coord)
#endif

//======================================================================================
// Vertex shader attributes and uniforms
//======================================================================================
#ifdef WR_VERTEX_SHADER
    // A generic uniform that shaders can optionally use to configure
    // an operation mode for this batch.
    uniform int uMode;

    // Uniform inputs
    uniform mat4 uTransform;       // Orthographic projection

    // Attribute inputs
    in vec3 aPosition;

    // get_fetch_uv is a macro to work around a macOS Intel driver parsing bug.
    // TODO: convert back to a function once the driver issues are resolved, if ever.
    // https://github.com/servo/webrender/pull/623
    // https://github.com/servo/servo/issues/13953
    // Do the division with unsigned ints because that's more efficient with D3D
    #define get_fetch_uv(i, vpi)  ivec2(int(vpi * (uint(i) % (WR_MAX_VERTEX_TEXTURE_WIDTH/vpi))), int(uint(i) / (WR_MAX_VERTEX_TEXTURE_WIDTH/vpi)))
#endif

//======================================================================================
// Fragment shader attributes and uniforms
//======================================================================================
#ifdef WR_FRAGMENT_SHADER
    // Uniform inputs

    #ifdef WR_FEATURE_PIXEL_LOCAL_STORAGE
        // Define the storage class of the pixel local storage.
        // If defined as writable, it's a compile time error to
        // have a normal fragment output variable declared.
        #if defined(PLS_READONLY)
            #define PLS_BLOCK __pixel_local_inEXT
        #elif defined(PLS_WRITEONLY)
            #define PLS_BLOCK __pixel_local_outEXT
        #else
            #define PLS_BLOCK __pixel_localEXT
        #endif

        // The structure of pixel local storage. Right now, it's
        // just the current framebuffer color. In future, we have
        // (at least) 12 bytes of space we can store extra info
        // here (such as clip mask values).
        PLS_BLOCK FrameBuffer {
            layout(rgba8) highp vec4 color;
        } PLS;

        #ifndef PLS_READONLY
        // Write the output of a fragment shader to PLS. Applies
        // premultipled alpha blending by default, since the blender
        // is disabled when PLS is active.
        // TODO(gw): Properly support alpha blend mode for webgl / canvas.
        void write_output(vec4 color) {
            PLS.color = color + PLS.color * (1.0 - color.a);
        }

        // Write a raw value straight to PLS, if the fragment shader has
        // already applied blending.
        void write_output_raw(vec4 color) {
            PLS.color = color;
        }
        #endif

        #ifndef PLS_WRITEONLY
        // Retrieve the current framebuffer color. Useful in conjunction with
        // the write_output_raw function.
        vec4 get_current_framebuffer_color() {
            return PLS.color;
        }
        #endif
    #else
        // Fragment shader outputs
        #ifdef WR_FEATURE_ADVANCED_BLEND
            layout(blend_support_all_equations) out;
        #endif

        #ifdef WR_FEATURE_DUAL_SOURCE_BLENDING
            layout(location = 0, index = 0) out vec4 oFragColor;
            layout(location = 0, index = 1) out vec4 oFragBlend;
        #else
            out vec4 oFragColor;
        #endif

        // Write an output color in normal (non-PLS) shaders.
        void write_output(vec4 color) {
            oFragColor = color;
        }
    #endif

    #define EPSILON                     0.0001

    // "Show Overdraw" color. Premultiplied.
    #define WR_DEBUG_OVERDRAW_COLOR     vec4(0.110, 0.077, 0.027, 0.125)

    float distance_to_line(vec2 p0, vec2 perp_dir, vec2 p) {
        vec2 dir_to_p0 = p0 - p;
        return dot(normalize(perp_dir), dir_to_p0);
    }

    /// Find the appropriate half range to apply the AA approximation over.
    /// This range represents a coefficient to go from one CSS pixel to half a device pixel.
    float compute_aa_range(vec2 position) {
        // The constant factor is chosen to compensate for the fact that length(fw) is equal
        // to sqrt(2) times the device pixel ratio in the typical case. 0.5/sqrt(2) = 0.35355.
        //
        // This coefficient is chosen to ensure that any sample 0.5 pixels or more inside of
        // the shape has no anti-aliasing applied to it (since pixels are sampled at their center,
        // such a pixel (axis aligned) is fully inside the border). We need this so that antialiased
        // curves properly connect with non-antialiased vertical or horizontal lines, among other things.
        //
        // Lines over a half-pixel away from the pixel center *can* intersect with the pixel square;
        // indeed, unless they are horizontal or vertical, they are guaranteed to. However, choosing
        // a nonzero area for such pixels causes noticeable artifacts at the junction between an anti-
        // aliased corner and a straight edge.
        //
        // We may want to adjust this constant in specific scenarios (for example keep the principled
        // value for straight edges where we want pixel-perfect equivalence with non antialiased lines
        // when axis aligned, while selecting a larger and smoother aa range on curves).
        return 0.35355 * length(fwidth(position));
    }

    /// Return the blending coefficient for distance antialiasing.
    ///
    /// 0.0 means inside the shape, 1.0 means outside.
    ///
    /// This cubic polynomial approximates the area of a 1x1 pixel square under a
    /// line, given the signed Euclidean distance from the center of the square to
    /// that line. Calculating the *exact* area would require taking into account
    /// not only this distance but also the angle of the line. However, in
    /// practice, this complexity is not required, as the area is roughly the same
    /// regardless of the angle.
    ///
    /// The coefficients of this polynomial were determined through least-squares
    /// regression and are accurate to within 2.16% of the total area of the pixel
    /// square 95% of the time, with a maximum error of 3.53%.
    ///
    /// See the comments in `compute_aa_range()` for more information on the
    /// cutoff values of -0.5 and 0.5.
    float distance_aa(float aa_range, float signed_distance) {
        float dist = 0.5 * signed_distance / aa_range;
        if (dist <= -0.5 + EPSILON)
            return 1.0;
        if (dist >= 0.5 - EPSILON)
            return 0.0;
        return 0.5 + dist * (0.8431027 * dist * dist - 1.14453603);
    }

    /// Component-wise selection.
    ///
    /// The idea of using this is to ensure both potential branches are executed before
    /// selecting the result, to avoid observable timing differences based on the condition.
    ///
    /// Example usage: color = if_then_else(LessThanEqual(color, vec3(0.5)), vec3(0.0), vec3(1.0));
    ///
    /// The above example sets each component to 0.0 or 1.0 independently depending on whether
    /// their values are below or above 0.5.
    ///
    /// This is written as a macro in order to work with vectors of any dimension.
    ///
    /// Note: Some older android devices don't support mix with bvec. If we ever run into them
    /// the only option we have is to polyfill it with a branch per component.
    #define if_then_else(cond, then_branch, else_branch) mix(else_branch, then_branch, cond)
#endif

//======================================================================================
// Shared shader uniforms
//======================================================================================
#ifdef WR_FEATURE_TEXTURE_2D
uniform sampler2D sColor0;
uniform sampler2D sColor1;
uniform sampler2D sColor2;
#elif defined WR_FEATURE_TEXTURE_RECT
uniform sampler2DRect sColor0;
uniform sampler2DRect sColor1;
uniform sampler2DRect sColor2;
#elif defined WR_FEATURE_TEXTURE_EXTERNAL
uniform samplerExternalOES sColor0;
uniform samplerExternalOES sColor1;
uniform samplerExternalOES sColor2;
#else
uniform sampler2DArray sColor0;
uniform sampler2DArray sColor1;
uniform sampler2DArray sColor2;
#endif

#ifdef WR_FEATURE_DITHERING
uniform sampler2D sDither;
#endif

//======================================================================================
// Interpolator definitions
//======================================================================================

//======================================================================================
// VS only types and UBOs
//======================================================================================

//======================================================================================
// VS only functions
//======================================================================================
4298a253ab338f0227361f9d2ad09050dbcb8b4eeb69d08bd5c9ff0f12cdc813shared/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

//======================================================================================
// Vertex shader attributes and uniforms
//======================================================================================
#ifdef WR_VERTEX_SHADER
#endif

//======================================================================================
// Fragment shader attributes and uniforms
//======================================================================================
#ifdef WR_FRAGMENT_SHADER
#endif

//======================================================================================
// Interpolator definitions
//======================================================================================

//======================================================================================
// VS only types and UBOs
//======================================================================================

//======================================================================================
// VS only functions
//======================================================================================

//======================================================================================
// FS only functions
//======================================================================================
#ifdef WR_FRAGMENT_SHADER
#endif
b1afc12d0e8af7460547f9e79cb475ce62ff0bf6ba9f0f2851450b67a585fd88shared_other/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

flat varying vec4 vTransformBounds;

#ifdef WR_VERTEX_SHADER

#define VECS_PER_TRANSFORM   8U
uniform HIGHP_SAMPLER_FLOAT sampler2D sTransformPalette;

void init_transform_vs(vec4 local_bounds) {
    vTransformBounds = local_bounds;
}

struct Transform {
    mat4 m;
    mat4 inv_m;
    bool is_axis_aligned;
};

Transform fetch_transform(int id) {
    Transform transform;

    transform.is_axis_aligned = (id >> 24) == 0;
    int index = id & 0x00ffffff;

    // Create a UV base coord for each 8 texels.
    // This is required because trying to use an offset
    // of more than 8 texels doesn't work on some versions
    // of macOS.
    ivec2 uv = get_fetch_uv(index, VECS_PER_TRANSFORM);
    ivec2 uv0 = ivec2(uv.x + 0, uv.y);

    transform.m[0] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(0, 0));
    transform.m[1] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(1, 0));
    transform.m[2] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(2, 0));
    transform.m[3] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(3, 0));

    transform.inv_m[0] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(4, 0));
    transform.inv_m[1] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(5, 0));
    transform.inv_m[2] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(6, 0));
    transform.inv_m[3] = TEXEL_FETCH(sTransformPalette, uv0, 0, ivec2(7, 0));

    return transform;
}

// Return the intersection of the plane (set up by "normal" and "point")
// with the ray (set up by "ray_origin" and "ray_dir"),
// writing the resulting scaler into "t".
bool ray_plane(vec3 normal, vec3 pt, vec3 ray_origin, vec3 ray_dir, out float t)
{
    float denom = dot(normal, ray_dir);
    if (abs(denom) > 1e-6) {
        vec3 d = pt - ray_origin;
        t = dot(d, normal) / denom;
        return t >= 0.0;
    }

    return false;
}

// Apply the inverse transform "inv_transform"
// to the reference point "ref" in CSS space,
// producing a local point on a Transform plane,
// set by a base point "a" and a normal "n".
vec4 untransform(vec2 ref, vec3 n, vec3 a, mat4 inv_transform) {
    vec3 p = vec3(ref, -10000.0);
    vec3 d = vec3(0, 0, 1.0);

    float t = 0.0;
    // get an intersection of the Transform plane with Z axis vector,
    // originated from the "ref" point
    ray_plane(n, a, p, d, t);
    float z = p.z + d.z * t; // Z of the visible point on the Transform

    vec4 r = inv_transform * vec4(ref, z, 1.0);
    return r;
}

// Given a CSS space position, transform it back into the Transform space.
vec4 get_node_pos(vec2 pos, Transform transform) {
    // get a point on the scroll node plane
    vec4 ah = transform.m * vec4(0.0, 0.0, 0.0, 1.0);
    vec3 a = ah.xyz / ah.w;

    // get the normal to the scroll node plane
    vec3 n = transpose(mat3(transform.inv_m)) * vec3(0.0, 0.0, 1.0);
    return untransform(pos, n, a, transform.inv_m);
}

#endif //WR_VERTEX_SHADER

#ifdef WR_FRAGMENT_SHADER

float signed_distance_rect(vec2 pos, vec2 p0, vec2 p1) {
    vec2 d = max(p0 - pos, pos - p1);
    return length(max(vec2(0.0), d)) + min(0.0, max(d.x, d.y));
}

float init_transform_fs(vec2 local_pos) {
    // Get signed distance from local rect bounds.
    float d = signed_distance_rect(
        local_pos,
        vTransformBounds.xy,
        vTransformBounds.zw
    );

    // Find the appropriate distance to apply the AA smoothstep over.
    float aa_range = compute_aa_range(local_pos);

    // Only apply AA to fragments outside the signed distance field.
    return distance_aa(aa_range, d);
}

float init_transform_rough_fs(vec2 local_pos) {
    return point_inside_rect(
        local_pos,
        vTransformBounds.xy,
        vTransformBounds.zw
    );
}

#endif //WR_FRAGMENT_SHADER
968348e73996387fd59fc1272feaec4e24b2e4a72807a6130964a6d16aeeef4e/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include shared

#define YUV_FORMAT_NV12             0
#define YUV_FORMAT_PLANAR           1
#define YUV_FORMAT_INTERLEAVED      2

#ifdef WR_VERTEX_SHADER

#ifdef WR_FEATURE_TEXTURE_RECT
    #define TEX_SIZE(sampler) vec2(1.0)
#else
    #define TEX_SIZE(sampler) vec2(textureSize(sampler, 0).xy)
#endif

#define YUV_COLOR_SPACE_REC601      0
#define YUV_COLOR_SPACE_REC709      1
#define YUV_COLOR_SPACE_REC2020     2

// The constants added to the Y, U and V components are applied in the fragment shader.

// From Rec601:
// [R]   [1.1643835616438356,  0.0,                 1.5960267857142858   ]   [Y -  16]
// [G] = [1.1643835616438358, -0.3917622900949137, -0.8129676472377708   ] x [U - 128]
// [B]   [1.1643835616438356,  2.017232142857143,   8.862867620416422e-17]   [V - 128]
//
// For the range [0,1] instead of [0,255].
//
// The matrix is stored in column-major.
const mat3 YuvColorMatrixRec601 = mat3(
    1.16438,  1.16438, 1.16438,
    0.0,     -0.39176, 2.01723,
    1.59603, -0.81297, 0.0
);

// From Rec709:
// [R]   [1.1643835616438356,  0.0,                    1.7927410714285714]   [Y -  16]
// [G] = [1.1643835616438358, -0.21324861427372963,   -0.532909328559444 ] x [U - 128]
// [B]   [1.1643835616438356,  2.1124017857142854,     0.0               ]   [V - 128]
//
// For the range [0,1] instead of [0,255]:
//
// The matrix is stored in column-major.
const mat3 YuvColorMatrixRec709 = mat3(
    1.16438,  1.16438,  1.16438,
    0.0    , -0.21325,  2.11240,
    1.79274, -0.53291,  0.0
);

// From Re2020:
// [R]   [1.16438356164384,  0.0,                    1.678674107142860 ]   [Y -  16]
// [G] = [1.16438356164384, -0.187326104219343,     -0.650424318505057 ] x [U - 128]
// [B]   [1.16438356164384,  2.14177232142857,       0.0               ]   [V - 128]
//
// For the range [0,1] instead of [0,255]:
//
// The matrix is stored in column-major.
const mat3 YuvColorMatrixRec2020 = mat3(
    1.16438356164384 ,  1.164383561643840,  1.16438356164384,
    0.0              , -0.187326104219343,  2.14177232142857,
    1.67867410714286 , -0.650424318505057,  0.0
);

mat3 get_yuv_color_matrix(int color_space) {
    switch (color_space) {
        case YUV_COLOR_SPACE_REC601:
            return YuvColorMatrixRec601;
        case YUV_COLOR_SPACE_REC709:
            return YuvColorMatrixRec709;
        default:
            return YuvColorMatrixRec2020;
    }
}

void write_uv_rect(
    vec2 uv0,
    vec2 uv1,
    float layer,
    vec2 f,
    vec2 texture_size,
    out vec3 uv,
    out vec4 uv_bounds
) {
    uv.xy = mix(uv0, uv1, f);
    uv.z = layer;

    uv_bounds = vec4(uv0 + vec2(0.5), uv1 - vec2(0.5));

    #ifndef WR_FEATURE_TEXTURE_RECT
        uv.xy /= texture_size;
        uv_bounds /= texture_size.xyxy;
    #endif
}
#endif

#ifdef WR_FRAGMENT_SHADER

vec4 sample_yuv(
    int format,
    mat3 yuv_color_matrix,
    float coefficient,
    vec3 in_uv_y,
    vec3 in_uv_u,
    vec3 in_uv_v,
    vec4 uv_bounds_y,
    vec4 uv_bounds_u,
    vec4 uv_bounds_v
) {
    vec3 yuv_value;

    switch (format) {
        case YUV_FORMAT_PLANAR:
            {
                // The yuv_planar format should have this third texture coordinate.
                vec2 uv_y = clamp(in_uv_y.xy, uv_bounds_y.xy, uv_bounds_y.zw);
                vec2 uv_u = clamp(in_uv_u.xy, uv_bounds_u.xy, uv_bounds_u.zw);
                vec2 uv_v = clamp(in_uv_v.xy, uv_bounds_v.xy, uv_bounds_v.zw);
                yuv_value.x = TEX_SAMPLE(sColor0, vec3(uv_y, in_uv_y.z)).r;
                yuv_value.y = TEX_SAMPLE(sColor1, vec3(uv_u, in_uv_u.z)).r;
                yuv_value.z = TEX_SAMPLE(sColor2, vec3(uv_v, in_uv_v.z)).r;
            }
            break;

        case YUV_FORMAT_NV12:
            {
                vec2 uv_y = clamp(in_uv_y.xy, uv_bounds_y.xy, uv_bounds_y.zw);
                vec2 uv_uv = clamp(in_uv_u.xy, uv_bounds_u.xy, uv_bounds_u.zw);
                yuv_value.x = TEX_SAMPLE(sColor0, vec3(uv_y, in_uv_y.z)).r;
                yuv_value.yz = TEX_SAMPLE(sColor1, vec3(uv_uv, in_uv_u.z)).rg;
            }
            break;

        case YUV_FORMAT_INTERLEAVED:
            {
                // "The Y, Cb and Cr color channels within the 422 data are mapped into
                // the existing green, blue and red color channels."
                // https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_rgb_422.txt
                vec2 uv_y = clamp(in_uv_y.xy, uv_bounds_y.xy, uv_bounds_y.zw);
                yuv_value = TEX_SAMPLE(sColor0, vec3(uv_y, in_uv_y.z)).gbr;
            }
            break;

        default:
            yuv_value = vec3(0.0);
            break;
    }

    // See the YuvColorMatrix definition for an explanation of where the constants come from.
    vec3 rgb = yuv_color_matrix * (yuv_value * coefficient - vec3(0.06275, 0.50196, 0.50196));
    vec4 color = vec4(rgb, 1.0);

    return color;
}
#endif
3c7e77e5ac176ddec99c57e4cc47cbf7bb22ce454b0e037b1ac8731d3caab2deyuv/usr/src/rustc-1.42.0/src/libstd/sync/once.rsFailed to load a program object with a program binary:  renderer DUMMYaColorTexCoordReleasing unknown depth target allocated