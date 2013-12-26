/* Class67_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

public class Class67_Sub8 extends Class67
{
    public static int anInt2958;
    public static int anInt2959;
    public static int anInt2960;
    public int[] anIntArray2961 = new int[1];
    public static int anInt2962;
    public static int anInt2963;
    public static Class136 aClass136_2964 = new Class136(64);
    public int[] anIntArray2965 = { -1 };
    public static Class9 aClass9_2966;
    
    public static void method1105(String arg0, int arg1) {
	System.out.println("Error: " + Class101.method1541("\n", "%0a", arg0,
							   arg1 ^ 0x2b45));
	if (arg1 == -11068)
	    anInt2960++;
    }
    
    public static void method1106(int arg0, byte arg1) {
	anInt2962++;
	int i = -43 / (-arg1 / 43);
	Class131_Sub4.aClass136_3639.method1920(arg0, 91);
    }
    
    public static void method1107(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, boolean arg5, int arg6) {
	anInt2958++;
	if ((arg0 ^ 0xffffffff) == -4)
	    method1107(Class2.anInt112, 34, -1, arg3, true, true, -1);
	else {
	    java.awt.Container container;
	    if (Class7.aFrame223 != null)
		container = Class7.aFrame223;
	    else if (Class120.aFrame2272 != null)
		container = Class120.aFrame2272;
	    else
		container = Class124.aSignLink_2335.anApplet940;
	    Class67_Sub1_Sub37.anInt4413 = container.getSize().width;
	    Class99.anInt1963 = container.getSize().height;
	    if (container == Class120.aFrame2272) {
		Insets insets = Class120.aFrame2272.getInsets();
		Class67_Sub1_Sub37.anInt4413 -= insets.right + insets.left;
		Class99.anInt1963 -= insets.bottom + insets.top;
	    }
	    if (arg1 != 34)
		method1109(72L, 22);
	    if ((arg0 ^ 0xffffffff) > -3) {
		Class67_Sub1_Sub30.anInt4272 = 0;
		Class49.anInt1010 = 503;
		Class67_Sub1_Sub16_Sub1.anInt5093
		    = (Class67_Sub1_Sub37.anInt4413 + -765) / 2;
		Class56.anInt1097 = 765;
	    } else {
		Class56.anInt1097 = Class67_Sub1_Sub37.anInt4413;
		Class67_Sub1_Sub16_Sub1.anInt5093 = 0;
		Class67_Sub1_Sub30.anInt4272 = 0;
		Class49.anInt1010 = Class99.anInt1963;
	    }
	    if (!arg5) {
		Class67_Sub5_Sub12.aCanvas4698.setSize(Class56.anInt1097,
						       Class49.anInt1010);
		if (container != Class120.aFrame2272)
		    Class67_Sub5_Sub12.aCanvas4698.setLocation
			(Class67_Sub1_Sub16_Sub1.anInt5093,
			 Class67_Sub1_Sub30.anInt4272);
		else {
		    Insets insets = Class120.aFrame2272.getInsets();
		    Class67_Sub5_Sub12.aCanvas4698.setLocation
			(insets.left + Class67_Sub1_Sub16_Sub1.anInt5093,
			 insets.top + Class67_Sub1_Sub30.anInt4272);
		}
	    } else {
		Class34.method309(-1, Class67_Sub5_Sub12.aCanvas4698);
		Class73.method1355(Class67_Sub5_Sub12.aCanvas4698, 0);
		if (Class82.aLogin_1669 != null)
		    Class82.aLogin_1669
			.method1420((byte) 52, Class67_Sub5_Sub12.aCanvas4698);
		Class28.aClient672.method25((byte) -127);
		Class67_Sub5_Sub14.method973((byte) 112,
					     Class67_Sub5_Sub12.aCanvas4698);
		Class67_Sub5_Sub13.method958(0,
					     Class67_Sub5_Sub12.aCanvas4698);
		if (Class82.aLogin_1669 != null)
		    Class82.aLogin_1669
			.method1417(false, Class67_Sub5_Sub12.aCanvas4698);
	    }
	    if (arg0 > 0)
		method1107(0, 34, -1, arg3, true, true, -1);
	    else {
		Class132.aBoolean2443 = !Class32.method288(true);
		if ((Class54.anInt1080 ^ 0xffffffff) != 0)
		    Class67_Sub10.method1116(true, false);
		if (Class41.aClass117_867 != null
		    && ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -31
			|| (Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -26))
		    Class67_Sub23.method1283((byte) -102);
		for (int i = 0; (i ^ 0xffffffff) > -101; i++)
		    OutputStream_Sub1.aBooleanArray96[i] = true;
		Class56.aBoolean1098 = true;
	    }
	}
    }
    
    public static void method1108(byte arg0) {
	int i = 69 % ((arg0 - 64) / 54);
	aClass9_2966 = null;
	aClass136_2964 = null;
    }
    
    public static void method1109(long arg0, int arg1) {
	try {
	    anInt2959++;
	    if ((long) arg1 != arg0) {
		if (Class90.anInt1847 >= 100)
		    Class87.method1465(true, Class144.aRSString_2605,
				       Class67_Sub5_Sub5.aRSString_4523, 0);
		else {
		    RSString RSString = Class67_Sub17.method1250
					  ((byte) -72, arg0).method500(0);
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class90.anInt1847 ^ 0xffffffff);
			 i++) {
			if ((Class103.aLongArray2025[i] ^ 0xffffffffffffffffL)
			    == (arg0 ^ 0xffffffffffffffffL)) {
			    Class87.method1465(true,
					       (Class67_Sub1_Sub27.method744
						((new RSString[]
						  { RSString,
						    Class130.aRSString_2419 }),
						 -94)),
					       Class67_Sub5_Sub5.aRSString_4523,
					       0);
			    return;
			}
		    }
		    for (int i = 0; i < Class67_Sub5_Sub17.anInt4795; i++) {
			if ((arg0 ^ 0xffffffffffffffffL)
			    == (Class66.aLongArray1330[i]
				^ 0xffffffffffffffffL)) {
			    Class87.method1465(true,
					       (Class67_Sub1_Sub27.method744
						((new RSString[]
						  { (Class67_Sub5_Sub12
						     .aRSString_4687),
						    RSString,
						    Class133.aRSString_2455 }),
						 -96)),
					       Class67_Sub5_Sub5.aRSString_4523,
					       0);
			    return;
			}
		    }
		    if (RSString.method519((byte) -62,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .playerName)))
			Class87.method1465(true, Class105.aRSString_2043,
					   Class67_Sub5_Sub5.aRSString_4523, 0);
		    else {
			Class67_Sub1_Sub8.anInt3925++;
			Class103.aLongArray2025[Class90.anInt1847] = arg0;
			Class126_Sub3.aRSStringArray3445[Class90.anInt1847++]
			    = Class67_Sub17.method1250((byte) -72, arg0);
			Class128.anInt2376 = Class11.anInt409;
			Class70_Sub1.outStream
			    .createFrame(arg1 + 2, 34);	//ADD_IGNORE
			Class70_Sub1.outStream.writeLong(2,
									arg0);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("he.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
