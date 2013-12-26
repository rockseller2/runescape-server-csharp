public class Class20
{
    public int anInt498;
    public Class115 aClass115_499 = null;
    public static RSString aRSString_500
	= Class134.method1914("Lade Schrifts-=tze )2 ", (byte) 44);
    public static int anInt501;
    public int anInt502;
    public static Class50 aClass50_503;
    public static int anInt504;
    public static int anInt505;
    public static int anInt506 = (int) (Math.random() * 17.0) - 8;
    public static int anInt507;
    public Class115 aClass115_508 = null;
    public static int anInt509;
    public static int[] anIntArray510;
    public static RSString aRSString_511;
    
    public boolean method193(int arg0, int arg1, byte[] arg2, byte arg3) {
	anInt505++;
	synchronized (aClass115_499) {
	    if (arg0 < 0 || anInt502 < arg0)
		throw new IllegalArgumentException();
	    boolean bool = method194(arg1, arg0, (byte) 104, true, arg2);
	    if (arg3 != 57)
		aClass115_508 = null;
	    if (!bool)
		bool = method194(arg1, arg0, (byte) 122, false, arg2);
	    return bool;
	}
    }
    
    public boolean method194(int arg0, int arg1, byte arg2, boolean arg3,
			     byte[] arg4) {
	anInt509++;
	synchronized (aClass115_499) {
	    try {
		int i = 111 % ((66 - arg2) / 37);
		int i_0_;
		if (!arg3) {
		    i_0_ = (int) ((aClass115_499.method1615(0) + 519L) / 520L);
		    if ((i_0_ ^ 0xffffffff) == -1)
			i_0_ = 1;
		} else {
		    if ((long) (arg0 * 6 - -6) > aClass115_508.method1615(0))
			return false;
		    aClass115_508.method1614((long) (6 * arg0), -115);
		    aClass115_508.method1613(6, Login.aByteArray1617,
					     (byte) 121, 0);
		    i_0_ = (((Login.aByteArray1617[3] & 0xff) << -1108870800)
			    - -(0xff00
				& Login.aByteArray1617[4] << -1578019064)
			    - -(Login.aByteArray1617[5] & 0xff));
		    if ((i_0_ ^ 0xffffffff) >= -1
			|| (long) i_0_ > aClass115_499.method1615(0) / 520L)
			return false;
		}
		Login.aByteArray1617[4] = (byte) (i_0_ >> 1493461352);
		Login.aByteArray1617[1] = (byte) (arg1 >> -1463644088);
		Login.aByteArray1617[5] = (byte) i_0_;
		Login.aByteArray1617[2] = (byte) arg1;
		Login.aByteArray1617[0] = (byte) (arg1 >> -122351920);
		int i_1_ = 0;
		Login.aByteArray1617[3] = (byte) (i_0_ >> -469779568);
		aClass115_508.method1614((long) (arg0 * 6), -117);
		int i_2_ = 0;
		aClass115_508.method1616((byte) 50, 0, Login.aByteArray1617,
					 6);
		int i_3_;
		for (/**/; (i_1_ ^ 0xffffffff) > (arg1 ^ 0xffffffff);
		     i_1_ += i_3_) {
		    int i_4_ = 0;
		    if (arg3) {
			aClass115_499.method1614((long) (i_0_ * 520), -124);
			try {
			    aClass115_499.method1613(8, Login.aByteArray1617,
						     (byte) 122, 0);
			} catch (java.io.EOFException eofexception) {
			    break;
			}
			i_4_ = (((Login.aByteArray1617[4] & 0xff)
				 << 101116368)
				- (-((Login.aByteArray1617[5] & 0xff)
				     << -1710752344)
				   + -(0xff & Login.aByteArray1617[6])));
			i_3_ = ((0xff & Login.aByteArray1617[1])
				+ ((Login.aByteArray1617[0] & 0xff)
				   << 1725158984));
			int i_5_ = ((Login.aByteArray1617[3] & 0xff)
				    + (Login.aByteArray1617[2] << 2056001992
				       & 0xff00));
			int i_6_ = Login.aByteArray1617[7] & 0xff;
			if ((arg0 ^ 0xffffffff) != (i_3_ ^ 0xffffffff)
			    || (i_5_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff)
			    || i_6_ != anInt498)
			    return false;
			if (i_4_ < 0
			    || ((aClass115_499.method1615(0) / 520L
				 ^ 0xffffffffffffffffL)
				> ((long) i_4_ ^ 0xffffffffffffffffL)))
			    return false;
		    }
		    if ((i_4_ ^ 0xffffffff) == -1) {
			arg3 = false;
			i_4_ = (int) ((519L + aClass115_499.method1615(0))
				      / 520L);
			if ((i_4_ ^ 0xffffffff) == -1)
			    i_4_++;
			if ((i_0_ ^ 0xffffffff) == (i_4_ ^ 0xffffffff))
			    i_4_++;
		    }
		    Login.aByteArray1617[3] = (byte) i_2_;
		    Login.aByteArray1617[0] = (byte) (arg0 >> 869621448);
		    if (-i_1_ + arg1 <= 512)
			i_4_ = 0;
		    Login.aByteArray1617[7] = (byte) anInt498;
		    Login.aByteArray1617[4] = (byte) (i_4_ >> 1078052432);
		    Login.aByteArray1617[1] = (byte) arg0;
		    Login.aByteArray1617[2] = (byte) (i_2_ >> 165607784);
		    i_3_ = -i_1_ + arg1;
		    i_2_++;
		    Login.aByteArray1617[6] = (byte) i_4_;
		    if (i_3_ > 512)
			i_3_ = 512;
		    Login.aByteArray1617[5] = (byte) (i_4_ >> 1167267112);
		    aClass115_499.method1614((long) (520 * i_0_), -118);
		    i_0_ = i_4_;
		    aClass115_499.method1616((byte) 50, 0,
					     Login.aByteArray1617, 8);
		    aClass115_499.method1616((byte) 50, i_1_, arg4, i_3_);
		}
		return true;
	    } catch (java.io.IOException ioexception) {
		return false;
	    }
	}
    }
    
    public String toString() {
	anInt501++;
	return "Cache:" + anInt498;
    }
    
    public static void method195(byte arg0) {
	aRSString_500 = null;
	if (arg0 != 14)
	    method195((byte) 99);
	aRSString_511 = null;
	anIntArray510 = null;
	aClass50_503 = null;
    }
    
    public byte[] method196(int arg0, int arg1) {
	anInt507++;
	synchronized (aClass115_499) {
	    try {
		if ((long) (arg1 * 6 + 6)
		    > aClass115_508.method1615(arg0 ^ 0xff00))
		    return null;
		aClass115_508.method1614((long) (arg1 * 6), -127);
		aClass115_508.method1613(6, Login.aByteArray1617, (byte) -64,
					 0);
		int i = ((0xff & Login.aByteArray1617[2])
			 + (arg0 & Login.aByteArray1617[1] << 1271792936)
			 + ((Login.aByteArray1617[0] & 0xff) << -929309424));
		int i_7_
		    = ((0xff & Login.aByteArray1617[5])
		       + (((Login.aByteArray1617[4] & 0xff) << 1538245672)
			  + ((0xff & Login.aByteArray1617[3])
			     << 2139388240)));
		if (i < 0 || (i ^ 0xffffffff) < (anInt502 ^ 0xffffffff))
		    return null;
		if ((i_7_ ^ 0xffffffff) >= -1
		    || (long) i_7_ > aClass115_499.method1615(0) / 520L)
		    return null;
		byte[] is = new byte[i];
		int i_8_ = 0;
		int i_9_ = 0;
		while (i > i_8_) {
		    if ((i_7_ ^ 0xffffffff) == -1)
			return null;
		    int i_10_ = -i_8_ + i;
		    if ((i_10_ ^ 0xffffffff) < -513)
			i_10_ = 512;
		    aClass115_499.method1614((long) (i_7_ * 520), -119);
		    aClass115_499.method1613(8 + i_10_, Login.aByteArray1617,
					     (byte) 101, 0);
		    int i_11_
			= (((0xff & Login.aByteArray1617[0]) << -586551224)
			   - -(0xff & Login.aByteArray1617[1]));
		    int i_12_
			= (((0xff & Login.aByteArray1617[2]) << 656927688)
			   + (Login.aByteArray1617[3] & 0xff));
		    int i_13_
			= ((Login.aByteArray1617[5] << -2035369784 & 0xff00)
			   + (0xff0000
			      & Login.aByteArray1617[4] << 2111200208)
			   + (Login.aByteArray1617[6] & 0xff));
		    int i_14_ = Login.aByteArray1617[7] & 0xff;
		    if (i_11_ != arg1
			|| (i_9_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff)
			|| i_14_ != anInt498)
			return null;
		    if (i_13_ < 0 || (((long) i_13_ ^ 0xffffffffffffffffL)
				      < (aClass115_499.method1615(0) / 520L
					 ^ 0xffffffffffffffffL)))
			return null;
		    i_7_ = i_13_;
		    for (int i_15_ = 0; i_15_ < i_10_; i_15_++)
			is[i_8_++] = Login.aByteArray1617[8 + i_15_];
		    i_9_++;
		}
		return is;
	    } catch (java.io.IOException ioexception) {
		return null;
	    }
	}
    }
    
    public Class20(int arg0, Class115 arg1, Class115 arg2, int arg3) {
	anInt502 = 65000;
	try {
	    aClass115_499 = arg1;
	    anInt502 = arg3;
	    aClass115_508 = arg2;
	    anInt498 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("cg.<init>(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
    }
    
    static {
	aClass50_503 = new Class50();
	anIntArray510 = new int[] { 1, 4 };
	aRSString_511 = Class134.method1914("<br>", (byte) 13);
    }
}
