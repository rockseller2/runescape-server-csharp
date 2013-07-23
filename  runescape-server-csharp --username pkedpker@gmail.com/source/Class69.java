/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class69
{
    public static int anInt1379;
    public static Class67_Sub25[] aClass67_Sub25Array1380;
    public static int anInt1381 = 0;
    public static RSString aRSString_1382
	= Class134.method1914("www", (byte) 124);
    public static int anInt1383 = -1;
    public static Class9 aClass9_1384;
    public static int anInt1385;
    public static int anInt1386;
    public static int anInt1387;
    public static int[] anIntArray1388 = new int[14];
    public static int anInt1389;
    public static RSString aRSString_1390
	= Class134.method1914("Stufe: ", (byte) 119);
    
    public static int method1323(Class9 arg0, int arg1) {
	anInt1385++;
	int i = 0;
	if (arg1 < 109)
	    aRSString_1390 = null;
	if (arg0.method132(Class37.anInt791, true))
	    i++;
	if (arg0.method132(Class24.anInt578, true))
	    i++;
	return i;
    }
    
    public static void method1324(boolean arg0) {
	aClass9_1384 = null;
	aRSString_1390 = null;
	if (arg0 != false)
	    method1324(true);
	anIntArray1388 = null;
	aRSString_1382 = null;
	aClass67_Sub25Array1380 = null;
    }
    
    public static Class139 method1325(int arg0, int arg1) {
	anInt1387++;
	Class139 class139
	    = ((Class139)
	       Class67_Sub10.aClass136_3015.method1924((long) arg0, false));
	if (class139 != null)
	    return class139;
	int i = 41 % ((arg1 - -60) / 63);
	byte[] is = Class67_Sub10.aClass9_3016.method138(-809612665, arg0, 4);
	class139 = new Class139();
	if (is != null)
	    class139.method1938(new Stream(is), (byte) 103, arg0);
	Class67_Sub10.aClass136_3015.method1926((long) arg0, class139,
						(byte) -71);
	return class139;
    }
    
    public static void method1326(int arg0, long arg1) {
	try {
	    anInt1379++;
	    if (arg1 != (long) arg0) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (Class90.anInt1847 ^ 0xffffffff);
		     i++) {
		    if ((Class103.aLongArray2025[i] ^ 0xffffffffffffffffL)
			== (arg1 ^ 0xffffffffffffffffL)) {
			Class90.anInt1847--;
			for (int i_0_ = i; ((Class90.anInt1847 ^ 0xffffffff)
					    < (i_0_ ^ 0xffffffff)); i_0_++) {
			    Class103.aLongArray2025[i_0_]
				= Class103.aLongArray2025[1 + i_0_];
			    Class126_Sub3.aRSStringArray3445[i_0_]
				= Class126_Sub3.aRSStringArray3445[i_0_ - -1];
			}
			InputStream_Sub1.anInt73++;
			Class128.anInt2376 = Class11.anInt409;
			Class70_Sub1.outStream.createFrame(2, 213);	//DELETE_IGNORE
			Class70_Sub1.outStream.writeLong(2, arg1);
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("jl.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
