public class Class18 implements Interface4
{
    public static RSString aRSString_2727;
    public static RSString aRSString_2728
	= Class134.method1914("Module texte charg-B", (byte) 53);
    public static int anInt2729;
    public static Class136 aClass136_2730;
    public static int anInt2731;
    public static int[] anIntArray2732;
    
    public RSString method14(byte arg0, long arg1, int arg2, int[] arg3) {
	try {
	    anInt2731++;
	    if ((arg2 ^ 0xffffffff) == -1) {
		Class67_Sub5_Sub8 class67_sub5_sub8
		    = Class126_Sub4.method1723(arg3[0], (byte) -122);
		return class67_sub5_sub8.method892(77, (int) arg1);
	    }
	    if (arg0 >= -32)
		aClass136_2730 = null;
	    if (arg2 == 1 || (arg2 ^ 0xffffffff) == -11) {
		Class76 class76 = PacketParser.method1596((int) arg1, -28322);
		return class76.itemName;
	    }
	    if ((arg2 ^ 0xffffffff) == -7 || arg2 == 7 || arg2 == 11)
		return Class126_Sub4.method1723(arg3[0], (byte) -119)
			   .method892(112, (int) arg1);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("cd.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method186(byte arg0) {
	if (arg0 == 42) {
	    aRSString_2727 = null;
	    aRSString_2728 = null;
	    aClass136_2730 = null;
	    anIntArray2732 = null;
	}
    }
    
    static {
	aRSString_2727 = Class134.method1914(")2", (byte) 89);
	aClass136_2730 = new Class136(64);
	anIntArray2732 = new int[5];
    }
}
