public class Class32
{
    public int anInt711;
    public static RSString aRSString_712
	= Class134.method1914("rect_debug=", (byte) 17);
    public static RSString aRSString_713
	= Class134.method1914("M-Bmoire attribu-Be", (byte) 36);
    public int anInt714;
    public static int anInt715;
    public static RSString aRSString_716;
    public static RSString aRSString_717;
    public static int anInt718;
    public static int anInt719;
    public static RSString aRSString_720 = Class134.method1914("fr", (byte) 78);
    public static RSString aRSString_721 = Class134.method1914("en", (byte) 36);
    public static RSString aRSString_722
	= Class134.method1914("Jeter", (byte) 48);
    public static int anInt723;
    public static int anInt724;
    public int anInt725;
    public static RSString[] aRSStringArray726;
    
    public static Class24 method284(int arg0, int arg1) {
	Class24 class24
	    = (Class24) Class57.aClass136_1108.method1924((long) arg0, false);
	anInt724++;
	if (class24 != null)
	    return class24;
	byte[] is = Class90.aClass9_1846.method138(-809612665, arg0, arg1);
	class24 = new Class24();
	if (is != null)
	    class24.method222(new Stream(is), (byte) -99, arg0);
	Class57.aClass136_1108.method1926((long) arg0, class24, (byte) -71);
	return class24;
    }
    
    public static void method285(byte arg0) {
	if (arg0 != -105)
	    aRSString_720 = null;
	aRSString_717 = null;
	aRSString_720 = null;
	aRSString_713 = null;
	aRSStringArray726 = null;
	aRSString_721 = null;
	aRSString_716 = null;
	aRSString_722 = null;
	aRSString_712 = null;
    }
    
    public Class67_Sub5_Sub19_Sub1 method286(int arg0) {
	if (arg0 != -6864)
	    return null;
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
	    = ((Class67_Sub5_Sub19_Sub1)
	       Class61.aClass136_1141.method1924((long) anInt711, false));
	anInt719++;
	if (class67_sub5_sub19_sub1 != null)
	    return class67_sub5_sub19_sub1;
	class67_sub5_sub19_sub1
	    = Class55_Sub1.method468(0, Class57.aClass9_1107, false, anInt711);
	if (class67_sub5_sub19_sub1 != null)
	    Class61.aClass136_1141.method1926((long) anInt711,
					      class67_sub5_sub19_sub1,
					      (byte) -71);
	return class67_sub5_sub19_sub1;
    }
    
    public void method287(int arg0, int arg1, Stream arg2) {
	for (;;) {
	    int i = arg2.readByte((byte) -31);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method289(i, arg1, arg2, (byte) 105);
	}
	anInt715++;
	if (arg0 != 2)
	    method284(84, -53);
    }
    
    public static boolean method288(boolean arg0) {
	anInt723++;
	if (arg0 != true)
	    method285((byte) -92);
	return Class113.aBoolean2133;
    }
    
    public void method289(int arg0, int arg1, Stream arg2, byte arg3) {
	int i = 66 % ((47 - arg3) / 50);
	if ((arg0 ^ 0xffffffff) == -2)
	    anInt711 = arg2.readUShort(-2386);
	else if (arg0 == 2) {
	    anInt725 = arg2.readByte((byte) -64);
	    anInt714 = arg2.readByte((byte) -48);
	}
	anInt718++;
    }
    
    static {
	aRSString_716 = Class134.method1914("de", (byte) 89);
	aRSString_717 = Class134.method1914("pt", (byte) 85);
	aRSStringArray726 = new RSString[] { aRSString_721, aRSString_716,
					   aRSString_720, aRSString_717 };
    }
}
