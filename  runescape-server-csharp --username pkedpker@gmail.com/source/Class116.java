public class Class116
{
    public static int anInt2190;
    public static Class41[] aClass41Array2191;
    public static int anInt2192 = 0;
    public static int anInt2193;
    public static int anInt2194 = 0;
    public static int anInt2195;
    public static int anInt2196;
    public static int anInt2197;
    public static RSString[] aRSStringArray2198;
    public static RSString aRSString_2199;
    public static RSString aRSString_2200;
    
    public static Class67_Sub5_Sub10 method1622
	(Class9 arg0, int arg1, int arg2, int arg3, Class9 arg4) {
	try {
	    if (arg3 != 0)
		anInt2192 = -62;
	    anInt2195++;
	    if (!Class64.method575((byte) 77, arg2, arg1, arg0))
		return null;
	    return Class67_Sub5_Sub18
		       .method997(arg4.method138(-809612665, arg2, arg1), 174);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("sb.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1623(int arg0) {
	if (arg0 != 0)
	    method1622(null, -47, -76, -127, null);
	aRSString_2199 = null;
	aRSString_2200 = null;
	aClass41Array2191 = null;
	aRSStringArray2198 = null;
    }
    
    public static void method1624(Class9 arg0, byte arg1, Class9 arg2,
				  boolean arg3) {
	try {
	    Class67_Sub10.aClass9_3018 = arg0;
	    Class67_Sub20.aBoolean3164 = arg3;
	    if (arg1 != 58)
		aRSString_2200 = null;
	    Stream.aClass9_2924 = arg2;
	    anInt2193++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("sb.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
    }
    
    public static void method1625(Class71 arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, boolean arg7) {
	int i = arg0.anIntArray1413.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = arg0.anIntArray1413[i_0_] - Class67_Sub16.anInt3080;
	    int i_2_ = arg0.anIntArray1412[i_0_] - Class34.anInt747;
	    int i_3_ = arg0.anIntArray1428[i_0_] - PacketParser.anInt2120;
	    int i_4_ = i_3_ * arg3 + i_1_ * arg4 >> 16;
	    i_3_ = i_3_ * arg4 - i_1_ * arg3 >> 16;
	    i_1_ = i_4_;
	    i_4_ = i_2_ * arg2 - i_3_ * arg1 >> 16;
	    i_3_ = i_2_ * arg1 + i_3_ * arg2 >> 16;
	    i_2_ = i_4_;
	    if (i_3_ < 50)
		return;
	    if (arg0.anIntArray1420 != null) {
		Class71.anIntArray1430[i_0_] = i_1_;
		Class71.anIntArray1426[i_0_] = i_2_;
		Class71.anIntArray1427[i_0_] = i_3_;
	    }
	    Class71.anIntArray1431[i_0_]
		= Class26.anInt611 + (i_1_ << 9) / i_3_;
	    Class71.anIntArray1415[i_0_]
		= Class26.anInt607 + (i_2_ << 9) / i_3_;
	}
	Class26.anInt610 = 0;
	i = arg0.anIntArray1424.length;
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    int i_6_ = arg0.anIntArray1424[i_5_];
	    int i_7_ = arg0.anIntArray1411[i_5_];
	    int i_8_ = arg0.anIntArray1419[i_5_];
	    int i_9_ = Class71.anIntArray1431[i_6_];
	    int i_10_ = Class71.anIntArray1431[i_7_];
	    int i_11_ = Class71.anIntArray1431[i_8_];
	    int i_12_ = Class71.anIntArray1415[i_6_];
	    int i_13_ = Class71.anIntArray1415[i_7_];
	    int i_14_ = Class71.anIntArray1415[i_8_];
	    if ((i_9_ - i_10_) * (i_14_ - i_13_) - (i_12_ - i_13_) * (i_11_
								      - i_10_)
		> 0) {
		if (Class67_Sub1_Sub20.aBoolean4144
		    && Login.method1421(Class99.anInt1964 + Class26.anInt611,
					  (Class109.anInt2086
					   + Class26.anInt607),
					  i_12_, i_13_, i_14_, i_9_, i_10_,
					  i_11_)) {
		    Class119.anInt2260 = arg5;
		    Class131_Sub3.anInt3630 = arg6;
		}
		if (!arg7) {
		    Class26.aBoolean615 = false;
		    if (i_9_ < 0 || i_10_ < 0 || i_11_ < 0
			|| i_9_ > Class26.anInt621 || i_10_ > Class26.anInt621
			|| i_11_ > Class26.anInt621)
			Class26.aBoolean615 = true;
		    if (arg0.anIntArray1420 == null
			|| arg0.anIntArray1420[i_5_] == -1) {
			if (arg0.anIntArray1414[i_5_] != 12345678)
			    Class26.method244(i_12_, i_13_, i_14_, i_9_, i_10_,
					      i_11_, arg0.anIntArray1414[i_5_],
					      arg0.anIntArray1416[i_5_],
					      arg0.anIntArray1425[i_5_]);
		    } else if (InputStream_Sub1.aBoolean78) {
			if (arg0.aBoolean1417)
			    Class26.method234(i_12_, i_13_, i_14_, i_9_, i_10_,
					      i_11_, arg0.anIntArray1414[i_5_],
					      arg0.anIntArray1416[i_5_],
					      arg0.anIntArray1425[i_5_],
					      Class71.anIntArray1430[0],
					      Class71.anIntArray1430[1],
					      Class71.anIntArray1430[3],
					      Class71.anIntArray1426[0],
					      Class71.anIntArray1426[1],
					      Class71.anIntArray1426[3],
					      Class71.anIntArray1427[0],
					      Class71.anIntArray1427[1],
					      Class71.anIntArray1427[3],
					      arg0.anIntArray1420[i_5_]);
			else
			    Class26.method234(i_12_, i_13_, i_14_, i_9_, i_10_,
					      i_11_, arg0.anIntArray1414[i_5_],
					      arg0.anIntArray1416[i_5_],
					      arg0.anIntArray1425[i_5_],
					      Class71.anIntArray1430[i_6_],
					      Class71.anIntArray1430[i_7_],
					      Class71.anIntArray1430[i_8_],
					      Class71.anIntArray1426[i_6_],
					      Class71.anIntArray1426[i_7_],
					      Class71.anIntArray1426[i_8_],
					      Class71.anIntArray1427[i_6_],
					      Class71.anIntArray1427[i_7_],
					      Class71.anIntArray1427[i_8_],
					      arg0.anIntArray1420[i_5_]);
		    } else {
			int i_15_ = (Class26.anInterface3_623.method12
				     ((byte) -125, arg0.anIntArray1420[i_5_]));
			Class26.method244
			    (i_12_, i_13_, i_14_, i_9_, i_10_, i_11_,
			     Class94.method1496(i_15_,
						arg0.anIntArray1414[i_5_]),
			     Class94.method1496(i_15_,
						arg0.anIntArray1416[i_5_]),
			     Class94.method1496(i_15_,
						arg0.anIntArray1425[i_5_]));
		    }
		}
	    }
	}
    }
    
    static {
	anInt2190 = 0;
	aRSStringArray2198 = null;
	anInt2196 = 0;
	aRSString_2199 = Class134.method1914(" weitere Optionen", (byte) 49);
	aRSString_2200
	    = Class134.method1914("Chargement de la liste des serveurs",
				  (byte) 122);
	aClass41Array2191 = new Class41[14];
	anInt2197 = 0;
    }
}
