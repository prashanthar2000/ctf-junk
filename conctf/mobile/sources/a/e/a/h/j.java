package a.e.a.h;

import a.e.a.e;
import a.e.a.g;
import a.e.a.h.c;
import b.a.a.a.a;

public class j extends l {
    public c c;
    public j d;
    public float e;
    public j f;
    public float g;
    public int h = 0;
    public j i;
    public k j = null;
    public int k = 1;
    public k l = null;
    public int m = 1;

    public j(c cVar) {
        this.c = cVar;
    }

    public String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(e eVar) {
        g gVar = this.c.i;
        j jVar = this.f;
        if (jVar == null) {
            eVar.a(gVar, (int) (this.g + 0.5f));
        } else {
            eVar.a(gVar, eVar.a((Object) jVar.c), (int) (this.g + 0.5f), 6);
        }
    }

    public void a(j jVar, float f2) {
        if (this.f249b == 0 || !(this.f == jVar || this.g == f2)) {
            this.f = jVar;
            this.g = f2;
            if (this.f249b == 1) {
                b();
            }
            a();
        }
    }

    public void d() {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        j jVar6;
        j jVar7;
        float f2;
        float f3;
        float f4;
        j jVar8;
        float f5;
        boolean z = true;
        if (this.f249b != 1 && this.h != 4) {
            k kVar = this.j;
            if (kVar != null) {
                if (kVar.f249b == 1) {
                    this.e = ((float) this.k) * kVar.c;
                } else {
                    return;
                }
            }
            k kVar2 = this.l;
            if (kVar2 != null) {
                if (kVar2.f249b == 1) {
                    float f6 = kVar2.c;
                } else {
                    return;
                }
            }
            if (this.h == 1 && ((jVar8 = this.d) == null || jVar8.f249b == 1)) {
                j jVar9 = this.d;
                if (jVar9 == null) {
                    this.f = this;
                    f5 = this.e;
                } else {
                    this.f = jVar9.f;
                    f5 = jVar9.g + this.e;
                }
                this.g = f5;
                a();
                return;
            }
            if (this.h == 2 && (jVar4 = this.d) != null && jVar4.f249b == 1 && (jVar5 = this.i) != null && (jVar6 = jVar5.d) != null && jVar6.f249b == 1) {
                this.f = jVar4.f;
                jVar5.f = jVar6.f;
                c.C0011c cVar = this.c.c;
                int i2 = 0;
                if (!(cVar == c.C0011c.RIGHT || cVar == c.C0011c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f2 = this.d.g;
                    jVar7 = this.i.d;
                } else {
                    f2 = this.i.d.g;
                    jVar7 = this.d;
                }
                float f7 = f2 - jVar7.g;
                c cVar2 = this.c;
                c.C0011c cVar3 = cVar2.c;
                if (cVar3 == c.C0011c.LEFT || cVar3 == c.C0011c.RIGHT) {
                    f4 = f7 - ((float) this.c.f238b.j());
                    f3 = this.c.f238b.V;
                } else {
                    f4 = f7 - ((float) cVar2.f238b.d());
                    f3 = this.c.f238b.W;
                }
                int a2 = this.c.a();
                int a3 = this.i.c.a();
                if (this.c.d == this.i.c.d) {
                    f3 = 0.5f;
                    a3 = 0;
                } else {
                    i2 = a2;
                }
                float f8 = (float) i2;
                float f9 = (float) a3;
                float f10 = (f4 - f8) - f9;
                if (z) {
                    j jVar10 = this.i;
                    jVar10.g = (f10 * f3) + jVar10.d.g + f9;
                    this.g = (this.d.g - f8) - ((1.0f - f3) * f10);
                } else {
                    this.g = (f10 * f3) + this.d.g + f8;
                    j jVar11 = this.i;
                    jVar11.g = (jVar11.d.g - f9) - ((1.0f - f3) * f10);
                }
            } else if (this.h == 3 && (jVar = this.d) != null && jVar.f249b == 1 && (jVar2 = this.i) != null && (jVar3 = jVar2.d) != null && jVar3.f249b == 1) {
                this.f = jVar.f;
                jVar2.f = jVar3.f;
                this.g = jVar.g + this.e;
                jVar2.g = jVar3.g + jVar2.e;
            } else if (this.h == 5) {
                this.c.f238b.n();
                return;
            } else {
                return;
            }
            a();
            this.i.a();
        }
    }

    public void e() {
        this.f249b = 0;
        this.f248a.clear();
        this.d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.f249b != 1) {
            sb = a.a("{ ");
            sb.append(this.c);
            str = " UNRESOLVED} type: ";
        } else if (this.f == this) {
            sb = a.a("[");
            sb.append(this.c);
            sb.append(", RESOLVED: ");
            sb.append(this.g);
            str = "]  type: ";
        } else {
            sb = a.a("[");
            sb.append(this.c);
            sb.append(", RESOLVED: ");
            sb.append(this.f);
            sb.append(":");
            sb.append(this.g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(a(this.h));
        return sb.toString();
    }

    public void a(int i2, j jVar, int i3) {
        this.h = i2;
        this.d = jVar;
        this.e = (float) i3;
        jVar.f248a.add(this);
    }

    public void a(j jVar, int i2) {
        this.d = jVar;
        this.e = (float) i2;
        jVar.f248a.add(this);
    }

    public void a(j jVar, int i2, k kVar) {
        this.d = jVar;
        jVar.f248a.add(this);
        this.j = kVar;
        this.k = i2;
        kVar.f248a.add(this);
    }
}
