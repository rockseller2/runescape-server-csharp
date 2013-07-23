/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76
{
    public static int anInt1500;
    public int anInt1501;
    public static int anInt1502;
    public int anInt1503;
    public static int anInt1504;
    public boolean aBoolean1505;
    public static int anInt1506;
    public int anInt1507;
    public static int anInt1508;
    public int anInt1509;
    public int anInt1510;
    public int anInt1511;
    public int anInt1512 = 0;
    public int anInt1513;
    public static int anInt1514;
    public static boolean aBoolean1515 = false;
    public int anInt1516;
    public int anInt1517;
    public RSString itemName;
    public static int anInt1519;
    public int anInt1520;
    public int anInt1521;
    public static int anInt1522;
    public int anInt1523;
    public int[] anIntArray1524;
    public short[] aShortArray1525;
    public int anInt1526;
    public static int anInt1527;
    public RSString[] aRSStringArray1528;
    public static RSString aRSString_1529;
    public static Class67_Sub14 aClass67_Sub14_1530;
    public static RSString aRSString_1531
	= Class134.method1914("Unable to find ", (byte) 14);
    public static int anInt1532;
    public int anInt1533;
    public int anInt1534;
    public int anInt1535;
    public byte[] aByteArray1536;
    public short[] aShortArray1537;
    public static int anInt1538;
    public int anInt1539;
    public int anInt1540;
    public int anInt1541;
    public static int anInt1542;
    public static int anInt1543;
    public static RSString aRSString_1544 = aRSString_1531;
    public int anInt1545;
    public int[] anIntArray1546;
    public int anInt1547;
    public static int anInt1548 = -1;
    public int anInt1549;
    public static int anInt1550;
    public Class92 aClass92_1551;
    public static int anInt1552;
    public static int anInt1553;
    public int anInt1554;
    public int anInt1555;
    public int anInt1556;
    public int anInt1557;
    public int anInt1558;
    public int anInt1559;
    public short[] aShortArray1560;
    public int anInt1561;
    public static int anInt1562;
    public int anInt1563;
    public int anInt1564;
    public int anInt1565;
    public int anInt1566;
    public int anInt1567;
    public boolean aBoolean1568;
    public static int anInt1569;
    public int anInt1570;
    public static int anInt1571;
    public RSString[] itemActions;
    public static int anInt1573;
    public int anInt1574;
    public int anInt1575;
    public short[] aShortArray1576;
    public int anInt1577;
    public static Class67_Sub24[][][] aClass67_Sub24ArrayArrayArray1578;
    public int anInt1579;
    public static int anInt1580;
    public static int anInt1581;
    public int anInt1582;
    public static RSString aRSString_1583;
    
    public Class131_Sub2 method1382(boolean arg0, boolean arg1) {
	int i = anInt1582;
	if (arg0 != false)
	    method1392(false, -79);
	int i_0_ = anInt1510;
	int i_1_ = anInt1570;
	anInt1538++;
	if (arg1) {
	    i_1_ = anInt1526;
	    i_0_ = anInt1566;
	    i = anInt1567;
	}
	if (i == -1)
	    return null;
	Class131_Sub2 class131_sub2
	    = Class131_Sub2.method1780(Class94.aClass9_1888, i, 0);
	if ((i_1_ ^ 0xffffffff) != 0) {
	    Class131_Sub2 class131_sub2_2_
		= Class131_Sub2.method1780(Class94.aClass9_1888, i_1_, 0);
	    if ((i_0_ ^ 0xffffffff) == 0) {
		Class131_Sub2[] class131_sub2s
		    = { class131_sub2, class131_sub2_2_ };
		class131_sub2 = new Class131_Sub2(class131_sub2s, 2);
	    } else {
		Class131_Sub2 class131_sub2_3_
		    = Class131_Sub2.method1780(Class94.aClass9_1888, i_0_, 0);
		Class131_Sub2[] class131_sub2s
		    = { class131_sub2, class131_sub2_2_, class131_sub2_3_ };
		class131_sub2 = new Class131_Sub2(class131_sub2s, 3);
	    }
	}
	if (!arg1 && (anInt1575 != 0 || anInt1547 != 0 || anInt1517 != 0))
	    class131_sub2.method1798(anInt1575, anInt1547, anInt1517);
	if (arg1 && ((anInt1561 ^ 0xffffffff) != -1
		     || (anInt1563 ^ 0xffffffff) != -1
		     || (anInt1565 ^ 0xffffffff) != -1))
	    class131_sub2.method1798(anInt1561, anInt1563, anInt1565);
	if (aShortArray1576 != null) {
	    for (int i_4_ = 0;
		 (i_4_ ^ 0xffffffff) > (aShortArray1576.length ^ 0xffffffff);
		 i_4_++)
		class131_sub2.method1796(aShortArray1576[i_4_],
					 aShortArray1560[i_4_]);
	}
	if (aShortArray1537 != null) {
	    for (int i_5_ = 0; aShortArray1537.length > i_5_; i_5_++)
		class131_sub2.method1791(aShortArray1537[i_5_],
					 aShortArray1525[i_5_]);
	}
	return class131_sub2;
    }
    
    public Class131_Sub6_Sub1 method1383(byte arg0) {
	int i = -128 / ((81 - arg0) / 41);
	anInt1543++;
	Class131_Sub2 class131_sub2
	    = Class131_Sub2.method1780(Class94.aClass9_1888, anInt1574, 0);
	if (class131_sub2 == null)
	    return null;
	if (aShortArray1576 != null) {
	    for (int i_6_ = 0;
		 (aShortArray1576.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		 i_6_++) {
		if (aByteArray1536 != null
		    && (aByteArray1536.length ^ 0xffffffff) < (i_6_
							       ^ 0xffffffff))
		    class131_sub2.method1796(aShortArray1576[i_6_],
					     (Class9.aShortArray367
					      [0xff & aByteArray1536[i_6_]]));
		else
		    class131_sub2.method1796(aShortArray1576[i_6_],
					     aShortArray1560[i_6_]);
	    }
	}
	if (aShortArray1537 != null) {
	    for (int i_7_ = 0;
		 (i_7_ ^ 0xffffffff) > (aShortArray1537.length ^ 0xffffffff);
		 i_7_++)
		class131_sub2.method1791(aShortArray1537[i_7_],
					 aShortArray1525[i_7_]);
	}
	Class131_Sub6_Sub1 class131_sub6_sub1
	    = class131_sub2.method1800(anInt1579 + 64, 768 + anInt1555, -50,
				       -10, -50);
	if (anInt1539 != 128 || anInt1501 != 128 || anInt1533 != 128)
	    class131_sub6_sub1.method1845(anInt1539, anInt1501, anInt1533);
	return class131_sub6_sub1;
    }
    
    public static void method1384(int arg0) {
	aRSString_1531 = null;
	aRSString_1583 = null;
	aClass67_Sub24ArrayArrayArray1578 = null;
	aClass67_Sub14_1530 = null;
	aRSString_1544 = null;
	aRSString_1529 = null;
	if (arg0 != 255)
	    aRSString_1531 = null;
    }
    
    public Class76 method1385(int arg0, int arg1) {
	if (arg1 != -1)
	    anInt1511 = 27;
	anInt1514++;
	if (anIntArray1546 != null && arg0 > 1) {
	    int i = -1;
	    for (int i_8_ = 0; i_8_ < 10; i_8_++) {
		if (anIntArray1524[i_8_] <= arg0 && anIntArray1524[i_8_] != 0)
		    i = anIntArray1546[i_8_];
	    }
	    if ((i ^ 0xffffffff) != 0)
		return PacketParser.method1596(i, arg1 ^ 0x6ea1);
	}
	return this;
    }
    
    public void method1386(byte arg0, Class76 arg1, Class76 arg2) {
	try {
	    if (arg0 > -120)
		method1383((byte) -69);
	    anInt1520 = arg1.anInt1520;
	    aShortArray1560 = arg1.aShortArray1560;
	    anInt1507 = arg2.anInt1507;
	    anInt1516 = arg1.anInt1516;
	    anInt1519++;
	    aShortArray1576 = arg1.aShortArray1576;
	    aShortArray1537 = arg1.aShortArray1537;
	    aBoolean1505 = arg2.aBoolean1505;
	    anInt1541 = arg1.anInt1541;
	    anInt1557 = arg1.anInt1557;
	    aByteArray1536 = arg1.aByteArray1536;
	    itemName = arg2.itemName;
	    aShortArray1525 = arg1.aShortArray1525;
	    anInt1574 = arg1.anInt1574;
	    anInt1559 = 1;
	    anInt1512 = arg1.anInt1512;
	    anInt1545 = arg1.anInt1545;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("kl.T(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method1387(Class76 arg0, Class76 arg1, boolean arg2) {
	try {
	    aShortArray1537 = arg1.aShortArray1537;
	    anInt1545 = arg0.anInt1545;
	    anInt1557 = arg0.anInt1557;
	    aShortArray1525 = arg1.aShortArray1525;
	    aShortArray1560 = arg1.aShortArray1560;
	    anInt1582 = arg1.anInt1582;
	    anInt1507 = 0;
	    aShortArray1576 = arg1.aShortArray1576;
	    anInt1526 = arg1.anInt1526;
	    anInt1561 = arg1.anInt1561;
	    anInt1565 = arg1.anInt1565;
	    anInt1520 = arg0.anInt1520;
	    anInt1563 = arg1.anInt1563;
	    if (arg2 == true) {
		itemName = arg1.itemName;
		aByteArray1536 = arg1.aByteArray1536;
		aRSStringArray1528 = arg1.aRSStringArray1528;
		anInt1517 = arg1.anInt1517;
		anInt1513 = arg1.anInt1513;
		anInt1567 = arg1.anInt1567;
		anInt1541 = arg0.anInt1541;
		anInt1510 = arg1.anInt1510;
		anInt1566 = arg1.anInt1566;
		anInt1558 = arg1.anInt1558;
		anInt1547 = arg1.anInt1547;
		anInt1577 = arg1.anInt1577;
		aBoolean1505 = arg1.aBoolean1505;
		anInt1575 = arg1.anInt1575;
		anInt1549 = arg1.anInt1549;
		anInt1553++;
		anInt1512 = arg0.anInt1512;
		anInt1564 = arg1.anInt1564;
		anInt1574 = arg0.anInt1574;
		anInt1570 = arg1.anInt1570;
		aClass92_1551 = arg1.aClass92_1551;
		itemActions = new RSString[5];
		anInt1516 = arg0.anInt1516;
		if (arg1.itemActions != null) {
		    for (int i = 0; i < 4; i++)
			itemActions[i] = arg1.itemActions[i];
		}
		itemActions[4] = Class92.aRSString_1866;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("kl.P("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub2 method1388(boolean arg0, int arg1) {
	int i = anInt1558;
	int i_9_ = anInt1564;
	if (arg0) {
	    i_9_ = anInt1513;
	    i = anInt1549;
	}
	anInt1552++;
	if (i_9_ == -1)
	    return null;
	Class131_Sub2 class131_sub2
	    = Class131_Sub2.method1780(Class94.aClass9_1888, i_9_, arg1);
	if (i != -1) {
	    Class131_Sub2 class131_sub2_10_
		= Class131_Sub2.method1780(Class94.aClass9_1888, i, 0);
	    Class131_Sub2[] class131_sub2s
		= { class131_sub2, class131_sub2_10_ };
	    class131_sub2 = new Class131_Sub2(class131_sub2s, 2);
	}
	if (aShortArray1576 != null) {
	    for (int i_11_ = 0;
		 (i_11_ ^ 0xffffffff) > (aShortArray1576.length ^ 0xffffffff);
		 i_11_++)
		class131_sub2.method1796(aShortArray1576[i_11_],
					 aShortArray1560[i_11_]);
	}
	if (aShortArray1537 != null) {
	    for (int i_12_ = 0;
		 (aShortArray1537.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
		 i_12_++)
		class131_sub2.method1791(aShortArray1537[i_12_],
					 aShortArray1525[i_12_]);
	}
	return class131_sub2;
    }
    
    public void loadItems(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) -123);
	    if (i == 0)
		break;
	    loadItem(i, arg0, -1);
	}
	if (arg1 == -15029)
	    anInt1542++;
    }
    
    public int method1390(int arg0, int arg1, byte arg2) {
	anInt1562++;
	if (aClass92_1551 == null)
	    return arg0;
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_1551.method1489((byte) -87, (long) arg1));
	if (arg2 > -117)
	    method1390(1, 53, (byte) 73);
	if (class67_sub19 == null)
	    return arg0;
	return class67_sub19.anInt3149;
    }
    
    public void loadItem(int arg0, Stream arg1, int arg2) { //load all items.
	anInt1569++;
	
	/*
	    //...custom dump code...
            try {
                java.io.FileOutputStream file = new java.io.FileOutputStream("./Objects/Items/item" + anInt1569 +".dat");
                file.write(arg1.buffer, 0, arg1.buffer.length);
                file.flush();
                file.close();
            }
            catch (java.io.IOException e) {
                e.printStackTrace();
            }
	    //... end of custom dump code .../
	*/
	
	
	if (arg2 == -1) {
	    if (arg0 == 1) {
		anInt1574 = arg1.readUShort(-2386);
	    } else {
		do {
		    if (arg0 != 2) {
			if (arg0 == 4)
			    anInt1557 = arg1.readUShort(-2386);
			else {
			    if (arg0 == 5)
				anInt1545 = arg1.readUShort(-2386);
			    else {
				if (arg0 == 6)
				    anInt1541 = arg1.readUShort(-2386);
				else {
				    if ((arg0 ^ 0xffffffff) != -8) {
					if (arg0 != 8) {
					    if (arg0 == 11)
						anInt1559 = 1;
					    else if ((arg0 ^ 0xffffffff)
						     != -13) {
						if (arg0 == 16)
						    aBoolean1505 = true;
						else if ((arg0 ^ 0xffffffff)
							 != -24) {
						    if (arg0 != 24) {
							if (arg0 != 25) {
							    if (arg0 != 26) {
								if (arg0 >= 30 && ((arg0 ^ 0xffffffff) > -36)) {
								    aRSStringArray1528[(arg0 + -30)] = (arg1.readRSString(-1));
								    if (aRSStringArray1528[-30 + arg0].method526((arg2 ^ 0x59),(Class67_Sub1_Sub12.aRSString_4000)))
									aRSStringArray1528[-30 + arg0] = null;
								} else if ((arg0 < 35) || arg0 >= 40) {
								    if ((arg0 ^ 0xffffffff) == -41) {
									int i = arg1.readByte((byte) -44);
									aShortArray1560 = new short[i];
									aShortArray1576 = new short[i];
									for (int i_13_ = 0; (i ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
									    aShortArray1576[i_13_] = (short) arg1.readUShort(-2386);
									    aShortArray1560[i_13_] = (short) arg1.readUShort(-2386);
									}
								    } else if (arg0 == 41) {
									int i = arg1.readByte((byte) 108);
									aShortArray1525 = new short[i];
									aShortArray1537 = new short[i];
									for (int i_14_ = 0;(i_14_ ^ 0xffffffff) > (i ^ 0xffffffff); i_14_++) {
									    aShortArray1537[i_14_] = (short) arg1.readUShort(-2386);
									    aShortArray1525[i_14_] = (short) arg1.readUShort(-2386);
									}
								    } else if (arg0 != 42) {
									if (arg0 == 65)
									    aBoolean1568 = true;
									else if (arg0 != 78) {
									    if (arg0 != 79) {
										if (arg0 != 90) {
										    if (arg0 == 91)
											anInt1513 = arg1.readUShort(-2386);
										    else if ((arg0 ^ 0xffffffff) == -93)
											anInt1558 = arg1.readUShort(-2386);
										    else if ((arg0 ^ 0xffffffff) != -94) {
											if ((arg0 ^ 0xffffffff) != -96) {
											    if ((arg0 ^ 0xffffffff) == -97)
												anInt1523 = arg1.readByte((byte) 125);
											    else if (arg0 == 97)
												anInt1511 = arg1.readUShort(-2386);
											    else if ((arg0 ^ 0xffffffff) == -99)
												anInt1521 = arg1.readUShort(arg2 ^ 0x951);
											    else if (arg0 < 100 || (arg0 ^ 0xffffffff) <= -111) {
												if ((arg0 ^ 0xffffffff) != -111) {
												    if ((arg0 ^ 0xffffffff) == -112)
													anInt1501 = arg1.readUShort(-2386);
												    else if (arg0 == 112)
													anInt1533 = arg1.readUShort(arg2 + -2385);
												    else if ((arg0 ^ 0xffffffff) != -114) {
													if (arg0 == 114)
													    anInt1555 = 5 * arg1.readByte2((byte) 1);
													else if (arg0 == 115)
													    anInt1577 = arg1.readByte((byte) -123);
													else if (arg0 == 121)
													    anInt1540 = arg1.readUShort(-2386);
													else if (arg0 != 122) {
													    if (arg0 != 125) {
														if (arg0 == 126) {
														    anInt1561 = arg1.readByte2((byte) 1);
														    anInt1563 = arg1.readByte2((byte) 1);
														    anInt1565 = arg1.readByte2((byte) 1);
														} else if (arg0 == 127) {
														    anInt1509 = arg1.readByte((byte) 88);
														    anInt1503 = arg1.readUShort(-2386);
														} else if (arg0 == 128) {
														    anInt1556 = arg1.readByte((byte) 84);
														    anInt1554 = arg1.readUShort(-2386);
														} else if ((arg0 ^ 0xffffffff) != -130) {
														    if (arg0 == 130) {
															arg1.readByte((byte) -117);
															arg1.readUShort(arg2 + -2385);
														    } else if (arg0 == 249) {
															int i = arg1.readByte((byte) 117);
															if (aClass92_1551 == null) {
															    int i_15_ = Class67_Sub1_Sub31.method765(115, i);
															    aClass92_1551 = new Class92(i_15_);
															}
															for (int i_16_ = 0; i_16_ < i; i_16_++) {
															    boolean bool = (arg1.readByte((byte) -56) ^ 0xffffffff) == -2;
															    int i_17_ = arg1.readThreeBytes(65280);
															    Class67 class67;
															    if (!bool)
																class67 = new Class67_Sub19(arg1.readInt((byte) 125));
															    else
																class67 = new Class67_Sub29(arg1.readRSString(-1));
															    aClass92_1551.method1488((byte) -89, class67, (long) i_17_);
															}
														    }
														} else {
														    arg1.readByte((byte) -50);
														    arg1.readUShort(-2386);
														}
													    } else {
														anInt1575 = arg1.readByte2((byte) 1);
														anInt1547 = arg1.readByte2((byte) 1);
														anInt1517 = arg1.readByte2((byte) 1);
													    }
													} else
													    anInt1535 = arg1.readUShort(-2386);
												    } else
													anInt1579 = arg1.readByte2((byte) 1);
												} else
												    anInt1539 = arg1.readUShort(-2386);
											    } else {
												if (anIntArray1546 == null) {
												    anIntArray1524 = new int[10];
												    anIntArray1546 = new int[10];
												}
												anIntArray1546[-100 + arg0] = arg1.readUShort(-2386);
												anIntArray1524[arg0 - 100] = arg1.readUShort(-2386);
											    }
											} else
											    anInt1512 = arg1.readUShort(-2386);
										    } else
											anInt1549 = arg1.readUShort(-2386);
										} else
										    anInt1564 = arg1.readUShort(-2386);
									    } else
										anInt1566 = arg1.readUShort(-2386);
									} else
									    anInt1510 = arg1.readUShort(-2386);
								    } else {
									int i = arg1.readByte((byte) 116);
									aByteArray1536 = new byte[i];
									for (int i_18_ = 0; i_18_ < i; i_18_++)
									    aByteArray1536[i_18_] = arg1.readByte2((byte) 1);
								    }
								} else
								    itemActions[(arg0 - 35)] = (arg1.readRSString(-1));
							    } else
								anInt1526 = (arg1.readUShort(-2386));
							} else
							    anInt1567 = (arg1.readUShort(-2386));
						    } else
							anInt1570 = (arg1.readUShort(-2386));
						} else
						    anInt1582 = (arg1.readUShort(arg2 + -2385));
					    } else
						anInt1507 = (arg1.readInt((byte) 125));
					} else {
					    anInt1516 = arg1.readUShort(-2386);
					    if (anInt1516 > 32767)
						anInt1516 -= 65536;
					}
				    } else {
					anInt1520 = arg1.readUShort(-2386);
					if (anInt1520 <= 32767)
					    break;
					anInt1520 -= 65536;
				    }
				    break;
				}
				break;
			    }
			    break;
			}
			break;
		    }
		    itemName = arg1.readRSString(-1); //itemName
		} while (false);
	    }
	}
    }
    
    public boolean method1392(boolean arg0, int arg1) {
	anInt1502++;
	int i = anInt1570;
	int i_19_ = anInt1582;
	int i_20_ = anInt1510;
	if (arg0) {
	    i = anInt1526;
	    i_19_ = anInt1567;
	    i_20_ = anInt1566;
	}
	if (i_19_ == -1)
	    return true;
	boolean bool = true;
	if (!Class94.aClass9_1888.method117(true, i_19_, 0))
	    bool = false;
	if ((i ^ 0xffffffff) != arg1
	    && !Class94.aClass9_1888.method117(true, i, 0))
	    bool = false;
	if (i_20_ != -1 && !Class94.aClass9_1888.method117(true, i_20_, 0))
	    bool = false;
	return bool;
    }
    
    public static void method1393(int arg0) {
	anInt1500++;
	Class122.aClass136_2303.method1921((byte) 58);
	if (arg0 != -1)
	    method1394((byte) -10);
    }
    
    public static Class33 method1394(byte arg0) {
	if (arg0 != 117)
	    aClass67_Sub24ArrayArrayArray1578 = null;
	anInt1504++;
	try {
	    return (Class33) Class.forName("Class33_Sub1").newInstance();
	} catch (Throwable throwable) {
	    return new Class33_Sub2();
	}
    }
    
    public boolean method1395(int arg0, boolean arg1) {
	anInt1532++;
	int i = anInt1564;
	if (arg0 != -13617)
	    method1395(-48, true);
	int i_21_ = anInt1558;
	if (arg1) {
	    i = anInt1513;
	    i_21_ = anInt1549;
	}
	if (i == -1)
	    return true;
	boolean bool = true;
	if (!Class94.aClass9_1888.method117(true, i, 0))
	    bool = false;
	if (i_21_ != -1 && !Class94.aClass9_1888.method117(true, i_21_, 0))
	    bool = false;
	return bool;
    }
    
    public void method1396(int arg0) {
	anInt1571++;
	if (arg0 != 768)
	    anInt1582 = -73;
    }
    
    public Class131_Sub6 method1397(Class41 arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5) {
	anInt1506++;
	if (arg2 != -93)
	    anInt1564 = 127;
	if (anIntArray1546 != null && arg3 > 1) {
	    int i = -1;
	    for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -11; i_22_++) {
		if (anIntArray1524[i_22_] <= arg3
		    && anIntArray1524[i_22_] != 0)
		    i = anIntArray1546[i_22_];
	    }
	    if (i != -1)
		return PacketParser.method1596(i, -28322)
			   .method1397(arg0, arg1, -93, 1, arg4, arg5);
	}
	Class131_Sub6 class131_sub6
	    = ((Class131_Sub6)
	       Class67_Sub24.aClass136_3234.method1924((long) anInt1534,
						       false));
	if (class131_sub6 == null) {
	    Class131_Sub2 class131_sub2
		= Class131_Sub2.method1780(Class94.aClass9_1888, anInt1574, 0);
	    if (class131_sub2 == null)
		return null;
	    if (aShortArray1576 != null) {
		for (int i = 0; aShortArray1576.length > i; i++) {
		    if (aByteArray1536 == null
			|| (i ^ 0xffffffff) <= (aByteArray1536.length
						^ 0xffffffff))
			class131_sub2.method1796(aShortArray1576[i],
						 aShortArray1560[i]);
		    else
			class131_sub2.method1796(aShortArray1576[i],
						 (Class9.aShortArray367
						  [aByteArray1536[i] & 0xff]));
		}
	    }
	    if (aShortArray1537 != null) {
		for (int i = 0;
		     (aShortArray1537.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    class131_sub2.method1791(aShortArray1537[i],
					     aShortArray1525[i]);
	    }
	    class131_sub6
		= class131_sub2.method1787(anInt1579 + 64, 768 + anInt1555,
					   -50, -10, -50);
	    if ((anInt1539 ^ 0xffffffff) != -129 || anInt1501 != 128
		|| (anInt1533 ^ 0xffffffff) != -129)
		class131_sub6.method1845(anInt1539, anInt1501, anInt1533);
	    class131_sub6.aBoolean3690 = true;
	    Class67_Sub24.aClass136_3234.method1926((long) anInt1534,
						    class131_sub6, (byte) -71);
	}
	if (arg0 != null)
	    class131_sub6
		= arg0.method358(arg1, arg5, class131_sub6, -20002, arg4);
	return class131_sub6;
    }
    
    public static void method1398(int arg0) {
	anInt1527++;
	if (Class67_Sub20.aBoolean3156) {
	    Class7 class7
		= Class67_Sub5_Sub14.method972(Class67_Sub5_Sub6.anInt4558,
					       18062,
					       Class67_Sub1_Sub24.anInt4200);
	    if (class7 != null && class7.anObjectArray336 != null) {
		Class67_Sub30 class67_sub30 = new Class67_Sub30();
		class67_sub30.aClass7_3352 = class7;
		class67_sub30.anObjectArray3356 = class7.anObjectArray336;
		Class81.method1429(class67_sub30, arg0 + -5074);
	    }
	    if (arg0 == 5197) {
		Class67_Sub20.aBoolean3156 = false;
		Class2.anInt109 = -1;
		Class37.method326(class7, 95);
	    }
	}
    }
    
    public static boolean method1399(Class7 arg0, int arg1) {
	anInt1550++;
	int i = 97 % ((5 - arg1) / 45);
	if ((arg0.anInt287 ^ 0xffffffff) == -206) {
	    Class55_Sub2.anInt2800 = 250;
	    return true;
	}
	return false;
    }
    
    public static int method1400(byte arg0, int arg1) {
	if (arg0 != -22)
	    method1384(93);
	anInt1508++;
	int i = 0;
	if ((arg1 ^ 0xffffffff) > -1 || arg1 >= 65536) {
	    i += 16;
	    arg1 >>>= 16;
	}
	if (arg1 >= 256) {
	    i += 8;
	    arg1 >>>= 8;
	}
	if ((arg1 ^ 0xffffffff) <= -17) {
	    i += 4;
	    arg1 >>>= 4;
	}
	if ((arg1 ^ 0xffffffff) <= -5) {
	    arg1 >>>= 2;
	    i += 2;
	}
	if ((arg1 ^ 0xffffffff) <= -2) {
	    arg1 >>>= 1;
	    i++;
	}
	return arg1 + i;
    }
    
    public RSString method1401(int arg0, RSString arg1, int arg2) {
	if (arg2 != 9094)
	    return null;
	anInt1573++;
	if (aClass92_1551 == null)
	    return arg1;
	Class67_Sub29 class67_sub29
	    = ((Class67_Sub29)
	       aClass92_1551.method1489((byte) -28, (long) arg0));
	if (class67_sub29 == null)
	    return arg1;
	return class67_sub29.musicName;
    }
    
    public Class76() {
	anInt1509 = -1;
	anInt1507 = 1;
	anInt1526 = -1;
	anInt1511 = -1;
	anInt1523 = 0;
	itemName = Class52.aRSString_1050;
	anInt1517 = 0;
	anInt1539 = 128;
	anInt1503 = -1;
	anInt1535 = -1;
	anInt1521 = -1;
	anInt1533 = 128;
	anInt1541 = 0;
	anInt1547 = 0;
	aBoolean1505 = false;
	anInt1545 = 0;
	anInt1516 = 0;
	anInt1559 = 0;
	aRSStringArray1528
	    = new RSString[] { null, null, Class55_Sub3_Sub1.aRSString_3809,
			      null, null };
	anInt1565 = 0;
	anInt1549 = -1;
	anInt1556 = -1;
	anInt1554 = -1;
	anInt1561 = 0;
	anInt1566 = -1;
	anInt1563 = 0;
	anInt1555 = 0;
	anInt1501 = 128;
	anInt1558 = -1;
	anInt1567 = -1;
	anInt1570 = -1;
	itemActions = new RSString[] { null, null, null, null,
					    Class67_Sub1_Sub37.aRSString_4397 };
	anInt1557 = 2000;
	anInt1520 = 0;
	anInt1513 = -1;
	anInt1575 = 0;
	aBoolean1568 = false;
	anInt1582 = -1;
	anInt1577 = 0;
	anInt1510 = -1;
	anInt1540 = -1;
	anInt1579 = 0;
	anInt1564 = -1;
    }
    
    static {
	aRSString_1529
	    = (Class134.method1914
	       ("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q",
		(byte) 19));
	aClass67_Sub14_1530 = new Class67_Sub14(0, -1);
	aRSString_1583 = Class134.method1914("loc", (byte) 56);
    }
}
