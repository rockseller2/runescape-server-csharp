/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class97
{
    public static short[] aShortArray1925 = new short[500];
    public int anInt1926 = -1;
    public static short[] aShortArray1927 = new short[500];
    public static short[] aShortArray1928 = new short[500];
    public short[] aShortArray1929;
    public boolean aBoolean1930 = false;
    public static short[] aShortArray1931;
    public short[] aShortArray1932;
    public short[] aShortArray1933;
    public short[] aShortArray1934;
    public static byte[] aByteArray1935 = new byte[500];
    public Class67_Sub20 aClass67_Sub20_1936 = null;
    public boolean aBoolean1937 = false;
    public byte[] aByteArray1938;
    public static short[] aShortArray1939;
    public short[] aShortArray1940;
    
    public static void method1510() {
	aShortArray1927 = null;
	aShortArray1928 = null;
	aShortArray1939 = null;
	aShortArray1925 = null;
	aShortArray1931 = null;
	aByteArray1935 = null;
    }
    
    public Class97(byte[] arg0, Class67_Sub20 arg1) {
	aClass67_Sub20_1936 = arg1;
	Stream Stream = new Stream(arg0);
	Stream Stream_0_ = new Stream(arg0);
	Stream.currentOffset = 2;
	int i = Stream.readByte((byte) -22);
	int i_1_ = 0;
	int i_2_ = -1;
	int i_3_ = -1;
	Stream_0_.currentOffset = Stream.currentOffset + i;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    int i_5_ = aClass67_Sub20_1936.anIntArray3169[i_4_];
	    if (i_5_ == 0)
		i_2_ = i_4_;
	    int i_6_ = Stream.readByte((byte) -50);
	    if (i_6_ > 0) {
		if (i_5_ == 0)
		    i_3_ = i_4_;
		aShortArray1927[i_1_] = (short) i_4_;
		short i_7_ = 0;
		if (i_5_ == 3)
		    i_7_ = (short) 128;
		if ((i_6_ & 0x1) != 0)
		    aShortArray1928[i_1_]
			= (short) Stream_0_.method1044(-15839);
		else
		    aShortArray1928[i_1_] = i_7_;
		if ((i_6_ & 0x2) != 0)
		    aShortArray1939[i_1_]
			= (short) Stream_0_.method1044(-15839);
		else
		    aShortArray1939[i_1_] = i_7_;
		if ((i_6_ & 0x4) != 0)
		    aShortArray1925[i_1_]
			= (short) Stream_0_.method1044(-15839);
		else
		    aShortArray1925[i_1_] = i_7_;
		aByteArray1935[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
		if (i_5_ == 2) {
		    aShortArray1928[i_1_]
			= (short) (((aShortArray1928[i_1_] & 0xff) << 3)
				   + (aShortArray1928[i_1_] >> 8 & 0x7));
		    aShortArray1939[i_1_]
			= (short) (((aShortArray1939[i_1_] & 0xff) << 3)
				   + (aShortArray1939[i_1_] >> 8 & 0x7));
		    aShortArray1925[i_1_]
			= (short) (((aShortArray1925[i_1_] & 0xff) << 3)
				   + (aShortArray1925[i_1_] >> 8 & 0x7));
		}
		aShortArray1931[i_1_] = (short) -1;
		if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
		    if (i_2_ > i_3_) {
			aShortArray1931[i_1_] = (short) i_2_;
			i_3_ = i_2_;
		    }
		} else if (i_5_ == 5)
		    aBoolean1930 = true;
		else if (i_5_ == 7)
		    aBoolean1937 = true;
		i_1_++;
	    }
	}
	if (Stream_0_.currentOffset != arg0.length)
	    throw new RuntimeException();
	anInt1926 = i_1_;
	aShortArray1933 = new short[i_1_];
	aShortArray1932 = new short[i_1_];
	aShortArray1934 = new short[i_1_];
	aShortArray1940 = new short[i_1_];
	aShortArray1929 = new short[i_1_];
	aByteArray1938 = new byte[i_1_];
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    aShortArray1933[i_8_] = aShortArray1927[i_8_];
	    aShortArray1932[i_8_] = aShortArray1928[i_8_];
	    aShortArray1934[i_8_] = aShortArray1939[i_8_];
	    aShortArray1940[i_8_] = aShortArray1925[i_8_];
	    aShortArray1929[i_8_] = aShortArray1931[i_8_];
	    aByteArray1938[i_8_] = aByteArray1935[i_8_];
	}
    }
    
    static {
	aShortArray1931 = new short[500];
	aShortArray1939 = new short[500];
    }
}
