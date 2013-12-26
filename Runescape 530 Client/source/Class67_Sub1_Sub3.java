/* Class67_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub3 extends Class67_Sub1
{
    public static int anInt3842;
    public static int anInt3843;
    public static RSString aRSString_3844 = null;
    public static RSString aRSString_3845;
    public static int anInt3846;
    public static RSString aRSString_3847;
    public static int anInt3848;
    public static RSString aRSString_3849;
    public static RSString aRSString_3850
	= Class134.method1914("document)3cookie=(R", (byte) 89);
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	anInt3843++;
	if (aClass144_2836.aBoolean2607)
	    Class17.method184(is, 0, Class67_Sub5_Sub7.anInt4569,
			      Class19.anIntArray490[arg0]);
	if (arg1 != 55)
	    return null;
	return is;
    }
    
    public static void method634(byte arg0, int arg1, int arg2) {
	anInt3846++;
	if (Class67_Sub5_Sub15.method977(arg1, false)) {
	    if (arg0 < 3)
		aRSString_3847 = null;
	    Class67_Sub1_Sub26.method742(arg2,
					 (Class67_Sub1_Sub5
					  .aClass7ArrayArray3878[arg1]),
					 false);
	}
    }
    
    public Class67_Sub1_Sub3() {
	super(0, true);
    }
    
    public static void method635(int arg0) {
	aRSString_3847 = null;
	aRSString_3845 = null;
	if (arg0 == -1) {
	    aRSString_3844 = null;
	    aRSString_3850 = null;
	    aRSString_3849 = null;
	}
    }
    
    public static void method636(int arg0) {
	anInt3848++;
	if (arg0 == 128) {
	    for (int i = 0; i < Class5.anInt144; i++) {
		Class126.anIntArray2361[i]--;
		if (Class126.anIntArray2361[i] < -10) {
		    Class5.anInt144--;
		    for (int i_0_ = i; Class5.anInt144 > i_0_; i_0_++) {
			Class67_Sub6.anIntArray2887[i_0_]
			    = Class67_Sub6.anIntArray2887[1 + i_0_];
			Class103.aClass135Array2022[i_0_]
			    = Class103.aClass135Array2022[1 + i_0_];
			Class67_Sub1_Sub32.anIntArray4299[i_0_]
			    = Class67_Sub1_Sub32.anIntArray4299[1 + i_0_];
			Class126.anIntArray2361[i_0_]
			    = Class126.anIntArray2361[i_0_ + 1];
			Class50.anIntArray1016[i_0_]
			    = Class50.anIntArray1016[i_0_ - -1];
		    }
		    i--;
		} else {
		    Class135 class135 = Class103.aClass135Array2022[i];
		    if (class135 == null) {
			class135 = Class135.method1918(PacketParser.aClass9_2113,
						       (Class67_Sub6
							.anIntArray2887[i]),
						       0);
			if (class135 == null)
			    continue;
			Class126.anIntArray2361[i] += class135.method1915();
			Class103.aClass135Array2022[i] = class135;
		    }
		    if ((Class126.anIntArray2361[i] ^ 0xffffffff) > -1) {
			int i_1_;
			if (Class50.anIntArray1016[i] == 0)
			    i_1_ = Class67_Sub21.anInt3176;
			else {
			    int i_2_
				= (Class50.anIntArray1016[i] & 0xff) * 128;
			    int i_3_ = ((0xff6c77 & Class50.anIntArray1016[i])
					>> 447453392);
			    int i_4_ = (64 + i_3_ * 128
					+ -(Class122.aClass131_Sub7_Sub2_2309
					    .anInt3733));
			    if (i_4_ < 0)
				i_4_ = -i_4_;
			    int i_5_ = (Class50.anIntArray1016[i] >> 1285942472
					& 0xff);
			    int i_6_
				= (i_5_ * 128
				   + (64 + -(Class122.aClass131_Sub7_Sub2_2309
					     .anInt3726)));
			    if (i_6_ < 0)
				i_6_ = -i_6_;
			    int i_7_ = -128 + i_4_ + i_6_;
			    if (i_2_ < i_7_) {
				Class126.anIntArray2361[i] = -100;
				continue;
			    }
			    if ((i_7_ ^ 0xffffffff) > -1)
				i_7_ = 0;
			    i_1_ = (-i_7_ + i_2_) * Class27.anInt644 / i_2_;
			}
			if (i_1_ > 0) {
			    Class67_Sub13_Sub1 class67_sub13_sub1
				= class135.method1916()
				      .method1222(Class10.aClass54_401);
			    Class67_Sub11_Sub3 class67_sub11_sub3
				= (Class67_Sub11_Sub3.method1147
				   (class67_sub13_sub1, 100, i_1_));
			    class67_sub11_sub3.method1142((Class67_Sub1_Sub32
							   .anIntArray4299[i])
							  + -1);
			    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
				.method1132(class67_sub11_sub3);
			}
			Class126.anIntArray2361[i] = -100;
		    }
		}
	    }
	    if (Class57.aBoolean1106 && !Class89.method1468(0)) {
		if ((Class67_Sub1_Sub29.anInt4259 ^ 0xffffffff) != -1
		    && Class27.anInt637 != -1)
		    Class102.method1546(0, false, Class27.anInt637,
					Class9.aClass9_362,
					Class67_Sub1_Sub29.anInt4259,
					(byte) -37);
		Class57.aBoolean1106 = false;
	    } else if (Class67_Sub1_Sub29.anInt4259 != 0
		       && (Class27.anInt637 ^ 0xffffffff) != 0
		       && !Class89.method1468(0)) {
		Class70_Sub1.outStream.createFrame(2, 137);	//CLIENT_VARIABLE_30
		Class67_Sub1_Sub31.anInt4292++;
		Class70_Sub1.outStream.addInt(Class27.anInt637, arg0 ^ 0xf5);
		Class27.anInt637 = -1;
	    }
	}
    }
    
    static {
	aRSString_3845 = Class134.method1914("wave2:", (byte) 90);
	aRSString_3849 = aRSString_3845;
	aRSString_3847 = aRSString_3845;
    }
}
