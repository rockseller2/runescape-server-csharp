/* Class67_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub5 extends Class67_Sub1
{
    public static RSString aRSString_3865
	= Class134.method1914(" )2> ", (byte) 79);
    public static int anInt3866;
    public static int anInt3867;
    public int anInt3868;
    public int anInt3869 = -1;
    public static int anInt3870;
    public int[] anIntArray3871;
    public static RSString aRSString_3872;
    public static int anInt3873;
    public static int anInt3874;
    public static int anInt3875;
    public static int anInt3876 = 0;
    public int anInt3877;
    public static Class7[][] aClass7ArrayArray3878;
    public static int anInt3879;
    public static int anInt3880;
    public static Class9 aClass9_3881;
    public static int anInt3882;
    
    public Class67_Sub1_Sub5() {
	super(0, false);
    }
    
    public void method617(byte arg0) {
	int i = -99 % ((-21 - arg0) / 49);
	anInt3873++;
	super.method617((byte) 49);
	anIntArray3871 = null;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    method617((byte) 82);
	anInt3882++;
	int[][] is = aClass103_2830.method1551(arg1, 82);
	if (aClass103_2830.aBoolean2030 && method640(-118)) {
	    int[] is_0_ = is[0];
	    int i = ((((RuntimeException_Sub1.anInt2618 ^ 0xffffffff)
		       == (anInt3877 ^ 0xffffffff))
		      ? arg1
		      : arg1 * anInt3877 / RuntimeException_Sub1.anInt2618)
		     * anInt3868);
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[2];
	    if (anInt3868 != Class67_Sub5_Sub7.anInt4569) {
		for (int i_3_ = 0; i_3_ < Class67_Sub5_Sub7.anInt4569;
		     i_3_++) {
		    int i_4_ = i_3_ * anInt3868 / Class67_Sub5_Sub7.anInt4569;
		    int i_5_ = anIntArray3871[i_4_ + i];
		    is_2_[i_3_]
			= Class75.method1379(i_5_ << -1193983964, 4080);
		    is_1_[i_3_]
			= Class75.method1379(i_5_, 65280) >> -1937715900;
		    is_0_[i_3_]
			= Class75.method1379(i_5_ >> -2125483316, 4080);
		}
	    } else {
		for (int i_6_ = 0; Class67_Sub5_Sub7.anInt4569 > i_6_;
		     i_6_++) {
		    int i_7_ = anIntArray3871[i++];
		    is_2_[i_6_] = Class75.method1379(i_7_ << 1014611876, 4080);
		    is_1_[i_6_] = Class75.method1379(i_7_, 65280) >> -94417916;
		    is_0_[i_6_]
			= Class75.method1379(i_7_, 16711680) >> -926892660;
		}
	    }
	}
	return is;
    }
    
    public int method610(int arg0) {
	if (arg0 != -1)
	    return 11;
	anInt3879++;
	return anInt3869;
    }
    
    public static void method639(int arg0) {
	aClass9_3881 = null;
	if (arg0 != -1)
	    method639(-12);
	aRSString_3872 = null;
	aRSString_3865 = null;
	aClass7ArrayArray3878 = null;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    method624(false, -59);
	if ((arg2 ^ 0xffffffff) == -1)
	    anInt3869 = arg0.readUShort(-2386);
	anInt3874++;
    }
    
    public boolean method640(int arg0) {
	anInt3867++;
	if (anIntArray3871 != null)
	    return true;
	if ((anInt3869 ^ 0xffffffff) <= -1) {
	    int i = Class67_Sub5_Sub7.anInt4569;
	    int i_8_ = RuntimeException_Sub1.anInt2618;
	    int i_9_
		= (Class67_Sub1_Sub8.anInterface3_3916.method7(anInt3869, 0)
		   ? 64 : 128);
	    anIntArray3871
		= Class67_Sub1_Sub8.anInterface3_3916.method9(117, anInt3869);
	    anInt3868 = i_9_;
	    anInt3877 = i_9_;
	    Class67_Sub1_Sub37.method790(103, i, i_8_);
	    if (anIntArray3871 == null)
		return false;
	    return true;
	}
	if (arg0 > -107)
	    return false;
	return false;
    }
    
    public static void method641(int arg0, int arg1, Class7[] arg2) {
	anInt3866++;
	if (arg1 != -1970)
	    aClass9_3881 = null;
	for (int i = 0; (arg2.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    Class7 class7 = arg2[i];
	    if (class7 != null && class7.anInt174 == arg0
		&& (!class7.aBoolean185 || !client.method33(class7))) {
		if (class7.anInt227 == 0) {
		    if (!class7.aBoolean185 && client.method33(class7)
			&& Class30.aClass7_698 != class7)
			continue;
		    method641(class7.anInt301, -1970, arg2);
		    if (class7.aClass7Array228 != null)
			method641(class7.anInt301, -1970,
				  class7.aClass7Array228);
		    Class67_Sub22 class67_sub22
			= ((Class67_Sub22)
			   (Class67_Sub1_Sub33.aClass92_4325.method1489
			    ((byte) -105, (long) class7.anInt301)));
		    if (class67_sub22 != null)
			RuntimeException_Sub1
			    .method1972(arg1 + 1974, class67_sub22.anInt3185);
		}
		if (class7.anInt227 == 6) {
		    if ((class7.anInt274 ^ 0xffffffff) != 0
			|| class7.anInt333 != -1) {
			boolean bool = Class33.method291(class7, (byte) -74);
			int i_10_;
			if (!bool)
			    i_10_ = class7.anInt274;
			else
			    i_10_ = class7.anInt333;
			if ((i_10_ ^ 0xffffffff) != 0) {
			    Class41 class41
				= Class120.method1666(i_10_, arg1 ^ 0x7ae);
			    if (class41 != null) {
				class7.anInt298 += RSString.anInt2642;
				while (class41.anIntArray880[class7.anInt257]
				       < class7.anInt298) {
				    class7.anInt298 -= (class41.anIntArray880
							[class7.anInt257]);
				    class7.anInt257++;
				    if (class7.anInt257
					>= class41.anIntArray855.length) {
					class7.anInt257 -= class41.anInt881;
					if ((class7.anInt257 ^ 0xffffffff) > -1
					    || (class41.anIntArray855.length
						<= class7.anInt257))
					    class7.anInt257 = 0;
				    }
				    class7.anInt203 = class7.anInt257 + 1;
				    if ((class7.anInt203 ^ 0xffffffff)
					<= (class41.anIntArray855.length
					    ^ 0xffffffff)) {
					class7.anInt203 -= class41.anInt881;
					if (class7.anInt203 < 0
					    || ((class41.anIntArray855.length
						 ^ 0xffffffff)
						>= (class7.anInt203
						    ^ 0xffffffff)))
					    class7.anInt203 = -1;
				    }
				    Class37.method326(class7, 106);
				}
			    }
			}
		    }
		    if ((class7.anInt202 ^ 0xffffffff) != -1
			&& !class7.aBoolean185) {
			int i_11_ = class7.anInt202 >> 302635792;
			int i_12_
			    = class7.anInt202 << -1977172336 >> 649376624;
			i_12_ *= RSString.anInt2642;
			i_11_ *= RSString.anInt2642;
			class7.anInt330 = i_11_ + class7.anInt330 & 0x7ff;
			class7.anInt164 = i_12_ + class7.anInt164 & 0x7ff;
			Class37.method326(class7, 96);
		    }
		}
	    }
	}
    }
    
    static {
	anInt3875 = 0;
	aRSString_3872 = Class134.method1914("headicons_pk", (byte) 39);
	anInt3880 = -1;
    }
}
