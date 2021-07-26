package a.e.a.h;

import a.e.a.c;
import java.util.ArrayList;

public class n extends d {
    public ArrayList<d> k0 = new ArrayList<>();

    public void a(c cVar) {
        super.a(cVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).a(cVar);
        }
    }

    public void b(int i, int i2) {
        this.O = i;
        this.P = i2;
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).b(this.I + this.O, this.J + this.P);
        }
    }

    public void l() {
        this.k0.clear();
        super.l();
    }

    public void o() {
        int i = this.I;
        int i2 = this.J;
        this.M = i;
        this.N = i2;
        ArrayList<d> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = this.k0.get(i3);
                dVar.b(this.M + this.O, this.N + this.P);
                if (!(dVar instanceof e)) {
                    dVar.o();
                }
            }
        }
    }

    public void p() {
        o();
        ArrayList<d> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.k0.get(i);
                if (dVar instanceof n) {
                    ((n) dVar).p();
                }
            }
        }
    }
}
