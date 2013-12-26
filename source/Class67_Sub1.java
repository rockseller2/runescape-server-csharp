/* Class67_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class67_Sub1 extends Class67
{
    public static int anInt2818;
    public static int anInt2819;
    public static int anInt2820;
    public static int anInt2821;
    public static int anInt2822;
    public static int anInt2823;
    public static int anInt2824;
    public static int anInt2825;
    public static int anInt2826;
    public Class67_Sub1[] aClass67_Sub1Array2827;
    public static int anInt2828;
    public static int anInt2829;
    public Class103 aClass103_2830;
    public static int anInt2831;
    public static RSString aRSString_2832
	= Class134.method1914("Hidden)2use", (byte) 45);
    public static int anInt2833;
    public static int anInt2834;
    public static RSString aRSString_2835
	= Class134.method1914("scrollbar", (byte) 54);
    public Class144 aClass144_2836;
    public static int anInt2837;
    public int anInt2838;
    public boolean aBoolean2839;
    public static int anInt2840;
    
    public int[][] method609(int arg0, boolean arg1, int arg2) {
	anInt2829++;
	if (arg1 != false)
	    aRSString_2835 = null;
	if (aClass67_Sub1Array2827[arg2].aBoolean2839) {
	    int[] is = aClass67_Sub1Array2827[arg2].method611(arg0, (byte) 55);
	    int[][] is_0_ = new int[3][];
	    is_0_[1] = is;
	    is_0_[2] = is;
	    is_0_[0] = is;
	    return is_0_;
	}
	return aClass67_Sub1Array2827[arg2].method624(true, arg0);
    }
    
    public int method610(int arg0) {
	anInt2840++;
	if (arg0 != -1)
	    anInt2822 = 88;
	return -1;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt2826++;
	if (arg1 != 55)
	    return null;
	throw new IllegalStateException
		  ("This operation does not have a monochrome output");
    }
    
    public void method612(byte arg0, int arg1, int arg2) {
	anInt2833++;
	if (arg0 > -112)
	    aBoolean2839 = true;
	int i = anInt2838 == 255 ? arg2 : anInt2838;
	if (!aBoolean2839)
	    aClass103_2830 = new Class103(i, arg2, arg1);
	else
	    aClass144_2836 = new Class144(i, arg2, arg1);
    }
    
    public int[] method613(int arg0, int arg1, boolean arg2) {
	anInt2820++;
	if (arg2 != false)
	    return null;
	if (!aClass67_Sub1Array2827[arg0].aBoolean2839)
	    return aClass67_Sub1Array2827[arg0].method624(!arg2, arg1)[0];
	return aClass67_Sub1Array2827[arg0].method611(arg1, (byte) 55);
    }
    
    public static int method614(int arg0, int arg1) {
	if (arg1 != 1393598983)
	    method622(-114, -89);
	anInt2834++;
	return arg0 >>> 1393598983;
    }
    
    public int method615(byte arg0) {
	int i = -58 % ((-11 - arg0) / 59);
	anInt2818++;
	return -1;
    }
    
    public static Class126_Sub4 method616(Stream arg0, byte arg1) {
	if (arg1 != -121)
	    return null;
	anInt2831++;
	return new Class126_Sub4(arg0.readShort2((byte) 125),
				 arg0.readShort2((byte) 105),
				 arg0.readShort2((byte) 66),
				 arg0.readShort2((byte) 106),
				 arg0.readThreeBytes(65280),
				 arg0.readThreeBytes(65280),
				 arg0.readByte((byte) 86));
    }
    
    public void method617(byte arg0) {
	int i = 9 % ((-21 - arg0) / 49);
	if (!aBoolean2839) {
	    aClass103_2830.method1557((byte) -56);
	    aClass103_2830 = null;
	} else {
	    aClass144_2836.method1962(0);
	    aClass144_2836 = null;
	}
	anInt2828++;
    }
    
    public void method618(int arg0) {
	anInt2823++;
	int i = 92 % ((arg0 - -60) / 62);
    }
    
    public static void method619(int arg0) {
	anInt2819++;
	Class70.method1332(100);
	InputStream_Sub1.method54(arg0 ^ ~0x4693);
	Class67_Sub5_Sub9.method898(80);
	Class73.method1356(120);
	Class44.method389(false);
	Class67_Sub5_Sub4_Sub2.method863((byte) 46);
	Class44.method386(19785);
	Class67_Sub1_Sub15.method682(-75);
	Class43.method382(-117);
	Class6.method81((byte) 56);
	Class33_Sub2.method298(64);
	Class140.method1943((byte) -114);
	Class67_Sub5_Sub5.method864(-95);
	Class44.method388((byte) -107);
	Class67_Sub1_Sub22.method721(-19933);
	Class67_Sub12.method1221((byte) -33);
	if ((Class100.anInt1972 ^ 0xffffffff) != -1) {
	    for (int i = 0; i < Class99.aByteArrayArray1960.length; i++)
		Class99.aByteArrayArray1960[i] = null;
	    Class67_Sub1_Sub35.anInt4340 = 0;
	}
	Class129_Sub1.method1750(-2);
	Class67_Sub5_Sub13.method957(-1);
	Class44.aClass136_923.method1922(arg0 ^ arg0);
	((Class75) Class26.anInterface3_623).method1377(0);
	OutputStream_Sub1.aClass137_90.method1934(arg0 ^ ~0x46c6);
	Class67_Sub1_Sub32.aClass9_4297.method118((byte) -86);
	Class12.aClass9_418.method118((byte) -86);
	Class27.aClass9_635.method118((byte) -86);
	PacketParser.aClass9_2113.method118((byte) -86);
	Class111.aClass9_2097.method118((byte) -86);
	Class9.aClass9_362.method118((byte) -86);
	Class114.aClass9_2158.method118((byte) -86);
	Class51.aClass9_1044.method118((byte) -86);
	Class41.aClass9_878.method118((byte) -86);
	Stream.aClass9_2908.method118((byte) -86);
	Class126_Sub2.aClass9_3429.method118((byte) -86);
	Class144.aClass136_2599.method1922(0);
    }
    
    public static int method620(int arg0, int arg1, byte arg2, int arg3) {
	arg0 &= 0x3;
	anInt2837++;
	if (arg0 == 0)
	    return arg1;
	if (arg0 == 1)
	    return 7 + -arg3;
	if (arg2 != -88)
	    return -111;
	if (arg0 == 2)
	    return 7 + -arg1;
	return arg3;
    }
    
    public static void method621(int arg0) {
	aRSString_2832 = null;
	if (arg0 != 29749)
	    method616(null, (byte) -125);
	aRSString_2835 = null;
    }
    
    public static Class81 method622(int arg0, int arg1) {
	anInt2821++;
	if (arg0 != -17177)
	    anInt2822 = 86;
	Class81 class81 = (Class81) Class67_Sub1_Sub25.aClass136_4224
					.method1924((long) arg1, false);
	if (class81 != null)
	    return class81;
	byte[] is = (Class131_Sub4.aClass9_3644.method138
		     (-809612665, Class87.method1462(arg1, (byte) -68),
		      Class30.method282(false, arg1)));
	class81 = new Class81();
	class81.anInt1632 = arg1;
	if (is != null)
	    class81.method1427(false, new Stream(is));
	Class67_Sub1_Sub25.aClass136_4224.method1926((long) arg1, class81,
						     (byte) -71);
	return class81;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    anInt2822 = 120;
	anInt2825++;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt2824++;
	if (arg0 != true)
	    aRSString_2832 = null;
	throw new IllegalStateException
		  ("This operation does not have a colour output");
    }
    
    public Class67_Sub1(int arg0, boolean arg1) {
	aClass67_Sub1Array2827 = new Class67_Sub1[arg0];
	aBoolean2839 = arg1;
    }
}
