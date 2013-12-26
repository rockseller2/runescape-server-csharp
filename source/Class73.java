/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class73
{
    public static int anInt1450;
    public static int anInt1451;
    public static RSString aRSString_1452
	= Class134.method1914("http:)4)4", (byte) 111);
    public int[][] anIntArrayArray1453;
    public static int anInt1454;
    public static int anInt1455;
    public int anInt1456;
    public static int anInt1457;
    public static int anInt1458;
    public static int anInt1459;
    public static int anInt1460;
    public static int anInt1461;
    public static int[] anIntArray1462;
    public static int anInt1463;
    public static int[][] anIntArrayArray1464;
    public static Class137 aClass137_1465 = new Class137(64);
    public static int anInt1466;
    public static int anInt1467;
    public static Class9 aClass9_1468;
    public static int anInt1469;
    public int anInt1470;
    public static int anInt1471;
    public static int anInt1472;
    public int anInt1473;
    public static Class70_Sub1[] aClass70_Sub1Array1474 = new Class70_Sub1[0];
    public static int anInt1475;
    public static int anInt1476;
    public static int anInt1477;
    public int anInt1478;
    public static int anInt1479;
    public static byte[][][] aByteArrayArrayArray1480;
    public static int anInt1481;
    
    public boolean method1351(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7, int arg8) {
	anInt1477++;
	if ((arg6 + arg5 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
	    || (arg5 ^ 0xffffffff) <= (arg7 - -arg3 ^ 0xffffffff))
	    return false;
	if (arg2 != 0)
	    anIntArrayArray1453 = null;
	if ((arg1 + arg4 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
	    || (arg8 + arg0 ^ 0xffffffff) >= (arg1 ^ 0xffffffff))
	    return false;
	return true;
    }
    
    public void method1352(int arg0, int arg1, byte arg2, int arg3) {
	if (arg2 > -40)
	    method1361(110, 34, 51, -104, 23, 126, -49, -67);
	anInt1481++;
	anIntArrayArray1453[arg1][arg3]
	    = Class67_Sub20.method1273(anIntArrayArray1453[arg1][arg3], arg0);
    }
    
    public void method1353(int arg0, int arg1, int arg2, int arg3, int arg4,
			   boolean arg5) {
	arg0 -= anInt1456;
	anInt1472++;
	arg2 -= anInt1473;
	if (arg1 != -1)
	    anIntArrayArray1453 = null;
	if (arg3 == 0) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method1371(128, arg2, (byte) 49, arg0);
		method1371(8, -1 + arg2, (byte) 87, arg0);
	    }
	    if (arg4 == 1) {
		method1371(2, arg2, (byte) 92, arg0);
		method1371(32, arg2, (byte) 64, arg0 + 1);
	    }
	    if (arg4 == 2) {
		method1371(8, arg2, (byte) -73, arg0);
		method1371(128, 1 + arg2, (byte) -80, arg0);
	    }
	    if (arg4 == 3) {
		method1371(32, arg2, (byte) 103, arg0);
		method1371(2, arg2, (byte) 115, arg0 + -1);
	    }
	}
	if (arg3 == 1 || (arg3 ^ 0xffffffff) == -4) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method1371(1, arg2, (byte) -89, arg0);
		method1371(16, -1 + arg2, (byte) -76, 1 + arg0);
	    }
	    if ((arg4 ^ 0xffffffff) == -2) {
		method1371(4, arg2, (byte) 95, arg0);
		method1371(64, 1 + arg2, (byte) 123, 1 + arg0);
	    }
	    if (arg4 == 2) {
		method1371(16, arg2, (byte) 72, arg0);
		method1371(1, 1 + arg2, (byte) -127, arg0 + -1);
	    }
	    if (arg4 == 3) {
		method1371(64, arg2, (byte) -127, arg0);
		method1371(4, arg2 - 1, (byte) -74, arg0 - 1);
	    }
	}
	if (arg3 == 2) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method1371(130, arg2, (byte) -74, arg0);
		method1371(8, -1 + arg2, (byte) 69, arg0);
		method1371(32, arg2, (byte) -86, 1 + arg0);
	    }
	    if (arg4 == 1) {
		method1371(10, arg2, (byte) 76, arg0);
		method1371(32, arg2, (byte) 122, arg0 - -1);
		method1371(128, 1 + arg2, (byte) 109, arg0);
	    }
	    if (arg4 == 2) {
		method1371(40, arg2, (byte) 93, arg0);
		method1371(128, 1 + arg2, (byte) 113, arg0);
		method1371(2, arg2, (byte) -118, arg0 - 1);
	    }
	    if (arg4 == 3) {
		method1371(160, arg2, (byte) 124, arg0);
		method1371(2, arg2, (byte) -113, arg0 - 1);
		method1371(8, arg2 - 1, (byte) -89, arg0);
	    }
	}
	if (arg5) {
	    if ((arg3 ^ 0xffffffff) == -1) {
		if (arg4 == 0) {
		    method1371(65536, arg2, (byte) 87, arg0);
		    method1371(4096, -1 + arg2, (byte) 61, arg0);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method1371(1024, arg2, (byte) -122, arg0);
		    method1371(16384, arg2, (byte) 83, 1 + arg0);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method1371(4096, arg2, (byte) 65, arg0);
		    method1371(65536, arg2 + 1, (byte) -78, arg0);
		}
		if (arg4 == 3) {
		    method1371(16384, arg2, (byte) -126, arg0);
		    method1371(1024, arg2, (byte) 81, -1 + arg0);
		}
	    }
	    if ((arg3 ^ 0xffffffff) == -2 || arg3 == 3) {
		if ((arg4 ^ 0xffffffff) == -1) {
		    method1371(512, arg2, (byte) -109, arg0);
		    method1371(8192, arg2 + -1, (byte) -81, arg0 - -1);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method1371(2048, arg2, (byte) -105, arg0);
		    method1371(32768, arg2 + 1, (byte) 55, 1 + arg0);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method1371(8192, arg2, (byte) -97, arg0);
		    method1371(512, arg2 - -1, (byte) -76, -1 + arg0);
		}
		if (arg4 == 3) {
		    method1371(32768, arg2, (byte) -91, arg0);
		    method1371(2048, -1 + arg2, (byte) 119, -1 + arg0);
		}
	    }
	    if (arg3 == 2) {
		if (arg4 == 0) {
		    method1371(66560, arg2, (byte) 108, arg0);
		    method1371(4096, -1 + arg2, (byte) -106, arg0);
		    method1371(16384, arg2, (byte) -81, arg0 + 1);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method1371(5120, arg2, (byte) 96, arg0);
		    method1371(16384, arg2, (byte) 55, arg0 - -1);
		    method1371(65536, arg2 - -1, (byte) -123, arg0);
		}
		if (arg4 == 2) {
		    method1371(20480, arg2, (byte) -125, arg0);
		    method1371(65536, arg2 + 1, (byte) -114, arg0);
		    method1371(1024, arg2, (byte) 68, arg0 + -1);
		}
		if (arg4 == 3) {
		    method1371(81920, arg2, (byte) 115, arg0);
		    method1371(1024, arg2, (byte) 80, -1 + arg0);
		    method1371(4096, -1 + arg2, (byte) 106, arg0);
		}
	    }
	}
    }
    
    public boolean method1354(int arg0, int arg1, int arg2, int arg3, int arg4,
			      byte arg5, int arg6, int arg7, int arg8,
			      int arg9) {
	anInt1475++;
	int i = arg6 + arg2;
	int i_0_ = arg9 + arg1;
	int i_1_ = arg8 + arg0;
	if (arg5 > -22)
	    method1359(127, 50);
	int i_2_ = arg4 - -arg3;
	if ((arg4 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)
	    && (i_2_ ^ 0xffffffff) < (arg2 ^ 0xffffffff)) {
	    if (i_0_ != arg8 || (0x4 & arg7) != 0) {
		if (arg1 == i_1_ && (0x1 & arg7 ^ 0xffffffff) == -1) {
		    int i_3_ = arg2;
		    for (int i_4_ = ((i_2_ ^ 0xffffffff) <= (i ^ 0xffffffff)
				     ? i : i_2_);
			 (i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
			if (((anIntArrayArray1453[i_3_ + -anInt1473]
			      [arg1 - anInt1456]) & 0x20
			     ^ 0xffffffff)
			    == -1)
			    return true;
		    }
		}
	    } else {
		int i_5_ = arg2;
		for (int i_6_ = i_2_ < i ? i_2_ : i;
		     (i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_5_++) {
		    if (((anIntArrayArray1453[-anInt1473 + i_5_]
			  [-1 + -anInt1456 + i_0_])
			 & 0x2)
			== 0)
			return true;
		}
	    }
	} else if (i > arg4 && (i_2_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
	    if (i_0_ != arg8 || (arg7 & 0x4) != 0) {
		if ((i_1_ ^ 0xffffffff) == (arg1 ^ 0xffffffff)
		    && (0x1 & arg7) == 0) {
		    for (int i_7_ = arg4; i_7_ < i; i_7_++) {
			if ((0x20 & (anIntArrayArray1453[i_7_ - anInt1473]
				     [arg1 + -anInt1456])
			     ^ 0xffffffff)
			    == -1)
			    return true;
		    }
		}
	    } else {
		for (int i_8_ = arg4; i > i_8_; i_8_++) {
		    if ((0x2 & (anIntArrayArray1453[i_8_ - anInt1473]
				[-1 + -anInt1456 + i_0_]))
			== 0)
			return true;
		}
	    }
	} else if ((arg1 ^ 0xffffffff) > (arg8 ^ 0xffffffff)
		   || (i_1_ ^ 0xffffffff) >= (arg1 ^ 0xffffffff)) {
	    if (i_0_ > arg8 && i_0_ <= i_1_) {
		if (i != arg4 || (0x8 & arg7) != 0) {
		    if (arg2 == i_2_ && (0x2 & arg7 ^ 0xffffffff) == -1) {
			for (int i_9_ = arg8; i_0_ > i_9_; i_9_++) {
			    if ((0x80 & (anIntArrayArray1453[-anInt1473 + arg2]
					 [i_9_ + -anInt1456]))
				== 0)
				return true;
			}
		    }
		} else {
		    for (int i_10_ = arg8; i_0_ > i_10_; i_10_++) {
			if (((anIntArrayArray1453[-1 + -anInt1473 + i]
			      [i_10_ + -anInt1456]) & 0x8
			     ^ 0xffffffff)
			    == -1)
			    return true;
		    }
		}
	    }
	} else if (arg4 != i || (arg7 & 0x8) != 0) {
	    if ((i_2_ ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		&& (arg7 & 0x2 ^ 0xffffffff) == -1) {
		int i_11_ = i_0_ <= i_1_ ? i_0_ : i_1_;
		for (int i_12_ = arg1;
		     (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++) {
		    if ((0x80 & (anIntArrayArray1453[-anInt1473 + arg2]
				 [i_12_ - anInt1456])
			 ^ 0xffffffff)
			== -1)
			return true;
		}
	    }
	} else {
	    int i_13_
		= (i_0_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff) ? i_0_ : i_1_;
	    for (int i_14_ = arg1; (i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff);
		 i_14_++) {
		if ((0x8 & (anIntArrayArray1453[i + -anInt1473 + -1]
			    [-anInt1456 + i_14_]))
		    == 0)
		    return true;
	    }
	}
	return false;
    }
    
    public static void method1355(Component arg0, int arg1) {
	arg0.removeMouseListener(Class6.aClass133_154);
	anInt1457++;
	arg0.removeMouseMotionListener(Class6.aClass133_154);
	arg0.removeFocusListener(Class6.aClass133_154);
	Class87.anInt1813 = arg1;
    }
    
    public static void method1356(int arg0) {
	Class67_Sub8.aClass136_2964.method1922(0);
	Class82.aClass136_1661.method1922(0);
	anInt1450++;
	Class67_Sub1_Sub34.aClass136_4332.method1922(0);
	int i = -22 / ((3 - arg0) / 48);
	Class132.aClass136_2439.method1922(0);
    }
    
    public void method1357(int arg0) {
	for (int i = 0; (i ^ 0xffffffff) > (anInt1478 ^ 0xffffffff); i++) {
	    for (int i_15_ = 0; anInt1470 > i_15_; i_15_++) {
		if (i == 0 || i_15_ == 0
		    || (i ^ 0xffffffff) <= (anInt1478 + -5 ^ 0xffffffff)
		    || anInt1470 - 5 <= i_15_)
		    anIntArrayArray1453[i][i_15_] = 16777215;
		else
		    anIntArrayArray1453[i][i_15_] = 16777216;
	    }
	}
	anInt1455++;
	if (arg0 <= 7)
	    aByteArrayArrayArray1480 = null;
    }
    
    public void method1358(int arg0, int arg1, int arg2) {
	if (arg2 == -26742) {
	    anInt1466++;
	    arg0 -= anInt1456;
	    arg1 -= anInt1473;
	    anIntArrayArray1453[arg1][arg0]
		= Class67_Sub20.method1273(anIntArrayArray1453[arg1][arg0],
					   2097152);
	}
    }
    
    public static Class65 method1359(int arg0, int arg1) { //load Objects finally found it.
	Class65 class65
	    = ((Class65)
	       Class67_Sub8.aClass136_2964.method1924((long) arg1, false));
	anInt1460++;
	if (class65 != null)
	    return class65;
	byte[] is
	    = Stream.aClass9_2924.method138(arg0 + -809624190,
						  Class105.method1566(arg1,
								      true),
						  Class33_Sub2.method299(arg1,
									 -26));
	class65 = new Class65();
	class65.lastLoadedObjectId = arg1; //current Object loaded id.

	if (is != null)
	    class65.loadObjects(new Stream(is), arg0 + -4102); //object Stream
	    /*
	    //...custom dump code...
	    if (is != null) {
	           //System.out.println("lastLoadedObjectId = " + class65.lastLoadedObjectId);
		    class65.loadObjects(new Stream(is), arg0 + -4102); //object Stream
	            try {
	                java.io.FileOutputStream file = new java.io.FileOutputStream("./Objects/Data/" + class65.lastLoadedObjectId + ".dat");
	                file.write(is, 0, is.length);
	                file.flush();
	                file.close();
	            }
	            catch (java.io.IOException e) {
	                e.printStackTrace();
	            }
	      }
	    //... end of custom dump code .../
	    */
	class65.method593(114);
	if (!Class67_Sub20.aBoolean3164 && class65.aBoolean1309)
	    class65.aRSStringArray1302 = null;
	if (class65.aBoolean1245) {
	    class65.aBoolean1278 = false;
	    class65.anInt1308 = 0;
	}
	if (arg0 != 11525)
	    return null;
	Class67_Sub8.aClass136_2964.method1926((long) arg1, class65,
					       (byte) -71);
	return class65;
    }
    
    public static long method1360(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null || class67_sub24.aClass58_3221 == null)
	    return 0L;
	return class67_sub24.aClass58_3221.aLong1118;
    }
    
    public boolean method1361(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
	anInt1469++;
	if (arg2 == 1) {
	    if (arg1 == arg3 && arg6 == arg5)
		return true;
	} else if (arg1 <= arg3 && arg3 <= arg2 + arg1 - 1
		   && (arg6 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
		   && -1 + (arg2 + arg6) >= arg6)
	    return true;
	arg5 -= anInt1456;
	arg1 -= anInt1473;
	arg3 -= anInt1473;
	if (arg4 > -4)
	    anInt1470 = -109;
	arg6 -= anInt1456;
	if (arg2 == 1) {
	    if ((arg0 ^ 0xffffffff) == -1) {
		if ((arg7 ^ 0xffffffff) == -1) {
		    if (arg1 == -1 + arg3 && arg6 == arg5)
			return true;
		    if (arg1 == arg3 && arg5 == arg6 + 1
			&& (anIntArrayArray1453[arg1][arg5] & 0x12c0120) == 0)
			return true;
		    if (arg1 == arg3
			&& (arg5 ^ 0xffffffff) == (arg6 - 1 ^ 0xffffffff)
			&& (anIntArrayArray1453[arg1][arg5] & 0x12c0102) == 0)
			return true;
		} else if ((arg7 ^ 0xffffffff) != -2) {
		    if (arg7 != 2) {
			if ((arg7 ^ 0xffffffff) == -4) {
			    if (arg3 == arg1 && -1 + arg6 == arg5)
				return true;
			    if ((arg3 + -1 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
				&& arg6 == arg5
				&& (anIntArrayArray1453[arg1][arg5] & 0x12c0108
				    ^ 0xffffffff) == -1)
				return true;
			    if (arg3 - -1 == arg1 && arg6 == arg5
				&& (anIntArrayArray1453[arg1][arg5] & 0x12c0180
				    ^ 0xffffffff) == -1)
				return true;
			}
		    } else {
			if ((1 + arg3 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			    && (arg5 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
			    return true;
			if (arg3 == arg1 && arg5 == arg6 + 1
			    && ((0x12c0120 & anIntArrayArray1453[arg1][arg5])
				== 0))
			    return true;
			if (arg1 == arg3 && arg5 == -1 + arg6
			    && ((0x12c0102 & anIntArrayArray1453[arg1][arg5])
				== 0))
			    return true;
		    }
		} else {
		    if ((arg3 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			&& (1 + arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff))
			return true;
		    if (arg1 == arg3 + -1
			&& (arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			&& (0x12c0108 & anIntArrayArray1453[arg1][arg5]) == 0)
			return true;
		    if (arg1 == arg3 - -1 && arg6 == arg5
			&& (0x12c0180 & anIntArrayArray1453[arg1][arg5]) == 0)
			return true;
		}
	    }
	    if ((arg0 ^ 0xffffffff) == -3) {
		if ((arg7 ^ 0xffffffff) == -1) {
		    if ((arg1 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
			&& (arg5 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
			return true;
		    if (arg1 == arg3
			&& (arg5 ^ 0xffffffff) == (arg6 + 1 ^ 0xffffffff))
			return true;
		    if ((arg1 ^ 0xffffffff) == (1 + arg3 ^ 0xffffffff)
			&& (arg5 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			&& (0x12c0180 & anIntArrayArray1453[arg1][arg5]
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg1 == arg3 && -1 + arg6 == arg5
			&& (anIntArrayArray1453[arg1][arg5] & 0x12c0102
			    ^ 0xffffffff) == -1)
			return true;
		} else if ((arg7 ^ 0xffffffff) == -2) {
		    if ((arg1 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
			&& arg5 == arg6
			&& (0x12c0108 & anIntArrayArray1453[arg1][arg5]
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg1 == arg3 && arg5 == arg6 + 1)
			return true;
		    if (arg1 == 1 + arg3 && arg5 == arg6)
			return true;
		    if (arg3 == arg1
			&& (arg5 ^ 0xffffffff) == (arg6 - 1 ^ 0xffffffff)
			&& (0x12c0102 & anIntArrayArray1453[arg1][arg5]) == 0)
			return true;
		} else if (arg7 != 2) {
		    if ((arg7 ^ 0xffffffff) == -4) {
			if ((arg1 ^ 0xffffffff) == (-1 + arg3 ^ 0xffffffff)
			    && arg6 == arg5)
			    return true;
			if (arg1 == arg3
			    && (arg5 ^ 0xffffffff) == (1 + arg6 ^ 0xffffffff)
			    && ((0x12c0120 & anIntArrayArray1453[arg1][arg5])
				== 0))
			    return true;
			if (arg3 + 1 == arg1
			    && (arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			    && (anIntArrayArray1453[arg1][arg5] & 0x12c0180
				^ 0xffffffff) == -1)
			    return true;
			if ((arg1 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && arg5 == -1 + arg6)
			    return true;
		    }
		} else {
		    if (-1 + arg3 == arg1
			&& (arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			&& (anIntArrayArray1453[arg1][arg5] & 0x12c0108) == 0)
			return true;
		    if (arg3 == arg1 && arg5 == arg6 - -1
			&& (0x12c0120 & anIntArrayArray1453[arg1][arg5]
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg3 - -1 == arg1 && arg5 == arg6)
			return true;
		    if ((arg3 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			&& (arg5 ^ 0xffffffff) == (arg6 + -1 ^ 0xffffffff))
			return true;
		}
	    }
	    if ((arg0 ^ 0xffffffff) == -10) {
		if (arg3 == arg1
		    && (arg6 + 1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		    && (0x20 & anIntArrayArray1453[arg1][arg5]) == 0)
		    return true;
		if ((arg3 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
		    && arg5 == arg6 + -1
		    && ((anIntArrayArray1453[arg1][arg5] & 0x2 ^ 0xffffffff)
			== -1))
		    return true;
		if (arg1 == arg3 + -1 && arg5 == arg6
		    && (0x8 & anIntArrayArray1453[arg1][arg5]) == 0)
		    return true;
		if (1 + arg3 == arg1
		    && (arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		    && (anIntArrayArray1453[arg1][arg5] & 0x80) == 0)
		    return true;
	    }
	} else {
	    int i = -1 + (arg1 - -arg2);
	    int i_16_ = arg5 - (-arg2 + 1);
	    if (arg0 == 0) {
		if ((arg7 ^ 0xffffffff) != -1) {
		    if ((arg7 ^ 0xffffffff) == -2) {
			if ((arg3 ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
			    && arg3 <= i && arg5 == 1 + arg6)
			    return true;
			if ((arg1 ^ 0xffffffff) == (arg3 + -arg2 ^ 0xffffffff)
			    && (arg5 ^ 0xffffffff) >= (arg6 ^ 0xffffffff)
			    && (arg6 ^ 0xffffffff) >= (i_16_ ^ 0xffffffff)
			    && (anIntArrayArray1453[i][arg6] & 0x12c0108
				^ 0xffffffff) == -1)
			    return true;
			if (arg1 == arg3 + 1
			    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			    && (arg6 ^ 0xffffffff) >= (i_16_ ^ 0xffffffff)
			    && (0x12c0180 & anIntArrayArray1453[arg1][arg6]
				^ 0xffffffff) == -1)
			    return true;
		    } else if ((arg7 ^ 0xffffffff) != -3) {
			if (arg7 == 3) {
			    if (arg3 >= arg1
				&& (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
				&& ((-arg2 + arg6 ^ 0xffffffff)
				    == (arg5 ^ 0xffffffff)))
				return true;
			    if (arg3 + -arg2 == arg1 && arg5 <= arg6
				&& i_16_ >= arg6
				&& (0x12c0108 & anIntArrayArray1453[i][arg6]
				    ^ 0xffffffff) == -1)
				return true;
			    if (arg1 == arg3 + 1
				&& (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
				&& arg6 <= i_16_
				&& (0x12c0180
				    & anIntArrayArray1453[arg1][arg6]) == 0)
				return true;
			}
		    } else {
			if ((arg1 ^ 0xffffffff) == (1 + arg3 ^ 0xffffffff)
			    && (arg5 ^ 0xffffffff) >= (arg6 ^ 0xffffffff)
			    && (i_16_ ^ 0xffffffff) <= (arg6 ^ 0xffffffff))
			    return true;
			if ((arg1 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
			    && arg3 <= i
			    && (1 + arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			    && (0x12c0120 & anIntArrayArray1453[arg3][arg5]
				^ 0xffffffff) == -1)
			    return true;
			if (arg1 <= arg3
			    && (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
			    && (arg5 ^ 0xffffffff) == (-arg2 + arg6
						       ^ 0xffffffff)
			    && ((0x12c0102 & anIntArrayArray1453[arg3][i_16_])
				== 0))
			    return true;
		    }
		} else {
		    if ((arg3 + -arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			&& (arg5 ^ 0xffffffff) >= (arg6 ^ 0xffffffff)
			&& arg6 <= i_16_)
			return true;
		    if (arg1 <= arg3 && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
			&& (arg6 + 1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			&& (anIntArrayArray1453[arg3][arg5] & 0x12c0120) == 0)
			return true;
		    if (arg1 <= arg3 && i >= arg3
			&& (arg6 + -arg2 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
			&& (anIntArrayArray1453[arg3][i_16_] & 0x12c0102) == 0)
			return true;
		}
	    }
	    if (arg0 == 2) {
		if ((arg7 ^ 0xffffffff) != -1) {
		    if ((arg7 ^ 0xffffffff) == -2) {
			if (-arg2 + arg3 == arg1
			    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			    && arg6 <= i_16_
			    && (0x12c0108 & anIntArrayArray1453[i][arg6]
				^ 0xffffffff) == -1)
			    return true;
			if (arg1 <= arg3
			    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
			    && (1 + arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff))
			    return true;
			if (1 + arg3 == arg1
			    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			    && arg6 <= i_16_)
			    return true;
			if (arg3 >= arg1
			    && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
			    && (arg5 ^ 0xffffffff) == (arg6 - arg2
						       ^ 0xffffffff)
			    && (0x12c0102 & anIntArrayArray1453[arg3][i_16_]
				^ 0xffffffff) == -1)
			    return true;
		    } else if (arg7 != 2) {
			if (arg7 == 3) {
			    if (arg1 == arg3 + -arg2
				&& (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
				&& arg6 <= i_16_)
				return true;
			    if (arg1 <= arg3 && arg3 <= i
				&& (1 + arg6 ^ 0xffffffff) == (arg5
							       ^ 0xffffffff)
				&& (0x12c0120 & anIntArrayArray1453[arg3][arg5]
				    ^ 0xffffffff) == -1)
				return true;
			    if (arg3 + 1 == arg1 && arg6 >= arg5
				&& i_16_ >= arg6
				&& (0x12c0180
				    & anIntArrayArray1453[arg1][arg6]) == 0)
				return true;
			    if (arg1 <= arg3
				&& (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
				&& arg6 - arg2 == arg5)
				return true;
			}
		    } else {
			if (-arg2 + arg3 == arg1
			    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			    && (i_16_ ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
			    && (0x12c0108 & anIntArrayArray1453[i][arg6]) == 0)
			    return true;
			if ((arg1 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
			    && arg3 <= i && arg5 == 1 + arg6
			    && ((0x12c0120 & anIntArrayArray1453[arg3][arg5])
				== 0))
			    return true;
			if ((arg3 - -1 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			    && i_16_ >= arg6)
			    return true;
			if (arg1 <= arg3
			    && (i ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
			    && (-arg2 + arg6 ^ 0xffffffff) == (arg5
							       ^ 0xffffffff))
			    return true;
		    }
		} else {
		    if (arg1 == arg3 + -arg2
			&& (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
			&& arg6 <= i_16_)
			return true;
		    if ((arg1 ^ 0xffffffff) >= (arg3 ^ 0xffffffff) && arg3 <= i
			&& (arg5 ^ 0xffffffff) == (arg6 - -1 ^ 0xffffffff))
			return true;
		    if (arg3 - -1 == arg1 && arg6 >= arg5
			&& (arg6 ^ 0xffffffff) >= (i_16_ ^ 0xffffffff)
			&& (0x12c0180 & anIntArrayArray1453[arg1][arg6]
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg3 >= arg1 && i >= arg3 && -arg2 + arg6 == arg5
			&& (anIntArrayArray1453[arg3][i_16_] & 0x12c0102) == 0)
			return true;
		}
	    }
	    if (arg0 == 9) {
		if (arg1 <= arg3 && arg3 <= i
		    && (1 + arg6 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		    && (0x12c0120 & anIntArrayArray1453[arg3][arg5]
			^ 0xffffffff) == -1)
		    return true;
		if ((arg3 ^ 0xffffffff) <= (arg1 ^ 0xffffffff) && i >= arg3
		    && arg5 == arg6 - arg2
		    && (anIntArrayArray1453[arg3][i_16_] & 0x12c0102) == 0)
		    return true;
		if (arg1 == arg3 + -arg2
		    && (arg6 ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
		    && arg6 <= i_16_
		    && ((anIntArrayArray1453[i][arg6] & 0x12c0108 ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg3 + 1 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
		    && arg6 >= arg5 && i_16_ >= arg6
		    && (0x12c0180 & anIntArrayArray1453[arg1][arg6]
			^ 0xffffffff) == -1)
		    return true;
	    }
	}
	return false;
    }
    
    public void method1362(int arg0, byte arg1, boolean arg2, int arg3,
			   int arg4, int arg5) {
	arg4 -= anInt1473;
	arg5 -= anInt1456;
	if (arg1 != 70)
	    aClass9_1468 = null;
	anInt1471++;
	int i = 256;
	if (arg2)
	    i += 131072;
	for (int i_17_ = arg4; i_17_ < arg3 + arg4; i_17_++) {
	    if ((i_17_ ^ 0xffffffff) <= -1 && i_17_ < anInt1478) {
		for (int i_18_ = arg5; arg0 + arg5 > i_18_; i_18_++) {
		    if (i_18_ >= 0
			&& (i_18_ ^ 0xffffffff) > (anInt1470 ^ 0xffffffff))
			method1352(i, i_17_, (byte) -84, i_18_);
		}
	    }
	}
    }
    
    public void method1363(boolean arg0, int arg1, int arg2) {
	arg1 -= anInt1456;
	arg2 -= anInt1473;
	anIntArrayArray1453[arg2][arg1]
	    = Class67_Sub20.method1273(anIntArrayArray1453[arg2][arg1],
				       262144);
	anInt1451++;
	if (arg0 != false)
	    anInt1473 = -46;
    }
    
    public static void method1364(int arg0, Class7 arg1, int arg2, int arg3,
				  int arg4) {
	anInt1479++;
	if (arg2 > Class67_Sub1_Sub13.anInt4019)
	    ((Class67_Sub5_Sub19_Sub1) Class67_Sub6.aClass67_Sub5_Sub19_2872)
		.method1022
		(arg3, arg4, arg1.anInt189, arg1.anInt194,
		 Class67_Sub6.aClass67_Sub5_Sub19_2872.anInt4813 / 2,
		 Class67_Sub6.aClass67_Sub5_Sub19_2872.anInt4812 / 2,
		 Class67_Sub5_Sub4.anInt4504, 256, arg1.anIntArray179,
		 arg1.anIntArray337);
	else
	    Class121.method1671(arg3, arg4, 0, arg1.anIntArray179,
				arg1.anIntArray337);
	Class67_Sub5_Sub3.aBooleanArray4501[arg0] = true;
    }
    
    public void method1365(int arg0, int arg1, int arg2) {
	anInt1461++;
	arg2 -= anInt1473;
	if (arg1 >= -67)
	    anInt1456 = 54;
	arg0 -= anInt1456;
	anIntArrayArray1453[arg2][arg0]
	    = Class75.method1379(anIntArrayArray1453[arg2][arg0], -262145);
    }
    
    public void method1366(boolean arg0, byte arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6) {
	arg4 -= anInt1473;
	if (arg1 >= -26)
	    method1365(127, 13, 52);
	anInt1463++;
	if ((arg6 ^ 0xffffffff) == -2 || arg6 == 3) {
	    int i = arg3;
	    arg3 = arg5;
	    arg5 = i;
	}
	int i = 256;
	arg2 -= anInt1456;
	if (arg0)
	    i += 131072;
	for (int i_19_ = arg4;
	     (arg4 - -arg3 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
	    if (i_19_ >= 0 && anInt1478 > i_19_) {
		for (int i_20_ = arg2; i_20_ < arg5 + arg2; i_20_++) {
		    if ((i_20_ ^ 0xffffffff) <= -1
			&& (i_20_ ^ 0xffffffff) > (anInt1470 ^ 0xffffffff))
			method1371(i, i_19_, (byte) -73, i_20_);
		}
	    }
	}
    }
    
    public static void method1367(byte arg0) {
	aRSString_1452 = null;
	aClass9_1468 = null;
	anIntArrayArray1464 = null;
	aByteArrayArrayArray1480 = null;
	aClass137_1465 = null;
	int i = 82 % ((16 - arg0) / 55);
	anIntArray1462 = null;
	aClass70_Sub1Array1474 = null;
    }
    
    public boolean method1368(int arg0, int arg1, int arg2, byte arg3,
			      int arg4, int arg5, int arg6, int arg7) {
	anInt1458++;
	if ((arg1 ^ 0xffffffff) == -2) {
	    if (arg6 == arg0 && (arg7 ^ 0xffffffff) == (arg4 ^ 0xffffffff))
		return true;
	} else if ((arg6 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
		   && -1 + (arg1 + arg6) >= arg0 && arg4 <= arg4
		   && (arg4 ^ 0xffffffff) >= (-1 + (arg4 - -arg1)
					      ^ 0xffffffff))
	    return true;
	arg7 -= anInt1456;
	arg0 -= anInt1473;
	arg4 -= anInt1456;
	int i = -6 / ((14 - arg3) / 62);
	arg6 -= anInt1473;
	if (arg1 == 1) {
	    if (arg2 == 6 || arg2 == 7) {
		if ((arg2 ^ 0xffffffff) == -8)
		    arg5 = 0x3 & 2 + arg5;
		if ((arg5 ^ 0xffffffff) != -1) {
		    if (arg5 == 1) {
			if ((arg6 ^ 0xffffffff) == (-1 + arg0 ^ 0xffffffff)
			    && (arg7 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			    && (anIntArrayArray1453[arg6][arg7] & 0x8) == 0)
			    return true;
			if ((arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && (arg7 ^ 0xffffffff) == (arg4 - 1 ^ 0xffffffff)
			    && (0x2 & anIntArrayArray1453[arg6][arg7]
				^ 0xffffffff) == -1)
			    return true;
		    } else if ((arg5 ^ 0xffffffff) == -3) {
			if (arg6 == -1 + arg0
			    && (arg4 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			    && (anIntArrayArray1453[arg6][arg7] & 0x8) == 0)
			    return true;
			if (arg0 == arg6
			    && (arg7 ^ 0xffffffff) == (arg4 + 1 ^ 0xffffffff)
			    && (anIntArrayArray1453[arg6][arg7] & 0x20) == 0)
			    return true;
		    } else if ((arg5 ^ 0xffffffff) == -4) {
			if ((1 + arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && arg4 == arg7
			    && (anIntArrayArray1453[arg6][arg7] & 0x80
				^ 0xffffffff) == -1)
			    return true;
			if ((arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			    && arg7 == arg4 - -1
			    && (anIntArrayArray1453[arg6][arg7] & 0x20
				^ 0xffffffff) == -1)
			    return true;
		    }
		} else {
		    if (arg6 == arg0 + 1
			&& (arg4 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
			&& (anIntArrayArray1453[arg6][arg7] & 0x80) == 0)
			return true;
		    if ((arg6 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
			&& arg4 + -1 == arg7
			&& (0x2 & anIntArrayArray1453[arg6][arg7]
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg2 == 8) {
		if ((arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
		    && (1 + arg4 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
		    && ((0x20 & anIntArrayArray1453[arg6][arg7] ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
		    && arg4 + -1 == arg7
		    && ((0x2 & anIntArrayArray1453[arg6][arg7] ^ 0xffffffff)
			== -1))
		    return true;
		if (arg6 == -1 + arg0
		    && (arg4 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
		    && ((anIntArrayArray1453[arg6][arg7] & 0x8 ^ 0xffffffff)
			== -1))
		    return true;
		if (arg6 == 1 + arg0 && arg4 == arg7
		    && ((0x80 & anIntArrayArray1453[arg6][arg7] ^ 0xffffffff)
			== -1))
		    return true;
	    }
	} else {
	    int i_21_ = -1 + (arg1 + arg6);
	    int i_22_ = -1 + arg7 + arg1;
	    if ((arg2 ^ 0xffffffff) == -7 || (arg2 ^ 0xffffffff) == -8) {
		if (arg2 == 7)
		    arg5 = arg5 - -2 & 0x3;
		if ((arg5 ^ 0xffffffff) != -1) {
		    if (arg5 != 1) {
			if ((arg5 ^ 0xffffffff) != -3) {
			    if (arg5 == 3) {
				if ((arg0 - -1 ^ 0xffffffff) == (arg6
								 ^ 0xffffffff)
				    && (arg4 ^ 0xffffffff) <= (arg7
							       ^ 0xffffffff)
				    && arg4 <= i_22_
				    && (0x80 & anIntArrayArray1453[arg6][arg4]
					^ 0xffffffff) == -1)
				    return true;
				if ((arg6 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
				    && i_21_ >= arg0 && arg7 == 1 + arg4
				    && (0x20 & anIntArrayArray1453[arg0][arg7]
					^ 0xffffffff) == -1)
				    return true;
			    }
			} else {
			    if (arg6 == -arg1 + arg0 && arg4 >= arg7
				&& arg4 <= i_22_
				&& ((0x8 & anIntArrayArray1453[i_21_][arg4])
				    == 0))
				return true;
			    if ((arg6 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
				&& i_21_ >= arg0 && 1 + arg4 == arg7
				&& (anIntArrayArray1453[arg0][arg7] & 0x20
				    ^ 0xffffffff) == -1)
				return true;
			}
		    } else {
			if (-arg1 + arg0 == arg6
			    && (arg7 ^ 0xffffffff) >= (arg4 ^ 0xffffffff)
			    && arg4 <= i_22_
			    && (0x8 & anIntArrayArray1453[i_21_][arg4]
				^ 0xffffffff) == -1)
			    return true;
			if ((arg0 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
			    && i_21_ >= arg0
			    && (arg4 + -arg1 ^ 0xffffffff) == (arg7
							       ^ 0xffffffff)
			    && (0x2 & anIntArrayArray1453[arg0][i_22_]) == 0)
			    return true;
		    }
		} else {
		    if ((arg6 ^ 0xffffffff) == (1 + arg0 ^ 0xffffffff)
			&& arg7 <= arg4 && arg4 <= i_22_
			&& (anIntArrayArray1453[arg6][arg4] & 0x80) == 0)
			return true;
		    if (arg0 >= arg6
			&& (i_21_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff)
			&& arg7 == arg4 + -arg1
			&& (anIntArrayArray1453[arg0][i_22_] & 0x2
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg2 == 8) {
		if (arg0 >= arg6 && arg0 <= i_21_ && arg7 == 1 + arg4
		    && ((0x20 & anIntArrayArray1453[arg0][arg7] ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg6 ^ 0xffffffff) >= (arg0 ^ 0xffffffff) && i_21_ >= arg0
		    && (arg4 - arg1 ^ 0xffffffff) == (arg7 ^ 0xffffffff)
		    && (anIntArrayArray1453[arg0][i_22_] & 0x2) == 0)
		    return true;
		if ((-arg1 + arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
		    && arg4 >= arg7
		    && (i_22_ ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
		    && ((0x8 & anIntArrayArray1453[i_21_][arg4] ^ 0xffffffff)
			== -1))
		    return true;
		if ((1 + arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
		    && arg7 <= arg4
		    && (i_22_ ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
		    && ((anIntArrayArray1453[arg6][arg4] & 0x80 ^ 0xffffffff)
			== -1))
		    return true;
	    }
	}
	return false;
    }
    
    public static void method1369() {
	Class113.anInt2140 = 0;
    while_119_:
	for (int i = 0; i < Class129_Sub1.anInt3501; i++) {
	    Class68 class68 = Class83.aClass68Array1672[i];
	    if (Class55_Sub2_Sub1.anIntArray3798 != null) {
		for (int i_23_ = 0;
		     i_23_ < Class55_Sub2_Sub1.anIntArray3798.length;
		     i_23_++) {
		    if (Class55_Sub2_Sub1.anIntArray3798[i_23_] != -1000000
			&& ((class68.anInt1350
			     <= Class55_Sub2_Sub1.anIntArray3798[i_23_])
			    || (class68.anInt1370
				<= Class55_Sub2_Sub1.anIntArray3798[i_23_]))
			&& (class68.anInt1352 <= Class41.anIntArray857[i_23_]
			    || (class68.anInt1356
				<= Class41.anIntArray857[i_23_]))
			&& ((class68.anInt1352
			     >= Class67_Sub5_Sub7.anIntArray4564[i_23_])
			    || (class68.anInt1356
				>= Class67_Sub5_Sub7.anIntArray4564[i_23_]))
			&& (class68.anInt1358 <= Class7.anIntArray259[i_23_]
			    || (class68.anInt1364
				<= Class7.anIntArray259[i_23_]))
			&& (class68.anInt1358 >= Class113.anIntArray2137[i_23_]
			    || (class68.anInt1364
				>= Class113.anIntArray2137[i_23_])))
			continue while_119_;
		}
	    }
	    if (class68.anInt1353 == 1) {
		int i_24_ = (class68.anInt1362 - Class67_Sub1_Sub9.anInt3941
			     + Class67_Sub1.anInt2822);
		if (i_24_ >= 0 && i_24_ <= (Class67_Sub1.anInt2822
					    + Class67_Sub1.anInt2822)) {
		    int i_25_
			= (class68.anInt1376 - Class67_Sub1_Sub7.anInt3905
			   + Class67_Sub1.anInt2822);
		    if (i_25_ < 0)
			i_25_ = 0;
		    int i_26_
			= (class68.anInt1363 - Class67_Sub1_Sub7.anInt3905
			   + Class67_Sub1.anInt2822);
		    if (i_26_
			> Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822)
			i_26_
			    = Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822;
		    boolean bool = false;
		    while (i_25_ <= i_26_) {
			if (Class124.aBooleanArrayArray2332[i_24_][i_25_++]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_27_
			    = Class67_Sub16.anInt3080 - class68.anInt1352;
			if (i_27_ > 32)
			    class68.anInt1367 = 1;
			else {
			    if (i_27_ >= -32)
				continue;
			    class68.anInt1367 = 2;
			    i_27_ = -i_27_;
			}
			class68.anInt1354
			    = ((class68.anInt1358 - PacketParser.anInt2120 << 8)
			       / i_27_);
			class68.anInt1368
			    = ((class68.anInt1364 - PacketParser.anInt2120 << 8)
			       / i_27_);
			class68.anInt1355
			    = ((class68.anInt1350 - Class34.anInt747 << 8)
			       / i_27_);
			class68.anInt1351
			    = ((class68.anInt1370 - Class34.anInt747 << 8)
			       / i_27_);
			Class130.aClass68Array2424[Class113.anInt2140++]
			    = class68;
		    }
		}
	    } else if (class68.anInt1353 == 2) {
		int i_28_ = (class68.anInt1376 - Class67_Sub1_Sub7.anInt3905
			     + Class67_Sub1.anInt2822);
		if (i_28_ >= 0 && i_28_ <= (Class67_Sub1.anInt2822
					    + Class67_Sub1.anInt2822)) {
		    int i_29_
			= (class68.anInt1362 - Class67_Sub1_Sub9.anInt3941
			   + Class67_Sub1.anInt2822);
		    if (i_29_ < 0)
			i_29_ = 0;
		    int i_30_
			= (class68.anInt1357 - Class67_Sub1_Sub9.anInt3941
			   + Class67_Sub1.anInt2822);
		    if (i_30_
			> Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822)
			i_30_
			    = Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822;
		    boolean bool = false;
		    while (i_29_ <= i_30_) {
			if (Class124.aBooleanArrayArray2332[i_29_++][i_28_]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_31_ = PacketParser.anInt2120 - class68.anInt1358;
			if (i_31_ > 32)
			    class68.anInt1367 = 3;
			else {
			    if (i_31_ >= -32)
				continue;
			    class68.anInt1367 = 4;
			    i_31_ = -i_31_;
			}
			class68.anInt1359
			    = (class68.anInt1352 - Class67_Sub16.anInt3080
			       << 8) / i_31_;
			class68.anInt1374
			    = (class68.anInt1356 - Class67_Sub16.anInt3080
			       << 8) / i_31_;
			class68.anInt1355
			    = ((class68.anInt1350 - Class34.anInt747 << 8)
			       / i_31_);
			class68.anInt1351
			    = ((class68.anInt1370 - Class34.anInt747 << 8)
			       / i_31_);
			Class130.aClass68Array2424[Class113.anInt2140++]
			    = class68;
		    }
		}
	    } else if (class68.anInt1353 == 4) {
		int i_32_ = class68.anInt1350 - Class34.anInt747;
		if (i_32_ > 128) {
		    int i_33_
			= (class68.anInt1376 - Class67_Sub1_Sub7.anInt3905
			   + Class67_Sub1.anInt2822);
		    if (i_33_ < 0)
			i_33_ = 0;
		    int i_34_
			= (class68.anInt1363 - Class67_Sub1_Sub7.anInt3905
			   + Class67_Sub1.anInt2822);
		    if (i_34_
			> Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822)
			i_34_
			    = Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822;
		    if (i_33_ <= i_34_) {
			int i_35_
			    = (class68.anInt1362 - Class67_Sub1_Sub9.anInt3941
			       + Class67_Sub1.anInt2822);
			if (i_35_ < 0)
			    i_35_ = 0;
			int i_36_
			    = (class68.anInt1357 - Class67_Sub1_Sub9.anInt3941
			       + Class67_Sub1.anInt2822);
			if (i_36_
			    > Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822)
			    i_36_ = (Class67_Sub1.anInt2822
				     + Class67_Sub1.anInt2822);
			boolean bool = false;
		    while_117_:
			for (int i_37_ = i_35_; i_37_ <= i_36_; i_37_++) {
			    for (int i_38_ = i_33_; i_38_ <= i_34_; i_38_++) {
				if (Class124.aBooleanArrayArray2332[i_37_]
				    [i_38_]) {
				    bool = true;
				    break while_117_;
				}
			    }
			}
			if (bool) {
			    class68.anInt1367 = 5;
			    class68.anInt1359
				= (class68.anInt1352 - Class67_Sub16.anInt3080
				   << 8) / i_32_;
			    class68.anInt1374
				= (class68.anInt1356 - Class67_Sub16.anInt3080
				   << 8) / i_32_;
			    class68.anInt1354
				= (class68.anInt1358 - PacketParser.anInt2120
				   << 8) / i_32_;
			    class68.anInt1368
				= (class68.anInt1364 - PacketParser.anInt2120
				   << 8) / i_32_;
			    Class130.aClass68Array2424[Class113.anInt2140++]
				= class68;
			}
		    }
		}
	    }
	}
    }
    
    public boolean method1370(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7, int arg8) {
	anInt1476++;
	if ((arg7 ^ 0xffffffff) < -2) {
	    if (method1351(arg8, arg2, 0, arg7, arg3, arg1, arg5, arg0, arg7))
		return true;
	    return method1354(arg3, arg8, arg0, arg5, arg1, (byte) -108, arg7,
			      arg4, arg2, arg7);
	}
	int i = -1 + arg5 + arg1;
	int i_39_ = -1 + arg2 - -arg3;
	if (arg1 <= arg0 && i >= arg0 && arg8 >= arg2
	    && (i_39_ ^ 0xffffffff) <= (arg8 ^ 0xffffffff))
	    return true;
	if ((arg0 ^ 0xffffffff) == (arg1 - 1 ^ 0xffffffff)
	    && (arg2 ^ 0xffffffff) >= (arg8 ^ 0xffffffff)
	    && (i_39_ ^ 0xffffffff) <= (arg8 ^ 0xffffffff)
	    && (anIntArrayArray1453[arg0 - anInt1473][-anInt1456 + arg8]
		& 0x8) == 0
	    && (arg4 & 0x8) == 0)
	    return true;
	if ((i + 1 ^ 0xffffffff) == (arg0 ^ 0xffffffff) && arg8 >= arg2
	    && (arg8 ^ 0xffffffff) >= (i_39_ ^ 0xffffffff)
	    && (anIntArrayArray1453[arg0 - anInt1473][arg8 - anInt1456]
		& 0x80) == 0
	    && (0x2 & arg4) == 0)
	    return true;
	if (arg8 == -1 + arg2 && arg0 >= arg1 && i >= arg0
	    && (anIntArrayArray1453[-anInt1473 + arg0][-anInt1456 + arg8] & 0x2
		^ 0xffffffff) == -1
	    && (arg4 & 0x4) == 0)
	    return true;
	if (arg6 != 25417)
	    method1357(112);
	if ((arg8 ^ 0xffffffff) == (1 + i_39_ ^ 0xffffffff)
	    && (arg1 ^ 0xffffffff) >= (arg0 ^ 0xffffffff) && arg0 <= i
	    && ((0x20
		 & anIntArrayArray1453[-anInt1473 + arg0][-anInt1456 + arg8])
		== 0)
	    && (0x1 & arg4) == 0)
	    return true;
	return false;
    }
    
    public void method1371(int arg0, int arg1, byte arg2, int arg3) {
	int i = -37 % ((-12 - arg2) / 61);
	anInt1459++;
	anIntArrayArray1453[arg1][arg3]
	    = Class75.method1379(anIntArrayArray1453[arg1][arg3],
				 arg0 ^ 0xffffffff);
    }
    
    public void method1372(int arg0, boolean arg1, int arg2, int arg3,
			   boolean arg4, int arg5) {
	anInt1467++;
	arg0 -= anInt1456;
	arg2 -= anInt1473;
	if (arg1 != true)
	    aRSString_1452 = null;
	if (arg3 == 0) {
	    if ((arg5 ^ 0xffffffff) == -1) {
		method1352(128, arg2, (byte) -50, arg0);
		method1352(8, -1 + arg2, (byte) -120, arg0);
	    }
	    if ((arg5 ^ 0xffffffff) == -2) {
		method1352(2, arg2, (byte) -93, arg0);
		method1352(32, arg2, (byte) -112, arg0 - -1);
	    }
	    if ((arg5 ^ 0xffffffff) == -3) {
		method1352(8, arg2, (byte) -80, arg0);
		method1352(128, arg2 + 1, (byte) -80, arg0);
	    }
	    if (arg5 == 3) {
		method1352(32, arg2, (byte) -70, arg0);
		method1352(2, arg2, (byte) -91, -1 + arg0);
	    }
	}
	if (arg3 == 1 || arg3 == 3) {
	    if (arg5 == 0) {
		method1352(1, arg2, (byte) -68, arg0);
		method1352(16, arg2 - 1, (byte) -69, 1 + arg0);
	    }
	    if (arg5 == 1) {
		method1352(4, arg2, (byte) -72, arg0);
		method1352(64, arg2 + 1, (byte) -126, arg0 + 1);
	    }
	    if ((arg5 ^ 0xffffffff) == -3) {
		method1352(16, arg2, (byte) -77, arg0);
		method1352(1, 1 + arg2, (byte) -124, arg0 + -1);
	    }
	    if ((arg5 ^ 0xffffffff) == -4) {
		method1352(64, arg2, (byte) -114, arg0);
		method1352(4, arg2 - 1, (byte) -128, arg0 + -1);
	    }
	}
	if ((arg3 ^ 0xffffffff) == -3) {
	    if (arg5 == 0) {
		method1352(130, arg2, (byte) -78, arg0);
		method1352(8, arg2 - 1, (byte) -123, arg0);
		method1352(32, arg2, (byte) -109, arg0 + 1);
	    }
	    if ((arg5 ^ 0xffffffff) == -2) {
		method1352(10, arg2, (byte) -118, arg0);
		method1352(32, arg2, (byte) -84, 1 + arg0);
		method1352(128, 1 + arg2, (byte) -91, arg0);
	    }
	    if (arg5 == 2) {
		method1352(40, arg2, (byte) -89, arg0);
		method1352(128, 1 + arg2, (byte) -128, arg0);
		method1352(2, arg2, (byte) -79, arg0 + -1);
	    }
	    if ((arg5 ^ 0xffffffff) == -4) {
		method1352(160, arg2, (byte) -63, arg0);
		method1352(2, arg2, (byte) -98, arg0 - 1);
		method1352(8, arg2 + -1, (byte) -123, arg0);
	    }
	}
	if (arg4) {
	    if (arg3 == 0) {
		if (arg5 == 0) {
		    method1352(65536, arg2, (byte) -116, arg0);
		    method1352(4096, arg2 - 1, (byte) -109, arg0);
		}
		if (arg5 == 1) {
		    method1352(1024, arg2, (byte) -114, arg0);
		    method1352(16384, arg2, (byte) -80, 1 + arg0);
		}
		if (arg5 == 2) {
		    method1352(4096, arg2, (byte) -120, arg0);
		    method1352(65536, arg2 - -1, (byte) -106, arg0);
		}
		if (arg5 == 3) {
		    method1352(16384, arg2, (byte) -105, arg0);
		    method1352(1024, arg2, (byte) -75, arg0 + -1);
		}
	    }
	    if ((arg3 ^ 0xffffffff) == -2 || arg3 == 3) {
		if ((arg5 ^ 0xffffffff) == -1) {
		    method1352(512, arg2, (byte) -72, arg0);
		    method1352(8192, -1 + arg2, (byte) -43, 1 + arg0);
		}
		if (arg5 == 1) {
		    method1352(2048, arg2, (byte) -67, arg0);
		    method1352(32768, arg2 - -1, (byte) -70, arg0 + 1);
		}
		if (arg5 == 2) {
		    method1352(8192, arg2, (byte) -87, arg0);
		    method1352(512, arg2 - -1, (byte) -105, arg0 - 1);
		}
		if ((arg5 ^ 0xffffffff) == -4) {
		    method1352(32768, arg2, (byte) -106, arg0);
		    method1352(2048, -1 + arg2, (byte) -111, -1 + arg0);
		}
	    }
	    if (arg3 == 2) {
		if (arg5 == 0) {
		    method1352(66560, arg2, (byte) -104, arg0);
		    method1352(4096, -1 + arg2, (byte) -117, arg0);
		    method1352(16384, arg2, (byte) -84, 1 + arg0);
		}
		if (arg5 == 1) {
		    method1352(5120, arg2, (byte) -49, arg0);
		    method1352(16384, arg2, (byte) -85, 1 + arg0);
		    method1352(65536, arg2 - -1, (byte) -85, arg0);
		}
		if ((arg5 ^ 0xffffffff) == -3) {
		    method1352(20480, arg2, (byte) -62, arg0);
		    method1352(65536, arg2 + 1, (byte) -47, arg0);
		    method1352(1024, arg2, (byte) -103, arg0 - 1);
		}
		if ((arg5 ^ 0xffffffff) == -4) {
		    method1352(81920, arg2, (byte) -118, arg0);
		    method1352(1024, arg2, (byte) -82, -1 + arg0);
		    method1352(4096, -1 + arg2, (byte) -79, arg0);
		}
	    }
	}
    }
    
    public Class73(int arg0, int arg1) {
	anInt1478 = arg0;
	anInt1470 = arg1;
	anInt1456 = 0;
	anIntArrayArray1453 = new int[anInt1478][anInt1470];
	anInt1473 = 0;
	method1357(57);
    }
}
