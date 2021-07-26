package a.b.p;

import a.b.k.o;
import a.b.l.a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class h extends CheckedTextView {
    public static final int[] c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final y f131b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        u0.a(context);
        y yVar = new y(this);
        this.f131b = yVar;
        yVar.a(attributeSet, 16843720);
        this.f131b.a();
        x0 a2 = x0.a(getContext(), attributeSet, c, 16843720, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.f186b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f131b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o.a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f131b;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
