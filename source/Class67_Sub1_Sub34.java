/* Class67_Sub1_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub34 extends Class67_Sub1
{
    public boolean aBoolean4326 = true;
    public static int anInt4327;
    public static int anInt4328 = 0;
    public int anInt4329 = 4096;
    public static int anInt4330;
    public static Class136 aClass136_4331 = new Class136(64);
    public static Class136 aClass136_4332;
    public static RSString aRSString_4333
	= Class134.method1914("loginscreen", (byte) 35);
    public static Class67_Sub24[][][] aClass67_Sub24ArrayArrayArray4334;
    public static RSString aRSString_4335;
    public static int anInt4336;
    public static Class7 aClass7_4337;
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 67);
	anInt4327++;
	if (arg0 != true)
	    return null;
	if (aClass103_2830.aBoolean2030) {
	    int[] is_0_
		= this.method613(0, arg1 - 1 & Class67_Sub1_Sub36.anInt4381,
				 !arg0);
	    int[] is_1_ = this.method613(0, arg1, false);
	    int[] is_2_
		= this.method613(0, 1 + arg1 & Class67_Sub1_Sub36.anInt4381,
				 false);
	    int[] is_3_ = is[0];
	    int[] is_4_ = is[1];
	    int[] is_5_ = is[2];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_6_ = anInt4329 * (is_1_[Class76.anInt1581 & 1 + i]
					- is_1_[Class76.anInt1581 & i - 1]);
		int i_7_ = anInt4329 * (-is_0_[i] + is_2_[i]);
		int i_8_ = i_6_ >> 1365808940;
		int i_9_ = i_7_ >> -1485869076;
		int i_10_ = i_8_ * i_8_ >> -600750036;
		int i_11_ = i_9_ * i_9_ >> 650679180;
		int i_12_
		    = (int) (4096.0 * Math.sqrt((double) ((float) (4096 + i_11_
								   + i_10_)
							  / 4096.0F)));
		int i_13_;
		int i_14_;
		int i_15_;
		if (i_12_ != 0) {
		    i_13_ = i_6_ / i_12_;
		    i_15_ = 16777216 / i_12_;
		    i_14_ = i_7_ / i_12_;
		} else {
		    i_13_ = 0;
		    i_14_ = 0;
		    i_15_ = 0;
		}
		if (aBoolean4326) {
		    i_14_ = (i_14_ >> -683425311) + 2048;
		    i_13_ = (i_13_ >> -1507126431) + 2048;
		    i_15_ = 2048 - -(i_15_ >> -2115483583);
		}
		is_3_[i] = i_13_;
		is_4_[i] = i_14_;
		is_5_[i] = i_15_;
	    }
	}
	return is;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
	do {
	    if ((i ^ 0xffffffff) != -1) {
		if ((i ^ 0xffffffff) != -2)
		    break;
	    } else {
		anInt4329 = arg0.readUShort(-2386);
		break;
	    }
	    aBoolean4326 = (arg0.readByte((byte) 111) ^ 0xffffffff) == -2;
	} while (false);
	if (arg1 != true)
	    aClass7_4337 = null;
	anInt4330++;
    }
    
    public static void method772(int arg0) {
	aRSString_4333 = null;
	aClass136_4331 = null;
	aClass67_Sub24ArrayArrayArray4334 = null;
	aClass7_4337 = null;
	if (arg0 != 2048)
	    aClass67_Sub24ArrayArrayArray4334 = null;
	aRSString_4335 = null;
	aClass136_4332 = null;
    }
    
    public static void method773(int arg0, int arg1, int arg2, int arg3,
				 Class131 arg4, long arg5, boolean arg6) {
	if (arg4 != null) {
	    Class104 class104 = new Class104();
	    class104.aClass131_2034 = arg4;
	    class104.anInt2037 = arg1 * 128 + 64;
	    class104.anInt2031 = arg2 * 128 + 64;
	    class104.anInt2042 = arg3;
	    class104.aLong2035 = arg5;
	    if (Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		== null)
		Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		    = new Class67_Sub24(arg0, arg1, arg2);
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		.aClass104_3216
		= class104;
	}
    }
    
    public Class67_Sub1_Sub34() {
	super(1, false);
    }
    
    static {
	aClass136_4332 = new Class136(30);
	aRSString_4335 = Class134.method1914(":assistreq:", (byte) 102);
	aClass7_4337 = null;
    }
}
