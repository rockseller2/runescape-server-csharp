public class Class126_Sub1 extends Class126
{
    public int anInt3412;
    public static int anInt3413;
    public int anInt3414;
    public static int anInt3415;
    public static int anInt3416;
    public static int anInt3417 = 0;
    public int anInt3418;
    public static int anInt3419;
    public static int anInt3420;
    public static int anInt3421;
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array3422;
    public static int anInt3423 = 100;
    public int anInt3424;
    
    public static byte[] method1713(boolean arg0, Object arg1, byte arg2) {
	anInt3416++;
	if (arg1 == null)
	    return null;
	if (arg2 >= -81)
	    return null;
	if (arg1 instanceof byte[]) {
	    byte[] is = (byte[]) arg1;
	    if (arg0)
		return Class55_Sub1.method465(is, 0);
	    return is;
	}
	if (arg1 instanceof Class108) {
	    Class108 class108 = (Class108) arg1;
	    return class108.method1577((byte) 112);
	}
	throw new IllegalArgumentException();
    }
    
    public Class126_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	anInt3424 = arg3;
	anInt3412 = arg1;
	anInt3414 = arg0;
	anInt3418 = arg2;
    }
    
    public void method1708(byte arg0, int arg1, int arg2) {
	int i = arg2 * anInt3412 >> -1607936468;
	anInt3420++;
	int i_0_ = anInt3418 * arg1 >> -475040564;
	int i_1_ = arg1 * anInt3414 >> 2050613324;
	if (arg0 == -36) {
	    int i_2_ = anInt3424 * arg2 >> 51090828;
	    Class120.method1661(i_1_, i_2_, i, (byte) 8, i_0_, anInt2358);
	}
    }
    
    public void method1712(byte arg0, int arg1, int arg2) {
	anInt3421++;
	int i = arg2 * anInt3424 >> -1679765556;
	int i_3_ = arg2 * anInt3412 >> 904208332;
	int i_4_ = anInt3418 * arg1 >> 1341047052;
	int i_5_ = anInt3414 * arg1 >> -487788884;
	if (arg0 >= -39)
	    method1713(true, null, (byte) -78);
	Class50.method440(i_4_, i_3_, anInt2355, i_5_, -18752, i, anInt2351);
    }
    
    public void method1710(int arg0, int arg1, byte arg2) {
	anInt3415++;
	int i = anInt3414 * arg1 >> 871942988;
	int i_6_ = anInt3418 * arg1 >> 1058523404;
	int i_7_ = arg0 * anInt3424 >> 58308972;
	int i_8_ = arg0 * anInt3412 >> 300083948;
	Class67_Sub1_Sub36.method784(anInt2351, i_6_, i_7_, anInt2358,
				     anInt2355, i_8_, false, i);
	if (arg2 != -67)
	    anInt3423 = 10;
    }
    
    public static void method1714(int arg0) {
	aClass67_Sub5_Sub19Array3422 = null;
	if (arg0 >= -98)
	    method1713(false, null, (byte) 8);
    }
}
