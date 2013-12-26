/* Class67_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub4 extends Class67_Sub1
{
    public static int anInt3851;
    public static RSString aRSString_3852 = Class134.method1914("", (byte) 11);
    public static int anInt3853;
    public int anInt3854;
    public static int anInt3855;
    public static int anInt3856;
    public int anInt3857 = 1365;
    public static RSString aRSString_3858
	= Class134.method1914("Checking for updates )2 ", (byte) 79);
    public int anInt3859;
    public static int anInt3860;
    public int anInt3861;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_3862;
    public static int anInt3863;
    public static RSString aRSString_3864 = aRSString_3858;
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    method611(18, (byte) -107);
	int i = arg2;
    while_27_:
	do {
	while_26_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if (i != 2) {
				if ((i ^ 0xffffffff) != -4)
				    break while_27_;
			    } else
				break;
			    break while_26_;
			}
		    } else {
			anInt3857 = arg0.readUShort(-2386);
			break while_27_;
		    }
		    anInt3859 = arg0.readUShort(-2386);
		    break while_27_;
		} while (false);
		anInt3854 = arg0.readUShort(-2386);
		break while_27_;
	    } while (false);
	    anInt3861 = arg0.readUShort(-2386);
	} while (false);
	anInt3853++;
    }
    
    public Class67_Sub1_Sub4() {
	super(0, true);
	anInt3854 = 0;
	anInt3861 = 0;
	anInt3859 = 20;
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    anInt3857 = -107;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
		int i_0_ = ((Class67_Sub1_Sub35.anIntArray4344[i]
			     << -1079994708) / anInt3857
			    + anInt3854);
		int i_1_
		    = ((Class19.anIntArray490[arg0] << -1098754932) / anInt3857
		       - -anInt3861);
		int i_2_ = i_0_;
		int i_3_ = i_1_;
		int i_4_ = i_1_;
		int i_5_ = i_0_;
		int i_6_ = i_0_ * i_0_ >> 344002220;
		int i_7_ = i_1_ * i_1_ >> -453576564;
		int i_8_;
		for (i_8_ = 0; i_7_ + i_6_ < 16384 && i_8_ < anInt3859;
		     i_6_ = i_5_ * i_5_ >> -1688537044) {
		    i_4_ = i_3_ + (i_4_ * i_5_ >> 1479411692) * 2;
		    i_5_ = i_2_ + i_6_ + -i_7_;
		    i_8_++;
		    i_7_ = i_4_ * i_4_ >> 1214129196;
		}
		is[i] = (i_8_ < -1 + anInt3859
			 ? (i_8_ << -774289044) / anInt3859 : 0);
	    }
	}
	anInt3856++;
	return is;
    }
    
    public static void method637(int arg0) {
	if (arg0 != -10744)
	    aRSString_3858 = null;
	aRSString_3858 = null;
	aRSString_3864 = null;
	aRSString_3852 = null;
	aClass67_Sub5_Sub19_3862 = null;
    }
    
    public static void method638(int arg0, boolean arg1) {
	anInt3851++;
	if (arg1 != false)
	    method638(-120, false);
	if (Class67_Sub1_Sub35.anIntArray4348 == null
	    || Class67_Sub1_Sub35.anIntArray4348.length < arg0)
	    Class67_Sub1_Sub35.anIntArray4348 = new int[arg0];
    }
    
    static {
	anInt3863 = 0;
	anInt3855 = 0;
    }
}
