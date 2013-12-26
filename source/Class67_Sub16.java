/* Class67_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub16 extends Class67
{
    public static int anInt3080;
    public static int anInt3081;
    public static int anInt3082;
    public static RSString[] aRSStringArray3083;
    public static int anInt3084;
    public static int anInt3085;
    public byte[] aByteArray3086;
    public static byte[][] aByteArrayArray3087;
    public static RSString aRSString_3088;
    public static boolean aBoolean3089 = false;
    public static int anInt3090;
    public static int anInt3091;
    public static int anInt3092;
    public static Sprites aSprite_3093;
    
    public static int method1240(int arg0, int arg1, int arg2) {
	anInt3092++;
	if (arg1 == -2)
	    return 12345678;
	if (arg0 != -24637)
	    return 82;
	if (arg1 == -1) {
	    if ((arg2 ^ 0xffffffff) <= -3) {
		if ((arg2 ^ 0xffffffff) < -127)
		    arg2 = 126;
	    } else
		arg2 = 2;
	    return arg2;
	}
	arg2 = (arg1 & 0x7f) * arg2 >> 1710109383;
	if ((arg2 ^ 0xffffffff) <= -3) {
	    if ((arg2 ^ 0xffffffff) < -127)
		arg2 = 126;
	} else
	    arg2 = 2;
	return arg2 + (arg1 & 0xff80);
    }
    
    public static void method1241(int arg0) {
	aByteArrayArray3087 = null;
	aRSStringArray3083 = null;
	aRSString_3088 = null;
	aSprite_3093 = null;
	if (arg0 <= 29)
	    aSprite_3093 = null;
    }
    
    public Class67_Sub16(byte[] arg0) {
	aByteArray3086 = arg0;
    }
    
    public static void method1242(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg2 != 8)
	    aByteArrayArray3087 = null;
	if ((arg1 ^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
	    for (int i = arg0; i < arg1; i++)
		Class67_Sub29.anIntArrayArray3338[i][arg3] = arg4;
	} else {
	    for (int i = arg1; i < arg0; i++)
		Class67_Sub29.anIntArrayArray3338[i][arg3] = arg4;
	}
	anInt3082++;
    }
    
    public static void method1243
	(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5,
	 Class73[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
	do {
	    try {
		if (arg8 <= 30)
		    method1245(18);
		anInt3081++;
		int i;
		if (arg9)
		    i = 1;
		else
		    i = 4;
		if (!arg9) {
		    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -9; i_0_++) {
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -9; i_1_++) {
			    if (i_0_ + arg0 > 0
				&& (arg0 - -i_0_ ^ 0xffffffff) > -104
				&& (arg2 + i_1_ ^ 0xffffffff) < -1
				&& arg2 + i_1_ < 103)
				arg6[arg3].anIntArrayArray1453[i_0_ + arg0]
				    [i_1_ + arg2]
				    = Class75.method1379((arg6[arg3]
							  .anIntArrayArray1453
							  [i_0_ + arg0]
							  [i_1_ + arg2]),
							 -16777217);
			}
		    }
		}
		Stream Stream = new Stream(arg4);
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
		    for (int i_3_ = 0; i_3_ < 64; i_3_++) {
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
			    if (i_2_ != arg7
				|| (i_3_ ^ 0xffffffff) > (arg10 ^ 0xffffffff)
				|| (i_3_ ^ 0xffffffff) <= (8 + arg10
							   ^ 0xffffffff)
				|| arg1 > i_4_
				|| (i_4_ ^ 0xffffffff) <= (arg1 - -8
							   ^ 0xffffffff))
				Class47.method410(false, Stream, -1, 0,
						  0, -1, 0, arg9, 0);
			    else
				Class47.method410
				    (false, Stream,
				     Class67_Sub1.method620(arg5, i_4_ & 0x7,
							    (byte) -88,
							    0x7 & i_3_) + arg2,
				     arg5, arg3,
				     (RuntimeException_Sub1.method1974(arg5, 2,
								       (i_4_
									& 0x7),
								       (i_3_
									& 0x7))
				      + arg0),
				     0, arg9, 0);
			}
		    }
		}
		while ((Stream.currentOffset ^ 0xffffffff)
		       > (Stream.buffer.length ^ 0xffffffff)) {
		    int i_5_ = Stream.readByte((byte) 86);
		    if ((i_5_ ^ 0xffffffff) != -130) {
			Stream.currentOffset--;
			break;
		    }
		    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5; i_6_++) {
			byte i_7_ = Stream.readByte2((byte) 1);
			if (i_7_ == 0) {
			    if (arg7 >= i_6_) {
				int i_8_ = arg0;
				if (i_8_ < 0)
				    i_8_ = 0;
				else if ((i_8_ ^ 0xffffffff) <= -105)
				    i_8_ = 104;
				int i_9_ = 7 + arg0;
				int i_10_ = arg2;
				if (i_10_ < 0)
				    i_10_ = 0;
				else if (i_10_ >= 104)
				    i_10_ = 104;
				int i_11_ = 7 + arg2;
				if (i_11_ >= 0) {
				    if (i_11_ >= 104)
					i_11_ = 104;
				} else
				    i_11_ = 0;
				if ((i_9_ ^ 0xffffffff) > -1)
				    i_9_ = 0;
				else if ((i_9_ ^ 0xffffffff) <= -105)
				    i_9_ = 104;
				for (/**/;
				     (i_8_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff);
				     i_8_++) {
				    for (/**/; i_10_ < i_11_; i_10_++)
					Class134.aByteArrayArrayArray2464
					    [arg3][i_8_][i_10_]
					    = (byte) 0;
				}
			    }
			} else if ((i_7_ ^ 0xffffffff) == -2) {
			    for (int i_12_ = 0; i_12_ < 64; i_12_ += 4) {
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65;
				     i_13_ += 4) {
				    byte i_14_
					= Stream.readByte2((byte) 1);
				    if ((arg7 ^ 0xffffffff)
					<= (i_6_ ^ 0xffffffff)) {
					for (int i_15_ = i_12_;
					     4 + i_12_ > i_15_; i_15_++) {
					    for (int i_16_ = i_13_;
						 ((i_16_ ^ 0xffffffff)
						  > (i_13_ - -4 ^ 0xffffffff));
						 i_16_++) {
						if (((i_15_ ^ 0xffffffff)
						     <= (arg10 ^ 0xffffffff))
						    && ((i_15_ ^ 0xffffffff)
							> (8 + arg10
							   ^ 0xffffffff))
						    && ((arg1 ^ 0xffffffff)
							>= (i_16_
							    ^ 0xffffffff))
						    && ((arg1 ^ 0xffffffff)
							> (8 + arg1
							   ^ 0xffffffff))) {
						    int i_17_
							= (arg0
							   + (RuntimeException_Sub1
								  .method1974
							      (arg5, 2,
							       i_16_ & 0x7,
							       0x7 & i_15_)));
						    int i_18_
							= ((Class67_Sub1
								.method620
							    (arg5, 0x7 & i_16_,
							     (byte) -88,
							     0x7 & i_15_))
							   + arg2);
						    if (i_17_ >= 0
							&& i_17_ < 104
							&& i_18_ >= 0
							&& ((i_18_
							     ^ 0xffffffff)
							    > -105))
							Class134
							    .aByteArrayArrayArray2464
							    [arg3][i_17_]
							    [i_18_]
							    = i_14_;
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
		boolean bool = false;
		if (bool)
		    break;
		int i_19_ = arg0 - -7;
		int i_20_ = 7 + arg2;
		for (int i_21_ = arg0;
		     (i_21_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_21_++) {
		    for (int i_22_ = arg2;
			 (i_22_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_22_++)
			Class134.aByteArrayArrayArray2464[arg3][i_21_][i_22_]
			    = (byte) 0;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718
			  (runtimeexception,
			   ("lk.B(" + arg0 + ',' + arg1 + ',' + arg2 + ','
			    + arg3 + ',' + (arg4 != null ? "{...}" : "null")
			    + ',' + arg5 + ','
			    + (arg6 != null ? "{...}" : "null") + ',' + arg7
			    + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1244(int arg0) {
	int i = 44 / ((7 - arg0) / 35);
	anInt3091++;
	Class67_Sub11_Sub4.method1202();
	for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -5; i_23_++)
	    Class53.aClass73Array1059[i_23_].method1357(20);
	System.gc();
    }
    
    public static void method1245(int arg0) {
	Class67_Sub26.anIntArray3292 = null;
	Class67_Sub5_Sub8.aByteArrayArrayArray4571 = null;
	if (arg0 != 8428)
	    method1240(22, -16, 113);
	Class67_Sub1_Sub31.anIntArrayArrayArray4295 = null;
	Class81.anIntArray1656 = null;
	Class67_Sub15.anIntArray3077 = null;
	anInt3090++;
	Class67_Sub1_Sub37.anIntArray4384 = null;
	Class67_Sub1_Sub10.aByteArrayArrayArray3983 = null;
	Class70.aByteArrayArrayArray1403 = null;
	Class73.aByteArrayArrayArray1480 = null;
	Class67_Sub5_Sub18.anIntArray4805 = null;
	Class67_Sub1_Sub24.aByteArrayArrayArray4199 = null;
    }
    
    static {
	anInt3085 = 0;
	aRSString_3088
	    = (Class134.method1914
	       ("Votre liste noire est pleine (X100 noms maximum(Y)3",
		(byte) 116));
    }
}
