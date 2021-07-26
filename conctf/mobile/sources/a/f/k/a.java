package a.f.k;

import a.f.k.u.b;
import a.f.k.u.c;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f312a = c;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f313b = new C0017a(this);

    /* renamed from: a.f.k.a$a  reason: collision with other inner class name */
    public static final class C0017a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f314a;

        public C0017a(a aVar) {
            this.f314a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f314a.f312a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f314a.f312a.getAccessibilityNodeProvider(view);
            c cVar = accessibilityNodeProvider != null ? new c(accessibilityNodeProvider) : null;
            if (cVar != null) {
                return (AccessibilityNodeProvider) cVar.f342a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f314a.a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            View view2 = view;
            b bVar = new b(accessibilityNodeInfo);
            boolean j = k.j(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f338a.setScreenReaderFocusable(j);
            } else {
                bVar.a(1, j);
            }
            Boolean bool = (Boolean) new n(a.f.b.tag_accessibility_heading, Boolean.class, 28).b(view2);
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f338a.setHeading(booleanValue);
            } else {
                bVar.a(2, booleanValue);
            }
            CharSequence charSequence = (CharSequence) new m(a.f.b.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view2);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f338a.setPaneTitle(charSequence);
            } else {
                bVar.f338a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            this.f314a.a(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (Build.VERSION.SDK_INT < 26) {
                bVar.f338a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                bVar.f338a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                bVar.f338a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                bVar.f338a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(a.f.b.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] a2 = b.a(text);
                if (a2 != null && a2.length > 0) {
                    bVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.f.b.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(a.f.b.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(a.f.b.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i4 = 0; i4 < a2.length; i4++) {
                        ClickableSpan clickableSpan = a2[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = b.d;
                                b.d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(a2[i4]));
                        ClickableSpan clickableSpan2 = a2[i4];
                        Spanned spanned = (Spanned) text;
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view2.getTag(a.f.b.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                bVar.f338a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((b.a) list.get(i6)).f340a);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f314a.f312a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f314a.f312a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f314a.a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f314a.f312a.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f314a.f312a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, b bVar) {
        this.f312a.onInitializeAccessibilityNodeInfo(view, bVar.f338a);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f312a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            int r0 = a.f.b.tag_accessibility_actions
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000e
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000e:
            r1 = 0
            r2 = r1
        L_0x0010:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0073
            java.lang.Object r3 = r0.get(r2)
            a.f.k.u.b$a r3 = (a.f.k.u.b.a) r3
            java.lang.Object r4 = r3.f340a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            if (r4 != r10) goto L_0x0070
            a.f.k.u.d r0 = r3.c
            if (r0 == 0) goto L_0x0073
            java.lang.Class<? extends a.f.k.u.d$a> r0 = r3.f341b
            r2 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0043 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0043 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r0 = r0.newInstance(r4)     // Catch:{ Exception -> 0x0043 }
            a.f.k.u.d$a r0 = (a.f.k.u.d.a) r0     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0068
        L_0x0040:
            throw r2     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r2 = move-exception
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0047:
            java.lang.Class<? extends a.f.k.u.d$a> r4 = r3.f341b
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "null"
            goto L_0x0052
        L_0x004e:
            java.lang.String r4 = r4.getName()
        L_0x0052:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r2)
        L_0x0068:
            r2 = r0
        L_0x0069:
            a.f.k.u.d r0 = r3.c
            boolean r0 = r0.a(r9, r2)
            goto L_0x0074
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0073:
            r0 = r1
        L_0x0074:
            if (r0 != 0) goto L_0x007c
            android.view.View$AccessibilityDelegate r0 = r8.f312a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L_0x007c:
            if (r0 != 0) goto L_0x00cb
            int r2 = a.f.b.accessibility_action_clickable_span
            if (r10 != r2) goto L_0x00cb
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            int r11 = a.f.b.tag_accessibility_clickable_spans
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00ca
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00ca
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00c3
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = a.f.k.u.b.a((java.lang.CharSequence) r11)
            r2 = r1
        L_0x00b1:
            if (r11 == 0) goto L_0x00c3
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00c3
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00c0
            r11 = r0
            goto L_0x00c4
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x00b1
        L_0x00c3:
            r11 = r1
        L_0x00c4:
            if (r11 == 0) goto L_0x00ca
            r10.onClick(r9)
            r1 = r0
        L_0x00ca:
            r0 = r1
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.k.a.a(android.view.View, int, android.os.Bundle):boolean");
    }
}
