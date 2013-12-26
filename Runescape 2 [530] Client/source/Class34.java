import java.awt.Component;

public class Class34
{
    public int anInt736;
    public static int anInt737;
    public static long aLong738;
    public static RSString aRSString_739 = Class134.method1914("logo", (byte) 2);
    public int anInt740;
    public static int anInt741;
    public int anInt742;
    public byte aByte743;
    public static RSString aRSString_744;
    public static RSString aRSString_745;
    public static int[] anIntArray746;
    public static int anInt747;
    public static int anInt748;
    public static int anInt749;
    public int anInt750;
    public static int anInt751;
    public static int anInt752;
    public int anInt753;
    
    public static RSString method303(byte[] arg0, int arg1, int arg2,
				    int arg3) {
	anInt737++;
	RSString RSString = new RSString();
	RSString.aByteArray2653 = new byte[arg2];
	RSString.anInt2629 = arg3;
	for (int i = arg1; arg1 + arg2 > i; i++) {
	    if (arg0[i] != 0)
		RSString.aByteArray2653[RSString.anInt2629++] = arg0[i];
	}
	return RSString;
    }
    
    public int method304(byte arg0) {
	anInt749++;
	if (arg0 >= -33)
	    method303(null, -107, -108, -128);
	return aByte743 & 0x7;
    }
    
    public static void method305(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	anInt741++;
	int i = arg0 - arg5;
	int i_0_ = -arg3 + arg4;
	if ((i ^ 0xffffffff) != -1) {
	    if (i_0_ == 0) {
		Class67_Sub26.method1300(arg1, (byte) 102, arg3, arg5, arg0);
		return;
	    }
	} else {
	    if ((i_0_ ^ 0xffffffff) != -1)
		Class67_Sub1_Sub33.method770(arg4, arg3, (byte) -95, arg1,
					     arg5);
	    return;
	}
	if (arg2 == -30374) {
	    int i_1_ = (i_0_ << -1104876692) / i;
	    int i_2_ = -(arg5 * i_1_ >> 779235564) + arg3;
	    int i_3_;
	    int i_4_;
	    if ((arg5 ^ 0xffffffff) > (Class139.anInt2533 ^ 0xffffffff)) {
		i_4_ = i_2_ + (Class139.anInt2533 * i_1_ >> -859053492);
		i_3_ = Class139.anInt2533;
	    } else if (Class126_Sub1.anInt3423 < arg5) {
		i_3_ = Class126_Sub1.anInt3423;
		i_4_ = i_2_ - -(i_1_ * Class126_Sub1.anInt3423 >> 2127649612);
	    } else {
		i_3_ = arg5;
		i_4_ = arg3;
	    }
	    int i_5_;
	    int i_6_;
	    if (Class139.anInt2533 <= arg0) {
		if ((Class126_Sub1.anInt3423 ^ 0xffffffff)
		    <= (arg0 ^ 0xffffffff)) {
		    i_6_ = arg0;
		    i_5_ = arg4;
		} else {
		    i_5_ = i_2_ - -(i_1_ * Class126_Sub1.anInt3423
				    >> 1374869996);
		    i_6_ = Class126_Sub1.anInt3423;
		}
	    } else {
		i_5_ = i_2_ + (i_1_ * Class139.anInt2533 >> -1449859636);
		i_6_ = Class139.anInt2533;
	    }
	    if (Class55_Sub2.anInt2801 <= i_4_) {
		if ((i_4_ ^ 0xffffffff)
		    < (OutputStream_Sub1.anInt87 ^ 0xffffffff)) {
		    i_3_ = ((-i_2_ + OutputStream_Sub1.anInt87 << 499348236)
			    / i_1_);
		    i_4_ = OutputStream_Sub1.anInt87;
		}
	    } else {
		i_3_ = (Class55_Sub2.anInt2801 - i_2_ << 887399276) / i_1_;
		i_4_ = Class55_Sub2.anInt2801;
	    }
	    if (i_5_ >= Class55_Sub2.anInt2801) {
		if ((OutputStream_Sub1.anInt87 ^ 0xffffffff)
		    > (i_5_ ^ 0xffffffff)) {
		    i_6_ = ((OutputStream_Sub1.anInt87 + -i_2_ << 1113595852)
			    / i_1_);
		    i_5_ = OutputStream_Sub1.anInt87;
		}
	    } else {
		i_6_ = (Class55_Sub2.anInt2801 + -i_2_ << -1873941716) / i_1_;
		i_5_ = Class55_Sub2.anInt2801;
	    }
	    Class1.method64(i_5_, (byte) 67, arg1, i_6_, i_4_, i_3_);
	}
    }
    
    public static void method306(boolean arg0) {
	anInt748++;
	Class6.method79(5, 0);
	Class22.method200(5, !arg0);
	Class3.method73(5, 0);
	Class67_Sub6.method1033(!arg0, 5);
	Class67_Sub28.method1306(5, arg0);
	Class3.method71(5, (byte) -98);
	Class67_Sub5_Sub14.method971(5, -29406);
	Class83.method1440(29469, 5);
	Class119.method1644((byte) -126, 5);
	Login.method1419((byte) -41, 5);
	Class67_Sub8.method1106(5, (byte) -124);
	Class67_Sub5_Sub9.method899(5, -47);
	Class67_Sub5_Sub14.method969(5, (byte) 127);
	Class67_Sub1_Sub36.method783(5, 4);
	Class23.method218(5, 0);
	Class91.method1476(50, -11770);
	Class86.method1458(5, (byte) 110);
	Class19.method188((byte) 112, 5);
	Class144.aClass136_2599.method1920(5, 79);
	Class44.aClass136_923.method1920(5, 87);
    }
    
    public static void method307(int arg0) {
	aRSString_744 = null;
	if (arg0 > -76)
	    anInt747 = 96;
	aRSString_739 = null;
	anIntArray746 = null;
	aRSString_745 = null;
    }
    
    public int method308(int arg0) {
	if (arg0 >= -112)
	    return 51;
	anInt752++;
	if ((0x8 & aByte743) == 8)
	    return 1;
	return 0;
    }
    
    public static void method309(int arg0, Component arg1) {
	arg1.removeKeyListener(Class81.aClass134_1648);
	arg1.removeFocusListener(Class81.aClass134_1648);
	Class47.anInt962 = arg0;
	anInt751++;
    }
    
    public Class34() {
	/* empty */
    }
    
    public Class34(Stream arg0) { //Grand Exchange updateGEProgress
	aByte743 = arg0.readByte2((byte) 1);
	anInt750 = arg0.readUShort(-2386); //offer.getDisplayItem()
	anInt740 = arg0.readInt((byte) 126); //offer.getPriceEach()
	anInt742 = arg0.readInt((byte) 125); //offer.getTotalAmount()
	anInt753 = arg0.readInt((byte) 127); //offer.getAmountTraded()
	anInt736 = arg0.readInt((byte) 126); //offer.getTotalAmount()
    }
    
    static {
	aLong738 = 0L;
	aRSString_745 = Class134.method1914("Continue", (byte) 38);
	aRSString_744 = aRSString_745;
    }
}
