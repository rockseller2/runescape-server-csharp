/* Class67_Sub5_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class67_Sub5_Sub10 extends Class67_Sub5
{
    public static RSString aRSString_4621
	= Class134.method1914("reg", (byte) 12);
    public static RSString aRSString_4622;
    public int anInt4623 = 0;
    public static RSString aRSString_4624;
    public static RSString aRSString_4625;
    public static RSString aRSString_4626;
    public static RSString aRSString_4627;
    public int[] anIntArray4628;
    public static RSString aRSString_4629;
    public static RSString aRSString_4630;
    public int[] anIntArray4631;
    public static RSString aRSString_4632;
    public int[] anIntArray4633;
    public static RSString aRSString_4634;
    public static RSString aRSString_4635
	= Class134.method1914("times", (byte) 29);
    public int[] anIntArray4636;
    public static RSString aRSString_4637;
    public byte[] aByteArray4638;
    public static RSString aRSString_4639;
    public static RSString aRSString_4640;
    public static RSString aRSString_4641;
    public static RSString aRSString_4642;
    public static RSString aRSString_4643;
    public static RSString aRSString_4644;
    public int[] anIntArray4645;
    public static RSString aRSString_4646;
    public static RSString aRSString_4647;
    public int anInt4648;
    public int[] anIntArray4649;
    public static RSString aRSString_4650;
    public static RSString aRSString_4651;
    public static RSString aRSString_4652;
    public static RSString aRSString_4653;
    public int anInt4654;
    public Class119[] aClass119Array4655;
    public static RSString aRSString_4656;
    public static RSString aRSString_4657;
    public static int anInt4658;
    public static int anInt4659;
    public static int anInt4660;
    public static int anInt4661;
    public static int anInt4662;
    public static int anInt4663;
    public static int anInt4664;
    public static int anInt4665;
    public static int anInt4666;
    public static int anInt4667;
    public static RSString[] aRSStringArray4668;
    
    public int method901(RSString arg0, int arg1) {
	return method911(arg0, new int[] { arg1 }, aRSStringArray4668);
    }
    
    public void method902(Class119[] arg0, int[] arg1) {
	if (arg1 != null && arg1.length != arg0.length)
	    throw new IllegalArgumentException();
	aClass119Array4655 = arg0;
	anIntArray4633 = arg1;
    }
    
    public abstract void method903(int i, int i_0_, int i_1_, int i_2_,
				   int i_3_, int i_4_, int i_5_, boolean bool);
    
    public int method904(RSString arg0, int arg1) {
	int i = method911(arg0, new int[] { arg1 }, aRSStringArray4668);
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    int i_8_ = method913(aRSStringArray4668[i_7_]);
	    if (i_8_ > i_6_)
		i_6_ = i_8_;
	}
	return i_6_;
    }
    
    public int method905(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9) {
	return method915(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7,
			 arg8, arg9);
    }
    
    public void method906(int arg0, int arg1, int arg2) {
	anInt4662 = -1;
	anInt4665 = -1;
	anInt4663 = anInt4664 = arg1;
	anInt4658 = anInt4666 = arg0;
	anInt4661 = anInt4659 = arg2;
	anInt4660 = 0;
	anInt4667 = 0;
    }
    
    public void method907(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    int i = arg0.method531((byte) -7);
	    int[] is = new int[i];
	    int[] is_9_ = new int[i];
	    for (int i_10_ = 0; i_10_ < i; i_10_++) {
		is[i_10_] = (int) (Math.sin((double) i_10_ / 5.0
					    + (double) arg5 / 5.0)
				   * 5.0);
		is_9_[i_10_] = (int) (Math.sin((double) i_10_ / 3.0
					       + (double) arg5 / 5.0)
				      * 5.0);
	    }
	    method926(arg0, arg1 - method913(arg0) / 2, arg2, is, is_9_);
	}
    }
    
    public void method908(RSString arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    method916(arg0, arg1 - method913(arg0) / 2, arg2);
	}
    }
    
    public void method909(RSString arg0) {
	do {
	    try {
		if (arg0.method540(aRSString_4637, 93))
		    anInt4658
			= arg0.method503((byte) 34, 4).method506((byte) -109,
								 16);
		else if (arg0.method519((byte) -58, aRSString_4625))
		    anInt4658 = anInt4666;
		else if (arg0.method540(aRSString_4647, -119))
		    anInt4661
			= arg0.method503((byte) 34, 6).method530((byte) 126);
		else if (arg0.method519((byte) -111, aRSString_4652))
		    anInt4661 = anInt4659;
		else if (arg0.method540(aRSString_4630, -104))
		    anInt4662
			= arg0.method503((byte) 34, 4).method506((byte) -116,
								 16);
		else if (arg0.method519((byte) -72, aRSString_4650))
		    anInt4662 = 8388608;
		else if (arg0.method519((byte) -85, aRSString_4626))
		    anInt4662 = -1;
		else if (arg0.method540(aRSString_4639, 80))
		    anInt4665
			= arg0.method503((byte) 34, 2).method506((byte) -111,
								 16);
		else if (arg0.method519((byte) -65, aRSString_4629))
		    anInt4665 = 0;
		else if (arg0.method519((byte) -50, aRSString_4622))
		    anInt4665 = -1;
		else if (arg0.method540(aRSString_4627, -110))
		    anInt4663
			= arg0.method503((byte) 34, 5).method506((byte) -111,
								 16);
		else if (arg0.method519((byte) -53, aRSString_4644))
		    anInt4663 = 0;
		else if (arg0.method519((byte) -65, aRSString_4656))
		    anInt4663 = anInt4664;
		else {
		    if (!arg0.method519((byte) -54, aRSString_4624))
			break;
		    method906(anInt4666, anInt4664, anInt4659);
		}
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public void method910(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    double d = 7.0 - (double) arg6 / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i = arg0.method531((byte) -111);
	    int[] is = new int[i];
	    for (int i_11_ = 0; i_11_ < i; i_11_++)
		is[i_11_]
		    = (int) (Math.sin((double) i_11_ / 1.5 + (double) arg5)
			     * d);
	    method926(arg0, arg1 - method913(arg0) / 2, arg2, null, is);
	}
    }
    
    public int method911(RSString arg0, int[] arg1, RSString[] arg2) {
	if (arg0 == null)
	    return 0;
	aRSString_4632.method542(-64, 0);
	int i = 0;
	int i_12_ = 0;
	int i_13_ = -1;
	int i_14_ = 0;
	int i_15_ = 0;
	int i_16_ = -1;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = arg0.method531((byte) -111);
	for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
	    int i_21_ = arg0.method499(i_20_, -102);
	    if (i_21_ == 60)
		i_16_ = i_20_;
	    else {
		if (i_21_ == 62 && i_16_ != -1) {
		    RSString RSString = arg0.method502(i_16_ + 1, -5975, i_20_);
		    i_16_ = -1;
		    aRSString_4632.method538(-64, 60);
		    aRSString_4632.method544(-63, RSString);
		    aRSString_4632.method538(-64, 62);
		    if (RSString.method519((byte) -59, aRSString_4624)) {
			if (arg2[i_18_] != null) {
			    arg2[i_18_].method542(-64, 0);
			    arg2[i_18_].method509(i_12_, 48, aRSString_4632,
						  aRSString_4632
						      .method531((byte) 115));
			} else
			    arg2[i_18_]
				= (aRSString_4632.method510(false).method502
				   (i_12_, -5975,
				    aRSString_4632.method531((byte) 68)));
			i_18_++;
			i_12_ = aRSString_4632.method531((byte) 11);
			i = 0;
			i_13_ = -1;
			i_17_ = 0;
		    } else if (RSString.method519((byte) -89, aRSString_4642)) {
			i += method921(60);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 60];
			i_17_ = 60;
		    } else if (RSString.method519((byte) -48, aRSString_4634)) {
			i += method921(62);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 62];
			i_17_ = 62;
		    } else if (RSString.method519((byte) -50, aRSString_4643)) {
			i += method921(160);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 160];
			i_17_ = 160;
		    } else if (RSString.method519((byte) -106, aRSString_4640)) {
			i += method921(173);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 173];
			i_17_ = 173;
		    } else if (RSString.method519((byte) -68, aRSString_4635)) {
			i += method921(215);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 215];
			i_17_ = 215;
		    } else if (RSString.method519((byte) -94, aRSString_4641)) {
			i += method921(128);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 128];
			i_17_ = 128;
		    } else if (RSString.method519((byte) -80, aRSString_4657)) {
			i += method921(169);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 169];
			i_17_ = 169;
		    } else if (RSString.method519((byte) -48, aRSString_4621)) {
			i += method921(174);
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + 174];
			i_17_ = 174;
		    } else if (RSString.method540(aRSString_4646, 107)) {
			try {
			    int i_22_ = RSString.method503((byte) 34, 4)
					    .method530((byte) -9);
			    i += aClass119Array4655[i_22_].anInt2255;
			    i_17_ = 0;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_21_ = 0;
		}
		if (i_16_ == -1) {
		    if (i_21_ != 0) {
			aRSString_4632.method538(-64, i_21_);
			i += anIntArray4645[i_21_];
			if (aByteArray4638 != null && i_17_ != 0)
			    i += aByteArray4638[(i_17_ << 8) + i_21_];
			i_17_ = i_21_;
		    }
		    if (i_21_ == 32) {
			i_13_ = aRSString_4632.method531((byte) -120);
			i_14_ = i;
			i_15_ = 1;
		    }
		    if (arg1 != null
			&& i > arg1[(i_18_ < arg1.length ? i_18_
				     : arg1.length - 1)]
			&& i_13_ >= 0) {
			if (arg2[i_18_] != null) {
			    arg2[i_18_].method542(-64, 0);
			    arg2[i_18_] = arg2[i_18_].method509(i_12_, 48,
								aRSString_4632,
								i_13_ - i_15_);
			} else
			    arg2[i_18_]
				= aRSString_4632.method510(false)
				      .method502(i_12_, -5975, i_13_ - i_15_);
			i_18_++;
			i_12_ = i_13_;
			i_13_ = -1;
			i -= i_14_;
			i_17_ = 0;
		    }
		    if (i_21_ == 45) {
			i_13_ = aRSString_4632.method531((byte) 60);
			i_14_ = i;
			i_15_ = 0;
		    }
		}
	    }
	}
	if (aRSString_4632.method531((byte) 58) > i_12_) {
	    if (arg2[i_18_] != null) {
		arg2[i_18_].method542(-64, 0);
		arg2[i_18_] = arg2[i_18_].method509(i_12_, 48, aRSString_4632,
						    aRSString_4632
							.method531((byte) 78));
	    } else
		arg2[i_18_]
		    = (aRSString_4632.method510(false).method502
		       (i_12_, -5975, aRSString_4632.method531((byte) -120)));
	    i_18_++;
	}
	return i_18_;
    }
    
    public void method912(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    int i = arg0.method531((byte) 62);
	    int[] is = new int[i];
	    for (int i_23_ = 0; i_23_ < i; i_23_++)
		is[i_23_] = (int) (Math.sin((double) i_23_ / 2.0
					    + (double) arg5 / 5.0)
				   * 5.0);
	    method926(arg0, arg1 - method913(arg0) / 2, arg2, null, is);
	}
    }
    
    public int method913(RSString arg0) {
	if (arg0 == null)
	    return 0;
	int i = -1;
	int i_24_ = 0;
	int i_25_ = 0;
	int i_26_ = arg0.method531((byte) -23);
	for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
	    int i_28_ = arg0.method499(i_27_, 117);
	    if (i_28_ == 60)
		i = i_27_;
	    else {
		if (i_28_ == 62 && i != -1) {
		    RSString RSString = arg0.method502(i + 1, -5975, i_27_);
		    i = -1;
		    if (RSString.method519((byte) -118, aRSString_4642))
			i_28_ = 60;
		    else if (RSString.method519((byte) -96, aRSString_4634))
			i_28_ = 62;
		    else if (RSString.method519((byte) -117, aRSString_4643))
			i_28_ = 160;
		    else if (RSString.method519((byte) -110, aRSString_4640))
			i_28_ = 173;
		    else if (RSString.method519((byte) -83, aRSString_4635))
			i_28_ = 215;
		    else if (RSString.method519((byte) -90, aRSString_4641))
			i_28_ = 128;
		    else if (RSString.method519((byte) -100, aRSString_4657))
			i_28_ = 169;
		    else if (RSString.method519((byte) -127, aRSString_4621))
			i_28_ = 174;
		    else {
			if (RSString.method540(aRSString_4646, 15)) {
			    try {
				int i_29_ = RSString.method503((byte) 34, 4)
						.method530((byte) -5);
				i_25_ += aClass119Array4655[i_29_].anInt2255;
				i_24_ = 0;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_25_ += anIntArray4645[i_28_];
		    if (aByteArray4638 != null && i_24_ != 0)
			i_25_ += aByteArray4638[(i_24_ << 8) + i_28_];
		    i_24_ = i_28_;
		}
	    }
	}
	return i_25_;
    }
    
    public int method914(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			 Random arg5, int arg6) {
	if (arg0 == null)
	    return 0;
	arg5.setSeed((long) arg6);
	method906(arg3, arg4, 192 + (arg5.nextInt() & 0x1f));
	int i = arg0.method531((byte) 53);
	int[] is = new int[i];
	int i_30_ = 0;
	for (int i_31_ = 0; i_31_ < i; i_31_++) {
	    is[i_31_] = i_30_;
	    if ((arg5.nextInt() & 0x3) == 0)
		i_30_++;
	}
	method926(arg0, arg1, arg2, is, null);
	return i_30_;
    }
    
    public int method915(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9,
			 int arg10) {
	if (arg0 == null)
	    return 0;
	method906(arg5, arg6, arg7);
	if (arg10 == 0)
	    arg10 = anInt4623;
	int[] is = { arg3 };
	if (arg4 < anInt4654 + anInt4648 + arg10 && arg4 < arg10 + arg10)
	    is = null;
	int i = method911(arg0, is, aRSStringArray4668);
	if (arg9 == 3 && i == 1)
	    arg9 = 1;
	int i_32_;
	if (arg9 == 0)
	    i_32_ = arg2 + anInt4654;
	else if (arg9 == 1)
	    i_32_ = (arg2 + anInt4654
		     + (arg4 - anInt4654 - anInt4648 - (i - 1) * arg10) / 2);
	else if (arg9 == 2)
	    i_32_ = arg2 + arg4 - anInt4648 - (i - 1) * arg10;
	else {
	    int i_33_
		= (arg4 - anInt4654 - anInt4648 - (i - 1) * arg10) / (i + 1);
	    if (i_33_ < 0)
		i_33_ = 0;
	    i_32_ = arg2 + anInt4654 + i_33_;
	    arg10 += i_33_;
	}
	for (int i_34_ = 0; i_34_ < i; i_34_++) {
	    if (arg8 == 0)
		method916(aRSStringArray4668[i_34_], arg1, i_32_);
	    else if (arg8 == 1)
		method916(aRSStringArray4668[i_34_],
			  (arg1
			   + (arg3 - method913(aRSStringArray4668[i_34_])) / 2),
			  i_32_);
	    else if (arg8 == 2)
		method916(aRSStringArray4668[i_34_],
			  arg1 + arg3 - method913(aRSStringArray4668[i_34_]),
			  i_32_);
	    else if (i_34_ == i - 1)
		method916(aRSStringArray4668[i_34_], arg1, i_32_);
	    else {
		method922(aRSStringArray4668[i_34_], arg3);
		method916(aRSStringArray4668[i_34_], arg1, i_32_);
		anInt4660 = 0;
	    }
	    i_32_ += arg10;
	}
	return i;
    }
    
    public void method916(RSString arg0, int arg1, int arg2) {
	arg2 -= anInt4623;
	int i = -1;
	int i_35_ = 0;
	int i_36_ = arg0.method531((byte) -21);
	for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
	    int i_38_ = arg0.method499(i_37_, -125);
	    if (i_38_ == 60)
		i = i_37_;
	    else {
		if (i_38_ == 62 && i != -1) {
		    RSString RSString = arg0.method502(i + 1, -5975, i_37_);
		    i = -1;
		    if (RSString.method519((byte) -65, aRSString_4642))
			i_38_ = 60;
		    else if (RSString.method519((byte) -91, aRSString_4634))
			i_38_ = 62;
		    else if (RSString.method519((byte) -111, aRSString_4643))
			i_38_ = 160;
		    else if (RSString.method519((byte) -69, aRSString_4640))
			i_38_ = 173;
		    else if (RSString.method519((byte) -52, aRSString_4635))
			i_38_ = 215;
		    else if (RSString.method519((byte) -82, aRSString_4641))
			i_38_ = 128;
		    else if (RSString.method519((byte) -121, aRSString_4657))
			i_38_ = 169;
		    else if (RSString.method519((byte) -50, aRSString_4621))
			i_38_ = 174;
		    else {
			if (RSString.method540(aRSString_4646, -114)) {
			    try {
				int i_39_ = RSString.method503((byte) 34, 4)
						.method530((byte) -67);
				Class119 class119 = aClass119Array4655[i_39_];
				int i_40_ = (anIntArray4633 != null
					     ? anIntArray4633[i_39_]
					     : class119.anInt2243);
				if (anInt4661 == 256)
				    class119.method1641(arg1, (arg2 + anInt4623
							       - i_40_));
				else
				    class119.method1642(arg1,
							(arg2 + anInt4623
							 - i_40_),
							anInt4661);
				arg1 += class119.anInt2255;
				i_35_ = 0;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method909(RSString);
			continue;
		    }
		}
		if (i == -1) {
		    if (aByteArray4638 != null && i_35_ != 0)
			arg1 += aByteArray4638[(i_35_ << 8) + i_38_];
		    int i_41_ = anIntArray4649[i_38_];
		    int i_42_ = anIntArray4628[i_38_];
		    if (i_38_ != 32) {
			if (anInt4661 == 256) {
			    if (anInt4663 != -1)
				method924(i_38_,
					  arg1 + anIntArray4636[i_38_] + 1,
					  arg2 + anIntArray4631[i_38_] + 1,
					  i_41_, i_42_, anInt4663, true);
			    method924(i_38_, arg1 + anIntArray4636[i_38_],
				      arg2 + anIntArray4631[i_38_], i_41_,
				      i_42_, anInt4658, false);
			} else {
			    if (anInt4663 != -1)
				method903(i_38_,
					  arg1 + anIntArray4636[i_38_] + 1,
					  arg2 + anIntArray4631[i_38_] + 1,
					  i_41_, i_42_, anInt4663, anInt4661,
					  true);
			    method903(i_38_, arg1 + anIntArray4636[i_38_],
				      arg2 + anIntArray4631[i_38_], i_41_,
				      i_42_, anInt4658, anInt4661, false);
			}
		    } else if (anInt4660 > 0) {
			anInt4667 += anInt4660;
			arg1 += anInt4667 >> 8;
			anInt4667 &= 0xff;
		    }
		    int i_43_ = anIntArray4645[i_38_];
		    if (anInt4662 != -1)
			Class121.method1690(arg1,
					    arg2 + (int) ((double) anInt4623
							  * 0.7),
					    i_43_, anInt4662);
		    if (anInt4665 != -1)
			Class121.method1690(arg1, arg2 + anInt4623 + 1, i_43_,
					    anInt4665);
		    arg1 += i_43_;
		    i_35_ = i_38_;
		}
	    }
	}
    }
    
    public void method917(int arg0, int arg1) {
	anInt4662 = -1;
	anInt4665 = -1;
	anInt4663 = anInt4664 = arg1;
	anInt4658 = anInt4666 = arg0;
	anInt4661 = anInt4659 = 256;
	anInt4660 = 0;
	anInt4667 = 0;
    }
    
    public static void method918() {
	aRSString_4642 = null;
	aRSString_4634 = null;
	aRSString_4643 = null;
	aRSString_4640 = null;
	aRSString_4635 = null;
	aRSString_4641 = null;
	aRSString_4657 = null;
	aRSString_4621 = null;
	aRSString_4646 = null;
	aRSString_4624 = null;
	aRSString_4651 = null;
	aRSString_4653 = null;
	aRSString_4637 = null;
	aRSString_4625 = null;
	aRSString_4647 = null;
	aRSString_4652 = null;
	aRSString_4639 = null;
	aRSString_4629 = null;
	aRSString_4622 = null;
	aRSString_4627 = null;
	aRSString_4644 = null;
	aRSString_4656 = null;
	aRSString_4630 = null;
	aRSString_4650 = null;
	aRSString_4626 = null;
	aRSString_4632 = null;
	aRSStringArray4668 = null;
    }
    
    public int method919(RSString arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, Random arg9,
			 int arg10, int[] arg11) {
	if (arg0 == null)
	    return 0;
	arg9.setSeed((long) arg10);
	method906(arg5, arg6, 192 + (arg9.nextInt() & 0x1f));
	int i = arg0.method531((byte) -112);
	int[] is = new int[i];
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < i; i_45_++) {
	    is[i_45_] = i_44_;
	    if ((arg9.nextInt() & 0x3) == 0)
		i_44_++;
	}
	int i_46_ = arg1;
	int i_47_ = arg2 + anInt4654;
	int i_48_ = -1;
	if (arg8 == 1)
	    i_47_ += (arg4 - anInt4654 - anInt4648) / 2;
	else if (arg8 == 2)
	    i_47_ = arg2 + arg4 - anInt4648;
	if (arg7 == 1) {
	    i_48_ = method913(arg0) + i_44_;
	    i_46_ += (arg3 - i_48_) / 2;
	} else if (arg7 == 2) {
	    i_48_ = method913(arg0) + i_44_;
	    i_46_ += arg3 - i_48_;
	}
	method926(arg0, i_46_, i_47_, is, null);
	if (arg11 != null) {
	    if (i_48_ == -1)
		i_48_ = method913(arg0) + i_44_;
	    arg11[0] = i_46_;
	    arg11[1] = i_47_ - anInt4654;
	    arg11[2] = i_48_;
	    arg11[3] = anInt4654 + anInt4648;
	}
	return i_44_;
    }
    
    public void method920(RSString arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    method916(arg0, arg1, arg2);
	}
    }
    
    public int method921(int arg0) {
	return anIntArray4645[arg0 & 0xff];
    }
    
    public void method922(RSString arg0, int arg1) {
	int i = 0;
	boolean bool = false;
	int i_49_ = arg0.method531((byte) -109);
	for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
	    int i_51_ = arg0.method499(i_50_, 113);
	    if (i_51_ == 60)
		bool = true;
	    else if (i_51_ == 62)
		bool = false;
	    else if (!bool && i_51_ == 32)
		i++;
	}
	if (i > 0)
	    anInt4660 = (arg1 - method913(arg0) << 8) / i;
    }
    
    public void method923(RSString arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method917(arg3, arg4);
	    method916(arg0, arg1 - method913(arg0), arg2);
	}
    }
    
    public abstract void method924(int i, int i_52_, int i_53_, int i_54_,
				   int i_55_, int i_56_, boolean bool);
    
    public static RSString method925(RSString arg0) {
	int i = arg0.method531((byte) -117);
	int i_57_ = 0;
	for (int i_58_ = 0; i_58_ < i; i_58_++) {
	    int i_59_ = arg0.method499(i_58_, -62);
	    if (i_59_ == 60 || i_59_ == 62)
		i_57_ += 3;
	}
	RSString RSString = Class10.method139((byte) -104, i + i_57_);
	for (int i_60_ = 0; i_60_ < i; i_60_++) {
	    int i_61_ = arg0.method499(i_60_, -121);
	    if (i_61_ == 60)
		RSString.method544(-63, aRSString_4651);
	    else if (i_61_ == 62)
		RSString.method544(-63, aRSString_4653);
	    else
		RSString.method538(-64, i_61_);
	}
	return RSString;
    }
    
    public void method926(RSString arg0, int arg1, int arg2, int[] arg3,
			  int[] arg4) {
	arg2 -= anInt4623;
	int i = -1;
	int i_62_ = 0;
	int i_63_ = 0;
	int i_64_ = arg0.method531((byte) -121);
	for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
	    int i_66_ = arg0.method499(i_65_, -43);
	    if (i_66_ == 60)
		i = i_65_;
	    else {
		if (i_66_ == 62 && i != -1) {
		    RSString RSString = arg0.method502(i + 1, -5975, i_65_);
		    i = -1;
		    if (RSString.method519((byte) -92, aRSString_4642))
			i_66_ = 60;
		    else if (RSString.method519((byte) -74, aRSString_4634))
			i_66_ = 62;
		    else if (RSString.method519((byte) -83, aRSString_4643))
			i_66_ = 160;
		    else if (RSString.method519((byte) -96, aRSString_4640))
			i_66_ = 173;
		    else if (RSString.method519((byte) -126, aRSString_4635))
			i_66_ = 215;
		    else if (RSString.method519((byte) -58, aRSString_4641))
			i_66_ = 128;
		    else if (RSString.method519((byte) -84, aRSString_4657))
			i_66_ = 169;
		    else if (RSString.method519((byte) -125, aRSString_4621))
			i_66_ = 174;
		    else {
			if (RSString.method540(aRSString_4646, 123)) {
			    try {
				int i_67_;
				if (arg3 != null)
				    i_67_ = arg3[i_63_];
				else
				    i_67_ = 0;
				int i_68_;
				if (arg4 != null)
				    i_68_ = arg4[i_63_];
				else
				    i_68_ = 0;
				i_63_++;
				int i_69_ = RSString.method503((byte) 34, 4)
						.method530((byte) -35);
				Class119 class119 = aClass119Array4655[i_69_];
				int i_70_ = (anIntArray4633 != null
					     ? anIntArray4633[i_69_]
					     : class119.anInt2243);
				if (anInt4661 == 256)
				    class119.method1641(arg1 + i_67_,
							(arg2 + anInt4623
							 - i_70_ + i_68_));
				else
				    class119.method1642(arg1 + i_67_,
							(arg2 + anInt4623
							 - i_70_ + i_68_),
							anInt4661);
				arg1 += class119.anInt2255;
				i_62_ = 0;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method909(RSString);
			continue;
		    }
		}
		if (i == -1) {
		    if (aByteArray4638 != null && i_62_ != 0)
			arg1 += aByteArray4638[(i_62_ << 8) + i_66_];
		    int i_71_ = anIntArray4649[i_66_];
		    int i_72_ = anIntArray4628[i_66_];
		    int i_73_;
		    if (arg3 != null)
			i_73_ = arg3[i_63_];
		    else
			i_73_ = 0;
		    int i_74_;
		    if (arg4 != null)
			i_74_ = arg4[i_63_];
		    else
			i_74_ = 0;
		    i_63_++;
		    if (i_66_ != 32) {
			if (anInt4661 == 256) {
			    if (anInt4663 != -1)
				method924(i_66_,
					  (arg1 + anIntArray4636[i_66_] + 1
					   + i_73_),
					  (arg2 + anIntArray4631[i_66_] + 1
					   + i_74_),
					  i_71_, i_72_, anInt4663, true);
			    method924(i_66_,
				      arg1 + anIntArray4636[i_66_] + i_73_,
				      arg2 + anIntArray4631[i_66_] + i_74_,
				      i_71_, i_72_, anInt4658, false);
			} else {
			    if (anInt4663 != -1)
				method903(i_66_,
					  (arg1 + anIntArray4636[i_66_] + 1
					   + i_73_),
					  (arg2 + anIntArray4631[i_66_] + 1
					   + i_74_),
					  i_71_, i_72_, anInt4663, anInt4661,
					  true);
			    method903(i_66_,
				      arg1 + anIntArray4636[i_66_] + i_73_,
				      arg2 + anIntArray4631[i_66_] + i_74_,
				      i_71_, i_72_, anInt4658, anInt4661,
				      false);
			}
		    } else if (anInt4660 > 0) {
			anInt4667 += anInt4660;
			arg1 += anInt4667 >> 8;
			anInt4667 &= 0xff;
		    }
		    int i_75_ = anIntArray4645[i_66_];
		    if (anInt4662 != -1)
			Class121.method1690(arg1,
					    arg2 + (int) ((double) anInt4623
							  * 0.7),
					    i_75_, anInt4662);
		    if (anInt4665 != -1)
			Class121.method1690(arg1, arg2 + anInt4623, i_75_,
					    anInt4665);
		    arg1 += i_75_;
		    i_62_ = i_66_;
		}
	    }
	}
    }
    
    public void method927(byte[] arg0) {
	anIntArray4645 = new int[256];
	if (arg0.length == 257) {
	    for (int i = 0; i < anIntArray4645.length; i++)
		anIntArray4645[i] = arg0[i] & 0xff;
	    anInt4623 = arg0[256] & 0xff;
	} else {
	    int i = 0;
	    for (int i_76_ = 0; i_76_ < 256; i_76_++)
		anIntArray4645[i_76_] = arg0[i++] & 0xff;
	    int[] is = new int[256];
	    int[] is_77_ = new int[256];
	    for (int i_78_ = 0; i_78_ < 256; i_78_++)
		is[i_78_] = arg0[i++] & 0xff;
	    for (int i_79_ = 0; i_79_ < 256; i_79_++)
		is_77_[i_79_] = arg0[i++] & 0xff;
	    byte[][] is_80_ = new byte[256][];
	    for (int i_81_ = 0; i_81_ < 256; i_81_++) {
		is_80_[i_81_] = new byte[is[i_81_]];
		byte i_82_ = 0;
		for (int i_83_ = 0; i_83_ < is_80_[i_81_].length; i_83_++) {
		    i_82_ += arg0[i++];
		    is_80_[i_81_][i_83_] = i_82_;
		}
	    }
	    byte[][] is_84_ = new byte[256][];
	    for (int i_85_ = 0; i_85_ < 256; i_85_++) {
		is_84_[i_85_] = new byte[is[i_85_]];
		byte i_86_ = 0;
		for (int i_87_ = 0; i_87_ < is_84_[i_85_].length; i_87_++) {
		    i_86_ += arg0[i++];
		    is_84_[i_85_][i_87_] = i_86_;
		}
	    }
	    aByteArray4638 = new byte[65536];
	    for (int i_88_ = 0; i_88_ < 256; i_88_++) {
		if (i_88_ != 32 && i_88_ != 160) {
		    for (int i_89_ = 0; i_89_ < 256; i_89_++) {
			if (i_89_ != 32 && i_89_ != 160)
			    aByteArray4638[(i_88_ << 8) + i_89_]
				= (byte) method928(is_80_, is_84_, is_77_,
						   anIntArray4645, is, i_88_,
						   i_89_);
		    }
		}
	    }
	    anInt4623 = is_77_[32] + is[32];
	}
    }
    
    public static int method928(byte[][] arg0, byte[][] arg1, int[] arg2,
				int[] arg3, int[] arg4, int arg5, int arg6) {
	int i = arg2[arg5];
	int i_90_ = i + arg4[arg5];
	int i_91_ = arg2[arg6];
	int i_92_ = i_91_ + arg4[arg6];
	int i_93_ = i;
	if (i_91_ > i)
	    i_93_ = i_91_;
	int i_94_ = i_90_;
	if (i_92_ < i_90_)
	    i_94_ = i_92_;
	int i_95_ = arg3[arg5];
	if (arg3[arg6] < i_95_)
	    i_95_ = arg3[arg6];
	byte[] is = arg1[arg5];
	byte[] is_96_ = arg0[arg6];
	int i_97_ = i_93_ - i;
	int i_98_ = i_93_ - i_91_;
	for (int i_99_ = i_93_; i_99_ < i_94_; i_99_++) {
	    int i_100_ = is[i_97_++] + is_96_[i_98_++];
	    if (i_100_ < i_95_)
		i_95_ = i_100_;
	}
	return -i_95_;
    }
    
    public Class67_Sub5_Sub10(byte[] arg0, int[] arg1, int[] arg2, int[] arg3,
			      int[] arg4) {
	anIntArray4636 = arg1;
	anIntArray4631 = arg2;
	anIntArray4649 = arg3;
	anIntArray4628 = arg4;
	method927(arg0);
	int i = 2147483647;
	int i_101_ = -2147483648;
	for (int i_102_ = 0; i_102_ < 256; i_102_++) {
	    if (anIntArray4631[i_102_] < i && anIntArray4628[i_102_] != 0)
		i = anIntArray4631[i_102_];
	    if (anIntArray4631[i_102_] + anIntArray4628[i_102_] > i_101_)
		i_101_ = anIntArray4631[i_102_] + anIntArray4628[i_102_];
	}
	anInt4654 = anInt4623 - i;
	anInt4648 = i_101_ - anInt4623;
    }
    
    public Class67_Sub5_Sub10(byte[] arg0) {
	method927(arg0);
    }
    
    static {
	aRSString_4634 = Class134.method1914("gt", (byte) 114);
	aRSString_4641 = Class134.method1914("euro", (byte) 14);
	aRSString_4640 = Class134.method1914("shy", (byte) 56);
	aRSString_4642 = Class134.method1914("lt", (byte) 121);
	aRSString_4624 = Class134.method1914("br", (byte) 50);
	aRSString_4637 = Class134.method1914("col=", (byte) 22);
	aRSString_4625 = Class134.method1914(")4col", (byte) 92);
	aRSString_4627 = Class134.method1914("shad=", (byte) 49);
	aRSString_4643 = Class134.method1914("nbsp", (byte) 110);
	aRSString_4622 = Class134.method1914(")4u", (byte) 86);
	aRSString_4639 = Class134.method1914("u=", (byte) 98);
	aRSString_4630 = Class134.method1914("str=", (byte) 91);
	aRSString_4653 = Class134.method1914("<gt>", (byte) 33);
	aRSString_4652 = Class134.method1914(")4trans", (byte) 95);
	aRSString_4650 = Class134.method1914("str", (byte) 12);
	aRSString_4651 = Class134.method1914("<lt>", (byte) 99);
	aRSString_4646 = Class134.method1914("img=", (byte) 24);
	aRSString_4647 = Class134.method1914("trans=", (byte) 70);
	aRSString_4629 = Class134.method1914("u", (byte) 97);
	aRSString_4644 = Class134.method1914("shad", (byte) 99);
	aRSString_4626 = Class134.method1914(")4str", (byte) 38);
	aRSString_4656 = Class134.method1914(")4shad", (byte) 2);
	aRSString_4657 = Class134.method1914("copy", (byte) 115);
	aRSString_4632 = Class10.method139((byte) -128, 100);
	anInt4659 = 256;
	anInt4658 = 0;
	anInt4660 = 0;
	anInt4662 = -1;
	anInt4666 = 0;
	anInt4661 = 256;
	anInt4664 = -1;
	anInt4667 = 0;
	anInt4665 = -1;
	aRSStringArray4668 = new RSString[100];
	anInt4663 = -1;
    }
}
