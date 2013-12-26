/* Class67_Sub5_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub4_Sub1 extends Class67_Sub5_Sub4
{
    public static int anInt5103;
    public byte aByte5104;
    public static int anInt5105;
    public static int anInt5106;
    public Stream aStream_5107;
    public static int anInt5108;
    public static int anInt5109;
    public static RSString aRSString_5110
	= Class134.method1914("Hidden)2", (byte) 93);
    public static int anInt5111;
    public int anInt5112;
    public static Class92 aClass92_5113 = new Class92(512);
    public static int[] anIntArray5114;
    public static RSString aRSString_5115
	= Class134.method1914("Attack", (byte) 104);
    public static int anInt5116;
    public static int anInt5117;
    public static RSString aRSString_5118;
    public static RSString aRSString_5119;
    public static RSString aRSString_5120
	= Class134.method1914("Chargement des polices )2 ", (byte) 6);
    public static RSString aRSString_5121;
    
    public byte[] method853(int arg0) {
	anInt5106++;
	if (aBoolean4506
	    || (aStream_5107.currentOffset
		< aStream_5107.buffer.length + -aByte5104))
	    throw new RuntimeException();
	if (arg0 != 0)
	    method853(61);
	return aStream_5107.buffer;
    }
    
    public static void method854(int arg0, Class7 arg1, int arg2, int arg3,
				 int arg4) {
	Class132.method1901(64);
	Class121.method1685(arg0, arg4, arg1.anInt189 + arg0,
			    arg4 + arg1.anInt194);
	if (arg3 != 32)
	    aRSString_5110 = null;
	if (Class67_Sub1_Sub13.anInt4019 == 2
	    || Class67_Sub1_Sub13.anInt4019 == 5
	    || Class41.aClass67_Sub5_Sub19_871 == null)
	    Class121.method1671(arg0, arg4, 0, arg1.anIntArray179,
				arg1.anIntArray337);
	else {
	    int i = Class67_Sub5_Sub4.anInt4504 - -Class5.anInt137 & 0x7ff;
	    int i_0_
		= 464 + -(Class122.aClass131_Sub7_Sub2_2309.anInt3726 / 32);
	    int i_1_ = 48 + Class122.aClass131_Sub7_Sub2_2309.anInt3733 / 32;
	    ((Class67_Sub5_Sub19_Sub1) Class41.aClass67_Sub5_Sub19_871)
		.method1025
		(arg0, arg4, arg1.anInt189, arg1.anInt194, i_1_, i_0_, i,
		 Class67_Sub1_Sub15.anInt4063 + 256, arg1.anIntArray179,
		 arg1.anIntArray337);
	    if (Class131.aClass72_2428 != null) {
		for (int i_2_ = 0;
		     ((Class131.aClass72_2428.anInt1439 ^ 0xffffffff)
		      < (i_2_ ^ 0xffffffff));
		     i_2_++) {
		    if (Class131.aClass72_2428.method1344(i_2_, (byte) -103)) {
			int i_3_
			    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3733
				 / 32)
			       + 2
			       + (-Class58.baseX
				  + (Class131.aClass72_2428.aShortArray1444
				     [i_2_])) * 4);
			int i_4_ = Class26.anIntArray617[i];
			i_4_ = 256 * i_4_ / (256
					     + Class67_Sub1_Sub15.anInt4063);
			int i_5_
			    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3726
				 / 32)
			       + (2 + 4 * ((Class131.aClass72_2428
					    .aShortArray1443[i_2_])
					   + -Class137.baseY)));
			int i_6_ = Class26.anIntArray612[i];
			i_6_ = 256 * i_6_ / (Class67_Sub1_Sub15.anInt4063
					     - -256);
			int i_7_ = i_3_ * i_6_ + i_4_ * i_5_ >> 1849763568;
			Class67_Sub5_Sub10 class67_sub5_sub10
			    = Class84.aClass67_Sub5_Sub10_1692;
			int i_8_ = i_5_ * i_6_ + -(i_3_ * i_4_) >> 1341053648;
			if ((Class131.aClass72_2428.method1345(i_2_,
							       (byte) 102)
			     ^ 0xffffffff)
			    == -2)
			    class67_sub5_sub10
				= Class143.aClass67_Sub5_Sub10_2583;
			if (Class131.aClass72_2428.method1345(i_2_, (byte) 108)
			    == 2)
			    class67_sub5_sub10
				= Class130.aClass67_Sub5_Sub10_2404;
			int i_9_
			    = class67_sub5_sub10.method904((Class131
							    .aClass72_2428
							    .aRSStringArray1441
							    [i_2_]),
							   100);
			i_7_ -= i_9_ / 2;
			if (-arg1.anInt189 <= i_7_ && arg1.anInt189 >= i_7_
			    && -arg1.anInt194 <= i_8_
			    && arg1.anInt194 >= i_8_) {
			    int i_10_ = 16777215;
			    if (Class131.aClass72_2428.anIntArray1433[i_2_]
				!= -1)
				i_10_ = (Class131.aClass72_2428.anIntArray1433
					 [i_2_]);
			    Class121.method1678(arg1.anIntArray179,
						arg1.anIntArray337);
			    class67_sub5_sub10.method915
				((Class131.aClass72_2428.aRSStringArray1441
				  [i_2_]),
				 arg0 + i_7_ - -(arg1.anInt189 / 2),
				 arg1.anInt194 / 2 + (arg4 - i_8_), i_9_, 50,
				 i_10_, 0, 256, 1, 0, 0);
			    Class121.method1693();
			}
		    }
		}
	    }
	    for (int i_11_ = 0; Class70_Sub1.anInt3371 > i_11_; i_11_++) {
		int i_12_
		    = (2 + 4 * Class10.anIntArray403[i_11_]
		       - Class122.aClass131_Sub7_Sub2_2309.anInt3733 / 32);
		int i_13_
		    = (Class99.anIntArray1966[i_11_] * 4
		       + (2
			  - Class122.aClass131_Sub7_Sub2_2309.anInt3726 / 32));
		Class65 class65
		    = Class73.method1359(11525, Class36.anIntArray779[i_11_]);
		if (class65.anIntArray1244 != null) {
		    class65 = class65.method590((byte) -84);
		    if (class65 == null || class65.anInt1249 == -1)
			continue;
		}
		Class139.method1941(arg1, arg0,
				    (Class67_Sub5_Sub6
				     .aClass67_Sub5_Sub19Array4547
				     [class65.anInt1249]),
				    true, i_12_, arg4, i_13_);
	    }
	    for (int i_14_ = 0; i_14_ < 104; i_14_++) {
		for (int i_15_ = 0; i_15_ < 104; i_15_++) {
		    Class50 class50
			= (Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			   [Canvas_Sub1.anInt59][i_14_][i_15_]);
		    if (class50 != null) {
			int i_16_
			    = (i_14_ * 4 + 2
			       + -(Class122.aClass131_Sub7_Sub2_2309.anInt3733
				   / 32));
			int i_17_
			    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3726
				 / 32)
			       + (4 * i_15_ + 2));
			Class139.method1941(arg1, arg0,
					    (Class83
					     .aClass67_Sub5_Sub19Array1687[0]),
					    true, i_16_, arg4, i_17_);
		    }
		}
	    }
	    for (int i_18_ = 0; Class37.anInt794 > i_18_; i_18_++) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = (Class128.aClass131_Sub7_Sub1Array2386
		       [Class47.anIntArray965[i_18_]]);
		if (class131_sub7_sub1 != null
		    && class131_sub7_sub1.method1878((byte) 62)) {
		    Class64 class64 = class131_sub7_sub1.aClass64_5047;
		    if (class64 != null && class64.anIntArray1208 != null)
			class64 = class64.method578(-1);
		    if (class64 != null && class64.aBoolean1231
			&& class64.aBoolean1232) {
			int i_19_
			    = (class131_sub7_sub1.anInt3733 / 32
			       - (Class122.aClass131_Sub7_Sub2_2309.anInt3733
				  / 32));
			int i_20_
			    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3726
				 / 32)
			       + class131_sub7_sub1.anInt3726 / 32);
			if ((class64.anInt1193 ^ 0xffffffff) == 0)
			    Class139.method1941(arg1, arg0,
						(Class83
						 .aClass67_Sub5_Sub19Array1687
						 [1]),
						true, i_19_, arg4, i_20_);
			else
			    Class139.method1941(arg1, arg0,
						(Class67_Sub5_Sub6
						 .aClass67_Sub5_Sub19Array4547
						 [class64.anInt1193]),
						true, i_19_, arg4, i_20_);
		    }
		}
	    }
	    for (int i_21_ = 0; i_21_ < Class67_Sub1_Sub4.anInt3855; i_21_++) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		       [Class3.anIntArray120[i_21_]]);
		if (class131_sub7_sub2 != null
		    && class131_sub7_sub2.method1878((byte) 62)) {
		    int i_22_
			= (class131_sub7_sub2.anInt3733 / 32
			   + -(Class122.aClass131_Sub7_Sub2_2309.anInt3733
			       / 32));
		    int i_23_
			= (class131_sub7_sub2.anInt3726 / 32
			   - Class122.aClass131_Sub7_Sub2_2309.anInt3726 / 32);
		    boolean bool = false;
		    long l = class131_sub7_sub2.playerName
				 .method501((byte) -16);
		    for (int i_24_ = 0; Class67_Sub5_Sub17.anInt4795 > i_24_;
			 i_24_++) {
			if (((Class66.aLongArray1330[i_24_]
			      ^ 0xffffffffffffffffL)
			     == (l ^ 0xffffffffffffffffL))
			    && ((Class67.anIntArray1335[i_24_] ^ 0xffffffff)
				!= -1)) {
			    bool = true;
			    break;
			}
		    }
		    boolean bool_25_ = false;
		    for (int i_26_ = 0;
			 ((Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff)
			  < (i_26_ ^ 0xffffffff));
			 i_26_++) {
			if ((l ^ 0xffffffffffffffffL)
			    == ((Class69.aClass67_Sub25Array1380[i_26_]
				 .aLong1344)
				^ 0xffffffffffffffffL)) {
			    bool_25_ = true;
			    break;
			}
		    }
		    boolean bool_27_ = false;
		    if ((Class122.aClass131_Sub7_Sub2_2309.playerTeam
			 ^ 0xffffffff) != -1
			&& (class131_sub7_sub2.playerTeam ^ 0xffffffff) != -1
			&& (Class122.aClass131_Sub7_Sub2_2309.playerTeam
			    == class131_sub7_sub2.playerTeam))
			bool_27_ = true;
		    if (!bool) {
			if (!bool_25_) {
			    if (bool_27_)
				Class139.method1941
				    (arg1, arg0,
				     Class83.aClass67_Sub5_Sub19Array1687[4],
				     true, i_22_, arg4, i_23_);
			    else
				Class139.method1941
				    (arg1, arg0,
				     Class83.aClass67_Sub5_Sub19Array1687[2],
				     true, i_22_, arg4, i_23_);
			} else
			    Class139.method1941(arg1, arg0,
						(Class83
						 .aClass67_Sub5_Sub19Array1687
						 [5]),
						true, i_22_, arg4, i_23_);
		    } else
			Class139.method1941(arg1, arg0,
					    (Class83
					     .aClass67_Sub5_Sub19Array1687[3]),
					    true, i_22_, arg4, i_23_);
		}
	    }
	    int i_28_ = 0;
	    for (Class74[] class74s = Class136.aClass74Array2499;
		 (class74s.length ^ 0xffffffff) < (i_28_ ^ 0xffffffff);
		 i_28_++) {
		Class74 class74 = class74s[i_28_];
		if (class74 != null && (class74.anInt1491 ^ 0xffffffff) != -1
		    && Class67_Sub1_Sub9.anInt3952 % 20 < 10) {
		    if ((class74.anInt1491 ^ 0xffffffff) == -2
			&& class74.anInt1482 >= 0
			&& (Class128.aClass131_Sub7_Sub1Array2386.length
			    ^ 0xffffffff) < (class74.anInt1482 ^ 0xffffffff)) {
			Class131_Sub7_Sub1 class131_sub7_sub1
			    = (Class128.aClass131_Sub7_Sub1Array2386
			       [class74.anInt1482]);
			if (class131_sub7_sub1 != null) {
			    int i_29_
				= -(Class122.aClass131_Sub7_Sub2_2309.anInt3733
				    / 32) + class131_sub7_sub1.anInt3733 / 32;
			    int i_30_
				= -(Class122.aClass131_Sub7_Sub2_2309.anInt3726
				    / 32) + class131_sub7_sub1.anInt3726 / 32;
			    Class54.method455(arg1, i_29_, i_30_, arg4, arg0,
					      class74.anInt1496, 20);
			}
		    }
		    if (class74.anInt1491 == 2) {
			int i_31_
			    = ((class74.anInt1486 + -Class137.baseY) * 4
			       - -2
			       - (Class122.aClass131_Sub7_Sub2_2309.anInt3726
				  / 32));
			int i_32_
			    = (2 + (class74.anInt1490 - Class58.baseX) * 4
			       - (Class122.aClass131_Sub7_Sub2_2309.anInt3733
				  / 32));
			Class54.method455(arg1, i_32_, i_31_, arg4, arg0,
					  class74.anInt1496, 20);
		    }
		    if ((class74.anInt1491 ^ 0xffffffff) == -11
			&& (class74.anInt1482 ^ 0xffffffff) <= -1
			&& (class74.anInt1482
			    < (Class67_Sub5_Sub18
			       .aClass131_Sub7_Sub2Array4810).length)) {
			Class131_Sub7_Sub2 class131_sub7_sub2
			    = (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			       [class74.anInt1482]);
			if (class131_sub7_sub2 != null) {
			    int i_33_ = (class131_sub7_sub2.anInt3726 / 32
					 - (Class122.aClass131_Sub7_Sub2_2309
					    .anInt3726) / 32);
			    int i_34_ = (class131_sub7_sub2.anInt3733 / 32
					 - (Class122.aClass131_Sub7_Sub2_2309
					    .anInt3733) / 32);
			    Class54.method455(arg1, i_34_, i_33_, arg4, arg0,
					      class74.anInt1496, arg3 ^ 0x34);
			}
		    }
		}
	    }
	    if ((Class33_Sub2.mapFlag ^ 0xffffffff) != -1) {
		int i_35_
		    = (Class33_Sub2.mapFlag * 4
		       - (-2 - -(Class122.aClass131_Sub7_Sub2_2309.anInt3733
				 / 32)));
		int i_36_
		    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3726 / 32)
		       + (2 + 4 * Class67_Sub1_Sub11.anInt3990));
		Class139.method1941(arg1, arg0,
				    Class67_Sub1_Sub4.aClass67_Sub5_Sub19_3862,
				    true, i_35_, arg4, i_36_);
	    }
	    Class121.method1683(arg0 - (-(arg1.anInt189 / 2) - -1),
				-1 + (arg1.anInt194 / 2 + arg4), 3, 3,
				16777215);
	}
	Class67_Sub5_Sub3.aBooleanArray4501[arg2] = true;
	anInt5105++;
    }
    
    public static boolean method855(int arg0, int arg1) {
	Class70_Sub1 class70_sub1 = Class61.method552(arg0, -54);
	anInt5108++;
	if (class70_sub1 == null)
	    return false;
	if (arg1 != 32)
	    anIntArray5114 = null;
	if ((SignLink.anInt931 ^ 0xffffffff) == -2 || SignLink.anInt931 == 2
	    || (Class23.anInt555 ^ 0xffffffff) == -3) {
	    byte[] is = class70_sub1.aRSString_3372.method518(false);
	    Class67_Sub1_Sub29.aString4265 = new String(is, 0, is.length);
	    Class67_Sub23.anInt3202 = class70_sub1.anInt3365;
	    if (Class23.anInt555 != 0) {
		Class5.anInt138 = Class67_Sub23.anInt3202 + 40000;
		Class2.anInt105 = Class67_Sub23.anInt3202 + 50000;
		Class67_Sub9.anInt2968 = Class5.anInt138;
	    }
	    return true;
	}
	RSString RSString = Class8.aRSString_347;
	if (Class23.anInt555 != 0)
	    RSString
		= (Class67_Sub1_Sub27.method744
		   ((new RSString[]
		     { Class55_Sub2_Sub1.aRSString_3800,
		       InputStream_Sub1.method47(class70_sub1.anInt3365 + 7000,
						 true) }),
		    -118));
	RSString RSString_37_ = Class8.aRSString_347;
	if (Class101.aRSString_1991 != null)
	    RSString_37_
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ Class114.aRSString_2157,
						  Class101.aRSString_1991 }),
					       -106);
	RSString RSString_38_
	    = (Class67_Sub1_Sub27.method744
	       ((new RSString[]
		 { Class55_Sub1.aRSString_2793, class70_sub1.aRSString_3372,
		   RSString, Class67_Sub1_Sub36.aRSString_4377,
		   InputStream_Sub1.method47(Class131_Sub3.anInt3603, true),
		   Class6.aRSString_160,
		   InputStream_Sub1.method47(Class67_Sub5_Sub3.anInt4489,
					     true),
		   RSString_37_, Class96.aRSString_1913,
		   (client.aBoolean2734 ? Class67_Sub1_Sub13.aRSString_4032
		    : Class21.aRSString_522),
		   Class55_Sub2_Sub1.aRSString_3801,
		   (Class67_Sub16.aBoolean3089
		    ? Class67_Sub1_Sub13.aRSString_4032 : Class21.aRSString_522),
		   Class126_Sub4.aRSString_3470,
		   (Class132.lowMememoryMode ? Class67_Sub1_Sub13.aRSString_4032
		    : Class21.aRSString_522) }),
		-96));
	try {
	    Class28.aClient672.getAppletContext()
		.showDocument(RSString_38_.method541(-8320), "_self");
	} catch (Exception exception) {
	    return false;
	}
	return true;
    }
    
    public int method849(byte arg0) {
	anInt5109++;
	if (aStream_5107 == null)
	    return 0;
	if (arg0 != -52)
	    aRSString_5118 = null;
	return (aStream_5107.currentOffset * 100
		/ (-aByte5104 + aStream_5107.buffer.length));
    }
    
    public static void method856(int arg0) {
	aRSString_5119 = null;
	aRSString_5118 = null;
	aRSString_5110 = null;
	anIntArray5114 = null;
	if (arg0 > 22) {
	    aClass92_5113 = null;
	    aRSString_5115 = null;
	    aRSString_5120 = null;
	    aRSString_5121 = null;
	}
    }
    
    public static RSString method857(int arg0, long arg1, boolean arg2,
				    int arg3) {
	try {
	    anInt5111++;
	    if ((arg3 ^ 0xffffffff) > -3 || (arg3 ^ 0xffffffff) < -37)
		throw new IllegalArgumentException("Invalid radix:" + arg3);
	    long l = arg1 / (long) arg3;
	    int i = 1;
	    while ((l ^ 0xffffffffffffffffL) != -1L) {
		l /= (long) arg3;
		i++;
	    }
	    int i_39_ = i;
	    if ((arg1 ^ 0xffffffffffffffffL) > -1L || arg2)
		i_39_++;
	    byte[] is = new byte[i_39_];
	    if ((arg1 ^ 0xffffffffffffffffL) > -1L)
		is[0] = (byte) 45;
	    else if (arg2)
		is[0] = (byte) 43;
	    for (int i_40_ = arg0; (i ^ 0xffffffff) < (i_40_ ^ 0xffffffff);
		 i_40_++) {
		int i_41_ = (int) (arg1 % (long) arg3);
		arg1 /= (long) arg3;
		if ((i_41_ ^ 0xffffffff) > -1)
		    i_41_ = -i_41_;
		if ((i_41_ ^ 0xffffffff) < -10)
		    i_41_ += 39;
		is[i_39_ + (-i_40_ - 1)] = (byte) (i_41_ + 48);
	    }
	    RSString RSString = new RSString();
	    RSString.aByteArray2653 = is;
	    RSString.anInt2629 = i_39_;
	    return RSString;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("fd.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    static {
	anInt5116 = -1;
	aRSString_5121 = aRSString_5115;
	aRSString_5119
	    = Class134.method1914("Chargement en cours)3 Veuillez patienter)3",
				  (byte) 62);
	aRSString_5118 = Class134.method1914("Spielwelt erstellt)3", (byte) 7);
    }
}
