public abstract class Class33
{
    public static int[] anIntArray727;
    public static int anInt728;
    public static int anInt729;
    public static int anInt730;
    public static int anInt731;
    public static int anInt732 = -1;
    public static RSString aRSString_733;
    public static int anInt734;
    public static int anInt735;
    
    public static int method290(int arg0) {
	anInt735++;
	if (arg0 < 100)
	    anInt732 = 33;
	return ((((Class27.anInt644 ^ 0xffffffff) != -1 ? 1 : 0) << -207893130)
		+ ((Class67_Sub21.anInt3176 != 0 ? 1 : 0) << -1981420428)
		+ ((!Class128.aBoolean2385 ? 0 : 1) << 63679056)
		+ (((Class123.aBoolean2318 ? 1 : 0) << 1810168269)
		   + (((!Class67_Sub5_Sub9.aBoolean4614 ? 0 : 1) << 1235655114)
		      + ((Class55_Sub3.aBoolean2808 ? 1 : 0) << 1297970311)
		      + ((Class67_Sub5_Sub2.aBoolean4468 ? 1 : 0)
			 << 411237158)))
		+ (((InputStream_Sub1.aBoolean77 ? 1 : 0) << 1217861285)
		   + (Class28.anInt667 & 0x7)
		   - -((Class113.aBoolean2133 ? 1 : 0) << 2035022755)
		   + (((!Class100.aBoolean1977 ? 0 : 1) << 421941092)
		      + ((Class6.aBoolean157 ? 1 : 0) << 2053687592))
		   + (((InputStream_Sub1.aBoolean78 ? 1 : 0) << 1324272073)
		      + ((Class67_Sub25.anInt3253 << 2045526827 & 0x1800)
			 - (-((Class72.aBoolean1432 ? 1 : 0) << -1620372817)
			    - ((!Class105.aBoolean2044 ? 0 : 1)
			       << 2100759155)))
		      + ((((Class67_Sub1_Sub29.anInt4259 ^ 0xffffffff) != -1
			   ? 1 : 0)
			  << 377756021)
			 + (Class61_Sub1.method558() << 1341567159)))));
    }
    
