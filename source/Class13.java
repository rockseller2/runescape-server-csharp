import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

public class Class13
{
    public static int anInt425;
    public static int anInt426;
    public static Class9 aClass9_427;
    public static RSString aRSString_428
	= Class134.method1914("violet:", (byte) 16);
    public static RSString aRSString_429;
    public static int anInt430;
    public static int anInt431;
    public static Class23 aClass23_432;
    public static int anInt433;
    public static int anInt434;
    public static RSString aRSString_435;
    public static Class7 aClass7_436;
    public static int anInt437;
    
    public static void method152(int arg0) {
	anInt437++;
	if (arg0 < 37)
	    aClass23_432 = null;
	int i = Class67_Sub1_Sub16_Sub1.anInt5093;
	int i_0_ = Class67_Sub1_Sub30.anInt4272;
	int i_1_ = -i_0_ + (Class99.anInt1963 - Class49.anInt1010);
	int i_2_ = -i + (-Class56.anInt1097 + Class67_Sub1_Sub37.anInt4413);
	do {
	    if (i > 0 || (i_2_ ^ 0xffffffff) < -1 || (i_0_ ^ 0xffffffff) < -1
		|| (i_1_ ^ 0xffffffff) < -1) {
		try {
		    java.awt.Container container;
		    if (Class7.aFrame223 == null) {
			if (Class120.aFrame2272 == null)
			    container = Class124.aSignLink_2335.anApplet940;
			else
			    container = Class120.aFrame2272;
		    } else
			container = Class7.aFrame223;
		    int i_3_ = 0;
		    int i_4_ = 0;
		    if (Class120.aFrame2272 == container) {
			Insets insets = Class120.aFrame2272.getInsets();
			i_4_ = insets.left;
			i_3_ = insets.top;
		    }
		    Graphics graphics = container.getGraphics();
		    graphics.setColor(Color.black);
		    if (i > 0)
			graphics.fillRect(i_4_, i_3_, i, Class99.anInt1963);
		    if ((i_0_ ^ 0xffffffff) < -1)
			graphics.fillRect(i_4_, i_3_,
					  Class67_Sub1_Sub37.anInt4413, i_0_);
		    if (i_2_ > 0)
			graphics.fillRect((i_4_ - -Class67_Sub1_Sub37.anInt4413
					   + -i_2_),
					  i_3_, i_2_, Class99.anInt1963);
		    if (i_1_ <= 0)
			break;
		    graphics.fillRect(i_4_, -i_1_ + i_3_ - -Class99.anInt1963,
				      Class67_Sub1_Sub37.anInt4413, i_1_);
		} catch (Exception exception) {
		    break;
		}
		break;
	    }
	} while (false);
    }
    
    public static void method153(int arg0) {
	aClass7_436 = null;
	aRSString_435 = null;
	if (arg0 < -107) {
	    aRSString_428 = null;
	    aClass9_427 = null;
	    aRSString_429 = null;
	    aClass23_432 = null;
	}
    }
    
    public static boolean method154(int arg0, int arg1, int arg2) {
	int i = Class126_Sub2.anIntArrayArrayArray3443[arg0][arg1][arg2];
	if (i == -Class67_Sub1_Sub16.anInt4087)
	    return false;
	if (i == Class67_Sub1_Sub16.anInt4087)
	    return true;
	int i_5_ = arg1 << 7;
	int i_6_ = arg2 << 7;
	if (Class124.method1701(i_5_ + 1, (Class136.anIntArrayArrayArray2496
					   [arg0][arg1][arg2]), i_6_ + 1)
	    && Class124.method1701(i_5_ + 128 - 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1 + 1][arg2]),
				   i_6_ + 1)
	    && Class124.method1701(i_5_ + 128 - 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1 + 1][arg2 + 1]),
				   i_6_ + 128 - 1)
	    && Class124.method1701(i_5_ + 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1][arg2 + 1]),
				   i_6_ + 128 - 1)) {
	    Class126_Sub2.anIntArrayArrayArray3443[arg0][arg1][arg2]
		= Class67_Sub1_Sub16.anInt4087;
	    return true;
	}
	Class126_Sub2.anIntArrayArrayArray3443[arg0][arg1][arg2]
	    = -Class67_Sub1_Sub16.anInt4087;
	return false;
    }
    
    public static void method155(int arg0, Class9 arg1, Class9 arg2) {
	try {
	    if (arg0 < -14) {
		Class73.aClass9_1468 = arg1;
		anInt430++;
		Class57.aClass9_1107 = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("bh.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static Class67_Sub5_Sub7 method156
	(Class9 arg0, boolean arg1, Class9 arg2, int arg3, int arg4) {
	try {
	    anInt434++;
	    boolean bool = true;
	    if (arg3 >= -113)
		aRSString_435 = null;
	    int[] is = arg2.method131(arg4, (byte) 27);
	    for (int i = 0; is.length > i; i++) {
		byte[] is_7_ = arg2.method136(arg4, is[i], (byte) -121);
		if (is_7_ == null)
		    bool = false;
		else {
		    int i_8_
			= (0xff & is_7_[0]) << -951864376 | 0xff & is_7_[1];
		    byte[] is_9_;
		    if (!arg1)
			is_9_ = arg0.method136(i_8_, 0, (byte) 125);
		    else
			is_9_ = arg0.method136(0, i_8_, (byte) -109);
		    if (is_9_ == null)
			bool = false;
		}
	    }
	    if (!bool)
		return null;
	    try {
		return new Class67_Sub5_Sub7(arg2, arg0, arg4, arg1);
	    } catch (Exception exception) {
		return null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("bh.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4
						+ ')'));
	}
    }
    
    static {
	anInt426 = 0;
	aRSString_429
	    = (Class134.method1914
	       ("Clientscript error )2 check log for details", (byte) 102));
	aRSString_435 = Class134.method1914("brillant1:", (byte) 55);
	aClass7_436 = null;
    }
}
