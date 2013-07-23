/* Class67_Sub1_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub33 extends Class67_Sub1
{
    public static RSString aRSString_4313;
    public static Class20 aClass20_4314;
    public int[] anIntArray4315;
    public static int anInt4316 = 1;
    public int anInt4317;
    public static RSString aRSString_4318
	= Class134.method1914(":tradereq:", (byte) 34);
    public int anInt4319;
    public static int anInt4320;
    public int anInt4321 = 4096;
    public int anInt4322;
    public static int anInt4323;
    public static int anInt4324;
    public static Class92 aClass92_4325;
    
    public static void method770(int arg0, int arg1, byte arg2, int arg3,
				 int arg4) {
	if (arg2 != -95)
	    aRSString_4313 = null;
	anInt4323++;
	if (Class139.anInt2533 <= arg4 && arg4 <= Class126_Sub1.anInt3423) {
	    arg1 = Class7.method97(arg1, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, arg2 ^ ~0xffa1);
	    arg0 = Class7.method97(arg0, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	    Class67_Sub16.method1242(arg0, arg1, 8, arg4, arg3);
	}
    }
    
    public Class67_Sub1_Sub33() {
	super(1, false);
	anInt4319 = 4096;
	anIntArray4315 = new int[3];
	anInt4322 = 4096;
	anInt4317 = 409;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    int i = arg2;
	while_122_:
	    do {
	    while_121_:
		do {
		while_120_:
		    do {
			do {
			    if (i != 0) {
				if (i != 1) {
				    if ((i ^ 0xffffffff) != -3) {
					if ((i ^ 0xffffffff) != -4) {
					    if (i == 4)
						break while_121_;
					    break while_122_;
					}
				    } else
					break;
				    break while_120_;
				}
			    } else {
				anInt4317 = arg0.readUShort(-2386);
				break while_122_;
			    }
			    anInt4321 = arg0.readUShort(-2386);
			    break while_122_;
			} while (false);
			anInt4322 = arg0.readUShort(-2386);
			break while_122_;
		    } while (false);
		    anInt4319 = arg0.readUShort(-2386);
		    break while_122_;
		} while (false);
		int i_0_ = arg0.readThreeBytes(65280);
		anIntArray4315[0]
		    = Class75.method1379(i_0_, 16711680) << -1762753596;
		anIntArray4315[1] = Class75.method1379(4080, i_0_ >> 33854788);
		anIntArray4315[2]
		    = Class75.method1379(i_0_, 255) >> -1506348500;
	    } while (false);
	    anInt4324++;
	}
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    return null;
	anInt4320++;
	int[][] is = aClass103_2830.method1551(arg1, 100);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_1_ = this.method609(arg1, false, 0);
	    int[] is_2_ = is_1_[0];
	    int[] is_3_ = is_1_[2];
	    int[] is_4_ = is_1_[1];
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_8_ = is_2_[i];
		int i_9_ = i_8_ + -anIntArray4315[0];
		if (i_9_ < 0)
		    i_9_ = -i_9_;
		if ((anInt4317 ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
		    is_5_[i] = i_8_;
		    is_6_[i] = is_4_[i];
		    is_7_[i] = is_3_[i];
		} else {
		    int i_10_ = is_4_[i];
		    i_9_ = -anIntArray4315[1] + i_10_;
		    if (i_9_ < 0)
			i_9_ = -i_9_;
		    if (anInt4317 < i_9_) {
			is_5_[i] = i_8_;
			is_6_[i] = i_10_;
			is_7_[i] = is_3_[i];
		    } else {
			int i_11_ = is_3_[i];
			i_9_ = -anIntArray4315[2] + i_11_;
			if ((i_9_ ^ 0xffffffff) > -1)
			    i_9_ = -i_9_;
			if ((i_9_ ^ 0xffffffff) < (anInt4317 ^ 0xffffffff)) {
			    is_5_[i] = i_8_;
			    is_6_[i] = i_10_;
			    is_7_[i] = i_11_;
			} else {
			    is_5_[i] = anInt4319 * i_8_ >> -893340052;
			    is_6_[i] = anInt4322 * i_10_ >> -1568906068;
			    is_7_[i] = anInt4321 * i_11_ >> 961048044;
			}
		    }
		}
	    }
	}
	return is;
    }
    
    public static void method771(int arg0) {
	aRSString_4318 = null;
	if (arg0 >= -124)
	    aClass92_4325 = null;
	aClass20_4314 = null;
	aRSString_4313 = null;
	aClass92_4325 = null;
    }
    
    static {
	aRSString_4313 = Class134.method1914("::rect_debug", (byte) 18);
	aClass92_4325 = new Class92(8);
    }
}
