/* Class70_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

public class Class70_Sub1 extends Class70
{
    public static int anInt3362;
    public static int anInt3363;
    public static PacketStream outStream = new PacketStream(5000);
    public int anInt3365;
    public static int anInt3366;
    public RSString aRSString_3367;
    public static int anInt3368;
    public static int anInt3369;
    public static int anInt3370;
    public static int anInt3371 = 0;
    public RSString aRSString_3372;
    public static RSString aRSString_3373
	= Class134.method1914("(U2", (byte) 113);
    public static int anInt3374 = 0;
    /*synthetic*/ public static Class aClass3375;
    
    public static void method1336(int arg0) {
	try {
	    Method method = (aClass3375 != null ? aClass3375
			     : (aClass3375 = method1342("java.lang.Runtime")))
				.getMethod("maxMemory", new Class[0]);
	    if (method != null) {
		try {
		    Runtime runtime = Runtime.getRuntime();
		    Long var_long = (Long) method.invoke(runtime);//, null);
		    Class122.anInt2307
			= 1 + (int) (var_long.longValue() / 1048576L);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    if (arg0 <= 21)
		method1339(90);
	} catch (Exception exception) {
	    /* empty */
	}
	anInt3366++;
    }
    
    public static void method1337(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	anInt3362++;
	if (arg0 != 2047)
	    aRSString_3373 = null;
	if (arg1 >= 0 && arg4 >= 0 && (arg1 ^ 0xffffffff) > -104
	    && (arg4 ^ 0xffffffff) > -104) {
	    if (arg7 == 0) {
		Class58 class58 = Class67_Sub19.method1263(arg6, arg1, arg4);
		if (class58 != null) {
		    int i
			= 0x7fffffff & (int) (class58.aLong1118 >>> 941559456);
		    if (arg5 != 2)
			class58.aClass131_1121
			    = new Class131_Sub5(i, arg5, arg2, arg6, arg1,
						arg4, arg3, false,
						class58.aClass131_1121);
		    else {
			class58.aClass131_1121
			    = new Class131_Sub5(i, 2, arg2 + 4, arg6, arg1,
						arg4, arg3, false,
						class58.aClass131_1121);
			class58.aClass131_1115
			    = new Class131_Sub5(i, 2, arg2 + 1 & 0x3, arg6,
						arg1, arg4, arg3, false,
						class58.aClass131_1115);
		    }
		}
	    }
	    if (arg7 == 1) {
		Class94 class94
		    = Class67_Sub1_Sub16.method684(arg6, arg1, arg4);
		if (class94 != null) {
		    int i = (0x7fffffff
			     & (int) (class94.aLong1886 >>> 2090472800));
		    if ((arg5 ^ 0xffffffff) != -5
			&& (arg5 ^ 0xffffffff) != -6) {
			if (arg5 != 6) {
			    if (arg5 == 7)
				class94.aClass131_1894
				    = new Class131_Sub5(i, 4,
							(0x3 & 2 + arg2) - -4,
							arg6, arg1, arg4, arg3,
							false,
							(class94
							 .aClass131_1894));
			    else if (arg5 == 8) {
				class94.aClass131_1894
				    = new Class131_Sub5(i, 4, arg2 + 4, arg6,
							arg1, arg4, arg3,
							false,
							(class94
							 .aClass131_1894));
				class94.aClass131_1896
				    = new Class131_Sub5(i, 4,
							(2 + arg2 & 0x3) - -4,
							arg6, arg1, arg4, arg3,
							false,
							(class94
							 .aClass131_1896));
			    }
			} else
			    class94.aClass131_1894
				= new Class131_Sub5(i, 4, arg2 + 4, arg6, arg1,
						    arg4, arg3, false,
						    class94.aClass131_1894);
		    } else
			class94.aClass131_1894
			    = new Class131_Sub5(i, 4, arg2, arg6, arg1, arg4,
						arg3, false,
						class94.aClass131_1894);
		}
	    }
	    if ((arg7 ^ 0xffffffff) == -3) {
		Class36 class36
		    = Class67_Sub1_Sub23.method729(arg6, arg1, arg4);
		if ((arg5 ^ 0xffffffff) == -12)
		    arg5 = 10;
		if (class36 != null)
		    class36.aClass131_790
			= new Class131_Sub5((0x7fffffff
					     & (int) (class36.aLong785
						      >>> -1133369824)),
					    arg5, arg2, arg6, arg1, arg4, arg3,
					    false, class36.aClass131_790);
	    }
	    if (arg7 == 3) {
		Class104 class104
		    = Class67_Sub5_Sub13.method964(arg6, arg1, arg4);
		if (class104 != null)
		    class104.aClass131_2034
			= new Class131_Sub5(((int) (class104.aLong2035
						    >>> -1112645856)
					     & 0x7fffffff),
					    22, arg2, arg6, arg1, arg4, arg3,
					    false, class104.aClass131_2034);
	    }
	}
    }
    
    public Class95 method1338(int arg0) {
	anInt3369++;
	if (arg0 != 2047)
	    return null;
	return Class96.aClass95Array1915[anInt1400];
    }
    
    public static void method1339(int arg0) {
	if (arg0 >= 18) {
	    aRSString_3373 = null;
	    outStream = null;
	}
    }
    
    public static void playerUpdatePackets(int arg0) {
	anInt3368++;
	if (arg0 <= 59)
	    aRSString_3373 = null;
	Class54.aPacketStream_1069.initBitAccess(-85);
	int i = Class54.aPacketStream_1069.readBits((byte) 9, 1); //is update required = bit 1.
	
	if (i != 0) { //if bit 1 set to 1.. (update required) you can do then alot of things. everything in this nested statement
	    int i_0_ = Class54.aPacketStream_1069.readBits((byte) 9, 2); //command bit = bit 2.

	    if (i_0_ == 0) //(2, 0) = finish
		Class61.anIntArray1142[Class126_Sub2.anInt3439++] = 2047;
	    else if (i_0_ == 1) { //(2, 1) means read bit 3. aka player primary sprite
		int i_1_ = Class54.aPacketStream_1069.readBits((byte) 9, 3); //primary sprite.
		Class122.aClass131_Sub7_Sub2_2309.method1886(i_1_, 1, 3);

		int i_2_ = Class54.aPacketStream_1069.readBits((byte) 9, 1); //is update required.. (1,1) then finish

		if (i_2_ == 1)
		    Class61.anIntArray1142[Class126_Sub2.anInt3439++] = 2047; //like said above (1,1) = finish.
	    } else if (i_0_ == 2) { //(2, 2) means read (1,1)  which means update both sprites.
		if (Class54.aPacketStream_1069.readBits((byte) 9, 1)  == 1) { //it must be  bit(1,1) if it's bit(1,0 then read bit(3, primary sprite)
		    int i_3_ = Class54.aPacketStream_1069.readBits((byte) 9, 3); //primary sprite.
		    Class122.aClass131_Sub7_Sub2_2309.method1886(i_3_, 2, 3);
		    
		    int i_4_ = Class54.aPacketStream_1069.readBits((byte) 9, 3); //secondary sprite.
		    Class122.aClass131_Sub7_Sub2_2309.method1886(i_4_, 2, 3);
		} else {
		    int i_5_ = Class54.aPacketStream_1069.readBits((byte) 9,  3); //if (2, 2), (1,0) == do unknown.
		    Class122.aClass131_Sub7_Sub2_2309.method1886(i_5_, 0, 3);
		}
		int i_6_ = Class54.aPacketStream_1069.readBits((byte) 9, 1); //is update required? if (1,1) then finish.

		if (i_6_ == 1)
		    Class61.anIntArray1142[Class126_Sub2.anInt3439++] = 2047;
	    } else if (i_0_ == 3) { //(2, 3) teleport
		int i_7_ = Class54.aPacketStream_1069.readBits((byte) 9, 7); //bit 7 LocalY, from LastReigon
		int i_8_ = Class54.aPacketStream_1069.readBits((byte) 9, 1); //bit 1 didTelport flag?
		Canvas_Sub1.anInt59 = Class54.aPacketStream_1069.readBits((byte) 9, 2); //bit 2 get Z coordinate (height)
		int i_9_ = Class54.aPacketStream_1069.readBits((byte) 9, 1); //bit 1 is update required, if 1 = then finish
		
		if ((i_9_ ^ 0xffffffff) == -2) // = 1
		    Class61.anIntArray1142[Class126_Sub2.anInt3439++] = 2047;
		int i_10_ = Class54.aPacketStream_1069.readBits((byte) 9, 7); //bit 7 LocalX from LastReigon
		Class122.aClass131_Sub7_Sub2_2309.method1896(i_8_ == 1, i_7_, i_10_, 14508);
	    }
	}
    }
    
    public static void method1341(boolean arg0) {
	if (!(Class54.aFloat1075 < Class131.aFloat2430)) {
	    if (Class54.aFloat1075 > Class131.aFloat2430) {
		Class54.aFloat1075 -= (double) Class54.aFloat1075 / 30.0;
		if (Class131.aFloat2430 > Class54.aFloat1075)
		    Class54.aFloat1075 = Class131.aFloat2430;
		Class67_Sub26.method1295(98);
	    }
	} else {
	    Class54.aFloat1075 += (double) Class54.aFloat1075 / 30.0;
	    if (Class131.aFloat2430 < Class54.aFloat1075)
		Class54.aFloat1075 = Class131.aFloat2430;
	    Class67_Sub26.method1295(98);
	}
	if ((Class33.anInt732 ^ 0xffffffff) != 0
	    && Class67_Sub5_Sub16.anInt4776 != -1) {
	    int i = Class33.anInt732 + -Class67_Sub3.anInt2853;
	    if (i < 2 || i > 2)
		i >>= 4;
	    Class67_Sub3.anInt2853 = i + Class67_Sub3.anInt2853;
	    int i_11_ = -Class118.anInt2231 + Class67_Sub5_Sub16.anInt4776;
	    if (i_11_ < 2 || i_11_ > 2)
		i_11_ >>= 4;
	    Class118.anInt2231 = i_11_ + Class118.anInt2231;
	    if (i == 0 && (i_11_ ^ 0xffffffff) == -1) {
		Class33.anInt732 = -1;
		Class67_Sub5_Sub16.anInt4776 = -1;
	    }
	    Class67_Sub26.method1295(98);
	}
	anInt3370++;
	if (arg0 != true)
	    anInt3371 = 113;
    }
    
    /*synthetic*/ public static Class method1342(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
