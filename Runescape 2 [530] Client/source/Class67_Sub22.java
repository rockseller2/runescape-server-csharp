/* Class67_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub22 extends Class67
{
    public int anInt3180;
    public static RSString aRSString_3181
	= Class134.method1914("Loading )2 please wait)3", (byte) 67);
    public static RSString aRSString_3182 = aRSString_3181;
    public static int[][] anIntArrayArray3183;
    public static volatile boolean aBoolean3184 = true;
    public int anInt3185;
    public static int anInt3186;
    public static int anInt3187 = 1;
    public static int anInt3188;
    public static int anInt3189;
    
    public static void method1278(int arg0) {
	anInt3186++;
	if (Class67_Sub1_Sub20.packetType == 16) {	//sendProjectile
	    int i = Class54.aPacketStream_1069.readByte((byte) 92);
	    int i_0_ = Class28.anInt673 - -(0x7 & i >> -824365404);
	    int i_1_ = Class52.anInt1045 - -(i & 0x7);
	    int i_2_ = Class54.aPacketStream_1069.readByte2((byte) 1) + i_0_;
	    int i_3_ = i_1_ + Class54.aPacketStream_1069.readByte2((byte) 1);
	    int i_4_ = Class54.aPacketStream_1069.readShort2((byte) 122);
	    int i_5_ = Class54.aPacketStream_1069.readUShort(arg0 + -2450);
	    int i_6_ = Class54.aPacketStream_1069.readByte((byte) -112) * 4;
	    int i_7_ = Class54.aPacketStream_1069.readByte((byte) -100) * 4;
	    int i_8_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_9_ = Class54.aPacketStream_1069.readUShort(arg0 ^ ~0x911);
	    int i_10_ = Class54.aPacketStream_1069.readByte((byte) -99);
	    if (i_10_ == 255)
		i_10_ = -1;
	    int i_11_ = Class54.aPacketStream_1069.readByte((byte) -42);
	    if ((i_0_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) <= -1
		&& (i_0_ ^ 0xffffffff) > -105 && i_1_ < 104
		&& (i_2_ ^ 0xffffffff) <= -1 && (i_3_ ^ 0xffffffff) <= -1
		&& (i_2_ ^ 0xffffffff) > -105 && (i_3_ ^ 0xffffffff) > -105
		&& i_5_ != 65535) {
		i_3_ = 64 + i_3_ * 128;
		i_1_ = 64 + 128 * i_1_;
		i_2_ = 64 + 128 * i_2_;
		i_0_ = 128 * i_0_ + 64;
		Class131_Sub3 class131_sub3
		    = new Class131_Sub3(i_5_, Canvas_Sub1.anInt59, i_0_, i_1_,
					(Class131_Sub5.method1826((Canvas_Sub1
								   .anInt59),
								  i_0_, i_1_,
								  (byte) -25)
					 + -i_6_),
					Class67_Sub1_Sub9.anInt3952 + i_8_,
					Class67_Sub1_Sub9.anInt3952 + i_9_,
					i_10_, i_11_, i_4_, i_7_);
		class131_sub3.method1811((byte) -84, i_2_,
					 (Class131_Sub5.method1826((Canvas_Sub1
								    .anInt59),
								   i_2_, i_3_,
								   (byte) 120)
					  - i_7_),
					 i_3_,
					 i_8_ - -Class67_Sub1_Sub9.anInt3952);
		Class20.aClass50_503
		    .method436(new Class67_Sub5_Sub18(class131_sub3), false);
	    }
	} else if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -122) {
	    int i = Class54.aPacketStream_1069.readByte((byte) -33);
	    int i_12_ = 2 * Class28.anInt673 - -((0xf8 & i) >> -1460342236);
	    int i_13_ = Class52.anInt1045 * 2 + (i & 0xf);
	    int i_14_
		= i_12_ + Class54.aPacketStream_1069.readByte2((byte) 1);
	    int i_15_
		= i_13_ + Class54.aPacketStream_1069.readByte2((byte) 1);
	    int i_16_ = Class54.aPacketStream_1069.readShort2((byte) 112);
	    int i_17_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_18_
		= Class54.aPacketStream_1069.readByte((byte) 117) * 4;
	    int i_19_
		= Class54.aPacketStream_1069.readByte((byte) 119) * 4;
	    int i_20_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_21_
		= Class54.aPacketStream_1069.readUShort(arg0 + -2450);
	    int i_22_ = Class54.aPacketStream_1069.readByte((byte) 101);
	    int i_23_ = Class54.aPacketStream_1069.readByte((byte) -25);
	    if (i_22_ == 255)
		i_22_ = -1;
	    if (i_12_ >= 0 && i_13_ >= 0 && (i_12_ ^ 0xffffffff) > -209
		&& i_13_ < 208 && i_14_ >= 0 && i_15_ >= 0 && i_14_ < 208
		&& i_15_ < 208 && i_17_ != 65535) {
		i_12_ = 64 * i_12_;
		i_13_ = 64 * i_13_;
		i_14_ *= 64;
		Class131_Sub3 class131_sub3
		    = new Class131_Sub3(i_17_, Canvas_Sub1.anInt59, i_12_,
					i_13_,
					(Class131_Sub5.method1826((Canvas_Sub1
								   .anInt59),
								  i_12_, i_13_,
								  (byte) -6)
					 - i_18_),
					i_20_ + Class67_Sub1_Sub9.anInt3952,
					i_21_ - -Class67_Sub1_Sub9.anInt3952,
					i_22_, i_23_, i_16_, i_19_);
		i_15_ = 64 * i_15_;
		class131_sub3.method1811
		    ((byte) -127, i_14_,
		     Class131_Sub5.method1826(Canvas_Sub1.anInt59, i_14_,
					      i_15_, (byte) 115) - i_19_,
		     i_15_, i_20_ + Class67_Sub1_Sub9.anInt3952);
		Class20.aClass50_503
		    .method436(new Class67_Sub5_Sub18(class131_sub3), false);
	    }
	} else if (Class67_Sub1_Sub20.packetType == 33) { // spawn ground item?
	    int i = Class54.aPacketStream_1069.readLEShort2((byte) 122);
	    int i_24_ = Class54.aPacketStream_1069.readByte((byte) 89);
	    int i_25_ = Class52.anInt1045 + (i_24_ & 0x7);
	    int i_26_ = Class28.anInt673 + (0x7 & i_24_ >> -632614108);
	    int i_27_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if (i_26_ >= 0 && (i_25_ ^ 0xffffffff) <= -1 && i_26_ < 104
		&& (i_25_ ^ 0xffffffff) > -105) {
		Class131_Sub4 class131_sub4 = new Class131_Sub4();
		class131_sub4.anInt3638 = i;
		class131_sub4.anInt3641 = i_27_;
		if ((Class67_Sub5_Sub2.aClass50ArrayArrayArray4471[Canvas_Sub1.anInt59][i_26_][i_25_]) == null)
		    Class67_Sub5_Sub2.aClass50ArrayArrayArray4471[Canvas_Sub1.anInt59][i_26_][i_25_] = new Class50();
		Class67_Sub5_Sub2.aClass50ArrayArrayArray4471[Canvas_Sub1.anInt59][i_26_][i_25_].method436(new Class67_Sub5_Sub2(class131_sub4), false);
		Class67_Sub11_Sub4.method1191(arg0 ^ 0x2a, i_25_, i_26_);
	    }
	} else if (Class67_Sub1_Sub20.packetType == 14) {
	    int i = Class54.aPacketStream_1069.readByte((byte) -44);
	    int i_28_ = Class28.anInt673 - -(i >> 1255097444 & 0x7);
	    int i_29_ = Class52.anInt1045 - -(i & 0x7);
	    int i_30_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_31_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_32_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if ((i_28_ ^ 0xffffffff) <= -1 && (i_29_ ^ 0xffffffff) <= -1
		&& (i_28_ ^ 0xffffffff) > -105
		&& (i_29_ ^ 0xffffffff) > -105) {
		Class50 class50
		    = (Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
		       [Canvas_Sub1.anInt59][i_28_][i_29_]);
		if (class50 != null) {
		    for (Class67_Sub5_Sub2 class67_sub5_sub2
			     = (Class67_Sub5_Sub2) class50.method445(0);
			 class67_sub5_sub2 != null;
			 class67_sub5_sub2
			     = (Class67_Sub5_Sub2) class50.method432(0)) {
			Class131_Sub4 class131_sub4
			    = class67_sub5_sub2.aClass131_Sub4_4482;
			if (((class131_sub4.anInt3638 ^ 0xffffffff)
			     == (i_30_ & 0x7fff ^ 0xffffffff))
			    && class131_sub4.anInt3641 == i_31_) {
			    class131_sub4.anInt3641 = i_32_;
			    break;
			}
		    }
		    Class67_Sub11_Sub4.method1191(-126, i_29_, i_28_);
		}
	    }
	} else if (Class67_Sub1_Sub20.packetType == 97) { //sound something.
	    int i = Class54.aPacketStream_1069.readByte((byte) -11);
	    int i_33_ = Class28.anInt673 - -(i >> 444425828 & 0x7);
	    int i_34_ = (i & 0x7) + Class52.anInt1045;
	    int i_35_
		= Class54.aPacketStream_1069.readUShort(arg0 ^ ~0x911);
	    if (i_35_ == 65535)
		i_35_ = -1;
	    int i_36_ = Class54.aPacketStream_1069.readByte((byte) -78);
	    int i_37_ = 0xf & i_36_ >> 500217892;
	    int i_38_ = Class54.aPacketStream_1069.readByte((byte) 88);
	    int i_39_ = i_36_ & 0x7;
	    if (i_33_ >= 0 && (i_34_ ^ 0xffffffff) <= -1
		&& (i_33_ ^ 0xffffffff) > -105 && i_34_ < 104) {
		int i_40_ = 1 + i_37_;
		if ((Class122.aClass131_Sub7_Sub2_2309.smallX[0]
		     >= -i_40_ + i_33_)
		    && (Class122.aClass131_Sub7_Sub2_2309.smallX[0]
			<= i_33_ + i_40_)
		    && ((-i_40_ + i_34_ ^ 0xffffffff)
			>= (Class122.aClass131_Sub7_Sub2_2309.smallY[0]
			    ^ 0xffffffff))
		    && ((i_40_ + i_34_ ^ 0xffffffff)
			<= (Class122.aClass131_Sub7_Sub2_2309.smallY[0]
			    ^ 0xffffffff))
		    && Class27.anInt644 != 0 && i_39_ > 0
		    && (Class5.anInt144 ^ 0xffffffff) > -51 && i_35_ != -1) {
		    Class67_Sub6.anIntArray2887[Class5.anInt144] = i_35_;
		    Class67_Sub1_Sub32.anIntArray4299[Class5.anInt144] = i_39_;
		    Class126.anIntArray2361[Class5.anInt144] = i_38_;
		    Class103.aClass135Array2022[Class5.anInt144] = null;
		    Class50.anIntArray1016[Class5.anInt144]
			= ((i_33_ << 1924573648) + (i_34_ << -1870456312)
			   + i_37_);
		    Class5.anInt144++;
		}
	    }
	} else if (Class67_Sub1_Sub20.packetType == 240) {	//clearGroundItem
	    int i = Class54.aPacketStream_1069.readByteS(128);
	    int i_41_ = Class28.anInt673 + (0x7 & i >> 505097156);
	    int i_42_ = Class52.anInt1045 - -(0x7 & i);
	    int i_43_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (i_41_ >= 0 && i_42_ >= 0 && (i_41_ ^ 0xffffffff) > -105
		&& i_42_ < 104) {
		Class50 class50
		    = (Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
		       [Canvas_Sub1.anInt59][i_41_][i_42_]);
		if (class50 != null) {
		    for (Class67_Sub5_Sub2 class67_sub5_sub2
			     = (Class67_Sub5_Sub2) class50.method445(0);
			 class67_sub5_sub2 != null;
			 class67_sub5_sub2
			     = (Class67_Sub5_Sub2) class50.method432(0)) {
			if ((class67_sub5_sub2.aClass131_Sub4_4482.anInt3638
			     ^ 0xffffffff)
			    == (0x7fff & i_43_ ^ 0xffffffff)) {
			    class67_sub5_sub2.method606((byte) -118);
			    break;
			}
		    }
		    if (class50.method445(0) == null)
			Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			    [Canvas_Sub1.anInt59][i_41_][i_42_]
			    = null;
		    Class67_Sub11_Sub4.method1191(-110, i_42_, i_41_);
		}
	    }
	} else if (Class67_Sub1_Sub20.packetType == 135) {	//createGroundItem2
	    int i = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_44_ = Class54.aPacketStream_1069.readByteC((byte) -80);
	    int i_45_ = Class52.anInt1045 + (i_44_ & 0x7);
	    int i_46_ = (0x7 & i_44_ >> 1771842852) + Class28.anInt673;
	    int i_47_ = Class54.aPacketStream_1069.readLEShort2((byte) 114);
	    int i_48_ = Class54.aPacketStream_1069.readLEShort2((byte) 88);
	    if ((i_46_ ^ 0xffffffff) <= -1 && i_45_ >= 0 && i_46_ < 104
		&& (i_45_ ^ 0xffffffff) > -105
		&& (i ^ 0xffffffff) != (Class67_Sub17.anInt3102
					^ 0xffffffff)) {
		Class131_Sub4 class131_sub4 = new Class131_Sub4();
		class131_sub4.anInt3641 = i_47_;
		class131_sub4.anInt3638 = i_48_;
		if ((Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
		     [Canvas_Sub1.anInt59][i_46_][i_45_])
		    == null)
		    Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			[Canvas_Sub1.anInt59][i_46_][i_45_]
			= new Class50();
		Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
		    [Canvas_Sub1.anInt59][i_46_][i_45_]
		    .method436(new Class67_Sub5_Sub2(class131_sub4), false);
		Class67_Sub11_Sub4.method1191(-103, i_45_, i_46_);
	    }
	} else if (Class67_Sub1_Sub20.packetType == 17) {	//newStillGraphics, still graphics!
	    int i = Class54.aPacketStream_1069.readByte((byte) 81);  //tiles away
	    int i_49_ = (i >> -647179196 & 0x7) + Class28.anInt673; //>> 4
	    int i_50_ = Class52.anInt1045 - -(0x7 & i);
	    int i_51_ = Class54.aPacketStream_1069.readUShort(arg0 ^ ~0x911); //grahpic id
	    int i_52_ = Class54.aPacketStream_1069.readByte((byte) 108); //pixel height
	    int i_53_ = Class54.aPacketStream_1069.readUShort(-2386); //time before casting the graphic
	    if ((i_49_ ^ 0xffffffff) <= -1 && (i_50_ ^ 0xffffffff) <= -1
		&& i_49_ < 104 && (i_50_ ^ 0xffffffff) > -105) {
		i_49_ = 64 + i_49_ * 128;
		i_50_ = i_50_ * 128 - -64;
		ObjectDef class131_sub1
		    = (new ObjectDef
		       (i_51_, Canvas_Sub1.anInt59, i_49_, i_50_,
			-i_52_ + Class131_Sub5.method1826(Canvas_Sub1.anInt59,
							  i_49_, i_50_,
							  (byte) -74),
			i_53_, Class67_Sub1_Sub9.anInt3952));
		Class102.aClass50_2000
		    .method436(new Class67_Sub5_Sub15(class131_sub1), false); //insert head?
	    }
	} else if (Class67_Sub1_Sub20.packetType == 195) {	//removeObject
	    int i = Class54.aPacketStream_1069.readByteC((byte) -80);
	    int i_54_ = i >> 385230402;
	    int i_55_ = Class123.anIntArray2316[i_54_];
	    int i_56_ = 0x3 & i;
	    int i_57_ = Class54.aPacketStream_1069.readByte((byte) 101);
	    int i_58_ = (0x7 & i_57_ >> 1029399588) + Class28.anInt673;
	    int i_59_ = (0x7 & i_57_) + Class52.anInt1045;
	    if ((i_58_ ^ 0xffffffff) <= -1 && i_59_ >= 0
		&& (i_58_ ^ 0xffffffff) > -105 && (i_59_ ^ 0xffffffff) > -105)
		Class67_Sub5_Sub2.method833(0, false, i_54_, i_58_, -1, i_59_,
					    Canvas_Sub1.anInt59, i_55_, -1,
					    i_56_);
	} else {
	    if (arg0 != 64)
		method1278(-55);
	    if (Class67_Sub1_Sub20.packetType == 104) {
		int i = Class54.aPacketStream_1069.readByte((byte) 98);
		int i_60_ = (i >> -145305564 & 0xf) + Class28.anInt673 * 2;
		int i_61_ = Class52.anInt1045 * 2 - -(0xf & i);
		int i_62_
		    = (Class54.aPacketStream_1069.readByte2((byte) 1)
		       + i_60_);
		int i_63_
		    = (i_61_
		       + Class54.aPacketStream_1069.readByte2((byte) 1));
		int i_64_
		    = Class54.aPacketStream_1069.readShort2((byte) 70);
		int i_65_
		    = Class54.aPacketStream_1069.readShort2((byte) 126);
		int i_66_ = Class54.aPacketStream_1069.readUShort(-2386);
		int i_67_
		    = Class54.aPacketStream_1069.readByte2((byte) 1);
		int i_68_
		    = (Class54.aPacketStream_1069.readByte((byte) -82)
		       * 4);
		int i_69_ = Class54.aPacketStream_1069.readUShort(-2386);
		int i_70_ = Class54.aPacketStream_1069.readUShort(-2386);
		int i_71_
		    = Class54.aPacketStream_1069.readByte((byte) 100);
		int i_72_
		    = Class54.aPacketStream_1069.readByte((byte) 79);
		if (i_71_ == 255)
		    i_71_ = -1;
		if ((i_60_ ^ 0xffffffff) <= -1 && (i_61_ ^ 0xffffffff) <= -1
		    && i_60_ < 208 && i_61_ < 208 && (i_62_ ^ 0xffffffff) <= -1
		    && i_63_ >= 0 && (i_62_ ^ 0xffffffff) > -209 && i_63_ < 208
		    && (i_66_ ^ 0xffffffff) != -65536) {
		    i_60_ = 64 * i_60_;
		    i_62_ *= 64;
		    i_61_ = 64 * i_61_;
		    i_63_ *= 64;
		    if (i_64_ != 0) {
			int i_73_;
			Class131_Sub7 class131_sub7;
			if (i_64_ >= 0) {
			    int i_74_ = i_64_ - 1;
			    i_73_ = 0xf & i_74_ >> -83202165;
			    int i_75_ = 0x7ff & i_74_;
			    class131_sub7
				= Class128.aClass131_Sub7_Sub1Array2386[i_75_];
			} else {
			    int i_76_ = -1 + -i_64_;
			    i_73_ = 0xf & i_76_ >> 30548427;
			    int i_77_ = i_76_ & 0x7ff;
			    if ((Class67_Sub17.anInt3102 ^ 0xffffffff)
				== (i_77_ ^ 0xffffffff))
				class131_sub7
				    = Class122.aClass131_Sub7_Sub2_2309;
			    else
				class131_sub7
				    = (Class67_Sub5_Sub18
				       .aClass131_Sub7_Sub2Array4810[i_77_]);
			}
			if (class131_sub7 != null) {
			    Class87 class87
				= class131_sub7.method1880((byte) -76);
			    if (class87.anIntArrayArray1796 != null
				&& (class87.anIntArrayArray1796[i_73_]
				    != null)) {
				i_67_ -= class87.anIntArrayArray1796[i_73_][1];
				int i_78_
				    = class87.anIntArrayArray1796[i_73_][0];
				int i_79_
				    = class87.anIntArrayArray1796[i_73_][2];
				int i_80_ = (Class26.anIntArray617
					     [class131_sub7.anInt3740]);
				int i_81_ = (Class26.anIntArray612
					     [class131_sub7.anInt3740]);
				int i_82_ = (i_78_ * i_81_ + i_79_ * i_80_
					     >> 207502864);
				i_79_ = (i_81_ * i_79_ + -(i_80_ * i_78_)
					 >> 775988240);
				i_78_ = i_82_;
				i_61_ += i_79_;
				i_60_ += i_78_;
			    }
			}
		    }
		    Class131_Sub3 class131_sub3
			= (new Class131_Sub3
			   (i_66_, Canvas_Sub1.anInt59, i_60_, i_61_,
			    (Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						      i_60_, i_61_, (byte) -46)
			     - i_67_),
			    Class67_Sub1_Sub9.anInt3952 + i_69_,
			    i_70_ - -Class67_Sub1_Sub9.anInt3952, i_71_, i_72_,
			    i_65_, i_68_));
		    class131_sub3.method1811
			((byte) -119, i_62_,
			 Class131_Sub5.method1826(Canvas_Sub1.anInt59, i_62_,
						  i_63_, (byte) 115) - i_68_,
			 i_63_, Class67_Sub1_Sub9.anInt3952 + i_69_);
		    Class20.aClass50_503.method436
			(new Class67_Sub5_Sub18(class131_sub3), false);
		}
	    } else {
		if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -203) {
		    int i = Class54.aPacketStream_1069
				.readByte((byte) 127);
		    int i_83_ = 0x3 & i;
		    int i_84_ = i >> -1374236030;
		    int i_85_ = Class54.aPacketStream_1069
				    .readByte((byte) -93);
		    int i_86_ = Class52.anInt1045 + (0x7 & i_85_);
		    int i_87_ = (0x7 & i_85_ >> 168766596) + Class28.anInt673;
		    byte i_88_ = Class54.aPacketStream_1069
				     .method1093((byte) 111);
		    byte i_89_ = Class54.aPacketStream_1069
				     .method1093((byte) 111);
		    byte i_90_ = Class54.aPacketStream_1069
				     .method1078((byte) 127);
		    int i_91_ = Class54.aPacketStream_1069
				    .readShortA((byte) 22);
		    int i_92_ = Class54.aPacketStream_1069
				    .readLEShort2((byte) -118);
		    byte i_93_
			= Class54.aPacketStream_1069.readByte2((byte) 1);
		    int i_94_
			= Class54.aPacketStream_1069.readUShort(-2386);
		    int i_95_ = Class54.aPacketStream_1069
				    .method1060((byte) -19);
		    RuntimeException_Sub1.method1975(i_95_, i_83_, i_92_,
						     i_87_, i_90_, i_84_,
						     i_86_, i_93_, (byte) 6,
						     i_89_, i_91_, i_88_,
						     i_94_);
		}
		if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -180) {	//createObject
		    int i = Class54.aPacketStream_1069.readByteA((byte) 118);
		    int i_96_ = i >> 1923012930;
		    int i_97_ = Class123.anIntArray2316[i_96_];
		    int i_98_ = Class54.aPacketStream_1069.readByte((byte) -120);
		    int i_99_ = Class28.anInt673 - -(0x7 & i_98_ >> 582808804);
		    int i_100_ = 0x3 & i;
		    int i_101_ = Class52.anInt1045 - -(0x7 & i_98_);
		    int i_102_ = Class54.aPacketStream_1069.readShortA((byte) 22);
		    if ((i_99_ ^ 0xffffffff) <= -1
			&& (i_101_ ^ 0xffffffff) <= -1
			&& (i_99_ ^ 0xffffffff) > -105
			&& (i_101_ ^ 0xffffffff) > -105)
			Class67_Sub5_Sub2.method833(0, false, i_96_, i_99_, -1,
						    i_101_,
						    Canvas_Sub1.anInt59, i_97_,
						    i_102_, i_100_);
		} else if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -21) {	//newObjectAnimation
		    int i = Class54.aPacketStream_1069.readByteS(128);
		    int i_103_ = ((0x7d & i) >> 860031812) + Class28.anInt673;
		    int i_104_ = Class52.anInt1045 + (i & 0x7);
		    int i_105_
			= Class54.aPacketStream_1069.readByteS(128);
		    int i_106_ = 0x3 & i_105_;
		    int i_107_ = i_105_ >> 121359522;
		    int i_108_ = Class123.anIntArray2316[i_107_];
		    int i_109_ = Class54.aPacketStream_1069.readLEShort2((byte) -44);
		    if (i_109_ == 65535)
			i_109_ = -1;
		    Class70_Sub1.method1337(2047, i_103_, i_106_, i_109_,
					    i_104_, i_107_,
					    Canvas_Sub1.anInt59, i_108_);
		}
	    }
	}
    }
    
    public static void method1279(boolean arg0) {
	aRSString_3181 = null;
	if (arg0 == true) {
	    aRSString_3182 = null;
	    anIntArrayArray3183 = null;
	}
    }
    
    public static int method1280(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	arg0 &= 0x3;
	if ((0x1 & arg5) == 1) {
	    int i = arg1;
	    arg1 = arg3;
	    arg3 = i;
	}
	anInt3189++;
	if ((arg0 ^ 0xffffffff) == -1)
	    return arg2;
	if (arg0 == 1)
	    return -arg1 - (-1 - -arg6) + 7;
	if (arg4 != 15)
	    method1281(23);
	if (arg0 == 2)
	    return 7 - arg2 - (arg3 + -1);
	return arg6;
    }
    
    public static Class119[] method1281(int arg0) {
	anInt3188++;
	if (arg0 < 8)
	    method1281(-44);
	Class119[] class119s = new Class119[Class67_Sub15.anInt3067];
	for (int i = 0; i < Class67_Sub15.anInt3067; i++)
	    class119s[i]
		= new Class119_Sub1(Class3.anInt119, Class80.anInt1628,
				    Class67_Sub23.anIntArray3201[i],
				    Class67_Sub6.anIntArray2870[i],
				    Class55_Sub3.anIntArray2810[i],
				    Class67_Sub5_Sub4.anIntArray4510[i],
				    Class67_Sub1_Sub35.aByteArrayArray4357[i],
				    Class73.anIntArray1462);
	Class67_Sub5_Sub11.method937(false);
	return class119s;
    }
    
    static {
	anIntArrayArray3183 = new int[104][104];
    }
}
