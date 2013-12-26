/* Class67_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub1 extends Class67_Sub1
{
    public static RSString aRSString_3815
	= Class134.method1914(" )2> <col=ffff00>", (byte) 16);
    public static int anInt3816;
    public int[] anIntArray3817 = new int[3];
    public static int anInt3818;
    public static int anInt3819;
    public static int anInt3820;
    public static long[] aLongArray3821;
    public static Class9 aClass9_3822;
    public static RSString aRSString_3823
	= Class134.method1914("Fermer", (byte) 102);
    public int anInt3824 = 3216;
    public int anInt3825 = 3216;
    public static int anInt3826;
    public int anInt3827 = 4096;
    public static int anInt3828;
    
    public void method618(int arg0) {
	int i = 98 % ((arg0 - -60) / 62);
	method628((byte) 36);
	anInt3819++;
    }
    
    public static Class method625(int arg0, String arg1)
	throws ClassNotFoundException {
	anInt3818++;
	if (arg1.equals("B"))
	    return Byte.TYPE;
	if (arg1.equals("I"))
	    return Integer.TYPE;
	if (arg0 != 10990)
	    method626(-92);
	if (arg1.equals("S"))
	    return Short.TYPE;
	if (arg1.equals("J"))
	    return Long.TYPE;
	if (arg1.equals("Z"))
	    return Boolean.TYPE;
	if (arg1.equals("F"))
	    return Float.TYPE;
	if (arg1.equals("D"))
	    return Double.TYPE;
	if (arg1.equals("C"))
	    return Character.TYPE;
	return Class.forName(arg1);
    }
    
    public static void method626(int arg0) {
	aClass9_3822 = null;
	aRSString_3823 = null;
	if (arg0 != 1489062284)
	    aLongArray3821 = null;
	aLongArray3821 = null;
	aRSString_3815 = null;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    anInt3827 = 84;
	int i = arg2;
    while_24_:
	do {
	    do {
		if (i != 0) {
		    if (i != 1) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_24_;
		    }
		} else {
		    anInt3827 = arg0.readUShort(-2386);
		    break while_24_;
		}
		anInt3825 = arg0.readUShort(-2386);
		break while_24_;
	    } while (false);
	    anInt3824 = arg0.readUShort(-2386);
	} while (false);
	anInt3826++;
    }
    
    public static int method627(int arg0, int arg1) {
	anInt3820++;
	if (arg0 >= 65 && (arg0 ^ 0xffffffff) >= -91
	    || ((arg0 ^ 0xffffffff) <= -193 && (arg0 ^ 0xffffffff) >= -223
		&& arg0 != 215))
	    return arg0 + 32;
	if ((arg0 ^ 0xffffffff) == -160)
	    return 255;
	if ((arg0 ^ 0xffffffff) == -141)
	    return 156;
	if (arg1 < 99)
	    aRSString_3815 = null;
	return arg0;
    }
    
    public void method628(byte arg0) {
	double d = Math.cos((double) ((float) anInt3824 / 4096.0F));
	anIntArray3817[0]
	    = (int) (d * Math.sin((double) ((float) anInt3825 / 4096.0F))
		     * 4096.0);
	anIntArray3817[1]
	    = (int) (d * Math.cos((double) ((float) anInt3825 / 4096.0F))
		     * 4096.0);
	anIntArray3817[2]
	    = (int) (4096.0
		     * Math.sin((double) ((float) anInt3824 / 4096.0F)));
	int i = 58 % ((arg0 - -69) / 55);
	anInt3828++;
	int i_0_ = anIntArray3817[0] * anIntArray3817[0] >> 1796889836;
	int i_1_ = anIntArray3817[1] * anIntArray3817[1] >> 1846347340;
	int i_2_ = anIntArray3817[2] * anIntArray3817[2] >> -1010574900;
	int i_3_ = (int) (4096.0 * Math.sqrt((double) (i_2_ + i_1_ + i_0_
						       >> -1834888084)));
	if ((i_3_ ^ 0xffffffff) != -1) {
	    anIntArray3817[2] = (anIntArray3817[2] << -194922004) / i_3_;
	    anIntArray3817[0] = (anIntArray3817[0] << 818199308) / i_3_;
	    anIntArray3817[1] = (anIntArray3817[1] << -1456947572) / i_3_;
	}
    }
    
    public Class67_Sub1_Sub1() {
	super(1, true);
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt3816++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    method628((byte) 56);
	if (aClass144_2836.aBoolean2607) {
	    int i = anInt3827 * Class63.anInt1164 >> 629638220;
	    int[] is_4_
		= this.method613(0, -1 + arg0 & Class67_Sub1_Sub36.anInt4381,
				 false);
	    int[] is_5_ = this.method613(0, arg0, false);
	    int[] is_6_
		= this.method613(0, 1 + arg0 & Class67_Sub1_Sub36.anInt4381,
				 false);
	    for (int i_7_ = 0;
		 ((i_7_ ^ 0xffffffff)
		  > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff));
		 i_7_++) {
		int i_8_ = (is_6_[i_7_] + -is_4_[i_7_]) * i >> -1961775444;
		int i_9_ = ((-is_5_[i_7_ - -1 & Class76.anInt1581]
			     + is_5_[Class76.anInt1581 & -1 + i_7_]) * i
			    >> 1310819948);
		int i_10_ = i_9_ >> 815385092;
		int i_11_ = i_8_ >> 204640484;
		if ((i_10_ ^ 0xffffffff) > -1)
		    i_10_ = -i_10_;
		if ((i_11_ ^ 0xffffffff) > -1)
		    i_11_ = -i_11_;
		if ((i_10_ ^ 0xffffffff) < -256)
		    i_10_ = 255;
		if ((i_11_ ^ 0xffffffff) < -256)
		    i_11_ = 255;
		int i_12_ = ((Class67_Sub1_Sub12.aByteArray3996
			      [((i_11_ + 1) * i_11_ >> 1259506177) + i_10_])
			     & 0xff);
		int i_13_ = i_9_ * i_12_ >> -728931992;
		i_13_ = i_13_ * anIntArray3817[0] >> 1489062284;
		int i_14_ = i_12_ * 4096 >> 585852456;
		int i_15_ = i_12_ * i_8_ >> 1538802056;
		i_15_ = anIntArray3817[1] * i_15_ >> 1054781644;
		i_14_ = anIntArray3817[2] * i_14_ >> 553045036;
		is[i_7_] = i_14_ + (i_13_ + i_15_);
	    }
	}
	return is;
    }
    
    static {
	aLongArray3821 = new long[32];
    }
}
