/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class56
{
    public static int anInt1092;
    public static int anInt1093;
    public static int anInt1094;
    public static RSString aRSString_1095;
    public static int anInt1096;
    public static int anInt1097;
    public static volatile boolean aBoolean1098 = true;
    public static RSString aRSString_1099
	= Class134.method1914(" has logged out)3", (byte) 87);
    public static int anInt1100;
    public static int anInt1101;
    public static RSString aRSString_1102;
    
    public static void method482(byte arg0, int arg1, Class73[] arg2,
				 byte[] arg3, int arg4, boolean arg5) {
	try {
	    anInt1094++;
	    Stream Stream = new Stream(arg3);
	    int i = -1;
	    if (arg0 <= -101) {
		for (;;) {
		    int i_0_ = Stream.method1082((byte) -57);
		    if (i_0_ == 0)
			break;
		    i += i_0_;
		    int i_1_ = 0;
		    for (;;) {
			int i_2_ = Stream.method1070(-98);
			if ((i_2_ ^ 0xffffffff) == -1)
			    break;
			i_1_ += i_2_ + -1;
			int i_3_ = 0x3f & i_1_;
			int i_4_ = (0xff9 & i_1_) >> 996633990;
			int i_5_ = Stream.readByte((byte) -114);
			int i_6_ = i_1_ >> 1501704236;
			int i_7_ = i_5_ & 0x3;
			int i_8_ = i_5_ >> 1228971618;
			int i_9_ = i_3_ + arg4;
			int i_10_ = arg1 + i_4_;
			if ((i_10_ ^ 0xffffffff) < -1 && i_9_ > 0
			    && i_10_ < 103 && (i_9_ ^ 0xffffffff) > -104) {
			    Class73 class73 = null;
			    if (!arg5) {
				int i_11_ = i_6_;
				if (((Class120.aByteArrayArrayArray2284[1]
				      [i_10_][i_9_]) & 0x2
				     ^ 0xffffffff)
				    == -3)
				    i_11_--;
				if (i_11_ >= 0)
				    class73 = arg2[i_11_];
			    }
			    Class92.method1484(arg5, i_6_, i, i_6_, i_7_, i_8_,
					       i_10_, i_9_, !arg5, class73, 2);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("hi.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5
						+ ')'));
	}
    }
    
    public static void method483(int arg0) {
	anInt1100++;
	if ((Class67_Sub26.anInt3277 ^ 0xffffffff) != -1) {
	    try {
		if (++Class67_Sub1_Sub6.anInt3886 > 2000) {
		    if (Class41.aClass117_867 != null) {
			Class41.aClass117_867.method1632((byte) 118);
			Class41.aClass117_867 = null;
		    }
		    if (Class33_Sub2.anInt2774 >= 1) {
			Class67_Sub26.anInt3277 = 0;
			Class91.anInt1857 = -5;
			return;
		    }
		    if ((Class67_Sub9.anInt2968 ^ 0xffffffff)
			!= (Class5.anInt138 ^ 0xffffffff))
			Class67_Sub9.anInt2968 = Class5.anInt138;
		    else
			Class67_Sub9.anInt2968 = Class2.anInt105;
		    Class33_Sub2.anInt2774++;
		    Class67_Sub1_Sub6.anInt3886 = 0;
		    Class67_Sub26.anInt3277 = 1;
		}
		if ((Class67_Sub26.anInt3277 ^ 0xffffffff) == -2) {
		    Class43.aClass31_907
			= Class124.aSignLink_2335.method403((Class67_Sub9
							    .anInt2968),
							   false,
							   (Class67_Sub1_Sub29
							    .aString4265));
		    Class67_Sub26.anInt3277 = 2;
		}
		if (Class67_Sub26.anInt3277 == 2) {
		    if ((Class43.aClass31_907.anInt706 ^ 0xffffffff) == -3)
			throw new IOException();
		    if ((Class43.aClass31_907.anInt706 ^ 0xffffffff) != -2)
			return;
		    Class41.aClass117_867
			= new Class117(((Socket)
					Class43.aClass31_907.anObject705),
				       Class124.aSignLink_2335);
		    Class43.aClass31_907 = null;
		    Class41.aClass117_867.queueBytesToSend(0, Class70_Sub1.outStream.buffer, Class70_Sub1.outStream.currentOffset, (byte) 103);
		    if (Class67_Sub5_Sub9.aClass28_4616 != null)
			Class67_Sub5_Sub9.aClass28_4616.method258(0);
		    if (Class78.aClass28_1606 != null)
			Class78.aClass28_1606.method258(0);
		    int i = Class41.aClass117_867.method1631(arg0 + 18945);
		    if (Class67_Sub5_Sub9.aClass28_4616 != null)
			Class67_Sub5_Sub9.aClass28_4616.method258(0);
		    if (Class78.aClass28_1606 != null)
			Class78.aClass28_1606.method258(0);
		    if (i == 21)
			Class67_Sub26.anInt3277 = 3;
		    else {
			Class91.anInt1857 = i;
			Class67_Sub26.anInt3277 = 0;
			Class41.aClass117_867.method1632((byte) -31);
			Class41.aClass117_867 = null;
			return;
		    }
		}
		if (Class67_Sub26.anInt3277 == 3) {
		    if (Class41.aClass117_867.method1626(arg0 + 1380) < 1)
			return;
		    Class67_Sub1_Sub8.aRSStringArray3924
			= new RSString[Class41.aClass117_867.method1631(17506)];
		    Class67_Sub26.anInt3277 = 4;
		}
		if (arg0 != -1439)
		    aBoolean1098 = true;
		if (Class67_Sub26.anInt3277 == 4) {
		    if ((Class41.aClass117_867.method1626(arg0 + 1538)
			 ^ 0xffffffff)
			<= (8 * Class67_Sub1_Sub8.aRSStringArray3924.length
			    ^ 0xffffffff)) {
			Class54.aPacketStream_1069.currentOffset = 0;
			Class41.aClass117_867.method1629
			    ((byte) -115,
			     Class54.aPacketStream_1069.buffer, 0,
			     8 * Class67_Sub1_Sub8.aRSStringArray3924.length);
			for (int i = 0;
			     ((Class67_Sub1_Sub8.aRSStringArray3924.length
			       ^ 0xffffffff)
			      < (i ^ 0xffffffff));
			     i++)
			    Class67_Sub1_Sub8.aRSStringArray3924[i]
				= (Class67_Sub17.method1250
				   ((byte) -72, Class54
						    .aPacketStream_1069
						    .readLong(-9426)));
			Class67_Sub26.anInt3277 = 0;
			Class91.anInt1857 = 21;
			Class41.aClass117_867.method1632((byte) -94);
			Class41.aClass117_867 = null;
		    }
		}
	    } catch (IOException ioexception) {
		if (Class41.aClass117_867 != null) {
		    Class41.aClass117_867.method1632((byte) -127);
		    Class41.aClass117_867 = null;
		}
		if (Class33_Sub2.anInt2774 < 1) {
		    Class67_Sub26.anInt3277 = 1;
		    Class67_Sub1_Sub6.anInt3886 = 0;
		    Class33_Sub2.anInt2774++;
		    if ((Class5.anInt138 ^ 0xffffffff)
			== (Class67_Sub9.anInt2968 ^ 0xffffffff))
			Class67_Sub9.anInt2968 = Class2.anInt105;
		    else
			Class67_Sub9.anInt2968 = Class5.anInt138;
		} else {
		    Class67_Sub26.anInt3277 = 0;
		    Class91.anInt1857 = -4;
		}
	    }
	}
    }
    
    public static void method484(int arg0, int arg1, int arg2, int arg3) {
	anInt1093++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg2, false, 11);
	if (arg0 != 0)
	    aRSString_1102 = null;
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg1;
	class67_sub5_sub3.anInt4500 = arg3;
    }
    
    public static void method485(byte arg0) {
	aRSString_1102 = null;
	aRSString_1095 = null;
	if (arg0 != -71)
	    anInt1101 = 34;
	aRSString_1099 = null;
    }
    
    public static void method486(int arg0) {
	anInt1096++;
	if (!Class32.method288(true)
	    && (Class116.anInt2197 ^ 0xffffffff) != (Canvas_Sub1.anInt59
						     ^ 0xffffffff))
	    Class15.method168(Canvas_Sub1.anInt59, Canvas_Sub1.anInt64,
			      (Class122.aClass131_Sub7_Sub2_2309.smallX
			       [0]),
			      0, Class67_Sub1_Sub11.anInt3992,
			      (Class122.aClass131_Sub7_Sub2_2309.smallY
			       [0]),
			      false);
	else if (arg0 == 0) {
	    if (Class50.anInt1021 != Canvas_Sub1.anInt59
		&& Class102.method1547(Canvas_Sub1.anInt59, true)) {
		Class50.anInt1021 = Canvas_Sub1.anInt59;
		Class55_Sub2.method470(512);
	    }
	}
    }
    
    public static void method487(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	anInt1092++;
	int i = 113 % ((-23 - arg3) / 57);
	if (arg1 == arg7)
	    Class129_Sub1.method1752(1, arg0, arg5, arg4, arg7, arg2, arg6);
	else if ((Class139.anInt2533 ^ 0xffffffff) < (-arg7 + arg0
						      ^ 0xffffffff)
		 || arg7 + arg0 > Class126_Sub1.anInt3423
		 || -arg1 + arg2 < Class55_Sub2.anInt2801
		 || (OutputStream_Sub1.anInt87 ^ 0xffffffff) > (arg1 + arg2
								^ 0xffffffff))
	    Class67_Sub5_Sub2.method836(arg2, arg5, arg4, arg0, -23880, arg1,
					arg6, arg7);
	else
	    Class67_Sub5_Sub2.method832(arg0, arg7, arg5, arg4, arg6, arg1,
					arg2, false);
    }
    
    static {
	aRSString_1095 = aRSString_1099;
	aRSString_1102 = Class134.method1914("cyan:", (byte) 67);
    }
}
