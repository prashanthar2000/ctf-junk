package a.f.e.b;

import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f277a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f278b;

    public f(int i, int i2) {
        this.f277a = new int[]{i, i2};
        this.f278b = new float[]{0.0f, 1.0f};
    }

    public f(int i, int i2, int i3) {
        this.f277a = new int[]{i, i2, i3};
        this.f278b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f277a = new int[size];
        this.f278b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f277a[i] = list.get(i).intValue();
            this.f278b[i] = list2.get(i).floatValue();
        }
    }
}
