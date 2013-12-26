/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class7
{
    public static int anInt161;
    public int anInt162;
    public int[] anIntArray163;
    public int anInt164;
    public boolean aBoolean165;
    public int anInt166;
    public Object[] anObjectArray167;
    public byte aByte168;
    public boolean aBoolean169;
    public RSString[] aRSStringArray170;
    public Object[] anObjectArray171;
    public RSString aRSString_172;
    public byte aByte173 = 0;
    public int anInt174;
    public int anInt175;
    public Object[] anObjectArray176;
    public boolean aBoolean177;
    public RSString aRSString_178 = Class67_Sub5_Sub6.aRSString_4540;
    public int[] anIntArray179;
    public static int anInt180;
    public Object[] anObjectArray181;
    public int[] anIntArray182;
    public int anInt183;
    public Object[] anObjectArray184;
    public boolean aBoolean185;
    public int[] anIntArray186;
    public int anInt187;
    public int anInt188;
    public int anInt189;
    public static int anInt190;
    public RSString aRSString_191;
    public static int anInt192;
    public int anInt193;
    public int anInt194;
    public int anInt195;
    public Object[] anObjectArray196;
    public Object[] anObjectArray197;
    public int anInt198;
    public int anInt199;
    public Object[] anObjectArray200;
    public int anInt201;
    public int anInt202;
    public int anInt203;
    public int anInt204;
    public int anInt205;
    public static int anInt206;
    public int[] anIntArray207;
    public Object[] anObjectArray208;
    public Object[] anObjectArray209;
    public byte aByte210;
    public int anInt211;
    public Object[] anObjectArray212;
    public int anInt213;
    public int anInt214;
    public int anInt215;
    public int anInt216;
    public int[] anIntArray217;
    public boolean aBoolean218;
    public RSString aRSString_219;
    public int anInt220;
    public int anInt221;
    public int anInt222;
    public static Frame aFrame223;
    public int[] anIntArray224;
    public int anInt225;
    public Object[] anObjectArray226;
    public int anInt227;
    public Class7[] aClass7Array228;
    public int anInt229;
    public static int anInt230;
    public static boolean aBoolean231 = false;
    public static int anInt232;
    public byte aByte233;
    public int anInt234;
    public int anInt235;
    public static int anInt236;
    public int[] anIntArray237;
    public int anInt238;
    public static int anInt239;
    public int anInt240;
    public static int anInt241;
    public static int anInt242;
    public static int anInt243;
    public Object[] anObjectArray244;
    public int[] anIntArray245;
    public int anInt246;
    public int[] anIntArray247;
    public int anInt248;
    public boolean aBoolean249;
    public Object[] anObjectArray250;
    public int anInt251;
    public static int[][] anIntArrayArray252 = new int[104][104];
    public int[] anIntArray253;
    public Object[] anObjectArray254;
    public int[] anIntArray255;
    public int[] anIntArray256;
    public int anInt257;
    public RSString aRSString_258;
    public static int[] anIntArray259;
    public int[][] anIntArrayArray260;
    public int anInt261;
    public boolean aBoolean262;
    public int anInt263;
    public int[] anIntArray264;
    public Object[] anObjectArray265;
    public int anInt266;
    public int anInt267;
    public Object[] anObjectArray268;
    public static Class9 aClass9_269;
    public RSString aRSString_270;
    public static int anInt271;
    public int anInt272;
    public Object[] anObjectArray273;
    public int anInt274;
    public int anInt275;
    public int anInt276;
    public int anInt277;
    public boolean aBoolean278;
    public int anInt279;
    public Object[] anObjectArray280;
    public Object[] anObjectArray281;
    public static int anInt282;
    public int[] anIntArray283;
    public int anInt284;
    public static int anInt285;
    public static int anInt286;
    public int anInt287;
    public int anInt288;
    public int anInt289;
    public boolean aBoolean290;
    public int anInt291;
    public int anInt292;
    public static boolean aBoolean293;
    public int anInt294;
    public int anInt295;
    public boolean aBoolean296;
    public Object[] anObjectArray297;
    public int anInt298;
    public boolean aBoolean299;
    public boolean aBoolean300;
    public int anInt301;
    public Object[] anObjectArray302;
    public int anInt303;
    public int anInt304;
    public boolean aBoolean305;
    public Object[] anObjectArray306;
    public byte[] aByteArray307;
    public Object[] anObjectArray308;
    public Class67_Sub14 aClass67_Sub14_309;
    public Object[] anObjectArray310;
    public int anInt311;
    public int anInt312;
    public boolean aBoolean313;
    public boolean aBoolean314;
    public RSString[] aRSStringArray315;
    public Object[] anObjectArray316;
    public Object[] anObjectArray317;
    public int[] anIntArray318;
    public Class7 aClass7_319;
    public byte[] aByteArray320;
    public static RSString aRSString_321 = Class134.method1914("0(U", (byte) 32);
    public static int anInt322;
    public Object[] anObjectArray323;
    public boolean aBoolean324;
    public int anInt325;
    public int anInt326;
    public int anInt327;
    public int anInt328;
    public int anInt329;
    public int anInt330;
    public Object[] anObjectArray331;
    public int anInt332;
    public int anInt333;
    public int anInt334;
    public int anInt335;
    public Object[] anObjectArray336;
    public int[] anIntArray337;
    public int anInt338;
    public static int anInt339;
    
    public static RSString method83(String arg0, byte arg1) {
	if (arg1 > -51)
	    method96(84);
	anInt180++;
	byte[] is;
	try {
	    is = arg0.getBytes("ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
	    is = arg0.getBytes();
	}
	RSString RSString = new RSString();
	RSString.anInt2629 = 0;
	RSString.aByteArray2653 = is;
	for (int i = 0; i < is.length; i++) {
	    if (is[i] != 0)
		is[RSString.anInt2629++] = is[i];
	}
	return RSString;
    }
    
    public void method84(RSString arg0, int arg1, byte arg2) {
	anInt286++;
	if (aRSStringArray315 == null || arg1 >= aRSStringArray315.length) {
	    RSString[] RSStrings = new RSString[1 + arg1];
	    if (aRSStringArray315 != null) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (aRSStringArray315.length ^ 0xffffffff);
		     i++)
		    RSStrings[i] = aRSStringArray315[i];
	    }
	    aRSStringArray315 = RSStrings;
	}
	aRSStringArray315[arg1] = arg0;
	int i = -61 / ((arg2 - -35) / 32);
    }
    
    public static void method85(byte arg0) {
	aClass9_269 = null;
	anIntArray259 = null;
	anIntArrayArray252 = null;
	if (arg0 != -69)
	    aFrame223 = null;
	aRSString_321 = null;
	aFrame223 = null;
    }
    
    public int[] method86(Stream arg0, byte arg1) {
	anInt192++;
	int i = arg0.readByte((byte) -7);
	if (i == 0)
	    return null;
	if (arg1 != 106)
	    method88(18, 6, false, 65, 47, -40, 107, 55);
	int[] is = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    is[i_0_] = arg0.readInt((byte) 126);
	return is;
    }
    
    public boolean method87(int arg0) {
	anInt243++;
	if (anIntArray179 != null)
	    return true;
	Class119_Sub1 class119_sub1
	    = Class67_Sub5_Sub4_Sub2.method859(anInt225, Class51.aClass9_1041,
					       0, 3576);
	if (class119_sub1 == null)
	    return false;
	class119_sub1.method1650();
	if (arg0 != 22710)
	    return true;
	anIntArray337 = new int[class119_sub1.anInt2254];
	anIntArray179 = new int[class119_sub1.anInt2254];
	for (int i = 0; i < class119_sub1.anInt2254; i++) {
	    int i_1_ = class119_sub1.anInt2252;
	    int i_2_ = 0;
	    for (int i_3_ = 0;
		 (class119_sub1.anInt2252 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
		 i_3_++) {
		if ((class119_sub1.aByteArray3410
		     [class119_sub1.anInt2252 * i + i_3_])
		    != 0) {
		    i_2_ = i_3_;
		    break;
		}
	    }
	    for (int i_4_ = i_2_; class119_sub1.anInt2252 > i_4_; i_4_++) {
		if ((class119_sub1.aByteArray3410
		     [i * class119_sub1.anInt2252 + i_4_])
		    == 0) {
		    i_1_ = i_4_;
		    break;
		}
	    }
	    anIntArray179[i] = i_2_;
	    anIntArray337[i] = -i_2_ + i_1_;
	}
	return true;
    }
    
    public static void method88(int arg0, int arg1, boolean arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7) {
	anInt285++;
	if ((arg7 ^ 0xffffffff) > -129 || arg3 < 128 || arg7 > 13056
	    || arg3 > 13056) {
	    Class67_Sub27.anInt3303 = -1;
	    Class69.anInt1383 = -1;
	} else {
	    int i = (Class131_Sub5.method1826(Canvas_Sub1.anInt59, arg7, arg3,
					      (byte) -20)
		     + -arg5);
	    i -= Class86.anInt1760;
	    if (arg2 == false) {
		arg3 -= Class129.anInt2395;
		arg7 -= Class114.anInt2160;
		int i_5_ = Class26.anIntArray617[Class67_Sub1_Sub2.anInt3839];
		int i_6_ = Class26.anIntArray617[Class67_Sub23.anInt3196];
		int i_7_ = Class26.anIntArray612[Class67_Sub1_Sub2.anInt3839];
		int i_8_ = Class26.anIntArray612[Class67_Sub23.anInt3196];
		int i_9_ = i_8_ * arg7 + arg3 * i_6_ >> -490685776;
		arg3 = i_8_ * arg3 - arg7 * i_6_ >> -708073232;
		arg7 = i_9_;
		i_9_ = -(i_5_ * arg3) + i_7_ * i >> -1154368560;
		arg3 = i * i_5_ + i_7_ * arg3 >> 332971632;
		i = i_9_;
		if ((arg3 ^ 0xffffffff) <= -51) {
		    Class67_Sub27.anInt3303 = (i << -910654135) / arg3 + arg1;
		    Class69.anInt1383 = (arg7 << 172680265) / arg3 + arg6;
		} else {
		    Class67_Sub27.anInt3303 = -1;
		    Class69.anInt1383 = -1;
		}
	    }
	}
    }
    
    public static void method89(boolean arg0, int arg1) {
	Class67_Sub1_Sub37.anIntArray4384 = new int[104];
	Class67_Sub26.anIntArray3292 = new int[104];
	Class67_Sub5_Sub18.anIntArray4805 = new int[104];
	Class67_Sub15.anIntArray3077 = new int[104];
	anInt230++;
	Class67_Sub1_Sub12.anInt4005 = 99;
	Class81.anIntArray1656 = new int[104];
	int i;
	if (arg0)
	    i = 1;
	else
	    i = 4;
	Class73.aByteArrayArrayArray1480 = new byte[i][105][105];
	Class67_Sub5_Sub8.aByteArrayArrayArray4571 = new byte[i][104][104];
	if (arg1 <= -4) {
	    Class67_Sub1_Sub31.anIntArrayArrayArray4295 = new int[i][105][105];
	    Class67_Sub1_Sub24.aByteArrayArrayArray4199
		= new byte[i][104][104];
	    Class70.aByteArrayArrayArray1403 = new byte[i][104][104];
	    Class67_Sub1_Sub10.aByteArrayArrayArray3983
		= new byte[i][104][104];
	}
    }
    
    public Class131_Sub6 method90(Class22 arg0, int arg1, int arg2,
				  boolean arg3, int arg4, boolean arg5,
				  Class41 arg6) {
	try {
	    anInt271++;
	    Class114.aBoolean2162 = arg5;
	    int i;
	    int i_10_;
	    if (arg3) {
		i = anInt238;
		i_10_ = anInt201;
	    } else {
		i = anInt329;
		i_10_ = anInt183;
	    }
	    if (i == 0)
		return null;
	    if (i == 1 && i_10_ == -1)
		return null;
	    if (i == 1) {
		Class131_Sub6 class131_sub6
		    = ((Class131_Sub6)
		       (Class67_Sub1_Sub7.aClass136_3901.method1924
			((long) (i_10_ + (i << -414059376)), false)));
		if (class131_sub6 == null) {
		    Class131_Sub2 class131_sub2
			= Class131_Sub2.method1780((Class67_Sub1_Sub15
						    .aClass9_4051),
						   i_10_, 0);
		    if (class131_sub2 == null) {
			Class114.aBoolean2162 = true;
			return null;
		    }
		    class131_sub6
			= class131_sub2.method1787(64, 768, -50, -10, -50);
		    Class67_Sub1_Sub7.aClass136_3901.method1926
			((long) ((i << -853634032) + i_10_), class131_sub6,
			 (byte) -71);
		}
		if (arg6 != null)
		    class131_sub6 = arg6.method358(arg2, arg1, class131_sub6,
						   -20002, arg4);
		return class131_sub6;
	    }
	    if ((i ^ 0xffffffff) == -3) {
		Class131_Sub6 class131_sub6
		    = Class133.method1908(i_10_, -119)
			  .method573(arg6, arg1, 107, arg2, arg4);
		if (class131_sub6 == null) {
		    Class114.aBoolean2162 = true;
		    return null;
		}
		return class131_sub6;
	    }
	    if ((i ^ 0xffffffff) == -4) {
		if (arg0 == null)
		    return null;
		Class131_Sub6 class131_sub6
		    = arg0.method211(arg1, arg4, arg6, arg2, -123);
		if (class131_sub6 == null) {
		    Class114.aBoolean2162 = true;
		    return null;
		}
		return class131_sub6;
	    }
	    if (i == 4) {
		Class76 class76 = PacketParser.method1596(i_10_, -28322);
		Class131_Sub6 class131_sub6
		    = class76.method1397(arg6, arg2, -93, 10, arg4, arg1);
		if (class131_sub6 == null) {
		    Class114.aBoolean2162 = true;
		    return null;
		}
		return class131_sub6;
	    }
	    if (i == 6) {
		Class131_Sub6 class131_sub6
		    = Class133.method1908(i_10_, -10).method570(null, arg2,
								arg6, 0, arg1,
								arg4,
								(byte) -101, 0,
								0, null);
		if (class131_sub6 == null) {
		    Class114.aBoolean2162 = true;
		    return null;
		}
		return class131_sub6;
	    }
	    if (i == 7) {
		if (arg0 == null)
		    return null;
		int i_11_ = anInt183 & 0xffff;
		int i_12_ = anInt275;
		int i_13_ = anInt183 >>> 794529488;
		Class131_Sub6 class131_sub6
		    = arg0.method210(arg6, arg4, i_12_, arg2, i_11_, i_13_,
				     (byte) -119, arg1);
		if (class131_sub6 == null) {
		    Class114.aBoolean2162 = true;
		    return null;
		}
		return class131_sub6;
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("aj.H("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ','
						+ (arg6 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method91(int arg0, int arg1, int arg2) {
	anInt190++;
	if (anIntArray182 == null || arg0 >= anIntArray182.length) {
	    int[] is = new int[arg0 + 1];
	    if (anIntArray182 != null) {
		for (int i = 0; i < anIntArray182.length; i++)
		    is[i] = anIntArray182[i];
		for (int i = anIntArray182.length; arg0 > i; i++)
		    is[i] = -1;
	    }
	    anIntArray182 = is;
	}
	int i = -20 % ((arg1 - 47) / 49);
	anIntArray182[arg0] = arg2;
    }
    
    public Class67_Sub5_Sub19 method92(boolean arg0, int arg1) {
	Class114.aBoolean2162 = false;
	if (arg0 != true)
	    return null;
	anInt322++;
	if ((arg1 ^ 0xffffffff) > -1 || anIntArray224.length <= arg1)
	    return null;
	int i = anIntArray224[arg1];
	if (i == -1)
	    return null;
	Class67_Sub5_Sub19 class67_sub5_sub19
	    = ((Class67_Sub5_Sub19)
	       Class15.aClass136_451.method1924((long) i, false));
	if (class67_sub5_sub19 != null)
	    return class67_sub5_sub19;
	class67_sub5_sub19
	    = Class131_Sub5.method1823(Class51.aClass9_1041, -13886, i, 0);
	if (class67_sub5_sub19 != null)
	    Class15.aClass136_451.method1926((long) i, class67_sub5_sub19,
					     (byte) -71);
	else
	    Class114.aBoolean2162 = true;
	return class67_sub5_sub19;
    }
    
    public void method93(int arg0, Stream arg1) {
	aBoolean185 = false;
	anInt227 = arg1.readByte((byte) 106);
	anInt206++;
	anInt166 = arg1.readByte((byte) -110);
	anInt287 = arg1.readUShort(-2386);
	anInt292 = arg1.readShort2((byte) 74);
	anInt295 = arg1.readShort2((byte) 105);
	anInt193 = arg1.readUShort(-2386);
	anInt199 = arg1.readUShort(-2386);
	aByte210 = (byte) 0;
	aByte173 = (byte) 0;
	aByte168 = (byte) 0;
	aByte233 = (byte) 0;
	anInt205 = arg1.readByte((byte) -102);
	anInt174 = arg1.readUShort(-2386);
	if ((anInt174 ^ 0xffffffff) != -65536)
	    anInt174 = anInt174 + (anInt301 & ~0xffff);
	else
	    anInt174 = -1;
	anInt246 = arg1.readUShort(-2386);
	if ((anInt246 ^ 0xffffffff) == -65536)
	    anInt246 = -1;
	int i = arg1.readByte((byte) -65);
	if (i > 0) {
	    anIntArray217 = new int[i];
	    anIntArray318 = new int[i];
	    for (int i_14_ = 0; i_14_ < i; i_14_++) {
		anIntArray318[i_14_] = arg1.readByte((byte) 125);
		anIntArray217[i_14_] = arg1.readUShort(-2386);
	    }
	}
	int i_15_ = arg1.readByte((byte) -92);
	if (i_15_ > 0) {
	    anIntArrayArray260 = new int[i_15_][];
	    for (int i_16_ = 0; (i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
		 i_16_++) {
		int i_17_ = arg1.readUShort(-2386);
		anIntArrayArray260[i_16_] = new int[i_17_];
		for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
		    anIntArrayArray260[i_16_][i_18_]
			= arg1.readUShort(arg0 + -2381);
		    if (anIntArrayArray260[i_16_][i_18_] == 65535)
			anIntArrayArray260[i_16_][i_18_] = -1;
		}
	    }
	}
	if ((anInt227 ^ 0xffffffff) == -1) {
	    anInt222 = arg1.readUShort(-2386);
	    aBoolean313 = (arg1.readByte((byte) -95) ^ 0xffffffff) == -2;
	}
	int i_19_ = 0;
	if ((anInt227 ^ 0xffffffff) == -2) {
	    arg1.readUShort(-2386);
	    arg1.readByte((byte) -40);
	}
	if ((anInt227 ^ 0xffffffff) == -3) {
	    anIntArray253 = new int[anInt199 * anInt193];
	    aByte168 = (byte) 3;
	    aByte210 = (byte) 3;
	    anIntArray264 = new int[anInt199 * anInt193];
	    int i_20_ = arg1.readByte((byte) 78);
	    if ((i_20_ ^ 0xffffffff) == -2)
		i_19_ |= 0x10000000;
	    int i_21_ = arg1.readByte((byte) -112);
	    if (i_21_ == 1)
		i_19_ |= 0x40000000;
	    int i_22_ = arg1.readByte((byte) 100);
	    int i_23_ = arg1.readByte((byte) 124);
	    anInt326 = arg1.readByte((byte) 114);
	    if (i_22_ == 1)
		i_19_ |= ~0x7fffffff;
	    if ((i_23_ ^ 0xffffffff) == -2)
		i_19_ |= 0x20000000;
	    anInt213 = arg1.readByte((byte) -58);
	    anIntArray245 = new int[20];
	    anIntArray237 = new int[20];
	    anIntArray224 = new int[20];
	    for (int i_24_ = 0; i_24_ < 20; i_24_++) {
		int i_25_ = arg1.readByte((byte) 82);
		if ((i_25_ ^ 0xffffffff) != -2)
		    anIntArray224[i_24_] = -1;
		else {
		    anIntArray237[i_24_] = arg1.readShort2((byte) 89);
		    anIntArray245[i_24_] = arg1.readShort2((byte) 65);
		    anIntArray224[i_24_] = arg1.readInt((byte) 127);
		}
	    }
	    aRSStringArray170 = new RSString[5];
	    for (int i_26_ = 0; i_26_ < 5; i_26_++) {
		RSString RSString = arg1.readRSString(-1);
		if (RSString.method531((byte) -112) > 0) {
		    aRSStringArray170[i_26_] = RSString;
		    i_19_ |= 1 << i_26_ + 23;
		}
	    }
	}
	if (anInt227 == 3)
	    aBoolean300 = (arg1.readByte((byte) 86) ^ 0xffffffff) == -2;
	if ((anInt227 ^ 0xffffffff) == -5 || anInt227 == 1) {
	    anInt214 = arg1.readByte((byte) 105);
	    anInt248 = arg1.readByte((byte) -53);
	    anInt198 = arg1.readByte((byte) 101);
	    anInt277 = arg1.readUShort(-2386);
	    if (anInt277 == 65535)
		anInt277 = -1;
	    aBoolean278 = arg1.readByte((byte) -51) == 1;
	}
	if (arg0 == (anInt227 ^ 0xffffffff)) {
	    aRSString_219 = arg1.readRSString(-1);
	    aRSString_172 = arg1.readRSString(-1);
	}
	if ((anInt227 ^ 0xffffffff) == -2 || (anInt227 ^ 0xffffffff) == -4
	    || anInt227 == 4)
	    anInt279 = arg1.readInt((byte) 126);
	if ((anInt227 ^ 0xffffffff) == -4 || anInt227 == 4) {
	    anInt195 = arg1.readInt((byte) 125);
	    anInt188 = arg1.readInt((byte) 127);
	    anInt327 = arg1.readInt((byte) 127);
	}
	if ((anInt227 ^ 0xffffffff) == -6) {
	    anInt225 = arg1.readInt((byte) 126);
	    anInt276 = arg1.readInt((byte) 125);
	}
	if ((anInt227 ^ 0xffffffff) == -7) {
	    anInt329 = 1;
	    anInt183 = arg1.readUShort(-2386);
	    if (anInt183 == 65535)
		anInt183 = -1;
	    anInt238 = 1;
	    anInt201 = arg1.readUShort(arg0 + -2381);
	    if (anInt201 == 65535)
		anInt201 = -1;
	    anInt274 = arg1.readUShort(-2386);
	    if ((anInt274 ^ 0xffffffff) == -65536)
		anInt274 = -1;
	    anInt333 = arg1.readUShort(-2386);
	    if (anInt333 == 65535)
		anInt333 = -1;
	    anInt338 = arg1.readUShort(arg0 + -2381);
	    anInt330 = arg1.readUShort(-2386);
	    anInt164 = arg1.readUShort(-2386);
	}
	if (anInt227 == 7) {
	    anIntArray264 = new int[anInt193 * anInt199];
	    aByte210 = (byte) 3;
	    aByte168 = (byte) 3;
	    anIntArray253 = new int[anInt199 * anInt193];
	    anInt214 = arg1.readByte((byte) 85);
	    anInt277 = arg1.readUShort(-2386);
	    if (anInt277 == 65535)
		anInt277 = -1;
	    aBoolean278 = (arg1.readByte((byte) -67) ^ 0xffffffff) == -2;
	    anInt279 = arg1.readInt((byte) 125);
	    anInt326 = arg1.readShort2((byte) 65);
	    anInt213 = arg1.readShort2((byte) 109);
	    int i_27_ = arg1.readByte((byte) -87);
	    aRSStringArray170 = new RSString[5];
	    if ((i_27_ ^ 0xffffffff) == -2)
		i_19_ |= 0x40000000;
	    for (int i_28_ = 0; i_28_ < 5; i_28_++) {
		RSString RSString = arg1.readRSString(-1);
		if (RSString.method531((byte) -120) > 0) {
		    aRSStringArray170[i_28_] = RSString;
		    i_19_ |= 1 << i_28_ + 23;
		}
	    }
	}
	if ((anInt227 ^ 0xffffffff) == -9)
	    aRSString_219 = arg1.readRSString(-1);
	if ((anInt166 ^ 0xffffffff) == -3 || (anInt227 ^ 0xffffffff) == -3) {
	    aRSString_191 = arg1.readRSString(-1);
	    aRSString_258 = arg1.readRSString(-1);
	    int i_29_ = arg1.readUShort(-2386) & 0x3f;
	    i_19_ |= i_29_ << 460501867;
	}
	if ((anInt166 ^ 0xffffffff) == -2 || (anInt166 ^ 0xffffffff) == -5
	    || (anInt166 ^ 0xffffffff) == -6 || anInt166 == 6) {
	    aRSString_270 = arg1.readRSString(arg0 ^ 0x4);
	    if ((aRSString_270.method531((byte) 86) ^ 0xffffffff) == -1) {
		if (anInt166 == 1)
		    aRSString_270 = Class67_Sub1_Sub36.aRSString_4378;
		if ((anInt166 ^ 0xffffffff) == -5)
		    aRSString_270 = Class15.aRSString_463;
		if ((anInt166 ^ 0xffffffff) == -6)
		    aRSString_270 = Class15.aRSString_463;
		if ((anInt166 ^ 0xffffffff) == -7)
		    aRSString_270 = Class34.aRSString_744;
	    }
	}
	if (anInt166 == 1 || (anInt166 ^ 0xffffffff) == -5 || anInt166 == 5)
	    i_19_ |= 0x400000;
	if (anInt166 == 6)
	    i_19_ |= 0x1;
	aClass67_Sub14_309 = new Class67_Sub14(i_19_, -1);
    }
    
    public Class67_Sub5_Sub19 method94(boolean arg0, int arg1) {
	anInt232++;
	Class114.aBoolean2162 = false;
	int i;
	if (arg0)
	    i = anInt276;
	else
	    i = anInt225;
	if ((i ^ 0xffffffff) == 0)
	    return null;
	long l = (((long) anInt294 << -918255384)
		  + (((!aBoolean249 ? 0L : 1L) << 1841181926)
		     + ((long) anInt284 << 585714468))
		  + (((!aBoolean262 ? 0L : 1L) << 1910192227)
		     + ((long) i - -((aBoolean218 ? 1L : 0L) << 2106598055))));
	Class67_Sub5_Sub19 class67_sub5_sub19
	    = (Class67_Sub5_Sub19) Class15.aClass136_451.method1924(l, false);
	if (class67_sub5_sub19 != null)
	    return class67_sub5_sub19;
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1;
	if (!aBoolean262)
	    class67_sub5_sub19_sub1
		= Class44.method387(-119, Class51.aClass9_1041, i, 0);
	else
	    class67_sub5_sub19_sub1
		= Class55_Sub1.method468(0, Class51.aClass9_1041, false, i);
	if (class67_sub5_sub19_sub1 == null) {
	    Class114.aBoolean2162 = true;
	    return null;
	}
	if (aBoolean249)
	    class67_sub5_sub19_sub1.method1019();
	if (aBoolean218)
	    class67_sub5_sub19_sub1.method1024();
	if ((anInt284 ^ 0xffffffff) < -1)
	    class67_sub5_sub19_sub1.method1014(anInt284);
	if (anInt284 >= 1)
	    class67_sub5_sub19_sub1.method1016(1);
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1_30_
	    = class67_sub5_sub19_sub1;
	if (anInt284 >= 2)
	    class67_sub5_sub19_sub1.method1016(16777215);
	if ((anInt294 ^ 0xffffffff) != -1)
	    class67_sub5_sub19_sub1.method1017(anInt294);
	Class15.aClass136_451.method1926(l, class67_sub5_sub19_sub1_30_,
					 (byte) -71);
	if (arg1 > -25)
	    method96(21);
	return class67_sub5_sub19_sub1_30_;
    }
    
    public void method95(int arg0, int arg1, int arg2) {
	anInt282++;
	int i = anIntArray264[arg2];
	anIntArray264[arg2] = anIntArray264[arg1];
	anIntArray264[arg1] = i;
	i = anIntArray253[arg2];
	anIntArray253[arg2] = anIntArray253[arg1];
	anIntArray253[arg1] = i;
	if (arg0 < 116)
	    method96(25);
    }
    
    public static void method96(int arg0) {
	anInt242++;
	Class70_Sub1.outStream.createFrame(2, 177);	//PACKET_COUNT ?
	Class67_Sub1_Sub32.anInt4303++;
	if (arg0 != 128)
	    method85((byte) -31);
	Class70_Sub1.outStream.addUShort(arg0 ^ 0xff0080,
							Class66.anInt1326);
    }
    
    public static int method97(int arg0, int arg1, int arg2, int arg3) {
	if (arg3 != 65535)
	    return 64;
	anInt236++;
	if (arg0 >= arg2) {
	    if ((arg0 ^ 0xffffffff) < (arg1 ^ 0xffffffff))
		return arg1;
	    return arg0;
	}
	return arg2;
    }
    
    public void method98(int arg0, Stream arg1) {
	aBoolean185 = true;
	arg1.currentOffset++;
	anInt227 = arg1.readByte((byte) -6);
	anInt239++;
	if ((0x80 & anInt227 ^ 0xffffffff) != -1) {
	    anInt227 &= 0x7f;
	    arg1.readRSString(arg0 ^ ~0x4f67);
	}
	anInt287 = arg1.readUShort(-2386);
	anInt292 = arg1.readShort2((byte) 109);
	anInt295 = arg1.readShort2((byte) 78);
	anInt193 = arg1.readUShort(arg0 ^ ~0x4636);
	anInt199 = arg1.readUShort(-2386);
	aByte210 = arg1.readByte2((byte) 1);
	aByte168 = arg1.readByte2((byte) 1);
	aByte233 = arg1.readByte2((byte) 1);
	if (arg0 != 20327)
	    method96(78);
	aByte173 = arg1.readByte2((byte) 1);
	anInt174 = arg1.readUShort(-2386);
	if (anInt174 == 65535)
	    anInt174 = -1;
	else
	    anInt174 = (~0xffff & anInt301) + anInt174;
	aBoolean313 = arg1.readByte((byte) 83) == 1;
	if ((anInt227 ^ 0xffffffff) == -1) {
	    anInt328 = arg1.readUShort(arg0 + -22713);
	    anInt222 = arg1.readUShort(arg0 + -22713);
	    aBoolean324 = (arg1.readByte((byte) 106) ^ 0xffffffff) == -2;
	}
	if ((anInt227 ^ 0xffffffff) == -6) {
	    anInt225 = arg1.readInt((byte) 126);
	    anInt187 = arg1.readUShort(arg0 + -22713);
	    int i = arg1.readByte((byte) -126);
	    aBoolean262 = (0x2 & i) != 0;
	    aBoolean177 = (i & 0x1) != 0;
	    anInt205 = arg1.readByte((byte) -119);
	    anInt284 = arg1.readByte((byte) -68);
	    anInt294 = arg1.readInt((byte) 127);
	    aBoolean249 = (arg1.readByte((byte) -29) ^ 0xffffffff) == -2;
	    aBoolean218 = arg1.readByte((byte) -28) == 1;
	}
	if ((anInt227 ^ 0xffffffff) == -7) {
	    anInt329 = 1;
	    anInt183 = arg1.readUShort(arg0 + -22713);
	    if (anInt183 == 65535)
		anInt183 = -1;
	    anInt229 = arg1.readShort2((byte) 102);
	    anInt312 = arg1.readShort2((byte) 104);
	    anInt330 = arg1.readUShort(arg0 ^ ~0x4636);
	    anInt164 = arg1.readUShort(-2386);
	    anInt325 = arg1.readUShort(-2386);
	    anInt338 = arg1.readUShort(-2386);
	    anInt274 = arg1.readUShort(-2386);
	    if (anInt274 == 65535)
		anInt274 = -1;
	    aBoolean299 = (arg1.readByte((byte) 109) ^ 0xffffffff) == -2;
	    arg1.readUShort(-2386);
	    arg1.readUShort(arg0 + -22713);
	    arg1.readByte((byte) 100);
	    if ((aByte210 ^ 0xffffffff) != -1)
		anInt240 = arg1.readUShort(-2386);
	    if (aByte168 != 0)
		anInt211 = arg1.readUShort(-2386);
	}
	if (anInt227 == 4) {
	    anInt277 = arg1.readUShort(-2386);
	    if (anInt277 == 65535)
		anInt277 = -1;
	    aRSString_219 = arg1.readRSString(arg0 ^ ~0x4f67);
	    anInt198 = arg1.readByte((byte) 96);
	    anInt214 = arg1.readByte((byte) -18);
	    anInt248 = arg1.readByte((byte) -50);
	    aBoolean278 = (arg1.readByte((byte) -76) ^ 0xffffffff) == -2;
	    anInt279 = arg1.readInt((byte) 126);
	}
	if ((anInt227 ^ 0xffffffff) == -4) {
	    anInt279 = arg1.readInt((byte) 126);
	    aBoolean300 = arg1.readByte((byte) 121) == 1;
	    anInt205 = arg1.readByte((byte) -17);
	}
	if (anInt227 == 9) {
	    anInt311 = arg1.readByte((byte) 107);
	    anInt279 = arg1.readInt((byte) 126);
	    aBoolean305 = (arg1.readByte((byte) 120) ^ 0xffffffff) == -2;
	}
	int i = arg1.readThreeBytes(65280);
	int i_31_ = arg1.readByte((byte) -128);
	if (i_31_ != 0) {
	    aByteArray307 = new byte[10];
	    aByteArray320 = new byte[10];
	    anIntArray247 = new int[10];
	    for (/**/; (i_31_ ^ 0xffffffff) != -1;
		 i_31_ = arg1.readByte((byte) -61)) {
		int i_32_ = (i_31_ >> 738388356) - 1;
		i_31_ = i_31_ << 709490184 | arg1.readByte((byte) 115);
		i_31_ &= 0xfff;
		if ((i_31_ ^ 0xffffffff) == -4096)
		    anIntArray247[i_32_] = -1;
		else
		    anIntArray247[i_32_] = i_31_;
		aByteArray307[i_32_] = arg1.readByte2((byte) 1);
		aByteArray320[i_32_] = arg1.readByte2((byte) 1);
	    }
	}
	aRSString_178 = arg1.readRSString(-1);
	int i_33_ = arg1.readByte((byte) -96);
	int i_34_ = 0xf & i_33_;
	int i_35_ = i_33_ >> 550740100;
	if ((i_34_ ^ 0xffffffff) < -1) {
	    aRSStringArray315 = new RSString[i_34_];
	    for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff);
		 i_36_++)
		aRSStringArray315[i_36_] = arg1.readRSString(-1);
	}
	if (i_35_ > 0) {
	    int i_37_ = arg1.readByte((byte) 112);
	    anIntArray182 = new int[i_37_ - -1];
	    for (int i_38_ = 0; i_38_ < anIntArray182.length; i_38_++)
		anIntArray182[i_38_] = -1;
	    anIntArray182[i_37_] = arg1.readUShort(-2386);
	}
	if (i_35_ > 1) {
	    int i_39_ = arg1.readByte((byte) 121);
	    anIntArray182[i_39_] = arg1.readUShort(-2386);
	}
	anInt267 = arg1.readByte((byte) 91);
	anInt263 = arg1.readByte((byte) -99);
	aBoolean290 = (arg1.readByte((byte) -47) ^ 0xffffffff) == -2;
	int i_40_ = -1;
	aRSString_191 = arg1.readRSString(-1);
	if (Class137.method1933(i, (byte) -128) != 0) {
	    i_40_ = arg1.readUShort(-2386);
	    if (i_40_ == 65535)
		i_40_ = -1;
	    anInt235 = arg1.readUShort(-2386);
	    if ((anInt235 ^ 0xffffffff) == -65536)
		anInt235 = -1;
	    anInt332 = arg1.readUShort(arg0 ^ ~0x4636);
	    if ((anInt332 ^ 0xffffffff) == -65536)
		anInt332 = -1;
	}
	aClass67_Sub14_309 = new Class67_Sub14(i, i_40_);
	anObjectArray250 = method99((byte) 124, arg1);
	anObjectArray310 = method99((byte) 124, arg1);
	anObjectArray208 = method99((byte) 124, arg1);
	anObjectArray336 = method99((byte) 124, arg1);
	anObjectArray244 = method99((byte) 124, arg1);
	anObjectArray302 = method99((byte) 124, arg1);
	anObjectArray316 = method99((byte) 124, arg1);
	anObjectArray212 = method99((byte) 124, arg1);
	anObjectArray196 = method99((byte) 124, arg1);
	anObjectArray200 = method99((byte) 124, arg1);
	anObjectArray254 = method99((byte) 124, arg1);
	anObjectArray297 = method99((byte) 124, arg1);
	anObjectArray280 = method99((byte) 124, arg1);
	anObjectArray167 = method99((byte) 124, arg1);
	anObjectArray209 = method99((byte) 124, arg1);
	anObjectArray317 = method99((byte) 124, arg1);
	anObjectArray171 = method99((byte) 124, arg1);
	anObjectArray306 = method99((byte) 124, arg1);
	anObjectArray268 = method99((byte) 124, arg1);
	anObjectArray281 = method99((byte) 124, arg1);
	anIntArray163 = method86(arg1, (byte) 106);
	anIntArray256 = method86(arg1, (byte) 106);
	anIntArray255 = method86(arg1, (byte) 106);
	anIntArray207 = method86(arg1, (byte) 106);
	anIntArray283 = method86(arg1, (byte) 106);
    }
    
    public Object[] method99(byte arg0, Stream arg1) {
	anInt161++;
	int i = arg1.readByte((byte) 91);
	if ((i ^ 0xffffffff) == -1)
	    return null;
	Object[] objects = new Object[i];
	for (int i_41_ = 0; i > i_41_; i_41_++) {
	    int i_42_ = arg1.readByte((byte) -40);
	    if (i_42_ == 0)
		objects[i_41_] = new Integer(arg1.readInt((byte) 125));
	    else if (i_42_ == 1)
		objects[i_41_] = arg1.readRSString(arg0 + -125);
	}
	aBoolean169 = true;
	if (arg0 != 124)
	    return null;
	return objects;
    }
    
    public Class67_Sub5_Sub10 method100(Class119[] arg0, byte arg1) {
	anInt339++;
	Class114.aBoolean2162 = false;
	if (anInt277 == -1)
	    return null;
	Class67_Sub5_Sub10 class67_sub5_sub10
	    = ((Class67_Sub5_Sub10)
	       Class19.aClass136_488.method1924((long) anInt277, false));
	if (class67_sub5_sub10 != null)
	    return class67_sub5_sub10;
	class67_sub5_sub10
	    = Class116.method1622(Class51.aClass9_1041, anInt277, 0, 0,
				  Class131_Sub7_Sub2.aClass9_5063);
	if (arg1 < 35)
	    return null;
	if (class67_sub5_sub10 == null)
	    Class114.aBoolean2162 = true;
	else {
	    class67_sub5_sub10.method902(arg0, null);
	    Class19.aClass136_488.method1926((long) anInt277,
					     class67_sub5_sub10, (byte) -71);
	}
	return class67_sub5_sub10;
    }
    
    public Class7() {
	anInt162 = 0;
	anInt188 = 0;
	aBoolean185 = false;
	aByte210 = (byte) 0;
	anInt194 = 0;
	aRSString_191 = Class67_Sub5_Sub6.aRSString_4540;
	anInt174 = -1;
	anInt221 = 0;
	anInt187 = 0;
	anInt175 = 0;
	aByte233 = (byte) 0;
	anInt238 = 1;
	anInt198 = 0;
	anInt261 = 1;
	anInt216 = 0;
	anInt267 = 0;
	anInt240 = 0;
	aRSString_270 = Class67_Sub1_Sub36.aRSString_4378;
	anInt246 = -1;
	anInt199 = 0;
	aRSString_172 = Class67_Sub5_Sub6.aRSString_4540;
	anInt234 = -1;
	anInt202 = 0;
	anInt225 = -1;
	anInt195 = 0;
	anInt257 = 0;
	anInt203 = 1;
	anInt215 = 1;
	anInt289 = -1;
	anInt272 = 0;
	anInt205 = 0;
	aRSString_258 = Class67_Sub5_Sub6.aRSString_4540;
	anInt275 = -1;
	anInt204 = -1;
	aBoolean300 = false;
	anInt263 = 0;
	anInt222 = 0;
	anInt277 = -1;
	anInt214 = 0;
	anInt266 = -1;
	anInt298 = 0;
	aBoolean262 = false;
	aBoolean278 = false;
	anInt274 = -1;
	anInt279 = 0;
	anInt303 = -1;
	anInt291 = 0;
	anInt189 = 0;
	aBoolean169 = false;
	anInt213 = 0;
	aBoolean177 = false;
	anInt284 = 0;
	anInt248 = 0;
	anInt235 = -1;
	anInt312 = 0;
	anInt292 = 0;
	anInt304 = 0;
	anInt211 = 0;
	aByte168 = (byte) 0;
	anInt220 = 0;
	anInt287 = 0;
	aRSString_219 = Class67_Sub5_Sub6.aRSString_4540;
	anInt166 = 0;
	anInt288 = 0;
	anInt311 = 1;
	anInt164 = 0;
	anInt193 = 0;
	anInt251 = 0;
	aBoolean324 = false;
	anInt330 = 0;
	anInt325 = 0;
	aBoolean290 = false;
	anInt326 = 0;
	anInt295 = 0;
	aClass67_Sub14_309 = Class76.aClass67_Sub14_1530;
	aBoolean299 = false;
	anInt328 = 0;
	aBoolean296 = false;
	aBoolean305 = false;
	aClass7_319 = null;
	anInt327 = 0;
	anInt333 = -1;
	anInt294 = 0;
	aBoolean314 = false;
	anInt276 = -1;
	anInt229 = 0;
	anInt332 = -1;
	anInt201 = -1;
	aBoolean313 = false;
	anInt335 = 0;
	aBoolean165 = true;
	anInt338 = 100;
	anInt329 = 1;
	anInt334 = 0;
	anInt301 = -1;
    }
    
    static {
	aBoolean293 = false;
    }
}
