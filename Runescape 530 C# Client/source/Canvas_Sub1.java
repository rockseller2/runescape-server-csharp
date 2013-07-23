/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas
{
    public static int anInt54;
    public Component aComponent55;
    public static int anInt56;
    public static int anInt57;
    public static int anInt58;
    public static int anInt59;
    public static RSString aRSString_60;
    public static RSString aRSString_61 = Class134.method1914("m", (byte) 10);
    public static int anInt62 = 0;
    public static int anInt63;
    public static int anInt64;
    public static int anInt65;
    public static int anInt66;
    public static int anInt67;
    public static RSString aRSString_68
	= Class134.method1914(":duelfriend:", (byte) 6);
    
    public static void method43(int arg0) {
	if (arg0 != -31978)
	    anInt64 = 96;
	aRSString_61 = null;
	aRSString_60 = null;
	aRSString_68 = null;
    }
    
    public void update(Graphics arg0) {
	aComponent55.update(arg0);
	anInt63++;
    }
    
    public Canvas_Sub1(Component arg0) {
	aComponent55 = arg0;
    }
    
    public static void method44(int arg0, int arg1, int arg2, int arg3,
				int arg4) {
	anInt66++;
	if ((Class115.anInt2185 ^ 0xffffffff) > -101)
	    Class67_Sub5_Sub8.method882(true);
	Class121.method1685(arg2, arg0, arg2 - -arg4, arg3 + arg0);
	if ((Class115.anInt2185 ^ 0xffffffff) > -101) {
	    int i = 20;
	    int i_0_ = arg2 + arg4 / 2;
	    int i_1_ = -18 + (arg0 - -(arg3 / 2) - i);
	    Class121.method1683(arg2, arg0, arg4, arg3, 0);
	    Class121.method1681(-152 + i_0_, i_1_, 304, 34, 9179409);
	    Class121.method1681(i_0_ - 151, i_1_ + 1, 302, 32, 0);
	    Class121.method1683(-150 + i_0_, i_1_ - -2, Class115.anInt2185 * 3,
				30, 9179409);
	    Class121.method1683(-150 + i_0_ - -(Class115.anInt2185 * 3),
				i_1_ - -2, -(3 * Class115.anInt2185) + 300, 30,
				0);
	    Class130.aClass67_Sub5_Sub10_2404.method908(Class140.aRSString_2548,
							i_0_, i + i_1_,
							16777215, -1);
	} else {
	    Class132.anInt2437
		= (int) ((float) (arg3 * arg1) / Class54.aFloat1075);
	    Class22.anInt548 = (-(int) ((float) arg3 / Class54.aFloat1075)
				+ Class118.anInt2231);
	    int i = (Class67_Sub3.anInt2853
		     + -(int) ((float) arg4 / Class54.aFloat1075));
	    Class109.anInt2091 = (-(int) ((float) arg4 / Class54.aFloat1075)
				  + Class67_Sub3.anInt2853);
	    int i_2_ = (-(int) ((float) arg3 / Class54.aFloat1075)
			+ Class118.anInt2231);
	    int i_3_ = ((int) ((float) arg4 / Class54.aFloat1075)
			+ Class67_Sub3.anInt2853);
	    int i_4_ = (Class118.anInt2231
			- -(int) ((float) arg3 / Class54.aFloat1075));
	    Class134.anInt2467
		= (int) ((float) (2 * arg4) / Class54.aFloat1075);
	    Class67.method607(arg2 + arg4, i_2_, i_3_, arg0 - -arg3, i_4_, i,
			      arg0, arg2, (byte) -91);
	    Class89.method1469(arg0, i, (byte) 97, arg4 + arg2, i_4_, i_2_,
			       i_3_, arg3 + arg0, arg2);
	    Class67_Sub10.method1119(arg2, i, i_2_, arg4 + arg2, arg3 + arg0,
				     i_4_, i_3_, (byte) -127, arg0);
	    if ((Class67_Sub1_Sub9.anInt3960 ^ 0xffffffff) < -1) {
		Class54.anInt1081--;
		if ((Class54.anInt1081 ^ 0xffffffff) == -1) {
		    Class67_Sub1_Sub9.anInt3960--;
		    Class54.anInt1081 = 20;
		}
	    }
	    if (Class68.aBoolean1378) {
		int i_5_ = -5 + (arg2 + arg4);
		int i_6_ = -8 + (arg0 + arg3);
		int i_7_ = 16776960;
		Class143.aClass67_Sub5_Sub10_2583.method923
		    ((Class67_Sub1_Sub27.method744
		      ((new RSString[]
			{ Class23.aRSString_558,
			  InputStream_Sub1.method47(Class27.anInt624, true) }),
		       -128)),
		     i_5_, i_6_, 16776960, -1);
		Runtime runtime = Runtime.getRuntime();
		int i_8_
		    = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			     / 1024L);
		i_6_ -= 15;
		if ((i_8_ ^ 0xffffffff) < -65537)
		    i_7_ = 16711680;
		Class143.aClass67_Sub5_Sub10_2583.method923
		    (Class67_Sub1_Sub27.method744((new RSString[]
						   { Class126.aRSString_2349,
						     InputStream_Sub1
							 .method47(i_8_, true),
						     (Class67_Sub29
						      .aRSString_3332) }),
						  arg1 ^ ~0x73),
		     i_5_, i_6_, i_7_, -1);
		i_6_ -= 15;
	    }
	}
    }
    
    public void paint(Graphics arg0) {
	anInt56++;
	aComponent55.paint(arg0);
    }
    
    public static void method45(RSString arg0, RSString arg1, RSString arg2,
				boolean arg3, int arg4) {
	try {
	    if (arg3 != false)
		method46((byte) 62, -49L, -78, 6);
	    Class66.method600(-1, arg1, arg2, arg4, -1, arg0);
	    anInt65++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("ah.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ')'));
	}
    }
    
    public static boolean method46(byte arg0, long arg1, int arg2, int arg3) {
	try {
	    anInt54++;
	    int i = (0x7dd62 & (int) arg1) >> -1310208594;
	    int i_9_ = (0x329661 & (int) arg1) >> -1194626732;
	    if (arg0 < 96)
		method44(-78, 45, 123, 68, 103);
	    int i_10_ = 0x7fffffff & (int) (arg1 >>> 1126498976);
	    if (i != 10 && i != 11 && (i ^ 0xffffffff) != -23)
		Class57.method490(0, arg3, arg2, 0, (byte) -6, true, i_9_, 0,
				  (Class122.aClass131_Sub7_Sub2_2309
				   .smallY[0]),
				  i - -1, 2,
				  (Class122.aClass131_Sub7_Sub2_2309
				   .smallX[0]));
	    else {
		Class65 class65 = Class73.method1359(11525, i_10_);
		int i_11_;
		int i_12_;
		if (i_9_ == 0 || (i_9_ ^ 0xffffffff) == -3) {
		    i_11_ = class65.anInt1297;
		    i_12_ = class65.anInt1264;
		} else {
		    i_11_ = class65.anInt1264;
		    i_12_ = class65.anInt1297;
		}
		int i_13_ = class65.anInt1311;
		if ((i_9_ ^ 0xffffffff) != -1)
		    i_13_ = (i_13_ << i_9_ & 0xf) - -(i_13_ >> 4 - i_9_);
		Class57.method490
		    (i_11_, arg3, arg2, i_12_, (byte) -6, true, 0, i_13_,
		     Class122.aClass131_Sub7_Sub2_2309.smallY[0], 0, 2,
		     Class122.aClass131_Sub7_Sub2_2309.smallX[0]);
	    }
	    Class116.anInt2190 = Class115.anInt2186;
	    Class67_Sub5_Sub4.anInt4512 = 2;
	    Class55_Sub3.anInt2816 = 0;
	    Class75.anInt2726 = Class101.anInt1985;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ah.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    static {
	aRSString_60 = Class134.method1914("_labels", (byte) 121);
	anInt57 = 0;
    }
}
