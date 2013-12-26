/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

public class Class41
{
    public int anInt849 = 99;
    public int anInt850;
    public static int anInt851;
    public static RSString aRSString_852 = Class134.method1914(")1 ", (byte) 53);
    public static int anInt853;
    public int anInt854;
    public int[] anIntArray855;
    public int anInt856;
    public static int[] anIntArray857;
    public boolean aBoolean858 = false;
    public int anInt859 = -1;
    public static int anInt860;
    public static int anInt861;
    public static int anInt862;
    public int anInt863 = -1;
    public static RSString aRSString_864;
    public static int anInt865 = 0;
    public int anInt866;
    public static Class117 aClass117_867;
    public int[] anIntArray868;
    public static RSString aRSString_869
	= Class134.method1914("::clientjs5drop", (byte) 124);
    public static int anInt870;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_871;
    public static int anInt872;
    public static int anInt873;
    public static RSString aRSString_874;
    public boolean[] aBooleanArray875;
    public static RSString aRSString_876;
    public boolean aBoolean877;
    public static Class9 aClass9_878;
    public boolean aBoolean879;
    public int[] anIntArray880;
    public int anInt881;
    public int[][] anIntArrayArray882;
    public int anInt883;
    public static RSString aRSString_884;
    public boolean aBoolean885;
    public static int anInt886;
    public static int anInt887;
    
    public Class131_Sub6 method354(int arg0, int arg1, Class131_Sub6 arg2,
				   int arg3, int arg4, boolean arg5) {
	anInt851++;
	int i = anIntArray880[arg0];
	arg0 = anIntArray855[arg0];
	Class67_Sub5_Sub7 class67_sub5_sub7
	    = Class96_Sub1.method1508(126, arg0 >> 706521552);
	arg0 &= 0xffff;
	if (class67_sub5_sub7 == null)
	    return arg2.method1856(true, true, true);
	arg1 &= 0x3;
	Class67_Sub5_Sub7 class67_sub5_sub7_0_ = null;
	if ((aBoolean877 || Class106.aBoolean2055) && (arg4 ^ 0xffffffff) != 0
	    && (anIntArray855.length ^ 0xffffffff) < (arg4 ^ 0xffffffff)) {
	    arg4 = anIntArray855[arg4];
	    class67_sub5_sub7_0_
		= Class96_Sub1.method1508(99, arg4 >> 1188914672);
	    arg4 &= 0xffff;
	}
	Class131_Sub6 class131_sub6;
	if (class67_sub5_sub7_0_ == null)
	    class131_sub6
		= arg2.method1856(!class67_sub5_sub7.method878((byte) 98,
							       arg0),
				  !class67_sub5_sub7.method876(1, arg0),
				  !aBoolean885);
	else
	    class131_sub6
		= arg2.method1856((!class67_sub5_sub7.method878((byte) 112,
								arg0)
				   & !class67_sub5_sub7_0_
					  .method878((byte) 121, arg4)),
				  (!class67_sub5_sub7.method876(1, arg0)
				   & !class67_sub5_sub7_0_.method876(1, arg4)),
				  !aBoolean885);
	if (arg1 != 1) {
	    if (arg1 != 2) {
		if ((arg1 ^ 0xffffffff) == -4)
		    class131_sub6.method1839();
	    } else
		class131_sub6.method1829();
	} else
	    class131_sub6.method1848();
	if (arg5 != false)
	    method361((byte) 106, null);
	class131_sub6.method1842(class67_sub5_sub7, arg0, class67_sub5_sub7_0_,
				 arg4, arg3 - 1, i, aBoolean885);
	if (arg1 == 1)
	    class131_sub6.method1839();
	else if ((arg1 ^ 0xffffffff) != -3) {
	    if (arg1 == 3)
		class131_sub6.method1848();
	} else
	    class131_sub6.method1829();
	return class131_sub6;
    }
    
