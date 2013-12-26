public class Class131_Sub7_Sub2 extends Class131_Sub7
{
    public int lastByte;
    public int prayerIcon = -1;
    public static int anInt5060;
    public boolean aBoolean5061;
    public int anInt5062;
    public static Class9 aClass9_5063;
    public static int anInt5064;
    public Class22 aClass22_5065;
    public int anInt5066;
    public int anInt5067 = 0;
    public static boolean aBoolean5068 = false;
    public static int anInt5069;
    public int combatLevel = 0;
    public int anInt5071;
    public static int anInt5072;
    public static Class136 aClass136_5073 = new Class136(5);
    public static int anInt5074;
    public int anInt5075;
    public int skullIcon = -1;
    public int playerTeam = 0;
    public static int anInt5078;
    public static int anInt5079;
    public int anInt5080;
    public static int anInt5081;
    public RSString playerName;
    public static int anInt5083;
    public static int anInt5084;
    public static int anInt5085;
    public static int anInt5086;
    public int anInt5087;
    public int anInt5088;
    
    public static void method1893(byte arg0, boolean arg1) {
	anInt5083++;
	Class113.aBoolean2133 = arg1;
	Class132.aBoolean2443 = !Class32.method288(true);
	if (arg0 >= -9)
	    method1895((byte) 33);
    }
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt5064++;
    }
    
    public int method1887(byte arg0) {
	anInt5086++;
	if (arg0 >= -8)
	    method1894(null, 24, -111, 13, 17, -111);
	if (aClass22_5065 != null && aClass22_5065.anInt536 != -1)
	    return Class133.method1908(aClass22_5065.anInt536, 90).anInt1211;
	return super.method1887((byte) -120);
    }
    
    public static void method1894(Class131 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	boolean bool = true;
	int i = arg2;
	int i_0_ = arg2 + arg4;
	int i_1_ = arg3 - 1;
	int i_2_ = arg3 + arg5;
	for (int i_3_ = arg1; i_3_ <= arg1 + 1; i_3_++) {
	    if (i_3_ != Class67_Sub1_Sub13.anInt4024) {
		for (int i_4_ = i; i_4_ <= i_0_; i_4_++) {
		    if (i_4_ >= 0 && i_4_ < Class67_Sub27.anInt3301) {
			for (int i_5_ = i_1_; i_5_ <= i_2_; i_5_++) {
			    if (i_5_ >= 0
				&& i_5_ < Class67_Sub5_Sub16.anInt4782
				&& (!bool || i_4_ >= i_0_ || i_5_ >= i_2_
				    || i_5_ < arg3 && i_4_ != arg2)) {
				Class67_Sub24 class67_sub24
				    = (Class76
				       .aClass67_Sub24ArrayArrayArray1578[i_3_]
				       [i_4_][i_5_]);
				if (class67_sub24 != null) {
				    int i_6_
					= (((Class136.anIntArrayArrayArray2496
					     [i_3_][i_4_][i_5_])
					    + (Class136
					       .anIntArrayArrayArray2496[i_3_]
					       [i_4_ + 1][i_5_])
					    + (Class136
					       .anIntArrayArrayArray2496[i_3_]
					       [i_4_][i_5_ + 1])
					    + (Class136
					       .anIntArrayArrayArray2496[i_3_]
					       [i_4_ + 1][i_5_ + 1])) / 4
					   - (((Class136
						.anIntArrayArrayArray2496[arg1]
						[arg2][arg3])
					       + (Class136
						  .anIntArrayArrayArray2496
						  [arg1][arg2 + 1][arg3])
					       + (Class136
						  .anIntArrayArrayArray2496
						  [arg1][arg2][arg3 + 1])
					       + (Class136
						  .anIntArrayArrayArray2496
						  [arg1][arg2 + 1][arg3 + 1]))
					      / 4));
				    Class58 class58
					= class67_sub24.aClass58_3221;
				    if (class58 != null) {
					if (class58.aClass131_1121
						.method1768())
					    arg0.method1763
						(class58.aClass131_1121,
						 ((i_4_ - arg2) * 128
						  + (1 - arg4) * 64),
						 i_6_,
						 ((i_5_ - arg3) * 128
						  + (1 - arg5) * 64),
						 bool);
					if (class58.aClass131_1115 != null
					    && class58.aClass131_1115
						   .method1768())
					    arg0.method1763
						(class58.aClass131_1115,
						 ((i_4_ - arg2) * 128
						  + (1 - arg4) * 64),
						 i_6_,
						 ((i_5_ - arg3) * 128
						  + (1 - arg5) * 64),
						 bool);
				    }
				    for (int i_7_ = 0;
					 i_7_ < class67_sub24.anInt3215;
					 i_7_++) {
					Class36 class36
					    = (class67_sub24.aClass36Array3229
					       [i_7_]);
					if (class36 != null
					    && class36.aClass131_790
						   .method1768()
					    && (i_4_ == class36.anInt765
						|| i_4_ == i)
					    && (i_5_ == class36.anInt777
						|| i_5_ == i_1_)) {
					    int i_8_
						= (class36.anInt778
						   - class36.anInt765 + 1);
					    int i_9_
						= (class36.anInt789
						   - class36.anInt777 + 1);
					    arg0.method1763
						(class36.aClass131_790,
						 ((class36.anInt765 - arg2)
						  * 128) + (i_8_ - arg4) * 64,
						 i_6_,
						 ((class36.anInt777 - arg3)
						  * 128) + (i_9_ - arg5) * 64,
						 bool);
					}
				    }
				}
			    }
			}
		    }
		}
		i--;
		bool = false;
	    }
	}
    }
    
    public int getPlayerAnims(int arg0) {
	if (arg0 != 0)
	    aClass9_5063 = null;
	anInt5081++;
	return playerAnims;
    }
    
    public boolean method1878(byte arg0) {
	anInt5085++;
	if (aClass22_5065 == null)
	    return false;
	if (arg0 != 62)
	    return false;
	return true;
    }
    
    public static void method1895(byte arg0) {
	if (arg0 > -79)
	    method1893((byte) -98, true);
	aClass136_5073 = null;
	aClass9_5063 = null;
    }
    
    public void method1896(boolean arg0, int arg1, int arg2, int arg3) {
	super.method1877(method1887((byte) -29), arg1, (byte) 88, arg2, arg0);
	if (arg3 == 14508)
	    anInt5079++;
    }
    
    public void finalize() {
	anInt5069++;
    }
    
    public void appendPlayerAppearance(Stream arg0, int arg1) {
	arg0.currentOffset = 0;
	anInt5060++;
	int gender = arg0.readByte((byte) -37);
	int i_10_ = gender & 0x1;
	boolean bool = (gender & 0x4) != 0;
	int i_11_ = super.method1887((byte) -85);
	int[] equipment = new int[12];
	int i_12_ = -1;
	this.method1883(0, ((gender & 0x39) >> 230372067) - -1);
	anInt5088 = (0xda & gender) >> -468951738;
	anInt3733 += (-i_11_ + method1887((byte) -109)) * 64;
	anInt3726 += (method1887((byte) -77) + -i_11_) * 64;
	prayerIcon = arg0.readByte2((byte) 1);
	skullIcon = arg0.readByte2((byte) 1);
	playerTeam = 0;
	for (int i_14_ = 0; i_14_ < 12; i_14_++) {
	    int i_15_ = arg0.readByte((byte) 124);
	    if ((i_15_ ^ 0xffffffff) == -1) {
			equipment[i_14_] = 0;
		} else {
			int i_16_ = arg0.readByte((byte) -12);
		int i_17_ = (i_15_ << 1183834536) - -i_16_;
		if ((i_14_ ^ 0xffffffff) == -1 && i_17_ == 65535) {
		    i_12_ = arg0.readUShort(-2386);
		    playerTeam = arg0.readByte((byte) -66);
		    break;
		}
		if (i_17_ >= 32768) {
		    i_17_ = Class125.anIntArray2340[-32768 + i_17_];
		    equipment[i_14_] = Class67_Sub20.method1273(1073741824, i_17_);
		    int i_18_ = PacketParser.method1596(i_17_, -28322).anInt1577;
		    if ((i_18_ ^ 0xffffffff) != -1) {
				playerTeam = i_18_;
			}
		} else
		    equipment[i_14_] = Class67_Sub20.method1273(i_17_ + -256, -2147483648);
	    }
	}
	int[] colour = new int[5];
	for (int i = 0; i < 5; i++) {
	    int currentColour = arg0.readByte((byte) 83);
	    if (currentColour < 0 || (Class67_Sub5_Sub9.aShortArrayArray4600[i].length <= currentColour)) {
			currentColour = 0; colour[i] = currentColour;
		}
	}
	playerAnims = arg0.readUShort(-2386);
	long name = arg0.readLong(-9426);
	playerName = Class67_Sub17.method1250((byte) -72, name).method500(0);
	combatLevel = arg0.readByte((byte) -115);
	if (!bool) {
	    anInt5067 = 0;
	    anInt5066 = arg0.readByte((byte) -84); 
	    anInt5075 = arg0.readByte((byte) 98);
	    if (anInt5075 == 255) {
			anInt5075 = -1;
		}
	} else {
	    anInt5067 = arg0.readUShort(-2386); // this
	    anInt5066 = combatLevel;
	    anInt5075 = -1;
	}
	int i_22_ = lastByte;
	lastByte = arg0.readByte((byte) 118);
	if (lastByte == 0) {
	    Class126_Sub4.method1722(false, this);
	} else {
	    int i_23_ = anInt5062;
	    int i_24_ = anInt5087;
	    int i_25_ = anInt5080;
	    int i_26_ = anInt5071;
	    anInt5087 = arg0.readUShort(-2386);
	    anInt5062 = arg0.readUShort(-2386);
	    anInt5080 = arg0.readUShort(-2386);
	    anInt5071 = arg0.readUShort(-2386);
	    if (lastByte != i_22_ || i_24_ != anInt5087 || (anInt5062 ^ 0xffffffff) != (i_23_ ^ 0xffffffff) || i_25_ != anInt5080 || anInt5071 != i_26_)
		OutputStream_Sub1.method56(this, false);
	}
	if (aClass22_5065 == null) {
	    aClass22_5065 = new Class22();
	}
	int i_27_ = aClass22_5065.anInt536;
	aClass22_5065.method205((i_10_ ^ 0xffffffff) == -2, colour, playerAnims, equipment, -9, i_12_);
	if (i_12_ != i_27_) {
	    anInt3733 = smallX[0] * 128 - -(method1887((byte) -82) * 64);
	    anInt3726 = 128 * smallY[0] - -(64 * method1887((byte) -59));
	}
	if (aClass61_Sub1_3732 != null)
	    aClass61_Sub1_3732.method559();
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	anInt5078++;
	if (aClass22_5065 != null) {
	    Class41 class41 = (((anInt3735 ^ 0xffffffff) != 0
				&& (anInt3792 ^ 0xffffffff) == -1)
			       ? Class120.method1666(anInt3735, -32) : null);
	    Class41 class41_28_
		= (((anInt3720 ^ 0xffffffff) == 0 || aBoolean5061
		    || ((anInt3720 ^ 0xffffffff)
			== (this.method1880((byte) -74).anInt1797
			    ^ 0xffffffff)) && class41 != null)
		   ? null : Class120.method1666(anInt3720, -32));
	    Class131_Sub6 class131_sub6
		= aClass22_5065.method201(anInt3758, anInt3704, class41,
					  anInt3783, true, aClass21Array3749,
					  anInt3717, anInt3741, true,
					  class41_28_, anInt3722);
	    int i = Class130.method1759(false);
	    if ((Class100.anInt1972 ^ 0xffffffff) != -1 && i < 50) {
		int i_29_;
		for (i_29_ = 50 + -i; Class67_Sub1_Sub35.anInt4340 < i_29_;
		     Class67_Sub1_Sub35.anInt4340++)
		    Class99.aByteArrayArray1960[Class67_Sub1_Sub35.anInt4340]
			= new byte[102400];
		while ((Class67_Sub1_Sub35.anInt4340 ^ 0xffffffff)
		       < (i_29_ ^ 0xffffffff)) {
		    Class67_Sub1_Sub35.anInt4340--;
		    Class99.aByteArrayArray1960[Class67_Sub1_Sub35.anInt4340]
			= null;
		}
	    }
	    if (class131_sub6 != null) {
		anInt3776 = class131_sub6.method1769();
		if (Class67_Sub5_Sub9.aBoolean4614
		    && ((aClass22_5065.anInt536 ^ 0xffffffff) == 0
			|| (Class133.method1908(aClass22_5065.anInt536, 91)
			    .aBoolean1234))) {
		    Class131_Sub6 class131_sub6_30_
			= (Class72.method1346
			   (anInt3726, 1, class131_sub6, 240, 0, true, 0,
			    class41_28_ != null ? class41_28_ : class41,
			    anInt3733, aBoolean3699, arg0, 160,
			    class41_28_ != null ? anInt3758 : anInt3783,
			    anInt3715));
		    class131_sub6_30_.method1764(0, arg1, arg2, arg3, arg4,
						 arg5, arg6, arg7, -1L, arg9,
						 null);
		}
		if (this == Class122.aClass131_Sub7_Sub2_2309) {
		    for (int i_31_ = -1 + Class136.aClass74Array2499.length;
			 (i_31_ ^ 0xffffffff) <= -1; i_31_--) {
			Class74 class74 = Class136.aClass74Array2499[i_31_];
			if (class74 != null && class74.anInt1489 != -1) {
			    if (class74.anInt1491 == 1
				&& (class74.anInt1482 ^ 0xffffffff) <= -1
				&& (((Class128
				      .aClass131_Sub7_Sub1Array2386).length
				     ^ 0xffffffff)
				    < (class74.anInt1482 ^ 0xffffffff))) {
				Class131_Sub7_Sub1 class131_sub7_sub1
				    = (Class128.aClass131_Sub7_Sub1Array2386
				       [class74.anInt1482]);
				if (class131_sub7_sub1 != null) {
				    int i_32_
					= (class131_sub7_sub1.anInt3733 / 32
					   + -((Class122
						.aClass131_Sub7_Sub2_2309
						.anInt3733)
					       / 32));
				    int i_33_
					= (class131_sub7_sub1.anInt3726 / 32
					   + -((Class122
						.aClass131_Sub7_Sub2_2309
						.anInt3726)
					       / 32));
				    method1899(i_33_, arg7, arg5, (byte) 16,
					       class74.anInt1489, arg6, i_32_,
					       arg1, null, arg3, arg2, arg0,
					       arg9, arg4, class131_sub6);
				}
			    }
			    if ((class74.anInt1491 ^ 0xffffffff) == -3) {
				int i_34_
				    = (-((Class122.aClass131_Sub7_Sub2_2309
					  .anInt3726)
					 / 32)
				       + 2
				       + (-Class137.baseY
					  + class74.anInt1486) * 4);
				int i_35_
				    = (-((Class122.aClass131_Sub7_Sub2_2309
					  .anInt3733)
					 / 32)
				       + (2 + (-Class58.baseX
					       + class74.anInt1490) * 4));
				method1899(i_34_, arg7, arg5, (byte) 16,
					   class74.anInt1489, arg6, i_35_,
					   arg1, null, arg3, arg2, arg0, arg9,
					   arg4, class131_sub6);
			    }
			    if ((class74.anInt1491 ^ 0xffffffff) == -11
				&& (class74.anInt1482 ^ 0xffffffff) <= -1
				&& ((class74.anInt1482 ^ 0xffffffff)
				    > ((Class67_Sub5_Sub18
					.aClass131_Sub7_Sub2Array4810).length
				       ^ 0xffffffff))) {
				Class131_Sub7_Sub2 class131_sub7_sub2
				    = (Class67_Sub5_Sub18
				       .aClass131_Sub7_Sub2Array4810
				       [class74.anInt1482]);
				if (class131_sub7_sub2 != null) {
				    int i_36_
					= (class131_sub7_sub2.anInt3726 / 32
					   - (Class122.aClass131_Sub7_Sub2_2309
					      .anInt3726) / 32);
				    int i_37_
					= (-((Class122.aClass131_Sub7_Sub2_2309
					      .anInt3733)
					     / 32)
					   + (class131_sub7_sub2.anInt3733
					      / 32));
				    method1899(i_36_, arg7, arg5, (byte) 16,
					       class74.anInt1489, arg6, i_37_,
					       arg1, null, arg3, arg2, arg0,
					       arg9, arg4, class131_sub6);
				}
			    }
			}
		    }
		}
		this.method1884((byte) -118, class131_sub6);
		Class131_Sub6 class131_sub6_38_ = null;
		this.method1873(arg0, class131_sub6, true);
		if (!aBoolean5061 && (anInt3739 ^ 0xffffffff) != 0
		    && anInt3745 != -1) {
		    Class81 class81
			= Class67_Sub1.method622(-17177, anInt3739);
		    class131_sub6_38_
			= class81.method1428(anInt3780, (byte) -71, anInt3712,
					     anInt3745);
		    if (class131_sub6_38_ != null) {
			class131_sub6_38_.method1837(0, -anInt3760, 0);
			if (class81.aBoolean1634) {
			    if (Class124.anInt2324 != 0)
				class131_sub6_38_
				    .method1847(Class124.anInt2324);
			    if ((Class131.anInt2425 ^ 0xffffffff) != -1)
				class131_sub6_38_
				    .method1836(Class131.anInt2425);
			    if (Class102.anInt2005 != 0)
				class131_sub6_38_
				    .method1837(0, Class102.anInt2005, 0);
			}
		    }
		}
		Class131_Sub6 class131_sub6_39_ = null;
		if (!aBoolean5061 && anObject3747 != null) {
		    if (Class67_Sub1_Sub9.anInt3952 >= anInt3742)
			anObject3747 = null;
		    if (anInt3706 <= Class67_Sub1_Sub9.anInt3952
			&& ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)
			    > (anInt3742 ^ 0xffffffff))) {
			if (!(anObject3747 instanceof Class131_Sub5))
			    class131_sub6_39_ = (Class131_Sub6) anObject3747;
			else
			    class131_sub6_39_
				= (Class131_Sub6) ((Class131_Sub5)
						   anObject3747)
						      .method1824((byte) 35);
			class131_sub6_39_.method1837(-anInt3733 + anInt3782,
						     anInt3762 + -anInt3715,
						     anInt3692 - anInt3726);
			if (anInt3721 == 512)
			    class131_sub6_39_.method1848();
			else if ((anInt3721 ^ 0xffffffff) == -1025)
			    class131_sub6_39_.method1829();
			else if (anInt3721 == 1536)
			    class131_sub6_39_.method1839();
		    }
		}
		if (class131_sub6_38_ != null)
		    class131_sub6 = ((Class131_Sub6_Sub1) class131_sub6)
					.method1857(class131_sub6_38_);
		if (class131_sub6_39_ != null)
		    class131_sub6 = ((Class131_Sub6_Sub1) class131_sub6)
					.method1857(class131_sub6_39_);
		class131_sub6.aBoolean3690 = true;
		class131_sub6.method1764(arg0, arg1, arg2, arg3, arg4, arg5,
					 arg6, arg7, arg8, arg9,
					 aClass61_Sub1_3732);
		if (class131_sub6_39_ != null) {
		    if ((anInt3721 ^ 0xffffffff) == -513)
			class131_sub6_39_.method1839();
		    else if ((anInt3721 ^ 0xffffffff) != -1025) {
			if ((anInt3721 ^ 0xffffffff) == -1537)
			    class131_sub6_39_.method1848();
		    } else
			class131_sub6_39_.method1829();
		    class131_sub6_39_.method1837(anInt3733 + -anInt3782,
						 -anInt3762 + anInt3715,
						 -anInt3692 + anInt3726);
		}
	    }
	}
    }
    
    public int method1769() {
	anInt5084++;
	return anInt3776;
    }
    
    public RSString method1898(int arg0) {
	anInt5074++;
	if (arg0 != -14756)
	    return null;
	RSString RSString = playerName;
	if (Class65.aRSStringArray1279 != null)
	    RSString
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ (Class65.aRSStringArray1279
						   [anInt5088]),
						  RSString }),
					       -91);
	if (Class67_Sub1_Sub9.aRSStringArray3943 != null)
	    RSString
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ RSString, (Class67_Sub1_Sub9
							    .aRSStringArray3943
							    [anInt5088]) }),
					       -99);
	return RSString;
    }
    
    public void method1899(int arg0, int arg1, int arg2, byte arg3, int arg4,
			   int arg5, int arg6, int arg7, Class61_Sub1 arg8,
			   int arg9, int arg10, int arg11, int arg12,
			   int arg13, Class131_Sub6 arg14) {
	do {
	    try {
		anInt5072++;
		if (arg3 == 16) {
		    int i = arg0 * arg0 + arg6 * arg6;
		    if ((i ^ 0xffffffff) <= -17
			&& (i ^ 0xffffffff) >= -360001) {
			int i_40_
			    = (0x7ff
			       & (int) (325.949 * Math.atan2((double) arg6,
							     (double) arg0)));
			Class131_Sub6 class131_sub6
			    = Class6.method80(i_40_, anInt3726, -124, arg4,
					      arg14, anInt3715, anInt3733);
			if (class131_sub6 == null)
			    break;
			class131_sub6.method1764(0, arg7, arg10, arg9, arg13,
						 arg2, arg5, arg1, -1L, arg12,
						 arg8);
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718
			  (runtimeexception,
			   ("pb.W(" + arg0 + ',' + arg1 + ',' + arg2 + ','
			    + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			    + arg7 + ',' + (arg8 != null ? "{...}" : "null")
			    + ',' + arg9 + ',' + arg10 + ',' + arg11 + ','
			    + arg12 + ',' + arg13 + ','
			    + (arg14 != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class131_Sub7_Sub2() {
	anInt5066 = 0;
	anInt5062 = -1;
	anInt5080 = -1;
	anInt5075 = -1;
	anInt5071 = -1;
	aBoolean5061 = false;
	anInt5087 = -1;
	anInt5088 = 0;
	lastByte = 0;
    }
}
