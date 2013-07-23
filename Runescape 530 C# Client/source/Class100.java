/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100
{
    public static int anInt1968;
    public static int anInt1969 = 0;
    public static RSString aRSString_1970;
    public static int anInt1971;
    public static int anInt1972 = 0;
    public static int anInt1973;
    public static int anInt1974;
    public static int anInt1975 = 0;
    public static int anInt1976;
    public static boolean aBoolean1977 = true;
    public static int anInt1978;
    public static int anInt1979;
    public static int anInt1980;
    
    public static void method1533(int arg0) {
	Class67_Sub8.aClass136_2964.method1921((byte) -124);
	if (arg0 != 1)
	    method1538((byte) -13);
	anInt1971++;
	Class82.aClass136_1661.method1921((byte) 122);
	Class67_Sub1_Sub34.aClass136_4332.method1921((byte) -117);
	Class132.aClass136_2439.method1921((byte) 19);
    }
    
    public static void method1534(RSString arg0, boolean arg1, int arg2) {
	anInt1973++;
	if (arg2 != 21105)
	    method1538((byte) 71);
	arg0 = arg0.method496(8238);
	int i = 0;
	short[] is = new short[16];
	for (int i_0_ = 0; Class67_Sub1_Sub29.anInt4270 > i_0_; i_0_++) {
	    Class76 class76 = PacketParser.method1596(i_0_, -28322);
	    if ((!arg1 || class76.aBoolean1568) && class76.anInt1521 == -1
		&& class76.anInt1535 == -1 && class76.anInt1523 == 0
		&& class76.itemName.method496(arg2 ^ 0x725f)
		       .method514((byte) -128, arg0) != -1) {
		if ((i ^ 0xffffffff) <= -251) {
		    Class67_Sub1_Sub23.aShortArray4184 = null;
		    Class53.anInt1067 = -1;
		    return;
		}
		if (i >= is.length) {
		    short[] is_1_ = new short[is.length * 2];
		    for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
			 i_2_++)
			is_1_[i_2_] = is[i_2_];
		    is = is_1_;
		}
		is[i++] = (short) i_0_;
	    }
	}
	Class53.anInt1067 = i;
	Class129_Sub1.anInt3484 = 0;
	RSString[] RSStrings = new RSString[Class53.anInt1067];
	Class67_Sub1_Sub23.aShortArray4184 = is;
	for (int i_3_ = 0; i_3_ < Class53.anInt1067; i_3_++)
	    RSStrings[i_3_]
		= PacketParser.method1596(is[i_3_], -28322).itemName;
	Class67_Sub1_Sub24.method734(Class67_Sub1_Sub23.aShortArray4184, -4097,
				     RSStrings);
    }
    
    public static void updateNewPlayers(byte arg0) {
	if (arg0 != 88)
	    aBoolean1977 = true;
	while (Class54.aPacketStream_1069.method1104(Class67_Sub5_Sub1.lastPacketSize, 107) >= 11) {
	    int i = Class54.aPacketStream_1069.readBits((byte) 9, 11);	//If Bit 11 is set to 2047 then exit new player update thing.
	    if (i == 2047)
		break;
	    boolean bool = false;
	    if (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i] == null) { //If i AKA playerIndex == null then go in.. (not existing player)
		bool = true;
		Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i] = new Class131_Sub7_Sub2();
		if (Class23.aStreamArray556[i] != null)
		    Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i].appendPlayerAppearance(Class23.aStreamArray556[i], -100);
	    }
	    Class3.anIntArray120[Class67_Sub1_Sub4.anInt3855++] = i;
	    Class131_Sub7_Sub2 class131_sub7_sub2 = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i];
	    class131_sub7_sub2.anInt3789 = Class67_Sub1_Sub9.anInt3952;
	    int i_4_ = Class54.aPacketStream_1069.readBits((byte) 9, 1);	//if bit 1 = 1 then do new player update? anything else ignores it.
	    if (i_4_ == 1)
		Class61.anIntArray1142[Class126_Sub2.anInt3439++] = i;
	    int i_5_ = Class54.aPacketStream_1069.readBits((byte) 9, 5);	//Bit 5 = X coordinate.
	    if (i_5_ > 15)									    //If  Coordinate greater then 15.. then subtract 32.
		i_5_ -= 32;
	    int i_6_ = (Class118.anIntArray2235[Class54.aPacketStream_1069.readBits((byte) 9, 3)]); //Bit 3 = get last direction
	    if (bool)
		class131_sub7_sub2.anInt3721 = class131_sub7_sub2.anInt3740 = i_6_;
	    int i_7_ = Class54.aPacketStream_1069.readBits((byte) 9, 1);	//Bit 1 No clue, but recommand to set to 1.. seems to do something method1896 
	    int i_8_ = Class54.aPacketStream_1069.readBits((byte) 9, 5);	//Bit 5 = Y coordinate.
	    if ((i_8_ ^ 0xffffffff) < -16)							//If coordinate lower then 15.. then subract 32.
		i_8_ -= 32;
	    class131_sub7_sub2.method1896(i_7_ == 1,
		 Class122.aClass131_Sub7_Sub2_2309.smallY[0] + i_8_,
		 Class122.aClass131_Sub7_Sub2_2309.smallX[0] + i_5_,
		 14508);
	}
	anInt1979++;
	Class54.aPacketStream_1069.finishBitAcess(0);
    }
    
    public static synchronized byte[] method1536(byte arg0, int arg1) {
	anInt1978++;
	if (arg1 == 100 && (Class63.anInt1163 ^ 0xffffffff) < -1) {
	    byte[] is = Class141.aByteArrayArray2558[--Class63.anInt1163];
	    Class141.aByteArrayArray2558[Class63.anInt1163] = null;
	    return is;
	}
	if ((arg1 ^ 0xffffffff) == -5001
	    && (Class67_Sub15.anInt3079 ^ 0xffffffff) < -1) {
	    byte[] is
		= Class144.aByteArrayArray2602[--Class67_Sub15.anInt3079];
	    Class144.aByteArrayArray2602[Class67_Sub15.anInt3079] = null;
	    return is;
	}
	if ((arg1 ^ 0xffffffff) == -30001
	    && (Class41.anInt865 ^ 0xffffffff) < -1) {
	    byte[] is = Class91.aByteArrayArray1854[--Class41.anInt865];
	    Class91.aByteArrayArray1854[Class41.anInt865] = null;
	    return is;
	}
	int i = -8 % ((-45 - arg0) / 53);
	return new byte[arg1];
    }
    
    public static void method1537(int arg0, int arg1, int arg2) {
	anInt1980++;
	Class98 class98 = Class67_Sub29.method1312(31473, arg2);
	int i = class98.anInt1950;
	int i_9_ = class98.anInt1944;
	int i_10_ = class98.anInt1949;
	int i_11_ = Class67_Sub1_Sub15.anIntArray4050[-i_9_ + i_10_];
	if (arg0 < 0 || (arg0 ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
	    arg0 = 0;
	if (arg1 < 123)
	    anInt1975 = -17;
	i_11_ <<= i_9_;
	PacketStream.method1100(10, i, ((Class96.anIntArray1914[i]
					      & (i_11_ ^ 0xffffffff))
					     | arg0 << i_9_ & i_11_));
    }
    
    public static void method1538(byte arg0) {
	int i = Class53.anInt1066;
	anInt1976++;
	int i_12_ = Class49.anInt1007;
	int i_13_ = Class67_Sub16.anInt3084;
	int i_14_ = 6116423;
	int i_15_ = client.anInt2733;
	Class121.method1683(i_12_, i, i_13_, i_15_, i_14_);
	Class121.method1683(1 + i_12_, 1 + i, -2 + i_13_, 16, 0);
	Class121.method1681(1 + i_12_, i - -18, i_13_ + -2, i_15_ - 19, 0);
	Class130.aClass67_Sub5_Sub10_2404
	    .method920(Class119.aRSString_2257, 3 + i_12_, i - -14, i_14_, -1);
	int i_16_ = Class67_Sub5_Sub17.anInt4786;
	int i_17_ = Class67_Sub1_Sub22.anInt4172;
	int i_18_ = 0;
	if (arg0 == -2) {
	    for (/**/; i_18_ < Class134.anInt2476; i_18_++) {
		int i_19_ = 15 * (-i_18_ + Class134.anInt2476 + -1) + 31 + i;
		int i_20_ = 16777215;
		if (i_12_ < i_16_
		    && (i_16_ ^ 0xffffffff) > (i_13_ + i_12_ ^ 0xffffffff)
		    && (-13 + i_19_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)
		    && i_17_ < i_19_ + 3)
		    i_20_ = 16776960;
		Class130.aClass67_Sub5_Sub10_2404.method920
		    (Class64.method569(i_18_, (byte) 100), i_12_ - -3, i_19_,
		     i_20_, 0);
	    }
	    Class67_Sub1_Sub29.method754(Class53.anInt1066, client.anInt2733,
					 Class67_Sub16.anInt3084, -356,
					 Class49.anInt1007);
	}
    }
    
    public static void method1539(boolean arg0) {
	aRSString_1970 = null;
	if (arg0 != true)
	    method1539(true);
    }
    
    static {
	aRSString_1970 = Class134.method1914(": ", (byte) 28);
	anInt1974 = -1;
    }
}
