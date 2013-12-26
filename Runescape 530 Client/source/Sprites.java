/* Sprites - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Sprites
{
    public static String aString806
	= ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
	   + String.valueOf('\u00c4') + String.valueOf('\u00cb')
	   + String.valueOf('\u00cf') + String.valueOf('\u00d6')
	   + String.valueOf('\u00dc') + String.valueOf('\u00e4')
	   + String.valueOf('\u00eb') + String.valueOf('\u00ef')
	   + String.valueOf('\u00f6') + String.valueOf('\u00fc')
	   + String.valueOf('\u00ff') + String.valueOf('\u00df')
	   + String.valueOf('\u00c1') + String.valueOf('\u00c0')
	   + String.valueOf('\u00c9') + String.valueOf('\u00c8')
	   + String.valueOf('\u00cd') + String.valueOf('\u00cc')
	   + String.valueOf('\u00d3') + String.valueOf('\u00d2')
	   + String.valueOf('\u00da') + String.valueOf('\u00d9')
	   + String.valueOf('\u00e1') + String.valueOf('\u00e0')
	   + String.valueOf('\u00e9') + String.valueOf('\u00e8')
	   + String.valueOf('\u00ed') + String.valueOf('\u00ec')
	   + String.valueOf('\u00f3') + String.valueOf('\u00f2')
	   + String.valueOf('\u00fa') + String.valueOf('\u00f9')
	   + String.valueOf('\u00c2') + String.valueOf('\u00ca')
	   + String.valueOf('\u00ce') + String.valueOf('\u00d4')
	   + String.valueOf('\u00db') + String.valueOf('\u00e2')
	   + String.valueOf('\u00ea') + String.valueOf('\u00ee')
	   + String.valueOf('\u00f4') + String.valueOf('\u00fb')
	   + String.valueOf('\u00c6') + String.valueOf('\u00e6'));
    public byte[] aByteArray807;
    public boolean aBoolean808;
    public int anInt809 = 0;
    public static int anInt810 = aString806.length();
    public static int[] anIntArray811 = new int[256];
    
    public void method327(RSString arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	if (aBoolean808 || arg3 == 0)
	    arg4 = false;
	for (int i = 0; i < arg0.method531((byte) 67); i++) {
	    int i_0_ = anIntArray811[arg0.method499(i, -8)];
	    if (arg4) {
		method333(i_0_, arg1 + 1, arg2, 1, aByteArray807);
		method333(i_0_, arg1, arg2 + 1, 1, aByteArray807);
	    }
	    method333(i_0_, arg1, arg2, arg3, aByteArray807);
	    arg1 += aByteArray807[i_0_ + 7];
	}
    }
    
    public void method328(RSString arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	int i = method329(arg0) / 2;
	int i_1_ = method334();
	if (arg1 - i <= Class121.anInt2301 && arg1 + i >= Class121.anInt2298
	    && arg2 - i_1_ <= Class121.anInt2297 && arg2 >= 0)
	    method327(arg0, arg1 - i, arg2, arg3, arg4);
    }
    
    public int method329(RSString arg0) {
	int i = 0;
	for (int i_2_ = 0; i_2_ < arg0.method531((byte) 60); i_2_++) {
	    if (arg0.method499(i_2_, -61) == 64
		&& i_2_ + 4 < arg0.method531((byte) 78)
		&& arg0.method499(i_2_ + 4, -38) == 64)
		i_2_ += 4;
	    else if (arg0.method499(i_2_, -118) == 126
		     && i_2_ + 4 < arg0.method531((byte) 99)
		     && arg0.method499(i_2_ + 4, 8) == 126)
		i_2_ += 4;
	    else
		i += (aByteArray807
		      [anIntArray811[arg0.method499(i_2_, -106)] + 7]);
	}
	return i;
    }
    
    public int method330() {
	return aByteArray807[8] - 1;
    }
    
    public void method331(Font arg0, FontMetrics arg1, char arg2, int arg3,
			  boolean arg4) {
	int i = arg1.charWidth(arg2);
	int i_3_ = i;
	if (arg4) {
	    try {
		if (arg2 == '/')
		    arg4 = false;
		if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v'
		    || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A'
		    || arg2 == 'V' || arg2 == 'W')
		    i++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_4_ = arg1.getMaxAscent();
	int i_5_ = arg1.getMaxAscent() + arg1.getMaxDescent();
	int i_6_ = arg1.getHeight();
	Image image = Class67_Sub5_Sub12.aCanvas4698.createImage(i, i_5_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i, i_5_);
	graphics.setColor(Color.white);
	graphics.setFont(arg0);
	graphics.drawString(String.valueOf(arg2), 0, i_4_);
	if (arg4)
	    graphics.drawString(String.valueOf(arg2), 1, i_4_);
	int[] is = new int[i * i_5_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i, i_5_, is, 0, i);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_7_ = 0;
	int i_8_ = 0;
	int i_9_ = i;
	int i_10_ = i_5_;
    while_0_:
	for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
	    for (int i_12_ = 0; i_12_ < i; i_12_++) {
		int i_13_ = is[i_12_ + i_11_ * i];
		if ((i_13_ & 0xffffff) != 0) {
		    i_8_ = i_11_;
		    break while_0_;
		}
	    }
	}
    while_1_:
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
		int i_16_ = is[i_14_ + i_15_ * i];
		if ((i_16_ & 0xffffff) != 0) {
		    i_7_ = i_14_;
		    break while_1_;
		}
	    }
	}
    while_2_:
	for (int i_17_ = i_5_ - 1; i_17_ >= 0; i_17_--) {
	    for (int i_18_ = 0; i_18_ < i; i_18_++) {
		int i_19_ = is[i_18_ + i_17_ * i];
		if ((i_19_ & 0xffffff) != 0) {
		    i_10_ = i_17_ + 1;
		    break while_2_;
		}
	    }
	}
    while_3_:
	for (int i_20_ = i - 1; i_20_ >= 0; i_20_--) {
	    for (int i_21_ = 0; i_21_ < i_5_; i_21_++) {
		int i_22_ = is[i_20_ + i_21_ * i];
		if ((i_22_ & 0xffffff) != 0) {
		    i_9_ = i_20_ + 1;
		    break while_3_;
		}
	    }
	}
	aByteArray807[arg3 * 9] = (byte) (anInt809 / 16384);
	aByteArray807[arg3 * 9 + 1] = (byte) (anInt809 / 128 & 0x7f);
	aByteArray807[arg3 * 9 + 2] = (byte) (anInt809 & 0x7f);
	aByteArray807[arg3 * 9 + 3] = (byte) (i_9_ - i_7_);
	aByteArray807[arg3 * 9 + 4] = (byte) (i_10_ - i_8_);
	aByteArray807[arg3 * 9 + 5] = (byte) i_7_;
	aByteArray807[arg3 * 9 + 6] = (byte) (i_4_ - i_8_);
	aByteArray807[arg3 * 9 + 7] = (byte) i_3_;
	aByteArray807[arg3 * 9 + 8] = (byte) i_6_;
	for (int i_23_ = i_8_; i_23_ < i_10_; i_23_++) {
	    for (int i_24_ = i_7_; i_24_ < i_9_; i_24_++) {
		int i_25_ = is[i_24_ + i_23_ * i] & 0xff;
		if (i_25_ > 30 && i_25_ < 230)
		    aBoolean808 = true;
		aByteArray807[anInt809++] = (byte) i_25_;
	    }
	}
    }
    
    public void method332(int[] arg0, byte[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_26_ = -arg6; i_26_ < 0; i_26_++) {
	    for (int i_27_ = i; i_27_ < 0; i_27_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_28_ = arg5; i_28_ < 0; i_28_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method333(int arg0, int arg1, int arg2, int arg3,
			  byte[] arg4) {
	int i = arg1 + arg4[arg0 + 5];
	int i_29_ = arg2 - arg4[arg0 + 6];
	int i_30_ = arg4[arg0 + 3];
	int i_31_ = arg4[arg0 + 4];
	int i_32_ = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
	int i_33_ = i + i_29_ * Class121.anInt2296;
	int i_34_ = Class121.anInt2296 - i_30_;
	int i_35_ = 0;
	if (i_29_ < Class121.anInt2295) {
	    int i_36_ = Class121.anInt2295 - i_29_;
	    i_31_ -= i_36_;
	    i_29_ = Class121.anInt2295;
	    i_32_ += i_36_ * i_30_;
	    i_33_ += i_36_ * Class121.anInt2296;
	}
	if (i_29_ + i_31_ >= Class121.anInt2297)
	    i_31_ -= i_29_ + i_31_ - Class121.anInt2297 + 1;
	if (i < Class121.anInt2298) {
	    int i_37_ = Class121.anInt2298 - i;
	    i_30_ -= i_37_;
	    i = Class121.anInt2298;
	    i_32_ += i_37_;
	    i_33_ += i_37_;
	    i_35_ += i_37_;
	    i_34_ += i_37_;
	}
	if (i + i_30_ >= Class121.anInt2301) {
	    int i_38_ = i + i_30_ - Class121.anInt2301 + 1;
	    i_30_ -= i_38_;
	    i_35_ += i_38_;
	    i_34_ += i_38_;
	}
	if (i_30_ > 0 && i_31_ > 0) {
	    if (aBoolean808)
		method336(Class121.anIntArray2300, arg4, arg3, i_32_, i_33_,
			  i_30_, i_31_, i_34_, i_35_);
	    else
		method332(Class121.anIntArray2300, arg4, arg3, i_32_, i_33_,
			  i_30_, i_31_, i_34_, i_35_);
	}
    }
    
    public int method334() {
	return aByteArray807[6];
    }
    
    public Sprites(int arg0, boolean arg1, Component arg2) {
	aBoolean808 = false;
	aByteArray807 = new byte[100000];
	anInt809 = anInt810 * 9;
	aBoolean808 = false;
	Font font = new Font("Helvetica", arg1 ? 1 : 0, arg0);
	FontMetrics fontmetrics = arg2.getFontMetrics(font);
	for (int i = 0; i < anInt810; i++)
	    method331(font, fontmetrics, aString806.charAt(i), i, false);
	if (arg1 && aBoolean808) {
	    anInt809 = anInt810 * 9;
	    aBoolean808 = false;
	    font = new Font("Helvetica", 0, arg0);
	    fontmetrics = arg2.getFontMetrics(font);
	    for (int i = 0; i < anInt810; i++)
		method331(font, fontmetrics, aString806.charAt(i), i, false);
	    if (!aBoolean808) {
		anInt809 = anInt810 * 9;
		aBoolean808 = false;
		for (int i = 0; i < anInt810; i++)
		    method331(font, fontmetrics, aString806.charAt(i), i,
			      true);
	    }
	}
	byte[] is = new byte[anInt809];
	for (int i = 0; i < anInt809; i++)
	    is[i] = aByteArray807[i];
	aByteArray807 = is;
    }
    
    public static void method335() {
	aString806 = null;
	anIntArray811 = null;
    }
    
    public void method336(int[] arg0, byte[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	for (int i = -arg6; i < 0; i++) {
	    for (int i_39_ = -arg5; i_39_ < 0; i_39_++) {
		int i_40_ = arg1[arg3++] & 0xff;
		if (i_40_ > 30) {
		    if (i_40_ >= 230)
			arg0[arg4++] = arg2;
		    else {
			int i_41_ = arg0[arg4];
			arg0[arg4++] = ((((arg2 & 0xff00ff) * i_40_
					  + (i_41_ & 0xff00ff) * (256 - i_40_))
					 & ~0xff00ff)
					+ (((arg2 & 0xff00) * i_40_
					    + (i_41_ & 0xff00) * (256 - i_40_))
					   & 0xff0000)) >> 8;
		    }
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_42_ = aString806.indexOf(i);
	    if (i_42_ == -1)
		i_42_ = 74;
	    anIntArray811[i] = i_42_ * 9;
	}
    }
}
