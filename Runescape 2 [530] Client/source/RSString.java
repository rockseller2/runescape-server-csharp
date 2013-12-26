/* RSString - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

public class RSString implements Interface2
{
    public static int anInt2627;
    public static int anInt2628;
    public int anInt2629;
    public static int anInt2630;
    public static int anInt2631;
    public static int anInt2632;
    public static int anInt2633;
    public static int anInt2634;
    public static int anInt2635;
    public static int anInt2636;
    public static int anInt2637;
    public static int anInt2638;
    public static int anInt2639;
    public static int anInt2640;
    public static int anInt2641;
    public static int anInt2642;
    public static int anInt2643;
    public static int anInt2644;
    public static int anInt2645;
    public static int anInt2646;
    public static int anInt2647;
    public static int anInt2648;
    public static int[] anIntArray2649 = new int[128];
    public static int anInt2650;
    public static int anInt2651;
    public static int anInt2652;
    public byte[] aByteArray2653;
    public static int anInt2654;
    public static int anInt2655;
    public static int anInt2656;
    public boolean aBoolean2657 = true;
    public static int anInt2658;
    public static int anInt2659;
    public static int anInt2660;
    public static int anInt2661;
    public static int anInt2662;
    public static RSString aRSString_2663;
    public static int anInt2664;
    public static int anInt2665;
    public static int anInt2666;
    public static int anInt2667;
    public static int anInt2668;
    public static int anInt2669;
    public static int anInt2670;
    public static int anInt2671;
    public static int anInt2672;
    public static int anInt2673;
    public static int anInt2674;
    public static int anInt2675;
    public static int anInt2676;
    public static int anInt2677;
    public static int anInt2678;
    public static int anInt2679;
    public static RSString aRSString_2680;
    public static int anInt2681;
    public static int anInt2682;
    public static int anInt2683;
    public static int anInt2684;
    public static int anInt2685;
    public static int anInt2686;
    public static int anInt2687;
    public static int anInt2688;
    /*synthetic*/ public static Class aClass2689;
    
    public RSString[] method494(int arg0, int arg1) {
	anInt2638++;
	int i = 0;
	if (arg1 < 42)
	    return null;
	for (int i_0_ = 0; i_0_ < anInt2629; i_0_++) {
	    if ((arg0 ^ 0xffffffff) == (aByteArray2653[i_0_] ^ 0xffffffff))
		i++;
	}
	RSString[] RSStrings = new RSString[1 + i];
	if ((i ^ 0xffffffff) == -1) {
	    RSStrings[0] = this;
	    return RSStrings;
	}
	int i_1_ = 0;
	int i_2_ = 0;
	for (int i_3_ = 0; i > i_3_; i_3_++) {
	    int i_4_;
	    for (i_4_ = 0; ((aByteArray2653[i_4_ + i_1_] ^ 0xffffffff)
			    != (arg0 ^ 0xffffffff)); i_4_++) {
		/* empty */
	    }
	    RSStrings[i_2_++] = method502(i_1_, -5975, i_1_ + i_4_);
	    i_1_ += 1 + i_4_;
	}
	RSStrings[i] = method502(i_1_, -5975, anInt2629);
	return RSStrings;
    }
    
    public RSString method495(byte arg0) {
	RSString RSString = new RSString();
	if (arg0 != 92)
	    return null;
	RSString.anInt2629 = anInt2629;
	RSString.aByteArray2653 = new byte[RSString.anInt2629];
	anInt2682++;
	for (int i = 0; anInt2629 > i; i++)
	    RSString.aByteArray2653[-1 + (-i + anInt2629)] = aByteArray2653[i];
	return RSString;
    }
    
    public RSString method496(int arg0) {
	anInt2634++;
	RSString RSString = new RSString();
	RSString.anInt2629 = anInt2629;
	RSString.aByteArray2653 = new byte[anInt2629];
	for (int i = 0; (anInt2629 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    byte i_5_ = aByteArray2653[i];
	    if ((i_5_ ^ 0xffffffff) <= -66 && (i_5_ ^ 0xffffffff) >= -91
		|| (i_5_ >= -64 && (i_5_ ^ 0xffffffff) >= 33
		    && (i_5_ ^ 0xffffffff) != 40))
		i_5_ += 32;
	    RSString.aByteArray2653[i] = i_5_;
	}
	if (arg0 != 8238)
	    aByteArray2653 = null;
	return RSString;
    }
    
    public int method497(byte arg0, FontMetrics arg1) {
	int i = -124 / ((-42 - arg0) / 54);
	anInt2652++;
	String string;
	try {
	    string = new String(aByteArray2653, 0, anInt2629, "ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
	    string = new String(aByteArray2653, 0, anInt2629);
	}
	return arg1.stringWidth(string);
    }
    
    public static void method498(Class9 arg0, byte arg1, Class9 arg2) {
	try {
	    Class67_Sub24.aClass9_3245 = arg0;
	    anInt2640++;
	    if (arg1 <= 48)
		method525(25, 112, 23);
	    Class107.aClass9_2068 = arg2;
	    Class131_Sub5.anInt3664
		= Class67_Sub24.aClass9_3245.method135(3, -105);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("id.AB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int method499(int arg0, int arg1) {
	int i = -2 / ((arg1 - 64) / 45);
	anInt2631++;
	return aByteArray2653[arg0] & 0xff;
    }
    
    public RSString method500(int arg0) {
	boolean bool = true;
	anInt2660++;
	RSString RSString = new RSString();
	RSString.anInt2629 = anInt2629;
	RSString.aByteArray2653 = new byte[anInt2629];
	for (int i = arg0; anInt2629 > i; i++) {
	    byte i_6_ = aByteArray2653[i];
	    if ((i_6_ ^ 0xffffffff) == -96) {
		RSString.aByteArray2653[i] = (byte) 32;
		bool = true;
	    } else if (i_6_ < 97 || i_6_ > 122 || !bool) {
		bool = false;
		RSString.aByteArray2653[i] = i_6_;
	    } else {
		bool = false;
		RSString.aByteArray2653[i] = (byte) (-32 + i_6_);
	    }
	}
	return RSString;
    }
    
    public long method501(byte arg0) {
	anInt2656++;
	long l = 0L;
	int i = 0;
	if (arg0 != -16)
	    aByteArray2653 = null;
	for (/**/; i < anInt2629; i++) {
	    if ((i ^ 0xffffffff) <= -13)
		break;
	    l *= 37L;
	    byte i_7_ = aByteArray2653[i];
	    if (i_7_ >= 65 && i_7_ <= 90)
		l += (long) (-65 + (1 + i_7_));
	    else if (i_7_ >= 97 && i_7_ <= 122)
		l += (long) (-97 + i_7_ + 1);
	    else if ((i_7_ ^ 0xffffffff) <= -49 && i_7_ <= 57)
		l += (long) (-48 + (27 + i_7_));
	}
	for (/**/; l % 37L == 0L && (l ^ 0xffffffffffffffffL) != -1L;
	     l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public RSString method502(int arg0, int arg1, int arg2) {
	anInt2630++;
	if (arg1 != -5975)
	    anInt2642 = -67;
	RSString RSString = new RSString();
	RSString.aByteArray2653 = new byte[arg2 + -arg0];
	RSString.anInt2629 = -arg0 + arg2;
	Class17.method185(aByteArray2653, arg0, RSString.aByteArray2653, 0,
			  RSString.anInt2629);
	return RSString;
    }
    
    public RSString method503(byte arg0, int arg1) {
	if (arg0 != 34)
	    equals(null);
	anInt2665++;
	return method502(arg1, -5975, anInt2629);
    }
    
    public long method504(int arg0) {
	if (arg0 <= 87)
	    method519((byte) 110, null);
	anInt2645++;
	long l = 0L;
	for (int i = 0; (anInt2629 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    l = (long) (0xff & aByteArray2653[i]) + ((l << -2125305147) + -l);
	return l;
    }
    
    public Object method505(Applet arg0, byte arg1) throws Throwable {
	anInt2627++;
	int i = -33 / ((-50 - arg1) / 40);
	String string = new String(aByteArray2653, 0, anInt2629);
	Object object = Class138.method1936(-11594, arg0, string);
	if (object instanceof String) {
	    byte[] is = ((String) object).getBytes();
	    object = Class34.method303(is, 0, is.length, 0);
	}
	return object;
    }
    
    public int method506(byte arg0, int arg1) {
	boolean bool = false;
	anInt2667++;
	int i = 0;
	if ((arg1 ^ 0xffffffff) > -2 || arg1 > 36)
	    arg1 = 10;
	boolean bool_8_ = false;
	int i_9_ = 0;
	if (arg0 > -80)
	    method517((byte) -18);
	for (/**/; i_9_ < anInt2629; i_9_++) {
	    int i_10_ = aByteArray2653[i_9_] & 0xff;
	    if (i_9_ == 0) {
		if ((i_10_ ^ 0xffffffff) == -46) {
		    bool = true;
		    continue;
		}
		if ((i_10_ ^ 0xffffffff) == -44)
		    continue;
	    }
	    if (i_10_ < 48 || i_10_ > 57) {
		if (i_10_ < 65 || i_10_ > 90) {
		    if ((i_10_ ^ 0xffffffff) <= -98 && i_10_ <= 122)
			i_10_ -= 87;
		    else
			throw new NumberFormatException();
		} else
		    i_10_ -= 55;
	    } else
		i_10_ -= 48;
	    if (i_10_ >= arg1)
		throw new NumberFormatException();
	    if (bool)
		i_10_ = -i_10_;
	    int i_11_ = arg1 * i - -i_10_;
	    if (i != i_11_ / arg1)
		throw new NumberFormatException();
	    bool_8_ = true;
	    i = i_11_;
	}
	if (!bool_8_)
	    throw new NumberFormatException();
	return i;
    }
    
    public RSString method507(int arg0) {
	long l = method504(105);
	anInt2672++;
	synchronized (aClass2689 != null ? aClass2689
		      : (aClass2689 = method547("RSString"))) {
	    if (Class55_Sub1.aClass92_2796 != null) {
		for (Class67_Sub29 class67_sub29
			 = (Class67_Sub29) Class55_Sub1.aClass92_2796
					       .method1489((byte) -83, l);
		     class67_sub29 != null;
		     class67_sub29
			 = (Class67_Sub29) Class55_Sub1.aClass92_2796
					       .method1477((byte) -82)) {
		    if (method519((byte) -69, class67_sub29.musicName))
			return class67_sub29.musicName;
		}
	    } else
		Class55_Sub1.aClass92_2796 = new Class92(4096);
	    Class67_Sub29 class67_sub29 = new Class67_Sub29();
	    aBoolean2657 = false;
	    class67_sub29.musicName = this;
	    Class55_Sub1.aClass92_2796.method1488((byte) -89, class67_sub29,
						  l);
	    int i = -119 / ((-9 - arg0) / 32);
	}
	return this;
    }
    
    public RSString method508(RSString arg0, boolean arg1, RSString arg2) {
	try {
	    int i = anInt2629;
	    anInt2688++;
	    int i_12_ = arg2.anInt2629 + -arg0.anInt2629;
	    if (arg1 != true)
		method498(null, (byte) 74, null);
	    int i_13_ = 0;
	    for (;;) {
		int i_14_ = method533(arg0, 9274, i_13_);
		if ((i_14_ ^ 0xffffffff) > -1)
		    break;
		i += i_12_;
		i_13_ = arg0.anInt2629 + i_14_;
	    }
	    i_13_ = 0;
	    RSString RSString = Class10.method139((byte) -108, i);
	    for (;;) {
		int i_15_ = method533(arg0, 9274, i_13_);
		if (i_15_ < 0) {
		    while (i_13_ < anInt2629)
			RSString.method538(-64, 0xff & aByteArray2653[i_13_++]);
		    break;
		}
		while (i_13_ < i_15_)
		    RSString.method538(-64, 0xff & aByteArray2653[i_13_++]);
		RSString.method544(-63, arg2);
		i_13_ += arg0.anInt2629;
	    }
	    return RSString;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("id.CB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public RSString method509(int arg0, int arg1, RSString arg2, int arg3) {
	anInt2655++;
	if (!aBoolean2657)
	    throw new IllegalArgumentException();
	if (arg1 != 48)
	    method545(64, -8, -57);
	if (arg0 < 0 || (arg0 ^ 0xffffffff) < (arg3 ^ 0xffffffff)
	    || (arg2.anInt2629 ^ 0xffffffff) > (arg3 ^ 0xffffffff))
	    throw new IllegalArgumentException();
	if (aByteArray2653.length < anInt2629 - (-arg3 - -arg0)) {
	    int i;
	    for (i = 1;
		 (i ^ 0xffffffff) > (anInt2629 + arg2.anInt2629 ^ 0xffffffff);
		 i += i) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	    aByteArray2653 = is;
	}
	Class17.method185(arg2.aByteArray2653, arg0, aByteArray2653, anInt2629,
			  arg3 - arg0);
	anInt2629 += -arg0 + arg3;
	return this;
    }
    
    public RSString method510(boolean arg0) {
	anInt2628++;
	if (arg0 != false)
	    return null;
	return this;
    }
    
    public int method511(byte arg0) {
	anInt2678++;
	int i = 0;
	if (arg0 != 31)
	    aRSString_2663 = null;
	for (int i_16_ = 0; i_16_ < anInt2629; i_16_++)
	    i = -i + ((i << 2116842437) + (aByteArray2653[i_16_] & 0xff));
	return i;
    }
    
    public URL method512(URL arg0, byte arg1) throws MalformedURLException {
	anInt2664++;
	if (arg1 != 117)
	    toString();
	return new URL(arg0, new String(aByteArray2653, 0, anInt2629));
    }
    
    public static void method513(int arg0) {
	anIntArray2649 = null;
	aRSString_2680 = null;
	aRSString_2663 = null;
	if (arg0 <= 124)
	    method513(-99);
    }
    
    public int method514(byte arg0, RSString arg1) {
	if (arg0 != -128)
	    return 79;
	anInt2662++;
	return method533(arg1, 9274, 0);
    }
    
    public RSString method515(int arg0) {
	anInt2639++;
	int i;
	for (i = 0; ((anInt2629 ^ 0xffffffff) < (i ^ 0xffffffff)
		     && (aByteArray2653[i] >= 0 && aByteArray2653[i] <= 32
			 || (0xff & aByteArray2653[i]) == 160)); i++) {
	    /* empty */
	}
	if (arg0 != 32)
	    anIntArray2649 = null;
	int i_17_;
	for (i_17_ = anInt2629;
	     ((i_17_ ^ 0xffffffff) < (i ^ 0xffffffff)
	      && ((aByteArray2653[-1 + i_17_] >= 0
		   && (aByteArray2653[i_17_ - 1] ^ 0xffffffff) >= -33)
		  || (aByteArray2653[-1 + i_17_] & 0xff) == 160));
	     i_17_--) {
	    /* empty */
	}
	if ((i ^ 0xffffffff) == -1
	    && (i_17_ ^ 0xffffffff) == (anInt2629 ^ 0xffffffff))
	    return this;
	RSString RSString = new RSString();
	RSString.anInt2629 = i_17_ + -i;
	RSString.aByteArray2653 = new byte[RSString.anInt2629];
	for (int i_18_ = 0;
	     (RSString.anInt2629 ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++)
	    RSString.aByteArray2653[i_18_] = aByteArray2653[i + i_18_];
	return RSString;
    }
    
    public boolean method516(int arg0, RSString arg1) {
	anInt2674++;
	if ((arg1.anInt2629 ^ 0xffffffff) < (anInt2629 ^ 0xffffffff))
	    return false;
	if (arg0 != 90)
	    method535(-11);
	int i = -arg1.anInt2629 + anInt2629;
	for (int i_19_ = 0;
	     (i_19_ ^ 0xffffffff) > (arg1.anInt2629 ^ 0xffffffff); i_19_++) {
	    if ((aByteArray2653[i_19_ + i] ^ 0xffffffff)
		!= (arg1.aByteArray2653[i_19_] ^ 0xffffffff))
		return false;
	}
	return true;
    }
    
    public boolean method517(byte arg0) {
	anInt2641++;
	if (arg0 <= 24)
	    return false;
	return method532((byte) -96, 10);
    }
    
    public byte[] method518(boolean arg0) {
	anInt2670++;
	byte[] is = new byte[anInt2629];
	if (arg0 != false)
	    return null;
	Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	return is;
    }
    
    public boolean method519(byte arg0, RSString arg1) {
	anInt2666++;
	if (arg1 == null)
	    return false;
	if (arg1 == this)
	    return true;
	if ((anInt2629 ^ 0xffffffff) != (arg1.anInt2629 ^ 0xffffffff))
	    return false;
	byte[] is = arg1.aByteArray2653;
	byte[] is_20_ = aByteArray2653;
	if (arg0 >= -47)
	    method494(-51, -12);
	for (int i = 0; i < anInt2629; i++) {
	    if ((is[i] ^ 0xffffffff) != (is_20_[i] ^ 0xffffffff))
		return false;
	}
	return true;
    }
    
    public String toString() {
	anInt2658++;
	return new String(aByteArray2653); //fixed.
	//throw new RuntimeException();
    }
    
    public RSString method520(byte arg0) {
	int i = 7 % ((arg0 - -2) / 41);
	anInt2671++;
	if (!aBoolean2657)
	    throw new IllegalArgumentException();
	if (aByteArray2653.length != anInt2629) {
	    byte[] is = new byte[anInt2629];
	    Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	    aByteArray2653 = is;
	}
	return this;
    }
    
    public RSString method521(int arg0, int arg1) {
	anInt2685++;
	if ((arg0 ^ 0xffffffff) >= -1 || (arg0 ^ 0xffffffff) < -256)
	    throw new IllegalArgumentException("invalid char");
	if (arg1 != -35)
	    return null;
	RSString RSString = new RSString();
	RSString.aByteArray2653 = new byte[1 + anInt2629];
	RSString.anInt2629 = 1 + anInt2629;
	Class17.method185(aByteArray2653, 0, RSString.aByteArray2653, 0,
			  anInt2629);
	RSString.aByteArray2653[anInt2629] = (byte) arg0;
	return RSString;
    }
    
    public static void method522(boolean arg0, int arg1) {
	if (arg1 != 0)
	    anIntArray2649 = null;
	anInt2677++;
	if (Class67_Sub20.aBoolean3164 != arg0) {
	    Class67_Sub20.aBoolean3164 = arg0;
	    Class73.method1356(-48);
	}
    }
    
    public boolean equals(Object arg0) {
	anInt2647++;
	if (arg0 instanceof RSString)
	    return method519((byte) -88, (RSString) arg0);
	throw new IllegalArgumentException();
    }
    
    public RSString method523(Applet arg0, int arg1) {
	String string = new String(aByteArray2653, 0, anInt2629);
	anInt2648++;
	String string_21_ = arg0.getParameter(string);
	if (arg1 != 31365)
	    method510(false);
	if (string_21_ == null)
	    return null;
	return Class7.method83(string_21_, (byte) -77);
    }
    
    public RSString method524(byte arg0) {
	if (arg0 != 127)
	    method507(-12);
	anInt2654++;
	RSString RSString = new RSString();
	RSString.anInt2629 = anInt2629;
	int i = 2;
	RSString.aByteArray2653 = new byte[anInt2629];
	for (int i_22_ = 0; anInt2629 > i_22_; i_22_++) {
	    byte i_23_ = aByteArray2653[i_22_];
	    if ((i_23_ < 97 || i_23_ > 122)
		&& (i_23_ < -32 || (i_23_ ^ 0xffffffff) < 1 || i_23_ == -9)) {
		if (i_23_ >= 65 && i_23_ <= 90
		    || (i_23_ >= -64 && (i_23_ ^ 0xffffffff) >= 33
			&& (i_23_ ^ 0xffffffff) != 40)) {
		    if (i == 0)
			i_23_ += 32;
		    i = 0;
		} else if (i_23_ == 46 || (i_23_ ^ 0xffffffff) == -34
			   || (i_23_ ^ 0xffffffff) == -64)
		    i = 2;
		else if ((i_23_ ^ 0xffffffff) == -33) {
		    if (i != 2)
			i = 1;
		} else
		    i = 1;
	    } else {
		if ((i ^ 0xffffffff) == -3)
		    i_23_ -= 32;
		i = 0;
	    }
	    RSString.aByteArray2653[i_22_] = i_23_;
	}
	return RSString;
    }
    
    public static void method525(int arg0, int arg1, int arg2) {
	anInt2644++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, arg0);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg2;
    }
    
    public boolean method526(int arg0, RSString arg1) {
	anInt2643++;
	if (arg1 == null)
	    return false;
	if ((arg1.anInt2629 ^ 0xffffffff) != (anInt2629 ^ 0xffffffff))
	    return false;
	int i = 37 % (-arg0 / 43);
	for (int i_24_ = 0; i_24_ < anInt2629; i_24_++) {
	    byte i_25_ = arg1.aByteArray2653[i_24_];
	    byte i_26_ = aByteArray2653[i_24_];
	    if ((i_26_ ^ 0xffffffff) <= -66 && i_26_ <= 90
		|| ((i_26_ ^ 0xffffffff) <= 63 && i_26_ <= -34
		    && (i_26_ ^ 0xffffffff) != 40))
		i_26_ += 32;
	    if ((i_25_ ^ 0xffffffff) <= -66 && (i_25_ ^ 0xffffffff) >= -91
		|| ((i_25_ ^ 0xffffffff) <= 63 && (i_25_ ^ 0xffffffff) >= 33
		    && i_25_ != -41))
		i_25_ += 32;
	    if ((i_25_ ^ 0xffffffff) != (i_26_ ^ 0xffffffff))
		return false;
	}
	return true;
    }
    
    public void method527(Applet arg0, int arg1) throws Throwable {
	String string = new String(aByteArray2653, 0, anInt2629);
	anInt2686++;
	Class138.method1935(43, string, arg0);
	if (arg1 != -23731)
	    aByteArray2653 = null;
    }
    
    public int method528(boolean arg0, int arg1, int arg2) {
	byte i = (byte) arg1;
	if (arg0 != true)
	    method533(null, 6, -121);
	anInt2659++;
	for (int i_27_ = arg2; (anInt2629 ^ 0xffffffff) < (i_27_ ^ 0xffffffff);
	     i_27_++) {
	    if (aByteArray2653[i_27_] == i)
		return i_27_;
	}
	return -1;
    }
    
    public boolean method529(byte arg0, RSString arg1) {
	anInt2646++;
	if ((anInt2629 ^ 0xffffffff) > (arg1.anInt2629 ^ 0xffffffff))
	    return false;
	for (int i = 0; (arg1.anInt2629 ^ 0xffffffff) < (i ^ 0xffffffff);
	     i++) {
	    byte i_28_ = aByteArray2653[i];
	    byte i_29_ = arg1.aByteArray2653[i];
	    if ((i_28_ ^ 0xffffffff) <= -66 && i_28_ <= 90
		|| ((i_28_ ^ 0xffffffff) <= 63 && (i_28_ ^ 0xffffffff) >= 33
		    && (i_28_ ^ 0xffffffff) != 40))
		i_28_ += 32;
	    if (i_29_ >= 65 && (i_29_ ^ 0xffffffff) >= -91
		|| ((i_29_ ^ 0xffffffff) <= 63 && (i_29_ ^ 0xffffffff) >= 33
		    && (i_29_ ^ 0xffffffff) != 40))
		i_29_ += 32;
	    if (i_28_ != i_29_)
		return false;
	}
	if (arg0 != -28)
	    method497((byte) 91, null);
	return true;
    }
    
    public int method530(byte arg0) {
	anInt2637++;
	int i = 94 % ((61 - arg0) / 60);
	return method506((byte) -108, 10);
    }
    
    public int method531(byte arg0) {
	int i = -76 / ((-67 - arg0) / 37);
	anInt2676++;
	return anInt2629;
    }
    
    public boolean method532(byte arg0, int arg1) {
	anInt2651++;
	if ((arg1 ^ 0xffffffff) > -2 || arg1 > 36)
	    arg1 = 10;
	if (arg0 > -42)
	    return false;
	boolean bool = false;
	boolean bool_30_ = false;
	int i = 0;
	for (int i_31_ = 0; i_31_ < anInt2629; i_31_++) {
	    int i_32_ = aByteArray2653[i_31_] & 0xff;
	    if (i_31_ == 0) {
		if ((i_32_ ^ 0xffffffff) == -46) {
		    bool = true;
		    continue;
		}
		if ((i_32_ ^ 0xffffffff) == -44)
		    continue;
	    }
	    if ((i_32_ ^ 0xffffffff) > -49 || (i_32_ ^ 0xffffffff) < -58) {
		if ((i_32_ ^ 0xffffffff) <= -66 && i_32_ <= 90)
		    i_32_ -= 55;
		else if ((i_32_ ^ 0xffffffff) <= -98
			 && (i_32_ ^ 0xffffffff) >= -123)
		    i_32_ -= 87;
		else
		    return false;
	    } else
		i_32_ -= 48;
	    if (arg1 <= i_32_)
		return false;
	    if (bool)
		i_32_ = -i_32_;
	    int i_33_ = i * arg1 - -i_32_;
	    if (i != i_33_ / arg1)
		return false;
	    bool_30_ = true;
	    i = i_33_;
	}
	return bool_30_;
    }
    
    public int method533(RSString arg0, int arg1, int arg2) {
	int i = arg0.anInt2629;
	anInt2650++;
	if ((anInt2629 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)) {
	    if ((i ^ 0xffffffff) == -1)
		return anInt2629;
	    return -1;
	}
	if ((arg2 ^ 0xffffffff) > -1)
	    arg2 = 0;
	if ((i ^ 0xffffffff) == -1)
	    return arg2;
	byte[] is = arg0.aByteArray2653;
	if (arg1 != 9274)
	    return -22;
	byte i_34_ = is[0];
	int i_35_ = anInt2629 - i;
	for (int i_36_ = arg2; i_36_ <= i_35_; i_36_++) {
	    if (i_34_ != aByteArray2653[i_36_]) {
		do {
		    if (i_35_ < ++i_36_)
			return -1;
		} while (aByteArray2653[i_36_] != i_34_);
	    }
	    boolean bool = true;
	    int i_37_ = 1 + i_36_;
	    int i_38_ = 1;
	    while (i > i_38_) {
		if (aByteArray2653[i_37_] != is[i_38_]) {
		    bool = false;
		    break;
		}
		i_38_++;
		i_37_++;
	    }
	    if (bool)
		return i_36_;
	}
	return -1;
    }
    
    public int method534(RSString arg0, byte arg1) {
	anInt2681++;
	int i = anInt2629;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = arg0.anInt2629;
	int i_42_ = -67 % ((arg1 - 74) / 41);
	int i_43_ = anInt2629;
	int i_44_ = arg0.anInt2629;
	int i_45_ = 0;
	int i_46_ = 0;
	while (i != 0 && i_41_ != 0) {
	    if ((i_39_ ^ 0xffffffff) != -157 && (i_39_ ^ 0xffffffff) != -231) {
		if ((i_39_ ^ 0xffffffff) != -141 && i_39_ != 198) {
		    if ((i_39_ ^ 0xffffffff) == -224)
			i_39_ = 115;
		    else {
			i_39_ = 0xff & aByteArray2653[i_45_];
			i_45_++;
		    }
		} else
		    i_39_ = 69;
	    } else
		i_39_ = 101;
	    if (Class128.method1732(i_39_, true))
		i_43_++;
	    else
		i--;
	    if ((i_40_ ^ 0xffffffff) != -157 && i_40_ != 230) {
		if ((i_40_ ^ 0xffffffff) == -141 || i_40_ == 198)
		    i_40_ = 69;
		else if ((i_40_ ^ 0xffffffff) != -224) {
		    i_40_ = 0xff & arg0.aByteArray2653[i_46_];
		    i_46_++;
		} else
		    i_40_ = 115;
	    } else
		i_40_ = 101;
	    if (!Class128.method1732(i_40_, true))
		i_41_--;
	    else
		i_44_++;
	    if ((Class67_Sub5_Sub18.anIntArray4803[i_40_] ^ 0xffffffff)
		< (Class67_Sub5_Sub18.anIntArray4803[i_39_] ^ 0xffffffff))
		return -1;
	    if (Class67_Sub5_Sub18.anIntArray4803[i_39_]
		> Class67_Sub5_Sub18.anIntArray4803[i_40_])
		return 1;
	}
	if (i_44_ > i_43_)
	    return -1;
	if ((i_43_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff))
	    return 1;
	return 0;
    }
    
    public void method535(int arg0) {
	String string;
	try {
	    string = new String(aByteArray2653, arg0, anInt2629, "ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
	    string = new String(aByteArray2653, 0, anInt2629);
	}
	anInt2687++;
	System.out.println(string);
    }
    
    public RSString method536(int arg0) {
	if (arg0 != -11662)
	    return null;
	anInt2636++;
	RSString RSString
	    = Class67_Sub17.method1250((byte) -72, method501((byte) -16));
	if (RSString == null)
	    return Class129_Sub1.aRSString_3500;
	return RSString;
    }
    
    public int method537(int arg0, RSString arg1) {
	anInt2669++;
	int i;
	if (arg1.anInt2629 < anInt2629)
	    i = arg1.anInt2629;
	else
	    i = anInt2629;
	int i_47_ = 68 / ((arg0 - -43) / 46);
	for (int i_48_ = 0; (i ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
	    if ((arg1.aByteArray2653[i_48_] & 0xff)
		> (0xff & aByteArray2653[i_48_]))
		return -1;
	    if ((aByteArray2653[i_48_] & 0xff)
		> (arg1.aByteArray2653[i_48_] & 0xff))
		return 1;
	}
	if ((arg1.anInt2629 ^ 0xffffffff) < (anInt2629 ^ 0xffffffff))
	    return -1;
	if ((anInt2629 ^ 0xffffffff) < (arg1.anInt2629 ^ 0xffffffff))
	    return 1;
	return 0;
    }
    
    public RSString method538(int arg0, int arg1) {
	anInt2668++;
	if ((arg1 ^ 0xffffffff) >= -1 || arg1 > 255)
	    throw new IllegalArgumentException("invalid char:" + arg1);
	if (!aBoolean2657)
	    throw new IllegalArgumentException();
	if (arg0 != -64)
	    anIntArray2649 = null;
	if (anInt2629 == aByteArray2653.length) {
	    int i;
	    for (i = 1; (anInt2629 ^ 0xffffffff) <= (i ^ 0xffffffff); i += i) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	    aByteArray2653 = is;
	}
	aByteArray2653[anInt2629++] = (byte) arg1;
	return this;
    }
    
    public void method539(int arg0, int arg1, Graphics arg2, int arg3) {
	anInt2661++;
	String string;
	try {
	    string = new String(aByteArray2653, 0, anInt2629, "ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
	    string = new String(aByteArray2653, 0, anInt2629);
	}
	if (arg0 > 60)
	    arg2.drawString(string, arg1, arg3);
    }
    
    public boolean method540(RSString arg0, int arg1) {
	anInt2679++;
	if (arg0.anInt2629 > anInt2629)
	    return false;
	int i = 3 / ((arg1 - -24) / 32);
	for (int i_49_ = 0; arg0.anInt2629 > i_49_; i_49_++) {
	    if (aByteArray2653[i_49_] != arg0.aByteArray2653[i_49_])
		return false;
	}
	return true;
    }
    
    public URL method541(int arg0) throws MalformedURLException {
	if (arg0 != -8320)
	    method509(-56, -31, null, 42);
	anInt2683++;
	return new URL(new String(aByteArray2653, 0, anInt2629));
    }
    
    public void method542(int arg0, int arg1) {
	anInt2633++;
	if (!aBoolean2657)
	    throw new IllegalArgumentException();
	if (arg1 < 0)
	    throw new IllegalArgumentException();
	if ((aByteArray2653.length ^ 0xffffffff) > (arg1 ^ 0xffffffff)) {
	    int i;
	    for (i = 1; (i ^ 0xffffffff) > (arg1 ^ 0xffffffff); i += i) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	    aByteArray2653 = is;
	}
	if (arg0 == -64) {
	    for (int i = anInt2629; (arg1 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		aByteArray2653[i] = (byte) 32;
	    anInt2629 = arg1;
	}
    }
    
    public int method543(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
	anInt2673++;
	if (arg3 != -141)
	    return -125;
	Class17.method185(aByteArray2653, arg2, arg4, arg0, arg1 - arg2);
	return -arg2 + arg1;
    }
    
    public RSString method544(int arg0, RSString arg1) {
	anInt2684++;
	if (arg0 != -63)
	    anInt2629 = -49;
	if (!aBoolean2657)
	    throw new IllegalArgumentException();
	if (aByteArray2653.length < arg1.anInt2629 + anInt2629) {
	    int i;
	    for (i = 1;
		 (arg1.anInt2629 + anInt2629 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i += i) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    Class17.method185(aByteArray2653, 0, is, 0, anInt2629);
	    aByteArray2653 = is;
	}
	Class17.method185(arg1.aByteArray2653, 0, aByteArray2653, anInt2629,
			  arg1.anInt2629);
	anInt2629 += arg1.anInt2629;
	return this;
    }
    
    public static int method545(int arg0, int arg1, int arg2) {
	anInt2675++;
	if (arg1 > -78)
	    method545(-80, 82, 68);
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -80, (long) arg0));
	if (class67_sub8 == null)
	    return -1;
	if (arg2 < 0 || class67_sub8.anIntArray2965.length <= arg2)
	    return -1;
	return class67_sub8.anIntArray2965[arg2];
    }
    
    public static boolean method546(boolean arg0) {
	anInt2632++;
	synchronized (Class81.aClass134_1648) {
	    if (arg0 != false)
		method498(null, (byte) 15, null);
	    if ((Class131_Sub7.anInt3710 ^ 0xffffffff)
		== (RuntimeException_Sub1.anInt2626 ^ 0xffffffff))
		return false;
	    Class41.anInt873 = (Class67_Sub1_Sub31.anIntArray4279
				[RuntimeException_Sub1.anInt2626]);
	    Class87.anInt1800
		= Class8.anIntArray345[RuntimeException_Sub1.anInt2626];
	    RuntimeException_Sub1.anInt2626
		= RuntimeException_Sub1.anInt2626 + 1 & 0x7f;
	    return true;
	}
    }
    
    public int hashCode() {
	anInt2635++;
	return method511((byte) 31);
    }
    
    /*synthetic*/ public static Class method547(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	anInt2642 = 0;
	aRSString_2680
	    = Class134.method1914(" est d-Bj-9 dans votre liste d(Wamis)3",
				  (byte) 107);
	aRSString_2663 = Class134.method1914("um", (byte) 77);
    }
}
