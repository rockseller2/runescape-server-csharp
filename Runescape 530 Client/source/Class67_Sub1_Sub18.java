/* Class67_Sub1_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub18 extends Class67_Sub1
{
    public static int[] anIntArray4107;
    public static RSString aRSString_4108;
    public static int anInt4109;
    public static int anInt4110;
    public static Class9 aClass9_4111;
    public static int anInt4112;
    public static int anInt4113;
    public static Class7 aClass7_4114 = null;
    public static int anInt4115;
    public static int[] anIntArray4116;
    public static int anInt4117;
    public static int anInt4118;
    public static int anInt4119;
    public int[] anIntArray4120 = new int[257];
    public static int anInt4121;
    public static int anInt4122;
    public int[][] anIntArrayArray4123;
    public static RSString aRSString_4124;
    public static int anInt4125;
    
    public void method618(int arg0) {
	if (anIntArrayArray4123 == null)
	    method703(2072, 1);
	method701(25090);
	anInt4121++;
	int i = -13 % ((-60 - arg0) / 62);
    }
    
    public static void method700(byte arg0) {
	aRSString_4108 = null;
	aClass7_4114 = null;
	aClass9_4111 = null;
	aRSString_4124 = null;
	anIntArray4107 = null;
	int i = 41 / ((57 - arg0) / 61);
	anIntArray4116 = null;
    }
    
    public void method701(int arg0) {
	anInt4112++;
	if (arg0 == 25090) {
	    int i = anIntArrayArray4123.length;
	    if ((i ^ 0xffffffff) < -1) {
		for (int i_0_ = 0; i_0_ < 257; i_0_++) {
		    int i_1_ = i_0_ << 2030197892;
		    int i_2_ = 0;
		    for (int i_3_ = 0; i_3_ < i; i_3_++) {
			if (i_1_ < anIntArrayArray4123[i_3_][0])
			    break;
			i_2_++;
		    }
		    int i_4_;
		    int i_5_;
		    int i_6_;
		    if ((i_2_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
			int[] is = anIntArrayArray4123[i_2_];
			if ((i_2_ ^ 0xffffffff) < -1) {
			    int[] is_7_ = anIntArrayArray4123[-1 + i_2_];
			    int i_8_ = ((i_1_ - is_7_[0] << -353041844)
					/ (is[0] - is_7_[0]));
			    int i_9_ = 4096 - i_8_;
			    i_5_
				= i_9_ * is_7_[1] + i_8_ * is[1] >> -651031444;
			    i_6_ = is_7_[3] * i_9_ + is[3] * i_8_ >> 354971980;
			    i_4_
				= i_9_ * is_7_[2] + i_8_ * is[2] >> -368862132;
			} else {
			    i_5_ = is[1];
			    i_6_ = is[3];
			    i_4_ = is[2];
			}
		    } else {
			int[] is = anIntArrayArray4123[-1 + i];
			i_4_ = is[2];
			i_5_ = is[1];
			i_6_ = is[3];
		    }
		    i_4_ >>= 4;
		    i_5_ >>= 4;
		    if ((i_4_ ^ 0xffffffff) > -1)
			i_4_ = 0;
		    else if (i_4_ > 255)
			i_4_ = 255;
		    i_6_ >>= 4;
		    if (i_5_ < 0)
			i_5_ = 0;
		    else if ((i_5_ ^ 0xffffffff) < -256)
			i_5_ = 255;
		    if (i_6_ >= 0) {
			if ((i_6_ ^ 0xffffffff) < -256)
			    i_6_ = 255;
		    } else
			i_6_ = 0;
		    anIntArray4120[i_0_]
			= (Class67_Sub20.method1273
			   (Class67_Sub20.method1273(i_5_ << -2069784624,
						     i_4_ << 1177797032),
			    i_6_));
		}
	    }
	}
    }
    
    public static void method702(int arg0, boolean arg1, int arg2, int arg3,
				 int arg4, byte[] arg5, int arg6,
				 Class73[] arg7) {
	do {
	    try {
		int i;
		if (arg1)
		    i = 1;
		else
		    i = 4;
		if (!arg1) {
		    for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65;
			     i_11_++) {
			    for (int i_12_ = 0; i_12_ < 64; i_12_++) {
				if ((arg4 - -i_11_ ^ 0xffffffff) < -1
				    && arg4 - -i_11_ < 103
				    && (i_12_ + arg0 ^ 0xffffffff) < -1
				    && (arg0 + i_12_ ^ 0xffffffff) > -104)
				    arg7[i_10_].anIntArrayArray1453
					[i_11_ + arg4][arg0 - -i_12_]
					= (Class75.method1379
					   ((arg7[i_10_].anIntArrayArray1453
					     [i_11_ + arg4][arg0 - -i_12_]),
					    -16777217));
			    }
			}
		    }
		}
		anInt4119++;
		Stream Stream = new Stream(arg5);
		int i_13_ = 0;
		if (arg3 == 31375) {
		    for (/**/; i > i_13_; i_13_++) {
			for (int i_14_ = 0; i_14_ < 64; i_14_++) {
			    for (int i_15_ = 0; i_15_ < 64; i_15_++)
				Class47.method410(false, Stream,
						  i_15_ + arg0, 0, i_13_,
						  i_14_ - -arg4, arg2, arg1,
						  arg6);
			}
		    }
		    boolean bool = false;
		    while ((Stream.buffer.length ^ 0xffffffff)
			   < (Stream.currentOffset ^ 0xffffffff)) {
			int i_16_ = Stream.readByte((byte) -82);
			if ((i_16_ ^ 0xffffffff) != -130) {
			    Stream.currentOffset--;
			    break;
			}
			bool = true;
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -5;
			     i_17_++) {
			    byte i_18_ = Stream.readByte2((byte) 1);
			    if ((i_18_ ^ 0xffffffff) != -1) {
				if ((i_18_ ^ 0xffffffff) == -2) {
				    for (int i_19_ = 0;
					 (i_19_ ^ 0xffffffff) > -65;
					 i_19_ += 4) {
					for (int i_20_ = 0;
					     (i_20_ ^ 0xffffffff) > -65;
					     i_20_ += 4) {
					    byte i_21_
						= Stream
						      .readByte2((byte) 1);
					    for (int i_22_ = arg4 + i_19_;
						 ((i_22_ ^ 0xffffffff)
						  > (4 + i_19_ + arg4
						     ^ 0xffffffff));
						 i_22_++) {
						for (int i_23_ = arg0 + i_20_;
						     ((i_23_ ^ 0xffffffff)
						      > (4 + arg0 + i_20_
							 ^ 0xffffffff));
						     i_23_++) {
						    if (i_22_ >= 0
							&& ((i_22_
							     ^ 0xffffffff)
							    > -105)
							&& i_23_ >= 0
							&& ((i_23_
							     ^ 0xffffffff)
							    > -105))
							Class134
							    .aByteArrayArrayArray2464
							    [i_17_][i_22_]
							    [i_23_]
							    = i_21_;
						}
					    }
					}
				    }
				} else if ((i_18_ ^ 0xffffffff) == -3
					   && (i_17_ ^ 0xffffffff) < -1) {
				    int i_24_ = arg4 - -64;
				    if ((i_24_ ^ 0xffffffff) <= -1) {
					if ((i_24_ ^ 0xffffffff) <= -105)
					    i_24_ = 104;
				    } else
					i_24_ = 0;
				    int i_25_ = arg0;
				    int i_26_ = arg0 + 64;
				    if (i_26_ >= 0) {
					if ((i_26_ ^ 0xffffffff) <= -105)
					    i_26_ = 104;
				    } else
					i_26_ = 0;
				    int i_27_ = arg4;
				    if ((i_25_ ^ 0xffffffff) > -1)
					i_25_ = 0;
				    else if (i_25_ >= 104)
					i_25_ = 104;
				    if (i_27_ < 0)
					i_27_ = 0;
				    else if (i_27_ >= 104)
					i_27_ = 104;
				    for (/**/;
					 ((i_24_ ^ 0xffffffff)
					  < (i_27_ ^ 0xffffffff));
					 i_27_++) {
					for (/**/; i_25_ < i_26_; i_25_++)
					    Class134
						.aByteArrayArrayArray2464
						[i_17_][i_27_][i_25_]
						= (Class134
						   .aByteArrayArrayArray2464
						   [i_17_ - 1][i_27_][i_25_]);
				    }
				}
			    } else {
				int i_28_ = 64 + arg4;
				int i_29_ = arg4;
				if ((i_29_ ^ 0xffffffff) > -1)
				    i_29_ = 0;
				else if (i_29_ >= 104)
				    i_29_ = 104;
				int i_30_ = arg0 + 64;
				if ((i_30_ ^ 0xffffffff) <= -1) {
				    if ((i_30_ ^ 0xffffffff) <= -105)
					i_30_ = 104;
				} else
				    i_30_ = 0;
				if ((i_28_ ^ 0xffffffff) <= -1) {
				    if ((i_28_ ^ 0xffffffff) <= -105)
					i_28_ = 104;
				} else
				    i_28_ = 0;
				int i_31_ = arg0;
				if ((i_31_ ^ 0xffffffff) > -1)
				    i_31_ = 0;
				else if ((i_31_ ^ 0xffffffff) <= -105)
				    i_31_ = 104;
				for (/**/; i_29_ < i_28_; i_29_++) {
				    for (/**/; i_30_ > i_31_; i_31_++)
					Class134.aByteArrayArrayArray2464
					    [i_17_][i_29_][i_31_]
					    = (byte) 0;
				}
			    }
			}
		    }
		    if (bool)
			break;
		    for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -5; i_32_++) {
			for (int i_33_ = 0; i_33_ < 16; i_33_++) {
			    for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -17;
				 i_34_++) {
				int i_35_ = (arg0 >> -1584333566) + i_34_;
				int i_36_ = i_33_ + (arg4 >> 432292770);
				if ((i_36_ ^ 0xffffffff) <= -1
				    && (i_36_ ^ 0xffffffff) > -27 && i_35_ >= 0
				    && i_35_ < 26)
				    Class134.aByteArrayArrayArray2464
					[i_32_][i_36_][i_35_]
					= (byte) 0;
			    }
			}
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("nk.J(" + arg0 + ',' + arg1
						    + ',' + arg2 + ',' + arg3
						    + ',' + arg4 + ','
						    + (arg5 != null ? "{...}"
						       : "null")
						    + ',' + arg6 + ','
						    + (arg7 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4110++;
	if ((arg2 ^ 0xffffffff) == -1) {
	    int i = arg0.readByte((byte) -26);
	    if ((i ^ 0xffffffff) != -1)
		method703(2072, i);
	    else {
		anIntArrayArray4123 = new int[arg0.readByte((byte) 110)][4];
		for (int i_37_ = 0; ((anIntArrayArray4123.length ^ 0xffffffff)
				     < (i_37_ ^ 0xffffffff)); i_37_++) {
		    anIntArrayArray4123[i_37_][0] = arg0.readUShort(-2386);
		    anIntArrayArray4123[i_37_][1]
			= arg0.readByte((byte) -84) << -2003326780;
		    anIntArrayArray4123[i_37_][2]
			= arg0.readByte((byte) -49) << 1356540740;
		    anIntArrayArray4123[i_37_][3]
			= arg0.readByte((byte) -119) << 1230414308;
		}
	    }
	}
	if (arg1 != true)
	    anIntArray4116 = null;
    }
    
    public void method703(int arg0, int arg1) {
	anInt4117++;
    while_100_:
	do {
	    if (arg1 != 0) {
		int i = arg1;
	    while_99_:
		do {
		while_98_:
		    do {
		    while_97_:
			do {
			while_96_:
			    do {
				do {
				    if (i != 1) {
					if ((i ^ 0xffffffff) != -3) {
					    if ((i ^ 0xffffffff) != -4) {
						if ((i ^ 0xffffffff) != -5) {
						    if (i != 5) {
							if (i != 6)
							    break while_99_;
						    } else
							break while_97_;
						    break while_98_;
						}
					    } else
						break;
					    break while_96_;
					}
				    } else {
					anIntArrayArray4123 = new int[2][4];
					anIntArrayArray4123[0][2] = 0;
					anIntArrayArray4123[0][1] = 0;
					anIntArrayArray4123[1][1] = 4096;
					anIntArrayArray4123[0][3] = 0;
					anIntArrayArray4123[1][2] = 4096;
					anIntArrayArray4123[0][0] = 0;
					anIntArrayArray4123[1][0] = 4096;
					anIntArrayArray4123[1][3] = 4096;
					break while_100_;
				    }
				    anIntArrayArray4123 = new int[8][4];
				    anIntArrayArray4123[0][0] = 0;
				    anIntArrayArray4123[0][2] = 2602;
				    anIntArrayArray4123[0][3] = 2361;
				    anIntArrayArray4123[1][3] = 1558;
				    anIntArrayArray4123[0][1] = 2650;
				    anIntArrayArray4123[2][3] = 1413;
				    anIntArrayArray4123[3][3] = 947;
				    anIntArrayArray4123[1][1] = 2313;
				    anIntArrayArray4123[1][0] = 2867;
				    anIntArrayArray4123[1][2] = 1799;
				    anIntArrayArray4123[4][3] = 722;
				    anIntArrayArray4123[2][2] = 1734;
				    anIntArrayArray4123[2][0] = 3072;
				    anIntArrayArray4123[3][2] = 1220;
				    anIntArrayArray4123[5][3] = 1766;
				    anIntArrayArray4123[2][1] = 2618;
				    anIntArrayArray4123[6][3] = 915;
				    anIntArrayArray4123[3][0] = 3276;
				    anIntArrayArray4123[3][1] = 2296;
				    anIntArrayArray4123[7][3] = 1140;
				    anIntArrayArray4123[4][2] = 963;
				    anIntArrayArray4123[5][2] = 2152;
				    anIntArrayArray4123[4][1] = 2072;
				    anIntArrayArray4123[5][1] = 2730;
				    anIntArrayArray4123[4][0] = 3481;
				    anIntArrayArray4123[6][1] = 2232;
				    anIntArrayArray4123[7][1] = 1686;
				    anIntArrayArray4123[6][2] = 1060;
				    anIntArrayArray4123[5][0] = 3686;
				    anIntArrayArray4123[6][0] = 3891;
				    anIntArrayArray4123[7][0] = 4096;
				    anIntArrayArray4123[7][2] = 1413;
				    break while_100_;
				} while (false);
				anIntArrayArray4123 = new int[7][4];
				anIntArrayArray4123[0][2] = 0;
				anIntArrayArray4123[0][3] = 4096;
				anIntArrayArray4123[0][1] = 0;
				anIntArrayArray4123[1][2] = 4096;
				anIntArrayArray4123[0][0] = 0;
				anIntArrayArray4123[1][1] = 0;
				anIntArrayArray4123[2][2] = 4096;
				anIntArrayArray4123[2][1] = 0;
				anIntArrayArray4123[3][2] = 4096;
				anIntArrayArray4123[1][3] = 4096;
				anIntArrayArray4123[3][1] = 4096;
				anIntArrayArray4123[1][0] = 663;
				anIntArrayArray4123[2][3] = 0;
				anIntArrayArray4123[4][2] = 0;
				anIntArrayArray4123[2][0] = 1363;
				anIntArrayArray4123[4][1] = 4096;
				anIntArrayArray4123[5][1] = 4096;
				anIntArrayArray4123[3][3] = 0;
				anIntArrayArray4123[6][1] = 0;
				anIntArrayArray4123[5][2] = 0;
				anIntArrayArray4123[4][3] = 0;
				anIntArrayArray4123[5][3] = 4096;
				anIntArrayArray4123[6][3] = 4096;
				anIntArrayArray4123[3][0] = 2048;
				anIntArrayArray4123[4][0] = 2727;
				anIntArrayArray4123[5][0] = 3411;
				anIntArrayArray4123[6][0] = 4096;
				anIntArrayArray4123[6][2] = 0;
				break while_100_;
			    } while (false);
			    anIntArrayArray4123 = new int[6][4];
			    anIntArrayArray4123[0][1] = 0;
			    anIntArrayArray4123[0][2] = 0;
			    anIntArrayArray4123[1][1] = 0;
			    anIntArrayArray4123[0][0] = 0;
			    anIntArrayArray4123[2][1] = 0;
			    anIntArrayArray4123[0][3] = 0;
			    anIntArrayArray4123[3][1] = 0;
			    anIntArrayArray4123[4][1] = 546;
			    anIntArrayArray4123[1][3] = 1493;
			    anIntArrayArray4123[1][2] = 0;
			    anIntArrayArray4123[1][0] = 1843;
			    anIntArrayArray4123[2][0] = 2457;
			    anIntArrayArray4123[2][2] = 0;
			    anIntArrayArray4123[3][0] = 2781;
			    anIntArrayArray4123[5][1] = 4096;
			    anIntArrayArray4123[3][2] = 1124;
			    anIntArrayArray4123[4][0] = 3481;
			    anIntArrayArray4123[2][3] = 2939;
			    anIntArrayArray4123[3][3] = 3565;
			    anIntArrayArray4123[4][2] = 3084;
			    anIntArrayArray4123[5][2] = 4096;
			    anIntArrayArray4123[4][3] = 4031;
			    anIntArrayArray4123[5][0] = 4096;
			    anIntArrayArray4123[5][3] = 4096;
			    break while_100_;
			} while (false);
			anIntArrayArray4123 = new int[16][4];
			anIntArrayArray4123[0][3] = 321;
			anIntArrayArray4123[0][1] = 80;
			anIntArrayArray4123[0][2] = 192;
			anIntArrayArray4123[1][2] = 449;
			anIntArrayArray4123[0][0] = 0;
			anIntArrayArray4123[2][2] = 690;
			anIntArrayArray4123[1][0] = 155;
			anIntArrayArray4123[1][1] = 321;
			anIntArrayArray4123[2][1] = 578;
			anIntArrayArray4123[3][2] = 995;
			anIntArrayArray4123[1][3] = 562;
			anIntArrayArray4123[4][2] = 1397;
			anIntArrayArray4123[3][1] = 947;
			anIntArrayArray4123[2][3] = 803;
			anIntArrayArray4123[5][2] = 1429;
			anIntArrayArray4123[2][0] = 389;
			anIntArrayArray4123[3][0] = 671;
			anIntArrayArray4123[4][1] = 1285;
			anIntArrayArray4123[5][1] = 1525;
			anIntArrayArray4123[4][0] = 897;
			anIntArrayArray4123[5][0] = 1175;
			anIntArrayArray4123[3][3] = 1140;
			anIntArrayArray4123[6][1] = 1734;
			anIntArrayArray4123[6][0] = 1368;
			anIntArrayArray4123[7][1] = 1413;
			anIntArrayArray4123[4][3] = 1509;
			anIntArrayArray4123[6][2] = 1461;
			anIntArrayArray4123[8][1] = 1108;
			anIntArrayArray4123[9][1] = 1766;
			anIntArrayArray4123[10][1] = 2409;
			anIntArrayArray4123[5][3] = 1413;
			anIntArrayArray4123[7][0] = 1507;
			anIntArrayArray4123[8][0] = 1736;
			anIntArrayArray4123[9][0] = 2088;
			anIntArrayArray4123[11][1] = 3116;
			anIntArrayArray4123[10][0] = 2355;
			anIntArrayArray4123[11][0] = 2691;
			anIntArrayArray4123[6][3] = 1333;
			anIntArrayArray4123[12][1] = 3806;
			anIntArrayArray4123[12][0] = 3031;
			anIntArrayArray4123[7][2] = 1525;
			anIntArrayArray4123[7][3] = 1702;
			anIntArrayArray4123[8][3] = 2056;
			anIntArrayArray4123[13][1] = 3437;
			anIntArrayArray4123[14][1] = 3116;
			anIntArrayArray4123[9][3] = 2666;
			anIntArrayArray4123[8][2] = 1590;
			anIntArrayArray4123[15][1] = 2377;
			anIntArrayArray4123[10][3] = 3276;
			anIntArrayArray4123[13][0] = 3522;
			anIntArrayArray4123[11][3] = 3228;
			anIntArrayArray4123[9][2] = 2056;
			anIntArrayArray4123[10][2] = 2586;
			anIntArrayArray4123[14][0] = 3727;
			anIntArrayArray4123[11][2] = 3148;
			anIntArrayArray4123[15][0] = 4096;
			anIntArrayArray4123[12][3] = 3196;
			anIntArrayArray4123[12][2] = 3710;
			anIntArrayArray4123[13][2] = 3421;
			anIntArrayArray4123[14][2] = 3148;
			anIntArrayArray4123[13][3] = 3019;
			anIntArrayArray4123[14][3] = 3228;
			anIntArrayArray4123[15][3] = 2746;
			anIntArrayArray4123[15][2] = 2505;
			break while_100_;
		    } while (false);
		    anIntArrayArray4123 = new int[4][4];
		    anIntArrayArray4123[0][1] = 0;
		    anIntArrayArray4123[0][2] = 4096;
		    anIntArrayArray4123[1][1] = 4096;
		    anIntArrayArray4123[2][1] = 4096;
		    anIntArrayArray4123[0][0] = 2048;
		    anIntArrayArray4123[1][2] = 4096;
		    anIntArrayArray4123[3][1] = 4096;
		    anIntArrayArray4123[0][3] = 0;
		    anIntArrayArray4123[2][2] = 4096;
		    anIntArrayArray4123[3][2] = 0;
		    anIntArrayArray4123[1][0] = 2867;
		    anIntArrayArray4123[1][3] = 0;
		    anIntArrayArray4123[2][3] = 0;
		    anIntArrayArray4123[3][3] = 0;
		    anIntArrayArray4123[2][0] = 3276;
		    anIntArrayArray4123[3][0] = 4096;
		    break while_100_;
		} while (false);
		throw new RuntimeException("Invalid gradient preset");
	    }
	} while (false);
	if (arg0 != 2072)
	    anIntArray4107 = null;
    }
    
    public static void method704(int arg0, Stream arg1) {
	anInt4115++;
	if (Class67_Sub5.aClass115_2858 != null) {
	    try {
		Class67_Sub5.aClass115_2858.method1614(0L, -115);
		Class67_Sub5.aClass115_2858.method1616((byte) 50,
						       arg1.currentOffset,
						       arg1.buffer,
						       24);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	arg1.currentOffset += arg0;
    }
    
    public Class67_Sub1_Sub18() {
	super(1, false);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    return null;
	int[][] is = aClass103_2830.method1551(arg1, 107);
	anInt4118++;
	if (aClass103_2830.aBoolean2030) {
	    int[] is_38_ = this.method613(0, arg1, !arg0);
	    int[] is_39_ = is[0];
	    int[] is_40_ = is[1];
	    int[] is_41_ = is[2];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_42_ = is_38_[i] >> -1778131516;
		if ((i_42_ ^ 0xffffffff) > -1)
		    i_42_ = 0;
		if ((i_42_ ^ 0xffffffff) < -257)
		    i_42_ = 256;
		i_42_ = anIntArray4120[i_42_];
		is_39_[i] = Class75.method1379(i_42_ >> -842008692, 4080);
		is_40_[i] = Class75.method1379(65280, i_42_) >> 1655770628;
		is_41_[i] = Class75.method1379(i_42_, 255) << -744172444;
	    }
	}
	return is;
    }
    
    public static void method705(int arg0, int arg1) {
	anInt4109++;
	if (arg1 != 7931)
	    method705(-105, -63);
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg0, false, 1);
	class67_sub5_sub3.method844(0);
    }
    
    static {
	aRSString_4108 = Class134.method1914("<col=00ff00>", (byte) 37);
	anInt4113 = 0;
	anInt4125 = 0;
	aRSString_4124 = Class134.method1914("Lade Titelbild )2 ", (byte) 40);
    }
}
