package a.b.p;

public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public int f159a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f160b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f159a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f160b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f159a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f160b = i2;
        }
    }
}
