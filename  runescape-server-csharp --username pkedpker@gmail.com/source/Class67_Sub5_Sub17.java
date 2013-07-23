/* Class67_Sub5_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub17 extends Class67_Sub5
{
    public static int anInt4784;
    public int anInt4785;
    public static int anInt4786;
    public static RSString aRSString_4787;
    public static int anInt4788;
    public static RSString aRSString_4789;
    public static RSString aRSString_4790
	= Class134.method1914("Chargement des textures )2 ", (byte) 49);
    public static int anInt4791;
    public static int anInt4792;
    public static RSString aRSString_4793;
    public RSString aRSString_4794;
    public static int anInt4795;
    public static int anInt4796;
    public static RSString aRSString_4797;
    public int anInt4798;
    public static int anInt4799;
    public static int anInt4800;
    public static int anInt4801;
    
    public boolean method990(int arg0) {
	anInt4799++;
	if (arg0 != -13492)
	    aRSString_4790 = null;
	if ((anInt4798 ^ 0xffffffff) != -116)
	    return false;
	return true;
    }
    
    public void method991(int arg0, Stream arg1) {
	anInt4800++;
	for (;;) {
	    int i = arg1.readByte((byte) -23);
	    if (i == 0)
		break;
	    method993(i, arg1, 1);
	}
	if (arg0 != 4572)
	    method995(-91, (byte) -122, null);
    }
    
    public static void method992(int arg0, Stream arg1) {
	anInt4784++;
	if (arg0 <= 56)
	    method994(true);
	while ((arg1.buffer.length ^ 0xffffffff)
	       < (arg1.currentOffset ^ 0xffffffff)) {
	    boolean bool = false;
	    int i = 0;
	    int i_0_ = 0;
	    if (arg1.readByte((byte) -11) == 1) {
		i = arg1.readByte((byte) -128);
		bool = true;
		i_0_ = arg1.readByte((byte) -44);
	    }
	    int i_1_ = arg1.readByte((byte) 88);
	    int i_2_ = arg1.readByte((byte) 81);
	    int i_3_ = i_1_ * 64 + -Class100.anInt1968;
	    int i_4_ = -(i_2_ * 64) + (Class67_Sub1_Sub21.anInt4159
				       + Class131_Sub5.anInt3656) - 1;
	    if (i_3_ >= 0 && (-63 + i_4_ ^ 0xffffffff) <= -1
		&& (i_3_ - -63 ^ 0xffffffff) > (Class67_Sub1_Sub13.anInt4031
						^ 0xffffffff)
		&& (i_4_ ^ 0xffffffff) > (Class131_Sub5.anInt3656
					  ^ 0xffffffff)) {
		int i_5_ = i_4_ >> -1671916186;
		int i_6_ = i_3_ >> 1148441670;
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -65; i_7_++) {
		    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -65; i_8_++) {
			if (!bool
			    || ((i_7_ ^ 0xffffffff) <= (i * 8 ^ 0xffffffff)
				&& (8 * i + 8 ^ 0xffffffff) < (i_7_
							       ^ 0xffffffff)
				&& (8 * i_0_ ^ 0xffffffff) >= (i_8_
							       ^ 0xffffffff)
				&& (i_8_ ^ 0xffffffff) > (8 + i_0_ * 8
							  ^ 0xffffffff))) {
			    int i_9_ = arg1.readByte((byte) 97);
			    if (i_9_ != 0) {
				if ((i_9_ & 0x1 ^ 0xffffffff) == -2) {
				    int i_10_ = arg1.readByte((byte) -93);
				    if ((Class67_Sub1_Sub9
					 .aByteArrayArrayArray3956[i_6_][i_5_])
					== null)
					Class67_Sub1_Sub9
					    .aByteArrayArrayArray3956[i_6_]
					    [i_5_]
					    = new byte[4096];
				    Class67_Sub1_Sub9
					.aByteArrayArrayArray3956[i_6_][i_5_]
					[(-i_8_ + 63 << -2018425978) - -i_7_]
					= (byte) i_10_;
				}
				if ((i_9_ & 0x2 ^ 0xffffffff) == -3) {
				    int i_11_ = arg1.readThreeBytes(65280);
				    if ((Class6.anIntArrayArrayArray148[i_6_]
					 [i_5_])
					== null)
					Class6.anIntArrayArrayArray148
					    [i_6_][i_5_]
					    = new int[4096];
				    Class6.anIntArrayArrayArray148[i_6_]
					[i_5_]
					[(-i_8_ + 63 << -1769467130) - -i_7_]
					= i_11_;
				}
				if ((0x4 & i_9_) == 4) {
				    int i_12_ = arg1.readThreeBytes(65280);
				    if ((Class67_Sub23.anIntArrayArrayArray3211
					 [i_6_][i_5_])
					== null)
					Class67_Sub23
					    .anIntArrayArrayArray3211[i_6_]
					    [i_5_]
					    = new int[4096];
				    Class65 class65
					= Class73.method1359(11525, --i_12_);
				    if (class65.anIntArray1244 != null) {
					class65
					    = class65.method590((byte) -84);
					if (class65 == null
					    || class65.anInt1249 == -1)
					    continue;
				    }
				    Class67_Sub23.anIntArrayArrayArray3211
					[i_6_][i_5_]
					[(-i_8_ + 63 << -620312730) - -i_7_]
					= class65.lastLoadedObjectId - -1;
				    Class67_Sub17 class67_sub17
					= new Class67_Sub17();
				    class67_sub17.anInt3096
					= class65.anInt1249;
				    class67_sub17.anInt3103 = i_4_;
				    class67_sub17.anInt3108 = i_3_;
				    Class67_Sub25.aClass50_3251
					.method436(class67_sub17, false);
				}
			    }
			}
		    }
		}
	    } else {
		for (int i_13_ = 0; i_13_ < (!bool ? 4096 : 64); i_13_++) {
		    int i_14_ = arg1.readByte((byte) -105);
		    if (i_14_ != 0) {
			if ((i_14_ & 0x1) == 1)
			    arg1.currentOffset++;
			if ((i_14_ & 0x2 ^ 0xffffffff) == -3)
			    arg1.currentOffset += 2;
			if ((0x4 & i_14_) == 4)
			    arg1.currentOffset += 3;
		    }
		}
	    }
	}
    }
    
    public void method993(int arg0, Stream arg1, int arg2) {
	if (arg2 != arg0) {
	    if ((arg0 ^ 0xffffffff) == -3)
		anInt4785 = arg1.readInt((byte) 127);
	    else if (arg0 == 5)
		aRSString_4794 = arg1.readRSString(-1);
	} else
	    anInt4798 = arg1.readByte((byte) -125);
	anInt4792++;
    }
    
    public static void method994(boolean arg0) {
	if (arg0 == false) {
	    aRSString_4789 = null;
	    aRSString_4787 = null;
	    aRSString_4797 = null;
	    aRSString_4790 = null;
	    aRSString_4793 = null;
	}
    }
    
    public static Class67_Sub5_Sub19 method995(int arg0, byte arg1,
					       Class9 arg2) {
	anInt4788++;
	if (!Class131_Sub3.method1806(arg2, arg0, 58))
	    return null;
	if (arg1 <= 96)
	    return null;
	return Class129.method1742((byte) 57);
    }
    
    public static void method996(boolean arg0) {
	anInt4801++;
	Class27.aClass67_Sub5_Sub19_632 = null;
	if (arg0 != false)
	    method995(-81, (byte) -50, null);
	Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147 = null;
	Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249 = null;
	Class67_Sub3.aClass67_Sub5_Sub19_2855 = null;
	Class67_Sub24.aClass67_Sub5_Sub19_3237 = null;
    }
    
    static {
	aRSString_4787 = Class134.method1914("(U0a )2 in: ", (byte) 88);
	anInt4796 = 0;
	aRSString_4789 = Class134.method1914("gleiten:", (byte) 15);
	anInt4786 = 0;
	aRSString_4793 = Class134.method1914("name_icons", (byte) 22);
	anInt4795 = 0;
	aRSString_4797 = Class134.method1914("::mm", (byte) 8);
    }
}
