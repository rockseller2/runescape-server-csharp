/* PacketStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PacketStream extends Stream
{
    public static int anInt4830;
    public int bitPosition;
    public static int anInt4832;
    public static int anInt4833;
    public static int anInt4834;
    public static int anInt4835;
    public static RSString aRSString_4836
	= Class134.method1914("hint_mapedge", (byte) 82);
    public Class62 aClass62_4837;
    public static int anInt4838;
    public static int anInt4839;
    public static int anInt4840;
    public static int anInt4841;
    public static int anInt4842;
    
    public int readBits(byte arg0, int arg1) {
	anInt4833++;
	int i = bitPosition >> -1400347613;
	int i_0_ = 8 + -(0x7 & bitPosition);
	bitPosition += arg1;
	int i_1_ = 0;
	for (/**/; arg1 > i_0_; i_0_ = 8) {
	    i_1_
		+= (buffer[i++]
		    & Class67_Sub1_Sub12.anIntArray4007[i_0_]) << -i_0_ + arg1;
	    arg1 -= i_0_;
	}
	if (arg0 != 9)
	    aClass62_4837 = null;
	if (i_0_ != arg1)
	    i_1_ += (buffer[i] >> -arg1 + i_0_
		     & Class67_Sub1_Sub12.anIntArray4007[arg1]);
	else
	    i_1_
		+= buffer[i] & Class67_Sub1_Sub12.anIntArray4007[i_0_];
	return i_1_;
    }
    
    public void initBitAccess(int arg0) {
	int i = 93 % ((-15 - arg0) / 63);
	anInt4842++;
	bitPosition = 8 * currentOffset;
    }
    
    public int method1096(int arg0) {
	if (arg0 != -23542)
	    bitPosition = -8;
	anInt4834++;
	return 0xff & (buffer[currentOffset++]
		       + -aClass62_4837.getNextKey((byte) 124));
    }
    
    public void method1097(byte[] arg0, int arg1, int arg2, int arg3) {
	anInt4830++;
	if (arg1 != -1476)
	    readBits((byte) 38, 36);
	for (int i = 0; i < arg3; i++)
	    arg0[arg2 + i] = (byte) (buffer[currentOffset++]
				     + -aClass62_4837.getNextKey((byte) 111));
    }
    
    public void setCryption(int[] arg0, int arg1) {
	anInt4832++;
	if (arg1 > 0)
	    method1097(null, -83, 105, 11);
	aClass62_4837 = new Class62(arg0);
    }
    
    public void finishBitAcess(int arg0) {
	currentOffset = (bitPosition + 7) / 8;
	anInt4839++;
	if (arg0 != 0)
	    method1101((byte) -88);
    }
    
    public static void method1100(int arg0, int arg1, int arg2) {
	if (arg0 != 10)
	    aRSString_4836 = null;
	Class96.anIntArray1914[arg1] = arg2;
	anInt4841++;
	Class67_Sub28 class67_sub28
	    = ((Class67_Sub28)
	       Class25.aClass92_599.method1489((byte) -92, (long) arg1));
	if (class67_sub28 != null) {
	    if (class67_sub28.aLong3326 != 4611686018427387905L)
		class67_sub28.aLong3326
		    = 500L + Class39.method337(19644) | 0x4000000000000000L;
	} else {
	    class67_sub28 = new Class67_Sub28(4611686018427387905L);
	    Class25.aClass92_599.method1488((byte) -89, class67_sub28,
					    (long) arg1);
	}
    }
    
    public static void method1101(byte arg0) {
	if (arg0 <= -99)
	    aRSString_4836 = null;
    }
    
    public void createFrame(int arg0, int arg1) {
	if (arg0 != 2)
	    aRSString_4836 = null;
	buffer[currentOffset++] = (byte) (aClass62_4837.getNextKey((byte) 107) + arg1);
	anInt4835++;
    }
    
    public PacketStream(int arg0) {
	super(arg0);
    }
    
    public static int method1103(int arg0, byte arg1, int arg2) {
	if (arg1 != -29)
	    method1100(-60, 55, -15);
	anInt4840++;
	int i
	    = (-128
	       + Class67_Sub28.method1310(4, arg0 + 45365, true, arg2 + 91923)
	       + (Class67_Sub28.method1310(2, arg0 - -10294, true,
					   arg2 - -37821) - 128
		  >> -904841247)
	       + (-128 + Class67_Sub28.method1310(1, arg0, true, arg2)
		  >> 944049954));
	i = 35 + (int) (0.3 * (double) i);
	if (i >= 10) {
	    if ((i ^ 0xffffffff) < -61)
		i = 60;
	} else
	    i = 10;
	return i;
    }
    
    public int method1104(int arg0, int arg1) {
	anInt4838++;
	if (arg1 < 66)
	    return 105;
	return 8 * arg0 - bitPosition;
    }
}
