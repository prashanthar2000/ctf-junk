package a.b.p;

import a.b.c;
import a.b.e;
import a.b.p.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f140b = PorterDuff.Mode.SRC_IN;
    public static j c;

    /* renamed from: a  reason: collision with root package name */
    public n0 f141a;

    public static class a implements n0.e {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f142a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f143b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light};
        public final int[] d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};
        public final int[] f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        public final ColorStateList a(Context context, int i) {
            int b2 = s0.b(context, a.b.a.colorControlHighlight);
            int a2 = s0.a(context, a.b.a.colorButtonNormal);
            return new ColorStateList(new int[][]{s0.f170b, s0.d, s0.c, s0.f}, new int[]{a2, a.f.f.a.a(b2, i), a.f.f.a.a(b2, i), i});
        }

        public final void a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f140b;
            }
            drawable.setColorFilter(j.a(i, mode));
        }

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public ColorStateList b(Context context, int i) {
            if (i == e.abc_edit_text_material) {
                return a.b.l.a.a.a(context, c.abc_tint_edittext);
            }
            if (i == e.abc_switch_track_mtrl_alpha) {
                return a.b.l.a.a.a(context, c.abc_tint_switch_track);
            }
            if (i == e.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList c2 = s0.c(context, a.b.a.colorSwitchThumbNormal);
                if (c2 == null || !c2.isStateful()) {
                    iArr[0] = s0.f170b;
                    iArr2[0] = s0.a(context, a.b.a.colorSwitchThumbNormal);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = s0.b(context, a.b.a.colorSwitchThumbNormal);
                } else {
                    iArr[0] = s0.f170b;
                    iArr2[0] = c2.getColorForState(iArr[0], 0);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = c2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == e.abc_btn_default_mtrl_shape) {
                return a(context, s0.b(context, a.b.a.colorButtonNormal));
            } else {
                if (i == e.abc_btn_borderless_material) {
                    return a(context, 0);
                }
                if (i == e.abc_btn_colored_material) {
                    return a(context, s0.b(context, a.b.a.colorAccent));
                }
                if (i == e.abc_spinner_mtrl_am_alpha || i == e.abc_spinner_textfield_background_material) {
                    return a.b.l.a.a.a(context, c.abc_tint_spinner);
                }
                if (a(this.f143b, i)) {
                    return s0.c(context, a.b.a.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return a.b.l.a.a.a(context, c.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return a.b.l.a.a.a(context, c.abc_tint_btn_checkable);
                }
                if (i == e.abc_seekbar_thumb_material) {
                    return a.b.l.a.a.a(context, c.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                b();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (j.class) {
            a2 = n0.a(i, mode);
        }
        return a2;
    }

    public static void a(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.a(drawable, v0Var, iArr);
    }

    public static synchronized void b() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.f141a = n0.a();
                c.f141a.a((n0.e) new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i) {
        return this.f141a.b(context, i);
    }

    public synchronized Drawable a(Context context, int i, boolean z) {
        return this.f141a.a(context, i, z);
    }

    public synchronized void a(Context context) {
        this.f141a.a(context);
    }

    public synchronized ColorStateList b(Context context, int i) {
        return this.f141a.c(context, i);
    }
}
