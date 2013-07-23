/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
    public int anInt1126;
    public int anInt1127;
    public int anInt1128;
    public int anInt1129 = Class67_Sub18.method1259(16);
    public int anInt1130;
    public int[] anIntArray1131;
    public int anInt1132;
    
    public void method493(float[] arg0, int arg1, boolean arg2) {
	for (int i = 0; i < arg1; i++)
	    arg0[i] = 0.0F;
	if (!arg2) {
	    int i = Class67_Sub18.aClass29Array3118[anInt1128].anInt689;
	    int i_0_ = anInt1130 - anInt1126;
	    int i_1_ = i_0_ / anInt1132;
	    int[] is = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < 8; i_2_++) {
		int i_3_ = 0;
		while (i_3_ < i_1_) {
		    if (i_2_ == 0) {
			int i_4_ = Class67_Sub18.aClass29Array3118
				       [anInt1128].method281();
			for (int i_5_ = i - 1; i_5_ >= 0; i_5_--) {
			    if (i_3_ + i_5_ < i_1_)
				is[i_3_ + i_5_] = i_4_ % anInt1127;
			    i_4_ /= anInt1127;
			}
		    }
		    for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = is[i_3_];
			int i_8_ = anIntArray1131[i_7_ * 8 + i_2_];
			if (i_8_ >= 0) {
			    int i_9_ = anInt1126 + i_3_ * anInt1132;
			    Class29 class29
				= Class67_Sub18.aClass29Array3118[i_8_];
			    if (anInt1129 == 0) {
				int i_10_ = anInt1132 / class29.anInt689;
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				    float[] fs = class29.method279();
				    for (int i_12_ = 0;
					 i_12_ < class29.anInt689; i_12_++)
					arg0[i_9_ + i_11_ + i_12_ * i_10_]
					    += fs[i_12_];
				}
			    } else {
				int i_13_ = 0;
				while (i_13_ < anInt1132) {
				    float[] fs = class29.method279();
				    for (int i_14_ = 0;
					 i_14_ < class29.anInt689; i_14_++) {
					arg0[i_9_ + i_13_] += fs[i_14_];
					i_13_++;
				    }
				}
			    }
			}
			if (++i_3_ >= i_1_)
			    break;
		    }
		}
	    }
	}
    }
    
    public Class59() {
	anInt1126 = Class67_Sub18.method1259(24);
	anInt1130 = Class67_Sub18.method1259(24);
	anInt1132 = Class67_Sub18.method1259(24) + 1;
	anInt1127 = Class67_Sub18.method1259(6) + 1;
	anInt1128 = Class67_Sub18.method1259(8);
	int[] is = new int[anInt1127];
	for (int i = 0; i < anInt1127; i++) {
	    int i_15_ = 0;
	    int i_16_ = Class67_Sub18.method1259(3);
	    boolean bool = Class67_Sub18.method1252() != 0;
	    if (bool)
		i_15_ = Class67_Sub18.method1259(5);
	    is[i] = i_15_ << 3 | i_16_;
	}
	anIntArray1131 = new int[anInt1127 * 8];
	for (int i = 0; i < anInt1127 * 8; i++)
	    anIntArray1131[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
				 ? Class67_Sub18.method1259(8) : -1);
    }
}
