import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class133
    implements MouseListener, MouseMotionListener, FocusListener
{
    public static RSString aRSString_2446
	= Class134.method1914(" from your friend list first)3", (byte) 95);
    public static int anInt2447;
    public static int anInt2448;
    public static Class9 aClass9_2449;
    public static int anInt2450;
    public static int anInt2451;
    public static int anInt2452;
    public static int anInt2453;
    public static int anInt2454;
    public static RSString aRSString_2455 = aRSString_2446;
    public static Class136 aClass136_2456 = new Class136(50);
    public static int anInt2457;
    public static int anInt2458;
    public static int anInt2459;
    public static int anInt2460;
    public static int anInt2461;
    
    public static void method1906(int arg0) {
	aClass136_2456 = null;
	aRSString_2446 = null;
	aRSString_2455 = null;
	aClass9_2449 = null;
	if (arg0 >= -11)
	    aRSString_2455 = null;
    }
    
    public void focusGained(FocusEvent arg0) {
	anInt2461++;
    }
    
    public static Class119_Sub1 method1907(int arg0) {
	anInt2458++;
	Class119_Sub1 class119_sub1
	    = new Class119_Sub1(Class3.anInt119, Class80.anInt1628,
				Class67_Sub23.anIntArray3201[0],
				Class67_Sub6.anIntArray2870[0],
				Class55_Sub3.anIntArray2810[0],
				Class67_Sub5_Sub4.anIntArray4510[arg0],
				Class67_Sub1_Sub35.aByteArrayArray4357[0],
				Class73.anIntArray1462);
	Class67_Sub5_Sub11.method937(false);
	return class119_sub1;
    }
    
    public static Class64 method1908(int arg0, int arg1) {
	anInt2451++;
	Class64 class64 = (Class64) Class67_Sub1_Sub7.aClass136_3908
					.method1924((long) arg0, false);
	if (class64 != null)
	    return class64;
	byte[] is
	    = Class86.aClass9_1762.method138(-809612665,
					     Class43.method381(arg0, 127),
					     Class67_Sub1_Sub16_Sub1
						 .method693(arg0, 23614));
	class64 = new Class64();
	class64.anInt1205 = arg0;
	if (is != null)
	    class64.method572(new Stream(is), (byte) -28);
	class64.method577((byte) 46);
	int i = 25 / ((arg1 - 48) / 38);
	Class67_Sub1_Sub7.aClass136_3908.method1926((long) arg0, class64,
						    (byte) -71);
	return class64;
    }
    
    public synchronized void mouseExited(MouseEvent arg0) {
	anInt2453++;
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class67_Sub1_Sub25.anInt4218 = -1;
	    Class52.anInt1048 = -1;
	}
    }
    
    public void mouseClicked(MouseEvent arg0) {
	if (arg0.isPopupTrigger())
	    arg0.consume();
	anInt2454++;
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	if (Class6.aClass133_154 != null)
	    Class87.anInt1813 = 0;
	anInt2448++;
    }
    
    public synchronized void mouseEntered(MouseEvent arg0) {
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class67_Sub1_Sub25.anInt4218 = arg0.getX();
	    Class52.anInt1048 = arg0.getY();
	}
	anInt2450++;
    }
    
    public synchronized void mouseMoved(MouseEvent arg0) {
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class67_Sub1_Sub25.anInt4218 = arg0.getX();
	    Class52.anInt1048 = arg0.getY();
	}
	anInt2447++;
    }
    
    public synchronized void mouseDragged(MouseEvent arg0) {
	anInt2460++;
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class67_Sub1_Sub25.anInt4218 = arg0.getX();
	    Class52.anInt1048 = arg0.getY();
	}
    }
    
    public static void method1909(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11,
				  int arg12, int arg13, int arg14, int arg15,
				  int arg16, int arg17, int arg18, int arg19) {
	if (arg3 == 0) {
	    Class84 class84
		= new Class84(arg10, arg11, arg12, arg13, -1, arg18, false);
	    for (int i = arg0; i >= 0; i--) {
		if (Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
		    == null)
		    Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
			= new Class67_Sub24(i, arg1, arg2);
	    }
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		.aClass84_3227
		= class84;
	} else if (arg3 == 1) {
	    Class84 class84
		= new Class84(arg14, arg15, arg16, arg17, arg5, arg19,
			      arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
	    for (int i = arg0; i >= 0; i--) {
		if (Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
		    == null)
		    Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
			= new Class67_Sub24(i, arg1, arg2);
	    }
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		.aClass84_3227
		= class84;
	} else {
	    Class71 class71
		= new Class71(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8,
			      arg9, arg10, arg11, arg12, arg13, arg14, arg15,
			      arg16, arg17, arg18, arg19);
	    for (int i = arg0; i >= 0; i--) {
		if (Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
		    == null)
		    Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
			= new Class67_Sub24(i, arg1, arg2);
	    }
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		.aClass71_3219
		= class71;
	}
    }
    
    public synchronized void mousePressed(MouseEvent arg0) {
	anInt2452++;
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class67_Sub1_Sub12.anInt4006 = arg0.getX();
	    Class14.anInt447 = arg0.getY();
	    Class125.aLong2342 = Class39.method337(19644);
	    if (!arg0.isMetaDown()) {
		Class131_Sub7.anInt3768 = 1;
		Class87.anInt1813 = 1;
	    } else {
		Class131_Sub7.anInt3768 = 2;
		Class87.anInt1813 = 2;
	    }
	    int i = arg0.getModifiers();
	}
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
    
    public synchronized void mouseReleased(MouseEvent arg0) {
	anInt2457++;
	if (Class6.aClass133_154 != null) {
	    Class67_Sub1_Sub12.anInt4014 = 0;
	    Class87.anInt1813 = 0;
	    int i = arg0.getModifiers();
	}
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
}
