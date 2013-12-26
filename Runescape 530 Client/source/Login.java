/* Login - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.IOException;
import java.net.Socket;

public abstract class Login
{
    public static int anInt1610;
    public static RSString aRSString_1611
	= Class134.method1914("Use", (byte) 11);
    public static int anInt1612;
    public static int anInt1613;
    public static int anInt1614;
    public static RSString aRSString_1615 = aRSString_1611;
    public static int anInt1616;
    public static byte[] aByteArray1617;
    public static RSString aRSString_1618;
    public static RSString aRSString_1619;
    public static RSString aRSString_1620;
    public static int anInt1621;
    
    public abstract int method1414(byte i);
    
    public static void method1415(int arg0, Class131_Sub7 arg1) {
	try {
	    anInt1613++;
	    if ((arg1.anInt3691 ^ 0xffffffff) != -1) {
		int i = -75 % ((-75 - arg0) / 46);
		Class87 class87 = arg1.method1880((byte) -65);
		if ((arg1.anInt3785 ^ 0xffffffff) != 0
		    && arg1.anInt3785 < 32768) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= (Class128.aClass131_Sub7_Sub1Array2386
			   [arg1.anInt3785]);
		    if (class131_sub7_sub1 != null) {
			int i_0_
			    = arg1.anInt3733 - class131_sub7_sub1.anInt3733;
			int i_1_
			    = -class131_sub7_sub1.anInt3726 + arg1.anInt3726;
			if ((i_0_ ^ 0xffffffff) != -1
			    || (i_1_ ^ 0xffffffff) != -1)
			    arg1.anInt3721
				= ((int) (325.949 * Math.atan2((double) i_0_,
							       (double) i_1_))
				   & 0x7ff);
		    }
		}
		if (arg1.anInt3785 >= 32768) {
		    int i_2_ = -32768 + arg1.anInt3785;
		    if (i_2_ == Class67_Sub17.anInt3102)
			i_2_ = 2047;
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_2_]);
		    if (class131_sub7_sub2 != null) {
			int i_3_
			    = arg1.anInt3726 - class131_sub7_sub2.anInt3726;
			int i_4_
			    = -class131_sub7_sub2.anInt3733 + arg1.anInt3733;
			if ((i_4_ ^ 0xffffffff) != -1
			    || (i_3_ ^ 0xffffffff) != -1)
			    arg1.anInt3721
				= ((int) (325.949 * Math.atan2((double) i_4_,
							       (double) i_3_))
				   & 0x7ff);
		    }
		}
		if (((arg1.anInt3778 ^ 0xffffffff) != -1
		     || arg1.anInt3738 != 0)
		    && (arg1.anInt3713 == 0
			|| (arg1.anInt3787 ^ 0xffffffff) < -1)) {
		    int i_5_
			= arg1.anInt3733 - (arg1.anInt3778 + -Class58.baseX
					    + -Class58.baseX) * 64;
		    int i_6_
			= (arg1.anInt3726
			   - (-Class137.baseY
			      + (arg1.anInt3738 - Class137.baseY)) * 64);
		    if ((i_5_ ^ 0xffffffff) != -1 || (i_6_ ^ 0xffffffff) != -1)
			arg1.anInt3721
			    = (int) (Math.atan2((double) i_5_, (double) i_6_)
				     * 325.949) & 0x7ff;
		    arg1.anInt3778 = 0;
		    arg1.anInt3738 = 0;
		}
		int i_7_ = 0x7ff & arg1.anInt3721 - arg1.anInt3740;
		if (i_7_ == 0) {
		    arg1.anInt3756 = 0;
		    arg1.anInt3784 = 0;
		} else if ((class87.anInt1804 ^ 0xffffffff) == -1) {
		    arg1.anInt3784++;
		    if ((i_7_ ^ 0xffffffff) >= -1025) {
			arg1.anInt3740 += arg1.anInt3691;
			boolean bool = true;
			if (i_7_ < arg1.anInt3691
			    || i_7_ > -arg1.anInt3691 + 2048) {
			    arg1.anInt3740 = arg1.anInt3721;
			    bool = false;
			}
			if ((class87.anInt1797 ^ 0xffffffff) == (arg1.anInt3720
								 ^ 0xffffffff)
			    && ((arg1.anInt3784 ^ 0xffffffff) < -26 || bool)) {
			    if ((class87.anInt1770 ^ 0xffffffff) != 0)
				arg1.anInt3720 = class87.anInt1770;
			    else
				arg1.anInt3720 = class87.anInt1794;
			}
		    } else {
			arg1.anInt3740 -= arg1.anInt3691;
			boolean bool = true;
			if ((arg1.anInt3691 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)
			    || (i_7_ ^ 0xffffffff) < (2048 + -arg1.anInt3691
						      ^ 0xffffffff)) {
			    arg1.anInt3740 = arg1.anInt3721;
			    bool = false;
			}
			if (class87.anInt1797 == arg1.anInt3720
			    && ((arg1.anInt3784 ^ 0xffffffff) < -26 || bool)) {
			    if (class87.anInt1810 == -1)
				arg1.anInt3720 = class87.anInt1794;
			    else
				arg1.anInt3720 = class87.anInt1810;
			}
		    }
		    arg1.anInt3740 &= 0x7ff;
		} else {
		    if ((arg1.anInt3720 ^ 0xffffffff) == (class87.anInt1797
							  ^ 0xffffffff)
			&& (arg1.anInt3784 ^ 0xffffffff) < -26) {
			if ((class87.anInt1770 ^ 0xffffffff) == 0)
			    arg1.anInt3720 = class87.anInt1794;
			else
			    arg1.anInt3720 = class87.anInt1770;
		    }
		    int i_8_ = arg1.anInt3721 << 1729078661;
		    if ((arg1.anInt3750 ^ 0xffffffff) != (i_8_ ^ 0xffffffff)) {
			arg1.anInt3707 = 0;
			int i_9_ = -arg1.anInt3777 + i_8_ & 0xffff;
			arg1.anInt3750 = i_8_;
			int i_10_ = (arg1.anInt3756 * arg1.anInt3756
				     / (2 * class87.anInt1804));
			if ((arg1.anInt3756 ^ 0xffffffff) >= -1
			    || (i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)
			    || i_9_ - i_10_ >= 32768) {
			    if (arg1.anInt3756 >= 0
				|| ((65536 + -i_9_ ^ 0xffffffff)
				    > (i_10_ ^ 0xffffffff))
				|| ((-i_10_ + (-i_9_ + 65536) ^ 0xffffffff)
				    <= -32769))
				arg1.aBoolean3772 = false;
			    else {
				arg1.aBoolean3772 = true;
				arg1.anInt3769 = (65536 - i_9_) / 2;
				int i_11_
				    = (class87.anInt1774 * class87.anInt1774
				       / (2 * class87.anInt1804));
				if ((i_11_ ^ 0xffffffff) < -32768)
				    i_11_ = 32767;
				if (i_11_ < arg1.anInt3769)
				    arg1.anInt3769 = -i_9_ + 65536 - i_11_;
			    }
			} else {
			    arg1.anInt3769 = i_9_ / 2;
			    arg1.aBoolean3772 = true;
			    int i_12_ = (class87.anInt1774 * class87.anInt1774
					 / (2 * class87.anInt1804));
			    if (i_12_ > 32767)
				i_12_ = 32767;
			    if (arg1.anInt3769 > i_12_)
				arg1.anInt3769 = -i_12_ + i_9_;
			}
		    }
		    if ((arg1.anInt3756 ^ 0xffffffff) == -1) {
			int i_13_ = arg1.anInt3750 + -arg1.anInt3777 & 0xffff;
			if ((i_13_ ^ 0xffffffff)
			    <= (class87.anInt1804 ^ 0xffffffff)) {
			    arg1.anInt3707 = 0;
			    int i_14_ = (class87.anInt1774 * class87.anInt1774
					 / (class87.anInt1804 * 2));
			    arg1.aBoolean3772 = true;
			    if (i_14_ > 32767)
				i_14_ = 32767;
			    if ((i_13_ ^ 0xffffffff) <= -32769) {
				arg1.anInt3756 = -class87.anInt1804;
				arg1.anInt3769 = (65536 - i_13_) / 2;
				if ((arg1.anInt3769 ^ 0xffffffff)
				    < (i_14_ ^ 0xffffffff))
				    arg1.anInt3769 = 65536 + (-i_13_ + -i_14_);
			    } else {
				arg1.anInt3756 = class87.anInt1804;
				arg1.anInt3769 = i_13_ / 2;
				if ((i_14_ ^ 0xffffffff)
				    > (arg1.anInt3769 ^ 0xffffffff))
				    arg1.anInt3769 = -i_14_ + i_13_;
			    }
			} else
			    arg1.anInt3777 = arg1.anInt3750;
		    } else if (arg1.anInt3756 <= 0) {
			if ((arg1.anInt3769 ^ 0xffffffff)
			    >= (arg1.anInt3707 ^ 0xffffffff))
			    arg1.aBoolean3772 = false;
			if (!arg1.aBoolean3772) {
			    arg1.anInt3756 += class87.anInt1804;
			    if (arg1.anInt3756 > 0)
				arg1.anInt3756 = 0;
			} else if ((-class87.anInt1774 ^ 0xffffffff)
				   > (arg1.anInt3756 ^ 0xffffffff))
			    arg1.anInt3756 -= class87.anInt1804;
		    } else {
			if (arg1.anInt3707 >= arg1.anInt3769)
			    arg1.aBoolean3772 = false;
			if (arg1.aBoolean3772) {
			    if (arg1.anInt3756 < class87.anInt1774)
				arg1.anInt3756 += class87.anInt1804;
			} else {
			    arg1.anInt3756 -= class87.anInt1804;
			    if ((arg1.anInt3756 ^ 0xffffffff) > -1)
				arg1.anInt3756 = 0;
			}
		    }
		    arg1.anInt3777 += arg1.anInt3756;
		    if ((arg1.anInt3756 ^ 0xffffffff) < -1)
			arg1.anInt3707 += arg1.anInt3756;
		    else
			arg1.anInt3707 -= arg1.anInt3756;
		    arg1.anInt3777 &= 0xffff;
		    arg1.anInt3740 = arg1.anInt3777 >> -1487259035;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("le.G(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1416(int arg0) {
	try {
	    anInt1616++;
	    if (Class67_Sub1_Sub21.loginStep != 0
		&& (Class67_Sub1_Sub21.loginStep ^ 0xffffffff) != -6) {
		try {
		    if (++Class67_Sub1_Sub18.anInt4113 > 2000) {
			if (Class41.aClass117_867 != null) {
			    Class41.aClass117_867.method1632((byte) -16);
			    Class41.aClass117_867 = null;
			}
			if (Class125.anInt2339 < 1) {
			    if ((Class67_Sub9.anInt2968 ^ 0xffffffff)
				!= (Class5.anInt138 ^ 0xffffffff))
				Class67_Sub9.anInt2968 = Class5.anInt138;
			    else
				Class67_Sub9.anInt2968 = Class2.anInt105;
			    Class67_Sub1_Sub21.loginStep = 1;
			    Class67_Sub1_Sub18.anInt4113 = 0;
			    Class125.anInt2339++;
			} else {
			    Class67_Sub1_Sub21.loginStep = 0;
			    Class28.anInt652 = -5;
			    return;
			}
		    }
		    if ((Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -2) {
			Class43.aClass31_907
			    = (Class124.aSignLink_2335.method403
			       (Class67_Sub9.anInt2968, false,
				Class67_Sub1_Sub29.aString4265));
			Class67_Sub1_Sub21.loginStep = 2;
		    }
		    if (Class67_Sub1_Sub21.loginStep == 2) {
			if (Class43.aClass31_907.anInt706 == 2)
			    throw new IOException();
			if (Class43.aClass31_907.anInt706 != 1)
			    return;
			Class41.aClass117_867
			    = new Class117(((Socket)
					    Class43.aClass31_907.anObject705),
					   Class124.aSignLink_2335);
			Class43.aClass31_907 = null;
			long l = (Class119.aLong2248
				  = Class67_Sub5_Sub5.aRSString_4520
					.method501((byte) -16));
			Class70_Sub1.outStream.currentOffset = 0;
			Class70_Sub1.outStream.addByte((byte) 4, 14);
			int i = (int) (0x1fL & l >> 26374224);
			Class70_Sub1.outStream.addByte((byte) 4, i);
			Class41.aClass117_867.queueBytesToSend(0, (Class70_Sub1.outStream.buffer), 2, (byte) 64);
			if (Class67_Sub5_Sub9.aClass28_4616 != null)
			    Class67_Sub5_Sub9.aClass28_4616.method258(0);
			if (Class78.aClass28_1606 != null)
			    Class78.aClass28_1606.method258(0);
			int i_15_
			    = Class41.aClass117_867.method1631(arg0 + 45932);
			if (Class67_Sub5_Sub9.aClass28_4616 != null)
			    Class67_Sub5_Sub9.aClass28_4616.method258(0);
			if (Class78.aClass28_1606 != null)
			    Class78.aClass28_1606.method258(0);
			if (i_15_ != 0) {
			    Class28.anInt652 = i_15_;
			    Class67_Sub1_Sub21.loginStep = 0;
			    Class41.aClass117_867.method1632((byte) -45);
			    Class41.aClass117_867 = null;
			    return;
			}
			Class67_Sub1_Sub21.loginStep = 3;
		    }
		    if (Class67_Sub1_Sub21.loginStep == 3) {
			if (Class41.aClass117_867.method1626(arg0 ^ 0x6f5a)
			    < 8)
			    return;
			Class41.aClass117_867.method1629
			    ((byte) -115,
			     Class54.aPacketStream_1069.buffer, 0,
			     8);
			Class54.aPacketStream_1069.currentOffset = 0;
			Class88.serverSessionKey = Class54.aPacketStream_1069.readLong(-9426); //server session key.
			int[] is = new int[4];
			is[2] = (int) (Class88.serverSessionKey >> 32);
			is[3] = (int) Class88.serverSessionKey;
			is[0] = (int) (Math.random() * 99999999D);
			is[1] = (int) (Math.random() * 99999999D);
			Class70_Sub1.outStream.currentOffset = 0;
			Class70_Sub1.outStream.addByte((byte) 4, 10);
			Class70_Sub1.outStream.addInt(is[0], 118);
			Class70_Sub1.outStream.addInt(is[1], 117);
			Class70_Sub1.outStream.addInt(is[2], 117);
			Class70_Sub1.outStream.addInt(is[3], arg0 ^ ~0x6f71);
			Class70_Sub1.outStream.writeLong(2, Class67_Sub5_Sub5.aRSString_4520.method501((byte) -16));
			Class70_Sub1.outStream.writeRSString(Class67_Sub5_Sub5.aRSString_4519, (byte) 0);
			Class70_Sub1.outStream.doKeys(Class14.aBigInteger444, (byte) 127, Class87.aBigInteger1802);
			Class140.aPacketStream_2547.currentOffset = 0;
			if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -41)
			    Class140.aPacketStream_2547.addByte((byte) 4, 16);     //16 or 18
			else
			    Class140.aPacketStream_2547.addByte((byte) 4, 18);   //16 or 18.
			Class140.aPacketStream_2547.addUShort(16711680, 159 - (-(Class70_Sub1.outStream.currentOffset)
			 - Class80.method1423(18241,(Class101.aRSString_1991))));
			Class140.aPacketStream_2547.addInt(530, 117); //game verison
			Class140.aPacketStream_2547.addByte((byte) 4, Class67_Sub1_Sub5.anInt3880);
			Class140.aPacketStream_2547.addByte((byte) 4, !Class132.lowMememoryMode ? 0 : 1);
			Class140.aPacketStream_2547.addByte((byte) 4, 0);
			Class140.aPacketStream_2547.addByte((byte) 4, Class78.method1413(113));
			Class140.aPacketStream_2547.addUShort(16711680, Class56.anInt1097);
			Class140.aPacketStream_2547.addUShort(arg0 ^ ~0xff6f09, Class49.anInt1010);
			Class140.aPacketStream_2547.addByte((byte) 4, Class74.anInt1485);
			Class124.method1703(Class140.aPacketStream_2547,(byte) -115);
			Class140.aPacketStream_2547.writeRSString(Class101.aRSString_1991, (byte) 0);
			Class140.aPacketStream_2547.addInt(Class67_Sub5_Sub3.anInt4489, 118);
			Class140.aPacketStream_2547.addInt(Class33.method290(109), 121);
			Class67_Sub5_Sub4_Sub2.aBoolean5132 = true;
			Class140.aPacketStream_2547.addUShort(arg0 ^ ~0xff6f09, Class66.anInt1326);
			
			Class140.aPacketStream_2547.addInt(Class67_Sub1_Sub32.aClass9_4297.method124((byte) 118), 122);
			Class140.aPacketStream_2547.addInt(Class12.aClass9_418.method124((byte) 39), arg0 ^ ~0x6f73);
			Class140.aPacketStream_2547.addInt(OutputStream_Sub1.aClass9_85.method124((byte) 108), 121);
			Class140.aPacketStream_2547.addInt(Class27.aClass9_635.method124((byte) -46), 126);
			Class140.aPacketStream_2547.addInt(PacketParser.aClass9_2113.method124((byte) 111), arg0 ^ ~0x6f7e);
			Class140.aPacketStream_2547.addInt(Class111.aClass9_2097.method124((byte) -67), 126);
			Class140.aPacketStream_2547.addInt(Class9.aClass9_362.method124((byte) 109), 119);
			Class140.aPacketStream_2547.addInt(Class114.aClass9_2158.method124((byte) 122), 124);
			Class140.aPacketStream_2547.addInt(Class51.aClass9_1044.method124((byte) 119), 120);
			Class140.aPacketStream_2547.addInt(Class52.aClass9_1046.method124((byte) 22), arg0 ^ ~0x6f77);
			Class140.aPacketStream_2547.addInt(Class41.aClass9_878.method124((byte) -103), 123);
			Class140.aPacketStream_2547.addInt(Stream.aClass9_2908.method124((byte) 126), arg0 ^ ~0x6f76);
			Class140.aPacketStream_2547.addInt(Class126_Sub2.aClass9_3429.method124((byte) 15), 121);
			Class140.aPacketStream_2547.addInt(Class94.aClass9_1895.method124((byte) 123), 127);
			Class140.aPacketStream_2547.addInt(Class43.aClass9_902.method124((byte) -79), 127);
			Class140.aPacketStream_2547.addInt(Class67_Sub1_Sub8.aClass9_3926.method124((byte) 0), arg0 ^ ~0x6f7e);
			Class140.aPacketStream_2547.addInt(Class67_Sub1_Sub5.aClass9_3881.method124((byte) 108), 122);
			Class140.aPacketStream_2547.addInt(Class13.aClass9_427.method124((byte) -101), 123);
			Class140.aPacketStream_2547.addInt(Class136.aClass9_2484.method124((byte) -34), 125);
			Class140.aPacketStream_2547.addInt(Class67_Sub20.aClass9_3158.method124((byte) 110), arg0 + 28543);
			Class140.aPacketStream_2547.addInt(Class131_Sub5.aClass9_3663.method124((byte) -32), 121);
			Class140.aPacketStream_2547.addInt(Class67_Sub5_Sub11_Sub2.aClass9_5139.method124((byte) -108), 125);
			Class140.aPacketStream_2547.addInt(Class69.aClass9_1384.method124((byte) -74), 120);
			Class140.aPacketStream_2547.addInt(Class2.aClass9_108.method124((byte) 112), arg0 ^ ~0x6f7c);
			Class140.aPacketStream_2547.addInt(Class55_Sub3_Sub1.aClass9_3811.method124((byte) 110), 126);
			Class140.aPacketStream_2547.addInt(Class67_Sub30.aClass9_3344.method124((byte) 114), 125);
			Class140.aPacketStream_2547.addInt(Class67_Sub1_Sub39.aClass9_4446.method124((byte) 1), 120);
			Class140.aPacketStream_2547.addInt(Class83.aClass9_1676.method124((byte) 120), 120);
			
			Class140.aPacketStream_2547.writeBytes(113, Class70_Sub1.outStream.buffer, Class70_Sub1.outStream.currentOffset, 0);
			
			Class41.aClass117_867.queueBytesToSend(0, Class140.aPacketStream_2547.buffer, Class140.aPacketStream_2547.currentOffset, (byte) 111);
			Class70_Sub1.outStream.setCryption(is, arg0 + 28419);
			for (int i = 0; i < 4; i++)
			    is[i] += 50;
			Class54.aPacketStream_1069.setCryption(is, arg0 + 28391);
			Class67_Sub1_Sub21.loginStep = 4;	//checking step one?
		    }
		    if (Class67_Sub1_Sub21.loginStep == 4) {	//step one check
			if (Class41.aClass117_867.method1626(-60) < 1)
			    return;
			int i = Class41.aClass117_867.method1631(17506); //readByte() from server.
			
			if (i != 21) { //not 21????
			    if (i == 29) //29 = WTF?
				Class67_Sub1_Sub21.loginStep = 10;
			    else {
				if (i == 1) {	//DISPLAY_ADVERTISEMENT
				    Class67_Sub1_Sub21.loginStep = 5; //step 5.
				    Class28.anInt652 = i;
				    return;
				}
				if (i == 2)	//LOGIN_OK
				    Class67_Sub1_Sub21.loginStep = 8; //step 8.
				else {
				    if (i != 15) { //not 15 could be anything.
					if (i != 23 || (Class125.anInt2339 ^ 0xffffffff) <= -2) { //not 23 could be aynthing.
					    Class28.anInt652 = i;
					    Class67_Sub1_Sub21.loginStep = 0;
					    Class41.aClass117_867.method1632((byte) 118);
					    Class41.aClass117_867 = null;
					} else {
					    Class125.anInt2339++;
					    Class67_Sub1_Sub18.anInt4113 = 0;
					    Class67_Sub1_Sub21.loginStep = 1;
					    Class41.aClass117_867.method1632((byte) 119);
					    Class41.aClass117_867 = null;
					}
				    } else {
					Class67_Sub1_Sub21.loginStep = 0;
					Class28.anInt652 = i;
					return;
				    }
				    return;
				}
			    }
			} else
			    Class67_Sub1_Sub21.loginStep = 7;
		    }
		    if (arg0 != -28426)
			aRSString_1620 = null;
		    if (Class67_Sub1_Sub21.loginStep == 6) {
			Class70_Sub1.outStream.currentOffset = 0;
			Class70_Sub1.outStream.createFrame(2, 17);
			Class41.aClass117_867.queueBytesToSend(0, (Class70_Sub1.outStream.buffer), Class70_Sub1.outStream.currentOffset, (byte) 80);
			Class67_Sub1_Sub21.loginStep = 4;
		    } else if (Class67_Sub1_Sub21.loginStep == 7) {
			if ((Class41.aClass117_867.method1626(125) ^ 0xffffffff) <= -2) {
			    Class126_Sub2.anInt3438 = (Class41.aClass117_867.method1631(17506) * 60 - -180);
			    Class67_Sub1_Sub21.loginStep = 0;
			    Class28.anInt652 = 21;
			    Class41.aClass117_867.method1632((byte) -67);
			    Class41.aClass117_867 = null;
			}
		    } else if (Class67_Sub1_Sub21.loginStep == 10) {
			if ((Class41.aClass117_867.method1626(-21) ^ 0xffffffff) <= -2) {
			    Class76.anInt1548 = Class41.aClass117_867.method1631(17506);
			    Class28.anInt652 = 29;
			    Class67_Sub1_Sub21.loginStep = 0;
			    Class41.aClass117_867.method1632((byte) -98);
			    Class41.aClass117_867 = null;
			}
		    } else {
			if (Class67_Sub1_Sub21.loginStep == 8) {	//LOGIN_OK , Step 8.
			    if ((Class41.aClass117_867.method1626(-91) ^ 0xffffffff) > -15)
				return;
			    Class41.aClass117_867.method1629((byte) -115, (Class54.aPacketStream_1069.buffer), 0, 14);
			    Class54.aPacketStream_1069.currentOffset = 0;
			    Class67_Sub17.anInt3107 = Class54.aPacketStream_1069.readByte((byte) -90);						  //PlayerRights
			    Class67_Sub27.anInt3295 = Class54.aPacketStream_1069.readByte((byte) -51);						  //1
			    Class78.aBoolean1602 = (Class54.aPacketStream_1069.readByte((byte) 91) ^ 0xffffffff) == -2;				//Flagged, will genrate mouse packets
			    Class23.aBoolean560 = Class54.aPacketStream_1069.readByte((byte) -61) == 1;						   //3
			    Class7.aBoolean293 = Class54.aPacketStream_1069.readByte((byte) -6) == 1;						   //4
			    Class67_Sub5_Sub16.aBoolean4783 = (Class54.aPacketStream_1069.readByte((byte) -85) ^ 0xffffffff) == -2;   //5
			    Class124.aBoolean2330 = (Class54.aPacketStream_1069.readByte((byte) -69) ^ 0xffffffff) == -2;		     // Generates packets
			    Class67_Sub17.anInt3102 = Class54.aPacketStream_1069.readUShort(arg0 + 26040);					//playerId
			    Class24.aBoolean574 = Class54.aPacketStream_1069.readByte((byte) 111) == 1;						// membership flag #1?..this one enables all GE boxes
			    Class70.aBoolean1393 = (Class54.aPacketStream_1069.readByte((byte) -112) ^ 0xffffffff) == -2;		   // membership flag #2?
			    RSString.method522(Class70.aBoolean1393, 0);
			    Class67_Sub23.method1286((byte) -112, Class70.aBoolean1393);
			    if (!Class132.lowMememoryMode) {
				if ((!Class78.aBoolean1602 || Class7.aBoolean293) && !Class24.aBoolean574) {
				    try {
					Class49.aRSString_999.method505((Class124.aSignLink_2335.anApplet940), (byte) -119);
				    } catch (Throwable throwable) {
					/* empty */
				    }
				} else {
				    try {
					Class67_Sub1_Sub7.aRSString_3910.method505((Class124.aSignLink_2335.anApplet940), (byte) -90);
				    } catch (Throwable throwable) {
					/* empty */
				    }
				}
			    }
			    Class67_Sub1_Sub20.packetType = Class54.aPacketStream_1069.method1096(-23542);
			    Class67_Sub5_Sub1.lastPacketSize = Class54.aPacketStream_1069.readUShort(-2386);
			    Class67_Sub1_Sub21.loginStep = 9;
			}
			if (Class67_Sub1_Sub21.loginStep == 9) {
			    if ((Class41.aClass117_867.method1626(-94) ^ 0xffffffff) <= (Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff)) {
				Class54.aPacketStream_1069.currentOffset = 0;
				Class41.aClass117_867.method1629((byte) -115, (Class54.aPacketStream_1069.buffer), 0, Class67_Sub5_Sub1.lastPacketSize);
				Class28.anInt652 = 2;
				Class67_Sub1_Sub21.loginStep = 0;
				Class124.method1700(0);
				Class67_Sub1_Sub11.anInt3992 = -1;
				ObjectDef.method1772(true, false);
				Class67_Sub1_Sub20.packetType = -1;
			    }
			}
		    }
		} catch (IOException ioexception) {
		    if (Class41.aClass117_867 != null) {
			Class41.aClass117_867.method1632((byte) 123);
			Class41.aClass117_867 = null;
		    }
		    if (Class125.anInt2339 >= 1) {
			Class28.anInt652 = -4;
			Class67_Sub1_Sub21.loginStep = 0;
		    } else {
			if ((Class5.anInt138 ^ 0xffffffff)
			    == (Class67_Sub9.anInt2968 ^ 0xffffffff))
			    Class67_Sub9.anInt2968 = Class2.anInt105;
			else
			    Class67_Sub9.anInt2968 = Class5.anInt138;
			Class67_Sub1_Sub18.anInt4113 = 0;
			Class67_Sub1_Sub21.loginStep = 1;
			Class125.anInt2339++;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "le.F(" + arg0 + ')');
	}
    }
    
    public abstract void method1417(boolean bool, Component component);
    
    public static void method1418(int arg0) {
	try {
	    if (arg0 != -32768)
		aRSString_1618 = null;
	    aRSString_1619 = null;
	    aByteArray1617 = null;
	    aRSString_1618 = null;
	    aRSString_1615 = null;
	    aRSString_1611 = null;
	    aRSString_1620 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "le.I(" + arg0 + ')');
	}
    }
    
    public static void method1419(byte arg0, int arg1) {
	try {
	    Class67_Sub1_Sub34.aClass136_4331.method1920(arg1, 73);
	    if (arg0 == -41)
		anInt1610++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("le.H(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public abstract void method1420(byte i, Component component);
    
    public static boolean method1421(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
	int i_16_
	    = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
	int i_17_
	    = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
	if (i * i_17_ > 0 && i_17_ * i_16_ > 0)
	    return true;
	return false;
    }
    
    public static Class94 method1422(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	Class94 class94 = class67_sub24.aClass94_3224;
	class67_sub24.aClass94_3224 = null;
	return class94;
    }
    
    static {
	anInt1612 = 0;
	aRSString_1618 = Class134.method1914("<br>", (byte) 33);
	aByteArray1617 = new byte[520];
	aRSString_1620
	    = Class134.method1914("Prepared sound engine", (byte) 127);
	aRSString_1619 = aRSString_1620;
    }
}
