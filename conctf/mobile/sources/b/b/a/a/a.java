package b.b.a.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.congon4tor.nahamcon2.MainActivity;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a extends AsyncTask<String[], Integer, String> {

    /* renamed from: a  reason: collision with root package name */
    public MainActivity f531a;

    public a(MainActivity mainActivity) {
        this.f531a = mainActivity;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }

    public Object doInBackground(Object[] objArr) {
        String[][] strArr = (String[][]) objArr;
        String str = strArr[0][0];
        String str2 = strArr[0][1];
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update("5up3r_53cur3_53cr37".getBytes("UTF-8"));
            instance.update(str2.getBytes("UTF-8"));
            return new String(a(Base64.decode(str, 0), new BigInteger(1, instance.digest()).toString(16).getBytes()));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "Error decrypting";
        }
    }

    public void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        this.f531a.p.setText(str);
    }
}
