/* Class67_Sub1_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.KeyEvent;

public class Class67_Sub1_Sub25 extends Class67_Sub1
{
    public static int anInt4216;
    public static int anInt4217;
    public static volatile int anInt4218 = -1;
    public int anInt4219 = 4096;
    public static int anInt4220;
    public static int anInt4221;
    public static int anInt4222;
    public static int[] anIntArray4223 = new int[100];
    public static Class136 aClass136_4224 = new Class136(64);
    public static RSString aRSString_4225
	= Class134.method1914("Bitte warten Sie)3)3)3", (byte) 40);
    public static Class136 aClass136_4226;
    public static RSString aRSString_4227
	= Class134.method1914("blanc:", (byte) 50);
    
    public int[] method611(int arg0, byte arg1) {
	anInt4216++;
	if (arg1 != 55)
	    return null;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_0_
		= this.method613(0, Class67_Sub1_Sub36.anInt4381 & -1 + arg0,
				 false);
	    int[] is_1_ = this.method613(0, arg0, false);
	    int[] is_2_
		= this.method613(0, Class67_Sub1_Sub36.anInt4381 & 1 + arg0,
				 false);
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		int i_3_ = ((is_1_[Class76.anInt1581 & i - -1]
			     + -is_1_[Class76.anInt1581 & -1 + i])
			    * anInt4219);
		int i_4_ = (is_2_[i] - is_0_[i]) * anInt4219;
		int i_5_ = i_3_ >> -1381945492;
		int i_6_ = i_4_ >> 414616204;
		int i_7_ = i_5_ * i_5_ >> 1739156716;
		int i_8_ = i_6_ * i_6_ >> -837632916;
		int i_9_
		    = (int) (Math.sqrt((double) ((float) (4096 + i_7_ + i_8_)
						 / 4096.0F))
			     * 4096.0);
		int i_10_ = i_9_ == 0 ? 0 : 16777216 / i_9_;
		is[i] = 4096 + -i_10_;
	    }
	}
	return is;
    }
    
    public static RSString method736(int arg0, int arg1, int arg2) {
	if (arg2 != 4162)
	    method738(true);
	anInt4217++;
	int i = arg0 + -arg1;
	if ((i ^ 0xffffffff) > 8)
	    return Class81.aRSString_1647;
	if (i < -6)
	    return Class67_Sub1_Sub11.aRSString_3986;
	if ((i ^ 0xffffffff) > 2)
	    return Class82.aRSString_1665;
	if (i < 0)
	    return Class143.aRSString_2580;
	if ((i ^ 0xffffffff) < -10)
	    return Class67_Sub1_Sub18.aRSString_4108;
	if (i > 6)
	    return Class50.aRSString_1017;
	if ((i ^ 0xffffffff) < -4)
	    return Class123.aRSString_2322;
	if (i > 0)
	    return Class120.aRSString_2273;
	return Class67_Sub5_Sub14.aRSString_4737;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    if ((arg2 ^ 0xffffffff) == -1)
		anInt4219 = arg0.readUShort(-2386);
	    anInt4222++;
	}
    }
    
    public static int method737(KeyEvent arg0, int arg1) {
	anInt4220++;
	int i = arg0.getKeyChar();
	if (arg1 != -25442)
	    anIntArray4223 = null;
	if (i == 8364)
	    return 128;
	if (i <= 0 || (i ^ 0xffffffff) <= -257)
	    i = -1;
	return i;
    }
    
    public static void method738(boolean arg0) {
	aClass136_4226 = null;
	aClass136_4224 = null;
	if (arg0 != true)
	    aRSString_4225 = null;
	aRSString_4227 = null;
	aRSString_4225 = null;
	anIntArray4223 = null;
    }
    
    public static void method739(int arg0) {
	Class30.aClass50_692 = new Class50();
	if (arg0 <= 46)
	    method738(false);
	anInt4221++;
    }
    
    public Class67_Sub1_Sub25() {
	super(1, true);
    }
    
    static {
	aClass136_4226 = new Class136(64);
    }
}
