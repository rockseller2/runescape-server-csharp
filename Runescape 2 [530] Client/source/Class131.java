public abstract class Class131
{
    public static int anInt2425 = 0;
    public static int anInt2426;
    public static int anInt2427;
    public static Class72 aClass72_2428;
    public static int anInt2429;
    public static float aFloat2430;
    public static int anInt2431;
    public static int anInt2432;
    public static int anInt2433;
    
    public static Class67_Sub5_Sub6 method1762(int arg0, RSString arg1) {
	anInt2427++;
	for (Class67_Sub5_Sub6 class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method445(0);
	     class67_sub5_sub6 != null;
	     class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method432(0)) {
	    if (class67_sub5_sub6.aRSString_4553.method519((byte) -78, arg1))
		return class67_sub5_sub6;
	}
	int i = 31 / ((11 - arg0) / 34);
	return null;
    }
    
    public void method1763(Class131 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	anInt2432++;
    }
    
    public abstract void method1764
	(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	 int i_6_, long l, int i_7_, Class61_Sub1 class61_sub1);
    
    public Class131 method1765(int arg0, int arg1, int arg2) {
	try {
	    anInt2431++;
	    return this;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ug.EA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1766(byte arg0) {
	try {
	    if (arg0 > -124)
		method1767(56, null, -9, (byte) -4);
	    aClass72_2428 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "ug.WA(" + arg0 + ')');
	}
    }
    
    public static RSString method1767(int arg0, RSString[] arg1, int arg2,
				     byte arg3) {
	try {
	    anInt2429++;
	    int i = 0;
	    if (arg3 != -67)
		aClass72_2428 = null;
	    for (int i_8_ = 0; arg0 > i_8_; i_8_++) {
		if (arg1[arg2 - -i_8_] == null)
		    arg1[i_8_ + arg2] = Class67_Sub1_Sub29.aRSString_4264;
		i += arg1[i_8_ + arg2].anInt2629;
	    }
	    byte[] is = new byte[i];
	    int i_9_ = 0;
	    for (int i_10_ = 0; i_10_ < arg0; i_10_++) {
		RSString RSString = arg1[i_10_ + arg2];
		Class17.method185(RSString.aByteArray2653, 0, is, i_9_,
				  RSString.anInt2629);
		i_9_ += RSString.anInt2629;
	    }
	    RSString RSString = new RSString();
	    RSString.aByteArray2653 = is;
	    RSString.anInt2629 = i;
	    return RSString;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ug.VA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public boolean method1768() {
	try {
	    anInt2433++;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "ug.TA(" + ')');
	}
    }
    
    public abstract int method1769();
    
    public static void method1770(Class84 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  boolean arg8) {
	int i_11_;
	int i = i_11_ = (arg6 << 7) - Class67_Sub16.anInt3080;
	int i_13_;
	int i_12_ = i_13_ = (arg7 << 7) - PacketParser.anInt2120;
	int i_15_;
	int i_14_ = i_15_ = i + 128;
	int i_17_;
	int i_16_ = i_17_ = i_12_ + 128;
	int i_18_ = (Class136.anIntArrayArrayArray2496[arg1][arg6][arg7]
		     - Class34.anInt747);
	int i_19_ = (Class136.anIntArrayArrayArray2496[arg1][arg6 + 1][arg7]
		     - Class34.anInt747);
	int i_20_
	    = (Class136.anIntArrayArrayArray2496[arg1][arg6 + 1][arg7 + 1]
	       - Class34.anInt747);
	int i_21_ = (Class136.anIntArrayArrayArray2496[arg1][arg6][arg7 + 1]
		     - Class34.anInt747);
	int i_22_ = i_12_ * arg4 + i * arg5 >> 16;
	i_12_ = i_12_ * arg5 - i * arg4 >> 16;
	i = i_22_;
	i_22_ = i_18_ * arg3 - i_12_ * arg2 >> 16;
	i_12_ = i_18_ * arg2 + i_12_ * arg3 >> 16;
	i_18_ = i_22_;
	if (i_12_ >= 50) {
	    i_22_ = i_13_ * arg4 + i_14_ * arg5 >> 16;
	    i_13_ = i_13_ * arg5 - i_14_ * arg4 >> 16;
	    i_14_ = i_22_;
	    i_22_ = i_19_ * arg3 - i_13_ * arg2 >> 16;
	    i_13_ = i_19_ * arg2 + i_13_ * arg3 >> 16;
	    i_19_ = i_22_;
	    if (i_13_ >= 50) {
		i_22_ = i_16_ * arg4 + i_15_ * arg5 >> 16;
		i_16_ = i_16_ * arg5 - i_15_ * arg4 >> 16;
		i_15_ = i_22_;
		i_22_ = i_20_ * arg3 - i_16_ * arg2 >> 16;
		i_16_ = i_20_ * arg2 + i_16_ * arg3 >> 16;
		i_20_ = i_22_;
		if (i_16_ >= 50) {
		    i_22_ = i_17_ * arg4 + i_11_ * arg5 >> 16;
		    i_17_ = i_17_ * arg5 - i_11_ * arg4 >> 16;
		    i_11_ = i_22_;
		    i_22_ = i_21_ * arg3 - i_17_ * arg2 >> 16;
		    i_17_ = i_21_ * arg2 + i_17_ * arg3 >> 16;
		    i_21_ = i_22_;
		    if (i_17_ >= 50) {
			int i_23_ = Class26.anInt611 + (i << 9) / i_12_;
			int i_24_ = Class26.anInt607 + (i_18_ << 9) / i_12_;
			int i_25_ = Class26.anInt611 + (i_14_ << 9) / i_13_;
			int i_26_ = Class26.anInt607 + (i_19_ << 9) / i_13_;
			int i_27_ = Class26.anInt611 + (i_15_ << 9) / i_16_;
			int i_28_ = Class26.anInt607 + (i_20_ << 9) / i_16_;
			int i_29_ = Class26.anInt611 + (i_11_ << 9) / i_17_;
			int i_30_ = Class26.anInt607 + (i_21_ << 9) / i_17_;
			Class26.anInt610 = 0;
			if (((i_27_ - i_29_) * (i_26_ - i_30_)
			     - (i_28_ - i_30_) * (i_25_ - i_29_))
			    > 0) {
			    if (Class67_Sub1_Sub20.aBoolean4144
				&& Login.method1421((Class99.anInt1964
						       + Class26.anInt611),
						      (Class109.anInt2086
						       + Class26.anInt607),
						      i_28_, i_30_, i_26_,
						      i_27_, i_29_, i_25_)) {
				Class119.anInt2260 = arg6;
				Class131_Sub3.anInt3630 = arg7;
			    }
			    if (!arg8) {
				Class26.aBoolean615 = false;
				if (i_27_ < 0 || i_29_ < 0 || i_25_ < 0
				    || i_27_ > Class26.anInt621
				    || i_29_ > Class26.anInt621
				    || i_25_ > Class26.anInt621)
				    Class26.aBoolean615 = true;
				if (arg0.anInt1702 == -1) {
				    if (arg0.anInt1699 != 12345678)
					Class26.method244(i_28_, i_30_, i_26_,
							  i_27_, i_29_, i_25_,
							  arg0.anInt1699,
							  arg0.anInt1698,
							  arg0.anInt1693);
				} else if (InputStream_Sub1.aBoolean78) {
				    if (arg0.aBoolean1694)
					Class26.method234(i_28_, i_30_, i_26_,
							  i_27_, i_29_, i_25_,
							  arg0.anInt1699,
							  arg0.anInt1698,
							  arg0.anInt1693, i,
							  i_14_, i_11_, i_18_,
							  i_19_, i_21_, i_12_,
							  i_13_, i_17_,
							  arg0.anInt1702);
				    else
					Class26.method234(i_28_, i_30_, i_26_,
							  i_27_, i_29_, i_25_,
							  arg0.anInt1699,
							  arg0.anInt1698,
							  arg0.anInt1693,
							  i_15_, i_11_, i_14_,
							  i_20_, i_21_, i_19_,
							  i_16_, i_17_, i_13_,
							  arg0.anInt1702);
				} else {
				    int i_31_
					= (Class26.anInterface3_623.method12
					   ((byte) -120, arg0.anInt1702));
				    Class26.method244
					(i_28_, i_30_, i_26_, i_27_, i_29_,
					 i_25_,
					 Class94.method1496(i_31_,
							    arg0.anInt1699),
					 Class94.method1496(i_31_,
							    arg0.anInt1698),
					 Class94.method1496(i_31_,
							    arg0.anInt1693));
				}
			    }
			}
			if (((i_23_ - i_25_) * (i_30_ - i_26_)
			     - (i_24_ - i_26_) * (i_29_ - i_25_))
			    > 0) {
			    if (Class67_Sub1_Sub20.aBoolean4144
				&& Login.method1421((Class99.anInt1964
						       + Class26.anInt611),
						      (Class109.anInt2086
						       + Class26.anInt607),
						      i_24_, i_26_, i_30_,
						      i_23_, i_25_, i_29_)) {
				Class119.anInt2260 = arg6;
				Class131_Sub3.anInt3630 = arg7;
			    }
			    if (!arg8) {
				Class26.aBoolean615 = false;
				if (i_23_ < 0 || i_25_ < 0 || i_29_ < 0
				    || i_23_ > Class26.anInt621
				    || i_25_ > Class26.anInt621
				    || i_29_ > Class26.anInt621)
				    Class26.aBoolean615 = true;
				if (arg0.anInt1702 == -1) {
				    if (arg0.anInt1696 != 12345678)
					Class26.method244(i_24_, i_26_, i_30_,
							  i_23_, i_25_, i_29_,
							  arg0.anInt1696,
							  arg0.anInt1693,
							  arg0.anInt1698);
				} else if (InputStream_Sub1.aBoolean78)
				    Class26.method234(i_24_, i_26_, i_30_,
						      i_23_, i_25_, i_29_,
						      arg0.anInt1696,
						      arg0.anInt1693,
						      arg0.anInt1698, i, i_14_,
						      i_11_, i_18_, i_19_,
						      i_21_, i_12_, i_13_,
						      i_17_, arg0.anInt1702);
				else {
				    int i_32_
					= (Class26.anInterface3_623.method12
					   ((byte) -118, arg0.anInt1702));
				    Class26.method244
					(i_24_, i_26_, i_30_, i_23_, i_25_,
					 i_29_,
					 Class94.method1496(i_32_,
							    arg0.anInt1696),
					 Class94.method1496(i_32_,
							    arg0.anInt1693),
					 Class94.method1496(i_32_,
							    arg0.anInt1698));
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public abstract void method1771(int i, int i_33_, int i_34_, int i_35_,
				    int i_36_);
}
