import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class134 implements KeyListener, FocusListener
{
    public static int anInt2462;
    public static int anInt2463;
    public static byte[][][] aByteArrayArrayArray2464;
    public static Class67_Sub5_Sub19_Sub1[] aClass67_Sub5_Sub19_Sub1Array2465;
    public static Class137 aClass137_2466;
    public static int anInt2467;
    public static int anInt2468;
    public static int anInt2469;
    public static int anInt2470;
    public static int anInt2471;
    public static int anInt2472;
    public static int anInt2473;
    public static RSString aRSString_2474
	= method1914(" )2> <col=ff9040>", (byte) 22);
    public static int anInt2475;
    public static int anInt2476;
    
    public synchronized void keyReleased(KeyEvent arg0) {
	if (Class81.aClass134_1648 != null) {
	    Class67_Sub17.anInt3104 = 0;
	    int i = arg0.getKeyCode();
	    if (i < 0 || ((Class19.anIntArray495.length ^ 0xffffffff)
			  >= (i ^ 0xffffffff)))
		i = -1;
	    else
		i = Class19.anIntArray495[i] & ~0x80;
	    if ((Class47.anInt962 ^ 0xffffffff) <= -1
		&& (i ^ 0xffffffff) <= -1) {
		RSString.anIntArray2649[Class47.anInt962] = i ^ 0xffffffff;
		Class47.anInt962 = 0x7f & Class47.anInt962 - -1;
		if (Class67_Sub27.anInt3299 == Class47.anInt962)
		    Class47.anInt962 = -1;
	    }
	}
	anInt2473++;
	arg0.consume();
    }
    
    public void focusGained(FocusEvent arg0) {
	anInt2468++;
    }
    
    public static int method1910(int arg0, int arg1, int arg2) {
	anInt2469++;
	int i = 57 * arg0 + arg2;
	i ^= i << -1302259859;
	int i_0_ = 0x7fffffff & 1376312589 + i * (789221 + 15731 * i * i);
	if (arg1 != -1)
	    method1911(false);
	return (i_0_ & 0x7fa4c23) >> 362156915;
    }
    
    public synchronized void keyPressed(KeyEvent arg0) {
	if (Class81.aClass134_1648 != null) {
	    Class67_Sub17.anInt3104 = 0;
	    int i = arg0.getKeyCode();
	    if ((i ^ 0xffffffff) > -1 || i >= Class19.anIntArray495.length)
		i = -1;
	    else {
		i = Class19.anIntArray495[i];
		if ((i & 0x80 ^ 0xffffffff) != -1)
		    i = -1;
	    }
	    if (Class47.anInt962 >= 0 && i >= 0) {
		RSString.anIntArray2649[Class47.anInt962] = i;
		Class47.anInt962 = 0x7f & Class47.anInt962 + 1;
		if ((Class67_Sub27.anInt3299 ^ 0xffffffff)
		    == (Class47.anInt962 ^ 0xffffffff))
		    Class47.anInt962 = -1;
	    }
	    if (i >= 0) {
		int i_1_ = 0x7f & 1 + Class70.anInt1404;
		if ((i_1_ ^ 0xffffffff)
		    != (RuntimeException_Sub1.anInt2626 ^ 0xffffffff)) {
		    Class67_Sub1_Sub31.anIntArray4279[Class70.anInt1404] = i;
		    Class8.anIntArray345[Class70.anInt1404] = -1;
		    Class70.anInt1404 = i_1_;
		}
	    }
	    int i_2_ = arg0.getModifiers();
	    if ((i_2_ & 0xa) != 0 || (i ^ 0xffffffff) == -86 || i == 10)
		arg0.consume();
	}
	anInt2475++;
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	anInt2470++;
	if (Class81.aClass134_1648 != null)
	    Class47.anInt962 = -1;
    }
    
    public static void method1911(boolean arg0) {
	aRSString_2474 = null;
	aByteArrayArrayArray2464 = null;
	aClass67_Sub5_Sub19_Sub1Array2465 = null;
	if (arg0 == true)
	    aClass137_2466 = null;
    }
    
    public static void method1912(int arg0, int arg1, int arg2) {
	if ((Class67_Sub1_Sub5.anInt3876 ^ 0xffffffff) < -1) {
	    Class67_Sub1_Sub19.method708(Class67_Sub1_Sub5.anInt3876, 12);
	    Class67_Sub1_Sub5.anInt3876 = 0;
	}
	anInt2472++;
	int i = 256;
	int i_3_ = 0;
	int i_4_ = arg2 * Class121.anInt2296;
	int i_5_ = 0;
	int i_6_ = 5 % ((38 - arg1) / 61);
	for (int i_7_ = 1; i_7_ < i + -1; i_7_++) {
	    int i_8_ = (-i_7_ + i) * Class37.anIntArray803[i_7_] / i;
	    if ((i_8_ ^ 0xffffffff) > -1)
		i_8_ = 0;
	    i_3_ += i_8_;
	    for (int i_9_ = i_8_; i_9_ < 128; i_9_++) {
		int i_10_ = Class121.anIntArray2300[arg0 + i_4_++];
		int i_11_ = Class34.anIntArray746[i_3_++];
		if ((i_11_ ^ 0xffffffff) == -1)
		    Class130.aClass67_Sub5_Sub19_Sub1_2409.anIntArray5149
			[i_5_++]
			= i_10_;
		else {
		    int i_12_ = i_11_ + 18;
		    if ((i_12_ ^ 0xffffffff) < -256)
			i_12_ = 255;
		    int i_13_ = 256 + (-18 + -i_11_);
		    i_11_ = Class67_Sub26.anIntArray3273[i_11_];
		    if ((i_13_ ^ 0xffffffff) < -256)
			i_13_ = 255;
		    Class130.aClass67_Sub5_Sub19_Sub1_2409.anIntArray5149
			[i_5_++]
			= ((Class75.method1379
			    (16711680,
			     (i_13_ * Class75.method1379(i_10_, 65280)
			      + i_12_ * Class75.method1379(i_11_, 65280))))
			   + (Class75.method1379
			      ((Class75.method1379(i_11_, 16711935) * i_12_
				- -(i_13_
				    * Class75.method1379(16711935, i_10_))),
			       -16711936))) >> 2095783176;
		}
	    }
	    for (int i_14_ = 0; i_14_ < i_8_; i_14_++)
		Class130.aClass67_Sub5_Sub19_Sub1_2409.anIntArray5149[i_5_++]
		    = Class121.anIntArray2300[arg0 + i_4_++];
	    i_4_ += -128 + Class121.anInt2296;
	}
	Class130.aClass67_Sub5_Sub19_Sub1_2409.method1003(arg0, arg2);
    }
    
    public void keyTyped(KeyEvent arg0) {
	anInt2471++;
	if (Class81.aClass134_1648 != null) {
	    int i = Class67_Sub1_Sub25.method737(arg0, -25442);
	    if ((i ^ 0xffffffff) <= -1) {
		int i_15_ = 0x7f & Class70.anInt1404 - -1;
		if (RuntimeException_Sub1.anInt2626 != i_15_) {
		    Class67_Sub1_Sub31.anIntArray4279[Class70.anInt1404] = -1;
		    Class8.anIntArray345[Class70.anInt1404] = i;
		    Class70.anInt1404 = i_15_;
		}
	    }
	}
	arg0.consume();
    }
    
    public static void method1913(int arg0, boolean arg1) {
	if (arg1) {
	    if (Class54.anInt1080 != -1)
		Class67_Sub24.method1291(Class54.anInt1080, arg0 + -564);
	    for (Class67_Sub22 class67_sub22
		     = (Class67_Sub22) Class67_Sub1_Sub33.aClass92_4325
					   .method1483((byte) 32);
		 class67_sub22 != null;
		 class67_sub22
		     = ((Class67_Sub22)
			Class67_Sub1_Sub33.aClass92_4325.method1480(11)))
		Class67_Sub20.method1274(class67_sub22, true, arg0 + 15353);
	    Class54.anInt1080 = -1;
	    Class67_Sub1_Sub33.aClass92_4325 = new Class92(8);
	    Class67_Sub1_Sub13.method673(12860);
	    Class54.anInt1080 = Canvas_Sub1.anInt67;
	    Class67_Sub10.method1116(false, false);
	    Class67_Sub5_Sub14.method968(arg0 ^ 0x58);
	    Stream.method1059(Class54.anInt1080, (byte) -89);
	}
	Class2.anInt109 = -1;
	anInt2463++;
	Class67_Sub1_Sub28.method748(Class131_Sub4.anInt3645, true);
	Class122.aClass131_Sub7_Sub2_2309 = new Class131_Sub7_Sub2();
	Class122.aClass131_Sub7_Sub2_2309.anInt3733 = 3000;
	Class122.aClass131_Sub7_Sub2_2309.anInt3726 = 3000;
	if (arg0 == 8) {
	    Class67_Sub1_Sub21.method716(Class51.aClass9_1044, arg0 + -8);
	    Class40.method348(-11461, 10);
	}
    }
    
    public static RSString method1914(String arg0, byte arg1) {
	anInt2462++;
	int i = 0;
	byte[] is = arg0.getBytes();
	int i_16_ = is.length;
	RSString RSString = new RSString();
	RSString.aByteArray2653 = new byte[i_16_];
	if (arg1 <= 1)
	    method1910(71, 36, 104);
	while (i < i_16_) {
	    int i_17_ = is[i++] & 0xff;
	    if ((i_17_ ^ 0xffffffff) < -46 || (i_17_ ^ 0xffffffff) > -41) {
		if ((i_17_ ^ 0xffffffff) != -1)
		    RSString.aByteArray2653[RSString.anInt2629++] = (byte) i_17_;
	    } else {
		if (i >= i_16_)
		    break;
		int i_18_ = is[i++] & 0xff;
		RSString.aByteArray2653[RSString.anInt2629++]
		    = (byte) ((i_17_ - 40) * 43 + (-48 + i_18_));
	    }
	}
	RSString.method520((byte) -128);
	return RSString.method507(-71);
    }
    
    static {
	aClass137_2466 = new Class137(16);
	anInt2476 = 0;
    }
}
