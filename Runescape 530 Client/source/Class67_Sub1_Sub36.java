/* Class67_Sub1_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub36 extends Class67_Sub1
{
    public int anInt4361;
    public static int anInt4362;
    public static int anInt4363;
    public int anInt4364;
    public int anInt4365 = 1;
    public static int anInt4366;
    public static int anInt4367;
    public static int anInt4368;
    public static int anInt4369;
    public static RSString aRSString_4370
	= Class134.method1914("<br>(X100(U(Y", (byte) 85);
    public static int anInt4371;
    public static int anInt4372;
    public static RSString aRSString_4373;
    public static int anInt4374;
    public static int anInt4375;
    public static RSString aRSString_4376 = Class134.method1914("Ok", (byte) 15);
    public static RSString aRSString_4377;
    public static RSString aRSString_4378;
    public static int anInt4379;
    public static int anInt4380;
    public static int anInt4381;
    public static int anInt4382;
    
    public static Class119_Sub1[] method782(int arg0) {
	Class119_Sub1[] class119_sub1s
	    = new Class119_Sub1[Class67_Sub15.anInt3067];
	anInt4379++;
	if (arg0 <= 18)
	    method783(67, 83);
	for (int i = 0; Class67_Sub15.anInt3067 > i; i++)
	    class119_sub1s[i]
		= new Class119_Sub1(Class3.anInt119, Class80.anInt1628,
				    Class67_Sub23.anIntArray3201[i],
				    Class67_Sub6.anIntArray2870[i],
				    Class55_Sub3.anIntArray2810[i],
				    Class67_Sub5_Sub4.anIntArray4510[i],
				    Class67_Sub1_Sub35.aByteArrayArray4357[i],
				    Class73.anIntArray1462);
	Class67_Sub5_Sub11.method937(false);
	return class119_sub1s;
    }
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = 0;
	    for (/**/;
		 (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_0_ = Class67_Sub1_Sub35.anIntArray4344[i];
		int i_1_ = i_0_ * anInt4361 >> -850104596;
		int i_2_ = Class19.anIntArray490[arg0];
		int i_3_ = anInt4365 * i_2_ >> -1537763188;
		int i_4_ = i_2_ % (4096 / anInt4365) * anInt4365;
		int i_5_ = i_0_ % (4096 / anInt4361) * anInt4361;
		if (anInt4364 > i_4_) {
		    for (i_1_ -= i_3_; i_1_ < 0; i_1_ += 4) {
			/* empty */
		    }
		    for (/**/; (i_1_ ^ 0xffffffff) < -4; i_1_ -= 4) {
			/* empty */
		    }
		    if (i_1_ != 1) {
			is[i] = 0;
			continue;
		    }
		    if ((i_5_ ^ 0xffffffff) > (anInt4364 ^ 0xffffffff)) {
			is[i] = 0;
			continue;
		    }
		}
		if ((anInt4364 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
		    for (i_1_ -= i_3_; i_1_ < 0; i_1_ += 4) {
			/* empty */
		    }
		    for (/**/; i_1_ > 3; i_1_ -= 4) {
			/* empty */
		    }
		    if (i_1_ > 0) {
			is[i] = 0;
			continue;
		    }
		}
		is[i] = 4096;
	    }
	}
	anInt4382++;
	if (arg1 != 55)
	    anInt4365 = 126;
	return is;
    }
    
    public static void method783(int arg0, int arg1) {
	Class67_Sub1_Sub25.aClass136_4226.method1920(arg0, 115);
	anInt4362++;
	if (arg1 == 4)
	    Class61.aClass136_1141.method1920(arg0, arg1 ^ 0x56);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
    while_123_:
	do {
	    do {
		if (i != 0) {
		    if (i != 1) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_123_;
		    }
		} else {
		    anInt4361 = arg0.readByte((byte) 119);
		    break while_123_;
		}
		anInt4365 = arg0.readByte((byte) -73);
		break while_123_;
	    } while (false);
	    anInt4364 = arg0.readUShort(-2386);
	} while (false);
	if (arg1 != true)
	    method785((byte) -13);
	anInt4372++;
    }
    
    public static void method784(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, boolean arg6, int arg7) {
	anInt4375++;
	if ((Class139.anInt2533 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
	    || arg1 > Class126_Sub1.anInt3423
	    || (arg5 ^ 0xffffffff) > (Class55_Sub2.anInt2801 ^ 0xffffffff)
	    || (arg2 ^ 0xffffffff) < (OutputStream_Sub1.anInt87 ^ 0xffffffff))
	    Class103.method1556(arg1, (byte) -101, arg0, arg2, arg4, arg5,
				arg7, arg3);
	else
	    Class141.method1949(arg1, true, arg2, arg0, arg5, arg3, arg4,
				arg7);
	if (arg6 != false)
	    method787(-97, -18, 78, -99, (byte) -50, -34, 110, -114, 83, -71);
    }
    
    public static void method785(byte arg0) {
	aRSString_4378 = null;
	aRSString_4377 = null;
	if (arg0 < 118)
	    method782(-9);
	aRSString_4373 = null;
	aRSString_4376 = null;
	aRSString_4370 = null;
    }
    
    public static void method786(int arg0, byte arg1, int arg2, int arg3,
				 int arg4, int arg5, Class131_Sub7 arg6) {
	if (arg1 != 45)
	    aRSString_4376 = null;
	Class7.method88(arg3, arg0, false, arg6.anInt3726, arg4, arg5, arg2,
			arg6.anInt3733);
	anInt4380++;
    }
    
    public static void method787(int arg0, int arg1, int arg2, int arg3,
				 byte arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	if (arg4 != -121)
	    method786(-52, (byte) 69, 110, -38, -57, 7, null);
	anInt4371++;
	if ((arg7 ^ 0xffffffff) != (arg5 ^ 0xffffffff)
	    || (arg9 ^ 0xffffffff) != (arg6 ^ 0xffffffff)
	    || (arg3 ^ 0xffffffff) != (arg1 ^ 0xffffffff)
	    || (arg0 ^ 0xffffffff) != (arg2 ^ 0xffffffff)) {
	    int i = arg5;
	    int i_6_ = arg6;
	    int i_7_ = arg5 * 3;
	    int i_8_ = 3 * arg6;
	    int i_9_ = 3 * arg9;
	    int i_10_ = arg1 * 3;
	    int i_11_ = 3 * arg2;
	    int i_12_ = arg7 * 3;
	    int i_13_ = -arg5 + arg3 - (i_10_ - i_12_);
	    int i_14_ = -i_7_ + i_12_;
	    int i_15_ = i_7_ + (-i_12_ + i_10_ + -i_12_);
	    int i_16_ = i_8_ + -i_9_ + i_11_ - i_9_;
	    int i_17_ = i_9_ + (arg0 - i_11_) + -arg6;
	    int i_18_ = i_9_ + -i_8_;
	    for (int i_19_ = 128; (i_19_ ^ 0xffffffff) >= -4097;
		 i_19_ += 128) {
		int i_20_ = i_19_ * i_19_ >> -1022067924;
		int i_21_ = i_20_ * i_19_ >> -1722278324;
		int i_22_ = i_20_ * i_15_;
		int i_23_ = i_13_ * i_21_;
		int i_24_ = i_21_ * i_17_;
		int i_25_ = i_20_ * i_16_;
		int i_26_ = i_14_ * i_19_;
		int i_27_ = i_18_ * i_19_;
		int i_28_ = (i_26_ + i_23_ + i_22_ >> -1411008724) + arg5;
		int i_29_ = arg6 + (i_25_ + i_24_ + i_27_ >> 370083372);
		Class1.method64(i_29_, (byte) 67, arg8, i_28_, i_6_, i);
		i_6_ = i_29_;
		i = i_28_;
	    }
	} else
	    Class1.method64(arg0, (byte) 67, arg8, arg3, arg6, arg5);
    }
    
    public static void method788(RSString arg0, int arg1, int arg2) {
	anInt4368++;
	RSString RSString = arg0.method536(-11662).method500(arg2 + 534);
	boolean bool = false;
	for (int i = 0; Class67_Sub1_Sub4.anInt3855 > i; i++) {
	    Class131_Sub7_Sub2 class131_sub7_sub2
		= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		   [Class3.anIntArray120[i]]);
	    if (class131_sub7_sub2 != null
		&& class131_sub7_sub2.playerName != null
		&& class131_sub7_sub2.playerName.method526(arg2 ^ 0x278,
							      RSString)) {
		Class57.method490(1, class131_sub7_sub2.smallY[0],
				  class131_sub7_sub2.smallX[0], 1,
				  (byte) -6, false, 0, 0,
				  (Class122.aClass131_Sub7_Sub2_2309
				   .smallY[0]),
				  0, 2,
				  (Class122.aClass131_Sub7_Sub2_2309
				   .smallX[0]));
		bool = true;
		if (arg1 == 1) { //1st option.
		    Class70_Sub1.outStream.createFrame(2, 68);	//ATTACK_PLAYER aka 1st option
		    RuntimeException_Sub1.anInt2609++;
		    Class70_Sub1.outStream.addLEShortA((byte) 103, Class3.anIntArray120[i]);
		} else if ((arg1 ^ 0xffffffff) == -5) { //4th option
		    Class67_Sub30.anInt3359++;
		    Class70_Sub1.outStream.createFrame(2, 180);	//TRADE aka 4th option
		    Class70_Sub1.outStream.addLEShortA((byte) 119, Class3.anIntArray120[i]);
		} else if ((arg1 ^ 0xffffffff) != -6) { //NOT 5th option
		    if ((arg1 ^ 0xffffffff) == -7) { //6th option
			Class70_Sub1.outStream.createFrame(2, 133); //6th option
			Class70_Sub1.outStream.addLEShort(Class3.anIntArray120[i], 1608904784);
			Class51.anInt1042++;
		    } else if (arg1 == 7) { //7th option
			Class131_Sub7_Sub1.anInt5051++;
			Class70_Sub1.outStream.createFrame(arg2 + 536, 114); //7th (possible)
			Class70_Sub1.outStream.addLEShortA((byte) -106, Class3.anIntArray120[i]);
		    }
		} else {
		    Class30.anInt693++;
		    Class70_Sub1.outStream.createFrame(2, 4); //5th option
		    Class70_Sub1.outStream.addLEShort(Class3.anIntArray120[i], 1608904784);
		}
		break;
	    }
	}
	if (!bool)
	    Class87.method1465(true,
			       (Class67_Sub1_Sub27.method744
				(new RSString[] { Class76.aRSString_1544,
						 RSString },
				 -118)),
			       Class67_Sub5_Sub5.aRSString_4523, 0);
	if (arg2 != -534)
	    method786(1, (byte) 37, 39, 70, -38, 36, null);
    }
    
    public static boolean method789(Class65 arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5, int arg6) {
	Class24 class24 = Class32.method284(arg0.anInt1314, arg1 + -23245);
	anInt4369++;
	if ((class24.anInt582 ^ 0xffffffff) == 0)
	    return true;
	if (!arg0.aBoolean1312)
	    arg6 = 0;
	else {
	    arg6 += arg0.anInt1280;
	    arg6 &= 0x3;
	}
	Class119_Sub1 class119_sub1 = class24.method223(arg6, (byte) -104);
	if (class119_sub1 == null)
	    return false;
	int i = arg0.anInt1297;
	if (arg1 != 23279)
	    anInt4367 = 118;
	int i_30_ = arg0.anInt1264;
	if ((0x1 & arg6) == 1) {
	    i_30_ = arg0.anInt1297;
	    i = arg0.anInt1264;
	}
	int i_31_ = class119_sub1.anInt2255;
	int i_32_ = class119_sub1.anInt2243;
	if (class24.aBoolean580) {
	    i_32_ = 4 * i_30_;
	    i_31_ = 4 * i;
	}
	if (class24.anInt571 == 0)
	    class119_sub1.method1647(arg5 * 4 + 48,
				     48 - -((104 - (arg3 + i_30_)) * 4), i_31_,
				     i_32_);
	else
	    class119_sub1.method1648(48 - -(4 * arg5),
				     (104 - (arg3 + i_30_)) * 4 + 48, i_31_,
				     i_32_, class24.anInt571);
	return true;
    }
    
    public Class67_Sub1_Sub36() {
	super(0, true);
	anInt4364 = 204;
	anInt4361 = 1;
    }
    
    static {
	aRSString_4373
	    = Class134.method1914(" zuerst von Ihrer Ignorieren)2Liste(Q",
				  (byte) 81);
	aRSString_4377 = Class134.method1914(")4l=", (byte) 26);
	aRSString_4378 = aRSString_4376;
	anInt4366 = 0;
    }
}
