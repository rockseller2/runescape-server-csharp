public class Class123
{
    public static int anInt2312;
    public static RSString aRSString_2313;
    public static RSString aRSString_2314;
    public static int anInt2315 = 1;
    public static int[] anIntArray2316;
    public static RSString aRSString_2317
	= Class134.method1914("Loaded world list data", (byte) 121);
    public static boolean aBoolean2318;
    public static int anInt2319;
    public static int anInt2320;
    public static int anInt2321;
    public static RSString aRSString_2322;
    
    public static void method1696(boolean arg0) {
	aRSString_2313 = null;
	aRSString_2314 = null;
	aRSString_2322 = null;
	aRSString_2317 = null;
	if (arg0 == true)
	    anIntArray2316 = null;
    }
    
    public static void method1697(int arg0, byte arg1) {
	anInt2321++;
	if ((arg0 ^ 0xffffffff) <= -1
	    && (arg0 ^ 0xffffffff) > (Class33_Sub2.aBooleanArray2777.length
				      ^ 0xffffffff)
	    && arg1 == -126)
	    Class33_Sub2.aBooleanArray2777[arg0]
		= !Class33_Sub2.aBooleanArray2777[arg0];
    }
    
    public static void method1698(byte arg0) {
	Class67_Sub5_Sub5.aClass136_4515.method1921((byte) 22);
	Class33_Sub2.aClass136_2778.method1921((byte) -107);
	if (arg0 >= -23)
	    method1697(-53, (byte) 79);
	anInt2312++;
    }
    
    public static void method1699(int arg0, boolean arg1) {
	anInt2320++;
	int i = Class67_Sub1_Sub4.anInt3855;
	if ((Class33_Sub2.mapFlag
	     == Class122.aClass131_Sub7_Sub2_2309.anInt3733 >> 1257239879)
	    && (Class67_Sub1_Sub11.anInt3990
		== Class122.aClass131_Sub7_Sub2_2309.anInt3726 >> 1537646503))
	    Class33_Sub2.mapFlag = 0;
	if (arg1)
	    i = 1;
	int i_0_ = 0;
	if (arg0 < 47)
	    method1697(106, (byte) -102);
	for (/**/; i_0_ < i; i_0_++) {
	    Class131_Sub7_Sub2 class131_sub7_sub2;
	    if (!arg1)
		class131_sub7_sub2
		    = (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		       [Class3.anIntArray120[i_0_]]);
	    else
		class131_sub7_sub2 = Class122.aClass131_Sub7_Sub2_2309;
	    if (class131_sub7_sub2 != null
		&& class131_sub7_sub2.method1878((byte) 62)) {
		int i_1_ = class131_sub7_sub2.method1887((byte) -27);
		if (i_1_ != 1) {
		    if (((0x1 & i_1_) != 0
			 || ((0x7f & class131_sub7_sub2.anInt3733
			      ^ 0xffffffff) == -1
			     && (0x7f & class131_sub7_sub2.anInt3726) == 0))
			&& ((i_1_ & 0x1 ^ 0xffffffff) != -2
			    || ((0x7f & class131_sub7_sub2.anInt3733) == 64
				&& (0x7f & class131_sub7_sub2.anInt3726
				    ^ 0xffffffff) == -65))) {
			int i_2_ = (-(64 * i_1_) + class131_sub7_sub2.anInt3726
				    >> 382328519);
			int i_3_ = (class131_sub7_sub2.anInt3733 + -(i_1_ * 64)
				    >> -1077176025);
			int i_4_
			    = i_3_ + class131_sub7_sub2.method1887((byte) -72);
			int i_5_
			    = class131_sub7_sub2.method1887((byte) -60) + i_2_;
			if ((i_4_ ^ 0xffffffff) < -105)
			    i_4_ = 104;
			if ((i_3_ ^ 0xffffffff) > -1)
			    i_3_ = 0;
			if (i_5_ > 104)
			    i_5_ = 104;
			if (i_2_ < 0)
			    i_2_ = 0;
			for (int i_6_ = i_3_; i_6_ < i_4_; i_6_++) {
			    for (int i_7_ = i_2_;
				 (i_5_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
				 i_7_++)
				Class7.anIntArrayArray252[i_6_][i_7_]++;
			}
		    }
		} else if (((class131_sub7_sub2.anInt3733 & 0x7f ^ 0xffffffff)
			    == -65)
			   && (0x7f & class131_sub7_sub2.anInt3726
			       ^ 0xffffffff) == -65) {
		    int i_8_ = class131_sub7_sub2.anInt3726 >> 1150489607;
		    int i_9_ = class131_sub7_sub2.anInt3733 >> -1266822713;
		    if ((i_9_ ^ 0xffffffff) <= -1 && i_9_ < 104
			&& (i_8_ ^ 0xffffffff) <= -1
			&& (i_8_ ^ 0xffffffff) > -105)
			Class7.anIntArrayArray252[i_9_][i_8_]++;
		}
	    }
	}
	for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
	    Class131_Sub7_Sub2 class131_sub7_sub2;
	    long l;
	    if (arg1) {
		class131_sub7_sub2 = Class122.aClass131_Sub7_Sub2_2309;
		l = 8791798054912L;
	    } else {
		class131_sub7_sub2
		    = (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		       [Class3.anIntArray120[i_10_]]);
		l = (long) Class3.anIntArray120[i_10_] << -1912623520;
	    }
	    if (class131_sub7_sub2 != null
		&& class131_sub7_sub2.method1878((byte) 62)) {
		class131_sub7_sub2.aBoolean5061 = false;
		if (((Class55_Sub3.aBoolean2808
		      && (Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff) < -201)
		     || (Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff) < -51)
		    && !arg1
		    && (class131_sub7_sub2.anInt3720
			== (class131_sub7_sub2.method1880((byte) -41)
			    .anInt1797)))
		    class131_sub7_sub2.aBoolean5061 = true;
		int i_11_ = class131_sub7_sub2.method1887((byte) -68);
		if (i_11_ != 1) {
		    if (((0x1 & i_11_ ^ 0xffffffff) == -1
			 && (class131_sub7_sub2.anInt3733 & 0x7f) == 0
			 && ((0x7f & class131_sub7_sub2.anInt3726 ^ 0xffffffff)
			     == -1))
			|| ((0x1 & i_11_) == 1
			    && (0x7f & class131_sub7_sub2.anInt3733) == 64
			    && (class131_sub7_sub2.anInt3726 & 0x7f) == 0)) {
			int i_12_
			    = (-(i_11_ * 64) + class131_sub7_sub2.anInt3733
			       >> -350372697);
			int i_13_ = i_11_ + i_12_;
			int i_14_
			    = (class131_sub7_sub2.anInt3726 + -(64 * i_11_)
			       >> -785954745);
			if (i_13_ > 104)
			    i_13_ = 104;
			if ((i_12_ ^ 0xffffffff) > -1)
			    i_12_ = 0;
			boolean bool = true;
			int i_15_ = i_14_ + i_11_;
			if (i_14_ < 0)
			    i_14_ = 0;
			if ((i_15_ ^ 0xffffffff) < -105)
			    i_15_ = 104;
			for (int i_16_ = i_12_;
			     (i_16_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff);
			     i_16_++) {
			    for (int i_17_ = i_14_; i_17_ < i_15_; i_17_++) {
				if (Class7.anIntArrayArray252[i_16_][i_17_]
				    <= 1) {
				    bool = false;
				    break;
				}
			    }
			}
			if (bool) {
			    for (int i_18_ = i_12_; i_18_ < i_13_; i_18_++) {
				for (int i_19_ = i_14_; i_15_ > i_19_; i_19_++)
				    Class7.anIntArrayArray252[i_18_][i_19_]--;
			    }
			    continue;
			}
		    }
		} else if ((class131_sub7_sub2.anInt3733 & 0x7f) == 64
			   && (0x7f & class131_sub7_sub2.anInt3726
			       ^ 0xffffffff) == -65) {
		    int i_20_ = class131_sub7_sub2.anInt3733 >> 695416903;
		    int i_21_ = class131_sub7_sub2.anInt3726 >> 516842791;
		    if (i_20_ < 0 || i_20_ >= 104 || i_21_ < 0 || i_21_ >= 104)
			continue;
		    if (Class7.anIntArrayArray252[i_20_][i_21_] > 1) {
			Class7.anIntArrayArray252[i_20_][i_21_]--;
			continue;
		    }
		}
		if (class131_sub7_sub2.anObject3747 != null
		    && ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)
			<= (class131_sub7_sub2.anInt3706 ^ 0xffffffff))
		    && ((class131_sub7_sub2.anInt3742 ^ 0xffffffff)
			< (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff))) {
		    class131_sub7_sub2.aBoolean5061 = false;
		    class131_sub7_sub2.anInt3715
			= Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						   (class131_sub7_sub2
						    .anInt3733),
						   (class131_sub7_sub2
						    .anInt3726),
						   (byte) -71);
		    Class67_Sub1_Sub16_Sub1.method695
			(Canvas_Sub1.anInt59, class131_sub7_sub2.anInt3733,
			 class131_sub7_sub2.anInt3726,
			 class131_sub7_sub2.anInt3715, class131_sub7_sub2,
			 class131_sub7_sub2.anInt3740, l,
			 class131_sub7_sub2.anInt3771,
			 class131_sub7_sub2.anInt3743,
			 class131_sub7_sub2.anInt3793,
			 class131_sub7_sub2.anInt3753);
		} else {
		    class131_sub7_sub2.anInt3715
			= Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						   (class131_sub7_sub2
						    .anInt3733),
						   (class131_sub7_sub2
						    .anInt3726),
						   (byte) 117);
		    Class131_Sub7.method1885(Canvas_Sub1.anInt59,
					     class131_sub7_sub2.anInt3733,
					     class131_sub7_sub2.anInt3726,
					     class131_sub7_sub2.anInt3715,
					     60 + 64 * i_11_ + -64,
					     class131_sub7_sub2,
					     class131_sub7_sub2.anInt3740, l,
					     class131_sub7_sub2.aBoolean3699);
		}
	    }
	}
    }
    
    static {
	anIntArray2316 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2,
				     2, 2, 2, 2, 2, 2, 2, 2, 3 };
	aRSString_2314 = aRSString_2317;
	aRSString_2313 = Class134.method1914(":chalreq:", (byte) 50);
	aRSString_2322 = Class134.method1914("<col=80ff00>", (byte) 26);
	aBoolean2318 = true;
    }
}
