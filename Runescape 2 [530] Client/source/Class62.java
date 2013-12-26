/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62
{
    public static Class119_Sub1[] aClass119_Sub1Array1148;
    public static int anInt1149;
    public int anInt1150;
    public static int[] anIntArray1151;
    public static int anInt1152;
    public int[] cryptArray;
    public static int anInt1154;
    public int anInt1155;
    public static int anInt1156;
    public static short[][] aShortArrayArray1157;
    public int[] keySetArray;
    public static int anInt1159;
    public int anInt1160;
    public int anInt1161;
    public static int anInt1162;
    
    public static void method560(byte arg0) {
	aShortArrayArray1157 = null;
	aClass119_Sub1Array1148 = null;
	anIntArray1151 = null;
	int i = 13 % ((arg0 - -32) / 34);
    }
    
    public void generateNextKeySet(int arg0) {
	anInt1156++;
	if (arg0 != 1)
	    method560((byte) -42);
	anInt1161 += ++anInt1155;
	for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
	    int i_0_ = cryptArray[i];
	    if ((0x2 & i ^ 0xffffffff) == -1) {
		if ((i & 0x1 ^ 0xffffffff) != -1)
		    anInt1160 ^= anInt1160 >>> -902922074;
		else
		    anInt1160 ^= anInt1160 << -1048204915;
	    } else if ((0x1 & i) != 0)
		anInt1160 ^= anInt1160 >>> -1372239152;
	    else
		anInt1160 ^= anInt1160 << -114587422;
	    anInt1160 += cryptArray[i + 128 & 0xff];
	    int i_1_;
	    cryptArray[i] = i_1_
		= anInt1160 + ((cryptArray
				[Class75.method1379(i_0_, 1020) >> -130811102])
			       + anInt1161);
	    keySetArray[i] = anInt1161
		= ((cryptArray
		    [Class75.method1379(i_1_ >> 1196591240 >> 5401410, 255)])
		   + i_0_);
	}
    }
    
    public void initializeKeySet(int arg0) {
	anInt1154++;
	int i_2_;
	int i_3_;
	int i_4_;
	int i_5_;
	int i_6_;
	int i_7_;
	int i_8_;
	int i = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = -1640531527;
	int i_9_ = 0;
	if (arg0 != -22820)
	    method560((byte) -116);
	for (/**/; i_9_ < 4; i_9_++) {
	    i ^= i_2_ << 2137670699;
	    i_2_ += i_3_;
	    i_4_ += i;
	    i_2_ ^= i_3_ >>> -671781214;
	    i_5_ += i_2_;
	    i_3_ += i_4_;
	    i_3_ ^= i_4_ << -1692948792;
	    i_6_ += i_3_;
	    i_4_ += i_5_;
	    i_4_ ^= i_5_ >>> 573428240;
	    i_5_ += i_6_;
	    i_5_ ^= i_6_ << 928680490;
	    i_8_ += i_5_;
	    i_7_ += i_4_;
	    i_6_ += i_7_;
	    i_6_ ^= i_7_ >>> 174699524;
	    i_7_ += i_8_;
	    i_7_ ^= i_8_ << -1558027032;
	    i += i_6_;
	    i_8_ += i;
	    i_8_ ^= i >>> -1662222711;
	    i_3_ += i_8_;
	    i_2_ += i_7_;
	    i += i_2_;
	}
	for (i_9_ = 0; i_9_ < 256; i_9_ += 8) {
	    i_2_ += keySetArray[i_9_ + 1];
	    i_6_ += keySetArray[i_9_ - -5];
	    i_3_ += keySetArray[i_9_ + 2];
	    i += keySetArray[i_9_];
	    i_4_ += keySetArray[3 + i_9_];
	    i_8_ += keySetArray[i_9_ - -7];
	    i_7_ += keySetArray[i_9_ - -6];
	    i ^= i_2_ << 574944203;
	    i_2_ += i_3_;
	    i_5_ += keySetArray[4 + i_9_];
	    i_4_ += i;
	    i_2_ ^= i_3_ >>> -1339442238;
	    i_3_ += i_4_;
	    i_3_ ^= i_4_ << -168165784;
	    i_5_ += i_2_;
	    i_6_ += i_3_;
	    i_4_ += i_5_;
	    i_4_ ^= i_5_ >>> 788965712;
	    i_5_ += i_6_;
	    i_5_ ^= i_6_ << -1423646646;
	    i_8_ += i_5_;
	    i_7_ += i_4_;
	    i_6_ += i_7_;
	    i_6_ ^= i_7_ >>> 2027520964;
	    i += i_6_;
	    i_7_ += i_8_;
	    i_7_ ^= i_8_ << -1498558072;
	    i_2_ += i_7_;
	    i_8_ += i;
	    i_8_ ^= i >>> 261273673;
	    i_3_ += i_8_;
	    i += i_2_;
	    cryptArray[i_9_] = i;
	    cryptArray[i_9_ - -1] = i_2_;
	    cryptArray[i_9_ + 2] = i_3_;
	    cryptArray[i_9_ + 3] = i_4_;
	    cryptArray[i_9_ + 4] = i_5_;
	    cryptArray[5 + i_9_] = i_6_;
	    cryptArray[6 + i_9_] = i_7_;
	    cryptArray[7 + i_9_] = i_8_;
	}
	for (i_9_ = 0; i_9_ < 256; i_9_ += 8) {
	    i_3_ += cryptArray[2 + i_9_];
	    i_2_ += cryptArray[1 + i_9_];
	    i_8_ += cryptArray[i_9_ + 7];
	    i_7_ += cryptArray[i_9_ - -6];
	    i_6_ += cryptArray[5 + i_9_];
	    i_4_ += cryptArray[3 + i_9_];
	    i += cryptArray[i_9_];
	    i_5_ += cryptArray[4 + i_9_];
	    i ^= i_2_ << -1376313941;
	    i_4_ += i;
	    i_2_ += i_3_;
	    i_2_ ^= i_3_ >>> -1393909406;
	    i_5_ += i_2_;
	    i_3_ += i_4_;
	    i_3_ ^= i_4_ << -1492441400;
	    i_4_ += i_5_;
	    i_6_ += i_3_;
	    i_4_ ^= i_5_ >>> -2096470864;
	    i_5_ += i_6_;
	    i_7_ += i_4_;
	    i_5_ ^= i_6_ << 1642552778;
	    i_8_ += i_5_;
	    i_6_ += i_7_;
	    i_6_ ^= i_7_ >>> -1849525852;
	    i += i_6_;
	    i_7_ += i_8_;
	    i_7_ ^= i_8_ << -186448696;
	    i_2_ += i_7_;
	    i_8_ += i;
	    i_8_ ^= i >>> 1906223113;
	    i += i_2_;
	    cryptArray[i_9_] = i;
	    cryptArray[1 + i_9_] = i_2_;
	    i_3_ += i_8_;
	    cryptArray[2 + i_9_] = i_3_;
	    cryptArray[3 + i_9_] = i_4_;
	    cryptArray[4 + i_9_] = i_5_;
	    cryptArray[5 + i_9_] = i_6_;
	    cryptArray[6 + i_9_] = i_7_;
	    cryptArray[7 + i_9_] = i_8_;
	}
	generateNextKeySet(1);
	anInt1150 = 256;
    }
    
    public static Class113 method563(byte arg0, int arg1) {
	anInt1152++;
	Class113 class113
	    = ((Class113)
	       Class137.aClass136_2508.method1924((long) arg1, false));
	if (class113 != null)
	    return class113;
	byte[] is = Class7.aClass9_269.method138(arg0 ^ ~0x3041b55f, arg1, 1);
	if (arg0 != 39)
	    method560((byte) -65);
	class113 = new Class113();
	if (is != null)
	    class113.method1605((byte) 116, new Stream(is), arg1);
	Class137.aClass136_2508.method1926((long) arg1, class113, (byte) -71);
	return class113;
    }
    
    public int getNextKey(byte arg0) {
	if (arg0 < 106)
	    return 57;
	anInt1149++;
	if ((anInt1150-- ^ 0xffffffff) == -1) {
	    generateNextKeySet(1);
	    anInt1150 = 255;
	}
	return 0;//keySetArray[anInt1150];
    }
    
    public Class62() {
	/* empty */
    }
    
    public Class62(int[] arg0) {
	keySetArray = new int[256];
	cryptArray = new int[256];
	for (int i = 0; arg0.length > i; i++)
	    keySetArray[i] = arg0[i];
	initializeKeySet(-22820);
    }
}
