/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75 implements Interface3
{
    public boolean[] aBooleanArray2690;
    public static int anInt2691;
    public byte[] aByteArray2692;
    public byte[] aByteArray2693;
    public static RSString aRSString_2694
	= Class134.method1914("Loaded input handler", (byte) 117);
    public static RSString aRSString_2695;
    public byte[] aByteArray2696;
    public boolean[] aBooleanArray2697;
    public boolean[] aBooleanArray2698;
    public static int anInt2699;
    public Class137 aClass137_2700;
    public static int[][][] anIntArrayArrayArray2701 = new int[2][][];
    public byte[] aByteArray2702;
    public Class9 aClass9_2703;
    public static byte[][] aByteArrayArray2704;
    public boolean[] aBooleanArray2705;
    public int anInt2706 = 50;
    public static int anInt2707;
    public static int anInt2708;
    public short[] aShortArray2709;
    public static RSString aRSString_2710
	= (Class134.method1914
	   ("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3",
	    (byte) 29));
    public static int anInt2711;
    public static int anInt2712;
    public static int[] anIntArray2713 = new int[256];
    public static int anInt2714;
    public static int anInt2715;
    public static int anInt2716;
    public static int anInt2717;
    public Class9 aClass9_2718;
    public static int anInt2719;
    public boolean[] aBooleanArray2720;
    public static int anInt2721;
    public boolean aBoolean2722 = false;
    public static boolean aBoolean2723;
    public static int anInt2724;
    public Class137 aClass137_2725;
    public static int anInt2726;
    
    public int method12(byte arg0, int arg1) {
	anInt2712++;
	if (arg0 > -116)
	    return -112;
	return aShortArray2709[arg1] & 0xffff;
    }
    
    public void method1375(int arg0, boolean arg1) {
	int i = 43 % ((arg0 - -12) / 61);
	aBoolean2722 = arg1;
	method1377(0);
	anInt2719++;
    }
    
    public boolean method10(int arg0, byte arg1) {
	anInt2708++;
	if (arg1 != -95)
	    return true;
	Class67_Sub5_Sub16 class67_sub5_sub16 = method1376((byte) 120, arg0);
	if (class67_sub5_sub16 == null)
	    return false;
	return class67_sub5_sub16.method982(aClass9_2718, (byte) -105, this);
    }
    
    public Class67_Sub5_Sub16 method1376(byte arg0, int arg1) {
	anInt2717++;
	Class67_Sub5_Sub16 class67_sub5_sub16
	    = ((Class67_Sub5_Sub16)
	       aClass137_2700.method1930(261775, (long) arg1));
	if (class67_sub5_sub16 != null)
	    return class67_sub5_sub16;
	byte[] is = aClass9_2703.method138(-809612665, 0, arg1);
	if (is == null)
	    return null;
	Stream Stream = new Stream(is);
	if (arg0 <= 59)
	    anIntArrayArrayArray2701 = null;
	class67_sub5_sub16 = new Class67_Sub5_Sub16(Stream);
	aClass137_2700.method1932((long) arg1, 0, class67_sub5_sub16);
	return class67_sub5_sub16;
    }
    
    public void method1377(int arg0) {
	if (arg0 != 0)
	    aByteArray2696 = null;
	anInt2711++;
	aClass137_2700.method1934(arg0 + 20);
	if (aClass137_2725 != null)
	    aClass137_2725.method1934(arg0 + 20);
    }
    
    public boolean method13(int arg0, int arg1) {
	anInt2691++;
	if (arg0 != 0)
	    return true;
	return aBooleanArray2690[arg1];
    }
    
    public int[] method9(int arg0, int arg1) {
	anInt2714++;
	Class67_Sub5_Sub16 class67_sub5_sub16 = method1376((byte) 122, arg1);
	int i = 96 % ((15 - arg0) / 36);
	if (class67_sub5_sub16 == null)
	    return null;
	return class67_sub5_sub16.method988((aBoolean2722
					     || aBooleanArray2720[arg1]),
					    (byte) 120, this, aClass9_2718);
    }
    
    public boolean method7(int arg0, int arg1) {
	anInt2699++;
	if (aBoolean2722 || aBooleanArray2720[arg0])
	    return true;
	if (arg1 != 0)
	    return true;
	return false;
    }
    
    public int[] method11(int arg0, float arg1, int arg2) {
	if (arg2 != 15964)
	    aByteArray2702 = null;
	Class67_Sub5_Sub16 class67_sub5_sub16 = method1376((byte) 123, arg0);
	anInt2715++;
	if (class67_sub5_sub16 == null)
	    return null;
	class67_sub5_sub16.aBoolean4773 = true;
	return class67_sub5_sub16.method989(aClass9_2718, this, arg2 + -46777,
					    arg1,
					    (aBoolean2722
					     || aBooleanArray2720[arg0]));
    }
    
    public void method1378(int arg0, byte arg1) {
	if (arg1 == -33) {
	    for (Class67_Sub5_Sub16 class67_sub5_sub16
		     = (Class67_Sub5_Sub16) aClass137_2700.method1931(3);
		 class67_sub5_sub16 != null;
		 class67_sub5_sub16 = ((Class67_Sub5_Sub16)
				       aClass137_2700.method1929((byte) 88))) {
		if (class67_sub5_sub16.aBoolean4773) {
		    class67_sub5_sub16.method986(true, arg0);
		    class67_sub5_sub16.aBoolean4773 = false;
		}
	    }
	    anInt2707++;
	}
    }
    
    public static int method1379(int arg0, int arg1) {
	return arg0 & arg1;
    }
    
    public boolean method8(int arg0, int arg1) {
	if (arg0 != 0)
	    method7(-93, 58);
	anInt2721++;
	return aBooleanArray2705[arg1];
    }
    
    public static void method1380(boolean arg0) {
	if (arg0 != false)
	    anIntArrayArrayArray2701 = null;
	aRSString_2694 = null;
	aByteArrayArray2704 = null;
	aRSString_2695 = null;
	anIntArray2713 = null;
	aRSString_2710 = null;
	anIntArrayArrayArray2701 = null;
    }
    
    public static void method1381(boolean arg0) {
	anInt2724++;
	if (arg0 == false) {
	    for (int i = 0; (Class37.anInt794 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_0_ = Class47.anIntArray965[i];
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = Class128.aClass131_Sub7_Sub1Array2386[i_0_];
		if (class131_sub7_sub1 != null)
		    Class50.method435(-1, (class131_sub7_sub1.aClass64_5047
					   .anInt1211), class131_sub7_sub1);
	    }
	}
    }
    
    public Class75(Class9 arg0, Class9 arg1, Class9 arg2, int arg3,
		   boolean arg4) {
	try {
	    aBoolean2722 = arg4;
	    aClass9_2703 = arg0;
	    anInt2706 = arg3;
	    aClass9_2718 = arg2;
	    aClass137_2700 = new Class137(anInt2706);
	    aClass137_2725 = null;
	    Stream Stream
		= new Stream(arg1.method138(-809612665, 0, 0));
	    int i = Stream.readUShort(-2386);
	    aByteArray2693 = new byte[i];
	    aByteArray2692 = new byte[i];
	    aBooleanArray2720 = new boolean[i];
	    aBooleanArray2698 = new boolean[i];
	    aBooleanArray2690 = new boolean[i];
	    aByteArray2702 = new byte[i];
	    aBooleanArray2705 = new boolean[i];
	    aBooleanArray2697 = new boolean[i];
	    aByteArray2696 = new byte[i];
	    aShortArray2709 = new short[i];
	    for (int i_1_ = 0; (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
		aBooleanArray2697[i_1_] = (Stream.readByte((byte) -126)
					   ^ 0xffffffff) == -2;
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		if (aBooleanArray2697[i_2_])
		    aBooleanArray2705[i_2_]
			= ((Stream.readByte((byte) 106) ^ 0xffffffff)
			   == -2);
	    }
	    for (int i_3_ = 0; i > i_3_; i_3_++) {
		if (aBooleanArray2697[i_3_])
		    aBooleanArray2690[i_3_]
			= ((Stream.readByte((byte) 86) ^ 0xffffffff)
			   == -2);
	    }
	    for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		 i_4_++) {
		if (aBooleanArray2697[i_4_])
		    aBooleanArray2720[i_4_]
			= ((Stream.readByte((byte) -88) ^ 0xffffffff)
			   == -2);
	    }
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_5_++) {
		if (aBooleanArray2697[i_5_])
		    aBooleanArray2698[i_5_]
			= Stream.readByte((byte) -112) == 1;
	    }
	    for (int i_6_ = 0; i > i_6_; i_6_++) {
		if (aBooleanArray2697[i_6_])
		    aByteArray2693[i_6_] = Stream.readByte2((byte) 1);
	    }
	    for (int i_7_ = 0; i_7_ < i; i_7_++) {
		if (aBooleanArray2697[i_7_])
		    aByteArray2702[i_7_] = Stream.readByte2((byte) 1);
	    }
	    for (int i_8_ = 0; i > i_8_; i_8_++) {
		if (aBooleanArray2697[i_8_])
		    aByteArray2696[i_8_] = Stream.readByte2((byte) 1);
	    }
	    for (int i_9_ = 0; i > i_9_; i_9_++) {
		if (aBooleanArray2697[i_9_])
		    aByteArray2692[i_9_] = Stream.readByte2((byte) 1);
	    }
	    for (int i_10_ = 0; i > i_10_; i_10_++) {
		if (aBooleanArray2697[i_10_])
		    aShortArray2709[i_10_]
			= (short) Stream.readUShort(-2386);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("kg.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ')'));
	}
    }
    
    static {
	aRSString_2695 = aRSString_2694;
	anInt2716 = 0;
	anInt2726 = 0;
    }
}
