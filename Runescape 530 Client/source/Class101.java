/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101
{
    public static int anInt1981;
    public int anInt1982 = 0;
    public static int anInt1983;
    public static int anInt1984 = 0;
    public static int anInt1985 = 0;
    public static int anInt1986;
    public Class92 aClass92_1987;
    public static int anInt1988;
    public static int anInt1989 = 0;
    public static int anInt1990;
    public static RSString aRSString_1991 = null;
    public static int anInt1992;
    public Class67 aClass67_1993;
    
    public static void method1540(boolean arg0) {
	anInt1988++;
	for (int i = -1; Class67_Sub1_Sub4.anInt3855 > i; i++) {
	    int i_0_;
	    if ((i ^ 0xffffffff) != 0)
		i_0_ = Class3.anIntArray120[i];
	    else
		i_0_ = 2047;
	    Class131_Sub7_Sub2 class131_sub7_sub2
		= Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_0_];
	    if (class131_sub7_sub2 != null
		&& class131_sub7_sub2.anInt3773 > 0) {
		class131_sub7_sub2.anInt3773--;
		if ((class131_sub7_sub2.anInt3773 ^ 0xffffffff) == -1)
		    class131_sub7_sub2.aRSString_3723 = null;
	    }
	}
	for (int i = 0; i < Class37.anInt794; i++) {
	    int i_1_ = Class47.anIntArray965[i];
	    Class131_Sub7_Sub1 class131_sub7_sub1
		= Class128.aClass131_Sub7_Sub1Array2386[i_1_];
	    if (class131_sub7_sub1 != null
		&& (class131_sub7_sub1.anInt3773 ^ 0xffffffff) < -1) {
		class131_sub7_sub1.anInt3773--;
		if ((class131_sub7_sub1.anInt3773 ^ 0xffffffff) == -1)
		    class131_sub7_sub1.aRSString_3723 = null;
	    }
	}
	if (arg0 != false)
	    method1541(null, null, null, 29);
    }
    
    public static String method1541(String arg0, String arg1, String arg2,
				    int arg3) {
	anInt1986++;
	if (arg3 >= -83)
	    return null;
	for (int i = arg2.indexOf(arg1); i != -1;
	     i = arg2.indexOf(arg1, arg0.length() + i))
	    arg2 = (arg2.substring(0, i) + arg0
		    + arg2.substring(arg1.length() + i));
	return arg2;
    }
    
    public Class67 method1542(int arg0) {
	anInt1981++;
	if (anInt1982 > 0 && (aClass92_1987.aClass67Array1872[-1 + anInt1982]
			      != aClass67_1993)) {
	    Class67 class67 = aClass67_1993;
	    aClass67_1993 = class67.aClass67_1340;
	    return class67;
	}
	while ((aClass92_1987.anInt1863 ^ 0xffffffff)
	       < (anInt1982 ^ 0xffffffff)) {
	    Class67 class67
		= aClass92_1987.aClass67Array1872[anInt1982++].aClass67_1340;
	    if (class67 != aClass92_1987.aClass67Array1872[-1 + anInt1982]) {
		aClass67_1993 = class67.aClass67_1340;
		return class67;
	    }
	}
	if (arg0 != 15035)
	    anInt1985 = 52;
	return null;
    }
    
    public static void method1543(byte arg0) {
	Class8.aClass136_343.method1921((byte) -92);
	if (arg0 > 74)
	    anInt1992++;
    }
    
    public static void method1544(boolean arg0) {
	if (arg0 == false)
	    aRSString_1991 = null;
    }
    
    public Class67 method1545(int arg0) {
	anInt1982 = 0;
	anInt1983++;
	if (arg0 != -1)
	    method1545(32);
	return method1542(arg0 ^ ~0x3abb);
    }
    
    public Class101(Class92 arg0) {
	aClass92_1987 = arg0;
    }
}