    public static void method355(int arg0) {
	aRSString_874 = null;
	aRSString_852 = null;
	aRSString_869 = null;
	aRSString_876 = null;
	anIntArray857 = null;
	aRSString_864 = null;
	if (arg0 != 0)
	    aRSString_884 = null;
	aClass9_878 = null;
	aClass67_Sub5_Sub19_871 = null;
	aRSString_884 = null;
	aClass117_867 = null;
    }
    
    public static int method356(byte arg0, Class70_Sub1 arg1, boolean arg2,
				int arg3, Class70_Sub1 arg4) {
	try {
	    anInt860++;
	    if (arg3 == 1) {
		int i = arg1.anInt1407;
		int i_1_ = arg4.anInt1407;
		if (!arg2) {
		    if (i_1_ == -1)
			i_1_ = 2001;
		    if ((i ^ 0xffffffff) == 0)
			i = 2001;
		}
		return -i_1_ + i;
	    }
	    if (arg3 == 2)
		return (arg1.method1338(2047).aRSString_1911.method534
			(arg4.method1338(arg0 + 2135).aRSString_1911,
			 (byte) -42));
	    if (arg3 == 3) {
		if (arg1.aRSString_3367.method519((byte) -88,
						 Class18.aRSString_2727)) {
		    if (arg4.aRSString_3367.method519((byte) -78,
						     Class18.aRSString_2727))
			return 0;
		    if (arg2)
			return -1;
		    return 1;
		}
		if (arg4.aRSString_3367.method519((byte) -67,
						 Class18.aRSString_2727)) {
		    if (!arg2)
			return -1;
		    return 1;
		}
		return arg1.aRSString_3367.method534(arg4.aRSString_3367,
						    (byte) -43);
	    }
	    if ((arg3 ^ 0xffffffff) == -5) {
		if (arg1.method1328((byte) -101)) {
		    if (!arg4.method1328((byte) -95))
			return 1;
		    return 0;
		}
		if (!arg4.method1328((byte) -112))
		    return 0;
		return -1;
	    }
	    if ((arg3 ^ 0xffffffff) == -6) {
		if (arg1.method1335(true)) {
		    if (!arg4.method1335(true))
			return 1;
		    return 0;
		}
		if (!arg4.method1335(true))
		    return 0;
		return -1;
	    }
	    if ((arg3 ^ 0xffffffff) == -7) {
		if (arg1.method1327(arg0 + 214)) {
		    if (arg4.method1327(126))
			return 0;
		    return 1;
		}
		if (arg4.method1327(127))
		    return -1;
		return 0;
	    }
	    if (arg3 == 7) {
		if (!arg1.method1329(false)) {
		    if (!arg4.method1329(false))
			return 0;
		    return -1;
		}
		if (arg4.method1329(false))
		    return 0;
		return 1;
	    }
	    if (arg0 != -88)
		method359(63);
	    return -arg4.anInt3365 + arg1.anInt3365;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ek.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method357(int arg0) {
	if (anInt863 == -1) {
	    if (aBooleanArray875 != null)
		anInt863 = 2;
	    else
		anInt863 = 0;
	}
	anInt853++;
	if ((anInt859 ^ 0xffffffff) == 0) {
	    if (aBooleanArray875 == null)
		anInt859 = 0;
	    else
		anInt859 = 2;
	}
	if (arg0 <= 47)
	    method359(-123);
    }
    
    public Class131_Sub6 method358(int arg0, int arg1, Class131_Sub6 arg2,
				   int arg3, int arg4) {
	anInt887++;
	int i = anIntArray880[arg0];
	int i_2_ = anIntArray855[arg0];
	Class67_Sub5_Sub7 class67_sub5_sub7
	    = Class96_Sub1.method1508(97, i_2_ >> 773238320);
	i_2_ &= 0xffff;
	if (class67_sub5_sub7 == null)
	    return arg2.method1853(true, true, true);
	Class67_Sub5_Sub7 class67_sub5_sub7_3_ = null;
	Class67_Sub5_Sub7 class67_sub5_sub7_4_ = null;
	if (arg3 != -20002)
	    method357(-31);
	Class67_Sub5_Sub7 class67_sub5_sub7_5_ = null;
	if ((aBoolean877 || Class106.aBoolean2055) && (arg1 ^ 0xffffffff) != 0
	    && arg1 < anIntArray855.length) {
	    arg1 = anIntArray855[arg1];
	    class67_sub5_sub7_4_
		= Class96_Sub1.method1508(101, arg1 >> -1962692688);
	    arg1 &= 0xffff;
	}
	int i_6_ = 0;
	int i_7_ = 0;
	if (anIntArray868 != null) {
	    if ((arg0 ^ 0xffffffff) > (anIntArray868.length ^ 0xffffffff)) {
		i_6_ = anIntArray868[arg0];
		if (i_6_ != 65535) {
		    class67_sub5_sub7_3_
			= Class96_Sub1.method1508(arg3 ^ ~0x4e7e,
						  i_6_ >> 170518160);
		    i_6_ &= 0xffff;
		}
	    }
	    if ((aBoolean877 || Class106.aBoolean2055) && arg1 != -1
		&& anIntArray868.length > arg1) {
		i_7_ = anIntArray868[arg1];
		if ((i_7_ ^ 0xffffffff) != -65536) {
		    class67_sub5_sub7_5_
			= Class96_Sub1.method1508(87, i_7_ >> -1254854160);
		    i_7_ &= 0xffff;
		}
	    }
	}
	boolean bool = !class67_sub5_sub7.method878((byte) 115, i_2_);
	boolean bool_8_ = !class67_sub5_sub7.method876(1, i_2_);
	if (class67_sub5_sub7_3_ != null) {
	    bool = bool & !class67_sub5_sub7_3_.method878((byte) -50, i_6_);
	    bool_8_ = bool_8_ & !class67_sub5_sub7_3_.method876(1, i_6_);
	}
	if (class67_sub5_sub7_4_ != null) {
	    bool = bool & !class67_sub5_sub7_4_.method878((byte) -92, arg1);
	    bool_8_ = bool_8_ & !class67_sub5_sub7_4_.method876(arg3 + 20003,
								arg1);
	}
	if (class67_sub5_sub7_5_ != null) {
	    bool = bool & !class67_sub5_sub7_5_.method878((byte) -125, i_7_);
	    bool_8_ = bool_8_ & !class67_sub5_sub7_5_.method876(1, i_7_);
	}
	Class131_Sub6 class131_sub6
	    = arg2.method1853(bool, bool_8_, !aBoolean885);
	class131_sub6.method1842(class67_sub5_sub7, i_2_, class67_sub5_sub7_4_,
				 arg1, arg4 + -1, i, aBoolean885);
	if (class67_sub5_sub7_3_ != null)
	    class131_sub6.method1842(class67_sub5_sub7_3_, i_6_,
				     class67_sub5_sub7_5_, i_7_, -1 + arg4, i,
				     aBoolean885);
	return class131_sub6;
    }
    
    public static void method359(int arg0) {
	anInt862++;
	java.awt.Container container;
	if (Class7.aFrame223 == null) {
	    if (Class120.aFrame2272 == null)
		container = Class124.aSignLink_2335.anApplet940;
	    else
		container = Class120.aFrame2272;
	} else
	    container = Class7.aFrame223;
	if (arg0 >= -53)
	    method356((byte) 73, null, true, 119, null);
	Class67_Sub1_Sub37.anInt4413 = container.getSize().width;
	Class99.anInt1963 = container.getSize().height;
	if (Class120.aFrame2272 == container) {
	    Insets insets = Class120.aFrame2272.getInsets();
	    Class99.anInt1963 -= insets.top - -insets.bottom;
	    Class67_Sub1_Sub37.anInt4413 -= insets.left - -insets.right;
	}
	if ((Class78.method1413(84) ^ 0xffffffff) <= -3) {
	    Class49.anInt1010 = Class99.anInt1963;
	    Class67_Sub1_Sub30.anInt4272 = 0;
	    Class67_Sub1_Sub16_Sub1.anInt5093 = 0;
	    Class56.anInt1097 = Class67_Sub1_Sub37.anInt4413;
	} else {
	    Class67_Sub1_Sub16_Sub1.anInt5093
		= (Class67_Sub1_Sub37.anInt4413 + -765) / 2;
	    Class67_Sub1_Sub30.anInt4272 = 0;
	    Class49.anInt1010 = 503;
	    Class56.anInt1097 = 765;
	}
	Class67_Sub5_Sub12.aCanvas4698.setSize(Class56.anInt1097,
					       Class49.anInt1010);
	if (Class120.aFrame2272 == container) {
	    Insets insets = Class120.aFrame2272.getInsets();
	    Class67_Sub5_Sub12.aCanvas4698.setLocation
		(Class67_Sub1_Sub16_Sub1.anInt5093 + insets.left,
		 insets.top - -Class67_Sub1_Sub30.anInt4272);
	} else
	    Class67_Sub5_Sub12.aCanvas4698.setLocation((Class67_Sub1_Sub16_Sub1
							.anInt5093),
						       (Class67_Sub1_Sub30
							.anInt4272));
	if ((Class54.anInt1080 ^ 0xffffffff) != 0)
	    Class67_Sub10.method1116(true, false);
	Class13.method152(90);
    }
    
    public void method360(int arg0, Stream arg1, int arg2) {
	if ((arg0 ^ 0xffffffff) == -2) {
	    int i = arg1.readUShort(-2386);
	    anIntArray880 = new int[i];
	    for (int i_9_ = 0; (i ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
		anIntArray880[i_9_] = arg1.readUShort(-2386);
	    anIntArray855 = new int[i];
	    for (int i_10_ = 0; i_10_ < i; i_10_++)
		anIntArray855[i_10_] = arg1.readUShort(-2386);
	    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_11_++)
		anIntArray855[i_11_] = ((arg1.readUShort(-2386) << -1667618736)
					- -anIntArray855[i_11_]);
	} else if (arg0 == 2)
	    anInt881 = arg1.readUShort(-2386);
	else if ((arg0 ^ 0xffffffff) != -4) {
	    if (arg0 == 4)
		aBoolean879 = true;
	    else if ((arg0 ^ 0xffffffff) != -6) {
		if (arg0 != 6) {
		    if ((arg0 ^ 0xffffffff) == -8)
			anInt866 = arg1.readUShort(-2386);
		    else if (arg0 != 8) {
			if (arg0 != 9) {
			    if ((arg0 ^ 0xffffffff) != -11) {
				if ((arg0 ^ 0xffffffff) != -12) {
				    if ((arg0 ^ 0xffffffff) == -13) {
					int i = arg1.readByte((byte) 88);
					anIntArray868 = new int[i];
					for (int i_12_ = 0;
					     ((i_12_ ^ 0xffffffff)
					      > (i ^ 0xffffffff));
					     i_12_++)
					    anIntArray868[i_12_]
						= arg1.readUShort(-2386);
					for (int i_13_ = 0;
					     ((i_13_ ^ 0xffffffff)
					      > (i ^ 0xffffffff));
					     i_13_++)
					    anIntArray868[i_13_]
						= ((arg1.readUShort(-2386)
						    << 809401520)
						   - -anIntArray868[i_13_]);
				    } else if (arg0 == 13) {
					int i = arg1.readUShort(-2386);
					anIntArrayArray882 = new int[i][];
					for (int i_14_ = 0;
					     ((i ^ 0xffffffff)
					      < (i_14_ ^ 0xffffffff));
					     i_14_++) {
					    int i_15_
						= arg1.readByte((byte) -47);
					    if ((i_15_ ^ 0xffffffff) < -1) {
						anIntArrayArray882[i_14_]
						    = new int[i_15_];
						anIntArrayArray882[i_14_][0]
						    = arg1.readThreeBytes(65280);
						for (int i_16_ = 1;
						     ((i_16_ ^ 0xffffffff)
						      > (i_15_ ^ 0xffffffff));
						     i_16_++)
						    anIntArrayArray882
							[i_14_][i_16_]
							= (arg1.readUShort
							   (-2386));
					    }
					}
				    } else if ((arg0 ^ 0xffffffff) == -15)
					aBoolean885 = true;
				    else if (arg0 != 15) {
					if ((arg0 ^ 0xffffffff) == -17)
					    aBoolean858 = true;
				    } else
					aBoolean877 = true;
				} else
				    anInt850 = arg1.readByte((byte) 110);
			    } else
				anInt859 = arg1.readByte((byte) 116);
			} else
			    anInt863 = arg1.readByte((byte) -57);
		    } else
			anInt849 = arg1.readByte((byte) 126);
		} else
		    anInt883 = arg1.readUShort(-2386);
	    } else
		anInt856 = arg1.readByte((byte) 114);
	} else {
	    aBooleanArray875 = new boolean[256];
	    int i = arg1.readByte((byte) -120);
	    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_17_++)
		aBooleanArray875[arg1.readByte((byte) -76)] = true;
	}
	anInt872++;
	if (arg2 <= 25)
	    method357(-97);
    }
    
    public void method361(byte arg0, Stream arg1) {
	for (;;) {
	    int i = arg1.readByte((byte) 78);
	    if (i == 0)
		break;
	    method360(i, arg1, 56);
	}
	if (arg0 <= 114)
	    method359(69);
	anInt861++;
    }
    
    public Class131_Sub6 method362(int arg0, int arg1, Class131_Sub6 arg2,
				   int arg3, int arg4) {
	anInt886++;
	int i = anIntArray880[arg3];
	arg3 = anIntArray855[arg3];
	Class67_Sub5_Sub7 class67_sub5_sub7
	    = Class96_Sub1.method1508(85, arg3 >> -1850169840);
	arg3 &= 0xffff;
	if (class67_sub5_sub7 == null)
	    return arg2.method1833(true, true, true);
	Class67_Sub5_Sub7 class67_sub5_sub7_18_ = null;
	if ((aBoolean877 || Class106.aBoolean2055) && arg4 != -1
	    && arg4 < anIntArray855.length) {
	    arg4 = anIntArray855[arg4];
	    class67_sub5_sub7_18_
		= Class96_Sub1.method1508(98, arg4 >> 1774711888);
	    arg4 &= 0xffff;
	}
	Class131_Sub6 class131_sub6;
	if (class67_sub5_sub7_18_ != null)
	    class131_sub6
		= arg2.method1833((!class67_sub5_sub7.method878((byte) 80,
								arg3)
				   & !class67_sub5_sub7_18_
					  .method878((byte) -122, arg4)),
				  (!class67_sub5_sub7.method876(1, arg3)
				   & !class67_sub5_sub7_18_.method876(1,
								      arg4)),
				  !aBoolean885);
	else
	    class131_sub6
		= arg2.method1833(!class67_sub5_sub7.method878((byte) 121,
							       arg3),
				  !class67_sub5_sub7.method876(1, arg3),
				  !aBoolean885);
	if (arg0 <= 34)
	    anInt866 = -120;
	class131_sub6.method1842(class67_sub5_sub7, arg3,
				 class67_sub5_sub7_18_, arg4, arg1 + -1, i,
				 aBoolean885);
	return class131_sub6;
    }
    
    public Class41() {
	anInt850 = 2;
	anInt856 = 5;
	anInt883 = -1;
	aBoolean877 = false;
	aBoolean885 = false;
	anInt881 = -1;
	aBoolean879 = false;
	anInt866 = -1;
    }
    
    static {
	aRSString_864 = Class134.method1914("Examiner", (byte) 49);
	aRSString_874
	    = Class134.method1914("Shift)2click ENABLED(Q", (byte) 123);
	aRSString_876 = Class134.method1914("::replacecanvas", (byte) 94);
	aRSString_884 = Class134.method1914("runes", (byte) 60);
    }
}
