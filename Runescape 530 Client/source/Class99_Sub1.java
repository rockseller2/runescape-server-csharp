/* Class99_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Class99_Sub1 extends Class99
    implements ImageProducer, ImageObserver
{
    public static int anInt3383;
    public static RSString[] aRSStringArray3384 = new RSString[200];
    public ColorModel aColorModel3385;
    public static RSString aRSString_3386
	= Class134.method1914("Lade Benutzeroberfl-=che )2 ", (byte) 119);
    public static RSString aRSString_3387;
    public static int anInt3388;
    public static int anInt3389;
    public static int anInt3390;
    public static RSString aRSString_3391;
    public static int anInt3392;
    public static int anInt3393;
    public static int anInt3394;
    public ImageConsumer anImageConsumer3395;
    public static int anInt3396;
    public static int anInt3397;
    public static int anInt3398;
    public static int anInt3399;
    public static RSString aRSString_3400
	= Class134.method1914("skill: ", (byte) 126);
    public static RSString aRSString_3401;
    public static int anInt3402;
    public static int anInt3403;
    public static int anInt3404;
    public static int anInt3405;
    public static int anInt3406;
    public static int anInt3407;
    
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			       int arg4, int arg5) {
	anInt3393++;
	return true;
    }
    
    public static Class11 method1525(int arg0, int arg1) {
	anInt3390++;
	Class11 class11 = (Class11) Class67_Sub1_Sub34.aClass136_4331
					.method1924((long) arg0, false);
	if (class11 != null)
	    return class11;
	byte[] is = Class10.aClass9_402.method138(-809612665, arg0, arg1);
	class11 = new Class11();
	if (is != null)
	    class11.method142(new Stream(is), -2196);
	Class67_Sub1_Sub34.aClass136_4331.method1926((long) arg0, class11,
						     (byte) -71);
	return class11;
    }
    
    public static void method1526(int arg0) {
	Class86.aClass92_1755 = new Class92(32);
	anInt3392++;
	int i = 94 / ((arg0 - -11) / 41);
    }
    
    public synchronized void method1527(int arg0) {
	anInt3388++;
	if (anImageConsumer3395 != null) {
	    anImageConsumer3395.setPixels(arg0, 0, anInt1962, anInt1958,
					  aColorModel3385, anIntArray1967, 0,
					  anInt1962);
	    anImageConsumer3395.imageComplete(2);
	}
    }
    
    public synchronized void removeConsumer(ImageConsumer arg0) {
	anInt3405++;
	if (anImageConsumer3395 == arg0)
	    anImageConsumer3395 = null;
    }
    
    public static boolean method1528(Class9 arg0, int arg1) {
	if (arg1 != 14)
	    method1529(47, 96, null, (byte) 80, 52, -69, null, -98, true, 31,
		       -120);
	anInt3394++;
	if (arg0.method132(Class142.anInt2570, true))
	    return true;
	return false;
    }
    
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	anInt3402++;
    }
    
    public static void method1529
	(int arg0, int arg1, Class73[] arg2, byte arg3, int arg4, int arg5,
	 byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
	try {
	    if (arg3 > -84)
		aRSString_3401 = null;
	    Stream Stream = new Stream(arg6);
	    anInt3383++;
	    int i = -1;
	    for (;;) {
		int i_0_ = Stream.method1082((byte) -54);
		if ((i_0_ ^ 0xffffffff) == -1)
		    break;
		int i_1_ = 0;
		i += i_0_;
		for (;;) {
		    int i_2_ = Stream.method1070(-70);
		    if ((i_2_ ^ 0xffffffff) == -1)
			break;
		    i_1_ += i_2_ - 1;
		    int i_3_ = (0xff9 & i_1_) >> 1369104294;
		    int i_4_ = i_1_ >> -60683764;
		    int i_5_ = Stream.readByte((byte) -100);
		    int i_6_ = i_5_ >> 301006466;
		    int i_7_ = 0x3 & i_5_;
		    int i_8_ = 0x3f & i_1_;
		    if (i_4_ == arg5
			&& (i_3_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
			&& (i_3_ ^ 0xffffffff) > (arg1 - -8 ^ 0xffffffff)
			&& (arg10 ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)
			&& i_8_ < 8 + arg10) {
			Class65 class65 = Class73.method1359(11525, i);
			int i_9_
			    = (arg0
			       - -Class16.method174(0, 0x7 & i_8_, i_3_ & 0x7,
						    class65.anInt1264, i_7_,
						    class65.anInt1297, arg4));
			int i_10_
			    = (arg7
			       + Class67_Sub22.method1280(arg4,
							  class65.anInt1297,
							  i_8_ & 0x7,
							  class65.anInt1264,
							  15, i_7_,
							  i_3_ & 0x7));
			if (i_9_ > 0 && (i_10_ ^ 0xffffffff) < -1 && i_9_ < 103
			    && i_10_ < 103) {
			    Class73 class73 = null;
			    if (!arg8) {
				int i_11_ = arg9;
				if ((0x2 & (Class120.aByteArrayArrayArray2284
					    [1][i_9_][i_10_]))
				    == 2)
				    i_11_--;
				if ((i_11_ ^ 0xffffffff) <= -1)
				    class73 = arg2[i_11_];
			    }
			    Class92.method1484(arg8, arg9, i, arg9,
					       arg4 + i_7_ & 0x3, i_6_, i_9_,
					       i_10_, !arg8, class73, 2);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ck.B(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ arg5 + ','
						+ (arg6 != null ? "{...}"
						   : "null")
						+ ',' + arg7 + ',' + arg8 + ','
						+ arg9 + ',' + arg10 + ')'));
	}
    }
    
    public void method1522(byte arg0, int arg1, int arg2, int arg3, int arg4,
			   Graphics arg5) {
	method1531(arg1, arg3, arg2, arg0 ^ 0x69, arg4);
	anInt3399++;
	if (arg0 != -6)
	    method1528(null, -123);
	Shape shape = arg5.getClip();
	arg5.clipRect(arg3, arg4, arg2, arg1);
	arg5.drawImage(anImage1955, 0, 0, this);
	arg5.setClip(shape);
    }
    
    public synchronized boolean isConsumer(ImageConsumer arg0) {
	anInt3406++;
	if (arg0 != anImageConsumer3395)
	    return false;
	return true;
    }
    
    public static void method1530(byte arg0) {
	aRSStringArray3384 = null;
	aRSString_3391 = null;
	aRSString_3401 = null;
	aRSString_3387 = null;
	aRSString_3400 = null;
	aRSString_3386 = null;
	if (arg0 != 58)
	    anInt3403 = 112;
    }
    
    public void method1520(int arg0, int arg1, Component arg2, byte arg3) {
	anIntArray1967 = new int[1 + arg1 * arg0];
	anInt1958 = arg0;
	anInt3389++;
	anInt1962 = arg1;
	aColorModel3385 = new DirectColorModel(32, 16711680, 65280, 255);
	anImage1955 = arg2.createImage(this);
	method1527(0);
	arg2.prepareImage(anImage1955, this);
	method1527(0);
	arg2.prepareImage(anImage1955, this);
	method1527(0);
	arg2.prepareImage(anImage1955, this);
	this.method1524(0);
	if (arg3 > -16)
	    aColorModel3385 = null;
    }
    
    public synchronized void method1531(int arg0, int arg1, int arg2, int arg3,
					int arg4) {
	anInt3404++;
	if (anImageConsumer3395 != null) {
	    anImageConsumer3395.setPixels(arg1, arg4, arg2, arg0,
					  aColorModel3385, anIntArray1967,
					  arg4 * anInt1962 - -arg1, anInt1962);
	    if (arg3 >= -33)
		anImageConsumer3395 = null;
	    anImageConsumer3395.imageComplete(2);
	}
    }
    
    public synchronized void addConsumer(ImageConsumer arg0) {
	anImageConsumer3395 = arg0;
	anInt3407++;
	arg0.setDimensions(anInt1962, anInt1958);
	arg0.setProperties(null);
	arg0.setColorModel(aColorModel3385);
	arg0.setHints(14);
    }
    
    public static void method1532(int arg0, int arg1, int arg2, int arg3) {
	anInt3397++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg3, false, 9);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg0;
	int i = 99 / ((-54 - arg2) / 61);
	class67_sub5_sub3.anInt4500 = arg1;
    }
    
    public void startProduction(ImageConsumer arg0) {
	addConsumer(arg0);
	anInt3398++;
    }
    
    public void method1518(int arg0, int arg1, int arg2, Graphics arg3) {
	anInt3396++;
	method1527(0);
	arg3.drawImage(anImage1955, arg1, arg2, this);
	if (arg0 != 1000)
	    method1522((byte) -96, -13, 103, 27, 107, null);
    }
    
    static {
	aRSString_3387 = aRSString_3400;
	aRSString_3401 = Class134.method1914("details", (byte) 34);
	anInt3403 = 0;
	aRSString_3391 = Class134.method1914("(Udns", (byte) 13);
    }
}
