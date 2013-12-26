/* Class67_Sub1_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub16 extends Class67_Sub1
{
    public int anInt4065;
    public static int anInt4066;
    public static int anInt4067;
    public static int anInt4068;
    public static int anInt4069;
    public static RSString aRSString_4070
	= Class134.method1914("vert:", (byte) 81);
    public static int anInt4071;
    public static RSString aRSString_4072;
    public static int anInt4073;
    public static RSString aRSString_4074;
    public int anInt4075 = -1;
    public static short[] aShortArray4076 = new short[256];
    public static int anInt4077;
    public static int anInt4078;
    public static RSString aRSString_4079;
    public static int anInt4080;
    public static int anInt4081;
    public static RSString aRSString_4082;
    public static int anInt4083;
    public static int anInt4084;
    public static RSString aRSString_4085;
    public static int[] anIntArray4086;
    public static int anInt4087;
    public int anInt4088;
    public int[] anIntArray4089;
    public static int[] anIntArray4090;
    
    public static Class94 method684(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	return class67_sub24.aClass94_3224;
    }
    
    public static void method685(int arg0) {
	Class67_Sub10.aClass136_3015.method1921((byte) 43);
	anInt4069++;
	if (arg0 != -4802)
	    method689(100, 47);
    }
    
    public static void method686(int arg0, int arg1) {
	anInt4071++;
	Class67_Sub5_Sub16.anInt4776 = arg1;
	Class33.anInt732 = -1;
	Class67_Sub3.anInt2853 = arg0;
	Class67_Sub26.method1295(98);
    }
    
    public boolean method687(int arg0) {
	if (arg0 != -21347)
	    anInt4075 = -49;
	anInt4077++;
	if (anIntArray4089 != null)
	    return true;
	if ((anInt4075 ^ 0xffffffff) <= -1) {
	    Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
		= ((Class55.anInt1084 ^ 0xffffffff) <= -1
		   ? Class44.method387(-121, Class67.aClass9_1348,
				       Class55.anInt1084, anInt4075)
		   : Class61.method554(arg0 + 21293, anInt4075,
				       Class67.aClass9_1348));
	    class67_sub5_sub19_sub1.method1013();
	    anInt4065 = class67_sub5_sub19_sub1.anInt4812;
	    anInt4088 = class67_sub5_sub19_sub1.anInt4813;
	    anIntArray4089 = class67_sub5_sub19_sub1.anIntArray5149;
	    return true;
	}
	return false;
    }
    
    public static void method688(int arg0) {
	aRSString_4079 = null;
	aRSString_4082 = null;
	aRSString_4074 = null;
	aRSString_4085 = null;
	aShortArray4076 = null;
	anIntArray4090 = null;
	anIntArray4086 = null;
	aRSString_4070 = null;
	if (arg0 != 8)
	    aRSString_4070 = null;
	aRSString_4072 = null;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg2 == 0)
	    anInt4075 = arg0.readUShort(-2386);
	anInt4067++;
	if (arg1 != true)
	    method686(-118, -55);
    }
    
    public int method615(byte arg0) {
	int i = 53 / ((arg0 - -11) / 59);
	anInt4080++;
	return anInt4075;
    }
    
    public Class67_Sub1_Sub16() {
	super(0, false);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    return null;
	int[][] is = aClass103_2830.method1551(arg1, 54);
	if (aClass103_2830.aBoolean2030 && method687(-21347)) {
	    int[] is_0_ = is[0];
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[2];
	    int i = (anInt4088
		     * (anInt4065 == RuntimeException_Sub1.anInt2618 ? arg1
			: arg1 * anInt4065 / RuntimeException_Sub1.anInt2618));
	    if ((anInt4088 ^ 0xffffffff)
		!= (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)) {
		for (int i_3_ = 0; Class67_Sub5_Sub7.anInt4569 > i_3_;
		     i_3_++) {
		    int i_4_ = i_3_ * anInt4088 / Class67_Sub5_Sub7.anInt4569;
		    int i_5_ = anIntArray4089[i_4_ + i];
		    is_2_[i_3_] = Class75.method1379(i_5_ << -762300924, 4080);
		    is_1_[i_3_] = Class75.method1379(i_5_ >> 701163780, 4080);
		    is_0_[i_3_]
			= Class75.method1379(16711680, i_5_) >> 1821607660;
		}
	    } else {
		for (int i_6_ = 0; Class67_Sub5_Sub7.anInt4569 > i_6_;
		     i_6_++) {
		    int i_7_ = anIntArray4089[i++];
		    is_2_[i_6_] = Class75.method1379(255, i_7_) << 721946468;
		    is_1_[i_6_] = Class75.method1379(i_7_, 65280) >> 202113380;
		    is_0_[i_6_]
			= Class75.method1379(i_7_ >> -1311195284, 4080);
		}
	    }
	}
	anInt4084++;
	return is;
    }
    
    public static Class67_Sub1 method689(int arg0, int arg1) {
	if (arg0 >= -111)
	    return null;
	anInt4066++;
	int i = arg1;
    while_94_:
	do {
	while_93_:
	    do {
	    while_92_:
		do {
		while_91_:
		    do {
		    while_90_:
			do {
			while_89_:
			    do {
			    while_88_:
				do {
				while_87_:
				    do {
				    while_86_:
					do {
					while_85_:
					    do {
					    while_84_:
						do {
						while_83_:
						    do {
						    while_82_:
							do {
							while_81_:
							    do {
							    while_80_:
								do {
								while_79_:
								    do {
								    while_78_:
									do {
									while_77_:
									    do {
									    while_76_:
										do {
										while_75_:
										    do {
										    while_74_:
											do {
											while_73_:
											    do {
											    while_72_:
												do {
												while_71_:
												    do {
												    while_70_:
													do {
													while_69_:
													    do {
													    while_68_:
														do {
														while_67_:
														    do {
														    while_66_:
															do {
															while_65_:
															    do {
															    while_64_:
																do {
																while_63_:
																    do {
																    while_62_:
																	do {
																	while_61_:
																	    do {
																	    while_60_:
																		do {
																		while_59_:
																		    do {
																		    while_58_:
																			do {
																			while_57_:
																			    do {
																				do {
																				    if (i != 0) {
																					if (i != 1) {
																					    if ((i ^ 0xffffffff) != -3) {
																						if (i != 3) {
																						    if ((i ^ 0xffffffff) != -5) {
																							if (i != 5) {
																							    if (i != 6) {
																								if ((i ^ 0xffffffff) != -8) {
																								    if (i != 8) {
																									if (i != 9) {
																									    if (i != 10) {
																										if (i != 11) {
																										    if ((i ^ 0xffffffff) != -13) {
																											if (i != 13) {
																											    if ((i ^ 0xffffffff) != -15) {
																												if ((i ^ 0xffffffff) != -16) {
																												    if (i != 16) {
																													if ((i ^ 0xffffffff) != -18) {
																													    if ((i ^ 0xffffffff) != -19) {
																														if (i != 19) {
																														    if (i != 20) {
																															if ((i ^ 0xffffffff) != -22) {
																															    if ((i ^ 0xffffffff) != -23) {
																																if ((i ^ 0xffffffff) != -24) {
																																    if (i != 24) {
																																	if (i != 25) {
																																	    if (i != 26) {
																																		if ((i ^ 0xffffffff) != -28) {
																																		    if ((i ^ 0xffffffff) != -29) {
																																			if (i != 29) {
																																			    if (i != 30) {
																																				if ((i ^ 0xffffffff) != -32) {
																																				    if (i != 32) {
																																					if ((i ^ 0xffffffff) != -34) {
																																					    if (i != 34) {
																																						if ((i ^ 0xffffffff) != -36) {
																																						    if (i != 36) {
																																							if ((i ^ 0xffffffff) != -38) {
																																							    if (i != 38) {
																																								if (i != 39)
																																								    break while_94_;
																																							    } else
																																								break while_92_;
																																							    break while_93_;
																																							}
																																						    } else
																																							break while_90_;
																																						    break while_91_;
																																						}
																																					    } else
																																						break while_88_;
																																					    break while_89_;
																																					}
																																				    } else
																																					break while_86_;
																																				    break while_87_;
																																				}
																																			    } else
																																				break while_84_;
																																			    break while_85_;
																																			}
																																		    } else
																																			break while_82_;
																																		    break while_83_;
																																		}
																																	    } else
																																		break while_80_;
																																	    break while_81_;
																																	}
																																    } else
																																	break while_78_;
																																    break while_79_;
																																}
																															    } else
																																break while_76_;
																															    break while_77_;
																															}
																														    } else
																															break while_74_;
																														    break while_75_;
																														}
																													    } else
																														break while_72_;
																													    break while_73_;
																													}
																												    } else
																													break while_70_;
																												    break while_71_;
																												}
																											    } else
																												break while_68_;
																											    break while_69_;
																											}
																										    } else
																											break while_66_;
																										    break while_67_;
																										}
																									    } else
																										break while_64_;
																									    break while_65_;
																									}
																								    } else
																									break while_62_;
																								    break while_63_;
																								}
																							    } else
																								break while_60_;
																							    break while_61_;
																							}
																						    } else
																							break while_58_;
																						    break while_59_;
																						}
																					    } else
																						break;
																					    break while_57_;
																					}
																				    } else
																					return new Class67_Sub1_Sub26();
																				    return new Class67_Sub1_Sub7();
																				} while (false);
																				return new Class67_Sub1_Sub28();
																			    } while (false);
																			    return new Class67_Sub1_Sub3();
																			} while (false);
																			return new Class67_Sub1_Sub9();
																		    } while (false);
																		    return new Class67_Sub1_Sub39();
																		} while (false);
																		return new Class67_Sub1_Sub19();
																	    } while (false);
																	    return new Class67_Sub1_Sub20();
																	} while (false);
																	return new Class67_Sub1_Sub14();
																    } while (false);
																    return new Class67_Sub1_Sub2();
																} while (false);
																return new Class67_Sub1_Sub18();
															    } while (false);
															    return new Class67_Sub1_Sub27();
															} while (false);
															return new Class67_Sub1_Sub17();
														    } while (false);
														    return new Class67_Sub1_Sub30();
														} while (false);
														return new Class67_Sub1_Sub21();
													    } while (false);
													    return new Class67_Sub1_Sub12();
													} while (false);
													return new Class67_Sub1_Sub36();
												    } while (false);
												    return new Class67_Sub1_Sub24();
												} while (false);
												return new Class67_Sub1_Sub16_Sub1();
											    } while (false);
											    return new Class67_Sub1_Sub29();
											} while (false);
											return new Class67_Sub1_Sub13();
										    } while (false);
										    return new Class67_Sub1_Sub23();
										} while (false);
										return new Class67_Sub1_Sub22();
									    } while (false);
									    return new Class67_Sub1_Sub31();
									} while (false);
									return new Class67_Sub1_Sub11();
								    } while (false);
								    return (new Class67_Sub1_Sub33
									    ());
								} while (false);
								return (new Class67_Sub1_Sub32
									());
							    } while (false);
							    return (new Class67_Sub1_Sub35
								    ());
							} while (false);
							return (new Class67_Sub1_Sub38
								());
						    } while (false);
						    return (new Class67_Sub1_Sub8
							    ());
						} while (false);
						return new Class67_Sub1_Sub6();
					    } while (false);
					    return new Class67_Sub1_Sub4();
					} while (false);
					return new Class67_Sub1_Sub1();
				    } while (false);
				    return new Class67_Sub1_Sub34();
				} while (false);
				return new Class67_Sub1_Sub37();
			    } while (false);
			    return new Class67_Sub1_Sub25();
			} while (false);
			return new Class67_Sub1_Sub5();
		    } while (false);
		    return new Class67_Sub1_Sub10();
		} while (false);
		return new Class67_Sub1_Sub15();
	    } while (false);
	    return new Class67_Sub1_Sub16();
	} while (false);
	return null;
    }
    
    public static void method690(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	Class67_Sub1_Sub11.method665(2, -arg2 + arg1,
				     Class67_Sub29.anIntArrayArray3338[arg4],
				     arg1 - -arg2, arg0);
	anInt4083++;
	int i = 0;
	if (arg5 < 88)
	    method684(67, 105, -115);
	int i_8_ = arg3;
	int i_9_ = arg2 * arg2;
	int i_10_ = arg3 * arg3;
	int i_11_ = i_10_ << 587772897;
	int i_12_ = arg3 << -432127007;
	int i_13_ = i_9_ << 1688082689;
	int i_14_ = i_10_ + -(i_13_ * (-1 + i_12_));
	int i_15_ = (1 - i_12_) * i_9_ + i_11_;
	int i_16_ = i_9_ << 1328340162;
	int i_17_ = i_10_ << 1360718146;
	int i_18_ = i_11_ * (3 + (i << 417131393));
	int i_19_ = i_13_ * ((i_8_ << -143414207) + -3);
	int i_20_ = i_17_ * (i - -1);
	int i_21_ = i_16_ * (i_8_ + -1);
	while ((i_8_ ^ 0xffffffff) < -1) {
	    if ((i_15_ ^ 0xffffffff) > -1) {
		while (i_15_ < 0) {
		    i_15_ += i_18_;
		    i++;
		    i_18_ += i_17_;
		    i_14_ += i_20_;
		    i_20_ += i_17_;
		}
	    }
	    int i_22_ = --i_8_ + arg4;
	    int i_23_ = i_8_ + arg4;
	    if ((i_14_ ^ 0xffffffff) > -1) {
		i++;
		i_14_ += i_20_;
		i_15_ += i_18_;
		i_18_ += i_17_;
		i_20_ += i_17_;
	    }
	    i_14_ += -i_19_;
	    i_15_ += -i_21_;
	    i_19_ -= i_16_;
	    int i_24_ = arg1 - -i;
	    int i_25_ = arg1 + -i;
	    i_21_ -= i_16_;
	    Class67_Sub1_Sub11.method665(2, i_25_,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_22_]),
					 i_24_, arg0);
	    Class67_Sub1_Sub11.method665(2, i_25_,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_23_]),
					 i_24_, arg0);
	}
    }
    
    public void method617(byte arg0) {
	anInt4081++;
	int i = 50 / ((arg0 - -21) / 49);
	super.method617((byte) 106);
	anIntArray4089 = null;
    }
    
    public static void method691(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4, boolean arg5, boolean arg6) {
	if (arg5 != false)
	    aRSString_4072 = null;
	if (arg2 > arg0) {
	    int i = (arg2 + arg0) / 2;
	    int i_26_ = arg0;
	    Class70_Sub1 class70_sub1 = Class73.aClass70_Sub1Array1474[i];
	    Class73.aClass70_Sub1Array1474[i]
		= Class73.aClass70_Sub1Array1474[arg2];
	    Class73.aClass70_Sub1Array1474[arg2] = class70_sub1;
	    for (int i_27_ = arg0; arg2 > i_27_; i_27_++) {
		if (Class70.method1333(arg4, class70_sub1, arg1, arg6, arg3,
				       Class73.aClass70_Sub1Array1474[i_27_],
				       (byte) -64)
		    <= 0) {
		    Class70_Sub1 class70_sub1_28_
			= Class73.aClass70_Sub1Array1474[i_27_];
		    Class73.aClass70_Sub1Array1474[i_27_]
			= Class73.aClass70_Sub1Array1474[i_26_];
		    Class73.aClass70_Sub1Array1474[i_26_++] = class70_sub1_28_;
		}
	    }
	    Class73.aClass70_Sub1Array1474[arg2]
		= Class73.aClass70_Sub1Array1474[i_26_];
	    Class73.aClass70_Sub1Array1474[i_26_] = class70_sub1;
	    method691(arg0, arg1, i_26_ - 1, arg3, arg4, arg5, arg6);
	    method691(1 + i_26_, arg1, arg2, arg3, arg4, arg5, arg6);
	}
	anInt4068++;
    }
    
    static {
	anInt4073 = 0;
	aRSString_4072 = Class134.method1914("cyan:", (byte) 2);
	aRSString_4079 = Class134.method1914(")2", (byte) 85);
	anIntArray4086 = new int[8];
	aRSString_4082 = aRSString_4072;
	aRSString_4085 = Class134.method1914(" <col=ffffff>", (byte) 47);
	aRSString_4074 = aRSString_4072;
	anIntArray4090 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    }
}
