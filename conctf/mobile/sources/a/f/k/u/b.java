package a.f.k.u;

import a.f.k.u.d;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public class b {
    public static int d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f338a;

    /* renamed from: b  reason: collision with root package name */
    public int f339b = -1;
    public int c = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f340a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<? extends d.a> f341b;
        public final d c;

        static {
            Class<d.c> cls = d.c.class;
            Class<d.b> cls2 = d.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, (CharSequence) null);
            new a(2, (CharSequence) null);
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(16, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(4096, (CharSequence) null);
            new a(8192, (CharSequence) null);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, d.g.class);
            new a(262144, (CharSequence) null);
            new a(524288, (CharSequence) null);
            new a(1048576, (CharSequence) null);
            new a(2097152, (CharSequence) null, d.h.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (d) null, d.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (d) null, d.f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (d) null, d.C0018d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        }

        public a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (d) null, (Class<? extends d.a>) null);
        }

        public a(int i, CharSequence charSequence, Class<? extends d.a> cls) {
            this((Object) null, i, charSequence, (d) null, cls);
        }

        public a(Object obj, int i, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.c = dVar;
            this.f340a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f341b = cls;
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f338a = accessibilityNodeInfo;
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public Bundle a() {
        return this.f338a.getExtras();
    }

    public final List<Integer> a(String str) {
        ArrayList<Integer> integerArrayList = this.f338a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f338a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void a(int i, boolean z) {
        Bundle a2 = a();
        if (a2 != null) {
            int i2 = a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f338a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f338a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f338a)) {
            return false;
        }
        return this.c == bVar.c && this.f339b == bVar.f339b;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f338a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        SpannableString spannableString;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f338a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f338a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f338a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f338a.getClassName());
        sb.append("; text: ");
        if (!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString2 = new SpannableString(TextUtils.substring(this.f338a.getText(), 0, this.f338a.getText().length()));
            for (int i = 0; i < a2.size(); i++) {
                spannableString2.setSpan(new a(a5.get(i).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
            }
            spannableString = spannableString2;
        } else {
            spannableString = this.f338a.getText();
        }
        sb.append(spannableString);
        sb.append("; contentDescription: ");
        sb.append(this.f338a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f338a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f338a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f338a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f338a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f338a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f338a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f338a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f338a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f338a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f338a.isPassword());
        sb.append("; scrollable: " + this.f338a.isScrollable());
        sb.append("; [");
        int actions = this.f338a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= ~numberOfTrailingZeros;
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            sb.append(str);
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
