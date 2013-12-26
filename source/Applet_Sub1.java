/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet
    implements Runnable, FocusListener, WindowListener
{
    public static RSString aRSString_1;
    public static int anInt2;
    public static RSString[] aRSStringArray3;
    public static int anInt4;
    public static int anInt5;
    public static int anInt6;
    public static int anInt7;
    public static int anInt8;
    public static int anInt9;
    public static RSString aRSString_10;
    public static RSString aRSString_11;
    public static int anInt12;
    public static int anInt13;
    public static int anInt14;
    public boolean aBoolean15 = false;
    public static int anInt16;
    public static RSString aRSString_17;
    public static int anInt18;
    public static int anInt19;
    public static RSString aRSString_20;
    public static short[] aShortArray21 = new short[500];
    public static int anInt22;
    public static RSString aRSString_23 = Class134.method1914("Mar", (byte) 46);
    public static int anInt24;
    public static RSString aRSString_25;
    public static RSString aRSString_26 = Class134.method1914("Jan", (byte) 44);
    public static int anInt27;
    public static int anInt28;
    public static RSString aRSString_29;
    public static int anInt30;
    public static int anInt31;
    public static int anInt32;
    public static RSString aRSString_33;
    public static int anInt34;
    public static int[] anIntArray35;
    public static RSString aRSString_36;
    public static int anInt37;
    public static int anInt38;
    public static int anInt39;
    public static RSString aRSString_40;
    public static int anInt41;
    public static RSString aRSString_42;
    public static int anInt43;
    public static RSString aRSString_44;
    public static int anInt45;
    public static int anInt46;
    public static RSString aRSString_47;
    public static RSString aRSString_48;
    public static int anInt49;
    public static int anInt50;
    public static int anInt51;
    public static boolean aBoolean52;
    public static int anInt53;
    
    public void windowDeiconified(WindowEvent arg0) {
	anInt6++;
    }
    
    public void windowClosing(WindowEvent arg0) {
	destroy();
	anInt8++;
    }
    
    public static Class67_Sub5_Sub19[] method15(byte arg0) {
	Class67_Sub5_Sub19[] class67_sub5_sub19s
	    = new Class67_Sub5_Sub19[Class67_Sub15.anInt3067];
	if (arg0 != -10)
	    return null;
	for (int i = 0; i < Class67_Sub15.anInt3067; i++) {
	    int i_0_ = (Class67_Sub5_Sub4.anIntArray4510[i]
			* Class55_Sub3.anIntArray2810[i]);
	    byte[] is = Class67_Sub1_Sub35.aByteArrayArray4357[i];
	    if (!Class67_Sub3.aBooleanArray2847[i]) {
		int[] is_1_ = new int[i_0_];
		for (int i_2_ = 0; (i_0_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++)
		    is_1_[i_2_]
			= Class73.anIntArray1462[Class75.method1379(is[i_2_],
								    255)];
		class67_sub5_sub19s[i]
		    = (new Class67_Sub5_Sub19_Sub1
		       (Class3.anInt119, Class80.anInt1628,
			Class67_Sub23.anIntArray3201[i],
			Class67_Sub6.anIntArray2870[i],
			Class55_Sub3.anIntArray2810[i],
			Class67_Sub5_Sub4.anIntArray4510[i], is_1_));
	    } else {
		int[] is_3_ = new int[i_0_];
		byte[] is_4_ = Class120.aByteArrayArray2268[i];
		for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
		    is_3_[i_5_]
			= (Class67_Sub20.method1273
			   ((Class75.method1379(is_4_[i_5_], 255)
			     << -1784639208),
			    Class73.anIntArray1462[Class75.method1379(is[i_5_],
								      255)]));
		class67_sub5_sub19s[i]
		    = (new Class67_Sub5_Sub19_Sub1_Sub1
		       (Class3.anInt119, Class80.anInt1628,
			Class67_Sub23.anIntArray3201[i],
			Class67_Sub6.anIntArray2870[i],
			Class55_Sub3.anIntArray2810[i],
			Class67_Sub5_Sub4.anIntArray4510[i], is_3_));
	    }
	}
	anInt37++;
	Class67_Sub5_Sub11.method937(false);
	return class67_sub5_sub19s;
    }
    
    public void windowActivated(WindowEvent arg0) {
	anInt34++;
    }
    
    public void method16(int arg0, String arg1) {
	anInt41++;
	if (!aBoolean15) {
	    aBoolean15 = true;
	    System.out.println("error_game_" + arg1);
	    if (arg0 == 31439) {
		try {
		    getAppletContext().showDocument(new URL(getCodeBase(),
							    ("error_game_"
							     + arg1 + ".ws")),
						    "_top");
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	Class67_Sub22.aBoolean3184 = true;
	anInt46++;
	Class56.aBoolean1098 = true;
    }
    
    public abstract void method17(int i);
    
    public abstract void method18(byte i);
    
    public void windowDeactivated(WindowEvent arg0) {
	try {
	    anInt51++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.windowDeactivated("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt7++;
	    if (arg0 > -124)
		update(null);
	    try {
		if (Class68.anApplet_Sub1_1360 != null) {
		    Class67_Sub15.anInt3074++;
		    if ((Class67_Sub15.anInt3074 ^ 0xffffffff) <= -4)
			method16(31439, "alreadyloaded");
		    else
			getAppletContext().showDocument(getDocumentBase(),
							"_self");
		} else {
		    Class86.anInt1761 = arg3;
		    Class99.anInt1963 = Class49.anInt1010 = arg4;
		    Class67_Sub1_Sub16_Sub1.anInt5093 = 0;
		    Class68.anApplet_Sub1_1360 = this;
		    Class67_Sub1_Sub30.anInt4272 = 0;
		    Class67_Sub1_Sub37.anInt4413 = Class56.anInt1097 = arg1;
		    String string = getParameter("openwinjs");
		    if (string != null && string.equals("1")) {
			/* empty */
		    }
		    if (Class124.aSignLink_2335 == null)
			Class16.aSignLink_475 = Class124.aSignLink_2335
			    = new SignLink(this, arg2, null, 0);
		    Class31 class31
			= Class124.aSignLink_2335.method404(2, this, 1);
		    while ((class31.anInt706 ^ 0xffffffff) == -1)
			Class67_Sub1_Sub23.method726(-112, 10L);
		}
	    } catch (Exception exception) {
		Class104.method1563(exception, null, 1);
		method16(31439, "crash");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method20(Class67_Sub24 arg0, boolean arg1) {
	Class126_Sub4.aClass50_3464.method436(arg0, false);
	for (;;) {
	    Class67_Sub24 class67_sub24
		= (Class67_Sub24) Class126_Sub4.aClass50_3464.method442(true);
	    if (class67_sub24 == null)
		break;
	    if (class67_sub24.aBoolean3231) {
		int i = class67_sub24.anInt3218;
		int i_6_ = class67_sub24.anInt3217;
		int i_7_ = class67_sub24.anInt3232;
		int i_8_ = class67_sub24.anInt3235;
		Class67_Sub24[][] class67_sub24s
		    = Class76.aClass67_Sub24ArrayArrayArray1578[i_7_];
		if (class67_sub24.aBoolean3223) {
		    if (arg1) {
			if (i_7_ > 0) {
			    Class67_Sub24 class67_sub24_9_
				= (Class76.aClass67_Sub24ArrayArrayArray1578
				   [i_7_ - 1][i][i_6_]);
			    if (class67_sub24_9_ != null
				&& class67_sub24_9_.aBoolean3231)
				continue;
			}
			if (i <= Class67_Sub1_Sub9.anInt3941
			    && i > Class55_Sub2.anInt2806) {
			    Class67_Sub24 class67_sub24_10_
				= class67_sub24s[i - 1][i_6_];
			    if (class67_sub24_10_ != null
				&& class67_sub24_10_.aBoolean3231
				&& (class67_sub24_10_.aBoolean3223
				    || (class67_sub24.anInt3236 & 0x1) == 0))
				continue;
			}
			if (i >= Class67_Sub1_Sub9.anInt3941
			    && i < Class80.anInt1627 - 1) {
			    Class67_Sub24 class67_sub24_11_
				= class67_sub24s[i + 1][i_6_];
			    if (class67_sub24_11_ != null
				&& class67_sub24_11_.aBoolean3231
				&& (class67_sub24_11_.aBoolean3223
				    || (class67_sub24.anInt3236 & 0x4) == 0))
				continue;
			}
			if (i_6_ <= Class67_Sub1_Sub7.anInt3905
			    && i_6_ > Class67_Sub5_Sub13.anInt4711) {
			    Class67_Sub24 class67_sub24_12_
				= class67_sub24s[i][i_6_ - 1];
			    if (class67_sub24_12_ != null
				&& class67_sub24_12_.aBoolean3231
				&& (class67_sub24_12_.aBoolean3223
				    || (class67_sub24.anInt3236 & 0x8) == 0))
				continue;
			}
			if (i_6_ >= Class67_Sub1_Sub7.anInt3905
			    && i_6_ < Class69.anInt1389 - 1) {
			    Class67_Sub24 class67_sub24_13_
				= class67_sub24s[i][i_6_ + 1];
			    if (class67_sub24_13_ != null
				&& class67_sub24_13_.aBoolean3231
				&& (class67_sub24_13_.aBoolean3223
				    || (class67_sub24.anInt3236 & 0x2) == 0))
				continue;
			}
		    } else
			arg1 = true;
		    class67_sub24.aBoolean3223 = false;
		    if (class67_sub24.aClass67_Sub24_3233 != null) {
			Class67_Sub24 class67_sub24_14_
			    = class67_sub24.aClass67_Sub24_3233;
			if (class67_sub24_14_.aClass84_3227 != null) {
			    if (!Class13.method154(0, i, i_6_))
				Class131.method1770((class67_sub24_14_
						     .aClass84_3227),
						    0, Class120.anInt2274,
						    Class106.anInt2054,
						    Class139.anInt2530,
						    Class102.anInt2007, i,
						    i_6_, false);
			    else
				Class131.method1770((class67_sub24_14_
						     .aClass84_3227),
						    0, Class120.anInt2274,
						    Class106.anInt2054,
						    Class139.anInt2530,
						    Class102.anInt2007, i,
						    i_6_, true);
			} else if (class67_sub24_14_.aClass71_3219 != null) {
			    if (!Class13.method154(0, i, i_6_))
				Class116.method1625((class67_sub24_14_
						     .aClass71_3219),
						    Class120.anInt2274,
						    Class106.anInt2054,
						    Class139.anInt2530,
						    Class102.anInt2007, i,
						    i_6_, false);
			    else
				Class116.method1625((class67_sub24_14_
						     .aClass71_3219),
						    Class120.anInt2274,
						    Class106.anInt2054,
						    Class139.anInt2530,
						    Class102.anInt2007, i,
						    i_6_, true);
			}
			Class58 class58 = class67_sub24_14_.aClass58_3221;
			if (class58 != null)
			    class58.aClass131_1121.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class58.anInt1120 - Class67_Sub16.anInt3080,
				 class58.anInt1124 - Class34.anInt747,
				 class58.anInt1125 - PacketParser.anInt2120,
				 class58.aLong1118, i_7_, null);
			for (int i_15_ = 0;
			     i_15_ < class67_sub24_14_.anInt3215; i_15_++) {
			    Class36 class36
				= class67_sub24_14_.aClass36Array3229[i_15_];
			    if (class36 != null)
				class36.aClass131_790.method1764
				    (class36.anInt770, Class120.anInt2274,
				     Class106.anInt2054, Class139.anInt2530,
				     Class102.anInt2007,
				     (class36.anInt767
				      - Class67_Sub16.anInt3080),
				     class36.anInt784 - Class34.anInt747,
				     class36.anInt783 - PacketParser.anInt2120,
				     class36.aLong785, i_7_, null);
			}
		    }
		    boolean bool = false;
		    if (class67_sub24.aClass84_3227 != null) {
			if (!Class13.method154(i_8_, i, i_6_)) {
			    bool = true;
			    if ((class67_sub24.aClass84_3227.anInt1699
				 != 12345678)
				|| (Class67_Sub1_Sub20.aBoolean4144
				    && i_7_ <= Class8.anInt349))
				Class131.method1770((class67_sub24
						     .aClass84_3227),
						    i_8_, Class120.anInt2274,
						    Class106.anInt2054,
						    Class139.anInt2530,
						    Class102.anInt2007, i,
						    i_6_, false);
			} else
			    Class131.method1770(class67_sub24.aClass84_3227,
						i_8_, Class120.anInt2274,
						Class106.anInt2054,
						Class139.anInt2530,
						Class102.anInt2007, i, i_6_,
						true);
		    } else if (class67_sub24.aClass71_3219 != null) {
			if (!Class13.method154(i_8_, i, i_6_)) {
			    bool = true;
			    Class116.method1625(class67_sub24.aClass71_3219,
						Class120.anInt2274,
						Class106.anInt2054,
						Class139.anInt2530,
						Class102.anInt2007, i, i_6_,
						false);
			} else
			    Class116.method1625(class67_sub24.aClass71_3219,
						Class120.anInt2274,
						Class106.anInt2054,
						Class139.anInt2530,
						Class102.anInt2007, i, i_6_,
						true);
		    }
		    if (bool) {
			Class104 class104 = class67_sub24.aClass104_3216;
			if (class104 != null
			    && (class104.aLong2035 & 0x80000000L) != 0L)
			    class104.aClass131_2034.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class104.anInt2037 - Class67_Sub16.anInt3080,
				 class104.anInt2042 - Class34.anInt747,
				 class104.anInt2031 - PacketParser.anInt2120,
				 class104.aLong2035, i_7_, null);
		    }
		    int i_16_ = 0;
		    int i_17_ = 0;
		    Class58 class58 = class67_sub24.aClass58_3221;
		    Class94 class94 = class67_sub24.aClass94_3224;
		    if (class58 != null || class94 != null) {
			if (Class67_Sub1_Sub9.anInt3941 == i)
			    i_16_++;
			else if (Class67_Sub1_Sub9.anInt3941 < i)
			    i_16_ += 2;
			if (Class67_Sub1_Sub7.anInt3905 == i_6_)
			    i_16_ += 3;
			else if (Class67_Sub1_Sub7.anInt3905 > i_6_)
			    i_16_ += 6;
			i_17_ = Class67_Sub1_Sub16.anIntArray4090[i_16_];
			class67_sub24.anInt3228
			    = Class128.anIntArray2375[i_16_];
		    }
		    if (class58 != null) {
			if ((class58.anInt1123
			     & Class67_Sub1_Sub15.anIntArray4053[i_16_])
			    != 0) {
			    if (class58.anInt1123 == 16) {
				class67_sub24.anInt3225 = 3;
				class67_sub24.anInt3230
				    = InputStream_Sub1.anIntArray72[i_16_];
				class67_sub24.anInt3240
				    = 3 - class67_sub24.anInt3230;
			    } else if (class58.anInt1123 == 32) {
				class67_sub24.anInt3225 = 6;
				class67_sub24.anInt3230
				    = Class78.anIntArray1597[i_16_];
				class67_sub24.anInt3240
				    = 6 - class67_sub24.anInt3230;
			    } else if (class58.anInt1123 == 64) {
				class67_sub24.anInt3225 = 12;
				class67_sub24.anInt3230
				    = Class40.anIntArray817[i_16_];
				class67_sub24.anInt3240
				    = 12 - class67_sub24.anInt3230;
			    } else {
				class67_sub24.anInt3225 = 9;
				class67_sub24.anInt3230
				    = Class67_Sub1_Sub13.anIntArray4020[i_16_];
				class67_sub24.anInt3240
				    = 9 - class67_sub24.anInt3230;
			    }
			} else
			    class67_sub24.anInt3225 = 0;
			if ((class58.anInt1123 & i_17_) != 0
			    && !Class144.method1968(i_8_, i, i_6_,
						    class58.anInt1123))
			    class58.aClass131_1121.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class58.anInt1120 - Class67_Sub16.anInt3080,
				 class58.anInt1124 - Class34.anInt747,
				 class58.anInt1125 - PacketParser.anInt2120,
				 class58.aLong1118, i_7_, null);
			if ((class58.anInt1122 & i_17_) != 0
			    && !Class144.method1968(i_8_, i, i_6_,
						    class58.anInt1122))
			    class58.aClass131_1115.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class58.anInt1120 - Class67_Sub16.anInt3080,
				 class58.anInt1124 - Class34.anInt747,
				 class58.anInt1125 - PacketParser.anInt2120,
				 class58.aLong1118, i_7_, null);
		    }
		    if (class94 != null
			&& !Class19.method191(i_8_, i, i_6_,
					      class94.aClass131_1894
						  .method1769())) {
			if ((class94.anInt1898 & i_17_) != 0)
			    class94.aClass131_1894.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 (class94.anInt1889 - Class67_Sub16.anInt3080
				  + class94.anInt1893),
				 class94.anInt1890 - Class34.anInt747,
				 (class94.anInt1887 - PacketParser.anInt2120
				  + class94.anInt1897),
				 class94.aLong1886, i_7_, null);
			else if (class94.anInt1898 == 256) {
			    int i_18_
				= class94.anInt1889 - Class67_Sub16.anInt3080;
			    int i_19_ = class94.anInt1890 - Class34.anInt747;
			    int i_20_ = class94.anInt1887 - PacketParser.anInt2120;
			    int i_21_ = class94.anInt1892;
			    int i_22_;
			    if (i_21_ == 1 || i_21_ == 2)
				i_22_ = -i_18_;
			    else
				i_22_ = i_18_;
			    int i_23_;
			    if (i_21_ == 2 || i_21_ == 3)
				i_23_ = -i_20_;
			    else
				i_23_ = i_20_;
			    if (i_23_ < i_22_)
				class94.aClass131_1894.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     i_18_ + class94.anInt1893, i_19_,
				     i_20_ + class94.anInt1897,
				     class94.aLong1886, i_7_, null);
			    else if (class94.aClass131_1896 != null)
				class94.aClass131_1896.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     i_18_, i_19_, i_20_, class94.aLong1886,
				     i_7_, null);
			}
		    }
		    if (bool) {
			Class104 class104 = class67_sub24.aClass104_3216;
			if (class104 != null
			    && (class104.aLong2035 & 0x80000000L) == 0L)
			    class104.aClass131_2034.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class104.anInt2037 - Class67_Sub16.anInt3080,
				 class104.anInt2042 - Class34.anInt747,
				 class104.anInt2031 - PacketParser.anInt2120,
				 class104.aLong2035, i_7_, null);
			Class88 class88 = class67_sub24.aClass88_3220;
			if (class88 != null && class88.anInt1818 == 0) {
			    if (class88.aClass131_1816 != null)
				class88.aClass131_1816.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     class88.anInt1823 - Class34.anInt747,
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			    if (class88.aClass131_1820 != null)
				class88.aClass131_1820.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     class88.anInt1823 - Class34.anInt747,
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			    if (class88.aClass131_1825 != null)
				class88.aClass131_1825.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     class88.anInt1823 - Class34.anInt747,
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			}
		    }
		    int i_24_ = class67_sub24.anInt3236;
		    if (i_24_ != 0) {
			if (i < Class67_Sub1_Sub9.anInt3941
			    && (i_24_ & 0x4) != 0) {
			    Class67_Sub24 class67_sub24_25_
				= class67_sub24s[i + 1][i_6_];
			    if (class67_sub24_25_ != null
				&& class67_sub24_25_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_25_, false);
			}
			if (i_6_ < Class67_Sub1_Sub7.anInt3905
			    && (i_24_ & 0x2) != 0) {
			    Class67_Sub24 class67_sub24_26_
				= class67_sub24s[i][i_6_ + 1];
			    if (class67_sub24_26_ != null
				&& class67_sub24_26_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_26_, false);
			}
			if (i > Class67_Sub1_Sub9.anInt3941
			    && (i_24_ & 0x1) != 0) {
			    Class67_Sub24 class67_sub24_27_
				= class67_sub24s[i - 1][i_6_];
			    if (class67_sub24_27_ != null
				&& class67_sub24_27_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_27_, false);
			}
			if (i_6_ > Class67_Sub1_Sub7.anInt3905
			    && (i_24_ & 0x8) != 0) {
			    Class67_Sub24 class67_sub24_28_
				= class67_sub24s[i][i_6_ - 1];
			    if (class67_sub24_28_ != null
				&& class67_sub24_28_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_28_, false);
			}
		    }
		}
		if (class67_sub24.anInt3225 != 0) {
		    boolean bool = true;
		    for (int i_29_ = 0; i_29_ < class67_sub24.anInt3215;
			 i_29_++) {
			if ((class67_sub24.aClass36Array3229[i_29_].anInt782
			     != Class67_Sub1_Sub16.anInt4087)
			    && ((class67_sub24.anIntArray3222[i_29_]
				 & class67_sub24.anInt3225)
				== class67_sub24.anInt3230)) {
			    bool = false;
			    break;
			}
		    }
		    if (bool) {
			Class58 class58 = class67_sub24.aClass58_3221;
			if (!Class144.method1968(i_8_, i, i_6_,
						 class58.anInt1123))
			    class58.aClass131_1121.method1764
				(0, Class120.anInt2274, Class106.anInt2054,
				 Class139.anInt2530, Class102.anInt2007,
				 class58.anInt1120 - Class67_Sub16.anInt3080,
				 class58.anInt1124 - Class34.anInt747,
				 class58.anInt1125 - PacketParser.anInt2120,
				 class58.aLong1118, i_7_, null);
			class67_sub24.anInt3225 = 0;
		    }
		}
		if (class67_sub24.aBoolean3226) {
		    try {
			int i_30_ = class67_sub24.anInt3215;
			class67_sub24.aBoolean3226 = false;
			int i_31_ = 0;
		    while_116_:
			for (int i_32_ = 0; i_32_ < i_30_; i_32_++) {
			    Class36 class36
				= class67_sub24.aClass36Array3229[i_32_];
			    if (class36.anInt782
				!= Class67_Sub1_Sub16.anInt4087) {
				for (int i_33_ = class36.anInt765;
				     i_33_ <= class36.anInt778; i_33_++) {
				    for (int i_34_ = class36.anInt777;
					 i_34_ <= class36.anInt789; i_34_++) {
					Class67_Sub24 class67_sub24_35_
					    = class67_sub24s[i_33_][i_34_];
					if (class67_sub24_35_.aBoolean3223) {
					    class67_sub24.aBoolean3226 = true;
					    continue while_116_;
					}
					if (class67_sub24_35_.anInt3225 != 0) {
					    int i_36_ = 0;
					    if (i_33_ > class36.anInt765)
						i_36_++;
					    if (i_33_ < class36.anInt778)
						i_36_ += 4;
					    if (i_34_ > class36.anInt777)
						i_36_ += 8;
					    if (i_34_ < class36.anInt789)
						i_36_ += 2;
					    if ((i_36_
						 & class67_sub24_35_.anInt3225)
						== class67_sub24.anInt3240) {
						class67_sub24.aBoolean3226
						    = true;
						continue while_116_;
					    }
					}
				    }
				}
				Class28.aClass36Array666[i_31_++] = class36;
				int i_37_ = (Class67_Sub1_Sub9.anInt3941
					     - class36.anInt765);
				int i_38_ = (class36.anInt778
					     - Class67_Sub1_Sub9.anInt3941);
				if (i_38_ > i_37_)
				    i_37_ = i_38_;
				int i_39_ = (Class67_Sub1_Sub7.anInt3905
					     - class36.anInt777);
				int i_40_ = (class36.anInt789
					     - Class67_Sub1_Sub7.anInt3905);
				if (i_40_ > i_39_)
				    class36.anInt776 = i_37_ + i_40_;
				else
				    class36.anInt776 = i_37_ + i_39_;
			    }
			}
			while (i_31_ > 0) {
			    int i_41_ = -50;
			    int i_42_ = -1;
			    for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
				Class36 class36
				    = Class28.aClass36Array666[i_43_];
				if (class36.anInt782
				    != Class67_Sub1_Sub16.anInt4087) {
				    if (class36.anInt776 > i_41_) {
					i_41_ = class36.anInt776;
					i_42_ = i_43_;
				    } else if (class36.anInt776 == i_41_) {
					int i_44_
					    = (class36.anInt767
					       - Class67_Sub16.anInt3080);
					int i_45_ = (class36.anInt783
						     - PacketParser.anInt2120);
					int i_46_
					    = ((Class28.aClass36Array666[i_42_]
						.anInt767)
					       - Class67_Sub16.anInt3080);
					int i_47_ = ((Class28.aClass36Array666
						      [i_42_].anInt783)
						     - PacketParser.anInt2120);
					if (i_44_ * i_44_ + i_45_ * i_45_
					    > i_46_ * i_46_ + i_47_ * i_47_)
					    i_42_ = i_43_;
				    }
				}
			    }
			    if (i_42_ == -1)
				break;
			    Class36 class36 = Class28.aClass36Array666[i_42_];
			    class36.anInt782 = Class67_Sub1_Sub16.anInt4087;
			    if (!Class67_Sub5_Sub12.method955
				 (i_8_, class36.anInt765, class36.anInt778,
				  class36.anInt777, class36.anInt789,
				  class36.aClass131_790.method1769()))
				class36.aClass131_790.method1764
				    (class36.anInt770, Class120.anInt2274,
				     Class106.anInt2054, Class139.anInt2530,
				     Class102.anInt2007,
				     (class36.anInt767
				      - Class67_Sub16.anInt3080),
				     class36.anInt784 - Class34.anInt747,
				     class36.anInt783 - PacketParser.anInt2120,
				     class36.aLong785, i_7_, null);
			    for (int i_48_ = class36.anInt765;
				 i_48_ <= class36.anInt778; i_48_++) {
				for (int i_49_ = class36.anInt777;
				     i_49_ <= class36.anInt789; i_49_++) {
				    Class67_Sub24 class67_sub24_50_
					= class67_sub24s[i_48_][i_49_];
				    if (class67_sub24_50_.anInt3225 != 0)
					Class126_Sub4.aClass50_3464.method436
					    (class67_sub24_50_, false);
				    else if ((i_48_ != i || i_49_ != i_6_)
					     && class67_sub24_50_.aBoolean3231)
					Class126_Sub4.aClass50_3464.method436
					    (class67_sub24_50_, false);
				}
			    }
			}
			if (class67_sub24.aBoolean3226)
			    continue;
		    } catch (Exception exception) {
			class67_sub24.aBoolean3226 = false;
		    }
		}
		if (class67_sub24.aBoolean3231) {
		    if (class67_sub24.anInt3225 == 0) {
			if (i <= Class67_Sub1_Sub9.anInt3941
			    && i > Class55_Sub2.anInt2806) {
			    Class67_Sub24 class67_sub24_51_
				= class67_sub24s[i - 1][i_6_];
			    if (class67_sub24_51_ != null
				&& class67_sub24_51_.aBoolean3231)
				continue;
			}
			if (i >= Class67_Sub1_Sub9.anInt3941
			    && i < Class80.anInt1627 - 1) {
			    Class67_Sub24 class67_sub24_52_
				= class67_sub24s[i + 1][i_6_];
			    if (class67_sub24_52_ != null
				&& class67_sub24_52_.aBoolean3231)
				continue;
			}
			if (i_6_ <= Class67_Sub1_Sub7.anInt3905
			    && i_6_ > Class67_Sub5_Sub13.anInt4711) {
			    Class67_Sub24 class67_sub24_53_
				= class67_sub24s[i][i_6_ - 1];
			    if (class67_sub24_53_ != null
				&& class67_sub24_53_.aBoolean3231)
				continue;
			}
			if (i_6_ >= Class67_Sub1_Sub7.anInt3905
			    && i_6_ < Class69.anInt1389 - 1) {
			    Class67_Sub24 class67_sub24_54_
				= class67_sub24s[i][i_6_ + 1];
			    if (class67_sub24_54_ != null
				&& class67_sub24_54_.aBoolean3231)
				continue;
			}
			class67_sub24.aBoolean3231 = false;
			Class67_Sub5_Sub1.anInt4463--;
			Class88 class88 = class67_sub24.aClass88_3220;
			if (class88 != null && class88.anInt1818 != 0) {
			    if (class88.aClass131_1816 != null)
				class88.aClass131_1816.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     (class88.anInt1823 - Class34.anInt747
				      - class88.anInt1818),
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			    if (class88.aClass131_1820 != null)
				class88.aClass131_1820.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     (class88.anInt1823 - Class34.anInt747
				      - class88.anInt1818),
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			    if (class88.aClass131_1825 != null)
				class88.aClass131_1825.method1764
				    (0, Class120.anInt2274, Class106.anInt2054,
				     Class139.anInt2530, Class102.anInt2007,
				     (class88.anInt1826
				      - Class67_Sub16.anInt3080),
				     (class88.anInt1823 - Class34.anInt747
				      - class88.anInt1818),
				     class88.anInt1815 - PacketParser.anInt2120,
				     class88.aLong1819, i_7_, null);
			}
			if (class67_sub24.anInt3228 != 0) {
			    Class94 class94 = class67_sub24.aClass94_3224;
			    if (class94 != null
				&& !Class19.method191(i_8_, i, i_6_,
						      class94
							  .aClass131_1894
							  .method1769())) {
				if ((class94.anInt1898
				     & class67_sub24.anInt3228)
				    != 0)
				    class94.aClass131_1894.method1764
					(0, Class120.anInt2274,
					 Class106.anInt2054,
					 Class139.anInt2530,
					 Class102.anInt2007,
					 (class94.anInt1889
					  - Class67_Sub16.anInt3080
					  + class94.anInt1893),
					 class94.anInt1890 - Class34.anInt747,
					 (class94.anInt1887
					  - PacketParser.anInt2120
					  + class94.anInt1897),
					 class94.aLong1886, i_7_, null);
				else if (class94.anInt1898 == 256) {
				    int i_55_ = (class94.anInt1889
						 - Class67_Sub16.anInt3080);
				    int i_56_
					= class94.anInt1890 - Class34.anInt747;
				    int i_57_ = (class94.anInt1887
						 - PacketParser.anInt2120);
				    int i_58_ = class94.anInt1892;
				    int i_59_;
				    if (i_58_ == 1 || i_58_ == 2)
					i_59_ = -i_55_;
				    else
					i_59_ = i_55_;
				    int i_60_;
				    if (i_58_ == 2 || i_58_ == 3)
					i_60_ = -i_57_;
				    else
					i_60_ = i_57_;
				    if (i_60_ >= i_59_)
					class94.aClass131_1894.method1764
					    (0, Class120.anInt2274,
					     Class106.anInt2054,
					     Class139.anInt2530,
					     Class102.anInt2007,
					     i_55_ + class94.anInt1893, i_56_,
					     i_57_ + class94.anInt1897,
					     class94.aLong1886, i_7_, null);
				    else if (class94.aClass131_1896 != null)
					class94.aClass131_1896.method1764
					    (0, Class120.anInt2274,
					     Class106.anInt2054,
					     Class139.anInt2530,
					     Class102.anInt2007, i_55_, i_56_,
					     i_57_, class94.aLong1886, i_7_,
					     null);
				}
			    }
			    Class58 class58 = class67_sub24.aClass58_3221;
			    if (class58 != null) {
				if ((class58.anInt1122
				     & class67_sub24.anInt3228) != 0
				    && !Class144.method1968(i_8_, i, i_6_,
							    class58.anInt1122))
				    class58.aClass131_1115.method1764
					(0, Class120.anInt2274,
					 Class106.anInt2054,
					 Class139.anInt2530,
					 Class102.anInt2007,
					 (class58.anInt1120
					  - Class67_Sub16.anInt3080),
					 class58.anInt1124 - Class34.anInt747,
					 (class58.anInt1125
					  - PacketParser.anInt2120),
					 class58.aLong1118, i_7_, null);
				if ((class58.anInt1123
				     & class67_sub24.anInt3228) != 0
				    && !Class144.method1968(i_8_, i, i_6_,
							    class58.anInt1123))
				    class58.aClass131_1121.method1764
					(0, Class120.anInt2274,
					 Class106.anInt2054,
					 Class139.anInt2530,
					 Class102.anInt2007,
					 (class58.anInt1120
					  - Class67_Sub16.anInt3080),
					 class58.anInt1124 - Class34.anInt747,
					 (class58.anInt1125
					  - PacketParser.anInt2120),
					 class58.aLong1118, i_7_, null);
			    }
			}
			if (i_7_ < Class67_Sub1_Sub13.anInt4024 - 1) {
			    Class67_Sub24 class67_sub24_61_
				= (Class76.aClass67_Sub24ArrayArrayArray1578
				   [i_7_ + 1][i][i_6_]);
			    if (class67_sub24_61_ != null
				&& class67_sub24_61_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_61_, false);
			}
			if (i < Class67_Sub1_Sub9.anInt3941) {
			    Class67_Sub24 class67_sub24_62_
				= class67_sub24s[i + 1][i_6_];
			    if (class67_sub24_62_ != null
				&& class67_sub24_62_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_62_, false);
			}
			if (i_6_ < Class67_Sub1_Sub7.anInt3905) {
			    Class67_Sub24 class67_sub24_63_
				= class67_sub24s[i][i_6_ + 1];
			    if (class67_sub24_63_ != null
				&& class67_sub24_63_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_63_, false);
			}
			if (i > Class67_Sub1_Sub9.anInt3941) {
			    Class67_Sub24 class67_sub24_64_
				= class67_sub24s[i - 1][i_6_];
			    if (class67_sub24_64_ != null
				&& class67_sub24_64_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_64_, false);
			}
			if (i_6_ > Class67_Sub1_Sub7.anInt3905) {
			    Class67_Sub24 class67_sub24_65_
				= class67_sub24s[i][i_6_ - 1];
			    if (class67_sub24_65_ != null
				&& class67_sub24_65_.aBoolean3231)
				Class126_Sub4.aClass50_3464
				    .method436(class67_sub24_65_, false);
			}
		    }
		}
	    }
	}
    }
    
    public void focusLost(FocusEvent arg0) {
	try {
	    Class67_Sub22.aBoolean3184 = false;
	    anInt31++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.focusLost("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void stop() {
	try {
	    anInt28++;
	    if (Class68.anApplet_Sub1_1360 == this
		&& !RuntimeException_Sub1.aBoolean2625)
		Class124.aLong2323 = Class39.method337(19644) - -4000L;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.stop(" + ')');
	}
    }
    
    public URL getDocumentBase() {
	try {
	    anInt2++;
	    if (Class120.aFrame2272 != null)
		return null;
	    if (Class124.aSignLink_2335 != null
		&& this != Class124.aSignLink_2335.anApplet940)
		return Class124.aSignLink_2335.anApplet940.getDocumentBase();
	    return super.getDocumentBase();
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.getDocumentBase(" + ')');
	}
    }
    
    public void windowClosed(WindowEvent arg0) {
	try {
	    anInt16++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.windowClosed("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public abstract void method21(boolean bool);
    
    public void update(Graphics arg0) {
	try {
	    paint(arg0);
	    anInt19++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.update(" + (arg0 != null
							      ? "{...}"
							      : "null") + ')');
	}
    }
    
    public void windowIconified(WindowEvent arg0) {
	try {
	    anInt30++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.windowIconified("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public String getParameter(String arg0) {
	try {
	    anInt43++;
	    if (Class120.aFrame2272 != null)
		return null;
	    if (Class124.aSignLink_2335 != null
		&& Class124.aSignLink_2335.anApplet940 != this)
		return Class124.aSignLink_2335.anApplet940.getParameter(arg0);
	    return super.getParameter(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.getParameter("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public abstract void init();
    
    public static void method22(int arg0) {
	try {
	    aRSString_25 = null;
	    aRSString_11 = null;
	    aRSString_48 = null;
	    aRSString_26 = null;
	    aRSString_20 = null;
	    aRSString_40 = null;
	    aRSStringArray3 = null;
	    aRSString_36 = null;
	    aRSString_23 = null;
	    anIntArray35 = null;
	    aRSString_1 = null;
	    aRSString_47 = null;
	    aRSString_29 = null;
	    aShortArray21 = null;
	    if (arg0 > 69) {
		aRSString_42 = null;
		aRSString_44 = null;
		aRSString_17 = null;
		aRSString_10 = null;
		aRSString_33 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.J(" + arg0 + ')');
	}
    }
    
    public abstract void method23(int i);
    
    public static void providesignlink(SignLink arg0) {
	try {
	    anInt45++;
	    Class16.aSignLink_475 = Class124.aSignLink_2335 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.providesignlink("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public abstract void method24(int i);
    
    public synchronized void method25(byte arg0) {
	try {
	    int i = 118 % ((arg0 - -10) / 38);
	    anInt49++;
	    if (Class67_Sub5_Sub12.aCanvas4698 != null) {
		Class67_Sub5_Sub12.aCanvas4698.removeFocusListener(this);
		Class67_Sub5_Sub12.aCanvas4698.getParent()
		    .remove(Class67_Sub5_Sub12.aCanvas4698);
	    }
	    Container container;
	    if (Class7.aFrame223 != null)
		container = Class7.aFrame223;
	    else if (Class120.aFrame2272 != null)
		container = Class120.aFrame2272;
	    else
		container = Class124.aSignLink_2335.anApplet940;
	    container.setLayout(null);
	    Class67_Sub5_Sub12.aCanvas4698 = new Canvas_Sub1(this);
	    container.add(Class67_Sub5_Sub12.aCanvas4698);
	    Class67_Sub5_Sub12.aCanvas4698.setSize(Class56.anInt1097,
						   Class49.anInt1010);
	    Class67_Sub5_Sub12.aCanvas4698.setVisible(true);
	    if (Class120.aFrame2272 == container) {
		Insets insets = Class120.aFrame2272.getInsets();
		Class67_Sub5_Sub12.aCanvas4698.setLocation
		    (Class67_Sub1_Sub16_Sub1.anInt5093 + insets.left,
		     insets.top + Class67_Sub1_Sub30.anInt4272);
	    } else
		Class67_Sub5_Sub12.aCanvas4698.setLocation
		    (Class67_Sub1_Sub16_Sub1.anInt5093,
		     Class67_Sub1_Sub30.anInt4272);
	    Class67_Sub5_Sub12.aCanvas4698.addFocusListener(this);
	    Class67_Sub5_Sub12.aCanvas4698.requestFocus();
	    Class67_Sub22.aBoolean3184 = true;
	    Class141.aBoolean2560 = true;
	    Class56.aBoolean1098 = true;
	    Class140.aBoolean2544 = false;
	    Class67_Sub5_Sub19.aLong4826 = Class39.method337(19644);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.C(" + arg0 + ')');
	}
    }
    
    public void method26(int arg0, int arg1, int arg2, int arg3, String arg4,
			 int arg5, boolean arg6, int arg7) {
	try {
	    try {
		Class67_Sub1_Sub16_Sub1.anInt5093 = 0;
		Class67_Sub1_Sub30.anInt4272 = 0;
		Class86.anInt1761 = arg3;
		if (arg7 != -11014)
		    destroy();
		Class99.anInt1963 = Class49.anInt1010 = arg5;
		Class68.anApplet_Sub1_1360 = this;
		Class67_Sub1_Sub37.anInt4413 = Class56.anInt1097 = arg0;
		Class120.aFrame2272 = new Frame();
		Class120.aFrame2272.setTitle("Jagex");
		Class120.aFrame2272.setResizable(true);
		Class120.aFrame2272.addWindowListener(this);
		Class120.aFrame2272.setVisible(true);
		Class120.aFrame2272.toFront();
		Insets insets = Class120.aFrame2272.getInsets();
		Class120.aFrame2272.setSize((insets.right + insets.left
					     + Class67_Sub1_Sub37.anInt4413),
					    insets.bottom + (Class99.anInt1963
							     - -insets.top));
		Class16.aSignLink_475 = Class124.aSignLink_2335
		    = new SignLink(null, arg1, arg4, arg2);
		Class31 class31
		    = Class124.aSignLink_2335.method404(arg7 + 11016, this, 1);
		while (class31.anInt706 == 0)
		    Class67_Sub1_Sub23.method726(-124, 10L);
	    } catch (Exception exception) {
		Class104.method1563(exception, null, 1);
	    }
	    anInt50++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ',' + arg6 + ','
						+ arg7 + ')'));
	}
    }
    
    public void windowOpened(WindowEvent arg0) {
	try {
	    anInt27++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.windowOpened("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method27(byte arg0) {
	try {
	    anInt14++;
	    if (arg0 <= 8)
		getDocumentBase();
	    long l = Class39.method337(19644);
	    long l_66_ = Class124.aLongArray2325[Class67_Sub11_Sub2.anInt4853];
	    if (l_66_ != 0L
		&& (l_66_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
		/* empty */
	    }
	    Class124.aLongArray2325[Class67_Sub11_Sub2.anInt4853] = l;
	    Class67_Sub11_Sub2.anInt4853
		= 0x1f & Class67_Sub11_Sub2.anInt4853 + 1;
	    synchronized (this) {
		Class141.aBoolean2560 = Class67_Sub22.aBoolean3184;
	    }
	    method17(121);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.M(" + arg0 + ')');
	}
    }
    
    public void method28(int arg0) {
	try {
	    anInt18++;
	    if (arg0 != -10911)
		aRSString_40 = null;
	    long l = Class39.method337(19644);
	    long l_67_ = Class67_Sub1_Sub1.aLongArray3821[Class16.anInt466];
	    Class67_Sub1_Sub1.aLongArray3821[Class16.anInt466] = l;
	    Class16.anInt466 = 1 + Class16.anInt466 & 0x1f;
	    if ((l_67_ ^ 0xffffffffffffffffL) != -1L
		&& (l_67_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
		int i = (int) (-l_67_ + l);
		Class27.anInt624 = ((i >> 2006861761) + 32000) / i;
	    }
	    if (Class70.anInt1401++ > 50) {
		Class70.anInt1401 -= 50;
		Class56.aBoolean1098 = true;
		Class67_Sub5_Sub12.aCanvas4698.setSize(Class56.anInt1097,
						       Class49.anInt1010);
		Class67_Sub5_Sub12.aCanvas4698.setVisible(true);
		if (Class120.aFrame2272 == null || Class7.aFrame223 != null)
		    Class67_Sub5_Sub12.aCanvas4698.setLocation
			(Class67_Sub1_Sub16_Sub1.anInt5093,
			 Class67_Sub1_Sub30.anInt4272);
		else {
		    Insets insets = Class120.aFrame2272.getInsets();
		    Class67_Sub5_Sub12.aCanvas4698.setLocation
			(Class67_Sub1_Sub16_Sub1.anInt5093 + insets.left,
			 insets.top - -Class67_Sub1_Sub30.anInt4272);
		}
	    }
	    method24(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.O(" + arg0 + ')');
	}
    }
    
    public void method29(int arg0, boolean arg1) {
	try {
	    anInt13++;
	    if (arg0 == -864) {
		synchronized (this) {
		    if (RuntimeException_Sub1.aBoolean2625)
			return;
		    RuntimeException_Sub1.aBoolean2625 = true;
		}
		if (Class124.aSignLink_2335.anApplet940 != null)
		    Class124.aSignLink_2335.anApplet940.destroy();
		try {
		    method23(0);
		} catch (Exception exception) {
		    /* empty */
		}
		if (Class67_Sub5_Sub12.aCanvas4698 != null) {
		    try {
			Class67_Sub5_Sub12.aCanvas4698
			    .removeFocusListener(this);
			Class67_Sub5_Sub12.aCanvas4698.getParent()
			    .remove(Class67_Sub5_Sub12.aCanvas4698);
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		if (Class124.aSignLink_2335 != null) {
		    try {
			Class124.aSignLink_2335.method400(126);
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		method21(true);
		if (Class120.aFrame2272 != null) {
		    try {
			System.exit(0);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		System.out.println("Shutdown complete - clean:" + arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("p.G(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public URL getCodeBase() {
	try {
	    anInt38++;
	    if (Class120.aFrame2272 != null)
		return null;
	    if (Class124.aSignLink_2335 != null
		&& Class124.aSignLink_2335.anApplet940 != this)
		return Class124.aSignLink_2335.anApplet940.getCodeBase();
	    return super.getCodeBase();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void destroy() {
	try {
	    anInt22++;
	    if (Class68.anApplet_Sub1_1360 == this
		&& !RuntimeException_Sub1.aBoolean2625) {
		Class124.aLong2323 = Class39.method337(19644);
		Class67_Sub1_Sub23.method726(-105, 5000L);
		Class16.aSignLink_475 = null;
		method29(-864, false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.destroy(" + ')');
	}
    }
    
    public void run() {
	try {
	    anInt24++;
	    try {
		if (SignLink.aString941 != null) {
		    String string = SignLink.aString941.toLowerCase();
		    if (string.indexOf("sun") != -1
			|| (string.indexOf("apple") ^ 0xffffffff) != 0) {
			String string_68_ = SignLink.aString936;
			if (string_68_.equals("1.1")
			    || string_68_.startsWith("1.1.")
			    || string_68_.equals("1.2")
			    || string_68_.startsWith("1.2.")) {
			    method16(31439, "wrongjava");
			    return;
			}
			Class8.anInt348 = 5;
		    } else if (string.indexOf("ibm") != -1
			       && (SignLink.aString936 == null
				   || SignLink.aString936.equals("1.4.2"))) {
			method16(31439, "wrongjava");
			return;
		    }
		}
		if (SignLink.aString936 != null
		    && SignLink.aString936.startsWith("1.")) {
		    int i = 2;
		    int i_69_ = 0;
		    for (/**/; SignLink.aString936.length() > i; i++) {
			int i_70_ = SignLink.aString936.charAt(i);
			if (i_70_ < 48 || i_70_ > 57)
			    break;
			i_69_ = i_69_ * 10 + (i_70_ - 48);
		    }
		    if (i_69_ >= 5)
			Class54.aBoolean1082 = true;
		}
		if (Class124.aSignLink_2335.anApplet940 != null) {
		    Method method = SignLink.aMethod947;
		    if (method != null) {
			try {
			    method.invoke(Class124.aSignLink_2335.anApplet940,
					  new Object[] { Boolean.TRUE });
			} catch (Throwable throwable) {
			    /* empty */
			}
		    }
		}
		Class70_Sub1.method1336(57);
		method25((byte) -90);
		PacketParser.aClass99_2119
		    = Class15.method167(-62, Class49.anInt1010,
					Class67_Sub5_Sub12.aCanvas4698,
					Class56.anInt1097);
		method18((byte) -114);
		Class67_Sub5_Sub6.aClass33_4557
		    = Class76.method1394((byte) 117);
		while ((Class124.aLong2323 ^ 0xffffffffffffffffL) == -1L
		       || Class39.method337(19644) < Class124.aLong2323) {
		    Class87.anInt1814
			= (Class67_Sub5_Sub6.aClass33_4557.method297
			   ((byte) 61, Class8.anInt348,
			    Class67_Sub5_Sub7.anInt4562));
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class87.anInt1814 ^ 0xffffffff);
			 i++)
			method27((byte) 85);
		    method28(-10911);
		    Class67_Sub23.method1287(-3,
					     Class67_Sub5_Sub12.aCanvas4698,
					     Class124.aSignLink_2335);
		}
	    } catch (Exception exception) {
		Class104.method1563(exception, null, 1);
		method16(31439, "crash");
	    }
	    method29(-864, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.run(" + ')');
	}
    }
    
    public AppletContext getAppletContext() {
	try {
	    anInt39++;
	    if (Class120.aFrame2272 != null)
		return null;
	    if (Class124.aSignLink_2335 != null
		&& Class124.aSignLink_2335.anApplet940 != this)
		return Class124.aSignLink_2335.anApplet940.getAppletContext();
	    return super.getAppletContext();
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.getAppletContext(" + ')');
	}
    }
    
    public boolean method30(int arg0) {
	try {
	    anInt4++;
	    String string = getDocumentBase().getHost().toLowerCase();
	    if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
		return true;
	    if (string.equals("runescape.com")
		|| string.endsWith(".runescape.com"))
		return true;
	    if (arg0 != 8)
		aRSString_42 = null;
	    if (string.endsWith("127.0.0.1"))
		return true;
	    for (/**/;
		 (string.length() > 0
		  && (string.charAt(-1 + string.length()) ^ 0xffffffff) <= -49
		  && ((string.charAt(-1 + string.length()) ^ 0xffffffff)
		      >= -58));
		 string = string.substring(0, -1 + string.length())) {
		/* empty */
	    }
	    if (string.endsWith("192.168.1."))
		return true;
	    method16(31439, "invalidhost");
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.D(" + arg0 + ')');
	}
    }
    
    public synchronized void paint(Graphics arg0) {
	do {
	    try {
		anInt9++;
		if (Class68.anApplet_Sub1_1360 == this
		    && !RuntimeException_Sub1.aBoolean2625) {
		    Class56.aBoolean1098 = true;
		    if (!Class54.aBoolean1082
			|| (-Class67_Sub5_Sub19.aLong4826
			    + Class39.method337(19644)) <= 1000L)
			break;
		    Rectangle rectangle = arg0.getClipBounds();
		    if (rectangle == null
			|| (Class67_Sub1_Sub37.anInt4413 <= rectangle.width
			    && ((Class99.anInt1963 ^ 0xffffffff)
				>= (rectangle.height ^ 0xffffffff))))
			Class140.aBoolean2544 = true;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("p.paint("
						    + (arg0 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void start() {
	try {
	    anInt32++;
	    if (this == Class68.anApplet_Sub1_1360
		&& !RuntimeException_Sub1.aBoolean2625)
		Class124.aLong2323 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "p.start(" + ')');
	}
    }
    
    static {
	aRSString_10 = Class134.method1914("Aug", (byte) 76);
	aRSString_33 = Class134.method1914("Feb", (byte) 48);
	aRSString_1 = Class134.method1914("Jun", (byte) 110);
	aRSString_29 = Class134.method1914("May", (byte) 15);
	aRSString_17 = Class134.method1914("Apr", (byte) 43);
	aRSString_36 = Class134.method1914("Jul", (byte) 42);
	aRSString_25 = Class134.method1914("Nov", (byte) 26);
	aRSString_44 = Class134.method1914("red:", (byte) 113);
	aRSString_48 = Class134.method1914("Sep", (byte) 68);
	aRSString_11 = aRSString_44;
	aRSString_40 = Class134.method1914("Oct", (byte) 64);
	aRSString_47 = Class134.method1914("Versteckt", (byte) 38);
	aRSString_20 = aRSString_44;
	aRSString_42 = Class134.method1914("Dec", (byte) 43);
	aRSStringArray3
	    = new RSString[] { aRSString_26, aRSString_33, aRSString_23,
			      aRSString_17, aRSString_29, aRSString_1,
			      aRSString_36, aRSString_10, aRSString_48,
			      aRSString_40, aRSString_25, aRSString_42 };
    }
}
