/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class65
{
    public static int anInt1240;
    public int anInt1241;
    public int anInt1242;
    public static int anInt1243;
    public int[] anIntArray1244;
    public boolean aBoolean1245;
    public static int anInt1246;
    public int anInt1247;
    public int anInt1248 = 0;
    public int anInt1249;
    public int lastLoadedObjectId;
    public static int anInt1251;
    public short[] aShortArray1252;
    public int anInt1253;
    public static int anInt1254;
    public static int anInt1255;
    public boolean aBoolean1256 = false;
    public RSString aRSString_1257;
    public static int anInt1258;
    public int anInt1259;
    public int anInt1260;
    public static int anInt1261;
    public Class92 aClass92_1262;
    public boolean aBoolean1263;
    public int anInt1264;
    public short[] aShortArray1265;
    public static int anInt1266;
    public static int anInt1267;
    public byte[] aByteArray1268;
    public short[] aShortArray1269;
    public int anInt1270;
    public int anInt1271;
    public static int anInt1272;
    public int anInt1273;
    public boolean aBoolean1274;
    public boolean aBoolean1275;
    public boolean aBoolean1276;
    public int anInt1277;
    public boolean aBoolean1278;
    public static RSString[] aRSStringArray1279;
    public int anInt1280;
    public boolean aBoolean1281;
    public static int anInt1282;
    public int anInt1283;
    public byte aByte1284;
    public int[] anIntArray1285;
    public short aShort1286;
    public static int anInt1287;
    public static int anInt1288;
    public int anInt1289;
    public int anInt1290;
    public int anInt1291;
    public static int anInt1292;
    public int anInt1293;
    public boolean aBoolean1294;
    public static RSString aRSString_1295
	= Class134.method1914("Bitte entfernen Sie ", (byte) 121);
    public int anInt1296;
    public int anInt1297;
    public short[] aShortArray1298;
    public boolean aBoolean1299;
    public int anInt1300;
    public boolean aBoolean1301;
    public RSString[] aRSStringArray1302;
    public int anInt1303;
    public int[] anIntArray1304;
    public int anInt1305;
    public static int anInt1306;
    public int anInt1307;
    public int anInt1308;
    public boolean aBoolean1309;
    public static int anInt1310;
    public int anInt1311;
    public boolean aBoolean1312;
    public static int anInt1313;
    public int anInt1314;
    public int anInt1315;
    public int[] anIntArray1316;
    public boolean aBoolean1317;
    
    public boolean method582(byte arg0) {
	anInt1258++;
	if (anIntArray1244 == null) {
	    if (anInt1270 == -1 && anIntArray1304 == null)
		return false;
	    return true;
	}
	if (arg0 != -95)
	    aBoolean1276 = true;
	for (int i = 0;
	     (i ^ 0xffffffff) > (anIntArray1244.length ^ 0xffffffff); i++) {
	    if (anIntArray1244[i] != -1) {
		Class65 class65 = Class73.method1359(11525, anIntArray1244[i]);
		if (class65.anInt1270 != -1 || class65.anIntArray1304 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public static Class67_Sub5_Sub19 method583
	(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5,
	 boolean arg6, int arg7) {
	Class76 class76 = PacketParser.method1596(arg0, -28322);
	anInt1287++;
	if (arg2 > 1 && class76.anIntArray1546 != null) {
	    int i = -1;
	    for (int i_0_ = 0; i_0_ < 10; i_0_++) {
		if (class76.anIntArray1524[i_0_] <= arg2
		    && (class76.anIntArray1524[i_0_] ^ 0xffffffff) != -1)
		    i = class76.anIntArray1546[i_0_];
	    }
	    if ((i ^ 0xffffffff) != 0)
		class76 = PacketParser.method1596(i, -28322);
	}
	Class131_Sub6_Sub1 class131_sub6_sub1 = class76.method1383((byte) -72);
	if (class131_sub6_sub1 == null)
	    return null;
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1 = null;
	if ((class76.anInt1521 ^ 0xffffffff) != 0) {
	    class67_sub5_sub19_sub1
		= (Class67_Sub5_Sub19_Sub1) method583(class76.anInt1511, true,
						      10, true, 97, 1, false,
						      0);
	    if (class67_sub5_sub19_sub1 == null)
		return null;
	} else if (class76.anInt1535 != -1) {
	    class67_sub5_sub19_sub1
		= (Class67_Sub5_Sub19_Sub1) method583(class76.anInt1540, true,
						      arg2, false, 120, arg5,
						      false, arg7);
	    if (class67_sub5_sub19_sub1 == null)
		return null;
	}
	int i = Class121.anInt2296;
	int[] is = Class121.anIntArray2300;
	int[] is_1_ = new int[4];
	int i_2_ = Class121.anInt2302;
	Class121.method1680(is_1_);
	Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1_3_
	    = new Class67_Sub5_Sub19_Sub1(36, 32);
	Class121.method1684(class67_sub5_sub19_sub1_3_.anIntArray5149, 36, 32);
	Class26.method239();
	Class26.method250(16, 16);
	int i_4_ = class76.anInt1557;
	if (arg4 <= 94)
	    anInt1292 = -100;
	if (arg3)
	    i_4_ = (int) (1.5 * (double) i_4_);
	else if (arg5 == 2)
	    i_4_ = (int) (1.04 * (double) i_4_);
	Class26.aBoolean606 = false;
	int i_5_
	    = i_4_ * Class26.anIntArray612[class76.anInt1545] >> 943433776;
	int i_6_
	    = Class26.anIntArray617[class76.anInt1545] * i_4_ >> -1537127184;
	class131_sub6_sub1.method1841(0, class76.anInt1541, class76.anInt1512,
				      class76.anInt1545, class76.anInt1520,
				      (-(class131_sub6_sub1.method1769() / 2)
				       + (i_6_ + class76.anInt1516)),
				      i_5_ - -class76.anInt1516, -1L);
	if (arg5 >= 1) {
	    class67_sub5_sub19_sub1_3_.method1016(1);
	    if (arg5 >= 2)
		class67_sub5_sub19_sub1_3_.method1016(16777215);
	    Class121.method1684(class67_sub5_sub19_sub1_3_.anIntArray5149, 36,
				32);
	}
	if ((arg7 ^ 0xffffffff) != -1)
	    class67_sub5_sub19_sub1_3_.method1017(arg7);
	if ((class76.anInt1521 ^ 0xffffffff) != 0)
	    class67_sub5_sub19_sub1.method1006(0, 0);
	else if (class76.anInt1535 != -1) {
	    Class121.method1684(class67_sub5_sub19_sub1.anIntArray5149, 36,
				32);
	    class67_sub5_sub19_sub1_3_.method1006(0, 0);
	    class67_sub5_sub19_sub1_3_ = class67_sub5_sub19_sub1;
	}
	if (arg6 && (class76.anInt1559 == 1 || (arg2 ^ 0xffffffff) != -2)
	    && (arg2 ^ 0xffffffff) != 0)
	    Class4.aClass67_Sub5_Sub10_Sub1_132
		.method920(Class61.method549(92, arg2), 0, 9, 16776960, 1);
	Class121.method1684(is, i, i_2_);
	Class121.method1677(is_1_);
	Class26.method239();
	Class26.aBoolean606 = true;
	return class67_sub5_sub19_sub1_3_;
    }
    
    public Class143 method584
	(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5,
	 int[][] arg6, Class119_Sub1 arg7, int arg8, int arg9, boolean arg10) {
	try {
	    anInt1243++;
	    if (arg5 >= -38)
		return null;
	    long l;
	    if (anIntArray1285 != null)
		l = (long) (arg2 + (arg1 << -389589469)
			    + (lastLoadedObjectId << 1024742634));
	    else
		l = (long) (arg2 + (lastLoadedObjectId << -1315845814));
	    boolean bool;
	    if (arg4 && aBoolean1275) {
		l |= ~0x7fffffffffffffffL;
		bool = true;
	    } else
		bool = false;
	    Class131 class131
		= ((Class131)
		   Class67_Sub1_Sub34.aClass136_4332.method1924(l, false));
	    if (class131 == null) {
		Class131_Sub2 class131_sub2 = method586(arg1, -30, arg2);
		if (class131_sub2 == null) {
		    RuntimeException_Sub1.aClass143_2617.aClass131_2581 = null;
		    return RuntimeException_Sub1.aClass143_2617;
		}
		class131_sub2.method1788();
		if ((arg1 ^ 0xffffffff) == -11 && arg2 > 3)
		    class131_sub2.method1792(256);
		if (bool) {
		    class131 = class131_sub2;
		    class131_sub2.aShort3549 = (short) (64 + anInt1248);
		    class131_sub2.aShort3546 = (short) (anInt1277 * 5 + 768);
		    class131_sub2.method1782();
		} else
		    class131
			= new Class131_Sub6_Sub1(class131_sub2, anInt1248 + 64,
						 768 + 5 * anInt1277, -50, -10,
						 -50);
		Class67_Sub1_Sub34.aClass136_4332.method1926(l, class131,
							     (byte) -71);
	    }
	    if (bool)
		class131 = ((Class131_Sub2) class131).method1786();
	    if ((aByte1284 ^ 0xffffffff) != -1) {
		if (!(class131 instanceof Class131_Sub6_Sub1)) {
		    if (class131 instanceof Class131_Sub2)
			class131
			    = ((Class131_Sub2) class131).method1779(aByte1284,
								    aShort1286,
								    arg6, arg0,
								    arg9, arg3,
								    arg8, true,
								    false);
		} else
		    class131 = (((Class131_Sub6_Sub1) class131).method1859
				(aByte1284, aShort1286, arg6, arg0, arg9, arg3,
				 arg8, true));
	    }
	    RuntimeException_Sub1.aClass143_2617.aClass131_2581 = class131;
	    return RuntimeException_Sub1.aClass143_2617;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("jb.N(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
			+ arg5 + ',' + (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ',' + arg10 + ')'));
	}
    }
    
    public void loadObject(Stream arg0, int arg1, boolean arg2) {
	anInt1254++;
	if (arg1 != 1) {
	    if (arg1 != 2) {
		if (arg1 != 5) {
		    if ((arg1 ^ 0xffffffff) == -15)
			anInt1297 = arg0.readByte((byte) -125);
		    else if ((arg1 ^ 0xffffffff) != -16) {
			if ((arg1 ^ 0xffffffff) == -18) {
			    anInt1308 = 0;
			    aBoolean1278 = false;
			} else if (arg1 == 18)
			    aBoolean1278 = false;
			else if ((arg1 ^ 0xffffffff) != -20) {
			    if (arg1 == 21)
				aByte1284 = (byte) 1;
			    else if ((arg1 ^ 0xffffffff) != -23) {
				if ((arg1 ^ 0xffffffff) != -24) {
				    if ((arg1 ^ 0xffffffff) == -25) {
					anInt1273 = arg0.readUShort(-2386);
					if (anInt1273 == 65535)
					    anInt1273 = -1;
				    } else if (arg1 != 27) {
					if (arg1 != 28) {
					    if (arg1 == 29)
						anInt1248 = (arg0.readByte2
							     ((byte) 1));
					    else if (arg1 != 39) {
						if (arg1 >= 30
						    && ((arg1 ^ 0xffffffff)
							> -36)) {
						    aRSStringArray1302[(arg1
								       - 30)]
							= arg0.readRSString(-1);
						    if (aRSStringArray1302
							    [-30 + arg1]
							    .method526
							(-98,
							 (Class67_Sub1_Sub12
							  .aRSString_4000)))
							aRSStringArray1302
							    [-30 + arg1]
							    = null;
						} else if ((arg1 ^ 0xffffffff) == -41) {
						    int i = (arg0.readByte((byte) 120));
						    aShortArray1298 = new short[i];
						    aShortArray1269 = new short[i];
						    for (int i_7_ = 0; ((i ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
							aShortArray1269[i_7_] = (short) (arg0.readUShort(-2386));
							aShortArray1298[i_7_] = (short) (arg0.readUShort(-2386));
						    }
						} else if ((arg1 ^ 0xffffffff) != -42) {
						    if ((arg1 ^ 0xffffffff) == -43) {
							int i = (arg0.readByte((byte) 123));
							aByteArray1268 = new byte[i];
							for (int i_8_ = 0; i > i_8_; i_8_++)
							    aByteArray1268[i_8_] = (arg0.readByte2((byte) 1));
						    } else if (arg1 == 60)
							anInt1249 = (arg0.readUShort(-2386));
						    else if (arg1 == 62)
							aBoolean1301 = true;
						    else if ((arg1 ^ 0xffffffff) == -65)
							aBoolean1317 = false;
						    else if (arg1 == 65)
							anInt1241 = (arg0.readUShort(-2386));
						    else if (arg1 == 66)
							anInt1293 = (arg0.readUShort(-2386));
						    else if ((arg1 ^ 0xffffffff)
							     != -68) {
							if ((arg1 ^ 0xffffffff) == -70)
							    anInt1311 = (arg0.readByte((byte) -18));
							else if (arg1 != 70) {
							    if (arg1 != 71) {
								if ((arg1 ^ 0xffffffff) == -73)
								    anInt1259 = (arg0.readShort2((byte) 89));
								else if ((arg1 ^ 0xffffffff) == -74)
								    aBoolean1256 = true;
								else if (arg1 != 74) {
								    if (arg1 == 75)
									anInt1253 = arg0.readByte((byte) -28);
								    else if (arg1 != 77 && (arg1 ^ 0xffffffff) != -93) {
									if (arg1 != 78) {
									    if ((arg1 ^ 0xffffffff) != -80) {
										if (arg1 == 81) {
										    aByte1284 = (byte) 2;
										    aShort1286 = (short) (arg0.readByte((byte) -115) * 256);
										} else if (arg1 != 82) {
										    if (arg1 != 88) {
											if ((arg1 ^ 0xffffffff) == -90)
											    aBoolean1276 = false;
											else if ((arg1 ^ 0xffffffff) != -91) {
											    if (arg1 != 91) {
												if (arg1 == 93) {
												    aByte1284 = (byte) 3;
												    aShort1286 = (short) arg0.readUShort(-2386);
												} else if ((arg1 ^ 0xffffffff) != -95) {
												    if ((arg1 ^ 0xffffffff) == -96)
													aByte1284 = (byte) 5;
												    else if (arg1 == 96)
													aBoolean1274 = true;
												    else if ((arg1 ^ 0xffffffff) != -98) {
													if (arg1 != 98) {
													    if ((arg1 ^ 0xffffffff) != -100) {
														if (arg1 != 100) {
														    if (arg1 != 101) {
															if ((arg1 ^ 0xffffffff) == -103)
															    anInt1314 = arg0.readUShort(-2386);
															else if (arg1 == 249) {
															    int i = arg0.readByte((byte) -59);
															    if (aClass92_1262 == null) {
																int i_9_ = Class67_Sub1_Sub31.method765(116, i);
																aClass92_1262 = new Class92(i_9_);
															    }
															    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
																boolean bool = (arg0.readByte((byte) 98) ^ 0xffffffff) == -2;
																int i_11_ = arg0.readThreeBytes(65280);
																Class67 class67;
																if (!bool)
																    class67 = new Class67_Sub19(arg0.readInt((byte) 127));
																else
																    class67 = new Class67_Sub29(arg0.readRSString(-1));
																aClass92_1262.method1488((byte) -89, class67, (long) i_11_);
															    }
															}
														    } else
															anInt1280 = arg0.readByte((byte) 112);
														} else {
														    anInt1296 = arg0.readByte((byte) -97);
														    anInt1247 = arg0.readUShort(-2386);
														}
													    } else {
														anInt1290 = arg0.readByte((byte) -81);
														anInt1260 = arg0.readUShort(-2386);
													    }
													} else
													    aBoolean1294 = true;
												    } else
													aBoolean1312 = true;
												} else
												    aByte1284 = (byte) 4;
											    } else
												aBoolean1309 = true;
											} else
											    aBoolean1281 = true;
										    } else
											aBoolean1299 = false;
										}
									    } else {
										anInt1242 = arg0.readUShort(-2386);
										anInt1300 = arg0.readUShort(-2386);
										anInt1307 = arg0.readByte((byte) 116);
										int i = arg0.readByte((byte) 83);
										anIntArray1304 = new int[i];
										for (int i_12_ = 0; i > i_12_; i_12_++)
										    anIntArray1304[i_12_] = arg0.readUShort(-2386);
									    }
									} else {
									    anInt1270 = arg0.readUShort(-2386);
									    anInt1307 = arg0.readByte((byte) -96);
									}
								    } else {
									anInt1315
									    = arg0.readUShort(-2386);
									if ((anInt1315
									     ^ 0xffffffff)
									    == -65536)
									    anInt1315 = -1;
									int i
									    = -1;
									anInt1303
									    = arg0.readUShort(-2386);
									if ((anInt1303
									     ^ 0xffffffff)
									    == -65536)
									    anInt1303 = -1;
									if (arg1
									    == 92) {
									    i = arg0.readUShort(-2386);
									    if (i == 65535)
										i = -1;
									}
									int i_13_
									    = arg0.readByte((byte) 91);
									anIntArray1244
									    = new int[2 + i_13_];
									for (int i_14_ = 0;
									     i_14_ <= i_13_;
									     i_14_++) {
									    anIntArray1244[i_14_] = arg0.readUShort(-2386);
									    if ((anIntArray1244[i_14_] ^ 0xffffffff) == -65536)
										anIntArray1244[i_14_] = -1;
									}
									anIntArray1244
									    [i_13_ - -1]
									    = i;
								    }
								} else
								    aBoolean1245
									= true;
							    } else
								anInt1305
								    = (arg0.readShort2
								       ((byte) 81));
							} else
							    anInt1271
								= (arg0.readShort2
								   ((byte) 108));
						    } else
							anInt1289
							    = (arg0.readUShort
							       (-2386));
						} else {
						    int i = (arg0.readByte
							     ((byte) -19));
						    aShortArray1252
							= new short[i];
						    aShortArray1265
							= new short[i];
						    for (int i_15_ = 0;
							 i > i_15_; i_15_++) {
							aShortArray1252[i_15_]
							    = (short) (arg0.readUShort
								       (-2386));
							aShortArray1265[i_15_]
							    = (short) (arg0.readUShort
								       (-2386));
						    }
						}
					    } else
						anInt1277
						    = 5 * (arg0.readByte2
							   ((byte) 1));
					} else
					    anInt1291
						= arg0.readByte((byte) 123);
				    } else
					anInt1308 = 1;
				} else
				    aBoolean1263 = true;
			    } else
				aBoolean1275 = true;
			} else
			    anInt1283 = arg0.readByte((byte) 122);
		    } else
			anInt1264 = arg0.readByte((byte) -69);
		} else {
		    int i = arg0.readByte((byte) -117);
		    if (i > 0) {
			if (anIntArray1316 == null || Class132.aBoolean2443) {
			    anIntArray1285 = null;
			    anIntArray1316 = new int[i];
			    for (int i_16_ = 0; i_16_ < i; i_16_++)
				anIntArray1316[i_16_] = arg0.readUShort(-2386);
			} else
			    arg0.currentOffset += i * 2;
		    }
		}
	    } else
		aRSString_1257 = arg0.readRSString(-1);
	} else {
	    int i = arg0.readByte((byte) -114);
	    if (i > 0) {
		if (anIntArray1316 == null || Class132.aBoolean2443) {
		    anIntArray1316 = new int[i];
		    anIntArray1285 = new int[i];
		    for (int i_17_ = 0;
			 (i_17_ ^ 0xffffffff) > (i ^ 0xffffffff); i_17_++) {
			anIntArray1316[i_17_] = arg0.readUShort(-2386);
			anIntArray1285[i_17_] = arg0.readByte((byte) -121);
		    }
		} else
		    arg0.currentOffset += 3 * i;
	    }
	}
	if (arg2 != false)
	    aBoolean1245 = true;
    }
    
    public Class131_Sub2 method586(int arg0, int arg1, int arg2) {
	anInt1282++;
	boolean bool = aBoolean1301;
	if (arg0 == 2 && (arg2 ^ 0xffffffff) < -4)
	    bool = !bool;
	Class131_Sub2 class131_sub2 = null;
	if (anIntArray1285 != null) {
	    int i = -1;
	    for (int i_18_ = 0; i_18_ < anIntArray1285.length; i_18_++) {
		if (arg0 == anIntArray1285[i_18_]) {
		    i = i_18_;
		    break;
		}
	    }
	    if (i == -1)
		return null;
	    int i_19_ = anIntArray1316[i];
	    if (bool)
		i_19_ += 65536;
	    class131_sub2
		= ((Class131_Sub2)
		   Class82.aClass136_1661.method1924((long) i_19_, false));
	    if (class131_sub2 == null) {
		class131_sub2
		    = Class131_Sub2.method1780(Class67_Sub10.aClass9_3018,
					       i_19_ & 0xffff, 0);
		if (class131_sub2 == null)
		    return null;
		if (bool)
		    class131_sub2.method1781();
		Class82.aClass136_1661.method1926((long) i_19_, class131_sub2,
						  (byte) -71);
	    }
	} else {
	    if (arg0 != 10)
		return null;
	    if (anIntArray1316 == null)
		return null;
	    int i = anIntArray1316.length;
	    for (int i_20_ = 0; (i ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
		 i_20_++) {
		int i_21_ = anIntArray1316[i_20_];
		if (bool)
		    i_21_ += 65536;
		class131_sub2
		    = ((Class131_Sub2)
		       Class82.aClass136_1661.method1924((long) i_21_, false));
		if (class131_sub2 == null) {
		    class131_sub2
			= Class131_Sub2.method1780(Class67_Sub10.aClass9_3018,
						   i_21_ & 0xffff, 0);
		    if (class131_sub2 == null)
			return null;
		    if (bool)
			class131_sub2.method1781();
		    Class82.aClass136_1661
			.method1926((long) i_21_, class131_sub2, (byte) -71);
		}
		if ((i ^ 0xffffffff) < -2)
		    Class83.aClass131_Sub2Array1679[i_20_] = class131_sub2;
	    }
	    if ((i ^ 0xffffffff) < -2)
		class131_sub2
		    = new Class131_Sub2(Class83.aClass131_Sub2Array1679, i);
	}
	boolean bool_22_;
	if ((anInt1241 ^ 0xffffffff) == -129 && anInt1293 == 128
	    && (anInt1289 ^ 0xffffffff) == -129)
	    bool_22_ = false;
	else
	    bool_22_ = true;
	boolean bool_23_;
	if (anInt1271 != 0 || (anInt1305 ^ 0xffffffff) != -1
	    || (anInt1259 ^ 0xffffffff) != -1)
	    bool_23_ = true;
	else
	    bool_23_ = false;
	Class131_Sub2 class131_sub2_24_
	    = new Class131_Sub2(class131_sub2,
				arg2 == 0 && !bool_22_ && !bool_23_,
				aShortArray1269 == null,
				aShortArray1252 == null, true);
	if (arg0 == 4 && arg2 > 3) {
	    class131_sub2_24_.method1792(256);
	    class131_sub2_24_.method1798(45, 0, -45);
	}
	if (arg1 != -30)
	    return null;
	arg2 &= 0x3;
	if (arg2 == 1)
	    class131_sub2_24_.method1778();
	else if (arg2 != 2) {
	    if ((arg2 ^ 0xffffffff) == -4)
		class131_sub2_24_.method1789();
	} else
	    class131_sub2_24_.method1785();
	if (aShortArray1269 != null) {
	    for (int i = 0; aShortArray1269.length > i; i++) {
		if (aByteArray1268 == null || aByteArray1268.length <= i)
		    class131_sub2_24_.method1796(aShortArray1269[i],
						 aShortArray1298[i]);
		else
		    class131_sub2_24_.method1796(aShortArray1269[i],
						 (Class55_Sub2_Sub1
						  .aShortArray3797
						  [0xff & aByteArray1268[i]]));
	    }
	}
	if (aShortArray1252 != null) {
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aShortArray1252.length ^ 0xffffffff); i++)
		class131_sub2_24_.method1791(aShortArray1252[i],
					     aShortArray1265[i]);
	}
	if (bool_22_)
	    class131_sub2_24_.method1776(anInt1241, anInt1293, anInt1289);
	if (bool_23_)
	    class131_sub2_24_.method1798(anInt1271, anInt1305, anInt1259);
	return class131_sub2_24_;
    }
    
    public static void method587(int arg0) {
	aRSStringArray1279 = null;
	if (arg0 > -1)
	    anInt1292 = -67;
	aRSString_1295 = null;
    }
    
    public boolean method588(byte arg0) {
	anInt1251++;
	if (anIntArray1316 == null)
	    return true;
	if (arg0 != -20)
	    method584(null, 123, -50, -20, true, (byte) -88, null, null, 4,
		      108, true);
	boolean bool = true;
	for (int i = 0; anIntArray1316.length > i; i++)
	    bool &= Class67_Sub10.aClass9_3018
			.method117(true, 0xffff & anIntArray1316[i], 0);
	return bool;
    }
    
    public boolean method589(int arg0, int arg1) {
	if (arg0 != -30880)
	    method588((byte) -23);
	anInt1240++;
	if (anIntArray1285 == null) {
	    if (anIntArray1316 == null)
		return true;
	    if ((arg1 ^ 0xffffffff) != -11)
		return true;
	    boolean bool = true;
	    for (int i = 0; i < anIntArray1316.length; i++)
		bool &= Class67_Sub10.aClass9_3018
			    .method117(true, anIntArray1316[i] & 0xffff, 0);
	    return bool;
	}
	for (int i = 0; anIntArray1285.length > i; i++) {
	    if ((anIntArray1285[i] ^ 0xffffffff) == (arg1 ^ 0xffffffff))
		return Class67_Sub10.aClass9_3018
			   .method117(true, 0xffff & anIntArray1316[i], 0);
	}
	return true;
    }
    
    public Class65 method590(byte arg0) {
	anInt1310++;
	int i = -1;
	if (anInt1315 == -1) {
	    if ((anInt1303 ^ 0xffffffff) != 0)
		i = Class137.anIntArray2504[anInt1303];
	} else
	    i = Class67_Sub9.method1113(22255, anInt1315);
	if (i < 0
	    || (anIntArray1244.length + -1 ^ 0xffffffff) >= (i ^ 0xffffffff)
	    || anIntArray1244[i] == -1) {
	    int i_25_ = anIntArray1244[anIntArray1244.length - 1];
	    if ((i_25_ ^ 0xffffffff) == 0)
		return null;
	    return Class73.method1359(11525, i_25_);
	}
	if (arg0 != -84)
	    method596(2);
	return Class73.method1359(arg0 ^ ~0x2d56, anIntArray1244[i]);
    }
    
    public Class143 method591(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int[][] arg6, int arg7, boolean arg8,
			      int arg9, byte arg10, Class119_Sub1 arg11,
			      int[][] arg12, Class41 arg13) {
	try {
	    anInt1306++;
	    int i = 104 / ((arg10 - -59) / 60);
	    long l;
	    if (anIntArray1285 == null)
		l = (long) ((lastLoadedObjectId << -1585119030) + arg7);
	    else
		l = (long) (arg7 + (lastLoadedObjectId << -630622230)
			    + (arg1 << -2006650141));
	    Class131_Sub6_Sub1 class131_sub6_sub1
		= ((Class131_Sub6_Sub1)
		   Class132.aClass136_2439.method1924(l, false));
	    if (class131_sub6_sub1 == null) {
		Class131_Sub2 class131_sub2 = method586(arg1, -30, arg7);
		if (class131_sub2 == null)
		    return null;
		class131_sub6_sub1
		    = new Class131_Sub6_Sub1(class131_sub2, anInt1248 + 64,
					     5 * anInt1277 + 768, -50, -10,
					     -50);
		Class132.aClass136_2439.method1926(l, class131_sub6_sub1,
						   (byte) -71);
	    }
	    boolean bool = false;
	    if (arg13 != null) {
		class131_sub6_sub1
		    = (Class131_Sub6_Sub1) arg13.method354(arg9, arg7,
							   class131_sub6_sub1,
							   arg3, arg2, false);
		bool = true;
	    }
	    if (arg1 == 10 && arg7 > 3) {
		if (!bool) {
		    class131_sub6_sub1
			= ((Class131_Sub6_Sub1)
			   class131_sub6_sub1.method1856(true, true, true));
		    bool = true;
		}
		class131_sub6_sub1.method1855(256);
	    }
	    if ((aByte1284 ^ 0xffffffff) != -1) {
		if (!bool) {
		    bool = true;
		    class131_sub6_sub1
			= ((Class131_Sub6_Sub1)
			   class131_sub6_sub1.method1856(true, true, true));
		}
		class131_sub6_sub1
		    = class131_sub6_sub1.method1859(aByte1284, aShort1286,
						    arg6, arg12, arg5, arg0,
						    arg4, false);
	    }
	    RuntimeException_Sub1.aClass143_2617.aClass131_2581
		= class131_sub6_sub1;
	    return RuntimeException_Sub1.aClass143_2617;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("jb.J(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + arg4 + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7 + ','
			+ arg8 + ',' + arg9 + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ','
			+ (arg12 != null ? "{...}" : "null") + ','
			+ (arg13 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int method592(boolean arg0, int arg1, int arg2) {
	anInt1267++;
	if (aClass92_1262 == null)
	    return arg1;
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_1262.method1489((byte) -70, (long) arg2));
	if (class67_sub19 == null)
	    return arg1;
	if (arg0 != false)
	    anInt1249 = -15;
	return class67_sub19.anInt3149;
    }
    
    public void method593(int arg0) {
	if ((anInt1283 ^ 0xffffffff) == 0) {
	    anInt1283 = 0;
	    if (anIntArray1316 != null
		&& (anIntArray1285 == null
		    || (anIntArray1285[0] ^ 0xffffffff) == -11))
		anInt1283 = 1;
	    for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
		if (aRSStringArray1302[i] != null) {
		    anInt1283 = 1;
		    break;
		}
	    }
	}
	anInt1313++;
	if (arg0 < 108)
	    anInt1314 = -102;
	if ((anInt1253 ^ 0xffffffff) == 0)
	    anInt1253 = anInt1308 == 0 ? 0 : 1;
    }
    
    public void loadObjects(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) -101);
	    if (i == 0)
		break;
	    loadObject(arg0, i, false);
	}
	anInt1266++;
	if (arg1 != 7423)
	    aBoolean1309 = true;
    }
    
    public RSString method595(byte arg0, RSString arg1, int arg2) {
	anInt1246++;
	if (aClass92_1262 == null)
	    return arg1;
	Class67_Sub29 class67_sub29
	    = ((Class67_Sub29)
	       aClass92_1262.method1489((byte) -52, (long) arg2));
	int i = -66 % ((arg0 - 33) / 53);
	if (class67_sub29 == null)
	    return arg1;
	return class67_sub29.musicName;
    }
    
    public static int method596(int arg0) {
	anInt1261++;
	try {
	    if (arg0 == (Class140.anInt2549 ^ 0xffffffff)) {
		if (-5000L + Class39.method337(19644) < Class72.aLong1440)
		    return 0;
		Class43.aClass31_907
		    = Class124.aSignLink_2335.method403(Class7.anInt241, false,
						       (Class67_Sub5_Sub13
							.connectServerIP));
		Class67_Sub5_Sub5.aLong4522 = Class39.method337(19644);
		Class140.anInt2549 = 1;
	    }
	    if ((30000L + Class67_Sub5_Sub5.aLong4522 ^ 0xffffffffffffffffL)
		> (Class39.method337(arg0 ^ ~0x4cbc) ^ 0xffffffffffffffffL))
		return Class67_Sub14.method1233(1000, (byte) 116);
	    if ((Class140.anInt2549 ^ 0xffffffff) == -2) {
		if (Class43.aClass31_907.anInt706 == 2)
		    return Class67_Sub14.method1233(1001, (byte) 112);
		if ((Class43.aClass31_907.anInt706 ^ 0xffffffff) != -2)
		    return -1;
		Class41.aClass117_867
		    = new Class117((Socket) Class43.aClass31_907.anObject705,
				   Class124.aSignLink_2335);
		Class70_Sub1.outStream.currentOffset = 0;
		Class43.aClass31_907 = null;
		int i = 0;
		if (Class67_Sub1_Sub27.aBoolean4238)
		    i = Class67_Sub1_Sub23.anInt4187;
		Class70_Sub1.outStream.addByte((byte) 4, 255);
		Class70_Sub1.outStream.addInt(i, 124);
		Class41.aClass117_867.queueBytesToSend(0, Class70_Sub1.outStream.buffer, Class70_Sub1.outStream.currentOffset, (byte) 121);
		if (Class67_Sub5_Sub9.aClass28_4616 != null)
		    Class67_Sub5_Sub9.aClass28_4616.method258(arg0 + 1);
		if (Class78.aClass28_1606 != null)
		    Class78.aClass28_1606.method258(0);
		int i_26_ = Class41.aClass117_867.method1631(17506);
		if (Class67_Sub5_Sub9.aClass28_4616 != null)
		    Class67_Sub5_Sub9.aClass28_4616.method258(arg0 + 1);
		if (Class78.aClass28_1606 != null)
		    Class78.aClass28_1606.method258(arg0 ^ 0xffffffff);
		if ((i_26_ ^ 0xffffffff) != -1)
		    return Class67_Sub14.method1233(i_26_, (byte) 73);
		Class140.anInt2549 = 2;
	    }
	    if ((Class140.anInt2549 ^ 0xffffffff) == -3) {
		if (Class41.aClass117_867.method1626(arg0 ^ 0x24) < 2)
		    return -1;
		Class36.anInt773 = Class41.aClass117_867.method1631(17506);
		Class36.anInt773 <<= 8;
		Class36.anInt773 += Class41.aClass117_867.method1631(17506);
		Class5.aByteArray142 = new byte[Class36.anInt773];
		Class12.anInt417 = 0;
		Class140.anInt2549 = 3;
	    }
	    if ((Class140.anInt2549 ^ 0xffffffff) == -4) {
		int i = Class41.aClass117_867.method1626(-95);
		if ((i ^ 0xffffffff) > -2)
		    return -1;
		if (-Class12.anInt417 + Class36.anInt773 < i)
		    i = Class36.anInt773 + -Class12.anInt417;
		Class41.aClass117_867.method1629((byte) -115,
						 Class5.aByteArray142,
						 Class12.anInt417, i);
		Class12.anInt417 += i;
		if (Class12.anInt417 < Class36.anInt773)
		    return -1;
		if (!Class84.method1446(Class5.aByteArray142, 1))
		    return Class67_Sub14.method1233(1002, (byte) 126);
		Class73.aClass70_Sub1Array1474
		    = new Class70_Sub1[Class67_Sub6.anInt2873];
		int i_27_ = 0;
		for (int i_28_ = Class102.anInt2003;
		     (i_28_ ^ 0xffffffff) >= (Class28.anInt645 ^ 0xffffffff);
		     i_28_++) {
		    Class70_Sub1 class70_sub1 = Class61.method552(i_28_, -111);
		    if (class70_sub1 != null)
			Class73.aClass70_Sub1Array1474[i_27_++] = class70_sub1;
		}
		Class41.aClass117_867.method1632((byte) -86);
		Class5.aByteArray142 = null;
		Class41.aClass117_867 = null;
		Class140.anInt2549 = 0;
		Class108.anInt2075 = 0;
		Class72.aLong1440 = Class39.method337(19644);
		return 0;
	    }
	} catch (java.io.IOException ioexception) {
	    return Class67_Sub14.method1233(1003, (byte) 49);
	}
	return -1;
    }
    
    public static Class126_Sub3 method597(Stream arg0, boolean arg1) {
	anInt1288++;
	if (arg1 != false)
	    return null;
	return new Class126_Sub3(arg0.readShort2((byte) 88),
				 arg0.readShort2((byte) 112),
				 arg0.readShort2((byte) 108),
				 arg0.readShort2((byte) 102),
				 arg0.readThreeBytes(65280),
				 arg0.readByte((byte) 103));
    }
    
    public Class65() {
	aBoolean1245 = false;
	anInt1260 = -1;
	aRSString_1257 = Class90.aRSString_1844;
	anInt1241 = 128;
	anInt1247 = -1;
	anInt1242 = 0;
	anInt1273 = -1;
	aBoolean1274 = false;
	anInt1253 = -1;
	aBoolean1278 = true;
	anInt1289 = 128;
	anInt1271 = 0;
	anInt1259 = 0;
	anInt1280 = 0;
	anInt1290 = -1;
	anInt1293 = 128;
	anInt1249 = -1;
	aByte1284 = (byte) 0;
	anInt1277 = 0;
	aBoolean1281 = false;
	aBoolean1294 = false;
	aBoolean1263 = false;
	aBoolean1276 = true;
	anInt1264 = 1;
	anInt1283 = -1;
	aBoolean1299 = true;
	aRSStringArray1302 = new RSString[5];
	aBoolean1301 = false;
	anInt1307 = 0;
	anInt1270 = -1;
	anInt1296 = -1;
	aBoolean1275 = false;
	aBoolean1309 = false;
	anInt1291 = 16;
	anInt1305 = 0;
	anInt1297 = 1;
	anInt1303 = -1;
	anInt1311 = 0;
	anInt1314 = -1;
	anInt1315 = -1;
	anInt1308 = 2;
	anInt1300 = 0;
	aBoolean1312 = false;
	aShort1286 = (short) -1;
	aBoolean1317 = true;
    }
    
    static {
	anInt1292 = -1;
    }
}
