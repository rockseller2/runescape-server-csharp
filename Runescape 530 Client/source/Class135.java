public class Class135
{
    public int anInt2477;
    public Class48[] aClass48Array2478;
    public int anInt2479;
    
    public int method1915() {
	int i = 9999999;
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    if (aClass48Array2478[i_0_] != null
		&& aClass48Array2478[i_0_].anInt986 / 20 < i)
		i = aClass48Array2478[i_0_].anInt986 / 20;
	}
	if (anInt2477 < anInt2479 && anInt2477 / 20 < i)
	    i = anInt2477 / 20;
	if (i == 9999999 || i == 0)
	    return 0;
	for (int i_1_ = 0; i_1_ < 10; i_1_++) {
	    if (aClass48Array2478[i_1_] != null)
		aClass48Array2478[i_1_].anInt986 -= i * 20;
	}
	if (anInt2477 < anInt2479) {
	    anInt2477 -= i * 20;
	    anInt2479 -= i * 20;
	}
	return i;
    }
    
    public Class67_Sub13_Sub1 method1916() {
	byte[] is = method1917();
	return new Class67_Sub13_Sub1(22050, is, 22050 * anInt2477 / 1000,
				      22050 * anInt2479 / 1000);
    }
    
    public byte[] method1917() {
	int i = 0;
	for (int i_2_ = 0; i_2_ < 10; i_2_++) {
	    if (aClass48Array2478[i_2_] != null
		&& (aClass48Array2478[i_2_].anInt980
		    + aClass48Array2478[i_2_].anInt986) > i)
		i = (aClass48Array2478[i_2_].anInt980
		     + aClass48Array2478[i_2_].anInt986);
	}
	if (i == 0)
	    return new byte[0];
	int i_3_ = 22050 * i / 1000;
	byte[] is = new byte[i_3_];
	for (int i_4_ = 0; i_4_ < 10; i_4_++) {
	    if (aClass48Array2478[i_4_] != null) {
		int i_5_ = aClass48Array2478[i_4_].anInt980 * 22050 / 1000;
		int i_6_ = aClass48Array2478[i_4_].anInt986 * 22050 / 1000;
		int[] is_7_
		    = aClass48Array2478[i_4_]
			  .method422(i_5_, aClass48Array2478[i_4_].anInt980);
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
		    int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
		    if ((i_9_ + 128 & ~0xff) != 0)
			i_9_ = i_9_ >> 31 ^ 0x7f;
		    is[i_8_ + i_6_] = (byte) i_9_;
		}
	    }
	}
	return is;
    }
    
    public Class135(Stream arg0) {
	aClass48Array2478 = new Class48[10];
	for (int i = 0; i < 10; i++) {
	    int i_10_ = arg0.readByte((byte) -31);
	    if (i_10_ != 0) {
		arg0.currentOffset--;
		aClass48Array2478[i] = new Class48();
		aClass48Array2478[i].method423(arg0);
	    }
	}
	anInt2477 = arg0.readUShort(-2386);
	anInt2479 = arg0.readUShort(-2386);
    }
    
    public Class135() {
	aClass48Array2478 = new Class48[10];
    }
    
    public static Class135 method1918(Class9 arg0, int arg1, int arg2) {
	byte[] is = arg0.method138(-809612665, arg2, arg1);
	if (is == null)
	    return null;
	return new Class135(new Stream(is));
    }
}
