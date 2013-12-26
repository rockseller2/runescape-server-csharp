/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47
{
    public static int anInt952;
    public static RSString aRSString_953 = Class134.method1914("::", (byte) 11);
    public static int anInt954;
    public boolean aBoolean955;
    public int[] anIntArray956 = { -1, -1, -1, -1, -1 };
    public int[] anIntArray957;
    public static RSString aRSString_958;
    public short[] aShortArray959;
    public static int anInt960;
    public static int anInt961;
    public static int anInt962 = 0;
    public short[] aShortArray963;
    public static int anInt964;
    public static int[] anIntArray965 = new int[32768];
    public short[] aShortArray966;
    public static int anInt967;
    public static int anInt968;
    public static int anInt969;
    public static int anInt970;
    public short[] aShortArray971;
    public static int anInt972;
    public int anInt973;
    
    public void method409(int arg0, Stream arg1, int arg2) {
	anInt972++;
	if (arg2 >= 54) {
	    if ((arg0 ^ 0xffffffff) != -2) {
		if (arg0 != 2) {
		    if ((arg0 ^ 0xffffffff) != -4) {
			if (arg0 != 40) {
			    if (arg0 == 41) {
				int i = arg1.readByte((byte) 88);
				aShortArray971 = new short[i];
				aShortArray959 = new short[i];
				for (int i_0_ = 0; i_0_ < i; i_0_++) {
				    aShortArray971[i_0_]
					= (short) arg1.readUShort(-2386);
				    aShortArray959[i_0_]
					= (short) arg1.readUShort(-2386);
				}
			    } else if ((arg0 ^ 0xffffffff) <= -61 && arg0 < 70)
				anIntArray956[-60 + arg0]
				    = arg1.readUShort(-2386);
			} else {
			    int i = arg1.readByte((byte) -114);
			    aShortArray966 = new short[i];
			    aShortArray963 = new short[i];
			    for (int i_1_ = 0;
				 (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
				 i_1_++) {
				aShortArray966[i_1_]
				    = (short) arg1.readUShort(-2386);
				aShortArray963[i_1_]
				    = (short) arg1.readUShort(-2386);
			    }
			}
		    } else
			aBoolean955 = true;
		} else {
		    int i = arg1.readByte((byte) 96);
		    anIntArray957 = new int[i];
		    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i ^ 0xffffffff);
			 i_2_++)
			anIntArray957[i_2_] = arg1.readUShort(-2386);
		}
	    } else
		anInt973 = arg1.readByte((byte) 97);
	}
    }
    
    public static void method410(boolean arg0, Stream arg1, int arg2,
				 int arg3, int arg4, int arg5, int arg6,
				 boolean arg7, int arg8) {
	if ((arg5 ^ 0xffffffff) <= -1 && arg5 < 104 && arg2 >= 0
	    && (arg2 ^ 0xffffffff) > -105) {
	    if (!arg7)
		Class120.aByteArrayArrayArray2284[arg4][arg5][arg2] = (byte) 0;
	    for (;;) {
		int i = arg1.readByte((byte) -109);
		if ((i ^ 0xffffffff) == -1) {
		    if (!arg7) {
			if ((arg4 ^ 0xffffffff) == -1)
			    Class136.anIntArrayArrayArray2496[0][arg5][arg2]
				= 8 * -(PacketStream.method1103
					(932731 - -arg5 + arg8, (byte) -29,
					 arg6 + (556238 + arg2)));
			else
			    Class136.anIntArrayArrayArray2496[arg4][arg5][arg2]
				= -240 + (Class136.anIntArrayArrayArray2496
					  [arg4 - 1][arg5][arg2]);
		    } else
			Class136.anIntArrayArrayArray2496[0][arg5][arg2]
			    = (InputStream_Sub1.anIntArrayArrayArray75[0][arg5]
			       [arg2]);
		    break;
		}
		if (i == 1) {
		    int i_3_ = arg1.readByte((byte) -54);
		    if (arg7)
			Class136.anIntArrayArrayArray2496[0][arg5][arg2]
			    = (InputStream_Sub1.anIntArrayArrayArray75[0][arg5]
			       [arg2]) - -(8 * i_3_);
		    else {
			if ((i_3_ ^ 0xffffffff) == -2)
			    i_3_ = 0;
			if ((arg4 ^ 0xffffffff) == -1)
			    Class136.anIntArrayArrayArray2496[0][arg5][arg2]
				= -i_3_ * 8;
			else
			    Class136.anIntArrayArrayArray2496[arg4][arg5][arg2]
				= -(8 * i_3_) + (Class136
						 .anIntArrayArrayArray2496
						 [-1 + arg4][arg5][arg2]);
		    }
		    break;
		}
		if ((i ^ 0xffffffff) >= -50) {
		    Class70.aByteArrayArrayArray1403[arg4][arg5][arg2]
			= arg1.readByte2((byte) 1);
		    Class67_Sub1_Sub10.aByteArrayArrayArray3983[arg4][arg5]
			[arg2]
			= (byte) ((i - 2) / 4);
		    Class67_Sub5_Sub8.aByteArrayArrayArray4571[arg4][arg5]
			[arg2]
			= (byte) Class75.method1379(arg3 + (i + -2), 3);
		} else if ((i ^ 0xffffffff) >= -82) {
		    if (!arg7)
			Class120.aByteArrayArrayArray2284[arg4][arg5][arg2]
			    = (byte) (-49 + i);
		} else
		    Class67_Sub1_Sub24.aByteArrayArrayArray4199[arg4][arg5]
			[arg2]
			= (byte) (-81 + i);
	    }
	} else {
	    for (;;) {
		int i = arg1.readByte((byte) -41);
		if ((i ^ 0xffffffff) == -1)
		    break;
		if ((i ^ 0xffffffff) == -2) {
		    arg1.readByte((byte) 84);
		    break;
		}
		if (i <= 49)
		    arg1.readByte((byte) 116);
	    }
	}
	if (arg0 != false)
	    anInt962 = -54;
	anInt954++;
    }
    
    public Class131_Sub2 method411(int arg0) {
	anInt961++;
	Class131_Sub2[] class131_sub2s = new Class131_Sub2[5];
	int i = 0;
	for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -6; i_4_++) {
	    if ((anIntArray956[i_4_] ^ 0xffffffff) != 0)
		class131_sub2s[i++]
		    = Class131_Sub2.method1780(Class107.aClass9_2068,
					       anIntArray956[i_4_], 0);
	}
	Class131_Sub2 class131_sub2 = new Class131_Sub2(class131_sub2s, i);
	if (aShortArray966 != null) {
	    for (int i_5_ = 0; i_5_ < aShortArray966.length; i_5_++)
		class131_sub2.method1796(aShortArray966[i_5_],
					 aShortArray963[i_5_]);
	}
	if (arg0 != 9961)
	    anInt962 = -76;
	if (aShortArray971 != null) {
	    for (int i_6_ = 0; i_6_ < aShortArray971.length; i_6_++)
		class131_sub2.method1791(aShortArray971[i_6_],
					 aShortArray959[i_6_]);
	}
	return class131_sub2;
    }
    
    public boolean method412(byte arg0) {
	if (arg0 >= -80)
	    return true;
	anInt967++;
	boolean bool = true;
	for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
	    if (anIntArray956[i] != -1
		&& !Class107.aClass9_2068.method117(true, anIntArray956[i], 0))
		bool = false;
	}
	return bool;
    }
    
    public static int method413(int arg0, RSString arg1) {
	anInt964++;
	for (int i = arg0;
	     (Class32.aRSStringArray726.length ^ 0xffffffff) < (i ^ 0xffffffff);
	     i++) {
	    if (Class32.aRSStringArray726[i].method526(83, arg1))
		return i;
	}
	return -1;
    }
    
    public void method414(byte arg0, Stream arg1) {
	for (;;) {
	    int i = arg1.readByte((byte) -63);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method409(i, arg1, 66);
	}
	if (arg0 > -57)
	    aRSString_958 = null;
	anInt960++;
    }
    
    public static void method415(byte arg0) {
	anIntArray965 = null;
	aRSString_953 = null;
	aRSString_958 = null;
	int i = 36 % ((36 - arg0) / 38);
    }
    
    public static void method416(int arg0) {
	anInt970++;
	if (SignLink.aString941.toLowerCase().indexOf("microsoft") == -1) {
	    Class19.anIntArray495[47] = 73;
	    Class19.anIntArray495[92] = 74;
	    Class19.anIntArray495[91] = 42;
	    if (SignLink.aMethod944 == null) {
		Class19.anIntArray495[222] = 59;
		Class19.anIntArray495[192] = 58;
	    } else {
		Class19.anIntArray495[222] = 58;
		Class19.anIntArray495[520] = 59;
		Class19.anIntArray495[192] = 28;
	    }
	    Class19.anIntArray495[61] = 27;
	    Class19.anIntArray495[59] = 57;
	    Class19.anIntArray495[93] = 43;
	    Class19.anIntArray495[45] = 26;
	    Class19.anIntArray495[46] = 72;
	    Class19.anIntArray495[44] = 71;
	} else {
	    Class19.anIntArray495[191] = 73;
	    Class19.anIntArray495[220] = 74;
	    Class19.anIntArray495[186] = 57;
	    Class19.anIntArray495[222] = 59;
	    Class19.anIntArray495[187] = 27;
	    Class19.anIntArray495[190] = 72;
	    Class19.anIntArray495[189] = 26;
	    Class19.anIntArray495[223] = 28;
	    Class19.anIntArray495[188] = 71;
	    Class19.anIntArray495[219] = 42;
	    Class19.anIntArray495[192] = 58;
	    Class19.anIntArray495[221] = 43;
	}
	if (arg0 != 12506)
	    method410(false, null, -3, -75, -103, 88, -82, false, 56);
    }
    
    public boolean method417(boolean arg0) {
	anInt969++;
	if (anIntArray957 == null)
	    return true;
	boolean bool = arg0;
	for (int i = 0; anIntArray957.length > i; i++) {
	    if (!Class107.aClass9_2068.method117(arg0, anIntArray957[i], 0))
		bool = false;
	}
	return bool;
    }
    
    public Class131_Sub2 method418(int arg0) {
	anInt968++;
	if (anIntArray957 == null)
	    return null;
	Class131_Sub2[] class131_sub2s
	    = new Class131_Sub2[anIntArray957.length];
	for (int i = 0; i < anIntArray957.length; i++)
	    class131_sub2s[i] = Class131_Sub2.method1780(Class107.aClass9_2068,
							 anIntArray957[i], 0);
	Class131_Sub2 class131_sub2;
	if ((class131_sub2s.length ^ 0xffffffff) != -2)
	    class131_sub2
		= new Class131_Sub2(class131_sub2s, class131_sub2s.length);
	else
	    class131_sub2 = class131_sub2s[0];
	if (arg0 != 71)
	    anIntArray965 = null;
	if (aShortArray966 != null) {
	    for (int i = 0; aShortArray966.length > i; i++)
		class131_sub2.method1796(aShortArray966[i], aShortArray963[i]);
	}
	if (aShortArray971 != null) {
	    for (int i = 0; i < aShortArray971.length; i++)
		class131_sub2.method1791(aShortArray971[i], aShortArray959[i]);
	}
	return class131_sub2;
    }
    
    public static void method419(int arg0, RSString arg1) {
	if (arg0 != -1)
	    aRSString_958 = null;
	anInt952++;
	Class67_Sub1_Sub22.method723(false, (byte) 126);
	Class132.method1905((byte) -117, arg1);
    }
    
    public Class47() {
	aBoolean955 = false;
	anInt973 = -1;
    }
    
    static {
	aRSString_958 = Class134.method1914("cookieprefix", (byte) 50);
    }
}
