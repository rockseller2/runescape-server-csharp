/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Class115
{
    public long aLong2163;
    public static int anInt2164;
    public long aLong2165;
    public long aLong2166 = -1L;
    public static int anInt2167;
    public byte[] aByteArray2168;
    public static int anInt2169;
    public static int anInt2170;
    public Class93 aClass93_2171;
    public long aLong2172;
    public long aLong2173 = -1L;
    public int anInt2174 = 0;
    public static int anInt2175;
    public byte[] aByteArray2176;
    public static int anInt2177;
    public static Class80 aClass80_2178 = Class44.method391(true);
    public static int anInt2179;
    public int anInt2180;
    public static int anInt2181;
    public static int anInt2182;
    public static short[] aShortArray2183;
    public static int anInt2184;
    public static int anInt2185;
    public static int anInt2186 = 0;
    public long aLong2187;
    public static long[] aLongArray2188;
    public static RSString[] aRSStringArray2189 = new RSString[5];
    
    public void method1611(byte arg0) throws IOException {
	if (arg0 >= -118)
	    aClass80_2178 = null;
	anInt2180 = 0;
	if (aLong2163 != aLong2187) {
	    aClass93_2171.method1493(0, aLong2187);
	    aLong2163 = aLong2187;
	}
	aLong2166 = aLong2187;
	anInt2181++;
	while ((anInt2180 ^ 0xffffffff)
	       > (aByteArray2168.length ^ 0xffffffff)) {
	    int i = -anInt2180 + aByteArray2168.length;
	    if (i > 200000000)
		i = 200000000;
	    int i_0_
		= aClass93_2171.method1490(i, aByteArray2168, anInt2180, -1);
	    if (i_0_ == -1)
		break;
	    anInt2180 += i_0_;
	    aLong2163 += (long) i_0_;
	}
    }
    
    public void method1612(int arg0, byte[] arg1) throws IOException {
	if (arg0 != 5)
	    aLong2187 = 71L;
	anInt2170++;
	method1613(arg1.length, arg1, (byte) 101, 0);
    }
    
    public void method1613(int arg0, byte[] arg1, byte arg2, int arg3)
	throws IOException {
	anInt2167++;
	try {
	    if ((arg1.length ^ 0xffffffff) > (arg0 + arg3 ^ 0xffffffff))
		throw new ArrayIndexOutOfBoundsException(-arg1.length + arg3
							 - -arg0);
	    if (aLong2173 != -1L
		&& (aLong2187 ^ 0xffffffffffffffffL) <= (aLong2173
							 ^ 0xffffffffffffffffL)
		&& (long) anInt2174 + aLong2173 >= aLong2187 + (long) arg0) {
		Class17.method185(aByteArray2176,
				  (int) (aLong2187 + -aLong2173), arg1, arg3,
				  arg0);
		aLong2187 += (long) arg0;
		return;
	    }
	    int i = arg3;
	    int i_1_ = 108 % ((36 - arg2) / 53);
	    long l = aLong2187;
	    int i_2_ = arg0;
	    if (aLong2166 <= aLong2187
		&& ((aLong2187 ^ 0xffffffffffffffffL)
		    > (aLong2166 - -(long) anInt2180 ^ 0xffffffffffffffffL))) {
		int i_3_ = (int) ((long) anInt2180 - -aLong2166 - aLong2187);
		if ((i_3_ ^ 0xffffffff) < (arg0 ^ 0xffffffff))
		    i_3_ = arg0;
		Class17.method185(aByteArray2168,
				  (int) (-aLong2166 + aLong2187), arg1, arg3,
				  i_3_);
		arg0 -= i_3_;
		aLong2187 += (long) i_3_;
		arg3 += i_3_;
	    }
	    if (aByteArray2168.length >= arg0) {
		if (arg0 > 0) {
		    method1611((byte) -128);
		    int i_4_ = arg0;
		    if ((i_4_ ^ 0xffffffff) < (anInt2180 ^ 0xffffffff))
			i_4_ = anInt2180;
		    Class17.method185(aByteArray2168, 0, arg1, arg3, i_4_);
		    arg3 += i_4_;
		    aLong2187 += (long) i_4_;
		    arg0 -= i_4_;
		}
	    } else {
		aClass93_2171.method1493(0, aLong2187);
		aLong2163 = aLong2187;
		while ((arg0 ^ 0xffffffff) < -1) {
		    int i_5_ = aClass93_2171.method1490(arg0, arg1, arg3, -1);
		    if (i_5_ == -1)
			break;
		    aLong2163 += (long) i_5_;
		    arg0 -= i_5_;
		    aLong2187 += (long) i_5_;
		    arg3 += i_5_;
		}
	    }
	    if ((aLong2173 ^ 0xffffffffffffffffL) != 0L) {
		if ((aLong2173 ^ 0xffffffffffffffffL) < (aLong2187
							 ^ 0xffffffffffffffffL)
		    && (arg0 ^ 0xffffffff) < -1) {
		    int i_6_ = arg3 - -(int) (aLong2173 - aLong2187);
		    if ((i_6_ ^ 0xffffffff) < (arg3 + arg0 ^ 0xffffffff))
			i_6_ = arg0 + arg3;
		    while ((i_6_ ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
			arg0--;
			arg1[arg3++] = (byte) 0;
			aLong2187++;
		    }
		}
		long l_7_ = -1L;
		if ((l ^ 0xffffffffffffffffL) > ((long) anInt2174 + aLong2173
						 ^ 0xffffffffffffffffL)
		    && ((aLong2173 + (long) anInt2174 ^ 0xffffffffffffffffL)
			>= ((long) i_2_ + l ^ 0xffffffffffffffffL)))
		    l_7_ = aLong2173 + (long) anInt2174;
		else if (((l + (long) i_2_ ^ 0xffffffffffffffffL)
			  < (aLong2173 ^ 0xffffffffffffffffL))
			 && l + (long) i_2_ <= (long) anInt2174 + aLong2173)
		    l_7_ = l + (long) i_2_;
		long l_8_ = -1L;
		if (aLong2173 >= l && aLong2173 < l - -(long) i_2_)
		    l_8_ = aLong2173;
		else if ((l ^ 0xffffffffffffffffL) <= (aLong2173
						       ^ 0xffffffffffffffffL)
			 && ((aLong2173 + (long) anInt2174
			      ^ 0xffffffffffffffffL)
			     < (l ^ 0xffffffffffffffffL)))
		    l_8_ = l;
		if (l_8_ > -1L && l_7_ > l_8_) {
		    int i_9_ = (int) (l_7_ + -l_8_);
		    Class17.method185(aByteArray2176, (int) (l_8_ - aLong2173),
				      arg1, (int) (-l + l_8_) + i, i_9_);
		    if (aLong2187 < l_7_) {
			arg0 -= l_7_ - aLong2187;
			aLong2187 = l_7_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong2163 = -1L;
	    throw ioexception;
	}
	if (arg0 > 0)
	    throw new EOFException();
    }
    
    public void method1614(long arg0, int arg1) throws IOException {
	try {
	    anInt2175++;
	    if (arg1 >= -114)
		aShortArray2183 = null;
	    if (arg0 < 0L)
		throw new IOException("Invalid seek to " + arg0 + " in file "
				      + method1618(23431));
	    aLong2187 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("sa.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public long method1615(int arg0) {
	anInt2184++;
	if (arg0 != 0)
	    method1619(84, -99, 74);
	return aLong2172;
    }
    
    public void method1616(byte arg0, int arg1, byte[] arg2, int arg3)
	throws IOException {
	anInt2164++;
	try {
	    if (arg0 != 50)
		aLongArray2188 = null;
	    if (aLong2187 - -(long) arg3 > aLong2172)
		aLong2172 = (long) arg3 + aLong2187;
	    if ((aLong2173 ^ 0xffffffffffffffffL) != 0L
		&& ((aLong2187 ^ 0xffffffffffffffffL) > (aLong2173
							 ^ 0xffffffffffffffffL)
		    || ((aLong2187 ^ 0xffffffffffffffffL)
			< ((long) anInt2174 + aLong2173
			   ^ 0xffffffffffffffffL))))
		method1620(-128);
	    if (aLong2173 != -1L
		&& (((long) aByteArray2176.length + aLong2173
		     ^ 0xffffffffffffffffL)
		    > (aLong2187 - -(long) arg3 ^ 0xffffffffffffffffL))) {
		int i = (int) (-aLong2187 + aLong2173
			       + (long) aByteArray2176.length);
		arg3 -= i;
		Class17.method185(arg2, arg1, aByteArray2176,
				  (int) (aLong2187 - aLong2173), i);
		aLong2187 += (long) i;
		anInt2174 = aByteArray2176.length;
		arg1 += i;
		method1620(-87);
	    }
	    if ((aByteArray2176.length ^ 0xffffffff) > (arg3 ^ 0xffffffff)) {
		long l = -1L;
		if (aLong2187 != aLong2163) {
		    aClass93_2171.method1493(0, aLong2187);
		    aLong2163 = aLong2187;
		}
		aClass93_2171.method1492(arg3, arg2, arg1, (byte) 125);
		if ((aLong2166 ^ 0xffffffffffffffffL) < (aLong2187
							 ^ 0xffffffffffffffffL)
		    || aLong2166 - -(long) anInt2180 <= aLong2187) {
		    if (aLong2166 >= aLong2187
			&& aLong2166 < (long) arg3 + aLong2187)
			l = aLong2166;
		} else
		    l = aLong2187;
		aLong2163 += (long) arg3;
		if (aLong2165 < aLong2163)
		    aLong2165 = aLong2163;
		long l_10_ = -1L;
		if (aLong2166 < (long) arg3 + aLong2187
		    && (((long) arg3 + aLong2187 ^ 0xffffffffffffffffL)
			>= ((long) anInt2180 + aLong2166
			    ^ 0xffffffffffffffffL)))
		    l_10_ = (long) arg3 + aLong2187;
		else if (aLong2187 < aLong2166 + (long) anInt2180
			 && (aLong2166 - -(long) anInt2180
			     <= (long) arg3 + aLong2187))
		    l_10_ = aLong2166 + (long) anInt2180;
		if (l > -1L && l_10_ > l) {
		    int i = (int) (l_10_ - l);
		    Class17.method185(arg2,
				      (int) (-aLong2187 + ((long) arg1 - -l)),
				      aByteArray2168, (int) (l + -aLong2166),
				      i);
		}
		aLong2187 += (long) arg3;
	    } else if (arg3 > 0) {
		if ((aLong2173 ^ 0xffffffffffffffffL) == 0L)
		    aLong2173 = aLong2187;
		Class17.method185(arg2, arg1, aByteArray2176,
				  (int) (-aLong2173 + aLong2187), arg3);
		aLong2187 += (long) arg3;
		if (aLong2187 + -aLong2173 > (long) anInt2174)
		    anInt2174 = (int) (aLong2187 - aLong2173);
	    }
	} catch (IOException ioexception) {
	    aLong2163 = -1L;
	    throw ioexception;
	}
    }
    
    public void method1617(int arg0) throws IOException {
	method1620(-125);
	aClass93_2171.method1491(arg0 + 2274);
	anInt2177++;
	if (arg0 != -2275)
	    method1615(-30);
    }
    
    public File method1618(int arg0) {
	anInt2169++;
	if (arg0 != 23431)
	    aShortArray2183 = null;
	return aClass93_2171.method1495((byte) -94);
    }
    
    public static void method1619(int arg0, int arg1, int arg2) {
	anInt2179++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg0, false, arg1);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg2;
    }
    
    public void method1620(int arg0) throws IOException {
	anInt2182++;
	if ((aLong2173 ^ 0xffffffffffffffffL) != 0L) {
	    if ((aLong2173 ^ 0xffffffffffffffffL)
		!= (aLong2163 ^ 0xffffffffffffffffL)) {
		aClass93_2171.method1493(0, aLong2173);
		aLong2163 = aLong2173;
	    }
	    aClass93_2171.method1492(anInt2174, aByteArray2176, 0, (byte) 115);
	    aLong2163 += (long) anInt2174;
	    long l = -1L;
	    if (aLong2165 < aLong2163)
		aLong2165 = aLong2163;
	    long l_11_ = -1L;
	    if (aLong2173 >= aLong2166
		&& aLong2173 < aLong2166 - -(long) anInt2180)
		l_11_ = aLong2173;
	    else if (((aLong2166 ^ 0xffffffffffffffffL)
		      <= (aLong2173 ^ 0xffffffffffffffffL))
		     && ((aLong2173 + (long) anInt2174 ^ 0xffffffffffffffffL)
			 < (aLong2166 ^ 0xffffffffffffffffL)))
		l_11_ = aLong2166;
	    if (aLong2173 - -(long) anInt2174 <= aLong2166
		|| ((aLong2166 - -(long) anInt2180 ^ 0xffffffffffffffffL)
		    > ((long) anInt2174 + aLong2173 ^ 0xffffffffffffffffL))) {
		if (((aLong2173 ^ 0xffffffffffffffffL)
		     > ((long) anInt2180 + aLong2166 ^ 0xffffffffffffffffL))
		    && (((long) anInt2180 + aLong2166 ^ 0xffffffffffffffffL)
			>= ((long) anInt2174 + aLong2173
			    ^ 0xffffffffffffffffL)))
		    l = (long) anInt2180 + aLong2166;
	    } else
		l = aLong2173 + (long) anInt2174;
	    if (l_11_ > -1L
		&& (l_11_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
		int i = (int) (l + -l_11_);
		Class17.method185(aByteArray2176, (int) (l_11_ + -aLong2173),
				  aByteArray2168, (int) (-aLong2166 + l_11_),
				  i);
	    }
	    aLong2173 = -1L;
	    anInt2174 = 0;
	}
	if (arg0 > -42)
	    method1618(52);
    }
    
    public static void method1621(byte arg0) {
	aClass80_2178 = null;
	aRSStringArray2189 = null;
	if (arg0 > -105)
	    method1621((byte) 115);
	aLongArray2188 = null;
	aShortArray2183 = null;
    }
    
    public Class115(Class93 arg0, int arg1, int arg2) throws IOException {
	aClass93_2171 = arg0;
	aLong2172 = aLong2165 = arg0.method1494(0);
	aLong2187 = 0L;
	aByteArray2176 = new byte[arg2];
	aByteArray2168 = new byte[arg1];
    }
    
    static {
	aLongArray2188 = new long[500];
	anInt2185 = 0;
    }
}
