/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class42
{
    public static byte[] aByteArray888
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public Stream aStream_889;
    public int[] anIntArray890;
    public int anInt891;
    public int[] anIntArray892;
    public int[] anIntArray893;
    public int anInt894;
    public int[] anIntArray895;
    public long aLong896;
    
    public long method363(int arg0) {
	return aLong896 + (long) arg0 * (long) anInt891;
    }
    
    public void method364() {
	aStream_889.currentOffset = -1;
    }
    
    public void method365() {
	aStream_889.buffer = null;
	anIntArray890 = null;
	anIntArray892 = null;
	anIntArray893 = null;
	anIntArray895 = null;
    }
    
    public static void method366() {
	aByteArray888 = null;
    }
    
    public int method367(int arg0, int arg1) {
	if (arg1 == 255) {
	    int i = aStream_889.readByte((byte) -97);
	    int i_0_ = aStream_889.method1061((byte) -29);
	    if (i == 47) {
		aStream_889.currentOffset += i_0_;
		return 1;
	    }
	    if (i == 81) {
		int i_1_ = aStream_889.readThreeBytes(65280);
		i_0_ -= 3;
		int i_2_ = anIntArray893[arg0];
		aLong896 += (long) i_2_ * (long) (anInt891 - i_1_);
		anInt891 = i_1_;
		aStream_889.currentOffset += i_0_;
		return 2;
	    }
	    aStream_889.currentOffset += i_0_;
	    return 3;
	}
	byte i = aByteArray888[arg1 - 128];
	int i_3_ = arg1;
	if (i >= 1)
	    i_3_ |= aStream_889.readByte((byte) -94) << 8;
	if (i >= 2)
	    i_3_ |= aStream_889.readByte((byte) 83) << 16;
	return i_3_;
    }
    
    public void method368(int arg0) {
	int i = aStream_889.method1061((byte) -29);
	anIntArray893[arg0] += i;
    }
    
    public int method369() {
	return anIntArray892.length;
    }
    
    public boolean method370() {
	int i = anIntArray892.length;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    if (anIntArray892[i_4_] >= 0)
		return false;
	}
	return true;
    }
    
    public boolean method371() {
	if (aStream_889.buffer == null)
	    return false;
	return true;
    }
    
    public void method372(int arg0) {
	anIntArray892[arg0] = aStream_889.currentOffset;
    }
    
    public int method373(int arg0) {
	int i = aStream_889.buffer[aStream_889.currentOffset];
	if (i < 0) {
	    i &= 0xff;
	    anIntArray895[arg0] = i;
	    aStream_889.currentOffset++;
	} else
	    i = anIntArray895[arg0];
	if (i == 240 || i == 247) {
	    int i_5_ = aStream_889.method1061((byte) -29);
	    if (i == 247 && i_5_ > 0) {
		int i_6_ = ((aStream_889.buffer
			     [aStream_889.currentOffset])
			    & 0xff);
		if (i_6_ >= 241 && i_6_ <= 243 || i_6_ == 246 || i_6_ == 248
		    || i_6_ >= 250 && i_6_ <= 252 || i_6_ == 254) {
		    aStream_889.currentOffset++;
		    anIntArray895[arg0] = i_6_;
		    return method367(arg0, i_6_);
		}
	    }
	    aStream_889.currentOffset += i_5_;
	    return 0;
	}
	return method367(arg0, i);
    }
    
    public void method374(byte[] arg0) {
	aStream_889.buffer = arg0;
	aStream_889.currentOffset = 10;
	int i = aStream_889.readUShort(-2386);
	anInt894 = aStream_889.readUShort(-2386);
	anInt891 = 500000;
	anIntArray890 = new int[i];
	int i_7_ = 0;
	while (i_7_ < i) {
	    int i_8_ = aStream_889.readInt((byte) 125);
	    int i_9_ = aStream_889.readInt((byte) 125);
	    if (i_8_ == 1297379947) {
		anIntArray890[i_7_] = aStream_889.currentOffset;
		i_7_++;
	    }
	    aStream_889.currentOffset += i_9_;
	}
	aLong896 = 0L;
	anIntArray892 = new int[i];
	for (int i_10_ = 0; i_10_ < i; i_10_++)
	    anIntArray892[i_10_] = anIntArray890[i_10_];
	anIntArray893 = new int[i];
	anIntArray895 = new int[i];
    }
    
    public int method375(int arg0) {
	int i = method373(arg0);
	return i;
    }
    
    public int method376() {
	int i = anIntArray892.length;
	int i_11_ = -1;
	int i_12_ = 2147483647;
	for (int i_13_ = 0; i_13_ < i; i_13_++) {
	    if (anIntArray892[i_13_] >= 0 && anIntArray893[i_13_] < i_12_) {
		i_11_ = i_13_;
		i_12_ = anIntArray893[i_13_];
	    }
	}
	return i_11_;
    }
    
    public void method377(long arg0) {
	aLong896 = arg0;
	int i = anIntArray892.length;
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    anIntArray893[i_14_] = 0;
	    anIntArray895[i_14_] = 0;
	    aStream_889.currentOffset = anIntArray890[i_14_];
	    method368(i_14_);
	    anIntArray892[i_14_] = aStream_889.currentOffset;
	}
    }
    
    public void method378(int arg0) {
	aStream_889.currentOffset = anIntArray892[arg0];
    }
    
    public Class42() {
	aStream_889 = new Stream(null);
    }
    
    public Class42(byte[] arg0) {
	aStream_889 = new Stream(null);
	method374(arg0);
    }
}
