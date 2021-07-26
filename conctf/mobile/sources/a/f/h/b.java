package a.f.h;

import a.b.k.o;
import a.d.h;
import a.f.h.c;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a.d.f<String, Typeface> f290a = new a.d.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final c f291b = new c("fonts", 10, 10000);
    public static final Object c = new Object();
    public static final h<String, ArrayList<c.C0015c<g>>> d = new h<>();
    public static final Comparator<byte[]> e = new d();

    public static class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f292a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f293b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public a(Context context, a aVar, int i, String str) {
            this.f292a = context;
            this.f293b = aVar;
            this.c = i;
            this.d = str;
        }

        public Object call() {
            g a2 = b.a(this.f292a, this.f293b, this.c);
            Typeface typeface = a2.f301a;
            if (typeface != null) {
                b.f290a.a(this.d, typeface);
            }
            return a2;
        }
    }

    /* renamed from: a.f.h.b$b  reason: collision with other inner class name */
    public static class C0014b implements c.C0015c<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.f.e.b.g f294a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f295b;

        public C0014b(a.f.e.b.g gVar, Handler handler) {
            this.f294a = gVar;
            this.f295b = handler;
        }

        public void a(Object obj) {
            a.f.e.b.g gVar;
            int i;
            g gVar2 = (g) obj;
            if (gVar2 == null) {
                gVar = this.f294a;
                i = 1;
            } else {
                i = gVar2.f302b;
                if (i == 0) {
                    this.f294a.a(gVar2.f301a, this.f295b);
                    return;
                }
                gVar = this.f294a;
            }
            gVar.a(i, this.f295b);
        }
    }

    public static class c implements c.C0015c<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f296a;

        public c(String str) {
            this.f296a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((a.f.h.c.C0015c) r1.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(a.f.h.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = a.f.h.b.c
                monitor-enter(r0)
                a.d.h<java.lang.String, java.util.ArrayList<a.f.h.c$c<a.f.h.b$g>>> r1 = a.f.h.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f296a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                a.d.h<java.lang.String, java.util.ArrayList<a.f.h.c$c<a.f.h.b$g>>> r2 = a.f.h.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f296a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                a.f.h.c$c r2 = (a.f.h.c.C0015c) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.h.b.c.a(a.f.h.b$g):void");
        }
    }

    public static class d implements Comparator<byte[]> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x000b
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x001a
            L_0x000b:
                r0 = 0
                r1 = r0
            L_0x000d:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x0020
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x001d
                byte r5 = r5[r1]
                byte r6 = r6[r1]
            L_0x001a:
                int r0 = r5 - r6
                goto L_0x0020
            L_0x001d:
                int r1 = r1 + 1
                goto L_0x000d
            L_0x0020:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.h.b.d.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f297a;

        /* renamed from: b  reason: collision with root package name */
        public final f[] f298b;

        public e(int i, f[] fVarArr) {
            this.f297a = i;
            this.f298b = fVarArr;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f299a;

        /* renamed from: b  reason: collision with root package name */
        public final int f300b;
        public final int c;
        public final boolean d;
        public final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.f299a = uri;
                this.f300b = i;
                this.c = i2;
                this.d = z;
                this.e = i3;
                return;
            }
            throw null;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f301a;

        /* renamed from: b  reason: collision with root package name */
        public final int f302b;

        public g(Typeface typeface, int i) {
            this.f301a = typeface;
            this.f302b = i;
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [a.f.h.b$f[], android.database.Cursor] */
    public static e a(Context context, CancellationSignal cancellationSignal, a aVar) {
        Cursor cursor;
        boolean z;
        a aVar2 = aVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = aVar2.f288a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(b.a.a.a.a.a("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(aVar2.f289b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, e);
            List<List<byte[]>> list = aVar2.d;
            if (list == null) {
                list = o.a(resources, aVar2.e);
            }
            int i = 0;
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, e);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new e(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar2.c}, (String) null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        arrayList3.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new e(0, (f[]) arrayList3.toArray(new f[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar2.f289b);
        }
    }

    public static g a(Context context, a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = a2.f297a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface a3 = a.f.f.c.f283a.a(context, (CancellationSignal) null, a2.f298b, i);
                if (a3 != null) {
                    i3 = 0;
                }
                return new g(a3, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new g((Typeface) null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r3 = f291b;
        r4 = new a.f.h.b.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r3.b(new a.f.h.d(r3, r1, new android.os.Handler(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, a.f.h.a r3, a.f.e.b.g r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            a.d.f<java.lang.String, android.graphics.Typeface> r1 = f290a
            java.lang.Object r1 = r1.a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0041
            r1 = -1
            if (r7 != r1) goto L_0x0041
            a.f.h.b$g r2 = a((android.content.Context) r2, (a.f.h.a) r3, (int) r8)
            if (r4 == 0) goto L_0x003e
            int r3 = r2.f302b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.f301a
            r4.a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x003e
        L_0x003b:
            r4.a((int) r3, (android.os.Handler) r5)
        L_0x003e:
            android.graphics.Typeface r2 = r2.f301a
            return r2
        L_0x0041:
            a.f.h.b$a r1 = new a.f.h.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0054
            a.f.h.c r3 = f291b     // Catch:{ InterruptedException -> 0x0053 }
            java.lang.Object r3 = r3.a(r1, r7)     // Catch:{ InterruptedException -> 0x0053 }
            a.f.h.b$g r3 = (a.f.h.b.g) r3     // Catch:{ InterruptedException -> 0x0053 }
            android.graphics.Typeface r2 = r3.f301a     // Catch:{ InterruptedException -> 0x0053 }
        L_0x0053:
            return r2
        L_0x0054:
            if (r4 != 0) goto L_0x0058
            r3 = r2
            goto L_0x005d
        L_0x0058:
            a.f.h.b$b r3 = new a.f.h.b$b
            r3.<init>(r4, r5)
        L_0x005d:
            java.lang.Object r4 = c
            monitor-enter(r4)
            a.d.h<java.lang.String, java.util.ArrayList<a.f.h.c$c<a.f.h.b$g>>> r5 = d     // Catch:{ all -> 0x0099 }
            java.lang.Object r5 = r5.getOrDefault(r0, r2)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0071
            if (r3 == 0) goto L_0x006f
            r5.add(r3)     // Catch:{ all -> 0x0099 }
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            return r2
        L_0x0071:
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r5.<init>()     // Catch:{ all -> 0x0099 }
            r5.add(r3)     // Catch:{ all -> 0x0099 }
            a.d.h<java.lang.String, java.util.ArrayList<a.f.h.c$c<a.f.h.b$g>>> r3 = d     // Catch:{ all -> 0x0099 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0099 }
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            a.f.h.c r3 = f291b
            a.f.h.b$c r4 = new a.f.h.b$c
            r4.<init>(r0)
            if (r3 == 0) goto L_0x0098
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            a.f.h.d r6 = new a.f.h.d
            r6.<init>(r3, r1, r5, r4)
            r3.b(r6)
            return r2
        L_0x0098:
            throw r2
        L_0x0099:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.h.b.a(android.content.Context, a.f.h.a, a.f.e.b.g, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.e == 0) {
                Uri uri = fVar.f299a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, o.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
