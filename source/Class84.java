/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84
{
    public static RSString aRSString_1691
	= Class134.method1914("Benutzeroberfl-=che geladen)3", (byte) 23);
    public static Class67_Sub5_Sub10 aClass67_Sub5_Sub10_1692;
    public int anInt1693;
    public boolean aBoolean1694 = true;
    public static int anInt1695;
    public int anInt1696;
    public static Class9 aClass9_1697;
    public int anInt1698;
    public int anInt1699;
    public static RSString[] aRSStringArray1700 = new RSString[100];
    public static int anInt1701;
    public int anInt1702;
    public int anInt1703;
    public static int anInt1704;
    
    public static void method1445(byte arg0) {
	int i
	    = (Class58.baseX
	       + (Class122.aClass131_Sub7_Sub2_2309.anInt3733 >> -278112313));
	anInt1701++;
	int i_0_ = ((Class122.aClass131_Sub7_Sub2_2309.anInt3726 >> 1475667719)
		    + Class137.baseY);
	Class117.anInt2224 = 0;
	if ((i ^ 0xffffffff) <= -3054 && i <= 3156 && i_0_ >= 3056
	    && i_0_ <= 3136)
	    Class117.anInt2224 = 1;
	if ((i ^ 0xffffffff) <= -3073 && i <= 3118
	    && (i_0_ ^ 0xffffffff) <= -9493 && i_0_ <= 9535)
	    Class117.anInt2224 = 1;
	if (Class117.anInt2224 == 1 && i >= 3139 && (i ^ 0xffffffff) >= -3200
	    && i_0_ >= 3008 && i_0_ <= 3062)
	    Class117.anInt2224 = 0;
	if (arg0 >= -12)
	    method1446(null, 47);
    }
    
    public static boolean method1446(byte[] arg0, int arg1) {
	anInt1695++;
	Stream Stream = new Stream(arg0);
	int i = Stream.readByte((byte) 121);
	if (i != 1)
	    return false;
	boolean bool = Stream.readByte((byte) -74) == arg1;
	if (bool)
	    Class67_Sub5_Sub8.method884(-70, Stream);
	Class130.method1758(Stream, arg1 + 79);
	return true;
    }
    
    public static void method1447(byte arg0) {
	aClass9_1697 = null;
	aRSString_1691 = null;
	aClass67_Sub5_Sub10_1692 = null;
	aRSStringArray1700 = null;
	if (arg0 != -112)
	    aClass9_1697 = null;
    }
    
    public Class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
		   boolean arg6) {
	anInt1696 = arg0;
	anInt1703 = arg5;
	anInt1698 = arg3;
	anInt1702 = arg4;
	anInt1693 = arg1;
	anInt1699 = arg2;
	aBoolean1694 = arg6;
    }
}
