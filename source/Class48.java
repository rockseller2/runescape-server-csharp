/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class48
{
    public Class35 aClass35_974;
    public Class127 aClass127_975;
    public int[] anIntArray976;
    public Class35 aClass35_977;
    public int anInt978 = 0;
    public static int[] anIntArray979;
    public int anInt980;
    public Class35 aClass35_981;
    public int anInt982;
    public Class35 aClass35_983;
    public static int[] anIntArray984 = new int[32768];
    public Class35 aClass35_985;
    public int anInt986;
    public Class35 aClass35_987;
    public Class35 aClass35_988;
    public int[] anIntArray989;
    public int[] anIntArray990;
    public Class35 aClass35_991;
    public Class35 aClass35_992;
    public static int[] anIntArray993;
    public static int[] anIntArray994;
    public static int[] anIntArray995;
    public static int[] anIntArray996;
    public static int[] anIntArray997;
    public static int[] anIntArray998;
    
    public static void method420() {
	anIntArray993 = null;
	anIntArray984 = null;
	anIntArray979 = null;
	anIntArray995 = null;
	anIntArray996 = null;
	anIntArray998 = null;
	anIntArray994 = null;
	anIntArray997 = null;
    }
    
    public int method421(int arg0, int arg1, int arg2) {
	if (arg2 == 1) {
	    if ((arg0 & 0x7fff) < 16384)
		return arg1;
	    return -arg1;
	}
	if (arg2 == 2)
	    return anIntArray979[arg0 & 0x7fff] * arg1 >> 14;
	if (arg2 == 3)
	    return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
	if (arg2 == 4)
	    return anIntArray984[arg0 / 2607 & 0x7fff] * arg1;
	return 0;
    }
    
    public int[] method422(int arg0, int arg1) {
	Class17.method180(anIntArray993, 0, arg0);
	if (arg1 < 10)
	    return anIntArray993;
	double d = (double) arg0 / ((double) arg1 + 0.0);
	aClass35_981.method310();
	aClass35_992.method310();
	int i = 0;
	int i_0_ = 0;
	int i_1_ = 0;
	if (aClass35_991 != null) {
	    aClass35_991.method310();
	    aClass35_985.method310();
	    i = (int) ((double) (aClass35_991.anInt756 - aClass35_991.anInt754)
		       * 32.768 / d);
	    i_0_ = (int) ((double) aClass35_991.anInt754 * 32.768 / d);
	}
	int i_2_ = 0;
	int i_3_ = 0;
	int i_4_ = 0;
	if (aClass35_988 != null) {
	    aClass35_988.method310();
	    aClass35_977.method310();
	    i_2_ = (int) ((double) (aClass35_988.anInt756
				    - aClass35_988.anInt754)
			  * 32.768 / d);
	    i_3_ = (int) ((double) aClass35_988.anInt754 * 32.768 / d);
	}
	for (int i_5_ = 0; i_5_ < 5; i_5_++) {
	    if (anIntArray976[i_5_] != 0) {
		anIntArray995[i_5_] = 0;
		anIntArray996[i_5_] = (int) ((double) anIntArray989[i_5_] * d);
		anIntArray998[i_5_] = (anIntArray976[i_5_] << 14) / 100;
		anIntArray994[i_5_]
		    = (int) ((double) (aClass35_981.anInt756
				       - aClass35_981.anInt754)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) anIntArray990[i_5_])
			     / d);
		anIntArray997[i_5_]
		    = (int) ((double) aClass35_981.anInt754 * 32.768 / d);
	    }
	}
	for (int i_6_ = 0; i_6_ < arg0; i_6_++) {
	    int i_7_ = aClass35_981.method313(arg0);
	    int i_8_ = aClass35_992.method313(arg0);
	    if (aClass35_991 != null) {
		int i_9_ = aClass35_991.method313(arg0);
		int i_10_ = aClass35_985.method313(arg0);
		i_7_ += method421(i_1_, i_10_, aClass35_991.anInt755) >> 1;
		i_1_ += (i_9_ * i >> 16) + i_0_;
	    }
	    if (aClass35_988 != null) {
		int i_11_ = aClass35_988.method313(arg0);
		int i_12_ = aClass35_977.method313(arg0);
		i_8_ = i_8_ * ((method421(i_4_, i_12_, aClass35_988.anInt755)
				>> 1)
			       + 32768) >> 15;
		i_4_ += (i_11_ * i_2_ >> 16) + i_3_;
	    }
	    for (int i_13_ = 0; i_13_ < 5; i_13_++) {
		if (anIntArray976[i_13_] != 0) {
		    int i_14_ = i_6_ + anIntArray996[i_13_];
		    if (i_14_ < arg0) {
			anIntArray993[i_14_]
			    += method421(anIntArray995[i_13_],
					 i_8_ * anIntArray998[i_13_] >> 15,
					 aClass35_981.anInt755);
			anIntArray995[i_13_] += (i_7_ * anIntArray994[i_13_]
						 >> 16) + anIntArray997[i_13_];
		    }
		}
	    }
	}
	if (aClass35_983 != null) {
	    aClass35_983.method310();
	    aClass35_974.method310();
	    int i_15_ = 0;
	    boolean bool = false;
	    boolean bool_16_ = true;
	    for (int i_17_ = 0; i_17_ < arg0; i_17_++) {
		int i_18_ = aClass35_983.method313(arg0);
		int i_19_ = aClass35_974.method313(arg0);
		int i_20_;
		if (bool_16_)
		    i_20_ = aClass35_983.anInt754 + (((aClass35_983.anInt756
						       - aClass35_983.anInt754)
						      * i_18_)
						     >> 8);
		else
		    i_20_ = aClass35_983.anInt754 + (((aClass35_983.anInt756
						       - aClass35_983.anInt754)
						      * i_19_)
						     >> 8);
		i_15_ += 256;
		if (i_15_ >= i_20_) {
		    i_15_ = 0;
		    bool_16_ = !bool_16_;
		}
		if (bool_16_)
		    anIntArray993[i_17_] = 0;
	    }
	}
	if (anInt978 > 0 && anInt982 > 0) {
	    int i_21_ = (int) ((double) anInt978 * d);
	    for (int i_22_ = i_21_; i_22_ < arg0; i_22_++)
		anIntArray993[i_22_]
		    += anIntArray993[i_22_ - i_21_] * anInt982 / 100;
	}
	if (aClass127_975.anIntArray2374[0] > 0
	    || aClass127_975.anIntArray2374[1] > 0) {
	    aClass35_987.method310();
	    int i_23_ = aClass35_987.method313(arg0 + 1);
	    int i_24_ = aClass127_975.method1725(0, (float) i_23_ / 65536.0F);
	    int i_25_ = aClass127_975.method1725(1, (float) i_23_ / 65536.0F);
	    if (arg0 >= i_24_ + i_25_) {
		int i_26_ = 0;
		int i_27_ = i_25_;
		if (i_27_ > arg0 - i_24_)
		    i_27_ = arg0 - i_24_;
		for (/**/; i_26_ < i_27_; i_26_++) {
		    int i_28_ = (int) (((long) anIntArray993[i_26_ + i_24_]
					* (long) Class127.anInt2368)
				       >> 16);
		    for (int i_29_ = 0; i_29_ < i_24_; i_29_++)
			i_28_ += (int) (((long) (anIntArray993
						 [i_26_ + i_24_ - 1 - i_29_])
					 * (long) (Class127.anIntArrayArray2367
						   [0][i_29_]))
					>> 16);
		    for (int i_30_ = 0; i_30_ < i_26_; i_30_++)
			i_28_
			    -= (int) (((long) anIntArray993[i_26_ - 1 - i_30_]
				       * (long) (Class127.anIntArrayArray2367
						 [1][i_30_]))
				      >> 16);
		    anIntArray993[i_26_] = i_28_;
		    i_23_ = aClass35_987.method313(arg0 + 1);
		}
		i_27_ = 128;
		for (;;) {
		    if (i_27_ > arg0 - i_24_)
			i_27_ = arg0 - i_24_;
		    for (/**/; i_26_ < i_27_; i_26_++) {
			int i_31_ = (int) (((long) anIntArray993[i_26_ + i_24_]
					    * (long) Class127.anInt2368)
					   >> 16);
			for (int i_32_ = 0; i_32_ < i_24_; i_32_++)
			    i_31_
				+= (int) (((long) (anIntArray993
						   [i_26_ + i_24_ - 1 - i_32_])
					   * (long) (Class127
						     .anIntArrayArray2367[0]
						     [i_32_]))
					  >> 16);
			for (int i_33_ = 0; i_33_ < i_25_; i_33_++)
			    i_31_ -= (int) (((long) (anIntArray993
						     [i_26_ - 1 - i_33_])
					     * (long) (Class127
						       .anIntArrayArray2367[1]
						       [i_33_]))
					    >> 16);
			anIntArray993[i_26_] = i_31_;
			i_23_ = aClass35_987.method313(arg0 + 1);
		    }
		    if (i_26_ >= arg0 - i_24_)
			break;
		    i_24_ = aClass127_975.method1725(0,
						     (float) i_23_ / 65536.0F);
		    i_25_ = aClass127_975.method1725(1,
						     (float) i_23_ / 65536.0F);
		    i_27_ += 128;
		}
		for (/**/; i_26_ < arg0; i_26_++) {
		    int i_34_ = 0;
		    for (int i_35_ = i_26_ + i_24_ - arg0; i_35_ < i_24_;
			 i_35_++)
			i_34_ += (int) (((long) (anIntArray993
						 [i_26_ + i_24_ - 1 - i_35_])
					 * (long) (Class127.anIntArrayArray2367
						   [0][i_35_]))
					>> 16);
		    for (int i_36_ = 0; i_36_ < i_25_; i_36_++)
			i_34_
			    -= (int) (((long) anIntArray993[i_26_ - 1 - i_36_]
				       * (long) (Class127.anIntArrayArray2367
						 [1][i_36_]))
				      >> 16);
		    anIntArray993[i_26_] = i_34_;
		    i_23_ = aClass35_987.method313(arg0 + 1);
		}
	    }
	}
	for (int i_37_ = 0; i_37_ < arg0; i_37_++) {
	    if (anIntArray993[i_37_] < -32768)
		anIntArray993[i_37_] = -32768;
	    if (anIntArray993[i_37_] > 32767)
		anIntArray993[i_37_] = 32767;
	}
	return anIntArray993;
    }
    
    public void method423(Stream arg0) {
	aClass35_981 = new Class35();
	aClass35_981.method311(arg0);
	aClass35_992 = new Class35();
	aClass35_992.method311(arg0);
	int i = arg0.readByte((byte) 111);
	if (i != 0) {
	    arg0.currentOffset--;
	    aClass35_991 = new Class35();
	    aClass35_991.method311(arg0);
	    aClass35_985 = new Class35();
	    aClass35_985.method311(arg0);
	}
	i = arg0.readByte((byte) -14);
	if (i != 0) {
	    arg0.currentOffset--;
	    aClass35_988 = new Class35();
	    aClass35_988.method311(arg0);
	    aClass35_977 = new Class35();
	    aClass35_977.method311(arg0);
	}
	i = arg0.readByte((byte) 103);
	if (i != 0) {
	    arg0.currentOffset--;
	    aClass35_983 = new Class35();
	    aClass35_983.method311(arg0);
	    aClass35_974 = new Class35();
	    aClass35_974.method311(arg0);
	}
	for (int i_38_ = 0; i_38_ < 10; i_38_++) {
	    int i_39_ = arg0.method1070(-96);
	    if (i_39_ == 0)
		break;
	    anIntArray976[i_38_] = i_39_;
	    anIntArray990[i_38_] = arg0.method1044(-15839);
	    anIntArray989[i_38_] = arg0.method1070(-83);
	}
	anInt978 = arg0.method1070(-92);
	anInt982 = arg0.method1070(-70);
	anInt980 = arg0.readUShort(-2386);
	anInt986 = arg0.readUShort(-2386);
	aClass127_975 = new Class127();
	aClass35_987 = new Class35();
	aClass127_975.method1726(arg0, aClass35_987);
    }
    
    public Class48() {
	anIntArray976 = new int[5];
	anInt980 = 500;
	anInt982 = 100;
	anIntArray989 = new int[5];
	anInt986 = 0;
	anIntArray990 = new int[5];
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    anIntArray984[i] = (random.nextInt() & 0x2) - 1;
	anIntArray979 = new int[32768];
	for (int i = 0; i < 32768; i++)
	    anIntArray979[i]
		= (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	anIntArray993 = new int[220500];
	anIntArray996 = new int[5];
	anIntArray994 = new int[5];
	anIntArray995 = new int[5];
	anIntArray997 = new int[5];
	anIntArray998 = new int[5];
    }
}
