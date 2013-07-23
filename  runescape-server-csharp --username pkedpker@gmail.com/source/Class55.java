/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55
{
    public static int anInt1084;
    public static int anInt1085 = 0;
    public static int anInt1086;
    public static RSString aRSString_1087;
    public static RSString aRSString_1088
	= Class134.method1914("::clientdrop", (byte) 15);
    public static Class7 aClass7_1089;
    public static RSString aRSString_1090;
    public static int anInt1091;
    
    public static void method461(int arg0) {
	if (arg0 != 906)
	    aRSString_1087 = null;
	aClass7_1089 = null;
	aRSString_1088 = null;
	aRSString_1087 = null;
	aRSString_1090 = null;
    }
    
    public static void method462(boolean arg0) {
	Class55_Sub2.anInt2805 = 0;
	Class67_Sub1_Sub16.anInt4073 = -1;
	Class67_Sub1_Sub13.anInt4019 = 0;
	Class134.anInt2476 = 0;
	Class70_Sub1.outStream.currentOffset = 0;
	Class67_Sub1_Sub20.packetType = -1;
	if (arg0 == true) {
	    Class67_Sub9.aBoolean2980 = false;
	    Class144.anInt2596 = 0;
	    Class33_Sub2.mapFlag = 0;
	    Class54.aPacketStream_1069.currentOffset = 0;
	    anInt1091++;
	    Class67_Sub1_Sub5.anInt3875 = -1;
	    Class55_Sub3.anInt2815 = -1;
	    Class67_Sub5_Sub1.lastPacketSize = 0;
	    for (int i = 0;
		 ((Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810.length
		   ^ 0xffffffff)
		  < (i ^ 0xffffffff));
		 i++) {
		if (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i] != null)
		    Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i]
			.anInt3785
			= -1;
	    }
	    for (int i = 0; i < Class128.aClass131_Sub7_Sub1Array2386.length;
		 i++) {
		if (Class128.aClass131_Sub7_Sub1Array2386[i] != null)
		    Class128.aClass131_Sub7_Sub1Array2386[i].anInt3785 = -1;
	    }
	    Class99_Sub1.method1526(118);
	    Class22.anInt530 = 1;
	    Class40.method348(-11461, 30);
	    for (int i = 0; (i ^ 0xffffffff) > -101; i++)
		OutputStream_Sub1.aBooleanArray96[i] = true;
	    Class67_Sub23.method1283((byte) -119);
	}
    }
    
    static {
	aRSString_1087 = Class134.method1914("Poser", (byte) 75);
	aRSString_1090 = null;
	anInt1084 = -1;
    }
}
