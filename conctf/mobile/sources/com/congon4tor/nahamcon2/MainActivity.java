package com.congon4tor.nahamcon2;

import a.b.k.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends e {
    public TextView p;

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f532b;
        public final /* synthetic */ EditText c;

        public a(String str, EditText editText) {
            this.f532b = str;
            this.c = editText;
        }

        public void onClick(View view) {
            String[] strArr = {this.f532b, this.c.getText().toString()};
            new b.b.a.a.a(MainActivity.this).execute(new String[][]{strArr});
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        String string = getString(R.string.encrypted_flag);
        this.p = (TextView) findViewById(R.id.flagTV);
        ((Button) findViewById(R.id.submit)).setOnClickListener(new a(string, (EditText) findViewById(R.id.pin)));
    }
}
