package b.a.a.a;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
public class a {
    public static String a(String str, String str2) {
        return str + str2;
    }

    public static String a(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
