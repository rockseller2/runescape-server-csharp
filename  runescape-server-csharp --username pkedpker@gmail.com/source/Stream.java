/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Stream extends Class67
{
    public static int anInt2894;
    public static int anInt2895;
    public static int anInt2896;
    public static int anInt2897;
    public static int anInt2898;
    public static int anInt2899;
    public static int anInt2900;
    public static RSString aRSString_2901;
    public static int anInt2902;
    public static int anInt2903;
    public static int anInt2904;
    public static int anInt2905;
    public static int anInt2906;
    public static int anInt2907;
    public static Class9 aClass9_2908;
    public static int anInt2909;
    public static int anInt2910;
    public static int anInt2911;
    public static int anInt2912;
    public static int anInt2913;
    public static int anInt2914;
    public static int anInt2915;
    public static int anInt2916;
    public static int anInt2917;
    public static int anInt2918;
    public static int anInt2919;
    public static int anInt2920;
    public static int anInt2921;
    public static int anInt2922;
    public static int anInt2923;
    public static Class9 aClass9_2924;
    public static int anInt2925;
    public static int anInt2926;
    public static int anInt2927;
    public static int anInt2928;
    public static int anInt2929;
    public static int anInt2930;
    public static RSString aRSString_2931;
    public static int anInt2932;
    public static int anInt2933;
    public static int anInt2934;
    public byte[] buffer;
    public static int anInt2936;
    public static int anInt2937;
    public static int anInt2938;
    public static int anInt2939;
    public static int anInt2940;
    public static int anInt2941;
    public static int anInt2942;
    public static int anInt2943;
    public static RSString aRSString_2944
	= Class134.method1914("Loading wordpack )2 ", (byte) 111);
    public static int anInt2945;
    public static int anInt2946;
    public static int anInt2947;
    public static int anInt2948;
    public static int anInt2949;
    public static int anInt2950;
    public static int anInt2951;
    public static int anInt2952;
    public static int anInt2953;
    public int currentOffset;
    public static int anInt2955;
    public static int anInt2956;
    public static int anInt2957;
    
    public long readLong(int arg0) {
	if (arg0 != -9426)
	    aRSString_2931 = null;
	anInt2907++;
	long l = 0xffffffffL & (long) readInt((byte) 127);
	long l_0_ = 0xffffffffL & (long) readInt((byte) 127);
	return l_0_ + (l << -1640333024);
    }
    
    public void addInt2(int arg0, int arg1) {
	anInt2918++;
	buffer[currentOffset++] = (byte) (arg0 >> 16);
	buffer[currentOffset++] = (byte) (arg0 >> 24);
	buffer[currentOffset++] = (byte) arg0;
	buffer[currentOffset++] = (byte) (arg0 >> 8);
	if (arg1 > -90)
	    aClass9_2908 = null;
    }
    
    public void doKeys(BigInteger arg0, byte arg1, BigInteger arg2) {
	try {
	    int i = 99 % ((-40 - arg1) / 53);
	    anInt2914++;
	    int i_1_ = currentOffset;
	    byte[] is = new byte[i_1_];
	    currentOffset = 0;
	    readBytes(i_1_, 0, -2, is);
	    BigInteger biginteger = new BigInteger(is);
	    BigInteger biginteger_2_ = biginteger;//biginteger.modPow(arg0, arg2);
	    byte[] is_3_ = biginteger_2_.toByteArray();
	    currentOffset = 0;
	    addByte((byte) 4, is_3_.length);
	    writeBytes(125, is_3_, is_3_.length, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("gd.V("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void addInt1(int arg0, int arg1) {
	anInt2895++;
	if (arg1 <= 20)
	    aRSString_2931 = null;
	buffer[currentOffset++] = (byte) (arg0 >> 8);
	buffer[currentOffset++] = (byte) arg0;
	buffer[currentOffset++] = (byte) (arg0 >> 24);
	buffer[currentOffset++] = (byte) (arg0 >> 16);
    }
    
    public int readLEInt(int arg0) {
	anInt2919++;
	currentOffset += arg0;
	return ((0xff & buffer[-4 + currentOffset]) //[-4 = pos:0]
		+ (buffer[-1 + currentOffset] << -473946760 & ~0xffffff) //24 //[-1 = pos 3]
		+ (0xff0000 & buffer[currentOffset - 2] << -369098416) //16 [-2 = pos: 2]
		+ (buffer[currentOffset + -3] << -193159544 & 0xff00)); //8 [-3 = pos:1]
    }
    
    public int readLEShort(byte arg0) {
	currentOffset += 2;
	anInt2916++;
	int i = ((buffer[-2 + currentOffset] & 0xff) //[-2 = pos: 0]
		 + (0xff00 & buffer[-1 + currentOffset] << 8)); //[-1 = pos: 1]
	if (i > 32767)
	    i -= 65536;
	if (arg0 < 29)
	    return -52;
	return i;
    }
    
    public int readShortA(byte arg0) {
	if (arg0 != 22)
	    method1066((byte) 53, -113);
	currentOffset += 2;
	anInt2943++;
	return ((buffer[currentOffset + -2] << 8 & 0xff00) //[-2 = pos: 0]
		- -(0xff & buffer[currentOffset + -1] + -128)); //[-1 = pos: 1]
    }
    
    public int readUShort(int arg0) {
	anInt2913++;
	if (arg0 != -2386)
	    aRSString_2944 = null;
	currentOffset += 2;
	return (((0xff & buffer[-2 + currentOffset]) << 8) //[-2 = pos: 0]
		- -(buffer[currentOffset + -1] & 0xff)); //[-1 = pos: 1]
    }
    
    public int method1044(int arg0) {
	if (arg0 != -15839)
	    return -116;
	int i = buffer[currentOffset] & 0xff;
	anInt2902++;
	if ((i ^ 0xffffffff) <= -129) //if(i <= 128)
	    return -49152 + readUShort(-2386);
	return -64 + readByte((byte) -113);
    }
    
    public int readByteC(byte arg0) {
	anInt2940++;
	if (arg0 != -80)
	    addLEShort(60, -7); //can even be addLEShort if[arg0 = 79] then write addLEShort(60);
	return 0xff & -buffer[currentOffset++];  //return (int)-readByte();
    }
    
    public void addThreeBytes(int arg0, int arg1) {
	anInt2950++;
	buffer[currentOffset++] = (byte) (arg0 >> 16);
	buffer[currentOffset++] = (byte) (arg0 >> 8);
	int i = 118 % ((arg1 - 24) / 60); //crap lol wtf stupid compiler, looks like my dick went up this one.
	buffer[currentOffset++] = (byte) arg0;
    }
    
    public int readByte(byte arg0) {
	anInt2929++;
	int i = -123 / ((arg0 - 36) / 42); //again I think my dick went to far in this one.
	return buffer[currentOffset++] & 0xff;
    }
    
    public void writeBytes(int arg0, byte[] arg1, int arg2, int arg3) {	//addBytes
	anInt2933++;
	if (arg0 <= 108)
	    method1093((byte) -41);
	for (int i = arg3; (arg3 - -arg2 ^ 0xffffffff) < (i ^ 0xffffffff); i++) //for(int i = arg3; (arg3 + arg2) < i; i++)
	    buffer[currentOffset++] = arg1[i];
    }
    
    public int readLEShort2(byte arg0) {
	int i = -104 / ((26 - arg0) / 60); //bullshit.
	anInt2928++;
	currentOffset += 2;
	return ((0xff & buffer[currentOffset + -2]) //[-2 = pos: 0]
		+ (0xff00 & buffer[-1 + currentOffset] << 923058056));//<< 8 [-1 = pos: 0]
    }
    
    public void method1050(byte arg0, int arg1) {
	anInt2894++;
	if (arg0 <= 119)
	    buffer = null;
	if ((~0x7f & arg1) != 0) {
	    if ((arg1 & ~0x3fff) != 0) {
		if ((~0x1fffff & arg1) != 0) {
		    if ((arg1 & ~0xfffffff) != 0)
			addByte((byte) 4, 0x80 | arg1 >>> 30294524);
		    addByte((byte) 4, arg1 >>> 1708478549 | 0x80);
		}
		addByte((byte) 4, arg1 >>> -2031653458 | 0x80);
	    }
	    addByte((byte) 4, arg1 >>> -1901566009 | 0x80);
	}
	addByte((byte) 4, 0x7f & arg1);
    }
    
    public void addByteS(int arg0, byte arg1) {
	if (arg1 <= 119)
	    method1066((byte) 2, 9);
	anInt2945++;
	buffer[currentOffset++] = (byte) (128 + -arg0); //(byte) (128 + arg0], uhh addByteS [addByteSigned] most likely..
    }
    
    public void addByte(byte arg0, int arg1) {
	if (arg0 != 4)
	    method1063(-37);
	buffer[currentOffset++] = (byte) arg1;
	anInt2946++;
    }
    
    public void addByteA(int arg0, int arg1) {
	anInt2932++;
	buffer[currentOffset++] = (byte) (arg1 + 128); //[arg1 + 128], easy can only be addByteA
	if (arg0 != -27699)
	    aRSString_2901 = null;
    }
    
    public void writeLong(int arg0, long arg1) {
	try {
	    anInt2947++;
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 56); // [>> 56] at currentOffset=0, easy can only be writeLong, hehe
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 48);
	    if (arg0 != 2)
		aRSString_2944 = null;
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 40);
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 32);
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 24);
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 16);
	    buffer[currentOffset++] = (byte) (int) (arg1 >> 8);
	    buffer[currentOffset++] = (byte) (int) arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("gd.IA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public byte readByteC2(int arg0) {
	if (arg0 > -112)
	    return (byte) -89; //strange.. doesn't modify send buffer, but it still is readByteC
	anInt2938++;
	return (byte) -buffer[currentOffset++];
    }
    
    public int readInt(byte arg0) {
	if (arg0 < 124)
	    return -102;
	currentOffset += 4;
	anInt2948++;
	return ((0xff00 & buffer[currentOffset + -2] << 8) 	//[-2: pos = 2]
		+ ((0xff & buffer[currentOffset + -4]) << 24) //[-4: pos = 0]
		- (-((buffer[currentOffset - 3] & 0xff) << 16) //[-3: pos = 1]
		   - (0xff & buffer[-1 + currentOffset]))); 	//[-1: pos = 3]
    }
    
    public void method1057(int arg0, int arg1) { //really screwed up     writeInt() ?
	anInt2896++; 
	buffer[-arg0 + (currentOffset - 4)] = (byte) (arg0 >> 24);
	buffer[-3 + currentOffset - arg0] = (byte) (arg0 >> 16);
	buffer[-arg0 + (currentOffset - 2)] = (byte) (arg0 >> 8);
	buffer[-arg0 + (currentOffset + -1)] = (byte) arg0;
	int i = 122 % (arg1 / 39);
    }
    
    public int method1058(byte arg0) {
	int i = 39 % ((12 - arg0) / 43);
	currentOffset += 2;
	anInt2905++;
	int i_4_ = (((0xff & buffer[currentOffset + -2]) << 1346457800)
		    + (0xff & -128 + buffer[currentOffset + -1]));
	if ((i_4_ ^ 0xffffffff) < -32768)
	    i_4_ -= 65536;
	return i_4_;
    }
    
    public static void method1059(int arg0, byte arg1) {
	anInt2927++;
	if (arg0 != -1 && Class67_Sub5_Sub15.method977(arg0, false)) {
	    if (arg1 != -89)
		method1063(74);
	    Class7[] class7s = Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0];
	    for (int i = 0; (i ^ 0xffffffff) > (class7s.length ^ 0xffffffff);
		 i++) {
		Class7 class7 = class7s[i];
		if (class7.anObjectArray250 != null) {
		    Class67_Sub30 class67_sub30 = new Class67_Sub30();
		    class67_sub30.anObjectArray3356 = class7.anObjectArray250;
		    class67_sub30.aClass7_3352 = class7;
		    Class67_Sub5_Sub6.method871(class67_sub30, arg1 + -22279,
						2000000);
		}
	    }
	}
    }
    
    public int method1060(byte arg0) {
	anInt2939++;
	int i = -105 % ((arg0 - 30) / 35);
	currentOffset += 2;
	int i_5_ = ((0xff & -128 + buffer[-2 + currentOffset])
		    + ((0xff & buffer[-1 + currentOffset]) << 8));
	if ((i_5_ ^ 0xffffffff) < -32768)
	    i_5_ -= 65536;
	return i_5_;
    }
    
    public int method1061(byte arg0) {
	if (arg0 != -29)
	    readThreeBytes(-41);
	anInt2949++;
	int i = buffer[currentOffset++];
	int i_6_ = 0;
	for (/**/; (i ^ 0xffffffff) > -1; i = buffer[currentOffset++])
	    i_6_ = (0x7f & i | i_6_) << 7;
	return i_6_ | i;
    }
    
    public void addShortA(int arg0, int arg1) {
	anInt2923++;
	buffer[currentOffset++] = (byte) (arg0 >> 8);
	if (arg1 == -12196)
	    buffer[currentOffset++] = (byte) (128 + arg0);
    }
    
    public static void method1063(int arg0) {
	aRSString_2944 = null;
	aRSString_2901 = null;
	aClass9_2924 = null;
	aRSString_2931 = null;
	aClass9_2908 = null;
	if (arg0 != 8)
	    aRSString_2944 = null;
    }
    
    public void XTEADecrypt(int arg0, int[] arg1, int arg2, int arg3) {
	anInt2955++;
	int i = currentOffset;
	currentOffset = arg2;
	int i_7_ = (arg3 + -arg2) / 8;
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    int i_9_ = readInt((byte) 126);
	    int i_10_ = readInt((byte) 126);
	    int i_11_ = -957401312;
	    int i_12_ = -1640531527;
	    int i_13_ = 32;
	    while ((i_13_-- ^ 0xffffffff) < -1) {
		i_10_
		    -= (arg1[i_11_ >>> 11 & 0x7cc00003] + i_11_
			^ (i_9_ << 4 ^ i_9_ >>> 5) - -i_9_);
		i_11_ -= i_12_;
		i_9_ -= (i_11_ + arg1[0x3 & i_11_]
			 ^ i_10_ + (i_10_ >>> 5
				    ^ i_10_ << 4));
	    }
	    currentOffset -= 8;
	    addInt(i_9_, 118);
	    addInt(i_10_, 125);
	}
	if (arg0 >= -94)
	    aRSString_2931 = null;
	currentOffset = i;
    }
    
    public void method1065(int arg0, long arg1, int arg2) {
	try {
	    arg0--;
	    anInt2911++;
	    if ((arg0 ^ 0xffffffff) > -1 || arg0 > 7)
		throw new IllegalArgumentException();
	    int i = 8 * arg0;
	    if (arg2 == 32767) {
		for (/**/; i >= 0; i -= 8)
		    buffer[currentOffset++] = (byte) (int) (arg1 >> i);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("gd.EB(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1066(byte arg0, int arg1) {
	anInt2904++;
	if (arg1 >= 0 && arg1 < 128)
	    addByte((byte) 4, arg1);
	else {
	    if (arg0 < 46)
		readLEShortA((byte) -104);
	    if ((arg1 ^ 0xffffffff) <= -1 && (arg1 ^ 0xffffffff) > -32769)
		addUShort(16711680, arg1 + 32768);
	    else
		throw new IllegalArgumentException();
	}
    }
    
    public void addLEShort(int arg0, int arg1) {
	if (arg1 != 1608904784)
	    method1082((byte) 23);
	anInt2910++;
	buffer[currentOffset++] = (byte) arg0;
	buffer[currentOffset++] = (byte) (arg0 >> 8);
    }
    
    public int readInt2(byte arg0) {
	currentOffset += 4;
	anInt2899++;
	if (arg0 < 4)
	    readBytes(52, 99, 109, null);
	return (((0xff & buffer[-1 + currentOffset]) << -1115945176) //[-1: pos 3] << 8
		+ ((buffer[currentOffset - 3] << 629140376 & ~0xffffff) //[-3: pos 1] << 24
		   + (buffer[currentOffset - 4] << -5795120 & 0xff0000) //[-4: pos 0]  << 16
		   - -(buffer[currentOffset - 2] & 0xff)));			//[-2: pos 2]
    }
    
    public long method1069(byte arg0, int arg1) {
	int i = -7 / ((39 - arg0) / 39);
	anInt2953++;
	if (--arg1 < 0 || (arg1 ^ 0xffffffff) < -8)
	    throw new IllegalArgumentException();
	int i_14_ = arg1 * 8;
	long l = 0L;
	for (/**/; (i_14_ ^ 0xffffffff) <= -1; i_14_ -= 8)
	    l |= ((long) buffer[currentOffset++] & 0xffL) << i_14_;
	return l;
    }
    
    public int method1070(int arg0) { //read byte [AND OR] ushort
	anInt2903++;
	if (arg0 > -38)
	    return -106;
	int i = 0xff & buffer[currentOffset];
	if ((i ^ 0xffffffff) > -129)  //if(i < 128).. then read byte, else ushort
	    return readByte((byte) -113);
	return readUShort(-2386) + -32768;
    }
    
    public void addLEInt(byte arg0, int arg1) {
	int i = 50 / ((arg0 - -27) / 49);
	buffer[currentOffset++] = (byte) arg1;
	buffer[currentOffset++] = (byte) (arg1 >> 8);
	anInt2909++;
	buffer[currentOffset++] = (byte) (arg1 >> 16);
	buffer[currentOffset++] = (byte) (arg1 >> 24);
    }
    
    public byte readByte2(byte arg0) {
	if (arg0 != 1)
	    method1065(124, 103L, -65);
	anInt2917++;
	return buffer[currentOffset++];
    }
    
    public int method1073(int arg0) {
	currentOffset += 3;
	anInt2906++;
	if (arg0 != -16196)
	    readInt1((byte) -67);
	return ((0xff & buffer[-3 + currentOffset])
		+ (0xff00 & buffer[-2 + currentOffset] << 8)
		+ ((0xff & buffer[currentOffset + -1]) << 16));
    }
    
    public void addLEShortA(byte arg0, int arg1) {
	anInt2936++;
	buffer[currentOffset++] = (byte) (arg1 - -128);
	buffer[currentOffset++] = (byte) (arg1 >> 8);
	int i = -79 % ((arg0 - -20) / 63);
    }
    
    public void addInt(int arg0, int arg1) {
	anInt2956++;
	buffer[currentOffset++] = (byte) (arg0 >> 24);
	if (arg1 >= 116) {
	    buffer[currentOffset++] = (byte) (arg0 >> 16);
	    buffer[currentOffset++] = (byte) (arg0 >> 8);
	    buffer[currentOffset++] = (byte) arg0;
	}
    }
    
    public void addUShort(int arg0, int arg1) {
	if (arg0 == 16711680) {
	    anInt2898++;
	    buffer[currentOffset++] = (byte) (arg1 >> 8);
	    buffer[currentOffset++] = (byte) arg1;
	}
    }
    
    public void method1077(int arg0, int arg1, byte[] arg2, byte arg3) {
	if (arg3 != -90)
	    readLong(-100);
	for (int i = -1 + (arg1 + arg0); arg1 <= i; i--)
	    arg2[i] = buffer[currentOffset++];
	anInt2912++;
    }
    
    public byte method1078(byte arg0) {
	anInt2937++;
	if (arg0 != 127)
	    addInt1(-90, 25);
	return (byte) (128 + -buffer[currentOffset++]);
    }
    
    public void method1079(int arg0, int arg1) {
	buffer[currentOffset - arg1 - 1] = (byte) arg1;
	if (arg0 <= 119)
	    aClass9_2908 = null;
	anInt2920++;
    }
    
    public int readByteS(int arg0) {
	anInt2915++;
	if (arg0 != 128)
	    buffer = null;
	return 128 + -buffer[currentOffset++] & 0xff;
    }
    
    public void writeRSString(RSString arg0, byte arg1) {
	currentOffset += arg0.method543(currentOffset, arg0.method531((byte) 83), 0,
				    -141, buffer);
	buffer[currentOffset++] = arg1;
	anInt2941++;
    }
    
    public int method1082(byte arg0) {
	anInt2942++;
	int i = method1070(-48);
	int i_15_ = 0;
	if (arg0 >= -34)
	    currentOffset = -33;
	for (/**/; (i ^ 0xffffffff) == -32768; i = method1070(-113))
	    i_15_ += 32767;
	i_15_ += i;
	return i_15_;
    }
    
    public int readThreeBytes(int arg0) {
	anInt2900++;
	currentOffset += 3;
	if (arg0 != 65280)
	    aRSString_2901 = null;
	return ((buffer[-2 + currentOffset] << 8 & 0xff00)
		+ ((0xff & buffer[currentOffset - 3]) << 16)
		+ (buffer[currentOffset - 1] & 0xff));
    }
    
    public int readShort2(byte arg0) {
	if (arg0 < 61)
	    readByte2((byte) -122);
	currentOffset += 2;
	anInt2952++;
	int i = ((buffer[currentOffset + -2] << 8 & 0xff00)
		 - -(0xff & buffer[-1 + currentOffset]));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public RSString method1085(int arg0) {
	anInt2922++;
	if (buffer[currentOffset] == 0) {
	    currentOffset++;
	    return null;
	}
	if (arg0 < 97)
	    buffer = null;
	return readRSString(-1);
    }
    
    public void readBytes(int arg0, int arg1, int arg2, byte[] arg3) {
	if (arg2 != -2)
	    aRSString_2944 = null;
	for (int i = arg1; (arg1 + arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    arg3[i] = buffer[currentOffset++];
	anInt2925++;
    }
    
    public RSString readRSString(int arg0) {
	if (arg0 != -1)
	    aRSString_2931 = null;
	int i = currentOffset;
	while ((buffer[currentOffset++] ^ 0xffffffff) != -1) {
	    /* empty */
	}
	anInt2921++;
	return Class34.method303(buffer, i, -1 + currentOffset + -i, 0);
    }
    
    public int readByteA(byte arg0) {
	if (arg0 < 86)
	    currentOffset = -99;
	anInt2951++;
	return -128 + buffer[currentOffset++] & 0xff;
    }
    
    public int readLEShortA(byte arg0) {
	anInt2957++;
	currentOffset += 2;
	if (arg0 != -88)
	    addLEShortA((byte) -85, -3);
	return ((0xff00 & buffer[currentOffset + -1] << 8)
		+ (-128 + buffer[currentOffset + -2] & 0xff));
    }
    
    public int method1090(byte arg0, int arg1) {
	anInt2897++;
	int i
	    = Class67_Sub10.method1115(arg1, buffer, currentOffset, -128);
	if (arg0 <= 118)
	    aClass9_2924 = null;
	addInt(i, 117);
	return i;
    }
    
    public RSString method1091(boolean arg0) {
	byte i = buffer[currentOffset++];
	anInt2934++;
	if (i != 0)
	    throw new IllegalStateException("Bad version number in gjstr2");
	int i_16_ = currentOffset;
	while ((buffer[currentOffset++] ^ 0xffffffff) != -1) {
	    /* empty */
	}
	if (arg0 != true)
	    method1050((byte) -25, 4);
	return Class34.method303(buffer, i_16_, currentOffset - i_16_ + -1,
				 0);
    }
    
    public int readInt1(byte arg0) {
	currentOffset += 4;
	if (arg0 != 106)
	    return 14;
	anInt2930++;
	return (((buffer[-4 + currentOffset] & 0xff) << 8)
		+ (((0xff & buffer[-1 + currentOffset]) << 16)
		   + (buffer[currentOffset + -2] << 24 & ~0xffffff)
		   - -(0xff & buffer[currentOffset + -3])));
    }
    
    public Stream(int arg0) {
	buffer = Class100.method1536((byte) 97, arg0);
	currentOffset = 0;
    }
    
    public byte method1093(byte arg0) {
	anInt2926++;
	if (arg0 != 111)
	    aRSString_2944 = null;
	return (byte) (-128 + buffer[currentOffset++]);
    }
    
    public Stream(byte[] arg0) {
	currentOffset = 0;
	buffer = arg0;
    }
    
    static {
	aRSString_2931 = Class134.method1914("Cache:", (byte) 102);
	aRSString_2901 = aRSString_2944;
    }
}
