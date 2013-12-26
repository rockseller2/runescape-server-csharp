/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92
{
    public static RSString aRSString_1859;
    public static int anInt1860;
    public static int anInt1861;
    public static int anInt1862;
    public int anInt1863;
    public static int anInt1864;
    public static int anInt1865;
    public static RSString aRSString_1866;
    public Class67 aClass67_1867;
    public static Class50 aClass50_1868;
    public static RSString aRSString_1869
	= Class134.method1914("Discard", (byte) 71);
    public static int anInt1870;
    public static int anInt1871;
    public Class67[] aClass67Array1872;
    public static int anInt1873;
    public static int anInt1874;
    public static int anInt1875;
    public static RSString aRSString_1876;
    public static int anInt1877;
    public static RSString aRSString_1878;
    public long aLong1879;
    public Class67 aClass67_1880;
    public int anInt1881 = 0;
    
    public Class67 method1477(byte arg0) {
	anInt1877++;
	if (aClass67_1867 == null)
	    return null;
	int i = -40 % ((arg0 - -6) / 60);
	for (Class67 class67 = (aClass67Array1872
				[(int) (aLong1879 & (long) (anInt1863 - 1))]);
	     class67 != aClass67_1867;
	     aClass67_1867 = aClass67_1867.aClass67_1340) {
	    if (aLong1879 == aClass67_1867.aLong1344) {
		Class67 class67_0_ = aClass67_1867;
		aClass67_1867 = aClass67_1867.aClass67_1340;
		return class67_0_;
	    }
	}
	aClass67_1867 = null;
	return null;
    }
    
    public void method1478(boolean arg0) {
	if (arg0 != true)
	    aLong1879 = 69L;
	for (int i = 0; (i ^ 0xffffffff) > (anInt1863 ^ 0xffffffff); i++) {
	    Class67 class67 = aClass67Array1872[i];
	    for (;;) {
		Class67 class67_1_ = class67.aClass67_1340;
		if (class67 == class67_1_)
		    break;
		class67_1_.method606((byte) -118);
	    }
	}
	aClass67_1880 = null;
	aClass67_1867 = null;
	anInt1873++;
    }
    
    public static int method1479(int arg0, int arg1) {
	return arg0 ^ arg1;
    }
    
    public Class67 method1480(int arg0) {
	anInt1865++;
	if (anInt1881 > 0
	    && aClass67_1880 != aClass67Array1872[-1 + anInt1881]) {
	    Class67 class67 = aClass67_1880;
	    aClass67_1880 = class67.aClass67_1340;
	    return class67;
	}
	while (anInt1863 > anInt1881) {
	    Class67 class67 = aClass67Array1872[anInt1881++].aClass67_1340;
	    if (aClass67Array1872[-1 + anInt1881] != class67) {
		aClass67_1880 = class67.aClass67_1340;
		return class67;
	    }
	}
	if (arg0 != 11)
	    anInt1863 = -60;
	return null;
    }
    
    public static void method1481(byte arg0) {
	Class10.anInt400++;
	Class70_Sub1.outStream.createFrame(2, 104);	//CLAN_CHAT
	if (arg0 != 104)
	    method1484(true, -99, 5, 125, 16, 51, -67, 25, true, null, 95);
	anInt1862++;
	Class70_Sub1.outStream.writeLong(2, 0L);
    }
    
    public int method1482(int arg0) {
	if (arg0 != -1)
	    return -78;
	anInt1864++;
	return anInt1863;
    }
    
    public Class67 method1483(byte arg0) {
	anInt1881 = 0;
	if (arg0 < 23)
	    method1482(24);
	anInt1870++;
	return method1480(11);
    }
    
    public static void method1484(boolean arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  boolean arg8, Class73 arg9, int arg10) {
	anInt1874++;
	if (!arg8 || Class32.method288(true)
	    || (0x2 & Class120.aByteArrayArrayArray2284[0][arg6][arg7]
		^ 0xffffffff) != -1
	    || (((0x10 & Class120.aByteArrayArrayArray2284[arg1][arg6][arg7])
		 == 0)
		&& (Class36.method318(false, arg6, arg1, arg7)
		    == Class116.anInt2197))) {
	    if ((arg1 ^ 0xffffffff)
		> (Class67_Sub1_Sub12.anInt4005 ^ 0xffffffff))
		Class67_Sub1_Sub12.anInt4005 = arg1;
	    Class65 class65 = Class73.method1359(11525, arg2);
	    int i;
	    int i_2_;
	    if ((arg4 ^ 0xffffffff) != -2 && (arg4 ^ 0xffffffff) != -4) {
		i_2_ = class65.anInt1297;
		i = class65.anInt1264;
	    } else {
		i = class65.anInt1297;
		i_2_ = class65.anInt1264;
	    }
	    int i_3_;
	    int i_4_;
	    if ((arg6 - -i_2_ ^ 0xffffffff) < -105) {
		i_4_ = arg6;
		i_3_ = arg6 + 1;
	    } else {
		i_3_ = arg6 + (i_2_ - -1 >> 1505041889);
		i_4_ = (i_2_ >> 882786593) + arg6;
	    }
	    int i_5_;
	    int i_6_;
	    if (arg7 - -i <= 104) {
		i_5_ = (1 + i >> -287861567) + arg7;
		i_6_ = arg7 + (i >> -1124603743);
	    } else {
		i_5_ = arg7 + 1;
		i_6_ = arg7;
	    }
	    int[][] is = Class136.anIntArrayArrayArray2496[arg3];
	    int i_7_ = (is[i_4_][i_5_] + (is[i_3_][i_6_] + is[i_4_][i_6_]
					  - -is[i_3_][i_5_])
			>> 1007824130);
	    int i_8_ = (arg6 << 707915879) + (i_2_ << 1010003526);
	    int i_9_ = (i << 78470630) + (arg7 << 955557831);
	    int[][] is_10_ = null;
	    if (arg0)
		is_10_ = InputStream_Sub1.anIntArrayArrayArray75[0];
	    else if (arg3 < 3)
		is_10_ = Class136.anIntArrayArrayArray2496[arg3 - -1];
	    long l = (long) (arg5 << 845787086 | (arg6 | arg7 << 1581492135)
			     | arg4 << 1061423284 | 0x40000000);
	    if ((class65.anInt1283 ^ 0xffffffff) == -1 || arg0)
		l |= ~0x7fffffffffffffffL;
	    if ((class65.anInt1253 ^ 0xffffffff) == -2)
		l |= 0x400000L;
	    if (class65.aBoolean1274)
		l |= 0x80000000L;
	    if (class65.method582((byte) -95))
		Class24.method221(arg7, class65, 128, arg1, null, arg6, null,
				  arg4);
	    if (arg10 == 2) {
		boolean bool = class65.aBoolean1299 & !arg0;
		l |= (long) arg2 << 380928864;
		if (arg5 == 22) {
		    if (InputStream_Sub1.aBoolean77 || class65.anInt1283 != 0
			|| (class65.anInt1308 ^ 0xffffffff) == -2
			|| class65.aBoolean1256) {
			Class131 class131;
			if (class65.anInt1273 != -1
			    || class65.anIntArray1244 != null
			    || class65.aBoolean1294)
			    class131
				= new Class131_Sub5(arg2, 22, arg4, arg3, arg6,
						    arg7, class65.anInt1273,
						    class65.aBoolean1276,
						    null);
			else {
			    Class143 class143
				= class65.method584(is_10_, 22, arg4, i_7_,
						    arg8, (byte) -46, is, null,
						    i_9_, i_8_, bool);
			    class131 = class143.aClass131_2581;
			}
			Class67_Sub1_Sub34.method773(arg1, arg6, arg7, i_7_,
						     class131, l,
						     class65.aBoolean1281);
			if (class65.anInt1308 == 1 && arg9 != null)
			    arg9.method1363(false, arg7, arg6);
		    }
		} else if (arg5 == 10 || arg5 == 11) {
		    Class131 class131;
		    if (class65.anInt1273 == -1
			&& class65.anIntArray1244 == null
			&& !class65.aBoolean1294) {
			Class143 class143
			    = class65.method584(is_10_, 10,
						arg5 != 11 ? arg4 : arg4 + 4,
						i_7_, arg8, (byte) -103, is,
						null, i_9_, i_8_, bool);
			class131 = class143.aClass131_2581;
		    } else
			class131
			    = new Class131_Sub5(arg2, 10,
						arg5 == 11 ? arg4 + 4 : arg4,
						arg3, arg6, arg7,
						class65.anInt1273,
						class65.aBoolean1276, null);
		    if (class131 != null) {
			boolean bool_11_
			    = Class67_Sub19.method1262(arg1, arg6, arg7, i_7_,
						       i_2_, i, class131, 0,
						       l);
			if (class65.aBoolean1317 && bool_11_ && arg8) {
			    int i_12_ = 15;
			    if (class131 instanceof Class131_Sub6) {
				i_12_
				    = (((Class131_Sub6) class131).method1838()
				       / 4);
				if (i_12_ > 30)
				    i_12_ = 30;
			    }
			    for (int i_13_ = 0; i_13_ <= i_2_; i_13_++) {
				for (int i_14_ = 0; i >= i_14_; i_14_++) {
				    if ((Class73.aByteArrayArrayArray1480[arg1]
					 [i_13_ + arg6][arg7 + i_14_])
					< i_12_)
					Class73.aByteArrayArrayArray1480
					    [arg1][arg6 - -i_13_][i_14_ + arg7]
					    = (byte) i_12_;
				}
			    }
			}
		    }
		    if ((class65.anInt1308 ^ 0xffffffff) != -1 && arg9 != null)
			arg9.method1362(i, (byte) 70, class65.aBoolean1278,
					i_2_, arg6, arg7);
		} else if ((arg5 ^ 0xffffffff) <= -13) {
		    Class131 class131;
		    if (class65.anInt1273 == -1
			&& class65.anIntArray1244 == null
			&& !class65.aBoolean1294) {
			Class143 class143
			    = class65.method584(is_10_, arg5, arg4, i_7_, arg8,
						(byte) -98, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    } else
			class131
			    = new Class131_Sub5(arg2, arg5, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    Class67_Sub19.method1262(arg1, arg6, arg7, i_7_, 1, 1,
					     class131, 0, l);
		    if (arg8 && (arg5 ^ 0xffffffff) <= -13 && arg5 <= 17
			&& (arg5 ^ 0xffffffff) != -14 && arg1 > 0)
			Class67_Sub1_Sub31.anIntArrayArrayArray4295[arg1]
			    [arg6][arg7]
			    = (Class67_Sub20.method1273
			       ((Class67_Sub1_Sub31.anIntArrayArrayArray4295
				 [arg1][arg6][arg7]),
				4));
		    if ((class65.anInt1308 ^ 0xffffffff) != -1 && arg9 != null)
			arg9.method1362(i, (byte) 70, class65.aBoolean1278,
					i_2_, arg6, arg7);
		} else if (arg5 == 0) {
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294)
			class131
			    = new Class131_Sub5(arg2, 0, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    else {
			Class143 class143
			    = class65.method584(is_10_, 0, arg4, i_7_, arg8,
						(byte) -112, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    }
		    Class4.method77(arg1, arg6, arg7, i_7_, class131, null,
				    Class67_Sub5_Sub6.anIntArray4535[arg4], 0,
				    l);
		    if (arg8) {
			if ((arg4 ^ 0xffffffff) != -1) {
			    if ((arg4 ^ 0xffffffff) == -2) {
				if (class65.aBoolean1317) {
				    Class73.aByteArrayArrayArray1480[arg1]
					[arg6][1 + arg7]
					= (byte) 50;
				    Class73.aByteArrayArrayArray1480[arg1]
					[1 + arg6][arg7 + 1]
					= (byte) 50;
				}
				if (class65.aBoolean1263)
				    Class67_Sub1_Sub31
					.anIntArrayArrayArray4295[arg1][arg6]
					[arg7 + 1]
					= (Class67_Sub20.method1273
					   ((Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[arg1]
					     [arg6][arg7 + 1]),
					    2));
			    } else if ((arg4 ^ 0xffffffff) != -3) {
				if (arg4 == 3) {
				    if (class65.aBoolean1317) {
					Class73.aByteArrayArrayArray1480
					    [arg1][arg6][arg7]
					    = (byte) 50;
					Class73.aByteArrayArrayArray1480
					    [arg1][1 + arg6][arg7]
					    = (byte) 50;
				    }
				    if (class65.aBoolean1263)
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[arg1]
					    [arg6][arg7]
					    = (Class67_Sub20.method1273
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [arg1][arg6][arg7]),
						2));
				}
			    } else {
				if (class65.aBoolean1317) {
				    Class73.aByteArrayArrayArray1480[arg1]
					[1 + arg6][arg7]
					= (byte) 50;
				    Class73.aByteArrayArrayArray1480[arg1]
					[arg6 + 1][arg7 - -1]
					= (byte) 50;
				}
				if (class65.aBoolean1263)
				    Class67_Sub1_Sub31
					.anIntArrayArrayArray4295[arg1]
					[1 + arg6][arg7]
					= (Class67_Sub20.method1273
					   ((Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[arg1]
					     [1 + arg6][arg7]),
					    1));
			    }
			} else {
			    if (class65.aBoolean1317) {
				Class73.aByteArrayArrayArray1480[arg1]
				    [arg6][arg7]
				    = (byte) 50;
				Class73.aByteArrayArrayArray1480[arg1]
				    [arg6][1 + arg7]
				    = (byte) 50;
			    }
			    if (class65.aBoolean1263)
				Class67_Sub1_Sub31.anIntArrayArrayArray4295
				    [arg1][arg6][arg7]
				    = (Class67_Sub20.method1273
				       ((Class67_Sub1_Sub31
					 .anIntArrayArrayArray4295[arg1][arg6]
					 [arg7]),
					1));
			}
		    }
		    if ((class65.anInt1308 ^ 0xffffffff) != -1 && arg9 != null)
			arg9.method1372(arg7, true, arg6, arg5,
					class65.aBoolean1278, arg4);
		    if (class65.anInt1291 != 16)
			Class9.method106(arg1, arg6, arg7, class65.anInt1291);
		} else if ((arg5 ^ 0xffffffff) == -2) {
		    Class131 class131;
		    if (class65.anInt1273 != -1
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294)
			class131
			    = new Class131_Sub5(arg2, 1, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    else {
			Class143 class143
			    = class65.method584(is_10_, 1, arg4, i_7_, arg8,
						(byte) -100, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    }
		    Class4.method77(arg1, arg6, arg7, i_7_, class131, null,
				    Class94.anIntArray1899[arg4], 0, l);
		    if (class65.aBoolean1317 && arg8) {
			if (arg4 == 0)
			    Class73.aByteArrayArrayArray1480[arg1][arg6][(arg7
									  + 1)]
				= (byte) 50;
			else if (arg4 == 1)
			    Class73.aByteArrayArrayArray1480[arg1]
				[1 + arg6][1 + arg7]
				= (byte) 50;
			else if ((arg4 ^ 0xffffffff) != -3) {
			    if (arg4 == 3)
				Class73.aByteArrayArrayArray1480[arg1]
				    [arg6][arg7]
				    = (byte) 50;
			} else
			    Class73.aByteArrayArrayArray1480[arg1]
				[arg6 + 1][arg7]
				= (byte) 50;
		    }
		    if (class65.anInt1308 != 0 && arg9 != null)
			arg9.method1372(arg7, true, arg6, arg5,
					class65.aBoolean1278, arg4);
		} else if (arg5 == 2) {
		    int i_15_ = 0x3 & arg4 + 1;
		    Class131 class131;
		    Class131 class131_16_;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294) {
			class131
			    = new Class131_Sub5(arg2, 2, arg4 + 4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
			class131_16_
			    = new Class131_Sub5(arg2, 2, i_15_, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    } else {
			Class143 class143
			    = class65.method584(is_10_, 2, 4 + arg4, i_7_,
						arg8, (byte) -47, is, null,
						i_9_, i_8_, bool);
			class131 = class143.aClass131_2581;
			class143 = class65.method584(is_10_, 2, i_15_, i_7_,
						     arg8, (byte) -56, is,
						     null, i_9_, i_8_, bool);
			class131_16_ = class143.aClass131_2581;
		    }
		    Class4.method77(arg1, arg6, arg7, i_7_, class131,
				    class131_16_,
				    Class67_Sub5_Sub6.anIntArray4535[arg4],
				    Class67_Sub5_Sub6.anIntArray4535[i_15_],
				    l);
		    if (class65.aBoolean1263 && arg8) {
			if ((arg4 ^ 0xffffffff) != -1) {
			    if (arg4 != 1) {
				if ((arg4 ^ 0xffffffff) != -3) {
				    if ((arg4 ^ 0xffffffff) == -4) {
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[arg1]
					    [arg6][arg7]
					    = (Class67_Sub20.method1273
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [arg1][arg6][arg7]),
						2));
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[arg1]
					    [arg6][arg7]
					    = (Class67_Sub20.method1273
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [arg1][arg6][arg7]),
						1));
				    }
				} else {
				    Class67_Sub1_Sub31
					.anIntArrayArrayArray4295[arg1]
					[1 + arg6][arg7]
					= (Class67_Sub20.method1273
					   ((Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[arg1]
					     [1 + arg6][arg7]),
					    1));
				    Class67_Sub1_Sub31
					.anIntArrayArrayArray4295[arg1][arg6]
					[arg7]
					= (Class67_Sub20.method1273
					   ((Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[arg1]
					     [arg6][arg7]),
					    2));
				}
			    } else {
				Class67_Sub1_Sub31.anIntArrayArrayArray4295
				    [arg1][arg6][arg7 + 1]
				    = (Class67_Sub20.method1273
				       ((Class67_Sub1_Sub31
					 .anIntArrayArrayArray4295[arg1][arg6]
					 [arg7 + 1]),
					2));
				Class67_Sub1_Sub31.anIntArrayArrayArray4295
				    [arg1][1 + arg6][arg7]
				    = (Class67_Sub20.method1273
				       ((Class67_Sub1_Sub31
					 .anIntArrayArrayArray4295[arg1]
					 [1 + arg6][arg7]),
					1));
			    }
			} else {
			    Class67_Sub1_Sub31.anIntArrayArrayArray4295
				[arg1][arg6][arg7]
				= (Class67_Sub20.method1273
				   ((Class67_Sub1_Sub31
				     .anIntArrayArrayArray4295[arg1][arg6]
				     [arg7]),
				    1));
			    Class67_Sub1_Sub31.anIntArrayArrayArray4295
				[arg1][arg6][arg7 + 1]
				= (Class67_Sub20.method1273
				   ((Class67_Sub1_Sub31
				     .anIntArrayArrayArray4295[arg1][arg6]
				     [arg7 + 1]),
				    2));
			}
		    }
		    if ((class65.anInt1308 ^ 0xffffffff) != -1 && arg9 != null)
			arg9.method1372(arg7, true, arg6, arg5,
					class65.aBoolean1278, arg4);
		    if ((class65.anInt1291 ^ 0xffffffff) != -17)
			Class9.method106(arg1, arg6, arg7, class65.anInt1291);
		} else if (arg5 == 3) {
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294)
			class131
			    = new Class131_Sub5(arg2, 3, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    else {
			Class143 class143
			    = class65.method584(is_10_, 3, arg4, i_7_, arg8,
						(byte) -100, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    }
		    Class4.method77(arg1, arg6, arg7, i_7_, class131, null,
				    Class94.anIntArray1899[arg4], 0, l);
		    if (class65.aBoolean1317 && arg8) {
			if ((arg4 ^ 0xffffffff) == -1)
			    Class73.aByteArrayArrayArray1480[arg1][arg6]
				[1 + arg7]
				= (byte) 50;
			else if ((arg4 ^ 0xffffffff) != -2) {
			    if ((arg4 ^ 0xffffffff) != -3) {
				if ((arg4 ^ 0xffffffff) == -4)
				    Class73.aByteArrayArrayArray1480[arg1]
					[arg6][arg7]
					= (byte) 50;
			    } else
				Class73.aByteArrayArrayArray1480[arg1]
				    [arg6 - -1][arg7]
				    = (byte) 50;
			} else
			    Class73.aByteArrayArrayArray1480[arg1]
				[arg6 + 1][arg7 - -1]
				= (byte) 50;
		    }
		    if ((class65.anInt1308 ^ 0xffffffff) != -1 && arg9 != null)
			arg9.method1372(arg7, true, arg6, arg5,
					class65.aBoolean1278, arg4);
		} else if (arg5 == 9) {
		    Class131 class131;
		    if (class65.anInt1273 == -1
			&& class65.anIntArray1244 == null
			&& !class65.aBoolean1294) {
			Class143 class143
			    = class65.method584(is_10_, arg5, arg4, i_7_, arg8,
						(byte) -89, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    } else
			class131
			    = new Class131_Sub5(arg2, arg5, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    Class67_Sub19.method1262(arg1, arg6, arg7, i_7_, 1, 1,
					     class131, 0, l);
		    if (class65.anInt1308 != 0 && arg9 != null)
			arg9.method1362(i, (byte) 70, class65.aBoolean1278,
					i_2_, arg6, arg7);
		    if ((class65.anInt1291 ^ 0xffffffff) != -17)
			Class9.method106(arg1, arg6, arg7, class65.anInt1291);
		} else if ((arg5 ^ 0xffffffff) == -5) {
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294)
			class131
			    = new Class131_Sub5(arg2, 4, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    else {
			Class143 class143
			    = class65.method584(is_10_, 4, arg4, i_7_, arg8,
						(byte) -43, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    }
		    Class37.method324(arg1, arg6, arg7, i_7_, class131, null,
				      Class67_Sub5_Sub6.anIntArray4535[arg4],
				      0, 0, 0, l);
		} else if ((arg5 ^ 0xffffffff) == -6) {
		    int i_17_ = 16;
		    long l_18_ = Class73.method1360(arg1, arg6, arg7);
		    if ((l_18_ ^ 0xffffffffffffffffL) != -1L)
			i_17_ = (Class73.method1359
				 (11525,
				  (int) (l_18_ >>> 1887752544) & 0x7fffffff)
				 .anInt1291);
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) == 0
			&& class65.anIntArray1244 == null
			&& !class65.aBoolean1294) {
			Class143 class143
			    = class65.method584(is_10_, 4, arg4, i_7_, arg8,
						(byte) -93, is, null, i_9_,
						i_8_, bool);
			class131 = class143.aClass131_2581;
		    } else
			class131
			    = new Class131_Sub5(arg2, 4, arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    Class37.method324(arg1, arg6, arg7, i_7_, class131, null,
				      Class67_Sub5_Sub6.anIntArray4535[arg4],
				      0, i_17_ * Class124.anIntArray2326[arg4],
				      i_17_ * Class19.anIntArray497[arg4], l);
		} else if ((arg5 ^ 0xffffffff) == -7) {
		    int i_19_ = 8;
		    long l_20_ = Class73.method1360(arg1, arg6, arg7);
		    if (l_20_ != 0L)
			i_19_ = (Class73.method1359
				 (11525,
				  (int) (l_20_ >>> -115835680) & 0x7fffffff)
				 .anInt1291) / 2;
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294)
			class131
			    = new Class131_Sub5(arg2, 4, 4 + arg4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    else {
			Class143 class143
			    = class65.method584(is_10_, 4, 4 + arg4, i_7_,
						arg8, (byte) -87, is, null,
						i_9_, i_8_, bool);
			class131 = class143.aClass131_2581;
		    }
		    Class37.method324(arg1, arg6, arg7, i_7_, class131, null,
				      256, arg4,
				      Class82.anIntArray1667[arg4] * i_19_,
				      Class61.anIntArray1137[arg4] * i_19_, l);
		} else if ((arg5 ^ 0xffffffff) == -8) {
		    int i_21_ = 0x3 & arg4 - -2;
		    Class131 class131;
		    if ((class65.anInt1273 ^ 0xffffffff) == 0
			&& class65.anIntArray1244 == null
			&& !class65.aBoolean1294) {
			Class143 class143
			    = class65.method584(is_10_, 4, 4 + i_21_, i_7_,
						arg8, (byte) -78, is, null,
						i_9_, i_8_, bool);
			class131 = class143.aClass131_2581;
		    } else
			class131
			    = new Class131_Sub5(arg2, 4, 4 + i_21_, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    Class37.method324(arg1, arg6, arg7, i_7_, class131, null,
				      256, i_21_, 0, 0, l);
		} else if (arg5 == 8) {
		    int i_22_ = 8;
		    long l_23_ = Class73.method1360(arg1, arg6, arg7);
		    if ((l_23_ ^ 0xffffffffffffffffL) != -1L)
			i_22_ = (Class73.method1359
				 (11525,
				  0x7fffffff & (int) (l_23_ >>> 465126304))
				 .anInt1291) / 2;
		    int i_24_ = 0x3 & 2 + arg4;
		    Class131 class131;
		    Class131 class131_25_;
		    if ((class65.anInt1273 ^ 0xffffffff) != 0
			|| class65.anIntArray1244 != null
			|| class65.aBoolean1294) {
			class131
			    = new Class131_Sub5(arg2, 4, arg4 - -4, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
			class131_25_
			    = new Class131_Sub5(arg2, 4, 4 + i_24_, arg3, arg6,
						arg7, class65.anInt1273,
						class65.aBoolean1276, null);
		    } else {
			Class143 class143
			    = class65.method584(is_10_, 4, arg4 + 4, i_7_,
						arg8, (byte) -94, is, null,
						i_9_, i_8_, bool);
			class131 = class143.aClass131_2581;
			class143
			    = class65.method584(is_10_, 4, i_24_ + 4, i_7_,
						arg8, (byte) -110, is, null,
						i_9_, i_8_, bool);
			class131_25_ = class143.aClass131_2581;
		    }
		    Class37.method324(arg1, arg6, arg7, i_7_, class131,
				      class131_25_, 256, arg4,
				      Class82.anIntArray1667[arg4] * i_22_,
				      Class61.anIntArray1137[arg4] * i_22_, l);
		}
	    }
	}
    }
    
    public static void method1485(int arg0) {
	aRSString_1869 = null;
	aRSString_1878 = null;
	if (arg0 != 1)
	    aRSString_1859 = null;
	aRSString_1866 = null;
	aClass50_1868 = null;
	aRSString_1859 = null;
	aRSString_1876 = null;
    }
    
    public static void method1486(boolean arg0, int arg1) {
	if (arg1 == -14896) {
	    anInt1861++;
	    for (int i = 0; (i ^ 0xffffffff) > (Class37.anInt794 ^ 0xffffffff);
		 i++) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = (Class128.aClass131_Sub7_Sub1Array2386
		       [Class47.anIntArray965[i]]);
		if (class131_sub7_sub1 != null
		    && class131_sub7_sub1.method1878((byte) 62)
		    && !class131_sub7_sub1.aClass64_5047.aBoolean1235 != arg0
		    && class131_sub7_sub1.aClass64_5047.method574(-38)) {
		    int i_26_ = class131_sub7_sub1.method1887((byte) -124);
		    if (i_26_ == 1) {
			if (((class131_sub7_sub1.anInt3733 & 0x7f ^ 0xffffffff)
			     == -65)
			    && (0x7f & class131_sub7_sub1.anInt3726) == 64) {
			    int i_27_
				= class131_sub7_sub1.anInt3726 >> -196578201;
			    int i_28_
				= class131_sub7_sub1.anInt3733 >> -1740655897;
			    if ((i_28_ ^ 0xffffffff) <= -1 && i_28_ < 104
				&& (i_27_ ^ 0xffffffff) <= -1 && i_27_ < 104)
				Class7.anIntArrayArray252[i_28_][i_27_]++;
			}
		    } else if (((i_26_ & 0x1 ^ 0xffffffff) != -1
				|| ((class131_sub7_sub1.anInt3733 & 0x7f) == 0
				    && ((class131_sub7_sub1.anInt3726 & 0x7f)
					== 0)))
			       && ((i_26_ & 0x1) != 1
				   || ((0x7f & class131_sub7_sub1.anInt3733
					^ 0xffffffff) == -65
				       && (0x7f & class131_sub7_sub1.anInt3726
					   ^ 0xffffffff) == -65))) {
			int i_29_
			    = (-(i_26_ * 64) + class131_sub7_sub1.anInt3733
			       >> -991618457);
			int i_30_
			    = (-(64 * i_26_) + class131_sub7_sub1.anInt3726
			       >> 1274494983);
			int i_31_
			    = (i_29_
			       + class131_sub7_sub1.method1887((byte) -104));
			if (i_31_ > 104)
			    i_31_ = 104;
			if (i_29_ < 0)
			    i_29_ = 0;
			int i_32_ = (class131_sub7_sub1.method1887((byte) -41)
				     + i_30_);
			if ((i_30_ ^ 0xffffffff) > -1)
			    i_30_ = 0;
			if ((i_32_ ^ 0xffffffff) < -105)
			    i_32_ = 104;
			for (int i_33_ = i_29_; i_31_ > i_33_; i_33_++) {
			    for (int i_34_ = i_30_; i_32_ > i_34_; i_34_++)
				Class7.anIntArrayArray252[i_33_][i_34_]++;
			}
		    }
		}
	    }
	    for (int i = 0; Class37.anInt794 > i; i++) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = (Class128.aClass131_Sub7_Sub1Array2386
		       [Class47.anIntArray965[i]]);
		long l = (0x20000000L
			  | (long) Class47.anIntArray965[i] << -978232736);
		if (class131_sub7_sub1 != null
		    && class131_sub7_sub1.method1878((byte) 62)
		    && class131_sub7_sub1.aClass64_5047.aBoolean1235 != !arg0
		    && class131_sub7_sub1.aClass64_5047.method574(-118)) {
		    int i_35_ = class131_sub7_sub1.method1887((byte) -39);
		    if (i_35_ != 1) {
			if (((i_35_ & 0x1) == 0
			     && (0x7f & class131_sub7_sub1.anInt3733
				 ^ 0xffffffff) == -1
			     && (0x7f & class131_sub7_sub1.anInt3726
				 ^ 0xffffffff) == -1)
			    || ((i_35_ & 0x1 ^ 0xffffffff) == -2
				&& (class131_sub7_sub1.anInt3733 & 0x7f
				    ^ 0xffffffff) == -65
				&& (0x7f & class131_sub7_sub1.anInt3726
				    ^ 0xffffffff) == -65)) {
			    int i_36_
				= (class131_sub7_sub1.anInt3733 + -(i_35_ * 64)
				   >> -1831559801);
			    int i_37_
				= (class131_sub7_sub1.anInt3726 + -(i_35_ * 64)
				   >> -2137897081);
			    int i_38_ = i_37_ + i_35_;
			    if (i_37_ < 0)
				i_37_ = 0;
			    int i_39_ = i_36_ + i_35_;
			    if ((i_38_ ^ 0xffffffff) < -105)
				i_38_ = 104;
			    boolean bool = true;
			    if ((i_39_ ^ 0xffffffff) < -105)
				i_39_ = 104;
			    if ((i_36_ ^ 0xffffffff) > -1)
				i_36_ = 0;
			    for (int i_40_ = i_36_;
				 (i_39_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff);
				 i_40_++) {
				for (int i_41_ = i_37_; i_38_ > i_41_;
				     i_41_++) {
				    if (((Class7.anIntArrayArray252[i_40_]
					  [i_41_])
					 ^ 0xffffffff)
					>= -2) {
					bool = false;
					break;
				    }
				}
			    }
			    if (bool) {
				for (int i_42_ = i_36_;
				     ((i_39_ ^ 0xffffffff)
				      < (i_42_ ^ 0xffffffff));
				     i_42_++) {
				    for (int i_43_ = i_37_;
					 ((i_43_ ^ 0xffffffff)
					  > (i_38_ ^ 0xffffffff));
					 i_43_++)
					Class7.anIntArrayArray252[i_42_]
					    [i_43_]--;
				}
				continue;
			    }
			}
		    } else if ((0x7f & class131_sub7_sub1.anInt3733
				^ 0xffffffff) == -65
			       && ((class131_sub7_sub1.anInt3726 & 0x7f)
				   == 64)) {
			int i_44_ = class131_sub7_sub1.anInt3733 >> -366370297;
			int i_45_ = class131_sub7_sub1.anInt3726 >> -446404473;
			if (i_44_ < 0 || i_44_ >= 104
			    || (i_45_ ^ 0xffffffff) > -1 || i_45_ >= 104)
			    continue;
			if ((Class7.anIntArrayArray252[i_44_][i_45_]
			     ^ 0xffffffff)
			    < -2) {
			    Class7.anIntArrayArray252[i_44_][i_45_]--;
			    continue;
			}
		    }
		    if (!class131_sub7_sub1.aClass64_5047.aBoolean1232)
			l |= ~0x7fffffffffffffffL;
		    class131_sub7_sub1.anInt3715
			= Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						   (class131_sub7_sub1
						    .anInt3733),
						   (class131_sub7_sub1
						    .anInt3726),
						   (byte) -106);
		    Class131_Sub7.method1885(Canvas_Sub1.anInt59,
					     class131_sub7_sub1.anInt3733,
					     class131_sub7_sub1.anInt3726,
					     class131_sub7_sub1.anInt3715,
					     60 + 64 * (i_35_ - 1),
					     class131_sub7_sub1,
					     class131_sub7_sub1.anInt3740, l,
					     class131_sub7_sub1.aBoolean3699);
		}
	    }
	}
    }
    
    public int method1487(byte arg0) {
	anInt1860++;
	int i = 0;
	int i_46_ = 0;
	if (arg0 != -107)
	    method1478(true);
	for (/**/; i_46_ < anInt1863; i_46_++) {
	    Class67 class67 = aClass67Array1872[i_46_];
	    for (Class67 class67_47_ = class67.aClass67_1340;
		 class67 != class67_47_;
		 class67_47_ = class67_47_.aClass67_1340)
		i++;
	}
	return i;
    }
    
    public void method1488(byte arg0, Class67 arg1, long arg2) {
	try {
	    if (arg1.aClass67_1349 != null)
		arg1.method606((byte) -118);
	    anInt1871++;
	    Class67 class67
		= aClass67Array1872[(int) ((long) (-1 + anInt1863) & arg2)];
	    arg1.aLong1344 = arg2;
	    arg1.aClass67_1340 = class67;
	    arg1.aClass67_1349 = class67.aClass67_1349;
	    arg1.aClass67_1349.aClass67_1340 = arg1;
	    if (arg0 != -89)
		method1485(0);
	    arg1.aClass67_1340.aClass67_1349 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("nc.H(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class92(int arg0) {
	aClass67Array1872 = new Class67[arg0];
	anInt1863 = arg0;
	for (int i = 0; arg0 > i; i++) {
	    Class67 class67 = aClass67Array1872[i] = new Class67();
	    class67.aClass67_1340 = class67;
	    class67.aClass67_1349 = class67;
	}
    }
    
    public Class67 method1489(byte arg0, long arg1) {
	try {
	    aLong1879 = arg1;
	    if (arg0 > -12)
		aClass67Array1872 = null;
	    anInt1875++;
	    Class67 class67
		= aClass67Array1872[(int) ((long) (anInt1863 + -1) & arg1)];
	    for (aClass67_1867 = class67.aClass67_1340;
		 class67 != aClass67_1867;
		 aClass67_1867 = aClass67_1867.aClass67_1340) {
		if ((aClass67_1867.aLong1344 ^ 0xffffffffffffffffL)
		    == (arg1 ^ 0xffffffffffffffffL)) {
		    Class67 class67_48_ = aClass67_1867;
		    aClass67_1867 = aClass67_1867.aClass67_1340;
		    return class67_48_;
		}
	    }
	    aClass67_1867 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("nc.F(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    static {
	aRSString_1859 = Class134.method1914("Loading config )2 ", (byte) 107);
	aRSString_1866 = aRSString_1869;
	aRSString_1876 = Class134.method1914("(U4", (byte) 91);
	aRSString_1878 = aRSString_1859;
	aClass50_1868 = new Class50();
    }
}
