/* Class67_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub4 extends Class67
{
    public Class92 aClass92_2856;
    public byte[] aByteArray2857;
    
    public static Class67_Sub4 method817(Class9 arg0, int arg1, int arg2) {
	byte[] is = arg0.method138(-809612665, arg2, arg1);
	if (is == null)
	    return null;
	return new Class67_Sub4(new Stream(is));
    }
    
    public void method818() {
	if (aClass92_2856 == null) {
	    aClass92_2856 = new Class92(16);
	    int[] is = new int[16];
	    int[] is_0_ = new int[16];
	    is[9] = is_0_[9] = 128;
	    Class42 class42 = new Class42(aByteArray2857);
	    int i = class42.method369();
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		class42.method378(i_1_);
		class42.method368(i_1_);
		class42.method372(i_1_);
	    }
	while_48_:
	    for (;;) {
		int i_2_ = class42.method376();
		int i_3_ = class42.anIntArray893[i_2_];
		while (class42.anIntArray893[i_2_] == i_3_) {
		    class42.method378(i_2_);
		    int i_4_ = class42.method375(i_2_);
		    if (i_4_ == 1) {
			class42.method364();
			class42.method372(i_2_);
			if (!class42.method370())
			    break;
			break while_48_;
		    }
		    int i_5_ = i_4_ & 0xf0;
		    if (i_5_ == 176) {
			int i_6_ = i_4_ & 0xf;
			int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
			    is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
			    is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
		    }
		    if (i_5_ == 192) {
			int i_9_ = i_4_ & 0xf;
			int i_10_ = i_4_ >> 8 & 0x7f;
			is_0_[i_9_] = is[i_9_] + i_10_;
		    }
		    if (i_5_ == 144) {
			int i_11_ = i_4_ & 0xf;
			int i_12_ = i_4_ >> 8 & 0x7f;
			int i_13_ = i_4_ >> 16 & 0x7f;
			if (i_13_ > 0) {
			    int i_14_ = is_0_[i_11_];
			    Class67_Sub16 class67_sub16
				= ((Class67_Sub16)
				   aClass92_2856.method1489((byte) -55,
							    (long) i_14_));
			    if (class67_sub16 == null) {
				class67_sub16
				    = new Class67_Sub16(new byte[128]);
				aClass92_2856.method1488((byte) -89,
							 class67_sub16,
							 (long) i_14_);
			    }
			    class67_sub16.aByteArray3086[i_12_] = (byte) 1;
			}
		    }
		    class42.method368(i_2_);
		    class42.method372(i_2_);
		}
	    }
	}
    }
    
    public void method819() {
	aClass92_2856 = null;
    }
    
    public Class67_Sub4(Stream arg0) {
	arg0.currentOffset = arg0.buffer.length - 3;
	int i = arg0.readByte((byte) 94);
	int i_15_ = arg0.readUShort(-2386);
	int i_16_ = 14 + i * 10;
	arg0.currentOffset = 0;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
    while_46_:
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    int i_26_ = -1;
	    for (;;) {
		int i_27_ = arg0.readByte((byte) 111);
		if (i_27_ != i_26_)
		    i_16_++;
		i_26_ = i_27_ & 0xf;
		if (i_27_ == 7)
		    continue while_46_;
		if (i_27_ == 23)
		    i_17_++;
		else if (i_26_ == 0)
		    i_19_++;
		else if (i_26_ == 1)
		    i_20_++;
		else if (i_26_ == 2)
		    i_18_++;
		else if (i_26_ == 3)
		    i_21_++;
		else if (i_26_ == 4)
		    i_22_++;
		else if (i_26_ == 5)
		    i_23_++;
		else {
		    if (i_26_ != 6)
			break;
		    i_24_++;
		}
	    }
	    throw new RuntimeException();
	}
	i_16_ += 5 * i_17_;
	i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
	i_16_ += i_22_ + i_24_;
	int i_28_ = arg0.currentOffset;
	int i_29_ = (i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_
		     + i_24_);
	for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
	    arg0.method1061((byte) -29);
	i_16_ += arg0.currentOffset - i_28_;
	int i_31_ = arg0.currentOffset;
	int i_32_ = 0;
	int i_33_ = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
	    i_44_ = i_44_ + arg0.readByte((byte) -23) & 0x7f;
	    if (i_44_ == 0 || i_44_ == 32)
		i_24_++;
	    else if (i_44_ == 1)
		i_32_++;
	    else if (i_44_ == 33)
		i_33_++;
	    else if (i_44_ == 7)
		i_34_++;
	    else if (i_44_ == 39)
		i_35_++;
	    else if (i_44_ == 10)
		i_36_++;
	    else if (i_44_ == 42)
		i_37_++;
	    else if (i_44_ == 99)
		i_38_++;
	    else if (i_44_ == 98)
		i_39_++;
	    else if (i_44_ == 101)
		i_40_++;
	    else if (i_44_ == 100)
		i_41_++;
	    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121
		     || i_44_ == 123)
		i_42_++;
	    else
		i_43_++;
	}
	int i_46_ = 0;
	int i_47_ = arg0.currentOffset;
	arg0.currentOffset += i_42_;
	int i_48_ = arg0.currentOffset;
	arg0.currentOffset += i_23_;
	int i_49_ = arg0.currentOffset;
	arg0.currentOffset += i_22_;
	int i_50_ = arg0.currentOffset;
	arg0.currentOffset += i_21_;
	int i_51_ = arg0.currentOffset;
	arg0.currentOffset += i_32_;
	int i_52_ = arg0.currentOffset;
	arg0.currentOffset += i_34_;
	int i_53_ = arg0.currentOffset;
	arg0.currentOffset += i_36_;
	int i_54_ = arg0.currentOffset;
	arg0.currentOffset += i_19_ + i_20_ + i_23_;
	int i_55_ = arg0.currentOffset;
	arg0.currentOffset += i_19_;
	int i_56_ = arg0.currentOffset;
	arg0.currentOffset += i_43_;
	int i_57_ = arg0.currentOffset;
	arg0.currentOffset += i_20_;
	int i_58_ = arg0.currentOffset;
	arg0.currentOffset += i_33_;
	int i_59_ = arg0.currentOffset;
	arg0.currentOffset += i_35_;
	int i_60_ = arg0.currentOffset;
	arg0.currentOffset += i_37_;
	int i_61_ = arg0.currentOffset;
	arg0.currentOffset += i_24_;
	int i_62_ = arg0.currentOffset;
	arg0.currentOffset += i_21_;
	int i_63_ = arg0.currentOffset;
	arg0.currentOffset += i_38_;
	int i_64_ = arg0.currentOffset;
	arg0.currentOffset += i_39_;
	int i_65_ = arg0.currentOffset;
	arg0.currentOffset += i_40_;
	int i_66_ = arg0.currentOffset;
	arg0.currentOffset += i_41_;
	int i_67_ = arg0.currentOffset;
	arg0.currentOffset += i_17_ * 3;
	aByteArray2857 = new byte[i_16_];
	Stream Stream = new Stream(aByteArray2857);
	Stream.addInt(1297377380, 124);
	Stream.addInt(6, 126);
	Stream.addUShort(16711680, i > 1 ? 1 : 0);
	Stream.addUShort(16711680, i);
	Stream.addUShort(16711680, i_15_);
	arg0.currentOffset = i_28_;
	int i_68_ = 0;
	int i_69_ = 0;
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	int[] is = new int[128];
	i_44_ = 0;
	for (int i_75_ = 0; i_75_ < i; i_75_++) {
	    Stream.addInt(1297379947, 119);
	    Stream.currentOffset += 4;
	    int i_76_ = Stream.currentOffset;
	    int i_77_ = -1;
	while_47_:
	    do {
		for (;;) {
		    int i_78_ = arg0.method1061((byte) -29);
		    Stream.method1050((byte) 120, i_78_);
		    int i_79_ = arg0.buffer[i_46_++] & 0xff;
		    boolean bool = i_79_ != i_77_;
		    i_77_ = i_79_ & 0xf;
		    if (i_79_ == 7) {
			if (bool)
			    Stream.addByte((byte) 4, 255);
			Stream.addByte((byte) 4, 47);
			Stream.addByte((byte) 4, 0);
			break while_47_;
		    }
		    if (i_79_ == 23) {
			if (bool)
			    Stream.addByte((byte) 4, 255);
			Stream.addByte((byte) 4, 81);
			Stream.addByte((byte) 4, 3);
			Stream.addByte((byte) 4,
						arg0.buffer[i_67_++]);
			Stream.addByte((byte) 4,
						arg0.buffer[i_67_++]);
			Stream.addByte((byte) 4,
						arg0.buffer[i_67_++]);
		    } else {
			i_68_ ^= i_79_ >> 4;
			if (i_77_ == 0) {
			    if (bool)
				Stream.addByte((byte) 4, 144 + i_68_);
			    i_69_ += arg0.buffer[i_54_++];
			    i_70_ += arg0.buffer[i_55_++];
			    Stream.addByte((byte) 4, i_69_ & 0x7f);
			    Stream.addByte((byte) 4, i_70_ & 0x7f);
			} else if (i_77_ == 1) {
			    if (bool)
				Stream.addByte((byte) 4, 128 + i_68_);
			    i_69_ += arg0.buffer[i_54_++];
			    i_71_ += arg0.buffer[i_57_++];
			    Stream.addByte((byte) 4, i_69_ & 0x7f);
			    Stream.addByte((byte) 4, i_71_ & 0x7f);
			} else if (i_77_ == 2) {
			    if (bool)
				Stream.addByte((byte) 4, 176 + i_68_);
			    i_44_
				= i_44_ + arg0.buffer[i_31_++] & 0x7f;
			    Stream.addByte((byte) 4, i_44_);
			    int i_80_;
			    if (i_44_ == 0 || i_44_ == 32)
				i_80_ = arg0.buffer[i_61_++];
			    else if (i_44_ == 1)
				i_80_ = arg0.buffer[i_51_++];
			    else if (i_44_ == 33)
				i_80_ = arg0.buffer[i_58_++];
			    else if (i_44_ == 7)
				i_80_ = arg0.buffer[i_52_++];
			    else if (i_44_ == 39)
				i_80_ = arg0.buffer[i_59_++];
			    else if (i_44_ == 10)
				i_80_ = arg0.buffer[i_53_++];
			    else if (i_44_ == 42)
				i_80_ = arg0.buffer[i_60_++];
			    else if (i_44_ == 99)
				i_80_ = arg0.buffer[i_63_++];
			    else if (i_44_ == 98)
				i_80_ = arg0.buffer[i_64_++];
			    else if (i_44_ == 101)
				i_80_ = arg0.buffer[i_65_++];
			    else if (i_44_ == 100)
				i_80_ = arg0.buffer[i_66_++];
			    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120
				     || i_44_ == 121 || i_44_ == 123)
				i_80_ = arg0.buffer[i_47_++];
			    else
				i_80_ = arg0.buffer[i_56_++];
			    i_80_ += is[i_44_];
			    is[i_44_] = i_80_;
			    Stream.addByte((byte) 4, i_80_ & 0x7f);
			} else if (i_77_ == 3) {
			    if (bool)
				Stream.addByte((byte) 4, 224 + i_68_);
			    i_72_ += arg0.buffer[i_62_++];
			    i_72_ += arg0.buffer[i_50_++] << 7;
			    Stream.addByte((byte) 4, i_72_ & 0x7f);
			    Stream.addByte((byte) 4,
						    i_72_ >> 7 & 0x7f);
			} else if (i_77_ == 4) {
			    if (bool)
				Stream.addByte((byte) 4, 208 + i_68_);
			    i_73_ += arg0.buffer[i_49_++];
			    Stream.addByte((byte) 4, i_73_ & 0x7f);
			} else if (i_77_ == 5) {
			    if (bool)
				Stream.addByte((byte) 4, 160 + i_68_);
			    i_69_ += arg0.buffer[i_54_++];
			    i_74_ += arg0.buffer[i_48_++];
			    Stream.addByte((byte) 4, i_69_ & 0x7f);
			    Stream.addByte((byte) 4, i_74_ & 0x7f);
			} else {
			    if (i_77_ != 6)
				break;
			    if (bool)
				Stream.addByte((byte) 4, 192 + i_68_);
			    Stream.addByte((byte) 4,
						    (arg0.buffer
						     [i_61_++]));
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    Stream.method1057(Stream.currentOffset - i_76_, -110);
	}
    }
}
