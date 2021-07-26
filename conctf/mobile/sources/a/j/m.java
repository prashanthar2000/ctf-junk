package a.j;

import androidx.lifecycle.LiveData;

public class m<T> extends LiveData<T> {
    public void a(T t) {
        LiveData.a("setValue");
        this.f++;
        this.d = t;
        b((LiveData<T>.a) null);
    }
}
