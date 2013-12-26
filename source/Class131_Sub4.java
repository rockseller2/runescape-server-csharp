import java.io.IOException;
import java.net.Socket;

public class Class131_Sub4 extends Class131
{
    public int anInt3635 = -32768;
    public static int anInt3636;
    public static int anInt3637;
    public int anInt3638;
    public static Class136 aClass136_3639 = new Class136(64);
    public static int anInt3640;
    public int anInt3641;
    public static int anInt3642;
    public static int anInt3643;
    public static Class9 aClass9_3644;
    public static int anInt3645 = -1;
    public static int anInt3646;
    public static int anInt3647;
    public static int anInt3648;
    public static int anInt3649;
    public static Sprites aSprite_3650;
    public static RSString aRSString_3651
	= Class134.method1914("Liste der Welten geladen", (byte) 85);
    public static int anInt3652;
    
    public static void method1814(byte arg0, int arg1) {
	Class118.anInt2231 = arg1;
	anInt3647++;
	if (arg0 > 83) {
	    Class67_Sub5_Sub16.anInt4776 = -1;
	    Class67_Sub5_Sub16.anInt4776 = -1;
	    Class67_Sub26.method1295(98);
	}
    }
    
    public static void method1815(RSString arg0, int arg1) {
	anInt3652++;
	if (Class67_Sub17.anInt3107 >= 2) {
	    if (arg0.method526(arg1 ^ 0x39, Class143.aRSString_2577)) {
		Class67_Sub1_Sub7.method646(-1);
		for (int i = 0; (i ^ 0xffffffff) > -11; i++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			       / 1024L);
		Class87.method1465(true,
				   (Class67_Sub1_Sub27.method744
				    ((new RSString[]
				      { Class36.aRSString_772,
					InputStream_Sub1.method47(i, true),
					Class86.aRSString_1766 }),
				     -102)),
				   null, 0);
	    }
	    if (arg0.method526(-90, Class67_Sub5_Sub17.aRSString_4797)) {
		Class67_Sub1_Sub7.method646(-1);
		for (int i = 0; (i ^ 0xffffffff) > -11; i++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			       / 1024L);
		Class87.method1465(true,
				   (Class67_Sub1_Sub27.method744
				    ((new RSString[]
				      { Class61.aRSString_1146,
					InputStream_Sub1.method47(i, true),
					Class86.aRSString_1766 }),
				     -118)),
				   null, 0);
		Class67_Sub5_Sub4.method850(arg1 ^ 0x4d);
		Class67_Sub1_Sub7.method646(-1);
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -11; i_0_++)
		    System.gc();
		i = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			   / 1024L);
		Class87.method1465(true,
				   (Class67_Sub1_Sub27.method744
				    ((new RSString[]
				      { Class57.aRSString_1105,
					InputStream_Sub1.method47(i, true),
					Class86.aRSString_1766 }),
				     arg1 + -139)),
				   null, 0);
	    }
	    if (arg0.method526(61, Class50.aRSString_1012))
		Class87.method1465
		    (true,
		     (Class67_Sub1_Sub27.method744
		      ((new RSString[]
			{ Class86.aRSString_1765,
			  InputStream_Sub1.method47(Class130.method1759(false),
						    true) }),
		       -97)),
		     null, 0);
	    if (arg0.method526(-70, Class55.aRSString_1088))
		Class119.method1645(-109);
	    if (arg0.method526(123, Class41.aRSString_869))
		Class144.aClass40_2588.method352(true);
	    if (arg0.method526(-75, Class30.aRSString_695))
		Class144.aClass40_2588.method343(true);
	    if (arg0.method526(arg1 ^ ~0x77, Class113.aRSString_2122)) {
		Class124.aSignLink_2335.method402(false);
		Class41.aClass117_867.method1628(3);
		Class144.aClass40_2588.method350(-112);
	    }
	    if (arg0.method526(107, Class41.aRSString_876))
		Class140.aBoolean2544 = true;
	    if (arg0.method526(-43, Class5.aRSString_135))
		Class40.method348(-11461, 25);
	    if (arg0.method526(arg1 + 80, Class67_Sub1_Sub11.aRSString_3984))
		Class68.aBoolean1378 = true;
	    if (arg0.method526(-58, Class143.aRSString_2579))
		Class68.aBoolean1378 = false;
	    if (arg0.method526(108, Class67_Sub5_Sub13.aRSString_4720)) {
		for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
		    for (int i_1_ = 1; (i_1_ ^ 0xffffffff) > -104; i_1_++) {
			for (int i_2_ = 1; (i_2_ ^ 0xffffffff) > -104; i_2_++)
			    Class53.aClass73Array1059[i]
				.anIntArrayArray1453[i_1_][i_2_]
				= 0;
		    }
		}
	    }
	    if (arg0.method540(Class111.aRSString_2096, -57)) {
		Class61_Sub1.method557(arg0.method503((byte) 34, 15)
					   .method530((byte) -86));
		Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
		Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
	    }
	    if (arg0.method540(Class67_Sub25.aRSString_3246, -67)
		&& Class23.anInt555 != 0)
		Class67_Sub5_Sub8.method894(arg0.method503((byte) 34, 6)
						.method530((byte) 122),
					    14210);
	    if (arg0.method526(-44, PacketParser.aRSString_2118))
		throw new RuntimeException();
	    if (arg0.method540(Class67_Sub1_Sub33.aRSString_4313, -101)) {
		Class131_Sub5.anInt3689
		    = arg0.method503((byte) 34, 12).method515(32)
			  .method530((byte) 125);
		Class87.method1465(true,
				   (Class67_Sub1_Sub27.method744
				    (new RSString[] { Class32.aRSString_712,
						     (InputStream_Sub1.method47
						      (Class131_Sub5.anInt3689,
						       true)) },
				     -109)),
				   null, 0);
	    }
	    if (arg0.method526(58, Class102.aRSString_1999))
		Class128.aBoolean2377 = true;
	    if (arg0.method526(-88, Class143.aRSString_2584)) {
		if (!Class106.aBoolean2055) {
		    Class106.aBoolean2055 = true;
		    Class87.method1465(true, Class111.aRSString_2100, null, 0);
		} else {
		    Class106.aBoolean2055 = false;
		    Class87.method1465(true, Class67_Sub1_Sub9.aRSString_3947,
				       null, 0);
		}
	    }
	    if (arg0.method526(55, Class67_Sub1_Sub13.aRSString_4016)) {
		if (!Class131_Sub7_Sub2.aBoolean5068) {
		    Class41.aRSString_874.method535(0);
		    Class131_Sub7_Sub2.aBoolean5068 = true;
		} else {
		    Class67.aRSString_1339.method535(0);
		    Class131_Sub7_Sub2.aBoolean5068 = false;
		}
	    }
	}
	Class70_Sub1.outStream.createFrame(2, 44); //COMMAND (admin commands)
	Class55_Sub3_Sub1.anInt3806++;
	if (arg1 == 12) {
	    Class70_Sub1.outStream
		.addByte((byte) 4, -1 + arg0.method531((byte) -112));
	    Class70_Sub1.outStream
		.writeRSString(arg0.method503((byte) 34, 2), (byte) 0);
	}
    }
    
    public static int method1816(int arg0, byte arg1) {
	if (arg1 != -4)
	    method1817(126, -83, 73, 3, -43, 31, -58, 29);
	anInt3640++;
	int i = arg0 * (arg0 * arg0 >> 298117004) >> 1871322412;
	int i_3_ = 6 * arg0 + -61440;
	int i_4_ = (i_3_ * arg0 >> -1829618868) + 40960;
	return i_4_ * i >> -531770484;
    }
    
    public static boolean method1817(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6, int arg7) {
	long l = Class73.method1360(arg3, arg1 + arg5, arg6 + arg0);
	anInt3643++;
	if (arg4 != -710)
	    method1820(30);
	if ((l ^ 0xffffffffffffffffL) != -1L) {
	    int i = ((int) l & 0x38569c) >> -1051951628;
	    int i_5_ = 0x1f & (int) l >> -115811538;
	    int i_6_ = 0x7fffffff & (int) (l >>> -1391059616);
	    Class65 class65 = Class73.method1359(arg4 ^ ~0x2fc0, i_6_);
	    if (class65.anInt1314 != -1) {
		if (!Class67_Sub1_Sub36.method789(class65, 23279, arg6, arg0,
						  arg1, arg5, i))
		    return false;
	    } else {
		int i_7_ = arg7;
		if (l > 0L)
		    i_7_ = arg2;
		int[] is = Class121.anIntArray2300;
		int i_8_ = 4 * arg5 + 24624 + 512 * (103 - arg0) * 4;
		if ((i_5_ ^ 0xffffffff) == -1 || i_5_ == 2) {
		    if ((i ^ 0xffffffff) != -1) {
			if (i != 1) {
			    if (i == 2) {
				is[i_8_ - -3] = i_7_;
				is[i_8_ - -515] = i_7_;
				is[i_8_ + 3 + 1024] = i_7_;
				is[i_8_ + 1539] = i_7_;
			    } else if (i == 3) {
				is[1536 + i_8_] = i_7_;
				is[1 + i_8_ + 1536] = i_7_;
				is[i_8_ + 1536 - -2] = i_7_;
				is[i_8_ - -1539] = i_7_;
			    }
			} else {
			    is[i_8_] = i_7_;
			    is[1 + i_8_] = i_7_;
			    is[2 + i_8_] = i_7_;
			    is[i_8_ + 3] = i_7_;
			}
		    } else {
			is[i_8_] = i_7_;
			is[512 + i_8_] = i_7_;
			is[1024 + i_8_] = i_7_;
			is[1536 + i_8_] = i_7_;
		    }
		}
		if (i_5_ == 3) {
		    if ((i ^ 0xffffffff) != -1) {
			if (i == 1)
			    is[3 + i_8_] = i_7_;
			else if ((i ^ 0xffffffff) == -3)
			    is[3 + i_8_ + 1536] = i_7_;
			else if ((i ^ 0xffffffff) == -4)
			    is[i_8_ + 1536] = i_7_;
		    } else
			is[i_8_] = i_7_;
		}
		if (i_5_ == 2) {
		    if (i == 3) {
			is[i_8_] = i_7_;
			is[i_8_ - -512] = i_7_;
			is[1024 + i_8_] = i_7_;
			is[1536 + i_8_] = i_7_;
		    } else if ((i ^ 0xffffffff) == -1) {
			is[i_8_] = i_7_;
			is[i_8_ - -1] = i_7_;
			is[i_8_ + 2] = i_7_;
			is[3 + i_8_] = i_7_;
		    } else if (i == 1) {
			is[i_8_ - -3] = i_7_;
			is[i_8_ - -3 + 512] = i_7_;
			is[3 + i_8_ + 1024] = i_7_;
			is[i_8_ - -3 - -1536] = i_7_;
		    } else if ((i ^ 0xffffffff) == -3) {
			is[i_8_ + 1536] = i_7_;
			is[i_8_ - -1537] = i_7_;
			is[1536 + (i_8_ - -2)] = i_7_;
			is[i_8_ + 1539] = i_7_;
		    }
		}
	    }
	}
	l = Class63.method567(arg3, arg1 + arg5, arg6 + arg0);
	if (l != 0L) {
	    int i = 0x3 & (int) l >> 718448372;
	    int i_9_ = 0x7fffffff & (int) (l >>> -1839198176);
	    int i_10_ = 0x1f & (int) l >> -627371602;
	    Class65 class65 = Class73.method1359(11525, i_9_);
	    if (class65.anInt1314 != -1) {
		if (!Class67_Sub1_Sub36.method789(class65, 23279, arg6, arg0,
						  arg1, arg5, i))
		    return false;
	    } else if (i_10_ == 9) {
		int[] is = Class121.anIntArray2300;
		int i_11_ = arg5 * 4 + 24624 + 512 * (103 + -arg0) * 4;
		int i_12_ = 15658734;
		if (l > 0L)
		    i_12_ = 15597568;
		if (i != 0 && (i ^ 0xffffffff) != -3) {
		    is[i_11_] = i_12_;
		    is[512 + (i_11_ - -1)] = i_12_;
		    is[2 + (i_11_ + 1024)] = i_12_;
		    is[3 + (1536 + i_11_)] = i_12_;
		} else {
		    is[1536 + i_11_] = i_12_;
		    is[1 + i_11_ + 1024] = i_12_;
		    is[512 + i_11_ + 2] = i_12_;
		    is[3 + i_11_] = i_12_;
		}
	    }
	}
	l = Class27.method253(arg3, arg5 - -arg1, arg6 + arg0);
	if ((l ^ 0xffffffffffffffffL) != -1L) {
	    int i = 0x7fffffff & (int) (l >>> 109095648);
	    int i_13_ = 0x3 & (int) l >> 1777254516;
	    Class65 class65 = Class73.method1359(11525, i);
	    if ((class65.anInt1314 ^ 0xffffffff) != 0
		&& !Class67_Sub1_Sub36.method789(class65, 23279, arg6, arg0,
						 arg1, arg5, i_13_))
		return false;
	}
	return true;
    }
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3648++;
    }
    
    public static void method1818(int arg0) {
	anInt3636++;
	if (arg0 > 81 && Class67_Sub5_Sub12.anInt4695 != 0) {
	    try {
		if ((++RuntimeException_Sub1.anInt2613 ^ 0xffffffff) < -1501) {
		    if (Class41.aClass117_867 != null) {
			Class41.aClass117_867.method1632((byte) 118);
			Class41.aClass117_867 = null;
		    }
		    if ((Class55.anInt1085 ^ 0xffffffff) <= -2) {
			Class28.anInt652 = -5;
			Class67_Sub5_Sub12.anInt4695 = 0;
			return;
		    }
		    Class55.anInt1085++;
		    Class67_Sub5_Sub12.anInt4695 = 1;
		    if (Class123.anInt2319 != Class7.anInt241)
			Class7.anInt241 = Class123.anInt2319;
		    else
			Class7.anInt241 = Class13.anInt431;
		    RuntimeException_Sub1.anInt2613 = 0;
		}
		if ((Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) == -2) {
		    Class43.aClass31_907
			= Class124.aSignLink_2335.method403(Class7.anInt241,
							   false,
							   (Class67_Sub5_Sub13
							    .connectServerIP));
		    Class67_Sub5_Sub12.anInt4695 = 2;
		}
		if (Class67_Sub5_Sub12.anInt4695 == 2) {
		    if (Class43.aClass31_907.anInt706 == 2)
			throw new IOException();
		    if (Class43.aClass31_907.anInt706 != 1)
			return;
		    Class41.aClass117_867
			= new Class117(((Socket)
					Class43.aClass31_907.anObject705),
				       Class124.aSignLink_2335);
		    Class43.aClass31_907 = null;
		    Class41.aClass117_867.queueBytesToSend(0, Class70_Sub1.outStream.buffer, Class70_Sub1.outStream.currentOffset, (byte) 84);
		    if (Class67_Sub5_Sub9.aClass28_4616 != null)
			Class67_Sub5_Sub9.aClass28_4616.method258(0);
		    if (Class78.aClass28_1606 != null)
			Class78.aClass28_1606.method258(0);
		    int i = Class41.aClass117_867.method1631(17506);
		    if (Class67_Sub5_Sub9.aClass28_4616 != null)
			Class67_Sub5_Sub9.aClass28_4616.method258(0);
		    if (Class78.aClass28_1606 != null)
			Class78.aClass28_1606.method258(0);
		    if ((i ^ 0xffffffff) != -102) {
			Class67_Sub5_Sub12.anInt4695 = 0;
			Class28.anInt652 = i;
			Class41.aClass117_867.method1632((byte) -27);
			Class41.aClass117_867 = null;
			return;
		    }
		    Class67_Sub5_Sub12.anInt4695 = 3;
		}
		if ((Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) == -4) {
		    if ((Class41.aClass117_867.method1626(-19) ^ 0xffffffff)
			<= -3) {
			int i = ((Class41.aClass117_867.method1631(17506)
				  << -743412024)
				 | Class41.aClass117_867.method1631(17506));
			Class67_Sub5_Sub4_Sub1.method855(i, 32);
			if (Class67_Sub23.anInt3202 == -1) {
			    Class67_Sub5_Sub12.anInt4695 = 0;
			    Class28.anInt652 = 6;
			    Class41.aClass117_867.method1632((byte) 120);
			    Class41.aClass117_867 = null;
			} else {
			    Class67_Sub5_Sub12.anInt4695 = 0;
			    Class41.aClass117_867.method1632((byte) -52);
			    Class41.aClass117_867 = null;
			    Class61.method553(0);
			}
		    }
		}
	    } catch (IOException ioexception) {
		if (Class41.aClass117_867 != null) {
		    Class41.aClass117_867.method1632((byte) -104);
		    Class41.aClass117_867 = null;
		}
		if ((Class55.anInt1085 ^ 0xffffffff) > -2) {
		    Class55.anInt1085++;
		    if ((Class123.anInt2319 ^ 0xffffffff)
			!= (Class7.anInt241 ^ 0xffffffff))
			Class7.anInt241 = Class123.anInt2319;
		    else
			Class7.anInt241 = Class13.anInt431;
		    Class67_Sub5_Sub12.anInt4695 = 1;
		    RuntimeException_Sub1.anInt2613 = 0;
		} else {
		    Class28.anInt652 = -4;
		    Class67_Sub5_Sub12.anInt4695 = 0;
		}
	    }
	}
    }
    
    public static void method1819(int arg0) {
	anInt3642++;
	if (Class41.aClass117_867 != null) {
	    Class41.aClass117_867.method1632((byte) -93);
	    Class41.aClass117_867 = null;
	}
	Class67_Sub1.method619(-18131);
	Class67_Sub11_Sub4.method1202();
	for (int i = 0; (i ^ 0xffffffff) > -5; i++)
	    Class53.aClass73Array1059[i].method1357(124);
	Class67_Sub1_Sub22.method723(false, (byte) -10);
	System.gc();
	Class67_Sub1_Sub10.method658(2, (byte) -111);
	Class57.aBoolean1106 = false;
	Class27.anInt637 = -1;
	Class99.method1521(true, 24077);
	Class67_Sub1_Sub11.anInt3992 = 0;
	Class58.baseX = 0;
	Canvas_Sub1.anInt64 = 0;
	Class137.baseY = 0;
	Class67_Sub5_Sub15.aBoolean4754 = false;
	for (int i = 0; i < Class136.aClass74Array2499.length; i++)
	    Class136.aClass74Array2499[i] = null;
	Class37.anInt794 = 0;
	Class67_Sub1_Sub4.anInt3855 = 0;
	for (int i = 0; (i ^ 0xffffffff) > -2049; i++) {
	    Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i] = null;
	    Class23.aStreamArray556[i] = null;
	}
	if (arg0 < 72)
	    aSprite_3650 = null;
	for (int i = 0; i < 32768; i++)
	    Class128.aClass131_Sub7_Sub1Array2386[i] = null;
	for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
	    for (int i_14_ = 0; i_14_ < 104; i_14_++) {
		for (int i_15_ = 0; i_15_ < 104; i_15_++)
		    Class67_Sub5_Sub2.aClass50ArrayArrayArray4471[i][i_14_]
			[i_15_]
			= null;
	    }
	}
	Class129.method1736(-1);
	Class66.anInt1326 = 0;
	Class15.method169((byte) 58);
	Class134.method1913(8, true);
    }
    
    public static void method1820(int arg0) {
	Class67_Sub1_Sub25.aClass136_4226.method1921((byte) -91);
	anInt3637++;
	Class61.aClass136_1141.method1921((byte) 61);
	if (arg0 != -1)
	    aRSString_3651 = null;
    }
    
    public int method1769() {
	anInt3649++;
	return anInt3635;
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	Class131_Sub6 class131_sub6
	    = PacketParser.method1596(anInt3638, -28322)
		  .method1397(null, 0, -93, anInt3641, 0, -1);
	anInt3646++;
	if (class131_sub6 != null) {
	    class131_sub6.method1764(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
				     arg7, arg8, arg9, arg10);
	    anInt3635 = class131_sub6.method1769();
	}
    }
    
    public static void method1821(int arg0) {
	aClass136_3639 = null;
	aRSString_3651 = null;
	if (arg0 != 0)
	    aClass136_3639 = null;
	aClass9_3644 = null;
	aSprite_3650 = null;
    }
}
