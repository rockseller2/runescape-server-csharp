/* Class67_Sub5_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class67_Sub5_Sub8 extends Class67_Sub5
{
    public static byte[][][] aByteArrayArrayArray4571;
    public Class92 aClass92_4572;
    public static int anInt4573;
    public static int anInt4574;
    public static int anInt4575;
    public static RSString aRSString_4576;
    public static short aShort4577 = 205;
    public RSString aRSString_4578 = Class67_Sub30.aRSString_3343;
    public static RSString aRSString_4579 = Class134.method1914("0", (byte) 40);
    public static int anInt4580;
    public static int anInt4581;
    public static int anInt4582;
    public static int anInt4583;
    public static RSString aRSString_4584
	= Class134.method1914("settings=", (byte) 49);
    public static int anInt4585;
    public static int anInt4586;
    public int anInt4587;
    public static int anInt4588;
    public static int anInt4589;
    public Class92 aClass92_4590;
    public static int anInt4591;
    public static int anInt4592;
    public static int anInt4593;
    public static int anInt4594;
    public int anInt4595;
    public int anInt4596;
    public static int anInt4597;
    
    public static void method879(int arg0, PacketStream arg1,
				 boolean arg2) {
	if (arg2 == true) {
	    anInt4589++;
	    for (;;) {
		Class67_Sub23 class67_sub23
		    = (Class67_Sub23) Class30.aClass50_692.method445(0);
		if (class67_sub23 == null)
		    break;
		boolean bool = false;
		for (int i = 0;
		     (i ^ 0xffffffff) > (class67_sub23.anInt3206 ^ 0xffffffff);
		     i++) {
		    if (class67_sub23.aClass31Array3198[i] != null) {
			if (class67_sub23.aClass31Array3198[i].anInt706 == 2)
			    class67_sub23.anIntArray3194[i] = -5;
			if ((class67_sub23.aClass31Array3198[i].anInt706
			     ^ 0xffffffff)
			    == -1)
			    bool = true;
		    }
		    if (class67_sub23.aClass31Array3192[i] != null) {
			if ((class67_sub23.aClass31Array3192[i].anInt706
			     ^ 0xffffffff)
			    == -3)
			    class67_sub23.anIntArray3194[i] = -6;
			if ((class67_sub23.aClass31Array3192[i].anInt706
			     ^ 0xffffffff)
			    == -1)
			    bool = true;
		    }
		}
		if (bool)
		    break;
		arg1.createFrame(2, arg0);
		arg1.addByte((byte) 4, 0);
		int i = arg1.currentOffset;
		arg1.addInt(class67_sub23.anInt3204, 118);
		for (int i_0_ = 0; ((class67_sub23.anInt3206 ^ 0xffffffff)
				    < (i_0_ ^ 0xffffffff)); i_0_++) {
		    if (class67_sub23.anIntArray3194[i_0_] != 0)
			arg1.addByte((byte) 4,
					class67_sub23.anIntArray3194[i_0_]);
		    else {
			try {
			    int i_1_ = class67_sub23.anIntArray3199[i_0_];
			    if (i_1_ != 0) {
				if ((i_1_ ^ 0xffffffff) != -2) {
				    if (i_1_ == 2) {
					Field field
					    = ((Field)
					       (class67_sub23.aClass31Array3198
						[i_0_].anObject705));
					int i_2_ = field.getModifiers();
					arg1.addByte((byte) 4, 0);
					arg1.addInt(i_2_, 117);
				    }
				} else {
				    Field field = (Field) (class67_sub23
							   .aClass31Array3198
							   [i_0_].anObject705);
				    field.setInt(null,
						 (class67_sub23.anIntArray3193
						  [i_0_]));
				    arg1.addByte((byte) 4, 0);
				}
			    } else {
				Field field
				    = (Field) (class67_sub23.aClass31Array3198
					       [i_0_].anObject705);
				int i_3_ = field.getInt(null);
				arg1.addByte((byte) 4, 0);
				arg1.addInt(i_3_, 121);
			    }
			    if ((i_1_ ^ 0xffffffff) != -4) {
				if ((i_1_ ^ 0xffffffff) == -5) {
				    Method method
					= ((Method)
					   (class67_sub23.aClass31Array3192
					    [i_0_].anObject705));
				    int i_4_ = method.getModifiers();
				    arg1.addByte((byte) 4, 0);
				    arg1.addInt(i_4_, 122);
				}
			    } else {
				Method method
				    = (Method) (class67_sub23.aClass31Array3192
						[i_0_].anObject705);
				byte[][] is
				    = (class67_sub23.aByteArrayArrayArray3197
				       [i_0_]);
				Object[] objects = new Object[is.length];
				for (int i_5_ = 0; is.length > i_5_; i_5_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream(is
								     [i_5_])));
				    objects[i_5_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object == null)
				    arg1.addByte((byte) 4, 0);
				else if (!(object instanceof Number)) {
				    if (object instanceof RSString) {
					arg1.addByte((byte) 4, 2);
					arg1.writeRSString((RSString) object,
							(byte) 0);
				    } else
					arg1.addByte((byte) 4, 4);
				} else {
				    arg1.addByte((byte) 4, 1);
				    arg1.writeLong(2, ((Number) object)
							   .longValue());
				}
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    arg1.addByte((byte) 4, -10);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    arg1.addByte((byte) 4, -11);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    arg1.addByte((byte) 4, -12);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    arg1.addByte((byte) 4, -13);
			} catch (IllegalAccessException illegalaccessexception) {
			    arg1.addByte((byte) 4, -14);
			} catch (IllegalArgumentException illegalargumentexception) {
			    arg1.addByte((byte) 4, -15);
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    arg1.addByte((byte) 4, -16);
			} catch (SecurityException securityexception) {
			    arg1.addByte((byte) 4, -17);
			} catch (java.io.IOException ioexception) {
			    arg1.addByte((byte) 4, -18);
			} catch (NullPointerException nullpointerexception) {
			    arg1.addByte((byte) 4, -19);
			} catch (Exception exception) {
			    arg1.addByte((byte) 4, -20);
			} catch (Throwable throwable) {
			    arg1.addByte((byte) 4, -21);
			}
		    }
		}
		arg1.method1090((byte) 122, i);
		arg1.method1079(125, arg1.currentOffset + -i);
		class67_sub23.method606((byte) -118);
	    }
	}
    }
    
    public void method880(byte arg0) {
	int i = -80 / ((arg0 - 66) / 38);
	anInt4594++;
	aClass92_4572 = new Class92(aClass92_4590.method1482(-1));
	for (Class67_Sub29 class67_sub29
		 = (Class67_Sub29) aClass92_4590.method1483((byte) 74);
	     class67_sub29 != null;
	     class67_sub29 = (Class67_Sub29) aClass92_4590.method1480(11)) {
	    Class67_Sub21 class67_sub21
		= new Class67_Sub21(class67_sub29.musicName,
				    (int) class67_sub29.aLong1344);
	    aClass92_4572.method1488((byte) -89, class67_sub21,
				     class67_sub29.musicName
					 .method504(111));
	}
    }
    
    public static int method881(byte arg0, int arg1) {
	anInt4575++;
	double d = (double) (0xff & arg1 >> 2071032944) / 256.0;
	double d_6_ = (double) (arg1 & 0xff) / 256.0;
	double d_7_ = (double) (0xff & arg1 >> 1697090696) / 256.0;
	double d_8_ = d;
	double d_9_ = d;
	if (arg0 != -117)
	    method894(-3, -10);
	if (d_9_ > d_7_)
	    d_9_ = d_7_;
	if (d_6_ < d_9_)
	    d_9_ = d_6_;
	if (d_8_ < d_7_)
	    d_8_ = d_7_;
	if (d_8_ < d_6_)
	    d_8_ = d_6_;
	double d_10_ = 0.0;
	double d_11_ = (d_8_ + d_9_) / 2.0;
	double d_12_ = 0.0;
	int i = (int) (256.0 * d_11_);
	if (d_8_ != d_9_) {
	    if (d_8_ == d)
		d_12_ = (d_7_ - d_6_) / (d_8_ - d_9_);
	    else if (d_8_ == d_7_)
		d_12_ = 2.0 + (-d + d_6_) / (-d_9_ + d_8_);
	    else if (d_8_ == d_6_)
		d_12_ = (d - d_7_) / (d_8_ - d_9_) + 4.0;
	    if (d_11_ < 0.5)
		d_10_ = (-d_9_ + d_8_) / (d_9_ + d_8_);
	    if (d_11_ >= 0.5)
		d_10_ = (-d_9_ + d_8_) / (2.0 - d_8_ - d_9_);
	}
	if ((i ^ 0xffffffff) <= -1) {
	    if ((i ^ 0xffffffff) < -256)
		i = 255;
	} else
	    i = 0;
	d_12_ /= 6.0;
	int i_13_ = (int) (d_10_ * 256.0);
	if ((i_13_ ^ 0xffffffff) > -1)
	    i_13_ = 0;
	else if (i_13_ > 255)
	    i_13_ = 255;
	if (i <= 243) {
	    if ((i ^ 0xffffffff) < -218)
		i_13_ >>= 3;
	    else if (i <= 192) {
		if (i > 179)
		    i_13_ >>= 1;
	    } else
		i_13_ >>= 2;
	} else
	    i_13_ >>= 4;
	int i_14_ = (int) (d_12_ * 256.0);
	return ((i >> -1882403967) + (i_14_ >> -917732702 << 1327253834)
		+ (i_13_ >> -2047993211 << -188226041));
    }
    
    public static void method882(boolean arg0) {
	anInt4574++;
	if (Class114.aClass67_Sub5_Sub6_2155 != null) {
	    if ((Class115.anInt2185 ^ 0xffffffff) > -11) {
		if (!Class67_Sub8.aClass9_2966.method105
		     (256, Class114.aClass67_Sub5_Sub6_2155.aRSString_4553)) {
		    Class115.anInt2185
			= (Class2.aClass9_108.method113
			   (Class114.aClass67_Sub5_Sub6_2155.aRSString_4553,
			    -19579)) / 10;
		    return;
		}
		Class67_Sub16.method1244(-98);
		Class115.anInt2185 = 10;
	    }
	    if ((Class115.anInt2185 ^ 0xffffffff) == -11) {
		Class100.anInt1968
		    = (Class114.aClass67_Sub5_Sub6_2155.anInt4542 >> 1801231910
		       << 587549830);
		Class67_Sub1_Sub13.anInt4031
		    = (-Class100.anInt1968
		       + (Class114.aClass67_Sub5_Sub6_2155.anInt4539
			  >> -1243179450 << -786547162)
		       + 64);
		if (Class114.aClass67_Sub5_Sub6_2155.anInt4541 != 37) {
		    if (Class114.aClass67_Sub5_Sub6_2155.anInt4541 == 50)
			Class131.aFloat2430 = Class54.aFloat1075 = 4.0F;
		    else if ((Class114.aClass67_Sub5_Sub6_2155.anInt4541
			      ^ 0xffffffff)
			     == -76)
			Class131.aFloat2430 = Class54.aFloat1075 = 6.0F;
		    else if ((Class114.aClass67_Sub5_Sub6_2155.anInt4541
			      ^ 0xffffffff)
			     != -101) {
			if (Class114.aClass67_Sub5_Sub6_2155.anInt4541 != 200)
			    Class131.aFloat2430 = Class54.aFloat1075 = 8.0F;
			else
			    Class131.aFloat2430 = Class54.aFloat1075 = 16.0F;
		    } else
			Class131.aFloat2430 = Class54.aFloat1075 = 8.0F;
		} else
		    Class131.aFloat2430 = Class54.aFloat1075 = 3.0F;
		Class67_Sub1_Sub21.anInt4159
		    = (Class114.aClass67_Sub5_Sub6_2155.anInt4556 >> 1181929382
		       << -2057773306);
		int i = (Class58.baseX
			 - -(Class122.aClass131_Sub7_Sub2_2309.anInt3733
			     >> 1529452359)
			 - Class100.anInt1968);
		i += (int) (10.0 * Math.random()) - 5;
		Class131_Sub5.anInt3656
		    = (64 + -Class67_Sub1_Sub21.anInt4159
		       + (Class114.aClass67_Sub5_Sub6_2155.anInt4560
			  >> 616871398 << 481855078));
		int i_15_
		    = (-(Class122.aClass131_Sub7_Sub2_2309.anInt3726
			 >> -248563897)
		       + (-Class137.baseY - -Class67_Sub1_Sub21.anInt4159)
		       + (Class131_Sub5.anInt3656 - 1));
		i_15_ += (int) (10.0 * Math.random()) - 5;
		if ((i ^ 0xffffffff) > -1 || Class67_Sub1_Sub13.anInt4031 <= i
		    || (i_15_ ^ 0xffffffff) > -1
		    || i_15_ >= Class131_Sub5.anInt3656) {
		    Class118.anInt2231
			= (-(64 * Class114.aClass67_Sub5_Sub6_2155.anInt4551)
			   + Class67_Sub1_Sub21.anInt4159
			   + (-1 + Class131_Sub5.anInt3656));
		    Class67_Sub3.anInt2853
			= (64 * Class114.aClass67_Sub5_Sub6_2155.anInt4550
			   - Class100.anInt1968);
		} else {
		    Class67_Sub3.anInt2853 = i;
		    Class118.anInt2231 = i_15_;
		}
		Class67_Sub26.method1295(98);
		int i_16_ = Class119.anInt2261 >> 613694049;
		int i_17_ = (Class67_Sub1_Sub13.anInt4025 >> -121386014
			     << -1588344310);
		int i_18_ = Class67_Sub1_Sub13.anInt4031 >> -1489579834;
		int i_19_ = Class131_Sub5.anInt3656 >> -1975572442;
		Class87.aByteArrayArrayArray1783 = new byte[i_18_][i_19_][];
		Class67_Sub1_Sub9.aByteArrayArrayArray3956
		    = new byte[i_18_][i_19_][];
		Class53.aByteArrayArrayArray1062 = new byte[i_18_][i_19_][];
		Class6.anIntArrayArrayArray148 = new int[i_18_][i_19_][];
		Class67_Sub5_Sub1.aByteArrayArrayArray4458
		    = new byte[i_18_][i_19_][];
		Class67_Sub1_Sub16_Sub1.anIntArray5098
		    = new int[1 + Class67_Sub5_Sub2.anInt4473];
		Class67_Sub23.anIntArrayArrayArray3211
		    = new int[i_18_][i_19_][];
		Class49.aByteArrayArrayArray1005 = new byte[i_18_][i_19_][];
		Class120.anIntArrayArrayArray2287 = new int[i_18_][i_19_][];
		Class82.method1434(i_17_, i_16_, 122);
		Class115.anInt2185 = 20;
	    } else if ((Class115.anInt2185 ^ 0xffffffff) == -21) {
		Class98.method1514(new Stream(Class67_Sub8
							.aClass9_2966.method116
						    (122, Class25.aRSString_604,
						     (Class114
						      .aClass67_Sub5_Sub6_2155
						      .aRSString_4553))),
				   63);
		Class115.anInt2185 = 30;
		Class102.method1549(true, 118);
		Class37.method325(28028);
	    } else if ((Class115.anInt2185 ^ 0xffffffff) == -31) {
		Class33_Sub2.method302
		    (new Stream(Class67_Sub8.aClass9_2966.method116
				      (127, Class120.aRSString_2292,
				       (Class114.aClass67_Sub5_Sub6_2155
					.aRSString_4553))),
		     -1276586906);
		Class115.anInt2185 = 40;
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 40) {
		Class96.method1506((byte) -82,
				   new Stream(Class67_Sub8
							.aClass9_2966.method116
						    (123,
						     (Class67_Sub1_Sub38
						      .aRSString_4421),
						     (Class114
						      .aClass67_Sub5_Sub6_2155
						      .aRSString_4553))));
		Class115.anInt2185 = 50;
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 50) {
		Class67_Sub5_Sub17.method992
		    (81, new Stream(Class67_Sub8.aClass9_2966.method116
					  (118, Class76.aRSString_1583,
					   (Class114.aClass67_Sub5_Sub6_2155
					    .aRSString_4553))));
		Class115.anInt2185 = 60;
		Class102.method1549(true, -124);
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 60) {
		if (!Class67_Sub8.aClass9_2966.method108
		     (Class67_Sub1_Sub27.method744((new RSString[]
						    { (Class114
						       .aClass67_Sub5_Sub6_2155
						       .aRSString_4553),
						      (Canvas_Sub1
						       .aRSString_60) }),
						   -97),
		      0))
		    Class68.aClass72_1369 = new Class72(0);
		else {
		    if (!Class67_Sub8.aClass9_2966.method105
			 (256,
			  (Class67_Sub1_Sub27.method744
			   ((new RSString[]
			     { Class114.aClass67_Sub5_Sub6_2155.aRSString_4553,
			       Canvas_Sub1.aRSString_60 }),
			    -104))))
			return;
		    Class68.aClass72_1369
			= Class61.method555(12447,
					    (Class67_Sub1_Sub27.method744
					     ((new RSString[]
					       { (Class114
						  .aClass67_Sub5_Sub6_2155
						  .aRSString_4553),
						 Canvas_Sub1.aRSString_60 }),
					      -101)),
					    Class67_Sub8.aClass9_2966);
		}
		Class115.anInt2185 = 70;
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 70) {
		Class67_Sub16.aSprite_3093
		    = new Sprites(11, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 73;
		Class102.method1549(true, -125);
		Class37.method325(28028);
	    } else if ((Class115.anInt2185 ^ 0xffffffff) == -74) {
		Class131_Sub4.aSprite_3650
		    = new Sprites(12, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 76;
		Class102.method1549(true, 11);
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 76) {
		Class55_Sub2.aSprite_2799
		    = new Sprites(14, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 79;
		Class102.method1549(true, -127);
		Class37.method325(28028);
	    } else if ((Class115.anInt2185 ^ 0xffffffff) == -80) {
		Class108.aSprite_2076
		    = new Sprites(17, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 82;
		Class102.method1549(true, -122);
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 82) {
		Class67_Sub1_Sub23.aSprite_4186
		    = new Sprites(19, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 85;
		Class102.method1549(true, 126);
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 85) {
		Class67_Sub26.aSprite_3290
		    = new Sprites(22, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 88;
		Class102.method1549(true, 68);
		Class37.method325(28028);
	    } else if (Class115.anInt2185 == 88) {
		Class131_Sub5.aSprite_3686
		    = new Sprites(26, true, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 91;
		Class102.method1549(true, 122);
		Class37.method325(28028);
	    } else {
		Class57.aSprite_1112
		    = new Sprites(30, arg0, Class67_Sub5_Sub12.aCanvas4698);
		Class115.anInt2185 = 100;
		Class102.method1549(true, -122);
		Class37.method325(28028);
		System.gc();
	    }
	}
    }
    
    public boolean method883(boolean arg0, RSString arg1) {
	anInt4592++;
	if (aClass92_4590 == null)
	    return false;
	if (aClass92_4572 == null)
	    method880((byte) 127);
	if (arg0 != true)
	    aClass92_4572 = null;
	for (Class67_Sub21 class67_sub21
		 = ((Class67_Sub21)
		    aClass92_4572.method1489((byte) -19, arg1.method504(124)));
	     class67_sub21 != null;
	     class67_sub21
		 = (Class67_Sub21) aClass92_4572.method1477((byte) -75)) {
	    if (class67_sub21.aRSString_3173.method519((byte) -113, arg1))
		return true;
	}
	return false;
    }
    
    public static void method884(int arg0, Stream arg1) {
	anInt4586++;
	int i = arg1.method1070(-116);
	Class96.aClass95Array1915 = new Class95[i];
	int i_20_ = 89 % ((35 - arg0) / 52);
	for (int i_21_ = 0; i > i_21_; i_21_++) {
	    Class96.aClass95Array1915[i_21_] = new Class95();
	    Class96.aClass95Array1915[i_21_].anInt1903 = arg1.method1070(-71);
	    Class96.aClass95Array1915[i_21_].aRSString_1911
		= arg1.method1091(true);
	}
	Class102.anInt2003 = arg1.method1070(-76);
	Class28.anInt645 = arg1.method1070(-100);
	Class67_Sub6.anInt2873 = arg1.method1070(-126);
	Class96.aClass70_Sub1Array1920
	    = new Class70_Sub1[1 + -Class102.anInt2003 + Class28.anInt645];
	for (int i_22_ = 0;
	     (Class67_Sub6.anInt2873 ^ 0xffffffff) < (i_22_ ^ 0xffffffff);
	     i_22_++) {
	    int i_23_ = arg1.method1070(-46);
	    Class70_Sub1 class70_sub1
		= Class96.aClass70_Sub1Array1920[i_23_] = new Class70_Sub1();
	    class70_sub1.anInt1400 = arg1.readByte((byte) 105);
	    class70_sub1.anInt1408 = arg1.readInt((byte) 127);
	    class70_sub1.anInt3365 = i_23_ - -Class102.anInt2003;
	    class70_sub1.aRSString_3367 = arg1.method1091(true);
	    class70_sub1.aRSString_3372 = arg1.method1091(true);
	}
	Class67_Sub1_Sub23.anInt4187 = arg1.readInt((byte) 127);
	Class67_Sub1_Sub27.aBoolean4238 = true;
    }
    
    public void method885(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) -45);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method887(i, arg0, (byte) 13);
	}
	int i = 22 / ((-55 - arg1) / 47);
	anInt4580++;
    }
    
    public static Class28 method886(int arg0, SignLink arg1, int arg2, int arg3,
				    Component arg4) {
	try {
	    anInt4585++;
	    if ((Class89.anInt1833 ^ 0xffffffff) == -1)
		throw new IllegalStateException();
	    if ((arg2 ^ 0xffffffff) > -1 || arg2 >= 2)
		throw new IllegalArgumentException();
	    if ((arg0 ^ 0xffffffff) > -257)
		arg0 = 256;
	    try {
		Class28 class28
		    = (Class28) Class.forName("Class28_Sub2").newInstance();
		if (arg3 != -9634)
		    return null;
		class28.anInt683 = arg0;
		class28.anIntArray651
		    = new int[256 * (Class25.aBoolean605 ? 2 : 1)];
		class28.method272(arg4);
		class28.anInt675 = (~0x3ff & arg0) + 1024;
		if ((class28.anInt675 ^ 0xffffffff) < -16385)
		    class28.anInt675 = 16384;
		class28.method269(class28.anInt675);
		if ((Class15.anInt461 ^ 0xffffffff) < -1
		    && Class67_Sub5.aClass78_2865 == null) {
		    Class67_Sub5.aClass78_2865 = new Class78();
		    Class67_Sub5.aClass78_2865.aSignLink_1596 = arg1;
		    arg1.method404(2, Class67_Sub5.aClass78_2865,
				   Class15.anInt461);
		}
		if (Class67_Sub5.aClass78_2865 != null) {
		    if (Class67_Sub5.aClass78_2865.aClass28Array1607[arg2]
			!= null)
			throw new IllegalArgumentException();
		    Class67_Sub5.aClass78_2865.aClass28Array1607[arg2]
			= class28;
		}
		return class28;
	    } catch (Throwable throwable) {
		try {
		    Class28_Sub1 class28_sub1 = new Class28_Sub1(arg1, arg2);
		    class28_sub1.anInt683 = arg0;
		    class28_sub1.anIntArray651
			= new int[256 * (Class25.aBoolean605 ? 2 : 1)];
		    class28_sub1.method272(arg4);
		    class28_sub1.anInt675 = 16384;
		    class28_sub1.method269(class28_sub1.anInt675);
		    if (Class15.anInt461 > 0
			&& Class67_Sub5.aClass78_2865 == null) {
			Class67_Sub5.aClass78_2865 = new Class78();
			Class67_Sub5.aClass78_2865.aSignLink_1596 = arg1;
			arg1.method404(2, Class67_Sub5.aClass78_2865,
				       Class15.anInt461);
		    }
		    if (Class67_Sub5.aClass78_2865 != null) {
			if (Class67_Sub5.aClass78_2865.aClass28Array1607[arg2]
			    != null)
			    throw new IllegalArgumentException();
			Class67_Sub5.aClass78_2865.aClass28Array1607[arg2]
			    = class28_sub1;
		    }
		    return class28_sub1;
		} catch (Throwable throwable_24_) {
		    return new Class28();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("lg.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method887(int arg0, Stream arg1, byte arg2) {
	anInt4573++;
	if (arg2 == 13) {
	    if (arg0 == 1)
		anInt4587 = arg1.readByte((byte) -125);
	    else if (arg0 != 2) {
		if ((arg0 ^ 0xffffffff) == -4)
		    aRSString_4578 = arg1.readRSString(arg2 + -14);
		else if (arg0 == 4)
		    anInt4596 = arg1.readInt((byte) 125);
		else if ((arg0 ^ 0xffffffff) == -6 || arg0 == 6) {
		    int i = arg1.readUShort(-2386);
		    aClass92_4590
			= new Class92(Class67_Sub1_Sub31.method765(113, i));
		    for (int i_25_ = 0; i > i_25_; i_25_++) {
			int i_26_ = arg1.readInt((byte) 127);
			Class67 class67;
			if ((arg0 ^ 0xffffffff) != -6)
			    class67 = (new Class67_Sub19
				       (arg1.readInt((byte) 126)));
			else
			    class67 = new Class67_Sub29(arg1.readRSString(-1));
			aClass92_4590.method1488((byte) -89, class67,
						 (long) i_26_);
		    }
		}
	    } else
		anInt4595 = arg1.readByte((byte) -63);
	}
    }
    
    public int method888(int arg0, int arg1) {
	anInt4588++;
	if (aClass92_4590 == null)
	    return anInt4596;
	int i = -36 % ((arg1 - 53) / 51);
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_4590.method1489((byte) -22, (long) arg0));
	if (class67_sub19 == null)
	    return anInt4596;
	return class67_sub19.anInt3149;
    }
    
    public static void method889(int arg0, int arg1, int arg2, byte arg3,
				 int arg4) {
	Class118.anInt2231 = Class131_Sub5.anInt3656 * arg1 / arg4;
	Class67_Sub3.anInt2853 = Class67_Sub1_Sub13.anInt4031 * arg2 / arg0;
	Class67_Sub5_Sub16.anInt4776 = -1;
	Class33.anInt732 = -1;
	Class67_Sub26.method1295(98);
	anInt4597++;
	if (arg3 != -91)
	    aRSString_4576 = null;
    }
    
    public void method890(byte arg0) {
	anInt4582++;
	aClass92_4572 = new Class92(aClass92_4590.method1482(-1));
	Class67_Sub19 class67_sub19
	    = (Class67_Sub19) aClass92_4590.method1483((byte) 93);
	if (arg0 == 23) {
	    for (/**/; class67_sub19 != null;
		 class67_sub19
		     = (Class67_Sub19) aClass92_4590.method1480(11)) {
		Class67_Sub19 class67_sub19_27_
		    = new Class67_Sub19((int) class67_sub19.aLong1344);
		aClass92_4572.method1488((byte) -89, class67_sub19_27_,
					 (long) class67_sub19.anInt3149);
	    }
	}
    }
    
    public static void method891(RSString arg0, RSString arg1, int arg2,
				 int arg3) {
	try {
	    anInt4581++;
	    Class67_Sub1_Sub5.anInt3880 = arg2;
	    Class67_Sub5_Sub5.aRSString_4520 = arg0;
	    Class67_Sub5_Sub5.aRSString_4519 = arg1;
	    if (Class67_Sub5_Sub5.aRSString_4520
		    .method519((byte) -96, Class67_Sub5_Sub5.aRSString_4523)
		|| Class67_Sub5_Sub5.aRSString_4519
		       .method519((byte) -55, Class67_Sub5_Sub5.aRSString_4523))
		Class28.anInt652 = 3;
	    else if ((Class67_Sub23.anInt3202 ^ 0xffffffff) != 0)
		Class61.method553(0);
	    else {
		Class28.anInt652 = -3;
		Class67_Sub5_Sub12.anInt4695 = 1;
		RuntimeException_Sub1.anInt2613 = 0;
		Class55.anInt1085 = 0;
		Stream Stream = new Stream(128);
		Stream.addByte((byte) 4, 10);
		Stream.addUShort(16711680,
					(int) (99999.0 * Math.random()));
		Stream.addUShort(16711680, 530);
		Stream.writeLong(2, Class67_Sub5_Sub5.aRSString_4520
					       .method501((byte) -16));
		Stream.addInt((int) (99999999D * Math.random()),
					121);
		Stream.writeRSString(Class67_Sub5_Sub5.aRSString_4519,
					(byte) 0);
		Stream.addInt((int) (99999999D * Math.random()),
					118);
		Stream.doKeys(Class14.aBigInteger444, (byte) 108,
					Class87.aBigInteger1802);
		Class70_Sub1.outStream.currentOffset = arg3;
		Class70_Sub1.outStream.addByte((byte) 4, 210);
		Class70_Sub1.outStream
		    .addByte((byte) 4, Stream.currentOffset);
		Class70_Sub1.outStream.writeBytes
		    (arg3 ^ 0x7d, Stream.buffer,
		     Stream.currentOffset, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("lg.H("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public RSString method892(int arg0, int arg1) {
	anInt4583++;
	if (arg0 <= 28)
	    return null;
	if (aClass92_4590 == null)
	    return aRSString_4578;
	Class67_Sub29 class67_sub29
	    = ((Class67_Sub29)
	       aClass92_4590.method1489((byte) -63, (long) arg1));
	if (class67_sub29 == null)
	    return aRSString_4578;
	return class67_sub29.musicName;
    }
    
    public static void method893(int arg0) {
	aRSString_4584 = null;
	aByteArrayArrayArray4571 = null;
	aRSString_4576 = null;
	if (arg0 != 40)
	    method881((byte) -103, -95);
	aRSString_4579 = null;
    }
    
    public static void method894(int arg0, int arg1) {
	anInt4593++;
	Class67_Sub5_Sub7.anInt4562 = 1000 / arg0;
	if (arg1 != 14210)
	    aRSString_4576 = null;
    }
    
    public boolean method895(int arg0, int arg1) {
	anInt4591++;
	if (aClass92_4590 == null)
	    return false;
	if (aClass92_4572 == null)
	    method890((byte) 23);
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_4572.method1489((byte) -29, (long) arg1));
	if (class67_sub19 == null)
	    return false;
	if (arg0 != -1)
	    method886(-17, null, 77, -49, null);
	return true;
    }
    
    static {
	aRSString_4576 = Class134.method1914("(U5", (byte) 45);
    }
}
