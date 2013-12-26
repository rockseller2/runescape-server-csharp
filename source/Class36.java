public class Class36
{
    public int anInt765;
    public static RSString aRSString_766;
    public int anInt767;
    public static int anInt768;
    public static Class7 aClass7_769;
    public int anInt770;
    public static boolean aBoolean771 = false;
    public static RSString aRSString_772;
    public static int anInt773 = 0;
    public static Class9 aClass9_774;
    public static int anInt775;
    public int anInt776;
    public int anInt777;
    public int anInt778;
    public static int[] anIntArray779;
    public static int anInt780;
    public static RSString aRSString_781;
    public int anInt782;
    public int anInt783;
    public int anInt784;
    public long aLong785 = 0L;
    public static int anInt786;
    public int anInt787;
    public static int[] anIntArray788;
    public int anInt789;
    public Class131 aClass131_790;
    
    public static int method314(int arg0, byte arg1) {
	anInt768++;
	if (arg1 != -95)
	    anIntArray788 = null;
	return 0x3ff & arg0;
    }
    
    public static void method315(int arg0) {
	aRSString_766 = null;
	aRSString_772 = null;
	anIntArray779 = null;
	if (arg0 != 1023)
	    anIntArray788 = null;
	aClass7_769 = null;
	anIntArray788 = null;
	aRSString_781 = null;
	aClass9_774 = null;
    }
    
    public static int method316(int arg0, int arg1) {
	if (arg0 >= -109)
	    return -63;
	anInt786++;
	if (arg1 == 16711935)
	    return -1;
	return Class67_Sub5_Sub8.method881((byte) -117, arg1);
    }
    
    public static byte[] method317(byte[] arg0, boolean arg1) {
	anInt780++;
	Stream Stream = new Stream(arg0);
	int i = Stream.readByte((byte) -68);
	if (arg1 != false)
	    method318(false, 118, 81, 31);
	int i_0_ = Stream.readInt((byte) 125);
	if ((i_0_ ^ 0xffffffff) > -1
	    || ((Class67_Sub5_Sub3.anInt4494 ^ 0xffffffff) != -1
		&& Class67_Sub5_Sub3.anInt4494 < i_0_))
	    throw new RuntimeException();
	if (i != 0) {
	    int i_1_ = Stream.readInt((byte) 126);
	    if (i_1_ < 0 || ((Class67_Sub5_Sub3.anInt4494 ^ 0xffffffff) != -1
			     && Class67_Sub5_Sub3.anInt4494 < i_1_))
		throw new RuntimeException();
	    byte[] is = new byte[i_1_];
	    if (i != 1)
		Class144.aClass14_2603.method157(is, (byte) -118,
						 Stream);
	    else
		Class110.method1586(is, i_1_, arg0, i_0_, 9);
	    return is;
	}
	byte[] is = new byte[i_0_];
	Stream.readBytes(i_0_, 0, -2, is);
	return is;
    }
    
    public static int method318(boolean arg0, int arg1, int arg2, int arg3) {
	anInt775++;
	if ((Class120.aByteArrayArrayArray2284[arg2][arg1][arg3] & 0x8) != 0)
	    return 0;
	if (arg2 > 0
	    && (0x2 & Class120.aByteArrayArrayArray2284[1][arg1][arg3]) != 0)
	    return -1 + arg2;
	if (arg0 != false)
	    aRSString_766 = null;
	return arg2;
    }
    
    static {
	aRSString_772 = Class134.method1914("mem=", (byte) 30);
	anIntArray779 = new int[1000];
	aRSString_766 = Class134.method1914("Veuillez commencer par supprimer ",
					   (byte) 62);
	aRSString_781 = Class134.method1914("", (byte) 17);
	anIntArray788 = new int[14];
    }
}
