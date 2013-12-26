import java.io.IOException;

public class Class40
{
    public static int anInt814;
    public static int anInt815 = 0;
    public Class120 aClass120_816 = new Class120();
    public static int[] anIntArray817;
    public static int anInt818;
    public static int anInt819;
    public static int anInt820;
    public static int anInt821;
    public static int anInt822;
    public static int anInt823;
    public static RSString aRSString_824;
    public static int anInt825;
    public static int anInt826;
    public static int anInt827;
    public static int anInt828;
    public static Class5 aClass5_829;
    public static int anInt830;
    public static RSString aRSString_831
	= Class134.method1914("lila:", (byte) 102);
    public static int anInt832;
    public static int anInt833;
    public static int anInt834;
    public static int anInt835;
    public static int anInt836;
    public Class120 aClass120_837 = new Class120();
    public Class120 aClass120_838 = new Class120();
    public Class120 aClass120_839 = new Class120();
    public Class117 aClass117_840;
    public int anInt841;
    public Stream aStream_842 = new Stream(4);
    public long aLong843;
    public volatile int anInt844;
    public volatile int anInt845 = 0;
    public byte aByte846;
    public Stream aStream_847;
    public Class67_Sub5_Sub4_Sub1 aClass67_Sub5_Sub4_Sub1_848;
    
    public int method338(int arg0) {
	anInt832++;
	if (arg0 != 2)
	    aStream_847 = null;
	return (aClass120_838.method1658(-19462)
		+ aClass120_839.method1658(-19462));
    }
    
