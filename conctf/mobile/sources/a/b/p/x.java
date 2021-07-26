package a.b.p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public TextView f183a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f184b;

    public x(TextView textView) {
        if (textView != null) {
            this.f183a = textView;
            return;
        }
        throw null;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f184b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f183a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
