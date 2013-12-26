/* Class67_Sub5_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

public class Class67_Sub5_Sub14 extends Class67_Sub5
{
    public static Class67_Sub5_Sub7[] aClass67_Sub5_Sub7Array4731
	= new Class67_Sub5_Sub7[14];
    public static RSString aRSString_4732;
    public static int anInt4733;
    public static int anInt4734;
    public static int anInt4735;
    public static int anInt4736;
    public static RSString aRSString_4737
	= Class134.method1914("<col=ffff00>", (byte) 51);
    public int anInt4738 = 0;
    public static int anInt4739;
    public static RSString aRSString_4740;
    public static int anInt4741;
    public static int anInt4742;
    public static int anInt4743;
    public static RSString aRSString_4744;
    public static int anInt4745;
    public static boolean aBoolean4746;
    public static RSString aRSString_4747;
    
    public void method967(byte arg0, Stream arg1) {
	anInt4739++;
	if (arg0 <= 99)
	    anInt4733 = -31;
	for (;;) {
	    int i = arg1.readByte((byte) -105);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method974((byte) -75, i, arg1);
	}
    }
    
    public static void method968(int arg0) {
	for (int i = 0; (i ^ 0xffffffff) > -101; i++)
	    OutputStream_Sub1.aBooleanArray96[i] = true;
	anInt4742++;
	int i = -14 / ((-20 - arg0) / 50);
    }
    
    public static void method969(int arg0, byte arg1) {
	int i = 32 % ((arg1 - 28) / 51);
	anInt4736++;
	Class8.aClass136_343.method1920(arg0, 73);
    }
    
    public static void method970(int arg0) {
	aClass67_Sub5_Sub7Array4731 = null;
	if (arg0 == 1389) {
	    aRSString_4732 = null;
	    aRSString_4740 = null;
	    aRSString_4744 = null;
	    aRSString_4747 = null;
	    aRSString_4737 = null;
	}
    }
    
    public static void method971(int arg0, int arg1) {
	anInt4734++;
	Class67_Sub5_Sub5.aClass136_4515.method1920(arg0, 114);
	Class33_Sub2.aClass136_2778.method1920(arg0, 77);
	if (arg1 != -29406)
	    anInt4733 = -17;
    }
    
    public static Class7 method972(int arg0, int arg1, int arg2) {
	anInt4741++;
	Class7 class7 = Class3.method69((byte) 110, arg2);
	if (arg0 == -1)
	    return class7;
	if (arg1 != 18062)
	    aRSString_4740 = null;
	if (class7 == null || class7.aClass7Array228 == null
	    || class7.aClass7Array228.length <= arg0)
	    return null;
	return class7.aClass7Array228[arg0];
    }
    
    public static void method973(byte arg0, Component arg1) {
	anInt4743++;
	Method method = SignLink.aMethod944;
	if (arg0 != 112)
	    aRSString_4747 = null;
	if (method != null) {
	    try {
		method.invoke(arg1, new Object[] { Boolean.FALSE });
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	arg1.addKeyListener(Class81.aClass134_1648);
	arg1.addFocusListener(Class81.aClass134_1648);
    }
    
    public void method974(byte arg0, int arg1, Stream arg2) {
	if (arg1 == 2)
	    anInt4738 = arg2.readUShort(-2386);
	anInt4745++;
	if (arg0 > -71)
	    method969(23, (byte) -69);
    }
    
    static {
	aRSString_4732
	    = Class134.method1914(" from your ignore list first)3", (byte) 19);
	aRSString_4740 = aRSString_4732;
	aRSString_4744 = Class134.method1914(" has logged in)3", (byte) 113);
	aBoolean4746 = false;
	aRSString_4747 = aRSString_4744;
    }
}
