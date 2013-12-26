public class Class12
{
    public static int anInt416;
    public static int anInt417;
    public static Class9 aClass9_418;
    public static int anInt419;
    public static int anInt420 = 0;
    public static RSString aRSString_421
	= Class134.method1914("<br>", (byte) 83);
    public static int anInt422;
    public static int anInt423;
    public static int anInt424;
    
    public static void updateSeenPlayers(boolean arg0) {
	anInt419++;
	int i = Class54.aPacketStream_1069.readBits((byte) 9, 8); //Bit 8 contains size for all players currently seen.
	if (Class67_Sub1_Sub4.anInt3855 > i) {
	    for (int i_0_ = i; i_0_ < Class67_Sub1_Sub4.anInt3855; i_0_++)
		Class67_Sub1_Sub2.anIntArray3830[Class55_Sub3.anInt2807++]
		    = Class3.anIntArray120[i_0_];
	}
	if ((Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff) > (i ^ 0xffffffff))
	    throw new RuntimeException("gppov1");
	Class67_Sub1_Sub4.anInt3855 = 0;
	for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++) {
	    int i_2_ = Class3.anIntArray120[i_1_];
	    Class131_Sub7_Sub2 class131_sub7_sub2 = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_2_];
	    int i_3_ = Class54.aPacketStream_1069.readBits((byte) 9, 1); 	//Bit 1 = control bit.
	    if (i_3_ == 0) {									//Bit 1 and Value 0 = Exit pretty much
		Class3.anIntArray120[Class67_Sub1_Sub4.anInt3855++] = i_2_;
		class131_sub7_sub2.anInt3789 = Class67_Sub1_Sub9.anInt3952;
	    } else {
		int i_4_ = Class54.aPacketStream_1069.readBits((byte) 9, 2);  //Bit 2 = deeper control bit.
		if (i_4_ == 0) {								//Bit 2 and Value 0 =  No sprite on character yet.
		    Class3.anIntArray120[Class67_Sub1_Sub4.anInt3855++] = i_2_;
		    class131_sub7_sub2.anInt3789 = Class67_Sub1_Sub9.anInt3952;
		    Class61.anIntArray1142[Class126_Sub2.anInt3439++] = i_2_;
		} else if (i_4_ == 1) {								//Bit 2 and Value 1 = sprite [primary only]
		    Class3.anIntArray120[Class67_Sub1_Sub4.anInt3855++] = i_2_;
		    class131_sub7_sub2.anInt3789 = Class67_Sub1_Sub9.anInt3952;
		    int i_5_ = Class54.aPacketStream_1069.readBits((byte) 9,	3);	//Bit 3 primary sprite
		    class131_sub7_sub2.method1886(i_5_, 1, 3);
		    int i_6_ = Class54.aPacketStream_1069.readBits((byte) 9,  1); //Bit 1 is update required. ermm seems to just exit.
		    if (i_6_ == 1)
			Class61.anIntArray1142[Class126_Sub2.anInt3439++] = i_2_;
		} else if (i_4_ == 2) {								//Bit 2 and Value 2 = two sprite updates [primary/secondary]
		    Class3.anIntArray120[Class67_Sub1_Sub4.anInt3855++] = i_2_;
		    class131_sub7_sub2.anInt3789 = Class67_Sub1_Sub9.anInt3952;
		    if (Class54.aPacketStream_1069.readBits((byte) 9, 1) == 1) {		//Bit 1 = another control bit [1 = 3 more readBits / 0 =  1 readBit]
			int i_7_ = Class54.aPacketStream_1069.readBits((byte) 9, 3);		//Bit 3 Primary sprite
			class131_sub7_sub2.method1886(i_7_, 2, 3);
			int i_8_ = Class54.aPacketStream_1069.readBits((byte) 9, 3);		//Bit 3 Secondary sprite
			class131_sub7_sub2.method1886(i_8_, 2, 3);
		    } else {
			int i_9_ = Class54.aPacketStream_1069.readBits((byte) 9, 3);		//Idk what this is..
			class131_sub7_sub2.method1886(i_9_, 0, 3);				//Update required?
		    }
		    int i_10_ = Class54.aPacketStream_1069.readBits((byte) 9,  1);
		    if (i_10_ == 1)
			Class61.anIntArray1142[Class126_Sub2.anInt3439++]  = i_2_;
		} else if (i_4_ == 3)								//Bit 2 and Value 3 = Delete player.
		    Class67_Sub1_Sub2.anIntArray3830[Class55_Sub3.anInt2807++] = i_2_;
	    }
	}
	if (arg0 != false)
	    anInt420 = 40;
    }
    
    public static void method148(Class9 arg0, Interface4 arg1, int arg2,
				 Class9 arg3) {
	try {
	    Class67_Sub1_Sub27.aClass9_4248 = arg3;
	    Class67_Sub15.anInterface4_3075 = arg1;
	    if (arg2 != 1)
		anInt424 = -94;
	    Class1.aClass9_98 = arg0;
	    if (Class67_Sub1_Sub27.aClass9_4248 != null)
		Class67_Sub1_Sub4.anInt3863
		    = Class67_Sub1_Sub27.aClass9_4248.method135(1, arg2 + 6);
	    if (Class1.aClass9_98 != null)
		Class101.anInt1984 = Class1.aClass9_98.method135(1, 13);
	    anInt416++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("bc.E(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method149(int arg0) {
	aClass9_418 = null;
	aRSString_421 = null;
	if (arg0 != 1)
	    anInt417 = -101;
    }
    
    public static boolean method150(int arg0, int arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -12)
	    arg2 = 10;
	int i = -20 / ((arg1 - -55) / 36);
	if (arg2 >= 5 && (arg2 ^ 0xffffffff) >= -9)
	    arg2 = 4;
	Class65 class65 = Class73.method1359(11525, arg0);
	anInt422++;
	return class65.method589(-30880, arg2);
    }
    
    public static boolean method151
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, Class131 arg8, int arg9, boolean arg10, long arg11) {
	boolean bool = (Class136.anIntArrayArrayArray2496
			== Class67_Sub1_Sub17.anIntArrayArrayArray4096);
	int i = 0;
	for (int i_11_ = arg1; i_11_ < arg1 + arg3; i_11_++) {
	    for (int i_12_ = arg2; i_12_ < arg2 + arg4; i_12_++) {
		if (i_11_ < 0 || i_12_ < 0 || i_11_ >= Class67_Sub27.anInt3301
		    || i_12_ >= Class67_Sub5_Sub16.anInt4782)
		    return false;
		Class67_Sub24 class67_sub24
		    = (Class76.aClass67_Sub24ArrayArrayArray1578[arg0][i_11_]
		       [i_12_]);
		if (class67_sub24 != null && class67_sub24.anInt3215 >= 5)
		    return false;
	    }
	}
	Class36 class36 = new Class36();
	class36.aLong785 = arg11;
	class36.anInt787 = arg0;
	class36.anInt767 = arg5;
	class36.anInt783 = arg6;
	class36.anInt784 = arg7;
	class36.aClass131_790 = arg8;
	class36.anInt770 = arg9;
	class36.anInt765 = arg1;
	class36.anInt777 = arg2;
	class36.anInt778 = arg1 + arg3 - 1;
	class36.anInt789 = arg2 + arg4 - 1;
	for (int i_13_ = arg1; i_13_ < arg1 + arg3; i_13_++) {
	    for (int i_14_ = arg2; i_14_ < arg2 + arg4; i_14_++) {
		int i_15_ = 0;
		if (i_13_ > arg1)
		    i_15_++;
		if (i_13_ < arg1 + arg3 - 1)
		    i_15_ += 4;
		if (i_14_ > arg2)
		    i_15_ += 8;
		if (i_14_ < arg2 + arg4 - 1)
		    i_15_ += 2;
		for (int i_16_ = arg0; i_16_ >= 0; i_16_--) {
		    if ((Class76.aClass67_Sub24ArrayArrayArray1578[i_16_]
			 [i_13_][i_14_])
			== null)
			Class76.aClass67_Sub24ArrayArrayArray1578[i_16_]
			    [i_13_][i_14_]
			    = new Class67_Sub24(i_16_, i_13_, i_14_);
		}
		Class67_Sub24 class67_sub24
		    = (Class76.aClass67_Sub24ArrayArrayArray1578[arg0][i_13_]
		       [i_14_]);
		class67_sub24.aClass36Array3229[class67_sub24.anInt3215]
		    = class36;
		class67_sub24.anIntArray3222[class67_sub24.anInt3215] = i_15_;
		class67_sub24.anInt3236 |= i_15_;
		class67_sub24.anInt3215++;
		if (bool && Class73.anIntArrayArray1464[i_13_][i_14_] != 0)
		    i = Class73.anIntArrayArray1464[i_13_][i_14_];
	    }
	}
	if (bool && i != 0) {
	    for (int i_17_ = arg1; i_17_ < arg1 + arg3; i_17_++) {
		for (int i_18_ = arg2; i_18_ < arg2 + arg4; i_18_++) {
		    if (Class73.anIntArrayArray1464[i_17_][i_18_] == 0)
			Class73.anIntArrayArray1464[i_17_][i_18_] = i;
		}
	    }
	}
	if (arg10)
	    Class67_Sub1_Sub16_Sub1.aClass36Array5099[Canvas_Sub1.anInt62++]
		= class36;
	return true;
    }
    
    static {
	anInt417 = 0;
    }
}
