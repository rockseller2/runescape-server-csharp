/* Class67_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub2 extends Class67_Sub1
{
    public static int anInt3829;
    public static int[] anIntArray3830 = new int[1000];
    public static int anInt3831;
    public boolean aBoolean3832 = true;
    public boolean aBoolean3833 = true;
    public static int anInt3834 = 0;
    public static int anInt3835;
    public static int anInt3836;
    public static int anInt3837;
    public static int anInt3838;
    public static int anInt3839;
    public static int anInt3840;
    public static int anInt3841;
    
    public static void method629(int arg0) {
	anIntArray3830 = null;
	if (arg0 != 0)
	    method629(86);
    }
    
    public static void method630(int arg0, int arg1) {
	anInt3840++;
	if ((arg1 ^ 0xffffffff) <= -1) {
	    int i = Class88.anIntArray1822[arg1];
	    int i_0_ = Class131_Sub5.anIntArray3667[arg1];
	    long l = Class115.aLongArray2188[arg1];
	    int i_1_ = (int) Class115.aLongArray2188[arg1];
	    int i_2_ = Applet_Sub1.aShortArray21[arg1];
	    if (i_2_ >= 2000)
		i_2_ -= 2000;
	    if ((i_2_ ^ 0xffffffff) == -51) {
		Class67_Sub8.anInt2963++;
		Class70_Sub1.outStream.createFrame(arg0, 206);	//OPERATE
		Class70_Sub1.outStream.addShortA(i_1_, arg0 + -12198);
		Class70_Sub1.outStream.addLEShort(i, 1608904784);
		Class70_Sub1.outStream.addLEInt((byte) -94, i_0_);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604
		    = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if (i_2_ == 16) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_1_];
		if (class131_sub7_sub2 != null) {
		    Class67_Sub1_Sub35.anInt4355++;
		    Class57.method490(1, class131_sub7_sub2.smallY[0],
				      class131_sub7_sub2.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class116.anInt2190 = Class115.anInt2186;
		    Class55_Sub3.anInt2816 = 0;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class70_Sub1.outStream.createFrame(2, 195);	//MAGIC_ON_PLAYER
		    Class70_Sub1.outStream
			.addShortA(Class67_Sub5_Sub6.anInt4558, -12196);
		    Class70_Sub1.outStream
			.addLEInt((byte) 85, Class67_Sub1_Sub24.anInt4200);
		    Class70_Sub1.outStream
			.addLEShortA((byte) -117, i_1_);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -46) {
		Login.anInt1614++;
		Canvas_Sub1.method46((byte) 119, l, i, i_0_);
		Class70_Sub1.outStream.createFrame(2, 247);	//OBJECT_FOURTH_CLICK
		Class70_Sub1.outStream.addLEShort(i_0_ + Class137.baseY, 1608904784);
		Class70_Sub1.outStream.addLEShortA((byte) 68, Class58.baseX + i);
		Class70_Sub1.outStream.addUShort(arg0 ^ 0xff0002, (int) (l >>> -1968504608) & 0x7fffffff);
	    }
	    if ((i_2_ ^ 0xffffffff) == -36) {
		Class68.anInt1373++;
		if (Class69.anInt1381 == 1)
		    Class57.method490(1, i_0_, i, 1, (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		else {
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		}
		Class75.anInt2726 = Class101.anInt1985;
		Class55_Sub3.anInt2816 = 0;
		Class67_Sub5_Sub4.anInt4512 = 2;
		Class116.anInt2190 = Class115.anInt2186;
		Class70_Sub1.outStream.createFrame(arg0, 33);
		Class70_Sub1.outStream.addUShort(16711680,
								i_1_);
		Class70_Sub1.outStream
		    .addUShort(arg0 + 16711678, Class58.baseX + i);
		Class70_Sub1.outStream
		    .addLEShort(Class137.baseY + i_0_, arg0 ^ 0x5fe5f052);
	    }
	    if ((i_2_ ^ 0xffffffff) == -15) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		if (class131_sub7_sub1 != null) {
		    Class12.anInt423++;
		    Class57.method490(1, class131_sub7_sub1.smallY[0],
				      class131_sub7_sub1.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class55_Sub3.anInt2816 = 0;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class70_Sub1.outStream.createFrame(2, 148);	//NPC_THIRD_CLICK
		    Class70_Sub1.outStream.addShortA(i_1_,
								    -12196);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -12) {
		Class67_Sub5_Sub17.anInt4791++;
		Canvas_Sub1.method46((byte) 116, l, i, i_0_);
		Class70_Sub1.outStream.createFrame(2, 194);	//OBJECT_SECOND_CLICK
		Class70_Sub1.outStream.addLEShortA((byte) 47, i_0_ + Class137.baseY);
		Class70_Sub1.outStream.addLEShort(Class58.baseX + i, 1608904784);
		Class70_Sub1.outStream.addUShort(16711680, 0x7fffffff & (int) (l >>> 1088363936));
	    }
	    if (i_2_ == 30) {
		Class98.anInt1948++;
		Class70_Sub1.outStream.createFrame(2, 156);	//INV_CLICK (food etc)
		Class70_Sub1.outStream.addLEShortA((byte) -99, i);
		Class70_Sub1.outStream.addShortA(i_1_, arg0 ^ ~0x2fa1);
		Class70_Sub1.outStream.addLEInt((byte) -126, i_0_);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
		System.out.println("INV_CLICK (food etc?) addLEShortA = "+i);
		System.out.println("INV_CLICK (food etc?) addShortA = "+i_1_);
		System.out.println("INV_CLICK (food etc?) addLEInt = "+i_0_);
	    }
	    if (i_2_ == 1) {
		Class70_Sub1.outStream.createFrame(2, 85);
		Class21.anInt513++;
		Class70_Sub1.outStream.addInt1(i_0_, 23);
		Class70_Sub1.outStream.addUShort(16711680, i);
		Class70_Sub1.outStream.addShortA(i_1_, -12196);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604
		    = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if ((i_2_ ^ 0xffffffff) == -29
		&& Canvas_Sub1.method46((byte) 119, l, i, i_0_)) {
		Class70_Sub1.outStream.createFrame(arg0, 233);
		Class70_Sub1.outStream.addLEShortA((byte) 117, i_0_ + Class137.baseY);
		Class126_Sub4.anInt3460++;
		Class70_Sub1.outStream.addShortA(i + Class58.baseX, -12196);
		Class70_Sub1.outStream.addLEShortA((byte) 122, Class67_Sub5_Sub6.anInt4558);
		Class70_Sub1.outStream.addInt1(Class67_Sub1_Sub24.anInt4200, 44);
		Class70_Sub1.outStream.addShortA(0x7fffffff & (int) (l >>> -2084442720), -12196);
	    }
	    if ((i_2_ ^ 0xffffffff) == -44) {
		if ((Class69.anInt1381 ^ 0xffffffff) == -2)
		    Class57.method490(1, i_0_, i, 1, (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		else {
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		}
		Class75.anInt2726 = Class101.anInt1985;
		Class116.anInt2190 = Class115.anInt2186;
		Class55_Sub2_Sub1.anInt3796++;
		Class67_Sub5_Sub4.anInt4512 = 2;
		Class55_Sub3.anInt2816 = 0;
		Class70_Sub1.outStream.createFrame(2, 48);
		Class70_Sub1.outStream.addShortA(i + Class58.baseX, arg0 ^ ~0x2fa1);
		Class70_Sub1.outStream.addLEShortA((byte) 93, i_1_);
		Class70_Sub1.outStream.addLEShort(i_0_ + Class137.baseY, 1608904784);
	    }
	    if (i_2_ == 2) {
		Class70_Sub1.outStream.createFrame(2, 6);
		Class67_Sub5_Sub11_Sub2.anInt5141++;
		Class70_Sub1.outStream.addInt(i_0_, 126);
		Class70_Sub1.outStream.addShortA(i, -12196);
		Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if (i_2_ == 10) {
		PacketParser.anInt2121++;
		Class70_Sub1.outStream.createFrame(arg0, 10);	//ACTIONBUTTON2
		Class70_Sub1.outStream.addInt(i_0_, 126);
		Class7 class7 = Class3.method69((byte) 110, i_0_);
		if (class7.anIntArrayArray260 != null
		    && class7.anIntArrayArray260[0][0] == 5) {
		    int i_3_ = class7.anIntArrayArray260[0][1];
		    if ((class7.anIntArray217[0] ^ 0xffffffff)
			!= (Class137.anIntArray2504[i_3_] ^ 0xffffffff)) {
			Class137.anIntArray2504[i_3_]
			    = class7.anIntArray217[0];
			Class142.method1952(i_3_, -39);
		    }
		}
	    }
	    if (i_2_ == 44) {
		Class70_Sub1.outStream.createFrame(2, 153);	//INV_RIGHT_CLICK_OPTION2
		Class67_Sub26.anInt3262++;
		Class70_Sub1.outStream.addLEInt((byte) -104, i_0_);
		Class70_Sub1.outStream.addLEShort(i, 1608904784);
		Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604
		    = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if ((i_2_ ^ 0xffffffff) == -27) {
		Class70.anInt1399++;
		Class70_Sub1.outStream.createFrame(2, 161);	//INV_RIGHT_CLICK_OPTION1
		Class70_Sub1.outStream.addLEInt((byte) 116,
								i_0_);
		Class70_Sub1.outStream.addLEShortA((byte) -126,
								i_1_);
		Class70_Sub1.outStream.addLEShortA((byte) -128,
								i);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604
		    = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if (i_2_ == 20) {
		Class126_Sub4.anInt3459++;
		Canvas_Sub1.method46((byte) 120, l, i, i_0_);
		Class70_Sub1.outStream.createFrame(2, 254);	//OBJECT_FIRST_CLICK
		Class70_Sub1.outStream
		    .addLEShort(Class58.baseX + i, 1608904784);
		Class70_Sub1.outStream
		    .addShortA(0x7fffffff & (int) (l >>> 1522210656), -12196);
		Class70_Sub1.outStream
		    .addUShort(16711680, Class137.baseY + i_0_);
	    }
	    if ((i_2_ ^ 0xffffffff) == -59) {
		Canvas_Sub1.method46((byte) 111, l, i, i_0_);
		Class70_Sub1.outStream.createFrame(arg0, 84);	//OBJECT_THIRD_CLICK
		Class70_Sub1.outStream.addLEShortA((byte) 71, 0x7fffffff & (int) (l >>> -1991061920));	
		Class70_Sub1.outStream.addLEShortA((byte) -89, i_0_ - -Class137.baseY);
		Class114.anInt2149++;
		Class70_Sub1.outStream.addLEShort(i + Class58.baseX, 1608904784);
	    }
	    if ((i_2_ ^ 0xffffffff) == -35) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_1_];
		if (class131_sub7_sub2 != null) {
		    Class131_Sub7_Sub1.anInt5051++;
		    Class57.method490(1, class131_sub7_sub2.smallY[0],
				      class131_sub7_sub2.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class116.anInt2190 = Class115.anInt2186;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class55_Sub3.anInt2816 = 0;
		    Class70_Sub1.outStream.createFrame(2, 114);
		    Class70_Sub1.outStream
			.addLEShortA((byte) -110, i_1_);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -23) {
		Class67_Sub1_Sub11.anInt3991++;
		Class70_Sub1.outStream.createFrame(arg0, 82);
		Class70_Sub1.outStream.addUShort(16711680, Class67_Sub5_Sub6.anInt4558);
		Class70_Sub1.outStream.addInt1(i_0_, 127);
		Class70_Sub1.outStream.addInt(Class67_Sub1_Sub24.anInt4200, 119);
		Class70_Sub1.outStream.addLEShortA((byte) 119, i);
	    }
	    if (i_2_ == 5) {
		if ((i_1_ ^ 0xffffffff) != -1) {
		    if ((Class67_Sub17.anInt3107 ^ 0xffffffff) < -1
			&& Class131_Sub7.aBooleanArray3698[82]
			&& Class131_Sub7.aBooleanArray3698[81])
			Class67_Sub1_Sub32.method769(Class58.baseX + i,
						     i_0_ + Class137.baseY,
						     Canvas_Sub1.anInt59,
						     2074796454);
		    else {
			anInt3831++;
			Class70_Sub1.outStream.createFrame(2,
									179);
			Class70_Sub1.outStream
			    .addUShort(16711680, Class137.baseY + i_0_);
			Class70_Sub1.outStream
			    .addUShort(16711680, i + Class58.baseX);
		    }
		} else {
		    Class80.anInt1622 = 1;
		    Class67_Sub1_Sub28.method750(Canvas_Sub1.anInt59, i, i_0_);
		}
	    }
	    if (i_2_ == 38 && Class16.aClass7_470 == null) {
		Class67_Sub5_Sub1.method828((byte) 92, i, i_0_);
		Class16.aClass7_470
		    = Class67_Sub5_Sub14.method972(i, arg0 + 18060, i_0_);
		Class37.method326(Class16.aClass7_470, 109);
	    }
	    if (arg0 != 2)
		method630(-106, -103);
	    if (i_2_ == 3)
		Class1.method62((byte) 10);
	    if ((i_2_ ^ 0xffffffff) == -58) {
		if ((i_1_ ^ 0xffffffff) == -1)
		    Class67_Sub1_Sub28.method750(Canvas_Sub1.anInt59, i, i_0_);
		else if (i_1_ == 1) {
		    if ((Class67_Sub17.anInt3107 ^ 0xffffffff) >= -1
			|| !Class131_Sub7.aBooleanArray3698[82]
			|| !Class131_Sub7.aBooleanArray3698[81]) {
			if (Class57.method490(0, i_0_, i, 0, (byte) -6, true,
					      0, 0,
					      (Class122
					       .aClass131_Sub7_Sub2_2309
					       .smallY[0]),
					      0, 1,
					      (Class122
					       .aClass131_Sub7_Sub2_2309
					       .smallX[0]))) {
			    Class70_Sub1.outStream.addByte((byte) 4, Class1.anInt101);
			    Class70_Sub1.outStream.addByte((byte) 4, Class16.anInt477);
			    Class70_Sub1.outStream.addUShort(arg0 + 16711678, Class67_Sub5_Sub4.anInt4504);
			    Class70_Sub1.outStream.addByte((byte) 4, 57);
			    Class70_Sub1.outStream.addByte((byte) 4, Class5.anInt137);
			    Class70_Sub1.outStream.addByte((byte) 4, Class67_Sub1_Sub15.anInt4063);
			    Class70_Sub1.outStream.addByte((byte) 4, 89);
			    Class70_Sub1.outStream.addUShort(16711680, Class122.aClass131_Sub7_Sub2_2309.anInt3733);
			    Class70_Sub1.outStream.addUShort(16711680, Class122.aClass131_Sub7_Sub2_2309.anInt3726);
			    Class70_Sub1.outStream.addByte((byte) 4, Class10.anInt396);
			    Class70_Sub1.outStream.addByte((byte) 4, 63);
			}
		    } else
			Class67_Sub1_Sub32.method769(Class58.baseX - -i,
						     i_0_ + Class137.baseY,
						     Canvas_Sub1.anInt59,
						     2074796454);
		}
	    }
	    if (i_2_ == 9) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_1_];
		if (class131_sub7_sub2 != null) {
		    Class57.method490(1, class131_sub7_sub2.smallY[0],
				      class131_sub7_sub2.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class75.anInt2726 = Class101.anInt1985;
		    Class67_Sub30.anInt3359++;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class55_Sub3.anInt2816 = 0;
		    Class70_Sub1.outStream.createFrame(2, 180);	//TRADE
		    Class70_Sub1.outStream
			.addLEShortA((byte) -128, i_1_);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -1007) {
		Class75.anInt2726 = Class101.anInt1985;
		Class55_Sub3.anInt2816 = 0;
		Class67_Sub5_Sub4.anInt4512 = 2;
		Class4.anInt125++;
		Class116.anInt2190 = Class115.anInt2186;
		Class70_Sub1.outStream.createFrame(2, 92);	//INV_EXAMINE_ITEM
		Class70_Sub1.outStream.addLEShortA((byte) -85,
								i_1_);
	    }
	    if ((i_2_ ^ 0xffffffff) == -32) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_1_];
		if (class131_sub7_sub2 != null) {
		    Class30.anInt693++;
		    Class57.method490(1, class131_sub7_sub2.smallY[0],
				      class131_sub7_sub2.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class116.anInt2190 = Class115.anInt2186;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class55_Sub3.anInt2816 = 0;
		    Class70_Sub1.outStream.createFrame(2, 4);
		    Class70_Sub1.outStream
			.addLEShort(i_1_, 1608904784);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -20) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		if (class131_sub7_sub1 != null) {
		    Class57.method490(1, class131_sub7_sub1.smallY[0],
				      class131_sub7_sub1.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class75.anInt2726 = Class101.anInt1985;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class23.anInt564++;
		    Class55_Sub3.anInt2816 = 0;
		    Class70_Sub1.outStream.createFrame(arg0, 3);	//NPC_FIRST_CLICK
		    Class70_Sub1.outStream.addLEShortA((byte) 94, i_1_);
		    System.out.println("Npc First Click = "+i_1_);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -1004) {
		Class108.anInt2077++;
		Canvas_Sub1.method46((byte) 110, l, i, i_0_);
		Class70_Sub1.outStream.createFrame(arg0, 170);
		Class70_Sub1.outStream.addLEShortA((byte) 88, (int) (l >>> 1670862304) & 0x7fffffff);
		Class70_Sub1.outStream.addLEShortA((byte) 109, i - -Class58.baseX);
		Class70_Sub1.outStream.addLEShortA((byte) 122, i_0_ - -Class137.baseY);
	    }
	    if ((i_2_ ^ 0xffffffff) == -26) {
		if ((Class69.anInt1381 ^ 0xffffffff) == -2)
		    Class57.method490(1, i_0_, i, 1, (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		else {
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		}
		Class75.anInt2726 = Class101.anInt1985;
		Class85.anInt1750++;
		Class67_Sub5_Sub4.anInt4512 = 2;
		Class116.anInt2190 = Class115.anInt2186;
		Class55_Sub3.anInt2816 = 0;
		Class70_Sub1.outStream.createFrame(2, 109);
		Class70_Sub1.outStream
		    .addLEShort(i_0_ + Class137.baseY, 1608904784);
		Class70_Sub1.outStream
		    .addUShort(arg0 + 16711678, Class58.baseX + i);
		Class70_Sub1.outStream.addLEShortA((byte) -107,
								i_1_);
	    }
	    if ((i_2_ ^ 0xffffffff) == -19) {
		Class67_Sub19.anInt3145++;
		Class70_Sub1.outStream.createFrame(2, 55);	//EQUIP
		Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
		Class70_Sub1.outStream.addShortA(i, arg0 ^ ~0x2fa1);
		Class70_Sub1.outStream.addInt1(i_0_, 86);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if ((i_2_ ^ 0xffffffff) == -38) {
		Class20.anInt504++;
		Class70_Sub1.outStream.createFrame(arg0, 154);
		Class70_Sub1.outStream.addLEShort(i, 1608904784);
		Class70_Sub1.outStream.addInt1(i_0_, 113);
		Class70_Sub1.outStream.addLEShortA((byte) -107, i_1_);
		Class126.anInt2360 = 0;
		Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		Class67_Sub1_Sub13.anInt4017 = i;
	    }
	    if (i_2_ == 13) {
		Class70_Sub1.outStream.createFrame(2, 10);	//ACTIONBUTTON2
		PacketParser.anInt2121++;
		Class70_Sub1.outStream.addInt(i_0_, 122);
		Class7 class7 = Class3.method69((byte) 110, i_0_);
		if (class7.anIntArrayArray260 != null
		    && class7.anIntArrayArray260[0][0] == 5) {
		    int i_4_ = class7.anIntArrayArray260[0][1];
		    Class137.anIntArray2504[i_4_]
			= -Class137.anIntArray2504[i_4_] + 1;
		    Class142.method1952(i_4_, -73);
		}
	    }
	    if (i_2_ == 32) {
		Class131_Sub7_Sub1 class131_sub7_sub1
		    = Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		if (class131_sub7_sub1 != null) {
		    Class57.method490(1, class131_sub7_sub1.smallY[0],
				      class131_sub7_sub1.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class55_Sub3.anInt2816 = 0;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class73.anInt1454++;
		    Class70_Sub1.outStream.createFrame(2, 239);	//MAGIC_ON_NPC
		    Class70_Sub1.outStream.addLEInt((byte) 98, Class67_Sub1_Sub24.anInt4200);
		    Class70_Sub1.outStream.addShortA(Class67_Sub5_Sub6.anInt4558, arg0 + -12198);
		    Class70_Sub1.outStream.addLEShortA((byte) -101, i_1_);
		}
	    }
	    if ((i_2_ ^ 0xffffffff) == -8) {
		if ((Class69.anInt1381 ^ 0xffffffff) != -2) {
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		} else
		    Class57.method490(1, i_0_, i, 1, (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		Class75.anInt2726 = Class101.anInt1985;
		Class116.anInt2190 = Class115.anInt2186;
		Class67_Sub17.anInt3100++;
		Class67_Sub5_Sub4.anInt4512 = 2;
		Class55_Sub3.anInt2816 = 0;
		Class70_Sub1.outStream.createFrame(2, 66);	//PICKUP
		Class70_Sub1.outStream.addLEShort(i - -Class58.baseX, 1608904784);
		Class70_Sub1.outStream.addUShort(arg0 ^ 0xff0002, i_1_);
		Class70_Sub1.outStream.addLEShortA((byte) 79, Class137.baseY + i_0_);
		System.out.println("PICKUP 1st LEShort = "+i);
		System.out.println("PICKUP baseX = "+Class58.baseX);
		System.out.println("PICKUP 2nd addUShort = "+i_1_);
		System.out.println("PICKUP baseY = "+Class137.baseY);
		System.out.println("PICKUP 3rd addLEShortA = "+i_0_);
	    }
	    if ((i_2_ ^ 0xffffffff) == -60 || i_2_ == 1001)
		method632(Class102.aRSStringArray1998[arg1], 10, i, i_0_, i_1_);
	    if ((i_2_ ^ 0xffffffff) == -34) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_1_];
		if (class131_sub7_sub2 != null) {
		    Class57.method490(1, class131_sub7_sub2.smallY[0],
				      class131_sub7_sub2.smallX[0], 1,
				      (byte) -6, false, 0, 0,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallY[0]),
				      0, 2,
				      (Class122.aClass131_Sub7_Sub2_2309
				       .smallX[0]));
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class116.anInt2190 = Class115.anInt2186;
		    RuntimeException_Sub1.anInt2609++;
		    Class55_Sub3.anInt2816 = 0;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class70_Sub1.outStream.createFrame(2, 68);	//ATTACK_PLAYER
		    Class70_Sub1.outStream.addLEShortA((byte) 68,
								    i_1_);
		}
	    }
	    if (i_2_ == 12) {
		Class76.method1398(5197);
		Class7 class7 = Class3.method69((byte) 110, i_0_);
		Class33_Sub2.itemId = i_1_;
		Login.anInt1612 = 1;
		Class102.slotIndex = i;
		Class67_Sub1_Sub31.anInt4289 = i_0_;
		Class37.method326(class7, 107);
		Class67_Sub1_Sub6.aRSString_3895
		    = Class67_Sub1_Sub27.method744((new RSString[]
						    { Class43.aRSString_906,
						      (PacketParser.method1596
						       (i_1_, -28322)
						       .itemName),
						      (Class128
						       .aRSString_2381) }),
						   -94);
		if (Class67_Sub1_Sub6.aRSString_3895 == null)
		    Class67_Sub1_Sub6.aRSString_3895 = Class63.aRSString_1169;
	    } else {
		if (i_2_ == 1007) {
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class55_Sub3.anInt2816 = 0;
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		    if (class131_sub7_sub1 != null) {
			Class64 class64 = class131_sub7_sub1.aClass64_5047;
			if (class64.anIntArray1208 != null)
			    class64 = class64.method578(-1);
			if (class64 != null) {
			    Class70_Sub1.outStream.createFrame(arg0, 72);	//NPC_EXAMINE
			    
			    Class67_Sub11_Sub4.anInt4898++;
			    Class70_Sub1.outStream.addUShort(16711680, class64.anInt1205);
			}
		    }
		}
		if (i_2_ == 48 && Canvas_Sub1.method46((byte) 104, l, i, i_0_)) {
		    Class70_Sub1.outStream.createFrame(2, 134);	//ITEM_ON_OBJECT
		    Class11.anInt407++;
		    Class70_Sub1.outStream.addShortA(i + Class58.baseX, -12196);
		    Class70_Sub1.outStream.addUShort(arg0 + 16711678, Class33_Sub2.itemId);
		    Class70_Sub1.outStream.addLEShort(Class137.baseY + i_0_, 1608904784);
		    Class70_Sub1.outStream.addUShort(16711680, Class102.slotIndex);
		    Class70_Sub1.outStream.addInt2(Class67_Sub1_Sub31.anInt4289, arg0 + -93);
		    Class70_Sub1.outStream.addShortA((int) (l >>> 280104864) & 0x7fffffff, -12196);
		}
		if ((i_2_ ^ 0xffffffff) == -37) {
		    Class67_Sub1_Sub27.anInt4247++;
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class55_Sub3.anInt2816 = 0;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class70_Sub1.outStream.createFrame(2, 101);	//ITEM_ON_GROUND_ITEM
		    Class70_Sub1.outStream.addLEShortA((byte) 96, Class58.baseX + i); //2
		    Class70_Sub1.outStream.addLEShort(Class102.slotIndex, 1608904784); //2
		    Class70_Sub1.outStream.addLEShort(Class33_Sub2.itemId, 1608904784); //2
		    Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);//2
		    Class70_Sub1.outStream.addLEShortA((byte) -90, Class137.baseY + i_0_); //2
		    Class70_Sub1.outStream.addInt2(Class67_Sub1_Sub31.anInt4289, -109); //4
		}
		if (i_2_ == 51) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_1_]);
		    if (class131_sub7_sub2 != null) {
			Class57.method490(1,
					  class131_sub7_sub2.smallY[0],
					  class131_sub7_sub2.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class116.anInt2190 = Class115.anInt2186;
			Class75.anInt2726 = Class101.anInt1985;
			Class21.anInt524++;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class55_Sub3.anInt2816 = 0;
			Class70_Sub1.outStream.createFrame(2, 71);	//ACCEPT_TRADE
			Class70_Sub1.outStream
			    .addLEShortA((byte) 67, i_1_);
		    }
		}
		if (i_2_ == 17) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_1_]);
		    if (class131_sub7_sub2 != null) {
			Class57.method490(1,
					  class131_sub7_sub2.smallY[0],
					  class131_sub7_sub2.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class75.anInt2726 = Class101.anInt1985;
			Class131_Sub7_Sub1.anInt5053++;
			Class55_Sub3.anInt2816 = 0;
			Class116.anInt2190 = Class115.anInt2186;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class70_Sub1.outStream.createFrame(2, 175);
			Class70_Sub1.outStream.addShortA(i_1_, -12196);
		    }
		}
		if (i_2_ == 29) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		    if (class131_sub7_sub1 != null) {
			Class57.method490(1,
					  class131_sub7_sub1.smallY[0],
					  class131_sub7_sub1.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class116.anInt2190 = Class115.anInt2186;
			Class96_Sub1.anInt3377++;
			Class55_Sub3.anInt2816 = 0;
			Class75.anInt2726 = Class101.anInt1985;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class70_Sub1.outStream.createFrame(arg0, 30);	//NPC_FOURTH_CLICK
			Class70_Sub1.outStream.addUShort(16711680, i_1_);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -47) {
		    boolean bool = true;
		    Class7 class7 = Class3.method69((byte) 110, i_0_);
		    if ((class7.anInt287 ^ 0xffffffff) < -1)
			bool = Class76.method1399(class7, arg0 ^ ~0x7e);
		    if (bool) {
			Class70_Sub1.outStream.createFrame(2, 10);	//ACTIONBUTTON2
			Class70_Sub1.outStream.addInt(i_0_, 123);
			System.out.println("ActionButton2 addInt = "+i_0_);
			PacketParser.anInt2121++;
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -40) {
		    Class67_Sub5_Sub18.anInt4808++;
		    Class70_Sub1.outStream.createFrame(arg0, 27);	//ITEM_ON_ITEM
		    Class70_Sub1.outStream.addUShort(16711680, Class102.slotIndex);
		    Class70_Sub1.outStream.addLEInt((byte) 110, i_0_);
		    Class70_Sub1.outStream.addLEShort(i, 1608904784);
		    Class70_Sub1.outStream.addLEInt((byte) 94, Class67_Sub1_Sub31.anInt4289);
		    Class70_Sub1.outStream.addLEShortA((byte) -90, Class33_Sub2.itemId);
		    Class70_Sub1.outStream.addLEShortA((byte) -115, i_1_);
		    Class126.anInt2360 = 0;
		    Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		    Class67_Sub1_Sub13.anInt4017 = i;
		   
		}
		if ((i_2_ ^ 0xffffffff) == -16) {
		    Class70_Sub1.outStream.createFrame(2, 253);
		    Class70_Sub1.outStream
			.addLEInt((byte) -81, Class67_Sub1_Sub24.anInt4200);
		    Class106.anInt2065++;
		    Class70_Sub1.outStream.addLEShortA((byte) 118, i);
		    Class70_Sub1.outStream.addLEInt((byte) 36, i_0_);
		    Class70_Sub1.outStream.addShortA(i_1_, -12196);
		    Class70_Sub1.outStream.addLEShort(Class67_Sub5_Sub6.anInt4558, 1608904784);
		    Class126.anInt2360 = 0;
		    Class67_Sub5_Sub9.aClass7_4604 = Class3.method69((byte) 110, i_0_);
		    Class67_Sub1_Sub13.anInt4017 = i;
		}
		if ((i_2_ ^ 0xffffffff) == -61) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		    if (class131_sub7_sub1 != null) {
			Class67_Sub1_Sub6.anInt3884++;
			Class57.method490(1,
					  class131_sub7_sub1.smallY[0],
					  class131_sub7_sub1.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class75.anInt2726 = Class101.anInt1985;
			Class55_Sub3.anInt2816 = 0;
			Class116.anInt2190 = Class115.anInt2186;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class70_Sub1.outStream.createFrame(2, 115);	//ITEM_ON_NPC
			Class70_Sub1.outStream.addInt2(Class67_Sub1_Sub31.anInt4289, -97);
			Class70_Sub1.outStream.addLEShort(Class102.slotIndex, arg0 + 1608904782);
			Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
			Class70_Sub1.outStream.addLEShortA((byte) -99, Class33_Sub2.itemId);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -50) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_1_];
		    if (class131_sub7_sub1 != null) {
			Class57.method490(1,
					  class131_sub7_sub1.smallY[0],
					  class131_sub7_sub1.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class55_Sub3.anInt2816 = 0;
			Class44.anInt916++;
			Class75.anInt2726 = Class101.anInt1985;
			Class116.anInt2190 = Class115.anInt2186;
			Class70_Sub1.outStream.createFrame(2, 78);	//NPC_SECOND_CLICK
			Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
		    }
		}
		if (i_2_ == 41) {
		    if (i_1_ == 0) {
			Class67_Sub1_Sub36.anInt4366 = 1;
			Class67_Sub1_Sub28.method750(Canvas_Sub1.anInt59, i,
						     i_0_);
		    } else if ((i_1_ ^ 0xffffffff) == -2) {
			Class70_Sub1.outStream.createFrame(2, 131);
			Class67_Sub1_Sub13.anInt4026++;
			Class70_Sub1.outStream.addInt2(Class67_Sub1_Sub24.anInt4200, -119);
			Class70_Sub1.outStream.addShortA(Class58.baseX - -i, arg0 + -12198);
			Class70_Sub1.outStream.addLEShortA((byte) 48, Class67_Sub5_Sub6.anInt4558);
			Class70_Sub1.outStream.addShortA(i_0_ + Class137.baseY, arg0 + -12198);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -22) {
		    Class28.anInt664++;
		    if ((Class69.anInt1381 ^ 0xffffffff) == -2)
			Class57.method490(1, i_0_, i, 1, (byte) -6, false, 0,
					  0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
		    else {
			boolean bool
			    = Class57.method490(0, i_0_, i, 0, (byte) -6,
						false, 0, 0,
						(Class122
						 .aClass131_Sub7_Sub2_2309
						 .smallY[0]),
						0, 2,
						(Class122
						 .aClass131_Sub7_Sub2_2309
						 .smallX[0]));
			if (!bool)
			    bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						     false, 0, 0,
						     (Class122
						      .aClass131_Sub7_Sub2_2309
						      .smallY[0]),
						     0, 2,
						     (Class122
						      .aClass131_Sub7_Sub2_2309
						      .smallX[0]));
		    }
		    Class75.anInt2726 = Class101.anInt1985;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class55_Sub3.anInt2816 = 0;
		    Class70_Sub1.outStream.createFrame(2, 228);
		    Class70_Sub1.outStream.addUShort(arg0 + 16711678, i_1_);
		    Class70_Sub1.outStream.addLEShort(Class58.baseX + i, 1608904784);
		    Class70_Sub1.outStream.addLEShortA((byte) 60, Class137.baseY + i_0_);
		}
		if ((i_2_ ^ 0xffffffff) == -1005) {
		    Class55_Sub3.anInt2816 = 0;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class54.anInt1072++;
		    Class116.anInt2190 = Class115.anInt2186;
		    Class70_Sub1.outStream.createFrame(2, 94);
		    Class70_Sub1.outStream.addLEShortA((byte) 97, i_1_);
		}
		if (i_2_ == 24) {
		    Class40.anInt833++;
		    boolean bool
			= Class57.method490(0, i_0_, i, 0, (byte) -6, false, 0,
					    0,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallY[0]),
					    0, 2,
					    (Class122.aClass131_Sub7_Sub2_2309
					     .smallX[0]));
		    if (!bool)
			bool = Class57.method490(1, i_0_, i, 1, (byte) -6,
						 false, 0, 0,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallY[0]),
						 0, 2,
						 (Class122
						  .aClass131_Sub7_Sub2_2309
						  .smallX[0]));
		    Class116.anInt2190 = Class115.anInt2186;
		    Class67_Sub5_Sub4.anInt4512 = 2;
		    Class55_Sub3.anInt2816 = 0;
		    Class75.anInt2726 = Class101.anInt1985;
		    Class70_Sub1.outStream.createFrame(2, 73);
		    Class70_Sub1.outStream.addInt1(Class67_Sub1_Sub24.anInt4200, 103);
		    Class70_Sub1.outStream.addUShort(16711680, Class137.baseY + i_0_);
		    Class70_Sub1.outStream.addLEShortA((byte) -125, i_1_);
		    Class70_Sub1.outStream.addLEShortA((byte) -89, Class58.baseX + i);
		    Class70_Sub1.outStream.addLEShort(Class67_Sub5_Sub6.anInt4558, 1608904784);
		}
		if ((i_2_ ^ 0xffffffff) == -24) {
		    Class76.anInt1522++;
		    Class70_Sub1.outStream.createFrame(arg0, 135);	//INV_DROP
		    Class70_Sub1.outStream.addShortA(i_1_, -12196);
		    Class70_Sub1.outStream.addShortA(i, arg0 + -12198);
		    Class70_Sub1.outStream.addInt2(i_0_, -91);
		    Class126.anInt2360 = 0;
		    Class67_Sub5_Sub9.aClass7_4604
			= Class3.method69((byte) 110, i_0_);
		    Class67_Sub1_Sub13.anInt4017 = i;
		}
		if (i_2_ == 42) {
		    Class70_Sub1.outStream.createFrame(2, 81);	//INTERFACE_CLICK_1 /unequip item
		    Class70_Sub1.outStream.addShortA(i, -12196);
		    Class70_Sub1.outStream.addUShort(16711680, i_1_);
		    Class70_Sub1.outStream.addInt1(i_0_, 28);
		    Class126.anInt2360 = 0;
		    Class70.anInt1406++;
		    Class67_Sub5_Sub9.aClass7_4604
			= Class3.method69((byte) 110, i_0_);
		    Class67_Sub1_Sub13.anInt4017 = i;
		}
		if ((i_2_ ^ 0xffffffff) == -48) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_1_]);
		    if (class131_sub7_sub2 != null) {
			Class57.method490(1,
					  class131_sub7_sub2.smallY[0],
					  class131_sub7_sub2.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class140.anInt2546++;
			Class55_Sub3.anInt2816 = 0;
			Class75.anInt2726 = Class101.anInt1985;
			Class116.anInt2190 = Class115.anInt2186;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class70_Sub1.outStream.createFrame(2, 248);
			Class70_Sub1.outStream.addLEShortA((byte) -127, i_1_);
			Class70_Sub1.outStream.addUShort(16711680, Class33_Sub2.itemId);
			Class70_Sub1.outStream.addUShort(16711680, Class102.slotIndex);
			Class70_Sub1.outStream.addInt2(Class67_Sub1_Sub31.anInt4289, -97);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -1006) {
		    Class7 class7 = Class3.method69((byte) 110, i_0_);
		    if (class7 == null
			|| (class7.anIntArray253[i] ^ 0xffffffff) > -100001) {
			Class70_Sub1.outStream.createFrame(2, 92);	//INV_EXAMINE_ITEM
			Class70_Sub1.outStream.addLEShortA((byte) 54, i_1_);
			Class4.anInt125++;
		    } else
			Class87.method1465
			    (true,
			     (Class67_Sub1_Sub27.method744
			      ((new RSString[]
				{ InputStream_Sub1
				      .method47(class7.anIntArray253[i], true),
				  Class67_Sub5_Sub1.aRSString_4452,
				  (PacketParser.method1596(i_1_, -28322)
				   .itemName) }),
			       -107)),
			     Class67_Sub5_Sub5.aRSString_4523, 0);
		    Class126.anInt2360 = 0;
		    Class67_Sub5_Sub9.aClass7_4604
			= Class3.method69((byte) 110, i_0_);
		    Class67_Sub1_Sub13.anInt4017 = i;
		}
		if ((i_2_ ^ 0xffffffff) == -41) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_1_]);
		    if (class131_sub7_sub2 != null) {
			Class57.method490(1,
					  class131_sub7_sub2.smallY[0],
					  class131_sub7_sub2.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class55_Sub3.anInt2816 = 0;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class116.anInt2190 = Class115.anInt2186;
			Class51.anInt1042++;
			Class75.anInt2726 = Class101.anInt1985;
			Class70_Sub1.outStream.createFrame(2, 133);
			Class70_Sub1.outStream.addLEShort(i_1_, arg0 + 1608904782);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -9) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_1_]);
		    if (class131_sub7_sub2 != null) {
			Class57.method490(1,
					  class131_sub7_sub2.smallY[0],
					  class131_sub7_sub2.smallX[0],
					  1, (byte) -6, false, 0, 0,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallY[0]),
					  0, 2,
					  (Class122.aClass131_Sub7_Sub2_2309
					   .smallX[0]));
			Class75.anInt2726 = Class101.anInt1985;
			Class55_Sub3.anInt2816 = 0;
			Class67_Sub26.anInt3278++;
			Class67_Sub5_Sub4.anInt4512 = 2;
			Class116.anInt2190 = Class115.anInt2186;
			Class70_Sub1.outStream.createFrame(2, 106);	//FOLLOW
			Class70_Sub1.outStream.addUShort(arg0 ^ 0xff0002, i_1_);
		    }
		}
		if ((i_2_ ^ 0xffffffff) == -7) {
		    Class7 class7
			= Class67_Sub5_Sub14.method972(i, arg0 + 18060, i_0_);
		    if (class7 != null) {
			Class76.method1398(5197);
			Class67_Sub14 class67_sub14 = client.method31(class7);
			Class111.method1592(class7.anInt332, (byte) -50, i,
					    class7.anInt235, i_0_,
					    class67_sub14.anInt3053,
					    class67_sub14
						.method1225(arg0 ^ ~0x2));
			Login.anInt1612 = 0;
			Class67_Sub26.aRSString_3288
			    = Class55_Sub1.method466(320, class7);
			if (Class67_Sub26.aRSString_3288 == null)
			    Class67_Sub26.aRSString_3288
				= Class67_Sub1_Sub19.aRSString_4135;
			if (!class7.aBoolean185)
			    Class9.aRSString_369
				= (Class67_Sub1_Sub27.method744
				   ((new RSString[]
				     { Class67_Sub1_Sub18.aRSString_4108,
				       class7.aRSString_258,
				       Class128.aRSString_2381 }),
				    -111));
			else
			    Class9.aRSString_369
				= (Class67_Sub1_Sub27.method744
				   (new RSString[] { class7.aRSString_178,
						    Class128.aRSString_2381 },
				    -125));
		    }
		} else {
		    if (i_2_ == 4) {
			Class131_Sub7_Sub1 class131_sub7_sub1
			    = Class128.aClass131_Sub7_Sub1Array2386[i_1_];
			if (class131_sub7_sub1 != null) {
			    Class57.method490
				(1, class131_sub7_sub1.smallY[0],
				 class131_sub7_sub1.smallX[0], 1,
				 (byte) -6, false, 0, 0,
				 (Class122.aClass131_Sub7_Sub2_2309
				  .smallY[0]),
				 0, 2,
				 (Class122.aClass131_Sub7_Sub2_2309
				  .smallX[0]));
			    Class116.anInt2190 = Class115.anInt2186;
			    Class55_Sub3.anInt2816 = 0;
			    Class67_Sub5_Sub4.anInt4512 = 2;
			    Class67_Sub3.anInt2848++;
			    Class75.anInt2726 = Class101.anInt1985;
			    Class70_Sub1.outStream.createFrame(2, 218);	//NPC_FIFTH_CLICK
			    Class70_Sub1.outStream.addLEShort(i_1_, 1608904784);
			}
		    }
		    if ((Login.anInt1612 ^ 0xffffffff) != -1) {
			Login.anInt1612 = 0;
			Class37.method326(Class3.method69((byte) 110,
							  (Class67_Sub1_Sub31
							   .anInt4289)),
					  99);
		    }
		    if (Class67_Sub20.aBoolean3156)
			Class76.method1398(5197);
		    if (Class67_Sub5_Sub9.aClass7_4604 != null
			&& Class126.anInt2360 == 0)
			Class37.method326(Class67_Sub5_Sub9.aClass7_4604,
					  arg0 + 122);
		}
	    }
	}
    }
    
    public Class67_Sub1_Sub2() {
	super(1, false);
    }
    
    public static int method631(RSString arg0, byte arg1) {
	anInt3829++;
	if (arg0 == null)
	    return -1;
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff);
	     i++) {
	    if (arg0.method526(-85, Class99_Sub1.aRSStringArray3384[i]))
		return i;
	}
	if (arg1 != 109)
	    method629(72);
	return -1;
    }
    
    public static void method632(RSString arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	Class7 class7 = Class67_Sub5_Sub14.method972(arg2, arg1 + 18052, arg3);
	anInt3841++;
	if (class7 != null) {
	    if (class7.anObjectArray200 != null) {
		Class67_Sub30 class67_sub30 = new Class67_Sub30();
		class67_sub30.anObjectArray3356 = class7.anObjectArray200;
		class67_sub30.aClass7_3352 = class7;
		class67_sub30.aRSString_3349 = arg0;
		class67_sub30.anInt3348 = arg4;
		Class81.method1429(class67_sub30, arg1 ^ 0x4d);
	    }
	    boolean bool = true;
	    if ((class7.anInt287 ^ 0xffffffff) < -1)
		bool = Class76.method1399(class7, 89);
	    if (bool
		&& client.method31(class7).method1229((byte) -86, -1 + arg4)) {
		if (arg4 == 1) {
		    Class70_Sub1.outStream.createFrame(2, 155);	//ACTIONBUTTON
		    Class70_Sub1.outStream.addInt(arg3, 118);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		    Class53.anInt1060++;
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    Class70_Sub1.outStream.createFrame(2, 196);	//INTERFACE_CLICK_2
		    Class70_Sub1.anInt3363++;
		    Class70_Sub1.outStream.addInt(arg3, 124);
		    Class70_Sub1.outStream.addUShort(arg1 + 16711670, arg2);
		}
		if ((arg4 ^ 0xffffffff) == -4) {
		    Class67_Sub1_Sub5.anInt3870++;
		    Class70_Sub1.outStream.createFrame(2, 124);	//INTERFACE_CLICK_3
		    Class70_Sub1.outStream.addInt(arg3, 120);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
		if ((arg4 ^ 0xffffffff) == -5) {
		    Class22.anInt535++;
		    Class70_Sub1.outStream.createFrame(2, 199);	//INTERFACE_CLICK_4
		    Class70_Sub1.outStream.addInt(arg3, 118);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
		if ((arg4 ^ 0xffffffff) == -6) {
		    RuntimeException_Sub1.anInt2614++;
		    Class70_Sub1.outStream.createFrame(2, 234);	//INTERFACE_CLICK_5
		    Class70_Sub1.outStream.addInt(arg3, 123);
		    Class70_Sub1.outStream.addUShort(arg1 + 16711670, arg2);
		}
		if (arg4 == 6) {
		    Class22.anInt526++;
		    Class70_Sub1.outStream.createFrame(2, 168); //INTERFACE_CLICK_6
		    Class70_Sub1.outStream.addInt(arg3, 122);
		    Class70_Sub1.outStream.addUShort(arg1 + 16711670, arg2);
		}
		if (arg4 == 7) {
		    Class70_Sub1.outStream.createFrame(2, 166); //INTERFACE_CLICK_7
		    Class69.anInt1386++;
		    Class70_Sub1.outStream.addInt(arg3, 118);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
		if (arg4 == 8) {
		    Class70_Sub1.outStream.createFrame(2, 64); //INTERFACE_CLICK_8
		    Class120.anInt2280++;
		    Class70_Sub1.outStream.addInt(arg3, 126);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
		if (arg4 == 9) {
		    Class80.anInt1625++;
		    Class70_Sub1.outStream.createFrame(arg1 + -8, 53); //INTERFACE_CLICK_9
		    Class70_Sub1.outStream.addInt(arg3, 121);
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
		if (arg1 == arg4) {
		    Class70_Sub1.outStream.createFrame(2, 9); //INV_EXAMINE_ITEM_GE
		    Class70_Sub1.outStream.addInt(arg3, 118);
		    Class107.anInt2070++;
		    Class70_Sub1.outStream.addUShort(16711680, arg2);
		}
	    }
	}
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    method630(111, 37);
	int[][] is = aClass103_2830.method1551(arg1, 93);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_5_
		= this.method609((aBoolean3832
				  ? Class67_Sub1_Sub36.anInt4381 + -arg1
				  : arg1),
				 false, 0);
	    int[] is_6_ = is_5_[1];
	    int[] is_7_ = is_5_[0];
	    int[] is_8_ = is_5_[2];
	    int[] is_9_ = is[1];
	    int[] is_10_ = is[0];
	    int[] is_11_ = is[2];
	    if (aBoolean3833) {
		for (int i = 0; (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569
						    ^ 0xffffffff); i++) {
		    is_10_[i] = is_7_[-i + Class76.anInt1581];
		    is_9_[i] = is_6_[-i + Class76.anInt1581];
		    is_11_[i] = is_8_[Class76.anInt1581 + -i];
		}
	    } else {
		for (int i = 0; (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569
						    ^ 0xffffffff); i++) {
		    is_10_[i] = is_7_[i];
		    is_9_[i] = is_6_[i];
		    is_11_[i] = is_8_[i];
		}
	    }
	}
	anInt3837++;
	return is;
    }
    
    public static void method633(Class36 arg0) {
	for (int i = arg0.anInt765; i <= arg0.anInt778; i++) {
	    for (int i_12_ = arg0.anInt777; i_12_ <= arg0.anInt789; i_12_++) {
		Class67_Sub24 class67_sub24
		    = (Class76.aClass67_Sub24ArrayArrayArray1578[arg0.anInt787]
		       [i][i_12_]);
		if (class67_sub24 != null) {
		    for (int i_13_ = 0; i_13_ < class67_sub24.anInt3215;
			 i_13_++) {
			if (class67_sub24.aClass36Array3229[i_13_] == arg0) {
			    class67_sub24.anInt3215--;
			    for (int i_14_ = i_13_;
				 i_14_ < class67_sub24.anInt3215; i_14_++) {
				class67_sub24.aClass36Array3229[i_14_]
				    = (class67_sub24.aClass36Array3229
				       [i_14_ + 1]);
				class67_sub24.anIntArray3222[i_14_]
				    = class67_sub24.anIntArray3222[i_14_ + 1];
			    }
			    class67_sub24.aClass36Array3229[(class67_sub24
							     .anInt3215)]
				= null;
			    break;
			}
		    }
		    class67_sub24.anInt3236 = 0;
		    for (int i_15_ = 0; i_15_ < class67_sub24.anInt3215;
			 i_15_++)
			class67_sub24.anInt3236
			    |= class67_sub24.anIntArray3222[i_15_];
		}
	    }
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    anInt3839 = -70;
	int[] is = aClass144_2836.method1961(arg0, true);
	anInt3836++;
	if (aClass144_2836.aBoolean2607) {
	    int[] is_16_
		= this.method613(0,
				 (!aBoolean3832 ? arg0
				  : -arg0 + Class67_Sub1_Sub36.anInt4381),
				 false);
	    if (!aBoolean3833)
		Class17.method181(is_16_, 0, is, 0,
				  Class67_Sub5_Sub7.anInt4569);
	    else {
		for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++)
		    is[i] = is_16_[-i + Class76.anInt1581];
	    }
	}
	return is;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
    while_23_:
	do {
	    do {
		if (i != 0) {
		    if ((i ^ 0xffffffff) != -2) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_23_;
		    }
		} else {
		    aBoolean3833
			= (arg0.readByte((byte) 87) ^ 0xffffffff) == -2;
		    break while_23_;
		}
		aBoolean3832
		    = (arg0.readByte((byte) -71) ^ 0xffffffff) == -2;
		break while_23_;
	    } while (false);
	    aBoolean2839 = arg0.readByte((byte) 89) == 1;
	} while (false);
	anInt3835++;
	if (arg1 != true)
	    anInt3834 = -85;
    }
}
