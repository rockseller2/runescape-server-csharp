/* Class67_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class67_Sub20 extends Class67
{
    public static int anInt3155 = (int) (33.0 * Math.random()) + -16;
    public static boolean aBoolean3156;
    public static Calendar aCalendar3157;
    public static Class9 aClass9_3158;
    public static int anInt3159;
    public int[][] anIntArrayArray3160;
    public int[] anIntArray3161;
    public static int anInt3162;
    public int anInt3163;
    public static boolean aBoolean3164;
    public static int anInt3165;
    public int anInt3166;
    public static int anInt3167;
    public static int anInt3168 = 0;
    public int[] anIntArray3169;
    public static int anInt3170;
    public static RSString aRSString_3171;
    public boolean[] aBooleanArray3172;
    
    public static void method1269(int arg0, int arg1, int arg2, boolean arg3,
				  int arg4, int arg5) {
	if (arg3 == false) {
	    anInt3167++;
	    if (arg0 == arg5)
		Class67_Sub30.method1316(arg4, arg2, (byte) -76, arg1, arg5);
	    else if ((-arg5 + arg2 ^ 0xffffffff) <= (Class139.anInt2533
						     ^ 0xffffffff)
		     && ((Class126_Sub1.anInt3423 ^ 0xffffffff)
			 <= (arg5 + arg2 ^ 0xffffffff))
		     && Class55_Sub2.anInt2801 <= -arg0 + arg1
		     && OutputStream_Sub1.anInt87 >= arg1 + arg0)
		Class67_Sub1_Sub16.method690(arg4, arg2, arg5, arg0, arg1,
					     121);
	    else
		Class67_Sub11_Sub2.method1140(arg0, arg1, arg2, arg4, -50,
					      arg5);
	}
    }
    
    public static int method1270(int arg0, int arg1, int arg2) {
	anInt3159++;
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -53, (long) arg1));
	if (class67_sub8 == null)
	    return 0;
	if (arg2 == -1)
	    return 0;
	int i = 0;
	for (int i_0_ = arg0; i_0_ < class67_sub8.anIntArray2961.length;
	     i_0_++) {
	    if (class67_sub8.anIntArray2965[i_0_] == arg2)
		i += class67_sub8.anIntArray2961[i_0_];
	}
	return i;
    }
    
    public static void method1271(byte arg0) {
	aCalendar3157 = null;
	aClass9_3158 = null;
	if (arg0 < 106)
	    aRSString_3171 = null;
	aRSString_3171 = null;
    }
    
    public static int[] method1272(int[] arg0, boolean arg1) {
	anInt3162++;
	if (arg0 == null)
	    return null;
	if (arg1 != false)
	    aRSString_3171 = null;
	int[] is = new int[arg0.length];
	Class17.method181(arg0, 0, is, 0, arg0.length);
	return is;
    }
    
    public static int method1273(int arg0, int arg1) {
	return arg0 | arg1;
    }
    
    public static void method1274(Class67_Sub22 arg0, boolean arg1, int arg2) {
	int i = arg0.anInt3185;
	int i_1_ = (int) arg0.aLong1344;
	anInt3170++;
	arg0.method606((byte) -118);
	if (arg1)
	    Class67_Sub24.method1291(i, -556);
	Class113.method1602(i, arg2 ^ 0x3c6d);
	Class7 class7 = Class3.method69((byte) 110, i_1_);
	if (class7 != null)
	    Class37.method326(class7, arg2 ^ 0x3c66);
	int i_2_ = Class134.anInt2476;
	if (arg2 != 15361)
	    method1274(null, false, -28);
	for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
	    if (Class67_Sub1_Sub20.method714(arg2 ^ 0x4d7b,
					     Applet_Sub1.aShortArray21[i_3_]))
		Class67_Sub1_Sub37.method798(i_3_, false);
	}
	if (Class134.anInt2476 != 1) {
	    Class132.method1903(client.anInt2733, Class49.anInt1007,
				Class67_Sub16.anInt3084, 0, Class53.anInt1066);
	    int i_4_ = Class130.aClass67_Sub5_Sub10_2404
			   .method913(Class119.aRSString_2257);
	    for (int i_5_ = 0; i_5_ < Class134.anInt2476; i_5_++) {
		int i_6_ = Class130.aClass67_Sub5_Sub10_2404
			       .method913(Class64.method569(i_5_, (byte) 102));
		if (i_4_ < i_6_)
		    i_4_ = i_6_;
	    }
	    Class67_Sub16.anInt3084 = i_4_ + 8;
	    client.anInt2733
		= 15 * Class134.anInt2476 - -(!Class36.aBoolean771 ? 22 : 26);
	} else {
	    Class67_Sub9.aBoolean2980 = false;
	    Class132.method1903(client.anInt2733, Class49.anInt1007,
				Class67_Sub16.anInt3084, 0, Class53.anInt1066);
	}
	if (Class54.anInt1080 != -1)
	    Class67_Sub1_Sub3.method634((byte) 77, Class54.anInt1080, 1);
    }
    
    public Class67_Sub20(int arg0, byte[] arg1) {
	anInt3166 = arg0;
	Stream Stream = new Stream(arg1);
	anInt3163 = Stream.readByte((byte) -122);
	anIntArrayArray3160 = new int[anInt3163][];
	anIntArray3169 = new int[anInt3163];
	aBooleanArray3172 = new boolean[anInt3163];
	anIntArray3161 = new int[anInt3163];
	for (int i = 0; (anInt3163 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    anIntArray3169[i] = Stream.readByte((byte) 127);
	for (int i = 0; i < anInt3163; i++)
	    aBooleanArray3172[i]
		= (Stream.readByte((byte) 93) ^ 0xffffffff) == -2;
	for (int i = 0; anInt3163 > i; i++)
	    anIntArray3161[i] = Stream.readUShort(-2386);
	for (int i = 0; (anInt3163 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    anIntArrayArray3160[i]
		= new int[Stream.readByte((byte) -62)];
	for (int i = 0; i < anInt3163; i++) {
	    for (int i_7_ = 0; anIntArrayArray3160[i].length > i_7_; i_7_++)
		anIntArrayArray3160[i][i_7_]
		    = Stream.readByte((byte) 111);
	}
    }
    
    static {
	anInt3165 = 0;
	aBoolean3156 = false;
	aCalendar3157 = Calendar.getInstance();
	aRSString_3171
	    = Class134.method1914("Schrifts-=tze geladen)3", (byte) 118);
    }
}
