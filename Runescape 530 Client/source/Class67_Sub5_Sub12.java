/* Class67_Sub5_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class67_Sub5_Sub12 extends Class67_Sub5
{
    public static int anInt4680;
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array4681;
    public static int anInt4682;
    public static int anInt4683;
    public int[][] anIntArrayArray4684;
    public static RSString aRSString_4685
	= Class134.method1914("Utiliser", (byte) 57);
    public static int anInt4686;
    public static RSString aRSString_4687;
    public boolean aBoolean4688 = true;
    public int[] anIntArray4689;
    public static int anInt4690;
    public static int anInt4691;
    public static int anInt4692;
    public RSString[] aRSStringArray4693;
    public static int[][] anIntArrayArray4694;
    public static int anInt4695;
    public static int anInt4696;
    public static RSString aRSString_4697
	= (Class134.method1914
	   ("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100",
	    (byte) 123));
    public static Canvas aCanvas4698;
    public static Class7 aClass7_4699 = null;
    public static int anInt4700;
    public static int anInt4701;
    public static RSString aRSString_4702;
    public static int anInt4703;
    public static int anInt4704;
    public static RSString aRSString_4705;
    public int[] anIntArray4706;
    
    public void method942(int arg0, Stream arg1, int[] arg2) {
    while_17_:
	do {
	    try {
		anInt4696++;
		if (arg0 == -28165 && anIntArray4706 != null) {
		    int i = 0;
		    for (;;) {
			if ((i ^ 0xffffffff)
			    <= (anIntArray4706.length ^ 0xffffffff))
			    break while_17_;
			if (i >= arg2.length)
			    break;
			int i_0_ = (Class67_Sub1_Sub35.anIntArray4338
				    [method949(i, 28803)]);
			if ((i_0_ ^ 0xffffffff) < -1)
			    arg1.method1065(i_0_, (long) arg2[i],
					    arg0 ^ ~0x11fb);
			i++;
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("pe.E(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ','
						    + (arg2 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method943(int arg0) {
	aCanvas4698 = null;
	aRSString_4705 = null;
	aClass67_Sub5_Sub19Array4681 = null;
	anIntArrayArray4694 = null;
	if (arg0 <= 83)
	    aRSString_4702 = null;
	aClass7_4699 = null;
	aRSString_4702 = null;
	aRSString_4697 = null;
	aRSString_4687 = null;
	aRSString_4685 = null;
    }
    
    public void method944(Stream arg0, int arg1, int arg2) {
	if (arg2 >= -49)
	    aCanvas4698 = null;
	if (arg1 != 1) {
	    if ((arg1 ^ 0xffffffff) == -3) {
		int i = arg0.readByte((byte) 82);
		anIntArray4689 = new int[i];
		for (int i_1_ = 0; i > i_1_; i_1_++)
		    anIntArray4689[i_1_] = arg0.readUShort(-2386);
	    } else if (arg1 == 3) {
		int i = arg0.readByte((byte) 91);
		anIntArray4706 = new int[i];
		anIntArrayArray4684 = new int[i][];
		for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++) {
		    int i_3_ = arg0.readUShort(-2386);
		    anIntArray4706[i_2_] = i_3_;
		    anIntArrayArray4684[i_2_]
			= new int[Class89.anIntArray1831[i_3_]];
		    for (int i_4_ = 0; Class89.anIntArray1831[i_3_] > i_4_;
			 i_4_++)
			anIntArrayArray4684[i_2_][i_4_]
			    = arg0.readUShort(-2386);
		}
	    } else if ((arg1 ^ 0xffffffff) == -5)
		aBoolean4688 = false;
	} else
	    aRSStringArray4693 = arg0.readRSString(-1).method494(60, 52);
	anInt4686++;
    }
    
    public void method945(boolean arg0) {
	if (arg0 == false) {
	    if (anIntArray4689 != null) {
		for (int i = 0;
		     (anIntArray4689.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    anIntArray4689[i]
			= Class67_Sub20.method1273(anIntArray4689[i], 32768);
	    }
	    anInt4691++;
	}
    }
    
    public int method946(int arg0) {
	if (arg0 < 84)
	    method944(null, -89, 80);
	anInt4680++;
	if (anIntArray4706 == null)
	    return 0;
	return anIntArray4706.length;
    }
    
    public static boolean method947(Class67_Sub11_Sub4 arg0, Class9 arg1,
				    boolean arg2, Class9 arg3, Class9 arg4) {
	try {
	    if (arg2 != false)
		aRSString_4697 = null;
	    Class67_Sub1_Sub1.aClass9_3822 = arg4;
	    Class114.aClass9_2148 = arg3;
	    RuntimeException_Sub1.aClass9_2622 = arg1;
	    anInt4704++;
	    Class136.aClass67_Sub11_Sub4_2485 = arg0;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("pe.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public RSString method948(boolean arg0) {
	anInt4703++;
	if (arg0 != false)
	    return null;
	RSString RSString = Class10.method139((byte) -120, 80);
	if (aRSStringArray4693 == null)
	    return Class67_Sub1_Sub4.aRSString_3852;
	RSString.method544(-63, aRSStringArray4693[0]);
	for (int i = 1;
	     (i ^ 0xffffffff) > (aRSStringArray4693.length ^ 0xffffffff); i++) {
	    RSString.method544(-63, Class104.aRSString_2040);
	    RSString.method544(-63, aRSStringArray4693[i]);
	}
	return RSString.method520((byte) 103);
    }
    
    public int method949(int arg0, int arg1) {
	anInt4690++;
	if (anIntArray4706 == null || arg0 < 0
	    || (arg0 ^ 0xffffffff) < (anIntArray4706.length ^ 0xffffffff))
	    return -1;
	if (arg1 != 28803)
	    return 70;
	return anIntArray4706[arg0];
    }
    
    public void method950(boolean arg0, Stream arg1) {
	anInt4692++;
	for (;;) {
	    int i = arg1.readByte((byte) -57);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method944(arg1, i, -110);
	}
	if (arg0 != false)
	    anIntArray4689 = null;
    }
    
    public RSString method951(int arg0, Stream arg1) {
	if (arg0 <= 16)
	    return null;
	anInt4701++;
	RSString RSString = Class10.method139((byte) -112, 80);
	if (anIntArray4706 != null) {
	    for (int i = 0; anIntArray4706.length > i; i++) {
		RSString.method544(-63, aRSStringArray4693[i]);
		RSString.method544(-63,
				  (Class67_Sub6.method1034
				   (anIntArray4706[i], (byte) -118,
				    arg1.method1069((byte) -67,
						    (Class67_Sub29
						     .anIntArray3331
						     [anIntArray4706[i]])),
				    anIntArrayArray4684[i])));
	    }
	}
	RSString.method544(-63,
			  aRSStringArray4693[-1 + aRSStringArray4693.length]);
	return RSString.method520((byte) 107);
    }
    
    public int method952(int arg0, boolean arg1, int arg2) {
	if (arg1 != false)
	    return -82;
	anInt4683++;
	if (anIntArray4706 == null || (arg2 ^ 0xffffffff) > -1
	    || arg2 > anIntArray4706.length)
	    return -1;
	if (anIntArrayArray4684[arg2] == null || arg0 < 0
	    || arg0 > anIntArrayArray4684[arg2].length)
	    return -1;
	return anIntArrayArray4684[arg2][arg0];
    }
    
    public static int method953(int arg0, int arg1) {
	if (arg0 != -1)
	    anIntArrayArray4694 = null;
	anInt4682++;
	return arg1 >>> 2098797000;
    }
    
    public static boolean method954(byte arg0) {
	if (arg0 != 34)
	    anInt4695 = -42;
	anInt4700++;
	if (client.aBoolean2734) {
	    try {
		Class98.aRSString_1947
		    .method505(Class124.aSignLink_2335.anApplet940, (byte) 65);
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return false;
    }
    
    public static boolean method955(int arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5) {
	if (arg1 == arg2 && arg3 == arg4) {
	    if (!Class13.method154(arg0, arg1, arg3))
		return false;
	    int i = arg1 << 7;
	    int i_5_ = arg3 << 7;
	    if (Class124.method1701(i + 1,
				    (Class136.anIntArrayArrayArray2496[arg0]
				     [arg1][arg3]) + arg5,
				    i_5_ + 1)
		&& Class124.method1701(i + 128 - 1,
				       (Class136.anIntArrayArrayArray2496[arg0]
					[arg1 + 1][arg3]) + arg5,
				       i_5_ + 1)
		&& Class124.method1701(i + 128 - 1,
				       (Class136.anIntArrayArrayArray2496[arg0]
					[arg1 + 1][arg3 + 1]) + arg5,
				       i_5_ + 128 - 1)
		&& Class124.method1701(i + 1,
				       (Class136.anIntArrayArrayArray2496[arg0]
					[arg1][arg3 + 1]) + arg5,
				       i_5_ + 128 - 1))
		return true;
	    return false;
	}
	for (int i = arg1; i <= arg2; i++) {
	    for (int i_6_ = arg3; i_6_ <= arg4; i_6_++) {
		if (Class126_Sub2.anIntArrayArrayArray3443[arg0][i][i_6_]
		    == -Class67_Sub1_Sub16.anInt4087)
		    return false;
	    }
	}
	int i = (arg1 << 7) + 1;
	int i_7_ = (arg3 << 7) + 2;
	int i_8_ = Class136.anIntArrayArrayArray2496[arg0][arg1][arg3] + arg5;
	if (!Class124.method1701(i, i_8_, i_7_))
	    return false;
	int i_9_ = (arg2 << 7) - 1;
	if (!Class124.method1701(i_9_, i_8_, i_7_))
	    return false;
	int i_10_ = (arg4 << 7) - 1;
	if (!Class124.method1701(i, i_8_, i_10_))
	    return false;
	if (!Class124.method1701(i_9_, i_8_, i_10_))
	    return false;
	return true;
    }
    
    static {
	anInt4695 = 0;
	anIntArrayArray4694 = new int[104][104];
	aRSString_4705 = Class134.method1914("Please remove ", (byte) 10);
	aRSString_4702 = aRSString_4705;
	aRSString_4687 = aRSString_4705;
    }
}
