/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class104
{
    public int anInt2031;
    public static int anInt2032;
    public static short[][] aShortArrayArray2033
	= { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
	      2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571,
	      908, 21830, 28946, -15701, -14010 },
	    { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153,
	      -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	    { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
	      10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	    { 4626, 11146, 6439, 12, 4758, 10270 },
	    { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    public Class131 aClass131_2034;
    public long aLong2035;
    public static RSString aRSString_2036 = Class134.method1914(" ", (byte) 61);
    public int anInt2037;
    public static int anInt2038;
    public static int anInt2039;
    public static RSString aRSString_2040
	= Class134.method1914(")3)3)3", (byte) 21);
    public static int anInt2041 = 0;
    public int anInt2042;
    
    public static void method1560(int arg0) {
	anInt2039++;
	if (arg0 <= 37)
	    method1562(5);
	for (Class67_Sub5_Sub18 class67_sub5_sub18
		 = (Class67_Sub5_Sub18) Class20.aClass50_503.method445(0);
	     class67_sub5_sub18 != null;
	     class67_sub5_sub18
		 = (Class67_Sub5_Sub18) Class20.aClass50_503.method432(0)) {
	    Class131_Sub3 class131_sub3
		= class67_sub5_sub18.aClass131_Sub3_4807;
	    if ((Canvas_Sub1.anInt59 ^ 0xffffffff) == (class131_sub3.anInt3627
						       ^ 0xffffffff)
		&& ((class131_sub3.anInt3601 ^ 0xffffffff)
		    <= (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff))) {
		if (Class67_Sub1_Sub9.anInt3952 >= class131_sub3.anInt3626) {
		    if (class131_sub3.anInt3599 > 0) {
			Class131_Sub7_Sub1 class131_sub7_sub1
			    = (Class128.aClass131_Sub7_Sub1Array2386
			       [-1 + class131_sub3.anInt3599]);
			if (class131_sub7_sub1 != null
			    && ((class131_sub7_sub1.anInt3733 ^ 0xffffffff)
				<= -1)
			    && ((class131_sub7_sub1.anInt3733 ^ 0xffffffff)
				> -13313)
			    && class131_sub7_sub1.anInt3726 >= 0
			    && ((class131_sub7_sub1.anInt3726 ^ 0xffffffff)
				> -13313))
			    class131_sub3.method1811
				((byte) -85, class131_sub7_sub1.anInt3733,
				 ((Class131_Sub5.method1826
				   (class131_sub3.anInt3627,
				    class131_sub7_sub1.anInt3733,
				    class131_sub7_sub1.anInt3726, (byte) -51))
				  + -class131_sub3.anInt3625),
				 class131_sub7_sub1.anInt3726,
				 Class67_Sub1_Sub9.anInt3952);
		    }
		    if (class131_sub3.anInt3599 < 0) {
			int i = -class131_sub3.anInt3599 - 1;
			Class131_Sub7_Sub2 class131_sub7_sub2;
			if ((Class67_Sub17.anInt3102 ^ 0xffffffff)
			    != (i ^ 0xffffffff))
			    class131_sub7_sub2
				= (Class67_Sub5_Sub18
				   .aClass131_Sub7_Sub2Array4810[i]);
			else
			    class131_sub7_sub2
				= Class122.aClass131_Sub7_Sub2_2309;
			if (class131_sub7_sub2 != null
			    && class131_sub7_sub2.anInt3733 >= 0
			    && ((class131_sub7_sub2.anInt3733 ^ 0xffffffff)
				> -13313)
			    && ((class131_sub7_sub2.anInt3726 ^ 0xffffffff)
				<= -1)
			    && class131_sub7_sub2.anInt3726 < 13312)
			    class131_sub3.method1811
				((byte) -117, class131_sub7_sub2.anInt3733,
				 ((Class131_Sub5.method1826
				   (class131_sub3.anInt3627,
				    class131_sub7_sub2.anInt3733,
				    class131_sub7_sub2.anInt3726, (byte) 121))
				  + -class131_sub3.anInt3625),
				 class131_sub7_sub2.anInt3726,
				 Class67_Sub1_Sub9.anInt3952);
		    }
		    class131_sub3.method1807((byte) 28, RSString.anInt2642);
		    Class131_Sub7.method1885(Canvas_Sub1.anInt59,
					     (int) class131_sub3.aDouble3620,
					     (int) class131_sub3.aDouble3602,
					     (int) class131_sub3.aDouble3617,
					     60, class131_sub3,
					     class131_sub3.anInt3595, -1L,
					     false);
		}
	    } else
		class67_sub5_sub18.method606((byte) -118);
	}
    }
    
    public static Class67_Sub5_Sub19_Sub1 method1561(int arg0) {
	anInt2032++;
	byte[] is = Class67_Sub1_Sub35.aByteArrayArray4357[0];
	int i = (Class67_Sub5_Sub4.anIntArray4510[0]
		 * Class55_Sub3.anIntArray2810[0]);
	if (arg0 != 255)
	    return null;
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1;
	if (!Class67_Sub3.aBooleanArray2847[0]) {
	    int[] is_0_ = new int[i];
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++)
		is_0_[i_1_]
		    = Class73.anIntArray1462[Class75.method1379(is[i_1_],
								255)];
	    class67_sub5_sub19_sub1
		= new Class67_Sub5_Sub19_Sub1(Class3.anInt119,
					      Class80.anInt1628,
					      Class67_Sub23.anIntArray3201[0],
					      Class67_Sub6.anIntArray2870[0],
					      Class55_Sub3.anIntArray2810[0],
					      (Class67_Sub5_Sub4.anIntArray4510
					       [0]),
					      is_0_);
	} else {
	    int[] is_2_ = new int[i];
	    byte[] is_3_ = Class120.aByteArrayArray2268[0];
	    for (int i_4_ = 0; i > i_4_; i_4_++)
		is_2_[i_4_]
		    = Class67_Sub20.method1273((Class73.anIntArray1462
						[Class75.method1379(is[i_4_],
								    255)]),
					       (Class75.method1379(is_3_[i_4_],
								   255)
						<< 168664600));
	    class67_sub5_sub19_sub1
		= (new Class67_Sub5_Sub19_Sub1_Sub1
		   (Class3.anInt119, Class80.anInt1628,
		    Class67_Sub23.anIntArray3201[0],
		    Class67_Sub6.anIntArray2870[0],
		    Class55_Sub3.anIntArray2810[0],
		    Class67_Sub5_Sub4.anIntArray4510[0], is_2_));
	}
	Class67_Sub5_Sub11.method937(false);
	return class67_sub5_sub19_sub1;
    }
    
    public static void method1562(int arg0) {
	aShortArrayArray2033 = null;
	if (arg0 != 11146)
	    aShortArrayArray2033 = null;
	aRSString_2036 = null;
	aRSString_2040 = null;
    }
    
    public static void method1563(Throwable arg0, String arg1, int arg2) {
	anInt2038++;
	try {
	    String string = "";
	    if (arg0 != null)
		string = Class128.method1733((byte) 7, arg0);
	    if (arg1 != null) {
		if (arg0 != null)
		    string += " | ";
		string += (String) arg1;
	    }
	    Class67_Sub8.method1105(string, arg2 + -11069);
	    string = Class101.method1541("%3a", ":", string, arg2 + -93);
	    string = Class101.method1541("%40", "@", string, -104);
	    string = Class101.method1541("%26", "&", string, arg2 ^ ~0x6a);
	    string = Class101.method1541("%23", "#", string, arg2 ^ ~0x6a);
	    if (Class16.aSignLink_475.anApplet940 == null)
		return;
	    Class31 class31
		= (Class16.aSignLink_475.method394
		   (102,
		    new URL(Class16.aSignLink_475.anApplet940.getCodeBase(),
			    ("clienterror.ws?c=" + Class86.anInt1761 + "&u="
			     + Class119.aLong2248 + "&v1=" + SignLink.aString941
			     + "&v2=" + SignLink.aString936 + "&e="
			     + string))));
	    while (class31.anInt706 == 0)
		Class67_Sub1_Sub23.method726(-128, 1L);
	    if ((class31.anInt706 ^ 0xffffffff) == -2) {
		DataInputStream datainputstream
		    = (DataInputStream) class31.anObject705;
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	if (arg2 != 1)
	    aShortArrayArray2033 = null;
    }
}
