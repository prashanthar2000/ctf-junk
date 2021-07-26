package a.b.k;

import a.b.p.a1;
import a.b.p.e1;
import a.e.a.h.c;
import a.e.a.h.d;
import a.e.a.h.e;
import a.e.a.h.g;
import a.e.a.h.h;
import a.e.a.h.i;
import a.e.a.h.j;
import a.e.a.h.l;
import a.f.f.b;
import a.f.k.f;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.InflateException;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b.a.a.a.a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static Field f29a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f30b;
    public static Class<?> c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f2) {
        return !a(xmlPullParser, str) ? f2 : typedArray.getFloat(i, f2);
    }

    public static int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int a(d dVar) {
        if (dVar.e() == d.a.MATCH_CONSTRAINT) {
            int d2 = (int) (dVar.H == 0 ? ((float) dVar.d()) * dVar.G : ((float) dVar.d()) / dVar.G);
            dVar.f(d2);
            return d2;
        } else if (dVar.i() != d.a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int j = (int) (dVar.H == 1 ? ((float) dVar.j()) * dVar.G : ((float) dVar.j()) / dVar.G);
            dVar.e(j);
            return j;
        }
    }

    public static int a(d dVar, int i) {
        d dVar2;
        c cVar;
        int i2 = i * 2;
        c[] cVarArr = dVar.A;
        c cVar2 = cVarArr[i2];
        c cVar3 = cVarArr[i2 + 1];
        c cVar4 = cVar2.d;
        if (cVar4 == null || cVar4.f238b != (dVar2 = dVar.D) || (cVar = cVar3.d) == null || cVar.f238b != dVar2) {
            return 0;
        }
        return (int) (((float) (((dVar2.c(i) - cVar2.a()) - cVar3.a()) - dVar.c(i))) * (i == 0 ? dVar.V : dVar.W));
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static Keyframe a(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b2);
        return b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = a((android.content.res.Resources) r4, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r0, (android.content.res.Resources.Theme) r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ActionMode.Callback a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a.f.l.d)) ? callback : new a.f.l.d(callback, textView);
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof e1) {
                    editorInfo.hintText = ((e1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder a2 = a.a(".font");
        a2.append(Process.myPid());
        a2.append("-");
        a2.append(Process.myTid());
        a2.append("-");
        String sb = a2.toString();
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, sb + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x004b }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x004b }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003f }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x003f }
            r8.<init>(r9)     // Catch:{ all -> 0x003f }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0033 }
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            r8.close()     // Catch:{ all -> 0x003f }
            r7.close()     // Catch:{ IOException -> 0x004b }
            return r9
        L_0x0033:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch:{ all -> 0x003f }
        L_0x003e:
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r9 = move-exception
            r7.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            throw r9     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0167, code lost:
        if (r12.f0 == 2) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x016b, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ef, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x044e, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        if (r4[r10].d.f238b == r15) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014b, code lost:
        if (r12.e0 == 2) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(a.e.a.h.e r27, a.e.a.e r28, int r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = 2
            if (r2 != 0) goto L_0x000f
            int r5 = r0.s0
            a.e.a.h.b[] r6 = r0.v0
            r7 = 0
            goto L_0x0014
        L_0x000f:
            int r5 = r0.t0
            a.e.a.h.b[] r6 = r0.u0
            r7 = r3
        L_0x0014:
            r8 = 0
        L_0x0015:
            if (r8 >= r5) goto L_0x046b
            r9 = r6[r8]
            boolean r10 = r9.q
            r11 = 0
            r12 = 8
            r14 = 1
            if (r10 != 0) goto L_0x0119
            int r10 = r9.l
            int r10 = r10 * r3
            a.e.a.h.d r15 = r9.f235a
            r4 = r15
            r16 = 0
        L_0x0029:
            if (r16 != 0) goto L_0x00f9
            int r13 = r9.i
            int r13 = r13 + r14
            r9.i = r13
            a.e.a.h.d[] r13 = r15.i0
            int r14 = r9.l
            r13[r14] = r11
            a.e.a.h.d[] r13 = r15.h0
            r13[r14] = r11
            int r13 = r15.Y
            if (r13 == r12) goto L_0x00c5
            a.e.a.h.d r13 = r9.f236b
            if (r13 != 0) goto L_0x0044
            r9.f236b = r15
        L_0x0044:
            r9.d = r15
            a.e.a.h.d$a[] r13 = r15.C
            int r14 = r9.l
            r13 = r13[r14]
            a.e.a.h.d$a r11 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r13 != r11) goto L_0x00c5
            int[] r11 = r15.g
            r13 = r11[r14]
            r12 = 3
            if (r13 == 0) goto L_0x005f
            r13 = r11[r14]
            if (r13 == r12) goto L_0x005f
            r11 = r11[r14]
            if (r11 != r3) goto L_0x00c5
        L_0x005f:
            int r11 = r9.j
            r13 = 1
            int r11 = r11 + r13
            r9.j = r11
            float[] r11 = r15.g0
            int r13 = r9.l
            r14 = r11[r13]
            r17 = 0
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x0078
            float r3 = r9.k
            r11 = r11[r13]
            float r3 = r3 + r11
            r9.k = r3
        L_0x0078:
            int r3 = r9.l
            int r11 = r15.Y
            r13 = 8
            if (r11 == r13) goto L_0x0094
            a.e.a.h.d$a[] r11 = r15.C
            r11 = r11[r3]
            a.e.a.h.d$a r13 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r11 != r13) goto L_0x0094
            int[] r11 = r15.g
            r13 = r11[r3]
            if (r13 == 0) goto L_0x0092
            r3 = r11[r3]
            if (r3 != r12) goto L_0x0094
        L_0x0092:
            r3 = 1
            goto L_0x0095
        L_0x0094:
            r3 = 0
        L_0x0095:
            if (r3 == 0) goto L_0x00b3
            r3 = 0
            int r11 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a0
            r3 = 1
            r9.n = r3
            goto L_0x00a3
        L_0x00a0:
            r3 = 1
            r9.o = r3
        L_0x00a3:
            java.util.ArrayList<a.e.a.h.d> r3 = r9.h
            if (r3 != 0) goto L_0x00ae
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9.h = r3
        L_0x00ae:
            java.util.ArrayList<a.e.a.h.d> r3 = r9.h
            r3.add(r15)
        L_0x00b3:
            a.e.a.h.d r3 = r9.f
            if (r3 != 0) goto L_0x00b9
            r9.f = r15
        L_0x00b9:
            a.e.a.h.d r3 = r9.g
            if (r3 == 0) goto L_0x00c3
            a.e.a.h.d[] r3 = r3.h0
            int r11 = r9.l
            r3[r11] = r15
        L_0x00c3:
            r9.g = r15
        L_0x00c5:
            if (r4 == r15) goto L_0x00cd
            a.e.a.h.d[] r3 = r4.i0
            int r4 = r9.l
            r3[r4] = r15
        L_0x00cd:
            a.e.a.h.c[] r3 = r15.A
            int r4 = r10 + 1
            r3 = r3[r4]
            a.e.a.h.c r3 = r3.d
            if (r3 == 0) goto L_0x00e9
            a.e.a.h.d r3 = r3.f238b
            a.e.a.h.c[] r4 = r3.A
            r11 = r4[r10]
            a.e.a.h.c r11 = r11.d
            if (r11 == 0) goto L_0x00e9
            r4 = r4[r10]
            a.e.a.h.c r4 = r4.d
            a.e.a.h.d r4 = r4.f238b
            if (r4 == r15) goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            if (r3 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            r3 = r15
            r16 = 1
        L_0x00f0:
            r4 = r15
            r11 = 0
            r12 = 8
            r14 = 1
            r15 = r3
            r3 = 2
            goto L_0x0029
        L_0x00f9:
            r9.c = r15
            int r3 = r9.l
            if (r3 != 0) goto L_0x0106
            boolean r3 = r9.m
            if (r3 == 0) goto L_0x0106
            r9.e = r15
            goto L_0x010a
        L_0x0106:
            a.e.a.h.d r3 = r9.f235a
            r9.e = r3
        L_0x010a:
            boolean r3 = r9.o
            if (r3 == 0) goto L_0x0114
            boolean r3 = r9.n
            if (r3 == 0) goto L_0x0114
            r3 = 1
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            r9.p = r3
            r3 = 1
            goto L_0x011a
        L_0x0119:
            r3 = r14
        L_0x011a:
            r9.q = r3
            r3 = 4
            boolean r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0456
            a.e.a.h.d r3 = r9.f235a
            a.e.a.h.d r4 = r9.c
            a.e.a.h.d r10 = r9.f236b
            a.e.a.h.d r11 = r9.d
            a.e.a.h.d r12 = r9.e
            float r13 = r9.k
            a.e.a.h.d$a[] r14 = r0.C
            r14 = r14[r2]
            a.e.a.h.d$a r14 = a.e.a.h.d.a.WRAP_CONTENT
            if (r2 != 0) goto L_0x014e
            int r14 = r12.e0
            if (r14 != 0) goto L_0x013d
            r14 = 1
            goto L_0x013e
        L_0x013d:
            r14 = 0
        L_0x013e:
            int r15 = r12.e0
            r16 = r5
            r5 = 1
            if (r15 != r5) goto L_0x0147
            r5 = 1
            goto L_0x0148
        L_0x0147:
            r5 = 0
        L_0x0148:
            int r12 = r12.e0
            r15 = 2
            if (r12 != r15) goto L_0x016b
            goto L_0x0169
        L_0x014e:
            r16 = r5
            int r5 = r12.f0
            if (r5 != 0) goto L_0x0156
            r5 = 1
            goto L_0x0157
        L_0x0156:
            r5 = 0
        L_0x0157:
            int r14 = r12.f0
            r15 = 1
            if (r14 != r15) goto L_0x015e
            r14 = 1
            goto L_0x015f
        L_0x015e:
            r14 = 0
        L_0x015f:
            int r12 = r12.f0
            r15 = 2
            r26 = r14
            r14 = r5
            r5 = r26
            if (r12 != r15) goto L_0x016b
        L_0x0169:
            r12 = 1
            goto L_0x016c
        L_0x016b:
            r12 = 0
        L_0x016c:
            r15 = r3
            r22 = r6
            r23 = r8
            r6 = 0
            r8 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0179:
            if (r21 != 0) goto L_0x0237
            int r0 = r15.Y
            r24 = r9
            r9 = 8
            if (r0 == r9) goto L_0x01c7
            int r6 = r6 + 1
            if (r2 != 0) goto L_0x018c
            int r0 = r15.j()
            goto L_0x0190
        L_0x018c:
            int r0 = r15.d()
        L_0x0190:
            float r0 = (float) r0
            float r19 = r19 + r0
            if (r15 == r10) goto L_0x01a0
            a.e.a.h.c[] r0 = r15.A
            r0 = r0[r7]
            int r0 = r0.a()
            float r0 = (float) r0
            float r19 = r19 + r0
        L_0x01a0:
            if (r15 == r11) goto L_0x01af
            a.e.a.h.c[] r0 = r15.A
            int r9 = r7 + 1
            r0 = r0[r9]
            int r0 = r0.a()
            float r0 = (float) r0
            float r19 = r19 + r0
        L_0x01af:
            a.e.a.h.c[] r0 = r15.A
            r0 = r0[r7]
            int r0 = r0.a()
            float r0 = (float) r0
            float r20 = r20 + r0
            a.e.a.h.c[] r0 = r15.A
            int r9 = r7 + 1
            r0 = r0[r9]
            int r0 = r0.a()
            float r0 = (float) r0
            float r20 = r20 + r0
        L_0x01c7:
            a.e.a.h.c[] r0 = r15.A
            r0 = r0[r7]
            int r0 = r15.Y
            r9 = 8
            if (r0 == r9) goto L_0x0203
            a.e.a.h.d$a[] r0 = r15.C
            r0 = r0[r2]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r0 != r9) goto L_0x0203
            int r8 = r8 + 1
            if (r2 != 0) goto L_0x01eb
            int r0 = r15.e
            if (r0 == 0) goto L_0x01e2
        L_0x01e1:
            goto L_0x01ef
        L_0x01e2:
            int r0 = r15.h
            if (r0 != 0) goto L_0x01ef
            int r0 = r15.i
            if (r0 == 0) goto L_0x01fb
            goto L_0x01ef
        L_0x01eb:
            int r0 = r15.f
            if (r0 == 0) goto L_0x01f2
        L_0x01ef:
            r13 = r1
            goto L_0x044e
        L_0x01f2:
            int r0 = r15.k
            if (r0 != 0) goto L_0x01ef
            int r0 = r15.l
            if (r0 == 0) goto L_0x01fb
            goto L_0x0202
        L_0x01fb:
            float r0 = r15.G
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0203
        L_0x0202:
            goto L_0x01e1
        L_0x0203:
            a.e.a.h.c[] r0 = r15.A
            int r9 = r7 + 1
            r0 = r0[r9]
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x0225
            a.e.a.h.d r0 = r0.f238b
            a.e.a.h.c[] r9 = r0.A
            r25 = r0
            r0 = r9[r7]
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x0225
            r0 = r9[r7]
            a.e.a.h.c r0 = r0.d
            a.e.a.h.d r0 = r0.f238b
            if (r0 == r15) goto L_0x0222
            goto L_0x0225
        L_0x0222:
            r0 = r25
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            if (r0 == 0) goto L_0x022f
            r15 = r0
            r9 = r24
            r0 = r27
            goto L_0x0179
        L_0x022f:
            r21 = 1
            r0 = r27
            r9 = r24
            goto L_0x0179
        L_0x0237:
            r24 = r9
            a.e.a.h.c[] r0 = r3.A
            r0 = r0[r7]
            a.e.a.h.j r0 = r0.f237a
            a.e.a.h.c[] r9 = r4.A
            int r18 = r7 + 1
            r9 = r9[r18]
            a.e.a.h.j r9 = r9.f237a
            r21 = r3
            a.e.a.h.j r3 = r0.d
            if (r3 == 0) goto L_0x01ef
            a.e.a.h.j r1 = r9.d
            if (r1 != 0) goto L_0x0252
            goto L_0x0262
        L_0x0252:
            int r3 = r3.f249b
            r25 = r13
            r13 = 1
            if (r3 != r13) goto L_0x0262
            int r1 = r1.f249b
            if (r1 == r13) goto L_0x025e
            goto L_0x0262
        L_0x025e:
            if (r8 <= 0) goto L_0x0266
            if (r8 == r6) goto L_0x0266
        L_0x0262:
            r13 = r28
            goto L_0x044e
        L_0x0266:
            if (r12 != 0) goto L_0x026f
            if (r14 != 0) goto L_0x026f
            if (r5 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r1 = 0
            goto L_0x0288
        L_0x026f:
            if (r10 == 0) goto L_0x027b
            a.e.a.h.c[] r1 = r10.A
            r1 = r1[r7]
            int r1 = r1.a()
            float r1 = (float) r1
            goto L_0x027c
        L_0x027b:
            r1 = 0
        L_0x027c:
            if (r11 == 0) goto L_0x0288
            a.e.a.h.c[] r3 = r11.A
            r3 = r3[r18]
            int r3 = r3.a()
            float r3 = (float) r3
            float r1 = r1 + r3
        L_0x0288:
            a.e.a.h.j r3 = r0.d
            float r3 = r3.g
            a.e.a.h.j r9 = r9.d
            float r9 = r9.g
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0296
            float r9 = r9 - r3
            goto L_0x0298
        L_0x0296:
            float r9 = r3 - r9
        L_0x0298:
            float r9 = r9 - r19
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 <= 0) goto L_0x0326
            if (r8 != r6) goto L_0x0326
            a.e.a.h.d r1 = r15.D
            if (r1 == 0) goto L_0x02ad
            a.e.a.h.d$a[] r1 = r1.C
            r1 = r1[r2]
            a.e.a.h.d$a r5 = a.e.a.h.d.a.WRAP_CONTENT
            if (r1 != r5) goto L_0x02ad
            goto L_0x0262
        L_0x02ad:
            float r9 = r9 + r19
            float r9 = r9 - r20
            r1 = r3
            r3 = r21
        L_0x02b4:
            if (r3 == 0) goto L_0x0321
            a.e.a.h.d[] r5 = r3.i0
            r5 = r5[r2]
            if (r5 != 0) goto L_0x02c2
            if (r3 != r4) goto L_0x02bf
            goto L_0x02c2
        L_0x02bf:
            r13 = r28
            goto L_0x031f
        L_0x02c2:
            float r6 = (float) r8
            float r6 = r9 / r6
            r10 = 0
            int r12 = (r25 > r10 ? 1 : (r25 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x02d9
            float[] r6 = r3.g0
            r10 = r6[r2]
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x02d4
            r6 = 0
            goto L_0x02d9
        L_0x02d4:
            r6 = r6[r2]
            float r6 = r6 * r9
            float r6 = r6 / r25
        L_0x02d9:
            int r10 = r3.Y
            r12 = 8
            if (r10 != r12) goto L_0x02e0
            r6 = 0
        L_0x02e0:
            a.e.a.h.c[] r10 = r3.A
            r10 = r10[r7]
            int r10 = r10.a()
            float r10 = (float) r10
            float r1 = r1 + r10
            a.e.a.h.c[] r10 = r3.A
            r10 = r10[r7]
            a.e.a.h.j r10 = r10.f237a
            a.e.a.h.j r12 = r0.f
            r10.a((a.e.a.h.j) r12, (float) r1)
            a.e.a.h.c[] r10 = r3.A
            r10 = r10[r18]
            a.e.a.h.j r10 = r10.f237a
            a.e.a.h.j r12 = r0.f
            float r1 = r1 + r6
            r10.a((a.e.a.h.j) r12, (float) r1)
            a.e.a.h.c[] r6 = r3.A
            r6 = r6[r7]
            a.e.a.h.j r6 = r6.f237a
            r13 = r28
            r6.a((a.e.a.e) r13)
            a.e.a.h.c[] r6 = r3.A
            r6 = r6[r18]
            a.e.a.h.j r6 = r6.f237a
            r6.a((a.e.a.e) r13)
            a.e.a.h.c[] r3 = r3.A
            r3 = r3[r18]
            int r3 = r3.a()
            float r3 = (float) r3
            float r1 = r1 + r3
        L_0x031f:
            r3 = r5
            goto L_0x02b4
        L_0x0321:
            r13 = r28
            r14 = 1
            goto L_0x044f
        L_0x0326:
            r13 = r28
            r8 = 0
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0330
            r5 = 0
            r12 = 1
            r14 = 0
        L_0x0330:
            if (r12 == 0) goto L_0x0399
            float r9 = r9 - r1
            if (r2 != 0) goto L_0x033a
            r8 = r21
            float r11 = r8.V
            goto L_0x0341
        L_0x033a:
            r8 = r21
            r1 = 1
            if (r2 != r1) goto L_0x0341
            float r11 = r8.W
        L_0x0341:
            float r9 = r9 * r11
            float r9 = r9 + r3
            r3 = r8
        L_0x0344:
            if (r3 == 0) goto L_0x03a0
            a.e.a.h.d[] r1 = r3.i0
            r1 = r1[r2]
            if (r1 != 0) goto L_0x034e
            if (r3 != r4) goto L_0x0397
        L_0x034e:
            if (r2 != 0) goto L_0x0355
            int r5 = r3.j()
            goto L_0x0359
        L_0x0355:
            int r5 = r3.d()
        L_0x0359:
            float r5 = (float) r5
            a.e.a.h.c[] r6 = r3.A
            r6 = r6[r7]
            int r6 = r6.a()
            float r6 = (float) r6
            float r9 = r9 + r6
            a.e.a.h.c[] r6 = r3.A
            r6 = r6[r7]
            a.e.a.h.j r6 = r6.f237a
            a.e.a.h.j r8 = r0.f
            r6.a((a.e.a.h.j) r8, (float) r9)
            a.e.a.h.c[] r6 = r3.A
            r6 = r6[r18]
            a.e.a.h.j r6 = r6.f237a
            a.e.a.h.j r8 = r0.f
            float r9 = r9 + r5
            r6.a((a.e.a.h.j) r8, (float) r9)
            a.e.a.h.c[] r5 = r3.A
            r5 = r5[r7]
            a.e.a.h.j r5 = r5.f237a
            r5.a((a.e.a.e) r13)
            a.e.a.h.c[] r5 = r3.A
            r5 = r5[r18]
            a.e.a.h.j r5 = r5.f237a
            r5.a((a.e.a.e) r13)
            a.e.a.h.c[] r3 = r3.A
            r3 = r3[r18]
            int r3 = r3.a()
            float r3 = (float) r3
            float r9 = r9 + r3
        L_0x0397:
            r3 = r1
            goto L_0x0344
        L_0x0399:
            r8 = r21
            if (r14 != 0) goto L_0x03a3
            if (r5 == 0) goto L_0x03a0
            goto L_0x03a3
        L_0x03a0:
            r5 = 1
            goto L_0x044c
        L_0x03a3:
            if (r14 == 0) goto L_0x03a6
            goto L_0x03a8
        L_0x03a6:
            if (r5 == 0) goto L_0x03a9
        L_0x03a8:
            float r9 = r9 - r1
        L_0x03a9:
            int r1 = r6 + 1
            float r1 = (float) r1
            float r1 = r9 / r1
            if (r5 == 0) goto L_0x03bb
            r11 = 1
            if (r6 <= r11) goto L_0x03b7
            int r1 = r6 + -1
            float r1 = (float) r1
            goto L_0x03b9
        L_0x03b7:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x03b9:
            float r1 = r9 / r1
        L_0x03bb:
            int r9 = r8.Y
            r11 = 8
            if (r9 == r11) goto L_0x03c4
            float r9 = r3 + r1
            goto L_0x03c5
        L_0x03c4:
            r9 = r3
        L_0x03c5:
            if (r5 == 0) goto L_0x03d6
            r5 = 1
            if (r6 <= r5) goto L_0x03d7
            a.e.a.h.c[] r6 = r10.A
            r6 = r6[r7]
            int r6 = r6.a()
            float r6 = (float) r6
            float r9 = r6 + r3
            goto L_0x03d7
        L_0x03d6:
            r5 = 1
        L_0x03d7:
            if (r14 == 0) goto L_0x03e5
            if (r10 == 0) goto L_0x03e5
            a.e.a.h.c[] r3 = r10.A
            r3 = r3[r7]
            int r3 = r3.a()
            float r3 = (float) r3
            float r9 = r9 + r3
        L_0x03e5:
            r3 = r8
        L_0x03e6:
            if (r3 == 0) goto L_0x044c
            a.e.a.h.d[] r6 = r3.i0
            r6 = r6[r2]
            if (r6 != 0) goto L_0x03f4
            if (r3 != r4) goto L_0x03f1
            goto L_0x03f4
        L_0x03f1:
            r8 = 8
            goto L_0x044a
        L_0x03f4:
            if (r2 != 0) goto L_0x03fb
            int r8 = r3.j()
            goto L_0x03ff
        L_0x03fb:
            int r8 = r3.d()
        L_0x03ff:
            float r8 = (float) r8
            if (r3 == r10) goto L_0x040c
            a.e.a.h.c[] r11 = r3.A
            r11 = r11[r7]
            int r11 = r11.a()
            float r11 = (float) r11
            float r9 = r9 + r11
        L_0x040c:
            a.e.a.h.c[] r11 = r3.A
            r11 = r11[r7]
            a.e.a.h.j r11 = r11.f237a
            a.e.a.h.j r12 = r0.f
            r11.a((a.e.a.h.j) r12, (float) r9)
            a.e.a.h.c[] r11 = r3.A
            r11 = r11[r18]
            a.e.a.h.j r11 = r11.f237a
            a.e.a.h.j r12 = r0.f
            float r14 = r9 + r8
            r11.a((a.e.a.h.j) r12, (float) r14)
            a.e.a.h.c[] r11 = r3.A
            r11 = r11[r7]
            a.e.a.h.j r11 = r11.f237a
            r11.a((a.e.a.e) r13)
            a.e.a.h.c[] r11 = r3.A
            r11 = r11[r18]
            a.e.a.h.j r11 = r11.f237a
            r11.a((a.e.a.e) r13)
            a.e.a.h.c[] r3 = r3.A
            r3 = r3[r18]
            int r3 = r3.a()
            float r3 = (float) r3
            float r8 = r8 + r3
            float r9 = r9 + r8
            if (r6 == 0) goto L_0x03f1
            int r3 = r6.Y
            r8 = 8
            if (r3 == r8) goto L_0x044a
            float r9 = r9 + r1
        L_0x044a:
            r3 = r6
            goto L_0x03e6
        L_0x044c:
            r14 = r5
            goto L_0x044f
        L_0x044e:
            r14 = 0
        L_0x044f:
            r0 = r27
            if (r14 != 0) goto L_0x0461
            r1 = r24
            goto L_0x045e
        L_0x0456:
            r13 = r1
            r16 = r5
            r22 = r6
            r23 = r8
            r1 = r9
        L_0x045e:
            a((a.e.a.h.e) r0, (a.e.a.e) r13, (int) r2, (int) r7, (a.e.a.h.b) r1)
        L_0x0461:
            int r8 = r23 + 1
            r1 = r13
            r5 = r16
            r6 = r22
            r3 = 2
            goto L_0x0015
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(a.e.a.h.e, a.e.a.e, int):void");
    }

    public static void a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof f) {
            ((f) viewParent).a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static void a(TextView textView, int i) {
        a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void a(Object obj) {
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class<?> cls = c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
        L_0x0004:
            r3.append(r2)
            goto L_0x003d
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x0004
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static void a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3) {
        try {
            return viewParent.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        try {
            return viewParent.onNestedFling(view, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f281a != bVarArr2[i].f281a || bVarArr[i].f282b.length != bVarArr2[i].f282b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static b[] a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static Path b(String str) {
        Path path = new Path();
        b[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            b.a(a2, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(a.a("Error in parsing ", str), e2);
        }
    }

    public static String b(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void b(TextView textView, int i) {
        a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static boolean b(int i) {
        return i >= 28 && i <= 31;
    }

    public static void c(TextView textView, int i) {
        a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: a.e.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: a.e.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: a.e.a.h.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: a.e.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: a.e.a.h.d} */
    /* JADX WARNING: type inference failed for: r4v9, types: [a.e.a.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.e0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r2.f0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x03e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(a.e.a.h.e r33, a.e.a.e r34, int r35, int r36, a.e.a.h.b r37) {
        /*
            r0 = r33
            r9 = r34
            r1 = r37
            a.e.a.h.d r10 = r1.f235a
            a.e.a.h.d r11 = r1.c
            a.e.a.h.d r12 = r1.f236b
            a.e.a.h.d r13 = r1.d
            a.e.a.h.d r2 = r1.e
            float r3 = r1.k
            a.e.a.h.d$a[] r4 = r0.C
            r4 = r4[r35]
            a.e.a.h.d$a r5 = a.e.a.h.d.a.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = r7
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r35 != 0) goto L_0x0034
            int r8 = r2.e0
            if (r8 != 0) goto L_0x0027
            r8 = r7
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r14 = r2.e0
            if (r14 != r7) goto L_0x002e
            r14 = r7
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            int r15 = r2.e0
            if (r15 != r5) goto L_0x0048
            goto L_0x0046
        L_0x0034:
            int r8 = r2.f0
            if (r8 != 0) goto L_0x003a
            r8 = r7
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            int r14 = r2.f0
            if (r14 != r7) goto L_0x0041
            r14 = r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            int r15 = r2.f0
            if (r15 != r5) goto L_0x0048
        L_0x0046:
            r5 = r7
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x004d:
            r21 = 0
            if (r8 != 0) goto L_0x0120
            a.e.a.h.c[] r6 = r7.A
            r6 = r6[r36]
            if (r4 != 0) goto L_0x005d
            if (r5 == 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r23 = 4
            goto L_0x005f
        L_0x005d:
            r23 = 1
        L_0x005f:
            int r24 = r6.a()
            r25 = r3
            a.e.a.h.c r3 = r6.d
            if (r3 == 0) goto L_0x0071
            if (r7 == r10) goto L_0x0071
            int r3 = r3.a()
            int r24 = r3 + r24
        L_0x0071:
            r3 = r24
            if (r5 == 0) goto L_0x007f
            if (r7 == r10) goto L_0x007f
            if (r7 == r12) goto L_0x007f
            r24 = r8
            r23 = r15
            r8 = 6
            goto L_0x008f
        L_0x007f:
            if (r14 == 0) goto L_0x0089
            if (r4 == 0) goto L_0x0089
            r24 = r8
            r23 = r15
            r8 = 4
            goto L_0x008f
        L_0x0089:
            r24 = r8
            r8 = r23
            r23 = r15
        L_0x008f:
            a.e.a.h.c r15 = r6.d
            if (r15 == 0) goto L_0x00b8
            if (r7 != r12) goto L_0x00a2
            r26 = r14
            a.e.a.g r14 = r6.i
            a.e.a.g r15 = r15.i
            r27 = r2
            r2 = 5
            r9.b(r14, r15, r3, r2)
            goto L_0x00ae
        L_0x00a2:
            r27 = r2
            r26 = r14
            a.e.a.g r2 = r6.i
            a.e.a.g r14 = r15.i
            r15 = 6
            r9.b(r2, r14, r3, r15)
        L_0x00ae:
            a.e.a.g r2 = r6.i
            a.e.a.h.c r6 = r6.d
            a.e.a.g r6 = r6.i
            r9.a(r2, r6, r3, r8)
            goto L_0x00bc
        L_0x00b8:
            r27 = r2
            r26 = r14
        L_0x00bc:
            if (r4 == 0) goto L_0x00ef
            int r2 = r7.Y
            r3 = 8
            if (r2 == r3) goto L_0x00de
            a.e.a.h.d$a[] r2 = r7.C
            r2 = r2[r35]
            a.e.a.h.d$a r3 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00de
            a.e.a.h.c[] r2 = r7.A
            int r3 = r36 + 1
            r3 = r2[r3]
            a.e.a.g r3 = r3.i
            r2 = r2[r36]
            a.e.a.g r2 = r2.i
            r6 = 5
            r8 = 0
            r9.b(r3, r2, r8, r6)
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            a.e.a.h.c[] r2 = r7.A
            r2 = r2[r36]
            a.e.a.g r2 = r2.i
            a.e.a.h.c[] r3 = r0.A
            r3 = r3[r36]
            a.e.a.g r3 = r3.i
            r6 = 6
            r9.b(r2, r3, r8, r6)
        L_0x00ef:
            a.e.a.h.c[] r2 = r7.A
            int r3 = r36 + 1
            r2 = r2[r3]
            a.e.a.h.c r2 = r2.d
            if (r2 == 0) goto L_0x010e
            a.e.a.h.d r2 = r2.f238b
            a.e.a.h.c[] r3 = r2.A
            r6 = r3[r36]
            a.e.a.h.c r6 = r6.d
            if (r6 == 0) goto L_0x010e
            r3 = r3[r36]
            a.e.a.h.c r3 = r3.d
            a.e.a.h.d r3 = r3.f238b
            if (r3 == r7) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r21 = r2
        L_0x010e:
            if (r21 == 0) goto L_0x0115
            r7 = r21
            r8 = r24
            goto L_0x0116
        L_0x0115:
            r8 = 1
        L_0x0116:
            r15 = r23
            r3 = r25
            r14 = r26
            r2 = r27
            goto L_0x004d
        L_0x0120:
            r27 = r2
            r25 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x014a
            a.e.a.h.c[] r2 = r11.A
            int r3 = r36 + 1
            r6 = r2[r3]
            a.e.a.h.c r6 = r6.d
            if (r6 == 0) goto L_0x014a
            a.e.a.h.c[] r6 = r13.A
            r6 = r6[r3]
            a.e.a.g r7 = r6.i
            r2 = r2[r3]
            a.e.a.h.c r2 = r2.d
            a.e.a.g r2 = r2.i
            int r3 = r6.a()
            int r3 = -r3
            r6 = 5
            r9.c(r7, r2, r3, r6)
            goto L_0x014b
        L_0x014a:
            r6 = 5
        L_0x014b:
            if (r4 == 0) goto L_0x0165
            a.e.a.h.c[] r0 = r0.A
            int r2 = r36 + 1
            r0 = r0[r2]
            a.e.a.g r0 = r0.i
            a.e.a.h.c[] r3 = r11.A
            r4 = r3[r2]
            a.e.a.g r4 = r4.i
            r2 = r3[r2]
            int r2 = r2.a()
            r3 = 6
            r9.b(r0, r4, r2, r3)
        L_0x0165:
            java.util.ArrayList<a.e.a.h.d> r0 = r1.h
            if (r0 == 0) goto L_0x028d
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x028d
            boolean r4 = r1.n
            if (r4 == 0) goto L_0x017c
            boolean r4 = r1.p
            if (r4 != 0) goto L_0x017c
            int r4 = r1.j
            float r4 = (float) r4
            goto L_0x017e
        L_0x017c:
            r4 = r25
        L_0x017e:
            r7 = 0
            r15 = r7
            r14 = r21
            r8 = 0
        L_0x0183:
            if (r8 >= r2) goto L_0x028d
            java.lang.Object r16 = r0.get(r8)
            r3 = r16
            a.e.a.h.d r3 = (a.e.a.h.d) r3
            float[] r6 = r3.g0
            r6 = r6[r35]
            int r24 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r24 >= 0) goto L_0x01b9
            boolean r6 = r1.p
            if (r6 == 0) goto L_0x01b1
            a.e.a.h.c[] r3 = r3.A
            int r6 = r36 + 1
            r6 = r3[r6]
            a.e.a.g r6 = r6.i
            r3 = r3[r36]
            a.e.a.g r3 = r3.i
            r20 = r0
            r0 = 0
            r7 = 4
            r9.a(r6, r3, r0, r7)
            r24 = r7
            r6 = 6
            r7 = r0
            goto L_0x01d3
        L_0x01b1:
            r20 = r0
            r24 = 4
            r0 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01be
        L_0x01b9:
            r20 = r0
            r24 = 4
            r0 = 0
        L_0x01be:
            int r25 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r25 != 0) goto L_0x01dd
            a.e.a.h.c[] r0 = r3.A
            int r3 = r36 + 1
            r3 = r0[r3]
            a.e.a.g r3 = r3.i
            r0 = r0[r36]
            a.e.a.g r0 = r0.i
            r6 = 6
            r7 = 0
            r9.a(r3, r0, r7, r6)
        L_0x01d3:
            r29 = r2
            r33 = r4
            r17 = r6
            r30 = 0
            goto L_0x027d
        L_0x01dd:
            r0 = 0
            r17 = 6
            if (r14 == 0) goto L_0x0272
            a.e.a.h.c[] r14 = r14.A
            r0 = r14[r36]
            a.e.a.g r0 = r0.i
            int r28 = r36 + 1
            r14 = r14[r28]
            a.e.a.g r14 = r14.i
            a.e.a.h.c[] r7 = r3.A
            r29 = r2
            r2 = r7[r36]
            a.e.a.g r2 = r2.i
            r7 = r7[r28]
            a.e.a.g r7 = r7.i
            r28 = r3
            a.e.a.b r3 = r34.b()
            r1 = 0
            r3.f225b = r1
            int r30 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r30 == 0) goto L_0x0253
            int r30 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r30 != 0) goto L_0x020e
            goto L_0x0253
        L_0x020e:
            r30 = 0
            int r31 = (r15 > r30 ? 1 : (r15 == r30 ? 0 : -1))
            if (r31 != 0) goto L_0x0223
            a.e.a.a r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.a((a.e.a.g) r0, (float) r7)
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r14, (float) r1)
        L_0x0220:
            r33 = r4
            goto L_0x026e
        L_0x0223:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r25 != 0) goto L_0x0234
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r2, (float) r1)
            a.e.a.a r0 = r3.d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.a((a.e.a.g) r7, (float) r1)
            goto L_0x0220
        L_0x0234:
            float r15 = r15 / r4
            float r25 = r6 / r4
            float r15 = r15 / r25
            r33 = r4
            a.e.a.a r4 = r3.d
            r4.a((a.e.a.g) r0, (float) r1)
            a.e.a.a r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.a((a.e.a.g) r14, (float) r4)
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r7, (float) r15)
            a.e.a.a r0 = r3.d
            float r1 = -r15
            r0.a((a.e.a.g) r2, (float) r1)
            goto L_0x026e
        L_0x0253:
            r33 = r4
            r30 = 0
            r4 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            a.e.a.a r15 = r3.d
            r15.a((a.e.a.g) r0, (float) r1)
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r14, (float) r4)
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r7, (float) r1)
            a.e.a.a r0 = r3.d
            r0.a((a.e.a.g) r2, (float) r4)
        L_0x026e:
            r9.a((a.e.a.b) r3)
            goto L_0x027a
        L_0x0272:
            r29 = r2
            r28 = r3
            r33 = r4
            r30 = 0
        L_0x027a:
            r15 = r6
            r14 = r28
        L_0x027d:
            int r8 = r8 + 1
            r4 = r33
            r1 = r37
            r0 = r20
            r2 = r29
            r7 = r30
            r3 = 1
            r6 = 5
            goto L_0x0183
        L_0x028d:
            r17 = 6
            r24 = 4
            if (r12 == 0) goto L_0x02f1
            if (r12 == r13) goto L_0x0297
            if (r5 == 0) goto L_0x02f1
        L_0x0297:
            a.e.a.h.c[] r0 = r10.A
            r1 = r0[r36]
            a.e.a.h.c[] r2 = r11.A
            int r3 = r36 + 1
            r2 = r2[r3]
            r4 = r0[r36]
            a.e.a.h.c r4 = r4.d
            if (r4 == 0) goto L_0x02af
            r0 = r0[r36]
            a.e.a.h.c r0 = r0.d
            a.e.a.g r0 = r0.i
            r4 = r0
            goto L_0x02b1
        L_0x02af:
            r4 = r21
        L_0x02b1:
            a.e.a.h.c[] r0 = r11.A
            r5 = r0[r3]
            a.e.a.h.c r5 = r5.d
            if (r5 == 0) goto L_0x02c1
            r0 = r0[r3]
            a.e.a.h.c r0 = r0.d
            a.e.a.g r0 = r0.i
            r5 = r0
            goto L_0x02c3
        L_0x02c1:
            r5 = r21
        L_0x02c3:
            if (r12 != r13) goto L_0x02cb
            a.e.a.h.c[] r0 = r12.A
            r1 = r0[r36]
            r2 = r0[r3]
        L_0x02cb:
            if (r4 == 0) goto L_0x0512
            if (r5 == 0) goto L_0x0512
            r0 = r27
            if (r35 != 0) goto L_0x02d6
            float r0 = r0.V
            goto L_0x02d8
        L_0x02d6:
            float r0 = r0.W
        L_0x02d8:
            r6 = r0
            int r3 = r1.a()
            int r7 = r2.a()
            a.e.a.g r1 = r1.i
            a.e.a.g r8 = r2.i
            r10 = 5
            r0 = r34
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0512
        L_0x02f1:
            if (r26 == 0) goto L_0x03e9
            if (r12 == 0) goto L_0x03e9
            r0 = r37
            int r1 = r0.j
            if (r1 <= 0) goto L_0x0302
            int r0 = r0.i
            if (r0 != r1) goto L_0x0302
            r19 = 1
            goto L_0x0304
        L_0x0302:
            r19 = 0
        L_0x0304:
            r14 = r12
            r15 = r14
        L_0x0306:
            if (r14 == 0) goto L_0x0512
            a.e.a.h.d[] r0 = r14.i0
            r0 = r0[r35]
            r8 = r0
        L_0x030d:
            if (r8 == 0) goto L_0x031a
            int r0 = r8.Y
            r6 = 8
            if (r0 != r6) goto L_0x031c
            a.e.a.h.d[] r0 = r8.i0
            r8 = r0[r35]
            goto L_0x030d
        L_0x031a:
            r6 = 8
        L_0x031c:
            if (r8 != 0) goto L_0x0329
            if (r14 != r13) goto L_0x0321
            goto L_0x0329
        L_0x0321:
            r16 = r8
            r18 = r17
            r17 = r24
            goto L_0x03da
        L_0x0329:
            a.e.a.h.c[] r0 = r14.A
            r0 = r0[r36]
            a.e.a.g r1 = r0.i
            a.e.a.h.c r2 = r0.d
            if (r2 == 0) goto L_0x0336
            a.e.a.g r2 = r2.i
            goto L_0x0338
        L_0x0336:
            r2 = r21
        L_0x0338:
            if (r15 == r14) goto L_0x0343
            a.e.a.h.c[] r2 = r15.A
            int r3 = r36 + 1
            r2 = r2[r3]
        L_0x0340:
            a.e.a.g r2 = r2.i
            goto L_0x0356
        L_0x0343:
            if (r14 != r12) goto L_0x0356
            if (r15 != r14) goto L_0x0356
            a.e.a.h.c[] r2 = r10.A
            r3 = r2[r36]
            a.e.a.h.c r3 = r3.d
            if (r3 == 0) goto L_0x0354
            r2 = r2[r36]
            a.e.a.h.c r2 = r2.d
            goto L_0x0340
        L_0x0354:
            r2 = r21
        L_0x0356:
            int r0 = r0.a()
            a.e.a.h.c[] r3 = r14.A
            int r4 = r36 + 1
            r3 = r3[r4]
            int r3 = r3.a()
            if (r8 == 0) goto L_0x0378
            a.e.a.h.c[] r5 = r8.A
            r5 = r5[r36]
            a.e.a.g r7 = r5.i
            a.e.a.h.c[] r6 = r14.A
            r6 = r6[r4]
            a.e.a.g r6 = r6.i
            r32 = r7
            r7 = r6
            r6 = r32
            goto L_0x038b
        L_0x0378:
            a.e.a.h.c[] r5 = r11.A
            r5 = r5[r4]
            a.e.a.h.c r5 = r5.d
            if (r5 == 0) goto L_0x0383
            a.e.a.g r6 = r5.i
            goto L_0x0385
        L_0x0383:
            r6 = r21
        L_0x0385:
            a.e.a.h.c[] r7 = r14.A
            r7 = r7[r4]
            a.e.a.g r7 = r7.i
        L_0x038b:
            if (r5 == 0) goto L_0x0392
            int r5 = r5.a()
            int r3 = r3 + r5
        L_0x0392:
            if (r15 == 0) goto L_0x039d
            a.e.a.h.c[] r5 = r15.A
            r5 = r5[r4]
            int r5 = r5.a()
            int r0 = r0 + r5
        L_0x039d:
            if (r1 == 0) goto L_0x0321
            if (r2 == 0) goto L_0x0321
            if (r6 == 0) goto L_0x0321
            if (r7 == 0) goto L_0x0321
            if (r14 != r12) goto L_0x03af
            a.e.a.h.c[] r0 = r12.A
            r0 = r0[r36]
            int r0 = r0.a()
        L_0x03af:
            r5 = r0
            if (r14 != r13) goto L_0x03bd
            a.e.a.h.c[] r0 = r13.A
            r0 = r0[r4]
            int r0 = r0.a()
            r16 = r0
            goto L_0x03bf
        L_0x03bd:
            r16 = r3
        L_0x03bf:
            if (r19 == 0) goto L_0x03c4
            r20 = r17
            goto L_0x03c6
        L_0x03c4:
            r20 = r24
        L_0x03c6:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r3 = r5
            r5 = r6
            r18 = r17
            r17 = r24
            r6 = r7
            r7 = r16
            r16 = r8
            r8 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03da:
            int r0 = r14.Y
            r8 = 8
            if (r0 == r8) goto L_0x03e1
            r15 = r14
        L_0x03e1:
            r14 = r16
            r24 = r17
            r17 = r18
            goto L_0x0306
        L_0x03e9:
            r0 = r37
            r18 = r17
            r17 = r24
            r8 = 8
            if (r23 == 0) goto L_0x0512
            if (r12 == 0) goto L_0x0512
            int r1 = r0.j
            if (r1 <= 0) goto L_0x0400
            int r0 = r0.i
            if (r0 != r1) goto L_0x0400
            r19 = 1
            goto L_0x0402
        L_0x0400:
            r19 = 0
        L_0x0402:
            r14 = r12
            r15 = r14
        L_0x0404:
            if (r14 == 0) goto L_0x04b4
            a.e.a.h.d[] r0 = r14.i0
            r0 = r0[r35]
        L_0x040a:
            if (r0 == 0) goto L_0x0415
            int r1 = r0.Y
            if (r1 != r8) goto L_0x0415
            a.e.a.h.d[] r0 = r0.i0
            r0 = r0[r35]
            goto L_0x040a
        L_0x0415:
            if (r14 == r12) goto L_0x04a5
            if (r14 == r13) goto L_0x04a5
            if (r0 == 0) goto L_0x04a5
            if (r0 != r13) goto L_0x0420
            r7 = r21
            goto L_0x0421
        L_0x0420:
            r7 = r0
        L_0x0421:
            a.e.a.h.c[] r0 = r14.A
            r0 = r0[r36]
            a.e.a.g r1 = r0.i
            a.e.a.h.c r2 = r0.d
            if (r2 == 0) goto L_0x042d
            a.e.a.g r2 = r2.i
        L_0x042d:
            a.e.a.h.c[] r2 = r15.A
            int r3 = r36 + 1
            r2 = r2[r3]
            a.e.a.g r2 = r2.i
            int r0 = r0.a()
            a.e.a.h.c[] r4 = r14.A
            r4 = r4[r3]
            int r4 = r4.a()
            if (r7 == 0) goto L_0x0451
            a.e.a.h.c[] r5 = r7.A
            r5 = r5[r36]
            a.e.a.g r6 = r5.i
            a.e.a.h.c r8 = r5.d
            if (r8 == 0) goto L_0x044e
            goto L_0x0462
        L_0x044e:
            r8 = r21
            goto L_0x0464
        L_0x0451:
            a.e.a.h.c[] r5 = r14.A
            r5 = r5[r3]
            a.e.a.h.c r5 = r5.d
            if (r5 == 0) goto L_0x045c
            a.e.a.g r6 = r5.i
            goto L_0x045e
        L_0x045c:
            r6 = r21
        L_0x045e:
            a.e.a.h.c[] r8 = r14.A
            r8 = r8[r3]
        L_0x0462:
            a.e.a.g r8 = r8.i
        L_0x0464:
            if (r5 == 0) goto L_0x046e
            int r5 = r5.a()
            int r5 = r5 + r4
            r20 = r5
            goto L_0x0470
        L_0x046e:
            r20 = r4
        L_0x0470:
            a.e.a.h.c[] r4 = r15.A
            r3 = r4[r3]
            int r3 = r3.a()
            int r3 = r3 + r0
            if (r19 == 0) goto L_0x047e
            r22 = r18
            goto L_0x0480
        L_0x047e:
            r22 = r17
        L_0x0480:
            if (r1 == 0) goto L_0x049c
            if (r2 == 0) goto L_0x049c
            if (r6 == 0) goto L_0x049c
            if (r8 == 0) goto L_0x049c
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r5 = r6
            r6 = r8
            r16 = r7
            r7 = r20
            r20 = r15
            r15 = 8
            r8 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a2
        L_0x049c:
            r16 = r7
            r20 = r15
            r15 = 8
        L_0x04a2:
            r0 = r16
            goto L_0x04a8
        L_0x04a5:
            r20 = r15
            r15 = r8
        L_0x04a8:
            int r1 = r14.Y
            if (r1 == r15) goto L_0x04ad
            goto L_0x04af
        L_0x04ad:
            r14 = r20
        L_0x04af:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x0404
        L_0x04b4:
            a.e.a.h.c[] r0 = r12.A
            r0 = r0[r36]
            a.e.a.h.c[] r1 = r10.A
            r1 = r1[r36]
            a.e.a.h.c r1 = r1.d
            a.e.a.h.c[] r2 = r13.A
            int r3 = r36 + 1
            r10 = r2[r3]
            a.e.a.h.c[] r2 = r11.A
            r2 = r2[r3]
            a.e.a.h.c r14 = r2.d
            if (r1 == 0) goto L_0x0501
            if (r12 == r13) goto L_0x04db
            a.e.a.g r2 = r0.i
            a.e.a.g r1 = r1.i
            int r0 = r0.a()
            r15 = 5
            r9.a(r2, r1, r0, r15)
            goto L_0x0502
        L_0x04db:
            r15 = 5
            if (r14 == 0) goto L_0x0502
            a.e.a.g r2 = r0.i
            a.e.a.g r3 = r1.i
            int r4 = r0.a()
            r5 = 1056964608(0x3f000000, float:0.5)
            a.e.a.g r6 = r10.i
            a.e.a.g r7 = r14.i
            int r8 = r10.a()
            r16 = 5
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0502
        L_0x0501:
            r15 = 5
        L_0x0502:
            if (r14 == 0) goto L_0x0512
            if (r12 == r13) goto L_0x0512
            a.e.a.g r0 = r10.i
            a.e.a.g r1 = r14.i
            int r2 = r10.a()
            int r2 = -r2
            r9.a(r0, r1, r2, r15)
        L_0x0512:
            if (r26 != 0) goto L_0x0516
            if (r23 == 0) goto L_0x0574
        L_0x0516:
            if (r12 == 0) goto L_0x0574
            a.e.a.h.c[] r0 = r12.A
            r0 = r0[r36]
            a.e.a.h.c[] r1 = r13.A
            int r2 = r36 + 1
            r1 = r1[r2]
            a.e.a.h.c r3 = r0.d
            if (r3 == 0) goto L_0x0529
            a.e.a.g r3 = r3.i
            goto L_0x052b
        L_0x0529:
            r3 = r21
        L_0x052b:
            a.e.a.h.c r4 = r1.d
            if (r4 == 0) goto L_0x0532
            a.e.a.g r4 = r4.i
            goto L_0x0534
        L_0x0532:
            r4 = r21
        L_0x0534:
            if (r11 == r13) goto L_0x0545
            a.e.a.h.c[] r4 = r11.A
            r4 = r4[r2]
            a.e.a.h.c r4 = r4.d
            if (r4 == 0) goto L_0x0542
            a.e.a.g r4 = r4.i
            r21 = r4
        L_0x0542:
            r5 = r21
            goto L_0x0546
        L_0x0545:
            r5 = r4
        L_0x0546:
            if (r12 != r13) goto L_0x0553
            a.e.a.h.c[] r0 = r12.A
            r1 = r0[r36]
            r0 = r0[r2]
            r32 = r1
            r1 = r0
            r0 = r32
        L_0x0553:
            if (r3 == 0) goto L_0x0574
            if (r5 == 0) goto L_0x0574
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.a()
            a.e.a.h.c[] r7 = r13.A
            r2 = r7[r2]
            int r7 = r2.a()
            a.e.a.g r2 = r0.i
            a.e.a.g r8 = r1.i
            r10 = 5
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0574:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(a.e.a.h.e, a.e.a.e, int, int, a.e.a.h.b):void");
    }

    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = a((java.io.File) r0, (java.io.InputStream) r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(java.io.File, android.content.res.Resources, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC, Splitter:B:25:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC, Splitter:B:31:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004e
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0028 }
            r3.append(r5)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(java.io.File, java.io.InputStream):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x030a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r27
            int r12 = r25.getDepth()
            r0 = 0
            r1 = 0
            r13 = r1
        L_0x000f:
            int r1 = r25.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001d
            int r3 = r25.getDepth()
            if (r3 <= r12) goto L_0x0331
        L_0x001d:
            r3 = 1
            if (r1 == r3) goto L_0x0331
            r4 = 2
            if (r1 == r4) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = r25.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0046
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r7
            r5 = r29
            r6 = r25
            a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x0046:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0064
            r4 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r5 = r29
            r6 = r25
            android.animation.ValueAnimator r7 = a(r0, r1, r2, r3, r4, r5, r6)
        L_0x005f:
            r0 = r7
            r19 = r12
            goto L_0x0304
        L_0x0064:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x009b
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = a.m.a.a.a.h
            r7 = r26
            android.content.res.TypedArray r6 = a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r7, (int[]) r0)
            java.lang.String r0 = "ordering"
            int r16 = b(r6, r10, r0, r14, r14)
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r29
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r19 = r12
            r0 = r15
            goto L_0x0304
        L_0x009b:
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x031a
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r25)
            r6 = 0
            r21 = r14
            r14 = r3
            r3 = r21
        L_0x00ad:
            int r7 = r25.getEventType()
            if (r7 == r2) goto L_0x02e0
            if (r7 == r14) goto L_0x02e0
            if (r7 == r4) goto L_0x00bb
            r25.next()
            goto L_0x00ad
        L_0x00bb:
            java.lang.String r7 = r25.getName()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x02cb
            int[] r3 = a.m.a.a.a.i
            android.content.res.TypedArray r3 = a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r1, (int[]) r3)
            java.lang.String r7 = "propertyName"
            java.lang.String r7 = a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r7, (int) r2)
            r14 = 4
            java.lang.String r15 = "valueType"
            int r4 = b(r3, r10, r15, r4, r14)
            r14 = 0
            r16 = r1
            r15 = r4
        L_0x00dc:
            int r1 = r25.next()
            if (r1 == r2) goto L_0x01d0
            r17 = r2
            r2 = 1
            if (r1 == r2) goto L_0x01d0
            java.lang.String r1 = r25.getName()
            java.lang.String r2 = "keyframe"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01c6
            java.lang.String r1 = "value"
            r2 = 4
            if (r15 != r2) goto L_0x0127
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r25)
            int[] r15 = a.m.a.a.a.j
            android.content.res.TypedArray r2 = a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r2, (int[]) r15)
            boolean r15 = a((org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r1)
            if (r15 != 0) goto L_0x010a
            r15 = 0
            goto L_0x010f
        L_0x010a:
            r15 = 0
            android.util.TypedValue r15 = r2.peekValue(r15)
        L_0x010f:
            if (r15 == 0) goto L_0x0114
            r18 = 1
            goto L_0x0116
        L_0x0114:
            r18 = 0
        L_0x0116:
            if (r18 == 0) goto L_0x0123
            int r15 = r15.type
            boolean r15 = b((int) r15)
            if (r15 == 0) goto L_0x0123
            r15 = r17
            goto L_0x0124
        L_0x0123:
            r15 = 0
        L_0x0124:
            r2.recycle()
        L_0x0127:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r25)
            r18 = r5
            int[] r5 = a.m.a.a.a.j
            android.content.res.TypedArray r2 = a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r2, (int[]) r5)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r8 = "fraction"
            r9 = 3
            float r5 = a((android.content.res.TypedArray) r2, (org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r8, (int) r9, (float) r5)
            boolean r8 = a((org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r1)
            if (r8 != 0) goto L_0x0144
            r8 = 0
            goto L_0x0149
        L_0x0144:
            r8 = 0
            android.util.TypedValue r8 = r2.peekValue(r8)
        L_0x0149:
            if (r8 == 0) goto L_0x014d
            r9 = 1
            goto L_0x014e
        L_0x014d:
            r9 = 0
        L_0x014e:
            r19 = r12
            r12 = 4
            if (r15 != r12) goto L_0x0161
            if (r9 == 0) goto L_0x015f
            int r8 = r8.type
            boolean r8 = b((int) r8)
            if (r8 == 0) goto L_0x015f
            r8 = 3
            goto L_0x0162
        L_0x015f:
            r8 = 0
            goto L_0x0162
        L_0x0161:
            r8 = r15
        L_0x0162:
            if (r9 == 0) goto L_0x0183
            if (r8 == 0) goto L_0x0178
            r9 = 1
            if (r8 == r9) goto L_0x016e
            r9 = 3
            if (r8 == r9) goto L_0x016e
            r1 = 0
            goto L_0x018e
        L_0x016e:
            r8 = 0
            int r1 = b(r2, r10, r1, r8, r8)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r5, r1)
            goto L_0x018e
        L_0x0178:
            r8 = 0
            r9 = 0
            float r1 = a((android.content.res.TypedArray) r2, (org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r1, (int) r8, (float) r9)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r5, r1)
            goto L_0x018e
        L_0x0183:
            if (r8 != 0) goto L_0x018a
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r5)
            goto L_0x018e
        L_0x018a:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r5)
        L_0x018e:
            java.lang.String r5 = "interpolator"
            boolean r5 = a((org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0198
            r5 = 0
            goto L_0x019e
        L_0x0198:
            r5 = 0
            r8 = 1
            int r5 = r2.getResourceId(r8, r5)
        L_0x019e:
            r8 = r22
            if (r5 <= 0) goto L_0x01a9
            android.view.animation.Interpolator r5 = android.view.animation.AnimationUtils.loadInterpolator(r8, r5)
            r1.setInterpolator(r5)
        L_0x01a9:
            r2.recycle()
            if (r1 == 0) goto L_0x01b8
            if (r14 != 0) goto L_0x01b5
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01b5:
            r14.add(r1)
        L_0x01b8:
            r25.next()
            r2 = 3
            r8 = r23
            r9 = r24
            r5 = r18
            r12 = r19
            goto L_0x00dc
        L_0x01c6:
            r8 = r22
            r8 = r23
            r9 = r24
            r2 = r17
            goto L_0x00dc
        L_0x01d0:
            r8 = r22
            r18 = r5
            r19 = r12
            if (r14 == 0) goto L_0x02ac
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x02ac
            r2 = 0
            java.lang.Object r2 = r14.get(r2)
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            int r5 = r1 + -1
            java.lang.Object r5 = r14.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            float r9 = r5.getFraction()
            r12 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x020e
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0201
            r5.setFraction(r12)
            goto L_0x020e
        L_0x0201:
            int r9 = r14.size()
            android.animation.Keyframe r5 = a((android.animation.Keyframe) r5, (float) r12)
            r14.add(r9, r5)
            int r1 = r1 + 1
        L_0x020e:
            float r5 = r2.getFraction()
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x0229
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x021f
            r2.setFraction(r9)
            goto L_0x0229
        L_0x021f:
            android.animation.Keyframe r2 = a((android.animation.Keyframe) r2, (float) r9)
            r5 = 0
            r14.add(r5, r2)
            int r1 = r1 + 1
        L_0x0229:
            android.animation.Keyframe[] r2 = new android.animation.Keyframe[r1]
            r14.toArray(r2)
            r5 = 0
        L_0x022f:
            if (r5 >= r1) goto L_0x029e
            r9 = r2[r5]
            float r12 = r9.getFraction()
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0248
            if (r5 != 0) goto L_0x023f
            goto L_0x0245
        L_0x023f:
            int r12 = r1 + -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r12) goto L_0x024b
        L_0x0245:
            r9.setFraction(r14)
        L_0x0248:
            r17 = r1
            goto L_0x0297
        L_0x024b:
            int r9 = r5 + 1
            r14 = r5
        L_0x024e:
            if (r9 >= r12) goto L_0x0265
            r17 = r2[r9]
            float r17 = r17.getFraction()
            r20 = 0
            int r17 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r17 < 0) goto L_0x025d
            goto L_0x0265
        L_0x025d:
            int r14 = r9 + 1
            r21 = r14
            r14 = r9
            r9 = r21
            goto L_0x024e
        L_0x0265:
            int r9 = r14 + 1
            r9 = r2[r9]
            float r9 = r9.getFraction()
            int r12 = r5 + -1
            r12 = r2[r12]
            float r12 = r12.getFraction()
            float r9 = r9 - r12
            int r12 = r14 - r5
            int r12 = r12 + 2
            float r12 = (float) r12
            float r9 = r9 / r12
            r12 = r5
        L_0x027d:
            if (r12 > r14) goto L_0x0248
            r17 = r1
            r1 = r2[r12]
            int r20 = r12 + -1
            r20 = r2[r20]
            float r20 = r20.getFraction()
            float r8 = r20 + r9
            r1.setFraction(r8)
            int r12 = r12 + 1
            r8 = r22
            r1 = r17
            goto L_0x027d
        L_0x0297:
            int r5 = r5 + 1
            r8 = r22
            r1 = r17
            goto L_0x022f
        L_0x029e:
            r1 = 2
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofKeyframe(r7, r2)
            r5 = 3
            if (r15 != r5) goto L_0x02af
            a.m.a.a.e r8 = a.m.a.a.e.f432a
            r2.setEvaluator(r8)
            goto L_0x02af
        L_0x02ac:
            r5 = 3
            r1 = 2
            r2 = 0
        L_0x02af:
            r8 = 0
            r14 = 1
            if (r2 != 0) goto L_0x02b7
            android.animation.PropertyValuesHolder r2 = a((android.content.res.TypedArray) r3, (int) r4, (int) r8, (int) r14, (java.lang.String) r7)
        L_0x02b7:
            if (r2 == 0) goto L_0x02c4
            if (r6 != 0) goto L_0x02c1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r4
        L_0x02c1:
            r6.add(r2)
        L_0x02c4:
            r3.recycle()
            r4 = r1
            r2 = r5
            r3 = r8
            goto L_0x02d1
        L_0x02cb:
            r16 = r1
            r18 = r5
            r19 = r12
        L_0x02d1:
            r25.next()
            r8 = r23
            r9 = r24
            r1 = r16
            r5 = r18
            r12 = r19
            goto L_0x00ad
        L_0x02e0:
            r19 = r12
            if (r6 == 0) goto L_0x02f7
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
        L_0x02ea:
            if (r3 >= r1) goto L_0x02f8
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x02ea
        L_0x02f7:
            r2 = 0
        L_0x02f8:
            if (r2 == 0) goto L_0x0304
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x0304
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x0304:
            if (r11 == 0) goto L_0x0312
            if (r14 != 0) goto L_0x0312
            if (r13 != 0) goto L_0x030f
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x030f:
            r13.add(r0)
        L_0x0312:
            r8 = r23
            r9 = r24
            r12 = r19
            goto L_0x000f
        L_0x031a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = b.a.a.a.a.a(r1)
            java.lang.String r2 = r25.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0331:
            if (r11 == 0) goto L_0x035a
            if (r13 == 0) goto L_0x035a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x033f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0351
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x033f
        L_0x0351:
            if (r28 != 0) goto L_0x0357
            r11.playTogether(r1)
            goto L_0x035a
        L_0x0357:
            r11.playSequentially(r1)
        L_0x035a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = r18.getName()
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0105
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = r6
        L_0x001e:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00f5
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x002d
            r10 = 3
            if (r8 == r10) goto L_0x00f5
        L_0x002d:
            r10 = 2
            if (r8 != r10) goto L_0x00f0
            if (r9 > r2) goto L_0x00f0
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0040
            goto L_0x00f0
        L_0x0040:
            int[] r8 = a.f.c.ColorStateListItem
            if (r1 != 0) goto L_0x004b
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x0051
        L_0x004b:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x0051:
            int r10 = a.f.c.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r8.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = a.f.c.ColorStateListItem_android_alpha
            boolean r12 = r8.hasValue(r12)
            if (r12 == 0) goto L_0x0067
            int r12 = a.f.c.ColorStateListItem_android_alpha
            goto L_0x0071
        L_0x0067:
            int r12 = a.f.c.ColorStateListItem_alpha
            boolean r12 = r8.hasValue(r12)
            if (r12 == 0) goto L_0x0075
            int r12 = a.f.c.ColorStateListItem_alpha
        L_0x0071:
            float r11 = r8.getFloat(r12, r11)
        L_0x0075:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r12 = new int[r8]
            r13 = r6
            r14 = r13
        L_0x0080:
            if (r13 >= r8) goto L_0x00a5
            int r15 = r0.getAttributeNameResource(r13)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r3) goto L_0x00a1
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x00a1
            int r3 = a.f.a.alpha
            if (r15 == r3) goto L_0x00a1
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r6)
            if (r16 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            int r15 = -r15
        L_0x009e:
            r12[r14] = r15
            r14 = r3
        L_0x00a1:
            int r13 = r13 + 1
            r3 = 1
            goto L_0x0080
        L_0x00a5:
            int[] r3 = android.util.StateSet.trimStateSet(r12, r14)
            int r8 = android.graphics.Color.alpha(r10)
            float r8 = (float) r8
            float r8 = r8 * r11
            int r8 = java.lang.Math.round(r8)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r8 = r8 << 24
            r8 = r8 | r10
            int r10 = r7 + 1
            int r11 = r4.length
            r12 = 8
            r13 = 4
            if (r10 <= r11) goto L_0x00ce
            if (r7 > r13) goto L_0x00c6
            r11 = r12
            goto L_0x00c8
        L_0x00c6:
            int r11 = r7 * 2
        L_0x00c8:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r4, r6, r11, r6, r7)
            r4 = r11
        L_0x00ce:
            r4[r7] = r8
            int r8 = r5.length
            if (r10 <= r8) goto L_0x00ea
            java.lang.Class r8 = r5.getClass()
            java.lang.Class r8 = r8.getComponentType()
            if (r7 > r13) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            int r12 = r7 * 2
        L_0x00e0:
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r12)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.System.arraycopy(r5, r6, r8, r6, r7)
            r5 = r8
        L_0x00ea:
            r5[r7] = r3
            int[][] r5 = (int[][]) r5
            r7 = r10
            goto L_0x00f2
        L_0x00f0:
            r9 = r17
        L_0x00f2:
            r3 = 1
            goto L_0x001e
        L_0x00f5:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0105:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r18.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r16 == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ NumberFormatException -> 0x00b6 }, LOOP:3: B:25:0x006c->B:43:0x0095, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0094 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.f.f.b[] a(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        L_0x000e:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00e8
        L_0x0014:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0038
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x0030
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0035
        L_0x0030:
            if (r6 == r8) goto L_0x0035
            if (r6 == r7) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0038:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00e1
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00d3
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0058
            goto L_0x00d3
        L_0x0058:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00b6 }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00b6 }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00b6 }
            r11 = r2
            r10 = 1
        L_0x0064:
            if (r10 >= r9) goto L_0x00b0
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L_0x006c:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00b6 }
            if (r12 >= r3) goto L_0x0099
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00b6 }
            r2 = 32
            if (r3 == r2) goto L_0x008f
            if (r3 == r7) goto L_0x008c
            if (r3 == r8) goto L_0x008c
            switch(r3) {
                case 44: goto L_0x008f;
                case 45: goto L_0x0086;
                case 46: goto L_0x0082;
                default: goto L_0x0081;
            }     // Catch:{ NumberFormatException -> 0x00b6 }
        L_0x0081:
            goto L_0x0090
        L_0x0082:
            if (r14 != 0) goto L_0x008a
            r14 = 1
            goto L_0x0090
        L_0x0086:
            if (r12 == r10) goto L_0x0090
            if (r16 != 0) goto L_0x0090
        L_0x008a:
            r13 = 1
            goto L_0x008f
        L_0x008c:
            r16 = 1
            goto L_0x0092
        L_0x008f:
            r15 = 1
        L_0x0090:
            r16 = 0
        L_0x0092:
            if (r15 == 0) goto L_0x0095
            goto L_0x0099
        L_0x0095:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x006c
        L_0x0099:
            if (r10 >= r12) goto L_0x00a8
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00b6 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00b6 }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00b6 }
            r11 = r2
        L_0x00a8:
            if (r13 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            int r12 = r12 + 1
        L_0x00ad:
            r10 = r12
            r2 = 0
            goto L_0x0064
        L_0x00b0:
            float[] r3 = a((float[]) r6, (int) r2, (int) r11)     // Catch:{ NumberFormatException -> 0x00b6 }
            r2 = 0
            goto L_0x00d5
        L_0x00b6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00d3:
            float[] r3 = new float[r2]
        L_0x00d5:
            char r5 = r5.charAt(r2)
            a.f.f.b r2 = new a.f.f.b
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00e1:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000e
        L_0x00e8:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x0101
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x0101
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            a.f.f.b r3 = new a.f.f.b
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x0101:
            int r0 = r1.size()
            a.f.f.b[] r0 = new a.f.f.b[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            a.f.f.b[] r0 = (a.f.f.b[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(java.lang.String):a.f.f.b[]");
    }

    public static void a(e eVar) {
        if ((eVar.C0 & 32) != 32) {
            eVar.w0.clear();
            eVar.w0.add(0, new a.e.a.h.f(eVar.k0));
            return;
        }
        eVar.D0 = true;
        eVar.x0 = false;
        eVar.y0 = false;
        eVar.z0 = false;
        ArrayList<d> arrayList = eVar.k0;
        List<a.e.a.h.f> list = eVar.w0;
        boolean z = eVar.e() == d.a.WRAP_CONTENT;
        boolean z2 = eVar.i() == d.a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (d next : arrayList) {
            next.p = null;
            next.d0 = false;
            next.m();
        }
        for (d next2 : arrayList) {
            if (next2.p == null) {
                a.e.a.h.f fVar = new a.e.a.h.f(new ArrayList(), true);
                list.add(fVar);
                if (!a(next2, fVar, list, z3)) {
                    eVar.w0.clear();
                    eVar.w0.add(0, new a.e.a.h.f(eVar.k0));
                    eVar.D0 = false;
                    return;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (a.e.a.h.f next3 : list) {
            i = Math.max(i, a(next3, 0));
            i2 = Math.max(i2, a(next3, 1));
        }
        if (z) {
            eVar.a(d.a.FIXED);
            eVar.f(i);
            eVar.x0 = true;
            eVar.y0 = true;
            eVar.A0 = i;
        }
        if (z2) {
            eVar.b(d.a.FIXED);
            eVar.e(i2);
            eVar.x0 = true;
            eVar.z0 = true;
            eVar.B0 = i2;
        }
        a(list, 0, eVar.j());
        a(list, 1, eVar.d());
    }

    public static int a(a.e.a.h.f fVar, int i) {
        int i2 = i * 2;
        List<d> list = null;
        if (fVar != null) {
            if (i == 0) {
                list = fVar.f;
            } else if (i == 1) {
                list = fVar.g;
            }
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                d dVar = list.get(i4);
                c[] cVarArr = dVar.A;
                int i5 = i2 + 1;
                i3 = Math.max(i3, a(dVar, i, cVarArr[i5].d == null || !(cVarArr[i2].d == null || cVarArr[i5].d == null), 0));
            }
            fVar.e[i] = i3;
            return i3;
        }
        throw null;
    }

    public static int a(d dVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int j;
        int i8;
        int i9;
        d dVar2;
        d dVar3 = dVar;
        int i10 = i;
        boolean z2 = z;
        int i11 = 0;
        if (!dVar3.b0) {
            return 0;
        }
        boolean z3 = dVar3.w.d != null && i10 == 1;
        if (z2) {
            i6 = dVar3.Q;
            i5 = dVar.d() - dVar3.Q;
            i4 = i10 * 2;
            i3 = i4 + 1;
        } else {
            int d2 = dVar.d();
            i5 = dVar3.Q;
            i6 = d2 - i5;
            i3 = i10 * 2;
            i4 = i3 + 1;
        }
        c[] cVarArr = dVar3.A;
        if (cVarArr[i3].d == null || cVarArr[i4].d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            int i12 = i3;
            i3 = i4;
            i4 = i12;
        }
        int i13 = z3 ? i2 - i6 : i2;
        int a2 = a(dVar, i) + (dVar3.A[i4].a() * i7);
        int i14 = i13 + a2;
        int j2 = (i10 == 0 ? dVar.j() : dVar.d()) * i7;
        Iterator<l> it = dVar3.A[i4].f237a.f248a.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, a(((j) it.next()).c.f238b, i10, z2, i14));
        }
        int i15 = 0;
        for (Iterator<l> it2 = dVar3.A[i3].f237a.f248a.iterator(); it2.hasNext(); it2 = it2) {
            i15 = Math.max(i15, a(((j) it2.next()).c.f238b, i10, z2, j2 + i14));
        }
        if (z3) {
            i11 -= i6;
            j = i15 + i5;
        } else {
            j = i15 + ((i10 == 0 ? dVar.j() : dVar.d()) * i7);
        }
        if (i10 == 1) {
            Iterator<l> it3 = dVar3.w.f237a.f248a.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                Iterator<l> it4 = it3;
                int i17 = i3;
                i16 = Math.max(i16, a(((j) it3.next()).c.f238b, i10, z2, i7 == 1 ? i6 + i14 : (i5 * i7) + i14));
                it3 = it4;
                i3 = i17;
            }
            i8 = i3;
            i9 = (dVar3.w.f237a.f248a.size() <= 0 || z3) ? i16 : i7 == 1 ? i16 + i6 : i16 - i5;
        } else {
            i8 = i3;
            i9 = 0;
        }
        int max = Math.max(i11, Math.max(j, i9)) + a2;
        int i18 = j2 + i14;
        if (i7 == -1) {
            int i19 = i18;
            i18 = i14;
            i14 = i19;
        }
        if (z2) {
            i.a(dVar3, i10, i14);
            dVar3.a(i14, i18, i10);
        } else {
            dVar3.p.a(dVar3, i10);
            if (i10 == 0) {
                dVar3.K = i14;
            } else if (i10 == 1) {
                dVar3.L = i14;
            }
        }
        if (dVar.b(i) == d.a.MATCH_CONSTRAINT && dVar3.G != 0.0f) {
            dVar3.p.a(dVar3, i10);
        }
        c[] cVarArr2 = dVar3.A;
        if (cVarArr2[i4].d != null && cVarArr2[i8].d != null && cVarArr2[i4].d.f238b == (dVar2 = dVar3.D) && cVarArr2[i8].d.f238b == dVar2) {
            dVar3.p.a(dVar3, i10);
        }
        return max;
    }

    public static a.f.e.b.a a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        a.f.e.b.a aVar;
        if (a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new a.f.e.b.a((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                aVar = a.f.e.b.a.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new a.f.e.b.a((Shader) null, (ColorStateList) null, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = b((int) r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = b((int) r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = r7
            goto L_0x0037
        L_0x0036:
            r12 = r2
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = r1
            goto L_0x003c
        L_0x003b:
            r6 = r2
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            a.f.f.b[] r13 = a((java.lang.String) r12)
            a.f.f.b[] r14 = a((java.lang.String) r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0167
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            a.m.a.a.d r0 = new a.m.a.a.d
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = a((a.f.f.b[]) r13, (a.f.f.b[]) r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0167
        L_0x0098:
            if (r14 == 0) goto L_0x0167
            a.m.a.a.d r11 = new a.m.a.a.d
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0167
        L_0x00a9:
            if (r12 != r7) goto L_0x00ae
            a.m.a.a.e r12 = a.m.a.a.e.f432a
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d9
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x015f
        L_0x00d9:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x015f
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x015f
        L_0x00f8:
            if (r3 == 0) goto L_0x013e
            if (r0 != r7) goto L_0x0102
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0111
        L_0x0102:
            boolean r0 = b((int) r0)
            if (r0 == 0) goto L_0x010d
            int r13 = r11.getColor(r13, r2)
            goto L_0x0111
        L_0x010d:
            int r13 = r11.getInt(r13, r2)
        L_0x0111:
            if (r5 == 0) goto L_0x0135
            if (r4 != r7) goto L_0x011b
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012a
        L_0x011b:
            boolean r0 = b((int) r4)
            if (r0 == 0) goto L_0x0126
            int r11 = r11.getColor(r14, r2)
            goto L_0x012a
        L_0x0126:
            int r11 = r11.getInt(r14, r2)
        L_0x012a:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015f
        L_0x0135:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015f
        L_0x013e:
            if (r5 == 0) goto L_0x0160
            if (r4 != r7) goto L_0x0148
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0157
        L_0x0148:
            boolean r13 = b((int) r4)
            if (r13 == 0) goto L_0x0153
            int r11 = r11.getColor(r14, r2)
            goto L_0x0157
        L_0x0153:
            int r11 = r11.getInt(r14, r2)
        L_0x0157:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015f:
            r8 = r11
        L_0x0160:
            if (r8 == 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            r8.setEvaluator(r12)
        L_0x0167:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String b2 = b((Context) activity, activity.getComponentName());
            if (b2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b2);
            try {
                return b((Context) activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r5 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.f.i.a.C0016a a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            a.f.i.a$a r0 = new a.f.i.a$a
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r0 = new android.text.TextPaint
            android.text.TextPaint r2 = r7.getPaint()
            r0.<init>(r2)
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r2 = r7.getBreakStrategy()
            int r3 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r4 = r7.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            if (r4 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0077
        L_0x002e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r6 = 1
            if (r4 < r1) goto L_0x0059
            int r1 = r7.getInputType()
            r1 = r1 & 15
            r4 = 3
            if (r1 != r4) goto L_0x0059
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L_0x006f
            r1 = 2
            if (r7 != r1) goto L_0x002b
            goto L_0x006f
        L_0x0059:
            int r1 = r7.getLayoutDirection()
            if (r1 != r6) goto L_0x0060
            r5 = r6
        L_0x0060:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L_0x0072;
                case 3: goto L_0x002b;
                case 4: goto L_0x006f;
                case 5: goto L_0x006c;
                case 6: goto L_0x0075;
                case 7: goto L_0x0069;
                default: goto L_0x0067;
            }
        L_0x0067:
            if (r5 == 0) goto L_0x0075
        L_0x0069:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0077
        L_0x006c:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0077
        L_0x006f:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0077
        L_0x0072:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0077
        L_0x0075:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0077:
            a.f.i.a$a r1 = new a.f.i.a$a
            r1.<init>(r0, r7, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.o.a(android.widget.TextView):a.f.i.a$a");
    }

    public static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray a2 = a(resources2, theme2, attributeSet2, a.m.a.a.a.g);
        TypedArray a3 = a(resources2, theme2, attributeSet2, a.m.a.a.a.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long b2 = (long) b(a2, xmlPullParser2, "duration", 1, 300);
        int i = 0;
        long b3 = (long) b(a2, xmlPullParser2, "startOffset", 2, 0);
        int b4 = b(a2, xmlPullParser2, "valueType", 7, 4);
        if (a(xmlPullParser2, "valueFrom") && a(xmlPullParser2, "valueTo")) {
            if (b4 == 4) {
                TypedValue peekValue = a2.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a2.peekValue(6);
                boolean z2 = peekValue2 != null;
                b4 = ((!z || !b(i2)) && (!z2 || !b(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a4 = a(a2, b4, 5, 6, "");
            if (a4 != null) {
                valueAnimator4.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator4.setDuration(b2);
        valueAnimator4.setStartDelay(b3);
        valueAnimator4.setRepeatCount(b(a2, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(b(a2, xmlPullParser2, "repeatMode", 4, 1));
        if (a3 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String a5 = a(a3, xmlPullParser2, "pathData", 1);
            if (a5 != null) {
                String a6 = a(a3, xmlPullParser2, "propertyXName", 2);
                String a7 = a(a3, xmlPullParser2, "propertyYName", 3);
                if (a6 == null && a7 == null) {
                    throw new InflateException(a3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path b5 = b(a5);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(b5, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                while (true) {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                }
                PathMeasure pathMeasure2 = new PathMeasure(b5, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                int i3 = 0;
                float f6 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i >= min) {
                        break;
                    }
                    int i4 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i3)).floatValue(), fArr3, (float[]) null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f6 += f5;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f6 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    min = i4;
                }
                PropertyValuesHolder ofFloat = a6 != null ? PropertyValuesHolder.ofFloat(a6, fArr) : null;
                if (a7 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(a7, fArr2);
                }
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                objectAnimator.setPropertyName(a(a3, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = a2;
        }
        if (!a(xmlPullParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator3;
    }

    public static a.f.e.b.b a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.f.c.FontFamily);
                String string = obtainAttributes.getString(a.f.c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(a.f.c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(a.f.c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(a.f.c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(a.f.c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(a.f.c.FontFamily_fontProviderFetchTimeout, 500);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.f.c.FontFamilyFont);
                                int i = obtainAttributes2.getInt(obtainAttributes2.hasValue(a.f.c.FontFamilyFont_fontWeight) ? a.f.c.FontFamilyFont_fontWeight : a.f.c.FontFamilyFont_android_fontWeight, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(a.f.c.FontFamilyFont_fontStyle) ? a.f.c.FontFamilyFont_fontStyle : a.f.c.FontFamilyFont_android_fontStyle, 0);
                                int i2 = obtainAttributes2.hasValue(a.f.c.FontFamilyFont_ttcIndex) ? a.f.c.FontFamilyFont_ttcIndex : a.f.c.FontFamilyFont_android_ttcIndex;
                                String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(a.f.c.FontFamilyFont_fontVariationSettings) ? a.f.c.FontFamilyFont_fontVariationSettings : a.f.c.FontFamilyFont_android_fontVariationSettings);
                                int i3 = obtainAttributes2.getInt(i2, 0);
                                int i4 = obtainAttributes2.hasValue(a.f.c.FontFamilyFont_font) ? a.f.c.FontFamilyFont_font : a.f.c.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i4, 0);
                                String string5 = obtainAttributes2.getString(i4);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    a(xmlPullParser);
                                }
                                arrayList.add(new a.f.e.b.d(string5, i, z, string4, i3, resourceId2));
                            } else {
                                a(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new a.f.e.b.c((a.f.e.b.d[]) arrayList.toArray(new a.f.e.b.d[arrayList.size()]));
                }
                while (xmlPullParser.next() != 3) {
                    a(xmlPullParser);
                }
                return new a.f.e.b.e(new a.f.h.a(string, string2, string3, a(resources2, resourceId)), integer, integer2);
            }
            a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void a(List<a.e.a.h.f> list, int i, int i2) {
        int c2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            a.e.a.h.f fVar = list.get(i3);
            HashSet<d> hashSet = null;
            if (fVar != null) {
                if (i == 0) {
                    hashSet = fVar.h;
                } else if (i == 1) {
                    hashSet = fVar.i;
                }
                for (d next : hashSet) {
                    if (next.b0) {
                        int i4 = i * 2;
                        c[] cVarArr = next.A;
                        c cVar = cVarArr[i4];
                        c cVar2 = cVarArr[i4 + 1];
                        if ((cVar.d == null || cVar2.d == null) ? false : true) {
                            c2 = cVar.a() + a(next, i);
                        } else if (next.G == 0.0f || next.b(i) != d.a.MATCH_CONSTRAINT) {
                            int i5 = i2 - (i == 0 ? next.K : i == 1 ? next.L : 0);
                            c2 = i5 - next.c(i);
                            next.a(c2, i5, i);
                        } else {
                            int a2 = a(next);
                            int i6 = (int) next.A[i4].f237a.g;
                            j jVar = cVar2.f237a;
                            jVar.f = cVar.f237a;
                            jVar.g = (float) a2;
                            jVar.f249b = 1;
                            next.a(i6, i6 + a2, i);
                        }
                        i.a(next, i, c2);
                    }
                }
                i3++;
            } else {
                throw null;
            }
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        a1 a1Var = a1.k;
        if (a1Var != null && a1Var.f111b == view) {
            a1.a((a1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = a1.l;
            if (a1Var2 != null && a1Var2.f111b == view) {
                a1Var2.b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new a1(view, charSequence);
    }

    public static boolean a(d dVar, a.e.a.h.f fVar, List<a.e.a.h.f> list, boolean z) {
        c cVar;
        c cVar2;
        c cVar3;
        d dVar2;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        d dVar3;
        c cVar8;
        if (dVar == null) {
            return true;
        }
        dVar.c0 = false;
        e eVar = (e) dVar.D;
        a.e.a.h.f fVar2 = dVar.p;
        if (fVar2 == null) {
            dVar.b0 = true;
            fVar.f245a.add(dVar);
            dVar.p = fVar;
            if (dVar.s.d == null && dVar.u.d == null && dVar.t.d == null && dVar.v.d == null && dVar.w.d == null && dVar.z.d == null) {
                fVar.d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
            }
            if (!(dVar.t.d == null || dVar.v.d == null)) {
                d.a i = eVar.i();
                d.a aVar = d.a.WRAP_CONTENT;
                if (z) {
                    fVar.d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                    return false;
                }
                d dVar4 = dVar.t.d.f238b;
                d dVar5 = dVar.D;
                if (!(dVar4 == dVar5 && dVar.v.d.f238b == dVar5)) {
                    fVar.d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                }
            }
            if (!(dVar.s.d == null || dVar.u.d == null)) {
                d.a e2 = eVar.e();
                d.a aVar2 = d.a.WRAP_CONTENT;
                if (z) {
                    fVar.d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                    return false;
                }
                d dVar6 = dVar.s.d.f238b;
                d dVar7 = dVar.D;
                if (!(dVar6 == dVar7 && dVar.u.d.f238b == dVar7)) {
                    fVar.d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                }
            }
            if (((dVar.e() == d.a.MATCH_CONSTRAINT) ^ (dVar.i() == d.a.MATCH_CONSTRAINT)) && dVar.G != 0.0f) {
                a(dVar);
            } else if (dVar.e() == d.a.MATCH_CONSTRAINT || dVar.i() == d.a.MATCH_CONSTRAINT) {
                fVar.d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
            }
            if (((dVar.s.d == null && dVar.u.d == null) || (((cVar5 = dVar.s.d) != null && cVar5.f238b == dVar.D && dVar.u.d == null) || (((cVar6 = dVar.u.d) != null && cVar6.f238b == dVar.D && dVar.s.d == null) || ((cVar7 = dVar.s.d) != null && cVar7.f238b == (dVar3 = dVar.D) && (cVar8 = dVar.u.d) != null && cVar8.f238b == dVar3)))) && dVar.z.d == null && !(dVar instanceof g) && !(dVar instanceof h)) {
                fVar.f.add(dVar);
            }
            if (((dVar.t.d == null && dVar.v.d == null) || (((cVar = dVar.t.d) != null && cVar.f238b == dVar.D && dVar.v.d == null) || (((cVar2 = dVar.v.d) != null && cVar2.f238b == dVar.D && dVar.t.d == null) || ((cVar3 = dVar.t.d) != null && cVar3.f238b == (dVar2 = dVar.D) && (cVar4 = dVar.v.d) != null && cVar4.f238b == dVar2)))) && dVar.z.d == null && dVar.w.d == null && !(dVar instanceof g) && !(dVar instanceof h)) {
                fVar.g.add(dVar);
            }
            if (dVar instanceof h) {
                fVar.d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
                h hVar = (h) dVar;
                for (int i2 = 0; i2 < hVar.l0; i2++) {
                    if (!a(hVar.k0[i2], fVar, list, z)) {
                        return false;
                    }
                }
            }
            for (c cVar9 : dVar.A) {
                c cVar10 = cVar9.d;
                if (!(cVar10 == null || cVar10.f238b == dVar.D)) {
                    if (cVar9.c == c.C0011c.CENTER) {
                        fVar.d = false;
                        eVar.D0 = false;
                        dVar.b0 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        j jVar = cVar9.f237a;
                        if (!(cVar10 == null || cVar10.d == cVar9)) {
                            cVar10.f237a.f248a.add(jVar);
                        }
                    }
                    if (!a(cVar9.d.f238b, fVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (fVar2 != fVar) {
            fVar.f245a.addAll(fVar2.f245a);
            fVar.f.addAll(dVar.p.f);
            fVar.g.addAll(dVar.p.g);
            if (!dVar.p.d) {
                fVar.d = false;
            }
            list.remove(dVar.p);
            for (d dVar8 : dVar.p.f245a) {
                dVar8.p = fVar;
            }
        }
        return true;
    }
}
