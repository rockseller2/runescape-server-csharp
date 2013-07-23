/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class85
{
    public static RSString[] aRSStringArray1705;
    public int anInt1706;
    public int anInt1707;
    public byte[] aByteArray1708;
    public int[][] anIntArrayArray1709;
    public byte[][] aByteArrayArray1710;
    public static RSString aRSString_1711;
    public int[] anIntArray1712 = new int[6];
    public int anInt1713;
    public boolean[] aBooleanArray1714;
    public static RSString aRSString_1715
	= Class134.method1914("mapflag", (byte) 6);
    public int[] anIntArray1716 = new int[256];
    public int anInt1717;
    public int[][] anIntArrayArray1718;
    public int anInt1719;
    public byte aByte1720;
    public boolean[] aBooleanArray1721 = new boolean[256];
    public byte[] aByteArray1722;
    public static RSString aRSString_1723;
    public byte[] aByteArray1724;
    public static int anInt1725;
    public static RSString aRSString_1726;
    public static int anInt1727;
    public static RSString aRSString_1728;
    public byte[] aByteArray1729;
    public int anInt1730;
    public int[] anIntArray1731;
    public int[][] anIntArrayArray1732;
    public int anInt1733;
    public byte[] aByteArray1734;
    public int anInt1735;
    public int anInt1736;
    public byte[] aByteArray1737;
    public int[] anIntArray1738;
    public int anInt1739;
    public int anInt1740;
    public static int anInt1741;
    public static Class119[] aClass119Array1742;
    public int anInt1743;
    public static int anInt1744;
    public int anInt1745;
    public static int anInt1746;
    public int anInt1747;
    public static int anInt1748;
    public int anInt1749;
    public static int anInt1750;
    public static int anInt1751;
    
    public static void method1448(byte arg0, int arg1) {
	if (arg0 <= 62)
	    method1448((byte) -64, 9);
	anInt1725++;
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -23, (long) arg1));
	if (class67_sub8 != null)
	    class67_sub8.method606((byte) -118);
    }
    
    public static void method1449(int arg0) {
	aRSString_1711 = null;
	aRSString_1723 = null;
	aRSString_1728 = null;
	aRSStringArray1705 = null;
	aRSString_1726 = null;
	aRSString_1715 = null;
	aClass119Array1742 = null;
	if (arg0 < 40)
	    aRSStringArray1705 = null;
    }
    
    public static void method1450(int arg0, int arg1, boolean arg2, int arg3) {
	if (arg1 > 38) {
	    anInt1741++;
	    if (arg3 < 8000 || arg3 > 48000)
		throw new IllegalArgumentException();
	    Class25.aBoolean605 = arg2;
	    Class89.anInt1833 = arg3;
	    Class15.anInt461 = arg0;
	}
    }
    
    public static void method1451(long arg0, int arg1, int arg2, int arg3,
				  RSString arg4, int arg5, int arg6) {
	try {
	    anInt1727++;
	    Stream Stream = new Stream(128);
	    Stream.addByte((byte) 4, 10);
	    Stream.addUShort(16711680, (int) (99999.0 * Math.random()));
	    Stream.addUShort(16711680, 530);
	    Stream.writeLong(2, arg0);
	    if (arg6 < 109)
		anInt1746 = 24;
	    Stream.addInt((int) (99999999D * Math.random()), 125);
	    Stream.writeRSString(arg4, (byte) 0);
	    Stream.addInt((int) (Math.random() * 99999999D), 125);
	    Stream.addUShort(16711680, Class67_Sub5_Sub3.anInt4489);
	    Stream.addByte((byte) 4, arg3);
	    Stream.addByte((byte) 4, arg5);
	    Stream.addInt((int) (Math.random() * 99999999D), 122);
	    Stream.addUShort(16711680, arg2);
	    Stream.addUShort(16711680, arg1);
	    Stream.addInt((int) (99999999D * Math.random()), 123);
	    Stream.doKeys(Class14.aBigInteger444, (byte) -102,
				    Class87.aBigInteger1802);
	    Class70_Sub1.outStream.currentOffset = 0;
	    Class70_Sub1.outStream.addByte((byte) 4, 36);
	    Class70_Sub1.outStream
		.addByte((byte) 4, Stream.currentOffset);
	    Class70_Sub1.outStream.writeBytes
		(119, Stream.buffer, Stream.currentOffset, 0);
	    Class67_Sub26.anInt3277 = 1;
	    Class67_Sub1_Sub6.anInt3886 = 0;
	    Class91.anInt1857 = -3;
	    Class33_Sub2.anInt2774 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("me.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ',' + arg6
						+ ')'));
	}
    }
    
    public static boolean method1452(int arg0, boolean arg1) {
	anInt1748++;
	if ((arg0 ^ 0xffffffff) <= -33 && arg0 <= 126)
	    return true;
	if ((arg0 ^ 0xffffffff) <= -161 && arg0 <= 255)
	    return true;
	if ((arg0 ^ 0xffffffff) == -129 || arg0 == 140 || arg0 == 151
	    || (arg0 ^ 0xffffffff) == -157 || arg0 == 159)
	    return true;
	if (arg1 != true)
	    aRSString_1723 = null;
	return false;
    }
    
    public static void method1453(byte arg0, int arg1, RSString arg2) {
	if (arg0 <= -31) {
	    Class67_Sub5_Sub3 class67_sub5_sub3
		= Class103.method1558(arg1, false, 3);
	    anInt1744++;
	    class67_sub5_sub3.method846(true);
	    class67_sub5_sub3.aRSString_4497 = arg2;
	}
    }
    
    public static Class67_Sub5_Sub14 method1454(byte arg0, int arg1) {
	anInt1751++;
	if (arg0 != 69)
	    aRSString_1728 = null;
	Class67_Sub5_Sub14 class67_sub5_sub14
	    = ((Class67_Sub5_Sub14)
	       Class37.aClass137_793.method1930(261775, (long) arg1));
	if (class67_sub5_sub14 != null)
	    return class67_sub5_sub14;
	byte[] is
	    = Class67_Sub1_Sub7.aClass9_3909.method138(-809612665, arg1, 5);
	class67_sub5_sub14 = new Class67_Sub5_Sub14();
	if (is != null)
	    class67_sub5_sub14.method967((byte) 125, new Stream(is));
	Class37.aClass137_793.method1932((long) arg1, 0, class67_sub5_sub14);
	return class67_sub5_sub14;
    }
    
    public Class85() {
	anIntArrayArray1718 = new int[6][258];
	aByteArray1734 = new byte[18002];
	aByteArray1724 = new byte[18002];
	anIntArray1731 = new int[16];
	aByteArray1737 = new byte[4096];
	anIntArrayArray1732 = new int[6][258];
	anIntArrayArray1709 = new int[6][258];
	aByteArrayArray1710 = new byte[6][258];
	anInt1735 = 0;
	aBooleanArray1714 = new boolean[16];
	aByteArray1708 = new byte[256];
	anIntArray1738 = new int[257];
	anInt1749 = 0;
    }
    
    static {
	aRSStringArray1705 = new RSString[1000];
	aRSString_1711
	    = Class134.method1914("RuneScape is loading )2 please wait)3)3)3",
				  (byte) 22);
	aRSString_1723 = Class134.method1914(" autres options", (byte) 119);
	aRSString_1728 = Class134.method1914("(U", (byte) 14);
	aRSString_1726 = aRSString_1711;
	anInt1746 = -1;
    }
}
