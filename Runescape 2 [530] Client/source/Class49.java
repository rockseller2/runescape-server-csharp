/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49
{
    public static RSString aRSString_999;
    public static int anInt1000;
    public static int anInt1001;
    public static RSString aRSString_1002;
    public static int anInt1003;
    public static RSString aRSString_1004
	= Class134.method1914("Ablegen", (byte) 55);
    public static byte[][][] aByteArrayArrayArray1005;
    public static int anInt1006;
    public static int anInt1007;
    public static int anInt1008;
    public static int anInt1009;
    public static int anInt1010;
    public static int anInt1011;
    
    public static RSString[] method424(RSString[] arg0, int arg1) {
	RSString[] RSStrings = new RSString[5];
	for (int i = arg1; (i ^ 0xffffffff) > -6; i++) {
	    RSStrings[i]
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ InputStream_Sub1
						      .method47(i, true),
						  Class100.aRSString_1970 }),
					       -96);
	    if (arg0 != null && arg0[i] != null)
		RSStrings[i]
		    = Class67_Sub1_Sub27.method744(new RSString[] { RSStrings[i],
								   arg0[i] },
						   -121);
	}
	anInt1009++;
	return RSStrings;
    }
    
    public static void method425(int arg0, int arg1) {
	anInt1001++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, arg0);
	class67_sub5_sub3.method844(0);
    }
    
    public static void method426(RSString arg0, byte arg1, int arg2) {
	int i = 92 % ((arg1 - -43) / 41);
	anInt1003++;
	Class70_Sub1.outStream.createFrame(2, 188);	//CLAN_RANKS
	Class51.anInt1038++;
	Class70_Sub1.outStream.addByteA(-27699, arg2);
	Class70_Sub1.outStream
	    .writeLong(2, arg0.method501((byte) -16));
    }
    
    public static void method427(byte arg0) {
	aRSString_1002 = null;
	aByteArrayArrayArray1005 = null;
	aRSString_1004 = null;
	int i = -22 / ((arg0 - 4) / 57);
	aRSString_999 = null;
    }
    
    public static void method428(int arg0, int arg1, Class9 arg2, boolean arg3,
				 int arg4, int arg5, int arg6) {
	Class67_Sub11_Sub4.anInt4888 = 1;
	Class67_Sub1_Sub18.aClass9_4111 = arg2;
	Class19.anInt489 = arg6;
	Class86.aBoolean1753 = arg3;
	anInt1000++;
	Class95.anInt1908 = arg5;
	if (arg4 != 12672)
	    method430(null, false);
	Class57.anInt1111 = arg0;
	Class67_Sub24.anInt3238 = arg1;
    }
    
    public static void method429(byte arg0) {
	Class37.method326(Class67_Sub5_Sub12.aClass7_4699, 77);
	anInt1008++;
	Class51.anInt1036++;
	if (arg0 > -119)
	    method428(72, -60, null, false, 123, 23, 73);
	if (!Class141.aBoolean2557 || !Class131_Sub7_Sub1.aBoolean5056) {
	    if (Class51.anInt1036 > 1)
		Class67_Sub5_Sub12.aClass7_4699 = null;
	} else {
	    int i = Class67_Sub1_Sub22.anInt4172;
	    i -= Class67_Sub3.anInt2844;
	    int i_0_ = Class67_Sub5_Sub17.anInt4786;
	    int i_1_ = Class67_Sub5_Sub12.aClass7_4699.anInt267;
	    i_0_ -= Class67_Sub3.anInt2852;
	    if (i_0_ < Class67_Sub19.anInt3146)
		i_0_ = Class67_Sub19.anInt3146;
	    if ((Class67_Sub1_Sub34.aClass7_4337.anInt189
		 + Class67_Sub19.anInt3146)
		< i_0_ - -Class67_Sub5_Sub12.aClass7_4699.anInt189)
		i_0_ = (Class67_Sub19.anInt3146
			+ (Class67_Sub1_Sub34.aClass7_4337.anInt189
			   + -Class67_Sub5_Sub12.aClass7_4699.anInt189));
	    int i_2_ = -Class118.anInt2232 + i_0_;
	    int i_3_ = (-Class67_Sub19.anInt3146
			+ (i_0_ - -Class67_Sub1_Sub34.aClass7_4337.anInt272));
	    if ((i ^ 0xffffffff) > (Class95.anInt1906 ^ 0xffffffff))
		i = Class95.anInt1906;
	    if ((Class67_Sub1_Sub34.aClass7_4337.anInt194 + Class95.anInt1906
		 ^ 0xffffffff)
		> (i + Class67_Sub5_Sub12.aClass7_4699.anInt194 ^ 0xffffffff))
		i = (Class67_Sub1_Sub34.aClass7_4337.anInt194
		     + (Class95.anInt1906
			+ -Class67_Sub5_Sub12.aClass7_4699.anInt194));
	    int i_4_ = -Class55_Sub3_Sub1.anInt3813 + i;
	    int i_5_ = (Class67_Sub1_Sub34.aClass7_4337.anInt291
			+ -Class95.anInt1906 + i);
	    if (Class67_Sub5_Sub12.aClass7_4699.anInt263 < Class51.anInt1036
		&& (i_2_ > i_1_ || i_2_ < -i_1_ || i_4_ > i_1_
		    || i_4_ < -i_1_))
		Class37.aBoolean798 = true;
	    if (Class67_Sub5_Sub12.aClass7_4699.anObjectArray317 != null
		&& Class37.aBoolean798) {
		Class67_Sub30 class67_sub30 = new Class67_Sub30();
		class67_sub30.aClass7_3352 = Class67_Sub5_Sub12.aClass7_4699;
		class67_sub30.anObjectArray3356
		    = Class67_Sub5_Sub12.aClass7_4699.anObjectArray317;
		class67_sub30.anInt3360 = i_5_;
		class67_sub30.anInt3353 = i_3_;
		Class81.method1429(class67_sub30, -115);
	    }
	    if (Class16.anInt464 == 0) {
		if (Class37.aBoolean798) {
		    if (Class67_Sub5_Sub12.aClass7_4699.anObjectArray171
			!= null) {
			Class67_Sub30 class67_sub30 = new Class67_Sub30();
			class67_sub30.anInt3360 = i_5_;
			class67_sub30.anObjectArray3356
			    = Class67_Sub5_Sub12.aClass7_4699.anObjectArray171;
			class67_sub30.anInt3353 = i_3_;
			class67_sub30.aClass7_3352
			    = Class67_Sub5_Sub12.aClass7_4699;
			class67_sub30.aClass7_3351
			    = Class67_Sub5_Sub9.aClass7_4620;
			Class81.method1429(class67_sub30, 82);
		    }
		    if (Class67_Sub5_Sub9.aClass7_4620 != null
			&& (client.method38(Class67_Sub5_Sub12.aClass7_4699)
			    != null)) {
			Class67_Sub15.anInt3078++;
			Class70_Sub1.outStream.createFrame(2, 79);	//SWAP_SLOT2
			Class70_Sub1.outStream.addInt2
			    (Class67_Sub5_Sub12.aClass7_4699.anInt301, -127);
			Class70_Sub1.outStream.addLEShort
			    (Class67_Sub5_Sub9.aClass7_4620.anInt266,
			     1608904784);
			Class70_Sub1.outStream.addInt
			    (Class67_Sub5_Sub9.aClass7_4620.anInt301, 126);
			Class70_Sub1.outStream.addLEShort
			    (Class67_Sub5_Sub12.aClass7_4699.anInt266,
			     1608904784);
		    }
		} else if ((Class23.anInt569 == 1
			    || Class111.method1591(Class134.anInt2476 - 1,
						   (byte) -53))
			   && (Class134.anInt2476 ^ 0xffffffff) < -3)
		    Class43.method383(-38);
		else if (Class134.anInt2476 > 0)
		    Class67_Sub23.method1288(117);
		Class67_Sub5_Sub12.aClass7_4699 = null;
	    }
	}
    }
    
    public static void method430(Class9 arg0, boolean arg1) {
	if (arg1 != false)
	    method425(-91, 70);
	anInt1006++;
    }
    
    static {
	aRSString_1002
	    = Class134.method1914("Liste des serveurs charg-Be", (byte) 43);
	aRSString_999 = Class134.method1914("unzap", (byte) 12);
    }
}
