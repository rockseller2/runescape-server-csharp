/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44
{
    public static RSString aRSString_908
	= Class134.method1914("Mem:", (byte) 99);
    public static Class136 aClass136_909 = new Class136(64);
    public static int anInt910;
    public int anInt911;
    public static int anInt912;
    public static int anInt913;
    public static int anInt914;
    public int anInt915;
    public static int anInt916;
    public static int anInt917;
    public static int anInt918;
    public static int anInt919;
    public int anInt920;
    public static int[] anIntArray921 = new int[5];
    public int anInt922;
    public static Class136 aClass136_923;
    public static int[][] anIntArrayArray924
	= { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	    { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
	    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
	    { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
	    { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	    { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
	    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
	    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
	    { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
	    { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
	    { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
	    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
    public static RSString aRSString_925
	= Class134.method1914("niveau ", (byte) 54);
    
    public static RSString method385(boolean arg0, int arg1, int arg2,
				    int arg3) {
	anInt914++;
	if (arg3 < 2 || arg3 > 36)
	    throw new IllegalArgumentException("Invalid radix:" + arg3);
	int i = 1;
	for (int i_0_ = arg2 / arg3; i_0_ != 0; i_0_ /= arg3)
	    i++;
	int i_1_ = i;
	if ((arg2 ^ 0xffffffff) > -1 || arg0)
	    i_1_++;
	byte[] is = new byte[i_1_];
	if ((arg2 ^ 0xffffffff) <= -1) {
	    if (arg0)
		is[0] = (byte) 43;
	} else
	    is[0] = (byte) 45;
	for (int i_2_ = arg1; i > i_2_; i_2_++) {
	    int i_3_ = arg2 % arg3;
	    arg2 /= arg3;
	    if (i_3_ < 0)
		i_3_ = -i_3_;
	    if (i_3_ > 9)
		i_3_ += 39;
	    is[i_1_ - i_2_ - 1] = (byte) (48 + i_3_);
	}
	RSString RSString = new RSString();
	RSString.aByteArray2653 = is;
	RSString.anInt2629 = i_1_;
	return RSString;
    }
    
    public static void method386(int arg0) {
	Class67_Sub5_Sub5.aClass136_4515.method1922(0);
	anInt919++;
	Class33_Sub2.aClass136_2778.method1922(0);
	if (arg0 != 19785)
	    method388((byte) -77);
    }
    
    public static Class67_Sub5_Sub19_Sub1 method387(int arg0, Class9 arg1,
						    int arg2, int arg3) {
	if (arg0 > -117)
	    return null;
	anInt918++;
	if (!Class64.method575((byte) -26, arg3, arg2, arg1))
	    return null;
	return Class67_Sub5_Sub4.method852((byte) 73);
    }
    
    public static void method388(byte arg0) {
	if (arg0 <= -49) {
	    anInt913++;
	    Class67_Sub1_Sub25.aClass136_4226.method1922(0);
	    Class61.aClass136_1141.method1922(0);
	}
    }
    
    public static void method389(boolean arg0) {
	anInt912++;
	Class67_Sub1_Sub7.aClass136_3908.method1922(0);
	Class133.aClass136_2456.method1922(0);
	if (arg0 != false)
	    aClass136_923 = null;
	Class131_Sub7_Sub2.aClass136_5073.method1922(0);
    }
    
    public static void method390(int arg0, int arg1) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[0][arg0][arg1];
	for (int i = 0; i < 3; i++) {
	    Class67_Sub24 class67_sub24_4_
		= (Class76.aClass67_Sub24ArrayArrayArray1578[i][arg0][arg1]
		   = (Class76.aClass67_Sub24ArrayArrayArray1578[i + 1][arg0]
		      [arg1]));
	    if (class67_sub24_4_ != null) {
		class67_sub24_4_.anInt3232--;
		for (int i_5_ = 0; i_5_ < class67_sub24_4_.anInt3215; i_5_++) {
		    Class36 class36 = class67_sub24_4_.aClass36Array3229[i_5_];
		    if ((class36.aLong785 >> 29 & 0x3L) == 2L
			&& class36.anInt765 == arg0
			&& class36.anInt777 == arg1)
			class36.anInt787--;
		}
	    }
	}
	if (Class76.aClass67_Sub24ArrayArrayArray1578[0][arg0][arg1] == null)
	    Class76.aClass67_Sub24ArrayArrayArray1578[0][arg0][arg1]
		= new Class67_Sub24(0, arg0, arg1);
	Class76.aClass67_Sub24ArrayArrayArray1578[0][arg0][arg1]
	    .aClass67_Sub24_3233
	    = class67_sub24;
	Class76.aClass67_Sub24ArrayArrayArray1578[3][arg0][arg1] = null;
    }
    
    public static Class80 method391(boolean arg0) {
	anInt917++;
	if (arg0 != true)
	    method393(13, 125, 102, 100, null);
	try {
	    return (Class80) Class.forName("Class80_Sub1").newInstance();
	} catch (Throwable throwable) {
	    return null;
	}
    }
    
    public static void method392(byte arg0) {
	anIntArrayArray924 = null;
	anIntArray921 = null;
	if (arg0 <= 93)
	    method385(true, -65, 46, 66);
	aClass136_909 = null;
	aClass136_923 = null;
	aRSString_908 = null;
	aRSString_925 = null;
    }
    
    public static void method393(int arg0, int arg1, int arg2, int arg3,
				 Class65 arg4) {
	anInt910++;
	if (arg2 > -14)
	    method391(false);
	for (Class67_Sub10 class67_sub10
		 = (Class67_Sub10) Class92.aClass50_1868.method445(0);
	     class67_sub10 != null;
	     class67_sub10
		 = (Class67_Sub10) Class92.aClass50_1868.method432(0)) {
	    if (class67_sub10.anInt3006 == arg0
		&& 128 * arg3 == class67_sub10.anInt2997
		&& class67_sub10.anInt3007 == arg1 * 128
		&& ((class67_sub10.aClass65_2992.lastLoadedObjectId ^ 0xffffffff)
		    == (arg4.lastLoadedObjectId ^ 0xffffffff))) {
		if (class67_sub10.aClass67_Sub11_Sub3_2994 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(class67_sub10.aClass67_Sub11_Sub3_2994);
		    class67_sub10.aClass67_Sub11_Sub3_2994 = null;
		}
		if (class67_sub10.aClass67_Sub11_Sub3_3004 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(class67_sub10.aClass67_Sub11_Sub3_3004);
		    class67_sub10.aClass67_Sub11_Sub3_3004 = null;
		}
		class67_sub10.method606((byte) -118);
		break;
	    }
	}
    }
    
    public Class44() {
	/* empty */
    }
    
    public Class44(Class44 arg0) {
	anInt915 = arg0.anInt915;
	anInt922 = arg0.anInt922;
	anInt920 = arg0.anInt920;
	anInt911 = arg0.anInt911;
    }
    
    static {
	aClass136_923 = new Class136(4);
    }
}
