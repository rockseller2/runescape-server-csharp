/* Class67_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class67_Sub23 extends Class67
{
    public static int anInt3190;
    public static int[] anIntArray3191;
    public Class31[] aClass31Array3192;
    public int[] anIntArray3193;
    public int[] anIntArray3194;
    public static int anInt3195;
    public static int anInt3196;
    public byte[][][] aByteArrayArrayArray3197;
    public Class31[] aClass31Array3198;
    public int[] anIntArray3199;
    public static int anInt3200;
    public static int[] anIntArray3201;
    public static int anInt3202;
    public static int anInt3203;
    public int anInt3204;
    public static Class67_Sub11_Sub4 aClass67_Sub11_Sub4_3205;
    public int anInt3206;
    public static RSString aRSString_3207
	= Class134.method1914("<col=ffff00>", (byte) 52);
    public static int anInt3208;
    public static int anInt3209;
    public static int[] anIntArray3210;
    public static int[][][] anIntArrayArrayArray3211;
    
    public static void method1282(int arg0, int[][] arg1) {
	Class67_Sub29.anIntArrayArray3338 = arg1;
	if (arg0 != -3)
	    aClass67_Sub11_Sub4_3205 = null;
	anInt3190++;
    }
    
    public static void method1283(byte arg0) {
	Class129.anInt2401++;
	int i = 94 % ((-38 - arg0) / 49);
	anInt3209++;
	Class70_Sub1.outStream.createFrame(2, 243);	//WINDOW_TYPE
	Class70_Sub1.outStream
	    .addByte((byte) 4, Class78.method1413(113));
	Class70_Sub1.outStream.addUShort(16711680,
							Class56.anInt1097);
	Class70_Sub1.outStream.addUShort(16711680,
							Class49.anInt1010);
	Class70_Sub1.outStream.addByte((byte) 4,
							Class74.anInt1485);
    }
    
    public static void method1284(byte arg0) {
	if (arg0 == 26) {
	    aClass67_Sub11_Sub4_3205 = null;
	    anIntArray3201 = null;
	    anIntArrayArrayArray3211 = null;
	    aRSString_3207 = null;
	    anIntArray3191 = null;
	    anIntArray3210 = null;
	}
    }
    
    public static void method1285(int arg0, Class9 arg1, Class9 arg2) {
	try {
	    if (arg0 != -2)
		method1284((byte) 92);
	    Class67_Sub1_Sub19.aClass9_4136 = arg2;
	    anInt3200++;
	    Class86.aClass9_1762 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qj.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1286(byte arg0, boolean arg1) {
	anInt3208++;
	if (!arg1 != !Class11.aBoolean406 && arg0 == -112) {
	    Class11.aBoolean406 = arg1;
	    Class67_Sub5_Sub4_Sub2.method863((byte) 46);
	}
    }
    
    public static void method1287(int arg0, Object arg1, SignLink arg2) {
	do {
	    try {
		anInt3195++;
		if (arg2.anEventQueue930 != null) {
		    for (int i = 0;
			 i < 50 && arg2.anEventQueue930.peekEvent() != null;
			 i++)
			Class67_Sub1_Sub23.method726(-127, 1L);
		    if (arg0 == -3) {
			if (arg1 == null)
			    break;
			arg2.anEventQueue930
			    .postEvent(new ActionEvent(arg1, 1001, "dummy"));
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("qj.B(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ','
						    + (arg2 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1288(int arg0) {
	anInt3203++;
	if ((Class104.anInt2041 ^ 0xffffffff) == -3) {
	    if (((Class136.anInt2486 ^ 0xffffffff)
		 == (RuntimeException_Sub1.anInt2621 ^ 0xffffffff))
		&& ((Class129.anInt2398 ^ 0xffffffff)
		    == (Class67_Sub11_Sub2.anInt4862 ^ 0xffffffff))) {
		Class104.anInt2041 = 0;
		if (Class131_Sub7_Sub2.aBoolean5068
		    && Class131_Sub7.aBooleanArray3698[81]
		    && (Class134.anInt2476 ^ 0xffffffff) < -3)
		    Class67_Sub1_Sub2.method630(2, -2 + Class134.anInt2476);
		else
		    Class67_Sub1_Sub2.method630(2, Class134.anInt2476 - 1);
	    }
	} else if ((Class136.anInt2486 ^ 0xffffffff) != (Class115.anInt2186
							 ^ 0xffffffff)
		   || (Class129.anInt2398 ^ 0xffffffff) != (Class101.anInt1985
							    ^ 0xffffffff)) {
	    Class67_Sub11_Sub2.anInt4862 = Class101.anInt1985;
	    RuntimeException_Sub1.anInt2621 = Class115.anInt2186;
	    Class104.anInt2041 = 2;
	} else {
	    Class104.anInt2041 = 0;
	    if (Class131_Sub7_Sub2.aBoolean5068
		&& Class131_Sub7.aBooleanArray3698[81]
		&& Class134.anInt2476 > 2)
		Class67_Sub1_Sub2.method630(2, Class134.anInt2476 + -2);
	    else
		Class67_Sub1_Sub2.method630(2, Class134.anInt2476 + -1);
	}
	if (arg0 < 112)
	    anIntArrayArrayArray3211 = null;
    }
    
    static {
	anIntArray3191 = new int[14];
	anInt3202 = -1;
    }
}
