/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class99
{
    public static int anInt1954;
    public Image anImage1955;
    public static int anInt1956;
    public static int anInt1957;
    public int anInt1958;
    public static RSString aRSString_1959
	= (Class134.method1914
	   ("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3",
	    (byte) 45));
    public static byte[][] aByteArrayArray1960;
    public static int anInt1961;
    public int anInt1962;
    public static int anInt1963;
    public static int anInt1964 = 0;
    public static int anInt1965;
    public static int[] anIntArray1966 = new int[1000];
    public int[] anIntArray1967;
    
    public abstract void method1518(int i, int i_0_, int i_1_,
				    Graphics graphics);
    
    public static Class67_Sub5_Sub19[] method1519(int arg0, Class9 arg1,
						  byte arg2, int arg3) {
	try {
	    anInt1957++;
	    if (!Class64.method575((byte) 122, arg0, arg3, arg1))
		return null;
	    if (arg2 < 43)
		method1523(74);
	    return Class96.method1504((byte) -62);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("oh.M(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public abstract void method1520(int i, int i_2_, Component component,
				    byte i_3_);
    
    public static void method1521(boolean arg0, int arg1) {
	try {
	    for (Class67_Sub10 class67_sub10
		     = (Class67_Sub10) Class92.aClass50_1868.method445(0);
		 class67_sub10 != null;
		 class67_sub10
		     = (Class67_Sub10) Class92.aClass50_1868.method432(0)) {
		if (class67_sub10.aClass67_Sub11_Sub3_2994 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(class67_sub10.aClass67_Sub11_Sub3_2994);
		    class67_sub10.aClass67_Sub11_Sub3_2994 = null;
		}
		if (class67_sub10.aClass67_Sub11_Sub3_3004 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(class67_sub10.aClass67_Sub11_Sub3_3004);
		    class67_sub10.aClass67_Sub11_Sub3_3004 = null;
		}
		class67_sub10.method606((byte) -118);
	    }
	    if (arg0) {
		for (Class67_Sub10 class67_sub10
			 = ((Class67_Sub10)
			    Class67_Sub10.aClass50_2987.method445(0));
		     class67_sub10 != null;
		     class67_sub10
			 = ((Class67_Sub10)
			    Class67_Sub10.aClass50_2987.method432(0))) {
		    if (class67_sub10.aClass67_Sub11_Sub3_2994 != null) {
			Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145.method1133
			    (class67_sub10.aClass67_Sub11_Sub3_2994);
			class67_sub10.aClass67_Sub11_Sub3_2994 = null;
		    }
		    class67_sub10.method606((byte) -118);
		}
		for (Class67_Sub10 class67_sub10
			 = ((Class67_Sub10)
			    Class67_Sub12.aClass92_3036.method1483((byte) 89));
		     class67_sub10 != null;
		     class67_sub10
			 = ((Class67_Sub10)
			    Class67_Sub12.aClass92_3036.method1480(11))) {
		    if (class67_sub10.aClass67_Sub11_Sub3_2994 != null) {
			Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145.method1133
			    (class67_sub10.aClass67_Sub11_Sub3_2994);
			class67_sub10.aClass67_Sub11_Sub3_2994 = null;
		    }
		    class67_sub10.method606((byte) -118);
		}
	    }
	    if (arg1 == 24077)
		anInt1961++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("oh.O(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public abstract void method1522(byte i, int i_4_, int i_5_, int i_6_,
				    int i_7_, Graphics graphics);
    
    public static void method1523(int arg0) {
	try {
	    anIntArray1966 = null;
	    aByteArrayArray1960 = null;
	    if (arg0 != 1000)
		aRSString_1959 = null;
	    aRSString_1959 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "oh.L(" + arg0 + ')');
	}
    }
    
    public void method1524(int arg0) {
	try {
	    anInt1965++;
	    if (arg0 != 0)
		aByteArrayArray1960 = null;
	    Class121.method1684(anIntArray1967, anInt1962, anInt1958);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "oh.N(" + arg0 + ')');
	}
    }
}
