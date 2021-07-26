package a.g.a;

import a.g.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f350b;
    public boolean c;
    public Cursor d;
    public Context e;
    public int f;
    public C0020a g;
    public DataSetObserver h;
    public b i;

    /* renamed from: a.g.a.a$a  reason: collision with other inner class name */
    public class C0020a extends ContentObserver {
        public C0020a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.c && (cursor = aVar.d) != null && !cursor.isClosed()) {
                aVar.f350b = aVar.d.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f350b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f350b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.c = true;
        } else {
            this.c = false;
        }
        z2 = cursor == null ? false : z2;
        this.d = cursor;
        this.f350b = z2;
        this.e = context;
        this.f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.g = new C0020a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z2) {
            C0020a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public void a(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0020a aVar = this.g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.d = cursor;
            if (cursor != null) {
                C0020a aVar2 = this.g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f = cursor.getColumnIndexOrThrow("_id");
                this.f350b = true;
                notifyDataSetChanged();
            } else {
                this.f = -1;
                this.f350b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence b(Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.f350b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f350b) {
            return null;
        }
        this.d.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.l.inflate(cVar.k, viewGroup, false);
        }
        a(view, this.e, this.d);
        return view;
    }

    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b(this);
        }
        return this.i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f350b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f350b || (cursor = this.d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.d.getLong(this.f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f350b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.d.moveToPosition(i2)) {
            if (view == null) {
                view = a(this.e, this.d, viewGroup);
            }
            a(view, this.e, this.d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }
}
