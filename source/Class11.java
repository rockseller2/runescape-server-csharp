/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11
{
    public static int anInt405;
    public static boolean aBoolean406;
    public static int anInt407;
    public int anInt408 = 0;
    public static int anInt409 = 1;
    public static Class9 aClass9_410;
    public static int anInt411;
    public static int anInt412;
    public static int anInt413;
    public static int anInt414;
    public static Class120 aClass120_415 = new Class120();
    
    public static void method141(int arg0, int arg1) {
	anInt413++;
	if (Class67_Sub5_Sub15.method977(arg0, false)) {
	    Class7[] class7s = Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0];
	    for (int i = arg1;
		 (i ^ 0xffffffff) > (class7s.length ^ 0xffffffff); i++) {
		Class7 class7 = class7s[i];
		if (class7 != null) {
		    class7.anInt203 = 1;
		    class7.anInt257 = 0;
		    class7.anInt298 = 0;
		}
	    }
	}
    }
    
    public void method142(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) 105);
	    if (i == 0)
		break;
	    method144(i, arg0, 32768);
	}
	if (arg1 != -2196)
	    aClass120_415 = null;
	anInt412++;
    }
    
    public static Class67_Sub5_Sub12 method143(int arg0, int arg1) {
	anInt405++;
	Class67_Sub5_Sub12 class67_sub5_sub12
	    = ((Class67_Sub5_Sub12)
	       Class73.aClass137_1465.method1930(arg1 ^ ~0x37e8f,
						 (long) arg0));
	if (class67_sub5_sub12 != null)
	    return class67_sub5_sub12;
	byte[] is;
	if (arg0 >= 32768)
	    is = Class1.aClass9_98.method138(-809612665, 0x7fff & arg0, 1);
	else
	    is = Class67_Sub1_Sub27.aClass9_4248.method138(-809612665, arg0,
							   1);
	class67_sub5_sub12 = new Class67_Sub5_Sub12();
	if (is != null)
	    class67_sub5_sub12.method950(false, new Stream(is));
	if (arg1 >= (arg0 ^ 0xffffffff))
	    class67_sub5_sub12.method945(false);
	Class73.aClass137_1465.method1932((long) arg0, 0, class67_sub5_sub12);
	return class67_sub5_sub12;
    }
    
    public void method144(int arg0, Stream arg1, int arg2) {
	if (arg2 != 32768)
	    anInt409 = 18;
	anInt411++;
	if ((arg0 ^ 0xffffffff) == -6)
	    anInt408 = arg1.readUShort(-2386);
    }
    
    public static void method145(int arg0) {
	aClass120_415 = null;
	aClass9_410 = null;
	if (arg0 != 0)
	    method145(-99);
    }
    
    public static void method146(int arg0, byte arg1) {
	if (ObjectDef.aByteArrayArrayArray3518 == null)
	    ObjectDef.aByteArrayArrayArray3518 = new byte[4][104][104];
	for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
	    for (int i_0_ = 0; i_0_ < 104; i_0_++) {
		for (int i_1_ = 0; i_1_ < 104; i_1_++)
		    ObjectDef.aByteArrayArrayArray3518[i][i_0_][i_1_]
			= arg1;
	    }
	}
	anInt414++;
	int i = 25 / ((-19 - arg0) / 44);
    }
}
