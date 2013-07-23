/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub1 extends Class55
{
    public static int anInt2785;
    public static int anInt2786;
    public static int anInt2787;
    public static RSString aRSString_2788;
    public static short aShort2789;
    public static int anInt2790;
    public static int anInt2791;
    public static RSString aRSString_2792
	= Class134.method1914("p11_full", (byte) 79);
    public static RSString aRSString_2793;
    public static int anInt2794;
    public static int anInt2795;
    public static Class92 aClass92_2796;
    
    public static void method463(boolean arg0, RSString arg1) {
	anInt2786++;
	Class101.aRSString_1991 = arg1;
	if (Class124.aSignLink_2335.anApplet940 != null && arg0 == false) {
	    try {
		RSString RSString
		    = Class47.aRSString_958.method523((Class124.aSignLink_2335
						      .anApplet940),
						     31365);
		RSString RSString_0_
		    = ObjectDef.aRSString_3522.method523((Class124
							     .aSignLink_2335
							     .anApplet940),
							    31365);
		RSString RSString_1_
		    = (Class67_Sub1_Sub27.method744
		       (new RSString[] { RSString,
					Class67_Sub5_Sub8.aRSString_4584, arg1,
					Class51.aRSString_1039, RSString_0_ },
			-104));
		if ((arg1.method531((byte) 63) ^ 0xffffffff) != -1)
		    RSString_1_
			= (Class67_Sub1_Sub27.method744
			   ((new RSString[]
			     { RSString_1_, Class19.aRSString_491,
			       Class50.method438(0,
						 (94608000000L
						  + Class39.method337(19644))),
			       Class72.aRSString_1449,
			       Class102.method1548(-1, 94608000L) }),
			    -112));
		else
		    RSString_1_
			= Class67_Sub1_Sub27.method744((new RSString[]
							{ RSString_1_,
							  (Class90
							   .aRSString_1841) }),
						       -127);
		Class67_Sub1_Sub27.method744
		    (new RSString[] { Class67_Sub1_Sub3.aRSString_3850,
				     RSString_1_,
				     Class67_Sub5_Sub4.aRSString_4503 },
		     -124)
		    .method527(Class124.aSignLink_2335.anApplet940, -23731);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    public static int method464(int arg0) {
	int i = 112 / ((arg0 - 34) / 62);
	anInt2787++;
	if ((double) Class131.aFloat2430 == 3.0)
	    return 37;
	if ((double) Class131.aFloat2430 == 4.0)
	    return 50;
	if ((double) Class131.aFloat2430 == 6.0)
	    return 75;
	if ((double) Class131.aFloat2430 == 8.0)
	    return 100;
	return 200;
    }
    
    public static byte[] method465(byte[] arg0, int arg1) {
	anInt2794++;
	int i = arg0.length;
	byte[] is = new byte[i];
	Class17.method185(arg0, arg1, is, 0, i);
	return is;
    }
    
    public static RSString method466(int arg0, Class7 arg1) {
	if (arg0 != 320)
	    aShort2789 = (short) -60;
	anInt2795++;
	if ((client.method31(arg1).method1225(-1) ^ 0xffffffff) == -1)
	    return null;
	if (arg1.aRSString_191 == null
	    || (arg1.aRSString_191.method515(32).method531((byte) 109)
		^ 0xffffffff) == -1) {
	    if (Class128.aBoolean2377)
		return Class67_Sub1.aRSString_2832;
	    return null;
	}
	return arg1.aRSString_191;
    }
    
    public static void method467(int arg0) {
	aClass92_2796 = null;
	aRSString_2792 = null;
	aRSString_2793 = null;
	if (arg0 < 118)
	    aRSString_2792 = null;
	aRSString_2788 = null;
    }
    
    public static Class67_Sub5_Sub19_Sub1 method468(int arg0, Class9 arg1,
						    boolean arg2, int arg3) {
	if (arg2 != false)
	    return null;
	anInt2785++;
	if (!Class64.method575((byte) -77, arg0, arg3, arg1))
	    return null;
	return Class104.method1561(255);
    }
    
    static {
	aShort2789 = (short) 320;
	aRSString_2793 = Class134.method1914("http:)4)4", (byte) 74);
	aRSString_2788 = Class134.method1914("hitbar_default", (byte) 30);
	anInt2790 = 0;
    }
}
