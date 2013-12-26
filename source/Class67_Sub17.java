/* Class67_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub17 extends Class67
{
    public static Class50 aClass50_3094 = new Class50();
    public static int anInt3095;
    public int anInt3096;
    public static int anInt3097;
    public static int anInt3098;
    public static Class142 aClass142_3099;
    public static int anInt3100;
    public static int anInt3101;
    public static int anInt3102;
    public int anInt3103;
    public static volatile int anInt3104 = 0;
    public static int anInt3105;
    public static int anInt3106;
    public static int anInt3107;
    public int anInt3108;
    public static int anInt3109;
    
    public static int method1246(int arg0, int arg1, int arg2, int arg3) {
	anInt3098++;
	if (arg2 != -31863)
	    return 32;
	if (arg1 > 243)
	    arg3 >>= 4;
	else if (arg1 > 217)
	    arg3 >>= 3;
	else if (arg1 > 192)
	    arg3 >>= 2;
	else if ((arg1 ^ 0xffffffff) < -180)
	    arg3 >>= 1;
	return ((arg0 >> 661684002 << 415013098)
		- -(arg3 >> -442785627 << 305916775) - -(arg1 >> 1772381761));
    }
    
    public static void method1247(boolean arg0, Class7 arg1, int arg2) {
	anInt3097++;
	int i = ((arg1.anInt328 ^ 0xffffffff) != -1 ? arg1.anInt328
		 : arg1.anInt189);
	int i_0_ = ((arg1.anInt222 ^ 0xffffffff) != -1 ? arg1.anInt222
		    : arg1.anInt194);
	Class67_Sub5_Sub7.method873(i, i_0_, arg1.anInt301, (byte) 100,
				    (Class67_Sub1_Sub5.aClass7ArrayArray3878
				     [arg1.anInt301 >> -76694672]),
				    arg0);
	if (arg1.aClass7Array228 != null)
	    Class67_Sub5_Sub7.method873(i, i_0_, arg1.anInt301, (byte) 100,
					arg1.aClass7Array228, arg0);
	Class67_Sub22 class67_sub22
	    = ((Class67_Sub22)
	       Class67_Sub1_Sub33.aClass92_4325
		   .method1489((byte) -79, (long) arg1.anInt301));
	if (arg2 > 52) {
	    if (class67_sub22 != null)
		Class108.method1573(arg0, i_0_, (byte) 91, i,
				    class67_sub22.anInt3185);
	}
    }
    
    public static void method1248(int arg0, Class9 arg1) {
	anInt3095++;
	Class84.aClass9_1697 = arg1;
	if (arg0 != 415013098)
	    anInt3104 = 97;
    }
    
    public static void method1249(int arg0) {
	aClass142_3099 = null;
	aClass50_3094 = null;
	if (arg0 != 0)
	    method1248(33, null);
    }
    
    public static RSString method1250(byte arg0, long arg1) {
	try {
	    anInt3105++;
	    if ((arg1 ^ 0xffffffffffffffffL) >= -1L
		|| arg1 >= 6582952005840035281L)
		return null;
	    if ((arg1 % 37L ^ 0xffffffffffffffffL) == -1L)
		return null;
	    int i = 0;
	    if (arg0 != -72)
		aClass50_3094 = null;
	    long l = arg1;
	    while ((l ^ 0xffffffffffffffffL) != -1L) {
		l /= 37L;
		i++;
	    }
	    byte[] is = new byte[i];
	    while ((arg1 ^ 0xffffffffffffffffL) != -1L) {
		long l_1_ = arg1;
		arg1 /= 37L;
		is[--i]
		    = Class108.aByteArray2080[(int) (-(arg1 * 37L) + l_1_)];
	    }
	    RSString RSString = new RSString();
	    RSString.aByteArray2653 = is;
	    RSString.anInt2629 = is.length;
	    return RSString;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("mi.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    static {
	anInt3102 = -1;
	anInt3107 = 0;
    }
}