    public static boolean method291(Class7 arg0, byte arg1) {
	anInt728++;
	if (arg0.anIntArray318 == null)
	    return false;
	int i = 0;
	int i_0_ = 127 / ((40 - arg1) / 40);
	for (/**/; (arg0.anIntArray318.length ^ 0xffffffff) < (i ^ 0xffffffff);
	     i++) {
	    int i_1_ = Class89.method1471(arg0, i, (byte) -32);
	    int i_2_ = arg0.anIntArray217[i];
	    if (arg0.anIntArray318[i] != 2) {
		if ((arg0.anIntArray318[i] ^ 0xffffffff) != -4) {
		    if ((arg0.anIntArray318[i] ^ 0xffffffff) == -5) {
			if ((i_1_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
			    return false;
		    } else if ((i_1_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff))
			return false;
		} else if (i_1_ <= i_2_)
		    return false;
	    } else if ((i_1_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff))
		return false;
	}
	return true;
    }
    
    public static void method292(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10) {
	int i = -arg6 + arg4;
	anInt731++;
	int i_3_ = -arg3 + arg8;
	int i_4_ = 983040 / arg9;
	int i_5_ = -1;
	if (arg1 != 30079)
	    anInt732 = -83;
	int i_6_ = 983040 / arg0;
	if ((Class67_Sub1_Sub9.anInt3960 ^ 0xffffffff) < -1) {
	    if (Class54.anInt1081 > 10)
		i_5_ = -((-10 + Class54.anInt1081) * 5) + 50;
	    else
		i_5_ = 5 * Class54.anInt1081;
	}
	for (int i_7_ = -i_4_; i + i_4_ > i_7_; i_7_++) {
	    int i_8_ = arg2 - -(arg9 * i_7_) >> 801231728;
	    int i_9_ = (1 + i_7_) * arg9 + arg2 >> -1630538352;
	    int i_10_ = i_9_ + -i_8_;
	    if ((i_10_ ^ 0xffffffff) < -1) {
		i_8_ += arg5;
		i_9_ += arg5;
		int i_11_ = arg6 + i_7_ >> 1906233734;
		if ((i_11_ ^ 0xffffffff) <= -1
		    && (-1 + Class67_Sub23.anIntArrayArrayArray3211.length
			>= i_11_)) {
		    int[][] is = Class67_Sub23.anIntArrayArrayArray3211[i_11_];
		    for (int i_12_ = -i_6_;
			 (i_6_ + i_3_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
			 i_12_++) {
			int i_13_ = i_12_ * arg0 + arg7 >> -1400237968;
			int i_14_
			    = arg7 - -(arg0 * (1 + i_12_)) >> -1541301456;
			int i_15_ = -i_13_ + i_14_;
			if (i_15_ > 0) {
			    i_14_ += arg10;
			    i_13_ += arg10;
			    int i_16_ = arg3 + i_12_ >> -89311482;
			    if (i_16_ >= 0 && is.length - 1 >= i_16_
				&& is[i_16_] != null) {
				int i_17_
				    = ((arg3 + i_12_ << 135051238 & 0xfc0)
				       - -(i_7_ - -arg6 & 0x3f));
				int i_18_ = is[i_16_][i_17_];
				if (i_18_ != 0) {
				    Class65 class65
					= Class73.method1359(arg1 + -18554,
							     -1 + i_18_);
				    if (!Class33_Sub2.aBooleanArray2777
					 [class65.anInt1249]) {
					if (i_5_ != -1
					    && (class65.anInt1249
						== Class62.anInt1159)) {
					    Class67_Sub17 class67_sub17
						= new Class67_Sub17();
					    class67_sub17.anInt3096
						= class65.anInt1249;
					    class67_sub17.anInt3108 = i_8_;
					    class67_sub17.anInt3103 = i_13_;
					    Class3.aClass50_113.method436
						(class67_sub17, false);
					} else
					    Class67_Sub19
						.aClass67_Sub5_Sub19_Sub1Array3152
						[class65.anInt1249].method1006
						(i_8_ + -7, -7 + i_13_);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	for (Class67_Sub17 class67_sub17
		 = (Class67_Sub17) Class3.aClass50_113.method445(0);
	     class67_sub17 != null;
	     class67_sub17
		 = (Class67_Sub17) Class3.aClass50_113.method432(0)) {
	    Class121.method1674(class67_sub17.anInt3108,
				class67_sub17.anInt3103, 15, 16776960, i_5_);
	    Class121.method1674(class67_sub17.anInt3108,
				class67_sub17.anInt3103, 13, 16776960, i_5_);
	    Class121.method1674(class67_sub17.anInt3108,
				class67_sub17.anInt3103, 11, 16776960, i_5_);
	    Class121.method1674(class67_sub17.anInt3108,
				class67_sub17.anInt3103, 9, 16776960, i_5_);
	    Class67_Sub19.aClass67_Sub5_Sub19_Sub1Array3152
		[class67_sub17.anInt3096].method1006
		(class67_sub17.anInt3108 + -7, class67_sub17.anInt3103 - 7);
	}
	Class3.aClass50_113.method437((byte) 127);
    }
    
    public static boolean method293(int arg0, int arg1) {
	anInt729++;
	if (arg0 != 50)
	    aRSString_733 = null;
	if ((arg1 & -arg1 ^ 0xffffffff) != (arg1 ^ 0xffffffff))
	    return false;
	return true;
    }
    
    public static boolean method294(int arg0) {
	anInt730++;
	try {
	    if (arg0 > -39)
		return false;
	    return PacketParser.method1597((byte) 57);
	} catch (java.io.IOException ioexception) {
	    Class119.method1645(-58);
	    return true;
	} catch (Exception exception) {
	    String string
		= ("T2 - " + Class67_Sub1_Sub20.packetType + ","
		   + Class67_Sub1_Sub16.anInt4073 + ","
		   + Class55_Sub3.anInt2815 + " - "
		   + Class67_Sub5_Sub1.lastPacketSize + ","
		   + (Class58.baseX
		      + Class122.aClass131_Sub7_Sub2_2309.smallX[0])
		   + ","
		   + (Class122.aClass131_Sub7_Sub2_2309.smallY[0]
		      + Class137.baseY)
		   + " - ");
	    for (int i = 0;
		 ((Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff) < (i ^ 0xffffffff)
		  && i < 50);
		 i++)
		string
		    += Class54.aPacketStream_1069.buffer[i] + ",";
	    Class104.method1563(exception, string, 1);
	    Class131_Sub4.method1819(81);
	    return true;
	}
    }
    
    public abstract void method295(byte i);
    
    public static void method296(int arg0) {
	do {
	    try {
		aRSString_733 = null;
		anIntArray727 = null;
		if (arg0 == 0)
		    break;
		anIntArray727 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   "e.F(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public abstract int method297(byte i, int i_19_, int i_20_);
    
    static {
	anIntArray727 = new int[32];
	aRSString_733
	    = Class134.method1914(" zuerst von Ihrer Freunde)2Liste(Q",
				  (byte) 20);
    }
}
