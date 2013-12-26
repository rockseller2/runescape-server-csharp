/* Class67_Sub1_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub20 extends Class67_Sub1
{
    public static int anInt4143;
    public static boolean aBoolean4144 = false;
    public static Class67_Sub11_Sub1 aClass67_Sub11_Sub1_4145;
    public static int anInt4146;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_4147;
    public static int anInt4148;
    public static int anInt4149;
    public static int anInt4150;
    public static int anInt4151;
    public static int anInt4152;
    public static RSString aRSString_4153
	= Class134.method1914("Fertigkeit: ", (byte) 104);
    public static int packetType = 0;
    public static int anInt4155;
    public int anInt4156 = 6;
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4150++;
	int i = arg2;
	do {
	    if (i != 0) {
		if ((i ^ 0xffffffff) != -2)
		    break;
	    } else {
		anInt4156 = arg0.readByte((byte) -123);
		break;
	    }
	    aBoolean2839 = arg0.readByte((byte) -7) == 1;
	} while (false);
	if (arg1 != true)
	    aRSString_4153 = null;
    }
    
    public static void method712(int arg0) {
	aRSString_4153 = null;
	if (arg0 > -112)
	    anInt4148 = 79;
	aClass67_Sub5_Sub19_4147 = null;
	aClass67_Sub11_Sub1_4145 = null;
    }
    
    public static void method713(int arg0, long arg1) {
	try {
	    anInt4149++;
	    if ((arg1 ^ 0xffffffffffffffffL) != -1L) {
		if (Class67_Sub5_Sub17.anInt4795 >= 100 && !Class24.aBoolean574
		    || (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff) <= -201)
		    Class87.method1465(true, Class67_Sub24.aRSString_3239,
				       Class67_Sub5_Sub5.aRSString_4523, 0);
		else {
		    RSString RSString = Class67_Sub17.method1250
					  ((byte) -72, arg1).method500(0);
		    for (int i = 0; Class67_Sub5_Sub17.anInt4795 > i; i++) {
			if ((Class66.aLongArray1330[i] ^ 0xffffffffffffffffL)
			    == (arg1 ^ 0xffffffffffffffffL)) {
			    Class87.method1465(true,
					       (Class67_Sub1_Sub27.method744
						((new RSString[]
						  { RSString,
						    Class66.aRSString_1327 }),
						 -112)),
					       Class67_Sub5_Sub5.aRSString_4523,
					       0);
			    return;
			}
		    }
		    if (arg0 > 97) {
			for (int i = 0; Class90.anInt1847 > i; i++) {
			    if (Class103.aLongArray2025[i] == arg1) {
				Class87.method1465
				    (true,
				     (Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Class67_Sub5_Sub12.aRSString_4702,
					  RSString,
					  Class67_Sub5_Sub14.aRSString_4740 }),
				       -101)),
				     Class67_Sub5_Sub5.aRSString_4523, 0);
				return;
			    }
			}
			if (RSString.method519((byte) -103,
					      (Class122
					       .aClass131_Sub7_Sub2_2309
					       .playerName)))
			    Class87.method1465(true, Class122.aRSString_2311,
					       Class67_Sub5_Sub5.aRSString_4523,
					       0);
			else {
			    Class67_Sub17.anInt3101++;
			    Class99_Sub1.aRSStringArray3384[(Class67_Sub5_Sub17
							    .anInt4795)]
				= RSString;
			    Class66.aLongArray1330[(Class67_Sub5_Sub17
						    .anInt4795)]
				= arg1;
			    Class67.anIntArray1335[(Class67_Sub5_Sub17
						    .anInt4795)]
				= 0;
			    Class67_Sub1_Sub16_Sub1.aRSStringArray5092
				[Class67_Sub5_Sub17.anInt4795]
				= Class67_Sub5_Sub5.aRSString_4523;
			    OutputStream_Sub1.anIntArray88[(Class67_Sub5_Sub17
							    .anInt4795)]
				= 0;
			    Class67_Sub5_Sub9.aBooleanArray4609
				[Class67_Sub5_Sub17.anInt4795]
				= false;
			    Class67_Sub5_Sub17.anInt4795++;
			    Class128.anInt2376 = Class11.anInt409;
			    Class70_Sub1.outStream
				.createFrame(2, 120);	//ADD_FRIEND
			    Class70_Sub1.outStream
				.writeLong(2, arg1);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("o.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class67_Sub1_Sub20() {
	super(2, false);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt4143++;
	int[][] is = aClass103_2830.method1551(arg1, 65);
    while_160_:
	do {
	    if (aClass103_2830.aBoolean2030) {
		int[][] is_0_ = this.method609(arg1, false, 0);
		int[][] is_1_ = this.method609(arg1, !arg0, 1);
		int[] is_2_ = is[1];
		int[] is_3_ = is[0];
		int[] is_4_ = is_0_[0];
		int[] is_5_ = is_0_[1];
		int[] is_6_ = is[2];
		int[] is_7_ = is_0_[2];
		int[] is_8_ = is_1_[1];
		int[] is_9_ = is_1_[0];
		int[] is_10_ = is_1_[2];
		int i = anInt4156;
	    while_159_:
		do {
		while_158_:
		    do {
		    while_157_:
			do {
			while_156_:
			    do {
			    while_155_:
				do {
				while_154_:
				    do {
				    while_153_:
					do {
					while_152_:
					    do {
					    while_151_:
						do {
						    do {
							if (i != 1) {
							    if ((i
								 ^ 0xffffffff)
								!= -3) {
								if (i != 3) {
								    if (i
									!= 4) {
									if ((i
									     ^ 0xffffffff)
									    != -6) {
									    if (i != 6) {
										if (i != 7) {
										    if (i != 8) {
											if (i != 9) {
											    if (i != 10) {
												if (i != 11) {
												    if (i != 12)
													break while_160_;
												} else
												    break while_158_;
												break while_159_;
											    }
											} else
											    break while_156_;
											break while_157_;
										    }
										} else
										    break while_154_;
										break while_155_;
									    }
									} else
									    break while_152_;
									break while_153_;
								    }
								} else
								    break;
								break while_151_;
							    }
							} else {
							    for (i = 0;
								 (i
								  < (Class67_Sub5_Sub7
								     .anInt4569));
								 i++) {
								is_3_[i]
								    = (is_9_[i]
								       + (is_4_
									  [i]));
								is_2_[i]
								    = (is_8_[i]
								       + (is_5_
									  [i]));
								is_6_[i]
								    = ((is_10_
									[i])
								       + (is_7_
									  [i]));
							    }
							    break while_160_;
							}
							for (i = 0;
							     (Class67_Sub5_Sub7
							      .anInt4569) > i;
							     i++) {
							    is_3_[i]
								= (is_4_[i]
								   - is_9_[i]);
							    is_2_[i]
								= (is_5_[i]
								   - is_8_[i]);
							    is_6_[i]
								= (-is_10_[i]
								   + is_7_[i]);
							}
							break while_160_;
						    } while (false);
						    for (i = 0;
							 (((Class67_Sub5_Sub7
							    .anInt4569)
							   ^ 0xffffffff)
							  < (i ^ 0xffffffff));
							 i++) {
							is_3_[i]
							    = ((is_9_[i]
								* is_4_[i])
							       >> 1043703308);
							is_2_[i]
							    = ((is_5_[i]
								* is_8_[i])
							       >> 1573973484);
							is_6_[i]
							    = ((is_7_[i]
								* is_10_[i])
							       >> 1824218380);
						    }
						    break while_160_;
						} while (false);
						for (i = 0;
						     i < (Class67_Sub5_Sub7
							  .anInt4569);
						     i++) {
						    int i_11_ = is_10_[i];
						    int i_12_ = is_8_[i];
						    int i_13_ = is_9_[i];
						    is_3_[i]
							= (i_13_ != 0
							   ? ((is_4_[i]
							       << -1907382612)
							      / i_13_)
							   : 4096);
						    is_2_[i]
							= ((i_12_
							    ^ 0xffffffff) != -1
							   ? ((is_5_[i]
							       << -73663636)
							      / i_12_)
							   : 4096);
						    is_6_[i]
							= ((i_11_
							    ^ 0xffffffff) != -1
							   ? ((is_7_[i]
							       << -781432916)
							      / i_11_)
							   : 4096);
						}
						break while_160_;
					    } while (false);
					    for (i = 0;
						 ((Class67_Sub5_Sub7.anInt4569
						   ^ 0xffffffff)
						  < (i ^ 0xffffffff));
						 i++) {
						is_3_[i]
						    = -(((-is_4_[i] + 4096)
							 * (4096 - is_9_[i]))
							>> -2491444) + 4096;
						is_2_[i]
						    = -(((-is_8_[i] + 4096)
							 * (4096 + -is_5_[i]))
							>> -53502548) + 4096;
						is_6_[i]
						    = -(((-is_7_[i] + 4096)
							 * (-is_10_[i] + 4096))
							>> -581257492) + 4096;
					    }
					    break while_160_;
					} while (false);
					for (i = 0;
					     i < Class67_Sub5_Sub7.anInt4569;
					     i++) {
					    int i_14_ = is_10_[i];
					    int i_15_ = is_8_[i];
					    int i_16_ = is_9_[i];
					    is_3_[i]
						= ((i_16_ ^ 0xffffffff) > -2049
						   ? (i_16_ * is_4_[i]
						      >> -68885909)
						   : 4096 - (((-i_16_ + 4096)
							      * (-is_4_[i]
								 + 4096))
							     >> -188025877));
					    is_2_[i]
						= (((i_15_ ^ 0xffffffff)
						    <= -2049)
						   ? (4096
						      - (((4096 + -is_5_[i])
							  * (4096 + -i_15_))
							 >> -1480630901))
						   : (is_5_[i] * i_15_
						      >> 252644651));
					    is_6_[i]
						= ((i_14_ ^ 0xffffffff) > -2049
						   ? (i_14_ * is_7_[i]
						      >> 57005451)
						   : -(((4096 - i_14_)
							* (4096 + -is_7_[i]))
						       >> 1556770347) + 4096);
					}
					break while_160_;
				    } while (false);
				    for (i = 0;
					 Class67_Sub5_Sub7.anInt4569 > i;
					 i++) {
					int i_17_ = is_7_[i];
					int i_18_ = is_4_[i];
					int i_19_ = is_5_[i];
					is_3_[i]
					    = ((i_18_ ^ 0xffffffff) != -4097
					       ? ((is_9_[i] << 928174060)
						  / (-i_18_ + 4096))
					       : 4096);
					is_2_[i]
					    = ((i_19_ ^ 0xffffffff) != -4097
					       ? ((is_8_[i] << 19439820)
						  / (-i_19_ + 4096))
					       : 4096);
					is_6_[i]
					    = ((i_17_ ^ 0xffffffff) == -4097
					       ? 4096
					       : ((is_10_[i] << -1804936084)
						  / (-i_17_ + 4096)));
				    }
				    break while_160_;
				} while (false);
				for (i = 0; ((Class67_Sub5_Sub7.anInt4569
					      ^ 0xffffffff)
					     < (i ^ 0xffffffff)); i++) {
				    int i_20_ = is_5_[i];
				    int i_21_ = is_4_[i];
				    int i_22_ = is_7_[i];
				    is_3_[i]
					= ((i_21_ ^ 0xffffffff) != -1
					   ? -((-is_9_[i] + 4096 << 95497228)
					       / i_21_) + 4096
					   : 0);
				    is_2_[i] = (i_20_ != 0
						? 4096 + -((-is_8_[i] + 4096
							    << 1580667596)
							   / i_20_)
						: 0);
				    is_6_[i]
					= ((i_22_ ^ 0xffffffff) != -1
					   ? 4096 - (-is_10_[i] + 4096
						     << -183794612) / i_22_
					   : 0);
				}
				break while_160_;
			    } while (false);
			    for (i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
				int i_23_ = is_9_[i];
				int i_24_ = is_4_[i];
				int i_25_ = is_8_[i];
				int i_26_ = is_5_[i];
				int i_27_ = is_7_[i];
				int i_28_ = is_10_[i];
				is_3_[i]
				    = ((i_24_ ^ 0xffffffff) <= (i_23_
								^ 0xffffffff)
				       ? i_23_ : i_24_);
				is_2_[i]
				    = ((i_26_ ^ 0xffffffff) <= (i_25_
								^ 0xffffffff)
				       ? i_25_ : i_26_);
				is_6_[i] = i_27_ < i_28_ ? i_27_ : i_28_;
			    }
			    break while_160_;
			} while (false);
			for (i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
			    int i_29_ = is_9_[i];
			    int i_30_ = is_10_[i];
			    int i_31_ = is_8_[i];
			    int i_32_ = is_4_[i];
			    int i_33_ = is_7_[i];
			    int i_34_ = is_5_[i];
			    is_3_[i] = i_32_ > i_29_ ? i_32_ : i_29_;
			    is_2_[i] = i_34_ <= i_31_ ? i_31_ : i_34_;
			    is_6_[i]
				= ((i_33_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff)
				   ? i_33_ : i_30_);
			}
			break while_160_;
		    } while (false);
		    for (i = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
			int i_35_ = is_8_[i];
			int i_36_ = is_4_[i];
			int i_37_ = is_7_[i];
			int i_38_ = is_10_[i];
			int i_39_ = is_9_[i];
			int i_40_ = is_5_[i];
			is_3_[i]
			    = ((i_39_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff)
			       ? -i_36_ + i_39_ : -i_39_ + i_36_);
			is_2_[i] = ((i_40_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff)
				    ? i_40_ + -i_35_ : i_35_ - i_40_);
			is_6_[i] = ((i_37_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff)
				    ? -i_38_ + i_37_ : i_38_ + -i_37_);
		    }
		    break while_160_;
		} while (false);
		for (i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		    int i_41_ = is_8_[i];
		    int i_42_ = is_5_[i];
		    int i_43_ = is_10_[i];
		    int i_44_ = is_9_[i];
		    int i_45_ = is_4_[i];
		    int i_46_ = is_7_[i];
		    is_3_[i] = i_45_ + (i_44_ - (i_44_ * i_45_ >> 2019497995));
		    is_2_[i]
			= -(i_41_ * i_42_ >> 1728799115) + (i_42_ - -i_41_);
		    is_6_[i]
			= -(i_46_ * i_43_ >> 1518532779) + (i_46_ + i_43_);
		}
	    }
	} while (false);
	if (arg0 != true)
	    method714(82, (short) -122);
	return is;
    }
    
    public static boolean method714(int arg0, short arg1) {
	anInt4155++;
	if (arg1 == 30 || arg1 == 18 || arg1 == 44 || arg1 == 26 || arg1 == 23
	    || (arg1 ^ 0xffffffff) == -13 || (arg1 ^ 0xffffffff) == -40
	    || arg1 == 15)
	    return true;
	if (arg0 != 29050)
	    return false;
	if ((arg1 ^ 0xffffffff) == -60 || (arg1 ^ 0xffffffff) == -23
	    || (arg1 ^ 0xffffffff) == -1006 || (arg1 ^ 0xffffffff) == -1002)
	    return true;
	if ((arg1 ^ 0xffffffff) == -43 || arg1 == 50 || arg1 == 37
	    || (arg1 ^ 0xffffffff) == -2 || (arg1 ^ 0xffffffff) == -3)
	    return true;
	if (arg1 == 46 || (arg1 ^ 0xffffffff) == -7
	    || (arg1 ^ 0xffffffff) == -4 || (arg1 ^ 0xffffffff) == -14
	    || arg1 == 10 || (arg1 ^ 0xffffffff) == -39)
	    return true;
	return false;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4151++;
	int[] is = aClass144_2836.method1961(arg0, true);
    while_170_:
	do {
	    if (aClass144_2836.aBoolean2607) {
		int[] is_47_ = this.method613(0, arg0, false);
		int[] is_48_ = this.method613(1, arg0, false);
		int i = anInt4156;
	    while_169_:
		do {
		while_168_:
		    do {
		    while_167_:
			do {
			while_166_:
			    do {
			    while_165_:
				do {
				while_164_:
				    do {
				    while_163_:
					do {
					while_162_:
					    do {
					    while_161_:
						do {
						    do {
							if (i != 1) {
							    if (i != 2) {
								if (i != 3) {
								    if (i
									!= 4) {
									if ((i
									     ^ 0xffffffff)
									    != -6) {
									    if ((i ^ 0xffffffff) != -7) {
										if ((i ^ 0xffffffff) != -8) {
										    if ((i ^ 0xffffffff) != -9) {
											if (i != 9) {
											    if ((i ^ 0xffffffff) != -11) {
												if ((i ^ 0xffffffff) != -12) {
												    if ((i ^ 0xffffffff) != -13)
													break while_170_;
												} else
												    break while_168_;
												break while_169_;
											    }
											} else
											    break while_166_;
											break while_167_;
										    }
										} else
										    break while_164_;
										break while_165_;
									    }
									} else
									    break while_162_;
									break while_163_;
								    }
								} else
								    break;
								break while_161_;
							    }
							} else {
							    for (i = 0;
								 ((i
								   ^ 0xffffffff)
								  > ((Class67_Sub5_Sub7
								      .anInt4569)
								     ^ 0xffffffff));
								 i++)
								is[i]
								    = ((is_47_
									[i])
								       - -(is_48_
									   [i]));
							    break while_170_;
							}
							for (i = 0;
							     (((Class67_Sub5_Sub7
								.anInt4569)
							       ^ 0xffffffff)
							      < (i
								 ^ 0xffffffff));
							     i++)
							    is[i] = (-is_48_[i]
								     + (is_47_
									[i]));
							break while_170_;
						    } while (false);
						    for (i = 0;
							 ((i ^ 0xffffffff)
							  > ((Class67_Sub5_Sub7
							      .anInt4569)
							     ^ 0xffffffff));
							 i++)
							is[i]
							    = ((is_47_[i]
								* is_48_[i])
							       >> -1364797300);
						    break while_170_;
						} while (false);
						for (i = 0;
						     ((i ^ 0xffffffff)
						      > ((Class67_Sub5_Sub7
							  .anInt4569)
							 ^ 0xffffffff));
						     i++) {
						    int i_49_ = is_48_[i];
						    is[i] = (i_49_ == 0 ? 4096
							     : ((is_47_[i]
								 << 1718636716)
								/ i_49_));
						}
						break while_170_;
					    } while (false);
					    for (i = 0;
						 ((Class67_Sub5_Sub7.anInt4569
						   ^ 0xffffffff)
						  < (i ^ 0xffffffff));
						 i++)
						is[i]
						    = 4096 - (((-is_48_[i]
								+ 4096)
							       * (4096
								  - is_47_[i]))
							      >> -993530932);
					    break while_170_;
					} while (false);
					for (i = 0;
					     ((i ^ 0xffffffff)
					      > (Class67_Sub5_Sub7.anInt4569
						 ^ 0xffffffff));
					     i++) {
					    int i_50_ = is_48_[i];
					    is[i]
						= ((i_50_ ^ 0xffffffff) > -2049
						   ? (is_47_[i] * i_50_
						      >> -1462289237)
						   : 4096 - (((-i_50_ + 4096)
							      * (-is_47_[i]
								 + 4096))
							     >> -1888992757));
					}
					break while_170_;
				    } while (false);
				    for (i = 0;
					 Class67_Sub5_Sub7.anInt4569 > i;
					 i++) {
					int i_51_ = is_47_[i];
					is[i] = (i_51_ != 4096
						 ? ((is_48_[i] << 731949516)
						    / (-i_51_ + 4096))
						 : 4096);
				    }
				    break while_170_;
				} while (false);
				for (i = 0; Class67_Sub5_Sub7.anInt4569 > i;
				     i++) {
				    int i_52_ = is_47_[i];
				    is[i]
					= ((i_52_ ^ 0xffffffff) != -1
					   ? -((4096 - is_48_[i] << -403326868)
					       / i_52_) + 4096
					   : 0);
				}
				break while_170_;
			    } while (false);
			    for (i = 0; ((i ^ 0xffffffff)
					 > (Class67_Sub5_Sub7.anInt4569
					    ^ 0xffffffff)); i++) {
				int i_53_ = is_47_[i];
				int i_54_ = is_48_[i];
				is[i] = i_54_ > i_53_ ? i_53_ : i_54_;
			    }
			    break while_170_;
			} while (false);
			for (i = 0;
			     ((i ^ 0xffffffff)
			      > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff));
			     i++) {
			    int i_55_ = is_47_[i];
			    int i_56_ = is_48_[i];
			    is[i]
				= ((i_55_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff)
				   ? i_55_ : i_56_);
			}
			break while_170_;
		    } while (false);
		    for (i = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
			int i_57_ = is_47_[i];
			int i_58_ = is_48_[i];
			is[i] = i_58_ < i_57_ ? i_57_ - i_58_ : i_58_ - i_57_;
		    }
		    break while_170_;
		} while (false);
		for (i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
		    int i_59_ = is_47_[i];
		    int i_60_ = is_48_[i];
		    is[i] = -(i_60_ * i_59_ >> 990794731) + i_59_ + i_60_;
		}
	    }
	} while (false);
	if (arg1 != 55)
	    method611(51, (byte) 61);
	return is;
    }
    
    public static void method715(int arg0, int arg1, int arg2, byte arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	anInt4152++;
	if (arg5 >= 1 && (arg7 ^ 0xffffffff) <= -2 && arg5 <= 102
	    && arg7 <= 102) {
	    if (!Class32.method288(true)
		&& ((0x2 & Class120.aByteArrayArrayArray2284[0][arg5][arg7])
		    == 0)) {
		int i = arg1;
		if ((0x8 & Class120.aByteArrayArrayArray2284[arg1][arg5][arg7])
		    != 0)
		    i = 0;
		if ((Class116.anInt2197 ^ 0xffffffff) != (i ^ 0xffffffff))
		    return;
	    }
	    int i = arg1;
	    if (i < 3
		&& (0x2 & Class120.aByteArrayArrayArray2284[1][arg5][arg7]
		    ^ 0xffffffff) == -3)
		i++;
	    Class67_Sub5_Sub1.method827(Class53.aClass73Array1059[arg1], arg5,
					(byte) 36, i, arg1, arg7, arg4);
	    if ((arg2 ^ 0xffffffff) <= -1) {
		boolean bool = InputStream_Sub1.aBoolean77;
		InputStream_Sub1.aBoolean77 = true;
		Class92.method1484(false, arg1, arg2, i, arg6, arg0, arg5,
				   arg7, false,
				   Class53.aClass73Array1059[arg1], 2);
		InputStream_Sub1.aBoolean77 = bool;
	    }
	}
	if (arg3 > -21)
	    method714(26, (short) -41);
    }
}
