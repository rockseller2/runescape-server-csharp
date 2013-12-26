/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63
{
    public static int anInt1163;
    public static int anInt1164;
    public static int anInt1165;
    public static RSString aRSString_1166;
    public static RSString aRSString_1167
	= Class134.method1914(" loggt sich ein)3", (byte) 43);
    public static int anInt1168;
    public static RSString aRSString_1169
	= Class134.method1914("null", (byte) 79);
    public static int anInt1170;
    public static int anInt1171;
    public static int anInt1172;
    
    public static Class67_Sub5_Sub9 method565(int arg0, int arg1) {
	anInt1165++;
	Class67_Sub5_Sub9 class67_sub5_sub9
	    = ((Class67_Sub5_Sub9)
	       OutputStream_Sub1.aClass137_90.method1930(261775, (long) arg0));
	if (class67_sub5_sub9 != null)
	    return class67_sub5_sub9;
	byte[] is = Class126_Sub2.aClass9_3429.method138(-809612665, 0, arg0);
	if (is == null)
	    return null;
	class67_sub5_sub9 = new Class67_Sub5_Sub9();
	Stream Stream = new Stream(is);
	Stream.currentOffset = -2 + Stream.buffer.length;
	int i = Stream.readUShort(-2386);
	int i_0_ = -12 + -i + (-2 + Stream.buffer.length);
	Stream.currentOffset = i_0_;
	int i_1_ = Stream.readInt((byte) 127);
	class67_sub5_sub9.anInt4602 = Stream.readUShort(-2386);
	class67_sub5_sub9.anInt4606 = Stream.readUShort(-2386);
	class67_sub5_sub9.anInt4608 = Stream.readUShort(-2386);
	class67_sub5_sub9.anInt4615 = Stream.readUShort(-2386);
	int i_2_ = Stream.readByte((byte) 105);
	if (i_2_ > 0) {
	    class67_sub5_sub9.aClass92Array4611 = new Class92[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		int i_4_ = Stream.readUShort(-2386);
		Class92 class92
		    = new Class92(Class67_Sub1_Sub31.method765(113, i_4_));
		class67_sub5_sub9.aClass92Array4611[i_3_] = class92;
		while ((i_4_-- ^ 0xffffffff) < -1) {
		    int i_5_ = Stream.readInt((byte) 126);
		    int i_6_ = Stream.readInt((byte) 125);
		    class92.method1488((byte) -89, new Class67_Sub19(i_6_),
				       (long) i_5_);
		}
	    }
	}
	int i_7_ = 0;
	Stream.currentOffset = 0;
	class67_sub5_sub9.aRSString_4607 = Stream.method1085(110);
	class67_sub5_sub9.anIntArray4601 = new int[i_1_];
	class67_sub5_sub9.aRSStringArray4599 = new RSString[i_1_];
	class67_sub5_sub9.anIntArray4603 = new int[i_1_];
	if (arg1 > -94)
	    return null;
	while ((i_0_ ^ 0xffffffff) < (Stream.currentOffset ^ 0xffffffff)) {
	    int i_8_ = Stream.readUShort(-2386);
	    if (i_8_ != 3) {
		if (i_8_ < 100 && (i_8_ ^ 0xffffffff) != -22 && i_8_ != 38
		    && (i_8_ ^ 0xffffffff) != -40)
		    class67_sub5_sub9.anIntArray4603[i_7_]
			= Stream.readInt((byte) 126);
		else
		    class67_sub5_sub9.anIntArray4603[i_7_]
			= Stream.readByte((byte) 111);
	    } else
		class67_sub5_sub9.aRSStringArray4599[i_7_]
		    = Stream.readRSString(-1);
	    class67_sub5_sub9.anIntArray4601[i_7_++] = i_8_;
	}
	OutputStream_Sub1.aClass137_90.method1932((long) arg0, 0,
						  class67_sub5_sub9);
	return class67_sub5_sub9;
    }
    
    public static void method566(int arg0) {
	aRSString_1166 = null;
	if (arg0 != -25229)
	    aRSString_1166 = null;
	aRSString_1167 = null;
	aRSString_1169 = null;
    }
    
    public static long method567(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return 0L;
	for (int i = 0; i < class67_sub24.anInt3215; i++) {
	    Class36 class36 = class67_sub24.aClass36Array3229[i];
	    if ((class36.aLong785 >> 29 & 0x3L) == 2L
		&& class36.anInt765 == arg1 && class36.anInt777 == arg2)
		return class36.aLong785;
	}
	return 0L;
    }
    
    static {
	aRSString_1166 = Class134.method1914("tremblement:", (byte) 126);
	anInt1171 = 0;
	anInt1168 = 0;
	anInt1163 = 0;
	anInt1170 = 0;
    }
}
