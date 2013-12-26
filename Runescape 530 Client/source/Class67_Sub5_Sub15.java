/* Class67_Sub5_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub15 extends Class67_Sub5
{
    public static RSString aRSString_4748
	= Class134.method1914("null", (byte) 46);
    public static int anInt4749 = 0;
    public static int anInt4750;
    public static int anInt4751;
    public ObjectDef aObjectDef_4752;
    public static RSString aRSString_4753
	= Class134.method1914("Chargement du module texte )2 ", (byte) 83);
    public static boolean aBoolean4754;
    public static int anInt4755;
    public static RSString aRSString_4756
	= Class134.method1914("Prendre", (byte) 41);
    public static int anInt4757;
    public static int anInt4758;
    public static int anInt4759;
    
    public static int method975(int arg0) {
	anInt4755++;
	if (arg0 != 100)
	    return 124;
	return 2;
    }
    
    public static void method976(int arg0) {
	aRSString_4748 = null;
	if (arg0 != -1)
	    anInt4749 = -54;
	aRSString_4756 = null;
	aRSString_4753 = null;
    }
    
    public static boolean method977(int arg0, boolean arg1) {
	anInt4757++;
	if (PacketParser.aBooleanArray2102[arg0])
	    return true;
	if (!Class55_Sub3_Sub1.aClass9_3810.method134((byte) 109, arg0))
	    return false;
	int i = Class55_Sub3_Sub1.aClass9_3810.method135(arg0, 64);
	if ((i ^ 0xffffffff) == -1) {
	    PacketParser.aBooleanArray2102[arg0] = true;
	    return true;
	}
	if (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0] == null)
	    Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0] = new Class7[i];
	if (arg1 != false)
	    return true;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    if (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0][i_0_] == null) {
		byte[] is
		    = Class55_Sub3_Sub1.aClass9_3810.method138(-809612665,
							       i_0_, arg0);
		if (is != null) {
		    Class7 class7
			= (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0][i_0_]
			   = new Class7());
		    class7.anInt301 = (arg0 << -2106977296) + i_0_;
		    if (is[0] != -1)
			class7.method93(-5, new Stream(is));
		    else
			class7.method98(20327, new Stream(is));
		}
	    }
	}
	PacketParser.aBooleanArray2102[arg0] = true;
	return true;
    }
    
    public static void method978(byte arg0, int arg1) {
	if (arg0 != -113)
	    method980((byte) -98);
	anInt4758++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, 11);
	class67_sub5_sub3.method844(0);
    }
    
    public static void method979(Class9 arg0, int arg1) {
	anInt4759++;
	if (arg1 != -51)
	    method977(-108, false);
	Class7.aClass9_269 = arg0;
    }
    
    public Class67_Sub5_Sub15(ObjectDef arg0) {
	aObjectDef_4752 = arg0;
    }
    
    public static void method980(byte arg0) {
	anInt4750++;
	if (arg0 == -3)
	    Class131_Sub4.aClass136_3639.method1921((byte) 30);
    }
    
    public static void method981(int arg0, boolean arg1) {
	Class67_Sub5_Sub16.anInt4776 = -1;
	if (arg0 == 37)
	    Class131.aFloat2430 = 3.0F;
	else if ((arg0 ^ 0xffffffff) == -51)
	    Class131.aFloat2430 = 4.0F;
	else if (arg0 != 75) {
	    if (arg0 != 100) {
		if (arg0 == 200)
		    Class131.aFloat2430 = 16.0F;
	    } else
		Class131.aFloat2430 = 8.0F;
	} else
	    Class131.aFloat2430 = 6.0F;
	Class67_Sub5_Sub16.anInt4776 = -1;
	anInt4751++;
	if (arg1 != true)
	    aBoolean4754 = false;
    }
    
    static {
	aBoolean4754 = false;
    }
}
