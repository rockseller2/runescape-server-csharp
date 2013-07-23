/* Class67_Sub1_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub29 extends Class67_Sub1
{
    public static int anInt4259 = 255;
    public static int anInt4260;
    public static int anInt4261;
    public int anInt4262 = 32768;
    public static int anInt4263;
    public static RSString aRSString_4264;
    public static String aString4265;
    public static int anInt4266;
    public static int anInt4267 = 0;
    public static int anInt4268;
    public static int anInt4269;
    public static int anInt4270;
    public static int anInt4271;
    
    public Class67_Sub1_Sub29() {
	super(3, false);
    }
    
    public static Class7 method751(Class7 arg0, int arg1) {
	anInt4266++;
	Class7 class7 = client.method38(arg0);
	if (arg1 != 255)
	    anInt4259 = 101;
	if (class7 == null)
	    class7 = arg0.aClass7_319;
	return class7;
    }
    
    public static void method752(int arg0) {
	anInt4271++;
	do {
	    try {
		if (arg0 == 10359) {
		    if ((Class67_Sub11_Sub4.anInt4888 ^ 0xffffffff) != -2)
			break;
		    int i = Class136.aClass67_Sub11_Sub4_2485
				.method1192((byte) 112);
		    if (i > 0 && Class136.aClass67_Sub11_Sub4_2485
				     .method1205((byte) -119)) {
			i -= Class67_Sub24.anInt3238;
			if ((i ^ 0xffffffff) > -1)
			    i = 0;
			Class136.aClass67_Sub11_Sub4_2485
			    .method1199(i, arg0 ^ 0x284d);
		    } else {
			Class136.aClass67_Sub11_Sub4_2485.method1188(-62);
			Class136.aClass67_Sub11_Sub4_2485.method1198(false);
			Class106.aClass67_Sub4_2066 = null;
			if (Class67_Sub1_Sub18.aClass9_4111 != null)
			    Class67_Sub11_Sub4.anInt4888 = 2;
			else
			    Class67_Sub11_Sub4.anInt4888 = 0;
			Class9.aClass83_376 = null;
		    }
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
		Class136.aClass67_Sub11_Sub4_2485.method1188(arg0 + -10486);
		Class106.aClass67_Sub4_2066 = null;
		Class9.aClass83_376 = null;
		Class67_Sub1_Sub18.aClass9_4111 = null;
		Class67_Sub11_Sub4.anInt4888 = 0;
		break;
	    }
	    break;
	} while (false);
    }
    
    public static void method753(int arg0) {
	aString4265 = null;
	aRSString_4264 = null;
	if (arg0 != -2)
	    anInt4270 = 67;
    }
    
    public void method618(int arg0) {
	Class67_Sub1_Sub7.method645(-104);
	anInt4260++;
	int i = -29 / ((arg0 - -60) / 62);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt4261++;
	if (arg0 != true)
	    aString4265 = null;
	int[][] is = aClass103_2830.method1551(arg1, 98);
	if (aClass103_2830.aBoolean2030) {
	    int[] is_0_ = this.method613(1, arg1, false);
	    int[] is_1_ = this.method613(2, arg1, false);
	    int[] is_2_ = is[0];
	    int[] is_3_ = is[2];
	    int[] is_4_ = is[1];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_5_ = (0xff60c & 255 * is_0_[i]) >> 104303276;
		int i_6_ = anInt4262 * is_1_[i] >> -132771796;
		int i_7_
		    = i_6_ * Class67_Sub3.anIntArray2845[i_5_] >> 439743276;
		int i_8_ = i_6_ * Class51.anIntArray1040[i_5_] >> 1206686508;
		int i_9_ = Class76.anInt1581 & i - -(i_7_ >> 1071688876);
		int i_10_ = (Class67_Sub1_Sub36.anInt4381
			     & (i_8_ >> -836218644) + arg1);
		int[][] is_11_ = this.method609(i_10_, false, 0);
		is_2_[i] = is_11_[0][i_9_];
		is_4_[i] = is_11_[1][i_9_];
		is_3_[i] = is_11_[2][i_9_];
	    }
	}
	return is;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4263++;
	if (arg1 != 55)
	    method623(null, false, -75);
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_12_ = this.method613(1, arg0, false);
	    int[] is_13_ = this.method613(2, arg0, false);
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_14_ = 0xff & is_12_[i] >> -1456795548;
		int i_15_ = is_13_[i] * anInt4262 >> -698091572;
		int i_16_
		    = Class67_Sub3.anIntArray2845[i_14_] * i_15_ >> 1006394220;
		int i_17_ = i + (i_16_ >> 1635995116) & Class76.anInt1581;
		int i_18_ = i_15_ * Class51.anIntArray1040[i_14_] >> 48066988;
		int i_19_ = (Class67_Sub1_Sub36.anInt4381
			     & arg0 - -(i_18_ >> -2018917300));
		int[] is_20_ = this.method613(0, i_19_, false);
		is[i] = is_20_[i_17_];
	    }
	}
	return is;
    }
    
    public static void method754(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt4269++;
	for (int i = 0; Class67_Sub10.anInt3001 > i; i++) {
	    if (arg4 < (Class50.anIntArray1020[i]
			+ Class67_Sub1_Sub17.anIntArray4102[i])
		&& arg4 - -arg2 > Class67_Sub1_Sub17.anIntArray4102[i]
		&& (Class67_Sub1_Sub25.anIntArray4223[i]
		    - -Class67_Sub10.anIntArray3011[i]) > arg0
		&& ((arg0 + arg1 ^ 0xffffffff)
		    < (Class67_Sub1_Sub25.anIntArray4223[i] ^ 0xffffffff)))
		Class67_Sub5_Sub3.aBooleanArray4501[i] = true;
	}
	if (arg3 != -356)
	    anInt4267 = -57;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
	do {
	    if ((i ^ 0xffffffff) != -1) {
		if (i != 1)
		    break;
	    } else {
		anInt4262 = arg0.readUShort(-2386) << 1563042756;
		break;
	    }
	    aBoolean2839 = (arg0.readByte((byte) -53) ^ 0xffffffff) == -2;
	} while (false);
	if (arg1 != true)
	    method751(null, -122);
	anInt4268++;
    }
    
    static {
	aRSString_4264 = Class134.method1914("null", (byte) 124);
    }
}
