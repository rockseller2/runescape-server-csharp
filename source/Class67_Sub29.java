/* Class67_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub29 extends Class67
{
    public static int anInt3329;
    public static int anInt3330;
    public static int[] anIntArray3331
	= { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };
    public static RSString aRSString_3332 = Class134.method1914("k", (byte) 95);
    public static int anInt3333;
    public RSString musicName;
    public static int anInt3335;
    public static RSString aRSString_3336
	= Class134.method1914("Schlie-8en", (byte) 114);
    public static boolean aBoolean3337 = false;
    public static int[][] anIntArrayArray3338;
    public static int anInt3339;
    
    public static Class67_Sub5_Sub3 method1311(int arg0) {
	if (arg0 > -15)
	    return null;
	anInt3333++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = (Class67_Sub5_Sub3) Class90.aClass120_1843.method1656(104);
	if (class67_sub5_sub3 != null) {
	    class67_sub5_sub3.method606((byte) -118);
	    class67_sub5_sub3.method821(24120);
	    return class67_sub5_sub3;
	}
	do {
	    class67_sub5_sub3
		= (Class67_Sub5_Sub3) Class11.aClass120_415.method1656(104);
	    if (class67_sub5_sub3 == null)
		return null;
	    if ((class67_sub5_sub3.method845((byte) -34) ^ 0xffffffffffffffffL)
		< (Class39.method337(19644) ^ 0xffffffffffffffffL))
		return null;
	    class67_sub5_sub3.method606((byte) -118);
	    class67_sub5_sub3.method821(24120);
	} while ((class67_sub5_sub3.aLong2863 & ~0x7fffffffffffffffL
		  ^ 0xffffffffffffffffL)
		 == -1L);
	return class67_sub5_sub3;
    }
    
    public static Class98 method1312(int arg0, int arg1) {
	anInt3335++;
	Class98 class98
	    = (Class98) Class18.aClass136_2730.method1924((long) arg1, false);
	if (class98 != null)
	    return class98;
	if (arg0 != 31473)
	    return null;
	byte[] is
	    = Class84.aClass9_1697.method138(-809612665,
					     Class36.method314(arg1,
							       (byte) -95),
					     Class67_Sub1_Sub38
						 .method807(arg1, (byte) -80));
	class98 = new Class98();
	if (is != null)
	    class98.method1513(new Stream(is), 16609);
	Class18.aClass136_2730.method1926((long) arg1, class98, (byte) -71);
	return class98;
    }
    
    public static void method1313(int arg0) {
	aRSString_3336 = null;
	if (arg0 <= -24) {
	    aRSString_3332 = null;
	    anIntArray3331 = null;
	    anIntArrayArray3338 = null;
	}
    }
    
    public static void method1314(int arg0, Class7 arg1) {
	anInt3330++;
	if (arg0 != 12449)
	    aBoolean3337 = false;
	int i = arg1.anInt287;
	if ((i ^ 0xffffffff) == -325) {
	    if ((Class67_Sub5_Sub11_Sub2.anInt5142 ^ 0xffffffff) == 0) {
		Class67_Sub1_Sub19.anInt4139 = arg1.anInt276;
		Class67_Sub5_Sub11_Sub2.anInt5142 = arg1.anInt225;
	    }
	    if (!Class43.aClass22_898.aBoolean538)
		arg1.anInt225 = Class67_Sub1_Sub19.anInt4139;
	    else
		arg1.anInt225 = Class67_Sub5_Sub11_Sub2.anInt5142;
	} else if ((i ^ 0xffffffff) == -326) {
	    if ((Class67_Sub5_Sub11_Sub2.anInt5142 ^ 0xffffffff) == 0) {
		Class67_Sub1_Sub19.anInt4139 = arg1.anInt276;
		Class67_Sub5_Sub11_Sub2.anInt5142 = arg1.anInt225;
	    }
	    if (Class43.aClass22_898.aBoolean538)
		arg1.anInt225 = Class67_Sub1_Sub19.anInt4139;
	    else
		arg1.anInt225 = Class67_Sub5_Sub11_Sub2.anInt5142;
	} else if (i == 327) {
	    arg1.anInt330 = 150;
	    arg1.anInt164
		= 0x7ff & (int) (Math.sin((double) Class67_Sub1_Sub9.anInt3952
					  / 40.0)
				 * 256.0);
	    arg1.anInt329 = 5;
	    arg1.anInt183 = -1;
	} else if ((i ^ 0xffffffff) == -329) {
	    if (Class122.aClass131_Sub7_Sub2_2309.playerName == null)
		arg1.anInt183 = 0;
	    else {
		arg1.anInt330 = 150;
		arg1.anInt164
		    = 0x7ff & (int) (256.0
				     * Math.sin((double) (Class67_Sub1_Sub9
							  .anInt3952) / 40.0));
		arg1.anInt329 = 5;
		arg1.anInt183 = ((int) Class122.aClass131_Sub7_Sub2_2309
					   .playerName.method501((byte) -16)
				 << -1171550965) + 2047;
		arg1.anInt298 = 0;
		arg1.anInt257 = Class122.aClass131_Sub7_Sub2_2309.anInt3758;
		arg1.anInt203 = Class122.aClass131_Sub7_Sub2_2309.anInt3722;
		arg1.anInt274 = Class122.aClass131_Sub7_Sub2_2309.anInt3720;
	    }
	}
    }
    
    public Class67_Sub29() {
	/* empty */
    }
    
    public Class67_Sub29(RSString arg0) {
	musicName = arg0;
    }
}