    public void method339(byte arg0, boolean arg1) {
	anInt821++;
	if (aClass117_840 != null) {
	    try {
		aStream_842.currentOffset = 0;
		if (arg0 == -10) {
		    aStream_842.addByte((byte) 4, !arg1 ? 3 : 2);
		    aStream_842.addThreeBytes(0, -105);
		    aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 116);
		}
	    } catch (IOException ioexception) {
		try {
		    aClass117_840.method1632((byte) 127);
		} catch (Exception exception) {
		    /* empty */
		}
		anInt844 = -2;
		anInt845++;
		aClass117_840 = null;
	    }
	}
    }
    
    public static void method340(int arg0) {
	if (arg0 > -46)
	    method342(-5);
	aRSString_824 = null;
	aRSString_831 = null;
	aClass5_829 = null;
	anIntArray817 = null;
    }
    
    public void method341(int arg0) {
	anInt822++;
	if (arg0 != -2)
	    aClass120_839 = null;
	if (aClass117_840 != null) {
	    try {
		aStream_842.currentOffset = 0;
		aStream_842.addByte((byte) 4, 6);
		aStream_842.addThreeBytes(3, 107);
		aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 77);
	    } catch (IOException ioexception) {
		try {
		    aClass117_840.method1632((byte) -34);
		} catch (Exception exception) {
		    /* empty */
		}
		anInt844 = -2;
		anInt845++;
		aClass117_840 = null;
	    }
	}
    }
    
    public static void method342(int arg0) {
	anInt830++;
	if (arg0 == 0) {
	    if (Class6.aClass133_154 != null) {
		synchronized (Class6.aClass133_154) {
		    Class6.aClass133_154 = null;
		}
	    }
	}
    }
    
    public void method343(boolean arg0) {
	anInt828++;
	if (aClass117_840 != null) {
	    if (arg0 != true)
		aClass67_Sub5_Sub4_Sub1_848 = null;
	    try {
		aStream_842.currentOffset = 0;
		aStream_842.addByte((byte) 4, 7);
		aStream_842.addThreeBytes(0, 98);
		aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 72);
	    } catch (IOException ioexception) {
		try {
		    aClass117_840.method1632((byte) -103);
		} catch (Exception exception) {
		    /* empty */
		}
		anInt844 = -2;
		anInt845++;
		aClass117_840 = null;
	    }
	}
    }
    
    public void method344(boolean arg0, byte arg1, Class117 arg2) {
	anInt825++;
	if (arg1 < 70)
	    method341(-69);
	if (aClass117_840 != null) {
	    try {
		aClass117_840.method1632((byte) -37);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass117_840 = null;
	}
	aClass117_840 = arg2;
	method341(-2);
	method339((byte) -10, arg0);
	aStream_847.currentOffset = 0;
	aClass67_Sub5_Sub4_Sub1_848 = null;
	for (;;) {
	    Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
		= ((Class67_Sub5_Sub4_Sub1)
		   aClass120_837.method1657((byte) -115));
	    if (class67_sub5_sub4_sub1 == null)
		break;
	    aClass120_816.method1663(class67_sub5_sub4_sub1, -225);
	}
	for (;;) {
	    Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
		= (Class67_Sub5_Sub4_Sub1) aClass120_839.method1657((byte) 7);
	    if (class67_sub5_sub4_sub1 == null)
		break;
	    aClass120_838.method1663(class67_sub5_sub4_sub1, -225);
	}
	if (aByte846 != 0) {
	    try {
		aStream_842.currentOffset = 0;
		aStream_842.addByte((byte) 4, 4);
		aStream_842.addByte((byte) 4, aByte846);
		aStream_842.addUShort(16711680, 0);
		aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 65);
	    } catch (IOException ioexception) {
		try {
		    aClass117_840.method1632((byte) 120);
		} catch (Exception exception) {
		    /* empty */
		}
		anInt844 = -2;
		anInt845++;
		aClass117_840 = null;
	    }
	}
	anInt841 = 0;
	aLong843 = Class39.method337(19644);
    }
    
    public boolean method345(byte arg0) {
	if (arg0 <= 4)
	    method347(-40);
	anInt814++;
	if ((method346((byte) -127) ^ 0xffffffff) > -21)
	    return false;
	return true;
    }
    
    public int method346(byte arg0) {
	int i = -69 % ((arg0 - -68) / 35);
	anInt826++;
	return (aClass120_816.method1658(-19462)
		- -aClass120_837.method1658(-19462));
    }
    
    public boolean method347(int arg0) {
	anInt834++;
	if (arg0 <= 7)
	    return false;
	if (method338(2) < 20)
	    return false;
	return true;
    }
    
    public static void method348(int arg0, int arg1) {
	anInt827++;
	if (Class67_Sub5_Sub18.anInt4804 != arg1) {
	    if (Class67_Sub5_Sub18.anInt4804 == 0)
		Class142.method1954(255);
	    if (arg0 != -11461)
		method348(26, -77);
	    if ((arg1 ^ 0xffffffff) == -41)
		Class61.method553(0);
	    if (arg1 != 40 && Class86.aClass117_1764 != null) {
		Class86.aClass117_1764.method1632((byte) -103);
		Class86.aClass117_1764 = null;
	    }
	    boolean bool = (arg1 == 5 || (arg1 ^ 0xffffffff) == -11
			    || (arg1 ^ 0xffffffff) == -29);
	    if (arg1 == 25 || (arg1 ^ 0xffffffff) == -29) {
		Class67_Sub21.anInt3174 = 0;
		Canvas_Sub1.anInt57 = 0;
		Class123.anInt2315 = 1;
		Class86.anInt1767 = 1;
		Class12.anInt420 = 0;
		Class67_Sub1_Sub22.method723(true, (byte) -110);
	    }
	    if (arg1 == 25 || (arg1 ^ 0xffffffff) == -11)
		Class120.method1662(0);
	    if ((arg1 ^ 0xffffffff) != -6)
		Class114.method1606((byte) -88);
	    else
		Class67_Sub11_Sub2.method1136(Class51.aClass9_1044,
					      (byte) -62);
	    boolean bool_0_
		= (Class67_Sub5_Sub18.anInt4804 == 5
		   || (Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -11
		   || (Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -29);
	    if (!bool != !bool_0_) {
		if (bool) {
		    Class27.anInt637 = Class56.anInt1101;
		    if (Class67_Sub1_Sub29.anInt4259 != 0)
			Class49.method428(255, 2, Class9.aClass9_362, false,
					  12672, Class56.anInt1101, 0);
		    else
			Class67_Sub1_Sub10.method658(2, (byte) -83);
		    Class144.aClass40_2588.method339((byte) -10, false);
		} else {
		    Class67_Sub1_Sub10.method658(2, (byte) 72);
		    Class144.aClass40_2588.method339((byte) -10, true);
		}
	    }
	    Class67_Sub5_Sub18.anInt4804 = arg1;
	}
    }
    
    public Class67_Sub5_Sub4_Sub1 method349(byte arg0, int arg1, int arg2,
					    byte arg3, boolean arg4) {
	anInt823++;
	long l = (long) (arg1 + (arg2 << -1342488016));
	Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
	    = new Class67_Sub5_Sub4_Sub1();
	class67_sub5_sub4_sub1.aLong2863 = l;
	if (arg3 >= -22)
	    anIntArray817 = null;
	class67_sub5_sub4_sub1.aBoolean4507 = arg4;
	class67_sub5_sub4_sub1.aByte5104 = arg0;
	if (!arg4) {
	    if ((method338(2) ^ 0xffffffff) <= -21)
		throw new RuntimeException();
	    aClass120_838.method1663(class67_sub5_sub4_sub1, -225);
	} else {
	    if ((method346((byte) 8) ^ 0xffffffff) <= -21)
		throw new RuntimeException();
	    aClass120_816.method1663(class67_sub5_sub4_sub1, -225);
	}
	return class67_sub5_sub4_sub1;
    }
    
    public void method350(int arg0) {
	if (aClass117_840 != null)
	    aClass117_840.method1628(3);
	anInt818++;
	if (arg0 >= -110)
	    aClass120_837 = null;
    }
    
    public void method351(byte arg0) {
	anInt836++;
	try {
	    aClass117_840.method1632((byte) 127);
	} catch (Exception exception) {
	    /* empty */
	}
	aByte846 = (byte) (int) (1.0 + Math.random() * 255.0);
	anInt845++;
	int i = 80 / ((arg0 - 5) / 60);
	aClass117_840 = null;
	anInt844 = -1;
    }
    
    public void method352(boolean arg0) {
	anInt820++;
	if (aClass117_840 != null)
	    aClass117_840.method1632((byte) 121);
	if (arg0 != true)
	    aByte846 = (byte) -86;
    }
    
    public boolean method353(int arg0) {
	if (aClass117_840 != null) {
	    long l = Class39.method337(19644);
	    int i = (int) (l + -aLong843);
	    if (i > 200)
		i = 200;
	    aLong843 = l;
	    anInt841 += i;
	    if ((anInt841 ^ 0xffffffff) < -30001) {
		try {
		    aClass117_840.method1632((byte) 114);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass117_840 = null;
	    }
	}
	anInt835++;
	if (aClass117_840 == null) {
	    if ((method346((byte) -109) ^ 0xffffffff) != -1
		|| method338(arg0 ^ 0x2) != 0)
		return false;
	    return true;
	}
	try {
	    aClass117_840.method1627(5000);
	    for (Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
		     = (Class67_Sub5_Sub4_Sub1) aClass120_816.method1656(104);
		 class67_sub5_sub4_sub1 != null;
		 class67_sub5_sub4_sub1 = ((Class67_Sub5_Sub4_Sub1)
					   aClass120_816.method1668(true))) {
		aStream_842.currentOffset = 0;
		aStream_842.addByte((byte) 4, 1);
		aStream_842.addThreeBytes((int) class67_sub5_sub4_sub1.aLong2863, 117);
		aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 104);
		aClass120_837.method1663(class67_sub5_sub4_sub1, -225);
	    }
	    for (Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
		     = (Class67_Sub5_Sub4_Sub1) aClass120_838.method1656(104);
		 class67_sub5_sub4_sub1 != null;
		 class67_sub5_sub4_sub1 = ((Class67_Sub5_Sub4_Sub1)
					   aClass120_838.method1668(true))) {
		aStream_842.currentOffset = 0;
		aStream_842.addByte((byte) 4, 0);
		aStream_842
		    .addThreeBytes((int) class67_sub5_sub4_sub1.aLong2863, -77);
		aClass117_840.queueBytesToSend(0, aStream_842.buffer, 4, (byte) 79);
		aClass120_839.method1663(class67_sub5_sub4_sub1, -225);
	    }
	    for (int i = arg0; i < 100; i++) {
		int i_1_ = aClass117_840.method1626(1);
		if (i_1_ < 0)
		    throw new IOException();
		if (i_1_ == 0)
		    break;
		anInt841 = 0;
		int i_2_ = 0;
		if (aClass67_Sub5_Sub4_Sub1_848 == null)
		    i_2_ = 8;
		else if (aClass67_Sub5_Sub4_Sub1_848.anInt5112 == 0)
		    i_2_ = 1;
		if (i_2_ > 0) {
		    int i_3_ = -aStream_847.currentOffset + i_2_;
		    if ((i_3_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
			i_3_ = i_1_;
		    aClass117_840.method1629((byte) -115,
					     aStream_847.buffer,
					     aStream_847.currentOffset,
					     i_3_);
		    if ((aByte846 ^ 0xffffffff) != -1) {
			for (int i_4_ = 0;
			     (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++)
			    aStream_847.buffer
				[aStream_847.currentOffset + i_4_]
				= (byte) (Class92.method1479
					  ((aStream_847.buffer
					    [(aStream_847.currentOffset
					      + i_4_)]),
					   aByte846));
		    }
		    aStream_847.currentOffset += i_3_;
		    if (aStream_847.currentOffset >= i_2_) {
			if (aClass67_Sub5_Sub4_Sub1_848 == null) {
			    aStream_847.currentOffset = 0;
			    int i_5_
				= aStream_847.readByte((byte) -83);
			    int i_6_ = aStream_847.readUShort(-2386);
			    int i_7_
				= aStream_847.readByte((byte) -49);
			    int i_8_
				= aStream_847.readInt((byte) 127);
			    int i_9_ = i_7_ & 0x7f;
			    boolean bool = (0x80 & i_7_ ^ 0xffffffff) != -1;
			    long l = (long) (i_6_ + (i_5_ << -1660319152));
			    Object object = null;
			    Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1;
			    if (!bool) {
				for (class67_sub5_sub4_sub1
					 = ((Class67_Sub5_Sub4_Sub1)
					    aClass120_837.method1656(104));
				     class67_sub5_sub4_sub1 != null;
				     class67_sub5_sub4_sub1
					 = ((Class67_Sub5_Sub4_Sub1)
					    aClass120_837.method1668(true))) {
				    if ((class67_sub5_sub4_sub1.aLong2863
					 ^ 0xffffffffffffffffL)
					== (l ^ 0xffffffffffffffffL))
					break;
				}
			    } else {
				for (class67_sub5_sub4_sub1
					 = ((Class67_Sub5_Sub4_Sub1)
					    aClass120_839.method1656(104));
				     class67_sub5_sub4_sub1 != null;
				     class67_sub5_sub4_sub1
					 = ((Class67_Sub5_Sub4_Sub1)
					    aClass120_839.method1668(true))) {
				    if ((class67_sub5_sub4_sub1.aLong2863
					 ^ 0xffffffffffffffffL)
					== (l ^ 0xffffffffffffffffL))
					break;
				}
			    }
			    if (class67_sub5_sub4_sub1 == null)
				throw new IOException();
			    int i_10_ = i_9_ == 0 ? 5 : 9;
			    aClass67_Sub5_Sub4_Sub1_848
				= class67_sub5_sub4_sub1;
			    aClass67_Sub5_Sub4_Sub1_848.aStream_5107
				= (new Stream
				   (i_10_ + i_8_
				    + aClass67_Sub5_Sub4_Sub1_848.aByte5104));
			    aClass67_Sub5_Sub4_Sub1_848.aStream_5107
				.addByte((byte) 4, i_9_);
			    aClass67_Sub5_Sub4_Sub1_848.aStream_5107
				.addInt(i_8_, 122);
			    aStream_847.currentOffset = 0;
			    aClass67_Sub5_Sub4_Sub1_848.anInt5112 = 8;
			} else if ((aClass67_Sub5_Sub4_Sub1_848.anInt5112
				    ^ 0xffffffff)
				   == -1) {
			    if ((aStream_847.buffer[0]
				 ^ 0xffffffff)
				!= 0)
				aClass67_Sub5_Sub4_Sub1_848 = null;
			    else {
				aClass67_Sub5_Sub4_Sub1_848.anInt5112 = 1;
				aStream_847.currentOffset = 0;
			    }
			} else
			    throw new IOException();
		    }
		} else {
		    int i_11_
			= (-aClass67_Sub5_Sub4_Sub1_848.aByte5104
			   + (aClass67_Sub5_Sub4_Sub1_848.aStream_5107
			      .buffer).length);
		    int i_12_ = -aClass67_Sub5_Sub4_Sub1_848.anInt5112 + 512;
		    if ((-(aClass67_Sub5_Sub4_Sub1_848.aStream_5107
			   .currentOffset) + i_11_
			 ^ 0xffffffff)
			> (i_12_ ^ 0xffffffff))
			i_12_ = -(aClass67_Sub5_Sub4_Sub1_848
				  .aStream_5107.currentOffset) + i_11_;
		    if ((i_1_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
			i_12_ = i_1_;
		    aClass117_840.method1629((byte) -115,
					     (aClass67_Sub5_Sub4_Sub1_848
					      .aStream_5107
					      .buffer),
					     (aClass67_Sub5_Sub4_Sub1_848
					      .aStream_5107.currentOffset),
					     i_12_);
		    if (aByte846 != 0) {
			for (int i_13_ = 0; i_12_ > i_13_; i_13_++)
			    aClass67_Sub5_Sub4_Sub1_848.aStream_5107
				.buffer
				[(aClass67_Sub5_Sub4_Sub1_848
				  .aStream_5107.currentOffset) - -i_13_]
				= (byte) (Class92.method1479
					  ((aClass67_Sub5_Sub4_Sub1_848
					    .aStream_5107.buffer
					    [((aClass67_Sub5_Sub4_Sub1_848
					       .aStream_5107.currentOffset)
					      + i_13_)]),
					   aByte846));
		    }
		    aClass67_Sub5_Sub4_Sub1_848.anInt5112 += i_12_;
		    aClass67_Sub5_Sub4_Sub1_848.aStream_5107.currentOffset
			+= i_12_;
		    if (((aClass67_Sub5_Sub4_Sub1_848.aStream_5107
			  .currentOffset)
			 ^ 0xffffffff)
			== (i_11_ ^ 0xffffffff)) {
			aClass67_Sub5_Sub4_Sub1_848.method821(24120);
			aClass67_Sub5_Sub4_Sub1_848.aBoolean4506 = false;
			aClass67_Sub5_Sub4_Sub1_848 = null;
		    } else if ((aClass67_Sub5_Sub4_Sub1_848.anInt5112
				^ 0xffffffff)
			       == -513)
			aClass67_Sub5_Sub4_Sub1_848.anInt5112 = 0;
		}
	    }
	    return true;
	} catch (IOException ioexception) {
	    try {
		aClass117_840.method1632((byte) 126);
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt844 = -2;
	    anInt845++;
	    aClass117_840 = null;
	    if (method346((byte) -108) == 0
		&& (method338(2) ^ 0xffffffff) == -1)
		return true;
	    return false;
	}
    }
    
    public Class40() {
	anInt844 = 0;
	aByte846 = (byte) 0;
	aStream_847 = new Stream(8);
    }
    
    static {
	anIntArray817 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	aRSString_824 = Class134.method1914(": ", (byte) 47);
    }
}
