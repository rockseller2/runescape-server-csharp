import java.awt.Font;

public class Class143
{
    public static RSString aRSString_2577;
    public static int anInt2578;
    public static RSString aRSString_2579
	= Class134.method1914("::fpsoff", (byte) 71);
    public static RSString aRSString_2580;
    public Class131 aClass131_2581;
    public static Font aFont2582;
    public static Class67_Sub5_Sub10 aClass67_Sub5_Sub10_2583;
    public static RSString aRSString_2584;
    
    public static void method1959(byte arg0) {
	if (arg0 != 9)
	    aRSString_2577 = null;
	aRSString_2577 = null;
	aRSString_2579 = null;
	aRSString_2580 = null;
	aRSString_2584 = null;
	aClass67_Sub5_Sub10_2583 = null;
	aFont2582 = null;
    }
    
    public static void method1960(boolean arg0, int arg1) {
	anInt2578++;
	int i = 4;
	byte[][] is = Class67_Sub5_Sub11.aByteArrayArray4675;
	if (arg1 >= 94) {
	    for (int i_0_ = 0; (i ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
		 i_0_++) {
		Class132.method1901(64);
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -14; i_1_++) {
		    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -14; i_2_++) {
			boolean bool = false;
			int i_3_
			    = Class5.anIntArrayArrayArray136[i_0_][i_1_][i_2_];
			if ((i_3_ ^ 0xffffffff) != 0) {
			    int i_4_ = (0x37bafb7 & i_3_) >> 1475047384;
			    if (!arg0 || (i_4_ ^ 0xffffffff) == -1) {
				int i_5_ = (i_3_ & 0x6) >> 582702209;
				int i_6_ = (i_3_ & 0x3ffd) >> 1909585603;
				int i_7_ = i_3_ >> -1440284338 & 0x3ff;
				int i_8_ = i_6_ / 8 + (i_7_ / 8 << -337325848);
				for (int i_9_ = 0;
				     ((Class108.anIntArray2083.length
				       ^ 0xffffffff)
				      < (i_9_ ^ 0xffffffff));
				     i_9_++) {
				    if ((Class108.anIntArray2083[i_9_]
					 ^ 0xffffffff) == (i_8_ ^ 0xffffffff)
					&& is[i_9_] != null) {
					bool = true;
					Class67_Sub16.method1243
					    (i_1_ * 8, 8 * (0x7 & i_6_),
					     8 * i_2_, i_0_, is[i_9_], i_5_,
					     Class53.aClass73Array1059, i_4_,
					     73, arg0, 8 * (i_7_ & 0x7));
					break;
				    }
				}
			    }
			}
			if (!bool)
			    Class131_Sub7_Sub1.method1889(8 * i_1_, 8,
							  i_2_ * 8, (byte) 123,
							  8, i_0_);
		    }
		}
	    }
	}
    }
    
    static {
	aRSString_2577 = Class134.method1914("::gc", (byte) 80);
	aRSString_2580 = Class134.method1914("<col=ffb000>", (byte) 92);
	aRSString_2584 = Class134.method1914("::tween", (byte) 110);
    }
}
