/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102
{
    public static int anInt1994;
    public static int anInt1995;
    public static int anInt1996;
    public static RSString aRSString_1997;
    public static RSString[] aRSStringArray1998;
    public static RSString aRSString_1999
	= Class134.method1914("::qa_op_test", (byte) 4);
    public static Class50 aClass50_2000;
    public static int slotIndex;
    public static int anInt2002;
    public static int anInt2003;
    public static int[] anIntArray2004;
    public static int anInt2005;
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array2006;
    public static int anInt2007;
    
    public static void method1546(int arg0, boolean arg1, int arg2,
				  Class9 arg3, int arg4, byte arg5) {
	Class67_Sub1_Sub18.aClass9_4111 = arg3;
	anInt1995++;
	Class67_Sub11_Sub4.anInt4888 = 1;
	Class19.anInt489 = arg0;
	Class95.anInt1908 = arg2;
	Class57.anInt1111 = arg4;
	Class86.aBoolean1753 = arg1;
	int i = -103 / ((arg5 - 39) / 50);
	Class67_Sub24.anInt3238 = 10000;
    }
    
    public static boolean method1547(int arg0, boolean arg1) {
	anInt2002++;
	if (arg1 != true)
	    aClass50_2000 = null;
	int i = 0;
	int i_0_ = 0;
	if (Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770 == null) {
	    if (Class41.aClass67_Sub5_Sub19_871 != null)
		Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770
		    = ((Class67_Sub5_Sub19_Sub1)
		       Class41.aClass67_Sub5_Sub19_871);
	    else
		Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770
		    = new Class67_Sub5_Sub19_Sub1(512, 512);
	    int[] is
		= Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770.anIntArray5149;
	    int i_1_ = is.length;
	    for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++)
		is[i_2_] = 1;
	    for (int i_3_ = 1 + i; -i + 103 > i_3_; i_3_++) {
		int i_4_ = 4 * (512 * (-i_3_ + 103 - -i)) + 24628;
		for (int i_5_ = 1 + i_0_; i_5_ < 104 - (i_0_ + 1); i_5_++) {
		    if ((0x18 & (Class120.aByteArrayArrayArray2284[arg0][i_5_]
				 [i_3_])
			 ^ 0xffffffff)
			== -1)
			Class67_Sub1_Sub35.method780(is, i_4_, 512, arg0, i_5_,
						     i_3_);
		    if (arg0 < 3 && (0x8 & (Class120.aByteArrayArrayArray2284
					    [1 + arg0][i_5_][i_3_])
				     ^ 0xffffffff) != -1)
			Class67_Sub1_Sub35.method780(is, i_4_, 512, arg0 - -1,
						     i_5_, i_3_);
		    i_4_ += 4;
		}
	    }
	    Class70_Sub1.anInt3371 = 0;
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -105; i_6_++) {
		for (int i_7_ = 0; i_7_ < 104; i_7_++) {
		    long l = Class27.method253(Canvas_Sub1.anInt59,
					       i_6_ - -i_0_, i_7_ + i);
		    if ((l ^ 0xffffffffffffffffL) != -1L) {
			Class65 class65
			    = Class73.method1359(11525,
						 (0x7fffffff
						  & (int) (l
							   >>> -1862568928)));
			int i_8_ = class65.anInt1249;
			if (class65.anIntArray1244 != null) {
			    for (int i_9_ = 0;
				 ((class65.anIntArray1244.length ^ 0xffffffff)
				  < (i_9_ ^ 0xffffffff));
				 i_9_++) {
				if ((class65.anIntArray1244[i_9_] ^ 0xffffffff)
				    != 0) {
				    Class65 class65_10_
					= Class73.method1359(11525,
							     (class65
							      .anIntArray1244
							      [i_9_]));
				    if ((class65_10_.anInt1249 ^ 0xffffffff)
					<= -1) {
					i_8_ = class65_10_.anInt1249;
					break;
				    }
				}
			    }
			}
			if (i_8_ >= 0) {
			    int i_11_ = i_0_ + i_6_;
			    int i_12_ = i_7_ + i;
			    if ((i_8_ ^ 0xffffffff) != -23 && i_8_ != 29
				&& i_8_ != 34 && i_8_ != 36
				&& (i_8_ ^ 0xffffffff) != -47
				&& (i_8_ ^ 0xffffffff) != -48 && i_8_ != 48) {
				int[][] is_13_ = (Class53.aClass73Array1059
						  [Canvas_Sub1.anInt59]
						  .anIntArrayArray1453);
				for (int i_14_ = 0; i_14_ < 10; i_14_++) {
				    int i_15_ = (int) (Math.random() * 4.0);
				    if (i_15_ == 0 && (i_11_ ^ 0xffffffff) < -1
					&& ((i_6_ - 3 ^ 0xffffffff)
					    > (i_11_ ^ 0xffffffff))
					&& ((is_13_[i_11_ - 1][i_12_]
					     & 0x12c0108)
					    ^ 0xffffffff) == -1)
					i_11_--;
				    if ((i_15_ ^ 0xffffffff) == -2
					&& (i_11_ ^ 0xffffffff) > -104
					&& i_6_ - -3 > i_11_
					&& ((is_13_[1 + i_11_][i_12_]
					     & 0x12c0180)
					    ^ 0xffffffff) == -1)
					i_11_++;
				    if (i_15_ == 2 && (i_12_ ^ 0xffffffff) < -1
					&& ((i_12_ ^ 0xffffffff)
					    < (i_7_ - 3 ^ 0xffffffff))
					&& (0x12c0102
					    & is_13_[i_11_][-1 + i_12_]) == 0)
					i_12_--;
				    if ((i_15_ ^ 0xffffffff) == -4
					&& i_12_ < 103 && i_7_ + 3 > i_12_
					&& ((is_13_[i_11_][1 + i_12_]
					     & 0x12c0120)
					    ^ 0xffffffff) == -1)
					i_12_++;
				}
			    }
			    Class36.anIntArray779[Class70_Sub1.anInt3371]
				= class65.lastLoadedObjectId;
			    Class10.anIntArray403[Class70_Sub1.anInt3371]
				= i_11_ - i_0_;
			    Class99.anIntArray1966[Class70_Sub1.anInt3371]
				= i_12_ - i;
			    Class70_Sub1.anInt3371++;
			}
		    }
		}
	    }
	}
	Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770.method1012();
	int i_16_
	    = ((int) (20.0 * Math.random()) + 238 + -10
	       + ((-10 + ((int) (Math.random() * 20.0) + 238) << -732031736)
		  + (-10 + (int) (Math.random() * 20.0) + 238 << 820861200)));
	int i_17_ = 228 + (int) (Math.random() * 20.0) << -1409388752;
	for (int i_18_ = 1; i_18_ < 103; i_18_++) {
	    for (int i_19_ = 1; i_19_ < 103; i_19_++) {
		if (((Class120.aByteArrayArrayArray2284[arg0][i_0_ + i_19_]
		      [i_18_ - -i])
		     & 0x18) == 0
		    && !Class131_Sub4.method1817(i_18_, i_0_, i_17_, arg0,
						 -710, i_19_, i, i_16_)) {
		    PacketParser.aClass99_2119.method1524(0);
		    return false;
		}
		if ((arg0 ^ 0xffffffff) > -4
		    && (0x8 & (Class120.aByteArrayArrayArray2284[arg0 + 1]
			       [i_0_ + i_19_][i + i_18_])
			^ 0xffffffff) != -1
		    && !Class131_Sub4.method1817(i_18_, i_0_, i_17_, 1 + arg0,
						 -710, i_19_, i, i_16_)) {
		    PacketParser.aClass99_2119.method1524(0);
		    return false;
		}
	    }
	}
	Class41.aClass67_Sub5_Sub19_871
	    = Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770;
	PacketParser.aClass99_2119.method1524(0);
	Class131_Sub7.aClass67_Sub5_Sub19_Sub1_3770 = null;
	return true;
    }
    
    public static RSString method1548(int arg0, long arg1) {
	try {
	    if (arg0 != -1)
		method1549(true, -120);
	    anInt1994++;
	    return Class67_Sub5_Sub4_Sub1.method857(0, arg1, false, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ph.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1549(boolean arg0, int arg1) {
	anInt1996++;
	Class132.method1901(64);
	int i = -64 / ((-62 - arg1) / 58);
	if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -31
	    || Class67_Sub5_Sub18.anInt4804 == 25) {
	    Class129_Sub1.pingTick++;
	    if (Class129_Sub1.pingTick >= 50 || arg0) {
		Class129_Sub1.pingTick = 0;
		if (!Class67_Sub1_Sub28.aBoolean4257  && Class41.aClass117_867 != null) {
		    Class70_Sub1.outStream.createFrame(2, 93); //PING
		    Class88.pingsSent++;
		    try {
			Class41.aClass117_867.queueBytesToSend(0, (Class70_Sub1.outStream.buffer), Class70_Sub1.outStream.currentOffset, (byte) 115);
			Class70_Sub1.outStream.currentOffset = 0;
		    } catch (java.io.IOException ioexception) {
			Class67_Sub1_Sub28.aBoolean4257 = true;
		    }
		}
		Class132.method1901(64);
	    }
	}
    }
    
    public static void method1550(int arg0) {
	if (arg0 == -6127) {
	    aRSStringArray1998 = null;
	    anIntArray2004 = null;
	    aClass50_2000 = null;
	    aRSString_1999 = null;
	    aRSString_1997 = null;
	    aClass67_Sub5_Sub19Array2006 = null;
	}
    }
    
    static {
	aRSStringArray1998 = new RSString[500];
	aClass50_2000 = new Class50();
	anIntArray2004 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
	anInt2005 = 0;
    }
}
