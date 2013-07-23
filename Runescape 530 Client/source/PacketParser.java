/* PacketParser - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class PacketParser
{
	public static int[] iBuffer = new int[25];
    public static int anInt2101;
    public static boolean[] aBooleanArray2102;
    public static RSString aRSString_2103;
    public static RSString aRSString_2104;
    public static RSString aRSString_2105;
    public static RSString aRSString_2106
	= Class134.method1914("3D)2Softwarebibliothek gestartet)3",
			      (byte) 127);
    public static int anInt2107;
    public static Class67_Sub5_Sub10_Sub1 aClass67_Sub5_Sub10_Sub1_2108;
    public static int[] packetSizes
	= { -1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4,
	    7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0,
	    -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0,
	    -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0,
	    0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0,
	    -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0,
	    8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5,
	    0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0,
	    0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6,
	    0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5,
	    0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0,
	    -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0,
	    0, 3, 0, 0 };
    public static RSString aRSString_2110;
    public static RSString aRSString_2111;
    public static int anInt2112;
    public static Class9 aClass9_2113;
    public static int anInt2114;
    public static int[] anIntArray2115;
    public static int anInt2116;
    public static int[][] anIntArrayArray2117;
    public static RSString aRSString_2118;
    public static Class99 aClass99_2119;
    public static int anInt2120;
    public static int anInt2121;
    
    public static Class76 method1596(int arg0, int arg1) {
	if (arg1 != -28322)
	    return null;
	anInt2101++;
	Class76 class76
	    = (Class76) Class44.aClass136_909.method1924((long) arg0, false);
	if (class76 != null)
	    return class76;
	byte[] is
	    = Class140.aClass9_2551.method138(arg1 + -809584343,
					      Class120.method1660((arg1
								   ^ 0x5e09),
								  arg0),
					      Class52.method453(arg0,
								arg1 + 28195));
	class76 = new Class76();
	class76.anInt1534 = arg0;
	if (is != null)
	    class76.loadItems(new Stream(is), arg1 ^ 0x5415);
	class76.method1396(arg1 + 29090);
	if ((class76.anInt1521 ^ 0xffffffff) != 0)
	    class76.method1386((byte) -126,
			       method1596(class76.anInt1521, -28322),
			       method1596(class76.anInt1511, arg1));
	if (class76.anInt1535 != -1)
	    class76.method1387(method1596(class76.anInt1535, -28322),
			       method1596(class76.anInt1540, arg1), true);
	if (!Class11.aBoolean406 && class76.aBoolean1505) {
	    class76.aRSStringArray1528 = Class116.aRSStringArray2198;
	    class76.itemActions = Class89.aRSStringArray1837;
	    class76.aBoolean1568 = false;
	    class76.anInt1577 = 0;
	    class76.itemName = Class67_Sub5_Sub19.aRSString_4821;
	}
	Class44.aClass136_909.method1926((long) arg0, class76, (byte) -71);
	return class76;
    }
    
    public static boolean method1597(byte arg0) throws IOException {
	anInt2112++;
	if (Class41.aClass117_867 == null)
	    return false;
	int i = Class41.aClass117_867.method1626(124);
	if ((i ^ 0xffffffff) == -1)
	    return false;
	if (Class67_Sub1_Sub20.packetType == -1) { //Variable Length Packet
	    i--;
	    Class41.aClass117_867.method1629((byte) -115,
					     (Class54.aPacketStream_1069
					      .buffer),
					     0, 1);
	    Class54.aPacketStream_1069.currentOffset = 0;
	    Class67_Sub1_Sub20.packetType
		= Class54.aPacketStream_1069.method1096(-23542);
	    Class67_Sub5_Sub1.lastPacketSize
		= packetSizes[Class67_Sub1_Sub20.packetType];
	}
	if (Class67_Sub5_Sub1.lastPacketSize == -1) {
	    if ((i ^ 0xffffffff) >= -1)
		return false;
	    Class41.aClass117_867.method1629((byte) -115,
					     (Class54.aPacketStream_1069
					      .buffer),
					     0, 1);
	    Class67_Sub5_Sub1.lastPacketSize
		= 0xff & Class54.aPacketStream_1069.buffer[0];
	    i--;
	}
	if ((Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff) == 1) {
	    if (i <= 1)
		return false;
	    i -= 2;
	    Class41.aClass117_867.method1629((byte) -115,
					     (Class54.aPacketStream_1069
					      .buffer),
					     0, 2);
	    Class54.aPacketStream_1069.currentOffset = 0;
	    Class67_Sub5_Sub1.lastPacketSize
		= Class54.aPacketStream_1069.readUShort(-2386);
	}
	if (Class67_Sub5_Sub1.lastPacketSize > i)
	    return false;
	Class54.aPacketStream_1069.currentOffset = 0;
	Class41.aClass117_867.method1629((byte) -115,
					 (Class54.aPacketStream_1069
					  .buffer),
					 0, Class67_Sub5_Sub1.lastPacketSize);
	Class55_Sub3.anInt2815 = Class67_Sub1_Sub16.anInt4073;
	Class55_Sub2.anInt2805 = 0;
	Class67_Sub1_Sub16.anInt4073 = Class67_Sub1_Sub5.anInt3875;
	Class67_Sub1_Sub5.anInt3875 = Class67_Sub1_Sub20.packetType;
	if (Class67_Sub1_Sub20.packetType == 65) {
	    int i_0_ = Class54.aPacketStream_1069.readLEShort2((byte) -126);
	    int i_1_ = Class54.aPacketStream_1069.readByteC((byte) -80);
	    int i_2_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if (Class67_Sub1_Sub30.method757(i_0_, (byte) -128))
		Class67_Sub1_Sub19.method710(i_1_, i_2_, (byte) 54);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -71) {
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    if (RSString.method516(90, Class67_Sub1_Sub33.aRSString_4318)) {
		RSString RSString_3_
		    = RSString.method502(0, -5975,
					RSString.method514((byte) -128,
							  (Class129_Sub1
							   .aRSString_3498)));
		long l = RSString_3_.method501((byte) -16);
		boolean bool = false;
		for (int i_4_ = 0;
		     (Class90.anInt1847 ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		     i_4_++) {
		    if (l == Class103.aLongArray2025[i_4_]) {
			bool = true;
			break;
		    }
		}
		if (!bool && (Class117.anInt2224 ^ 0xffffffff) == -1)
		    Class87.method1465(true, client.aRSString_2742, RSString_3_,
				       4);
	    } else if (RSString.method516(90, Class123.aRSString_2313)) {
		boolean bool = false;
		RSString RSString_5_
		    = RSString.method502(0, -5975,
					RSString.method514((byte) -128,
							  (Class129_Sub1
							   .aRSString_3498)));
		long l = RSString_5_.method501((byte) -16);
		for (int i_6_ = 0;
		     (i_6_ ^ 0xffffffff) > (Class90.anInt1847 ^ 0xffffffff);
		     i_6_++) {
		    if ((Class103.aLongArray2025[i_6_] ^ 0xffffffffffffffffL)
			== (l ^ 0xffffffffffffffffL)) {
			bool = true;
			break;
		    }
		}
		if (!bool && Class117.anInt2224 == 0) {
		    RSString RSString_7_
			= (RSString.method502
			   (RSString.method514((byte) -128,
					      Class129_Sub1.aRSString_3498) + 1,
			    -5975, -9 + RSString.method531((byte) 76)));
		    Class87.method1465(true, RSString_7_, RSString_5_, 8);
		}
	    } else if (!RSString.method516(90,
					  Class67_Sub1_Sub34.aRSString_4335)) {
		if (RSString.method516(90, Class67_Sub1_Sub17.aRSString_4099)) {
		    RSString RSString_8_
			= (RSString.method502
			   (0, -5975,
			    RSString.method514((byte) -128, (Class67_Sub1_Sub17
							    .aRSString_4099))));
		    Class87.method1465(true, RSString_8_,
				       Class67_Sub5_Sub5.aRSString_4523, 11);
		} else if (!RSString.method516(90, Class88.aRSString_1824)) {
		    if (!RSString.method516(90,
					   Class67_Sub1_Sub10.aRSString_3972)) {
			if (RSString.method516(90, (Class67_Sub1_Sub24
						   .aRSString_4208))) {
			    boolean bool = false;
			    RSString RSString_9_
				= (RSString.method502
				   (0, -5975,
				    RSString.method514((byte) -128,
						      (Class129_Sub1
						       .aRSString_3498))));
			    long l = RSString_9_.method501((byte) -16);
			    for (int i_10_ = 0;
				 ((Class90.anInt1847 ^ 0xffffffff)
				  < (i_10_ ^ 0xffffffff));
				 i_10_++) {
				if (Class103.aLongArray2025[i_10_] == l) {
				    bool = true;
				    break;
				}
			    }
			    if (!bool
				&& (Class117.anInt2224 ^ 0xffffffff) == -1)
				Class87.method1465(true,
						   (Class67_Sub5_Sub5
						    .aRSString_4523),
						   RSString_9_, 14);
			} else if (RSString.method516(90, (Canvas_Sub1
							  .aRSString_68))) {
			    RSString RSString_11_
				= (RSString.method502
				   (0, -5975,
				    RSString.method514((byte) -128,
						      (Class129_Sub1
						       .aRSString_3498))));
			    long l = RSString_11_.method501((byte) -16);
			    boolean bool = false;
			    for (int i_12_ = 0;
				 ((Class90.anInt1847 ^ 0xffffffff)
				  < (i_12_ ^ 0xffffffff));
				 i_12_++) {
				if ((l ^ 0xffffffffffffffffL)
				    == (Class103.aLongArray2025[i_12_]
					^ 0xffffffffffffffffL)) {
				    bool = true;
				    break;
				}
			    }
			    if (!bool
				&& (Class117.anInt2224 ^ 0xffffffff) == -1)
				Class87.method1465(true,
						   (Class67_Sub5_Sub5
						    .aRSString_4523),
						   RSString_11_, 15);
			} else if (RSString.method516(90, (Class67_Sub9
							  .aRSString_2973))) {
			    RSString RSString_13_
				= (RSString.method502
				   (0, -5975,
				    RSString.method514((byte) -128,
						      (Class129_Sub1
						       .aRSString_3498))));
			    long l = RSString_13_.method501((byte) -16);
			    boolean bool = false;
			    for (int i_14_ = 0; Class90.anInt1847 > i_14_;
				 i_14_++) {
				if ((l ^ 0xffffffffffffffffL)
				    == (Class103.aLongArray2025[i_14_]
					^ 0xffffffffffffffffL)) {
				    bool = true;
				    break;
				}
			    }
			    if (!bool
				&& (Class117.anInt2224 ^ 0xffffffff) == -1)
				Class87.method1465(true,
						   (Class67_Sub5_Sub5
						    .aRSString_4523),
						   RSString_13_, 16);
			} else if (RSString.method516(90,
						     Class37.aRSString_805)) {
			    RSString RSString_15_
				= (RSString.method502
				   (0, -5975,
				    RSString.method514((byte) -128,
						      (Class129_Sub1
						       .aRSString_3498))));
			    long l = RSString_15_.method501((byte) -16);
			    boolean bool = false;
			    for (int i_16_ = 0; i_16_ < Class90.anInt1847;
				 i_16_++) {
				if (Class103.aLongArray2025[i_16_] == l) {
				    bool = true;
				    break;
				}
			    }
			    if (!bool
				&& (Class117.anInt2224 ^ 0xffffffff) == -1) {
				RSString RSString_17_
				    = (RSString.method502
				       ((RSString.method514((byte) -128,
							   (Class129_Sub1
							    .aRSString_3498))
					 + 1),
					-5975,
					RSString.method531((byte) -107) + -9));
				Class87.method1465(true, RSString_17_,
						   RSString_15_, 21);
			    }
			} else
			    Class87.method1465(true, RSString,
					       Class67_Sub5_Sub5.aRSString_4523,
					       0);
		    } else {
			RSString RSString_18_
			    = (RSString.method502
			       (0, -5975,
				RSString.method514((byte) -128,
						  (Class67_Sub1_Sub10
						   .aRSString_3972))));
			if ((Class117.anInt2224 ^ 0xffffffff) == -1)
			    Class87.method1465(true, RSString_18_,
					       Class67_Sub5_Sub5.aRSString_4523,
					       13);
		    }
		} else {
		    RSString RSString_19_
			= (RSString.method502
			   (0, -5975,
			    RSString.method514((byte) -128,
					      Class88.aRSString_1824)));
		    if ((Class117.anInt2224 ^ 0xffffffff) == -1)
			Class87.method1465(true, RSString_19_,
					   Class67_Sub5_Sub5.aRSString_4523,
					   12);
		}
	    } else {
		RSString RSString_20_
		    = RSString.method502(0, -5975,
					RSString.method514((byte) -128,
							  (Class129_Sub1
							   .aRSString_3498)));
		long l = RSString_20_.method501((byte) -16);
		boolean bool = false;
		for (int i_21_ = 0;
		     (i_21_ ^ 0xffffffff) > (Class90.anInt1847 ^ 0xffffffff);
		     i_21_++) {
		    if (Class103.aLongArray2025[i_21_] == l) {
			bool = true;
			break;
		    }
		}
		if (!bool && Class117.anInt2224 == 0)
		    Class87.method1465(true, Class67_Sub5_Sub5.aRSString_4523,
				       RSString_20_, 10);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -56) { //updateClan
	    Class67_Sub1_Sub24.anInt4191 = Class11.anInt409;
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    if ((l ^ 0xffffffffffffffffL) == -1L) {
		Class55.aRSString_1090 = null;
		Class69.aClass67_Sub25Array1380 = null;
		Class67_Sub1_Sub3.aRSString_3844 = null;
		Class67_Sub1_Sub20.packetType = -1;
		Class67_Sub1_Sub32.anInt4296 = 0;
		return true;
	    }
	    long l_22_ = Class54.aPacketStream_1069.readLong(-9426);
	    Class67_Sub1_Sub3.aRSString_3844
		= Class67_Sub17.method1250((byte) -72, l_22_);
	    Class55.aRSString_1090 = Class67_Sub17.method1250((byte) -72, l);
	    Class88.aByte1821
		= Class54.aPacketStream_1069.readByte2((byte) 1);
	    int i_23_ = Class54.aPacketStream_1069.readByte((byte) 89);
	    if ((i_23_ ^ 0xffffffff) == -256) {
		Class67_Sub1_Sub20.packetType = -1;
		return true;
	    }
	    Class67_Sub1_Sub32.anInt4296 = i_23_;
	    Class67_Sub25[] class67_sub25s = new Class67_Sub25[100];
	    for (int i_24_ = 0;
		 ((i_24_ ^ 0xffffffff)
		  > (Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff));
		 i_24_++) {
		class67_sub25s[i_24_] = new Class67_Sub25();
		class67_sub25s[i_24_].aLong1344
		    = Class54.aPacketStream_1069.readLong(-9426);
		class67_sub25s[i_24_].aRSString_3249
		    = Class67_Sub17.method1250((byte) -72,
					       (class67_sub25s[i_24_]
						.aLong1344));
		class67_sub25s[i_24_].anInt3255
		    = Class54.aPacketStream_1069.readUShort(-2386);
		class67_sub25s[i_24_].aByte3247
		    = Class54.aPacketStream_1069.readByte2((byte) 1);
		class67_sub25s[i_24_].aRSString_3252
		    = Class54.aPacketStream_1069.readRSString(-1);
		if (class67_sub25s[i_24_].aLong1344 == Class119.aLong2248)
		    Class136.aByte2497 = class67_sub25s[i_24_].aByte3247;
	    }
	    boolean bool = false;
	    int i_25_ = Class67_Sub1_Sub32.anInt4296;
	    while ((i_25_ ^ 0xffffffff) < -1) {
		bool = true;
		i_25_--;
		for (int i_26_ = 0;
		     (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
		    if (((class67_sub25s[i_26_].aRSString_3249.method537
			  (12, class67_sub25s[i_26_ - -1].aRSString_3249))
			 ^ 0xffffffff)
			< -1) {
			Class67_Sub25 class67_sub25 = class67_sub25s[i_26_];
			class67_sub25s[i_26_] = class67_sub25s[i_26_ + 1];
			bool = false;
			class67_sub25s[1 + i_26_] = class67_sub25;
		    }
		}
		if (bool)
		    break;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    Class69.aClass67_Sub25Array1380 = class67_sub25s;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 105) { //sendItems(int interfaceId, int childId, int type, Item[] inventory)
	    int i_27_ = Class54.aPacketStream_1069.readInt((byte) 125);//(interfaceId << 16) + childId
	    int i_28_ = Class54.aPacketStream_1069.readUShort(-2386);	//type
	    if ((i_27_ ^ 0xffffffff) > 69999)
		i_28_ += 32768;
	    Class7 class7;
	    if (i_27_ < 0)
		class7 = null;
	    else
		class7 = Class3.method69((byte) 110, i_27_);
	    if (class7 != null) {
		for (int i_29_ = 0; i_29_ < class7.anIntArray264.length;
		     i_29_++) {
		    class7.anIntArray264[i_29_] = 0;
		    class7.anIntArray253[i_29_] = 0;
		}
	    }
	    Class66.method602(false, i_28_);
	    int i_30_ = Class54.aPacketStream_1069.readUShort(-2386);	//ivnentory size packet
	    for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff);
		 i_31_++) {
		int i_32_ = Class54.aPacketStream_1069.readByteS(128);	//amount items.
		if ((i_32_ ^ 0xffffffff) == -256)
		    i_32_ = Class54.aPacketStream_1069.readInt((byte) 125); //amount bigger then 255
		int i_33_ = Class54.aPacketStream_1069.readUShort(-2386); //item Id.
		if (class7 != null && i_31_ < class7.anIntArray264.length) {
		    class7.anIntArray264[i_31_] = i_33_;
		    class7.anIntArray253[i_31_] = i_32_;
		}
		Class109.method1580(-1 + i_33_, i_28_, 52, i_32_, i_31_);
	    }
	    if (class7 != null)
		Class37.method326(class7, 107);
	    Class67_Sub1_Sub11.method666(1);
	    Class67_Sub1_Sub16_Sub1.anIntArray5101
		[Class75.method1379(31, Class67_Sub5_Sub2.anInt4472++)]
		= Class75.method1379(i_28_, 32767);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 187) {
	    int i_34_
		= Class54.aPacketStream_1069.readLEShort2((byte) -100);
	    int i_35_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_36_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (Class67_Sub1_Sub30.method757(i_35_, (byte) -128)) {
		Class67_Sub5_Sub4.anInt4504 = i_34_;
		Class67_Sub21.anInt3175 = i_36_;
		if (Class22.anInt530 == 2) {
		    Class67_Sub23.anInt3196 = Class67_Sub5_Sub4.anInt4504;
		    Class67_Sub1_Sub2.anInt3839 = Class67_Sub21.anInt3175;
		}
		Class103.method1559(0);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 4) {
	    int i_37_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if ((i_37_ ^ 0xffffffff) == -65536)
		i_37_ = -1;
	    Class98.method1516((byte) -84, i_37_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -209) {
	    int i_38_ = Class54.aPacketStream_1069.method1073(-16196);
	    int i_39_
		= Class54.aPacketStream_1069.readLEShort2((byte) -114);
	    if (i_39_ == 65535)
		i_39_ = -1;
	    Class67_Sub5_Sub1.method830(-47, i_39_, i_38_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 114) {
	    Class82.method1432(Class124.aSignLink_2335,
			       Class54.aPacketStream_1069,
			       Class67_Sub5_Sub1.lastPacketSize, 896);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -1) { //sendReceivedPrivateMessage
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    long l_40_
		= (long) Class54.aPacketStream_1069.readUShort(-2386);
	    long l_41_
		= (long) Class54.aPacketStream_1069.readThreeBytes(65280);
	    int i_42_ = Class54.aPacketStream_1069.readByte((byte) -78);
	    long l_43_ = (l_40_ << -347052768) - -l_41_;
	    boolean bool = false;
	while_28_:
	    do {
		for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -101; i_44_++) {
		    if (l_43_ == Class113.aLongArray2141[i_44_]) {
			bool = true;
			break while_28_;
		    }
		}
		if (i_42_ <= 1) {
		    if (Class78.aBoolean1602 && !Class23.aBoolean560
			|| Class67_Sub5_Sub16.aBoolean4783)
			bool = true;
		    else {
			for (int i_45_ = 0; i_45_ < Class90.anInt1847;
			     i_45_++) {
			    if ((Class103.aLongArray2025[i_45_]
				 ^ 0xffffffffffffffffL)
				== (l ^ 0xffffffffffffffffL)) {
				bool = true;
				break;
			    }
			}
		    }
		}
	    } while (false);
	    if (!bool && (Class117.anInt2224 ^ 0xffffffff) == -1) {
		Class113.aLongArray2141[Class124.anInt2327] = l_43_;
		Class124.anInt2327 = (Class124.anInt2327 - -1) % 100;
		RSString RSString
		    = (Class67_Sub5_Sub10.method925
		       (Class50.method434
			    (Class54.aPacketStream_1069, 119)
			    .method524((byte) 127)));
		if (i_42_ == 2 || (i_42_ ^ 0xffffffff) == -4)
		    Class87.method1465(true, RSString,
				       (Class67_Sub1_Sub27.method744
					(new RSString[] { Class95.aRSString_1904,
							 Class67_Sub17
							     .method1250
							     ((byte) -72, l)
							     .method500(0) },
					 -126)),
				       7);
		else if (i_42_ == 1)
		    Class87.method1465(true, RSString,
				       (Class67_Sub1_Sub27.method744
					((new RSString[]
					  { Class67_Sub25.aRSString_3254,
					    Class67_Sub17.method1250
						((byte) -72, l)
						.method500(0) }),
					 -128)),
				       7);
		else
		    Class87.method1465(true, RSString,
				       Class67_Sub17.method1250
					   ((byte) -72, l).method500(0),
				       3);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 73) { //sendNPCHead
	    int i_46_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_47_ = Class54.aPacketStream_1069.readLEInt(4);
	    int i_48_ = Class54.aPacketStream_1069.readLEShort2((byte) -51);
	    if (i_46_ == 65535)
		i_46_ = -1;
	    if (Class67_Sub1_Sub30.method757(i_48_, (byte) -128))
		Class28.method266(2, i_46_, -1, 100, i_47_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 164) {
	    int i_49_ = Class54.aPacketStream_1069.readInt1((byte) 106);
	    Class27.aClass31_628
		= Class124.aSignLink_2335.method407((byte) 26, i_49_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -28) { //newEarthquake
	    int i_50_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_51_ = Class54.aPacketStream_1069.readByte((byte) -15);
	    int i_52_ = Class54.aPacketStream_1069.readByte((byte) 82);
	    int i_53_ = Class54.aPacketStream_1069.readByte((byte) 94);
	    int i_54_ = Class54.aPacketStream_1069.readByte((byte) 124);
	    int i_55_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (Class67_Sub1_Sub30.method757(i_50_, (byte) -128)) {
		Class107.aBooleanArray2074[i_51_] = true;
		Class82.anIntArray1664[i_51_] = i_52_;
		Class44.anIntArray921[i_51_] = i_53_;
		Class83.anIntArray1673[i_51_] = i_54_;
		Class18.anIntArray2732[i_51_] = i_55_;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 84) { //possible moveChildInterface
	    int i_56_ = Class54.aPacketStream_1069.readLEInt(4);
	    int i_57_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    Class100.method1537(i_56_, 124, i_57_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -14) {
	    int i_58_ = Class54.aPacketStream_1069.readByteS(128);
	    int i_59_ = Class54.aPacketStream_1069.readByteA((byte) 94);
	    int i_60_ = Class54.aPacketStream_1069.readByte((byte) 90);
	    Canvas_Sub1.anInt59 = i_59_ >> -1461459359;
	    Class122.aClass131_Sub7_Sub2_2309.method1896((0x1 & i_59_) == 1,
							 i_60_, i_58_, 14508);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -146) { //sendWindowPane
	    int i_6166_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_6266_ = Class54.aPacketStream_1069.readByteA((byte) 95);
	    int i_6366_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
			    int i_61_ = 548;
	    int i_62_ = 0;//Class54.aPacketStream_1069.readByteA((byte) 95);
	    int i_63_ = 0;//Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if (Class67_Sub1_Sub30.method757(i_63_, (byte) -128)) {
		if (i_62_ == 2)
		    Class67_Sub1_Sub38.method806(25);
		Class54.anInt1080 = i_61_;
		Class11.method141(i_61_, 0);
		Class67_Sub10.method1116(false, false);
		Stream.method1059(Class54.anInt1080, (byte) -89);
		for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > -101; i_64_++)
		    OutputStream_Sub1.aBooleanArray96[i_64_] = true;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -210) {
	    if (Class54.anInt1080 != -1)
		Class67_Sub1_Sub3.method634((byte) 60, Class54.anInt1080, 0);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 192) { //setMinimapStatus
	    Class67_Sub1_Sub13.anInt4019
		= Class54.aPacketStream_1069.readByte((byte) -58);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 85) { //newSystemUpdate
	    Class144.anInt2596
		= Class54.aPacketStream_1069.readUShort(-2386) * 30;
	    Class67_Sub1_Sub20.packetType = -1;
	    Class86.anInt1763 = Class11.anInt409;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 154) {
	    int i_65_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_66_ = Class54.aPacketStream_1069.readByte((byte) 127);
	    int i_67_ = Class54.aPacketStream_1069.readByte((byte) 117);
	    int i_68_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_69_ = Class54.aPacketStream_1069.readByte((byte) 84);
	    int i_70_ = Class54.aPacketStream_1069.readByte((byte) -51);
	    if (Class67_Sub1_Sub30.method757(i_65_, (byte) -128))
		Class70.method1334(i_70_, i_66_, i_68_, i_69_, -67, i_67_,
				   true);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 37) {
	    int i_71_ = Class54.aPacketStream_1069.readByteA((byte) 116);
	    int i_72_ = Class54.aPacketStream_1069.readLEShort2((byte) 113);
	    Class100.method1537(i_71_, 125, i_72_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -45) { //sendPlayerOption
	    int i_73_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_74_ = Class54.aPacketStream_1069.readByte((byte) 83);
	    if ((i_73_ ^ 0xffffffff) == -65536)
		i_73_ = -1;
	    int i_75_ = Class54.aPacketStream_1069.readByte((byte) -31);
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    if ((i_75_ ^ 0xffffffff) <= -2 && i_75_ <= 8) {
		if (RSString.method526(123, Class63.aRSString_1169))
		    RSString = null;
		Class131_Sub7_Sub1.aRSStringArray5043[i_75_ + -1] = RSString;
		Class67_Sub1_Sub16.anIntArray4086[-1 + i_75_] = i_73_;
		Class67_Sub19.aBooleanArray3154[i_75_ + -1]
		    = (i_74_ ^ 0xffffffff) == -1;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 66) { //sendPlayerHead
	    int i_76_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_77_ = Class54.aPacketStream_1069.readInt1((byte) 106);
	    if (Class67_Sub1_Sub30.method757(i_76_, (byte) -128)) {
		int i_78_ = 0;
		if (Class122.aClass131_Sub7_Sub2_2309.aClass22_5065 != null)
		    i_78_ = Class122.aClass131_Sub7_Sub2_2309.aClass22_5065
				.method206(28544);
		Class28.method266(3, i_78_, -1, 100, i_77_);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -145) {
	    int i_79_ = Class54.aPacketStream_1069.readInt2((byte) 115);
	    Class7 class7 = Class3.method69((byte) 110, i_79_);
	    for (int i_80_ = 0;
		 ((i_80_ ^ 0xffffffff)
		  > (class7.anIntArray264.length ^ 0xffffffff));
		 i_80_++) {
		class7.anIntArray264[i_80_] = -1;
		class7.anIntArray264[i_80_] = 0;
	    }
	    Class37.method326(class7, 76);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 197) {	//setFriendsListStatus
	    Class67_Sub5.anInt2862
		= Class54.aPacketStream_1069.readByte((byte) 112);
	    Class128.anInt2376 = Class11.anInt409;
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -113) {
	    Class28.anInt673
		= Class54.aPacketStream_1069.readByte((byte) -23);
	    Class52.anInt1045
		= Class54.aPacketStream_1069.readByteC((byte) -80);
	    for (int i_81_ = Class28.anInt673; i_81_ < 8 + Class28.anInt673;
		 i_81_++) {
		for (int i_82_ = Class52.anInt1045;
		     ((i_82_ ^ 0xffffffff)
		      > (Class52.anInt1045 - -8 ^ 0xffffffff));
		     i_82_++) {
		    if ((Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			 [Canvas_Sub1.anInt59][i_81_][i_82_])
			!= null) {
			Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			    [Canvas_Sub1.anInt59][i_81_][i_82_]
			    = null;
			Class67_Sub11_Sub4.method1191(51, i_82_, i_81_);
		    }
		}
	    }
	    for (Class67_Sub6 class67_sub6 = (Class67_Sub6) Class67_Sub1_Sub39
								.aClass50_4441
								.method445(0);
		 class67_sub6 != null;
		 class67_sub6 = (Class67_Sub6) Class67_Sub1_Sub39
						   .aClass50_4441
						   .method432(0)) {
		if (class67_sub6.anInt2874 >= Class28.anInt673
		    && ((8 + Class28.anInt673 ^ 0xffffffff)
			< (class67_sub6.anInt2874 ^ 0xffffffff))
		    && Class52.anInt1045 <= class67_sub6.anInt2891
		    && ((class67_sub6.anInt2891 ^ 0xffffffff)
			> (8 + Class52.anInt1045 ^ 0xffffffff))
		    && Canvas_Sub1.anInt59 == class67_sub6.anInt2871)
		    class67_sub6.anInt2869 = 0;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 142) {
	    Class55_Sub1.method463(false, Class54.aPacketStream_1069
					      .readRSString(-1));
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -227) {	//sendConfig2
	    int i_83_ = Class54.aPacketStream_1069.readInt((byte) 127);
	    int i_84_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    PacketStream.method1100(10, i_84_, i_83_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -124) {
	    int i_85_ = Class54.aPacketStream_1069.readLEShort2((byte) 124);
	    int i_86_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    if (Class67_Sub1_Sub30.method757(i_86_, (byte) -128))
		Class67_Sub19.method1267(RSString, i_85_, true);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 217) { // setArrowOnEntity
	    int i_87_ = Class54.aPacketStream_1069.readByte((byte) -41);
	    int i_88_ = i_87_ >> -1400956730;
	    Class74 class74 = new Class74();
	    class74.anInt1491 = i_87_ & 0x3f;
	    class74.anInt1496
		= Class54.aPacketStream_1069.readByte((byte) -40);
	    if (class74.anInt1496 >= 0
		&& ((Class139.aClass67_Sub5_Sub19Array2524.length ^ 0xffffffff)
		    < (class74.anInt1496 ^ 0xffffffff))) {
		if ((class74.anInt1491 ^ 0xffffffff) != -2
		    && (class74.anInt1491 ^ 0xffffffff) != -11) {
		    if ((class74.anInt1491 ^ 0xffffffff) <= -3
			&& (class74.anInt1491 ^ 0xffffffff) >= -7) {
			if (class74.anInt1491 == 2) {
			    class74.anInt1492 = 64;
			    class74.anInt1494 = 64;
			}
			if (class74.anInt1491 == 3) {
			    class74.anInt1494 = 64;
			    class74.anInt1492 = 0;
			}
			if ((class74.anInt1491 ^ 0xffffffff) == -5) {
			    class74.anInt1492 = 128;
			    class74.anInt1494 = 64;
			}
			if (class74.anInt1491 == 5) {
			    class74.anInt1494 = 0;
			    class74.anInt1492 = 64;
			}
			if (class74.anInt1491 == 6) {
			    class74.anInt1494 = 128;
			    class74.anInt1492 = 64;
			}
			class74.anInt1491 = 2;
			class74.anInt1490 = Class54.aPacketStream_1069
						.readUShort(-2386);
			class74.anInt1486 = Class54.aPacketStream_1069
						.readUShort(-2386);
			class74.anInt1499 = Class54.aPacketStream_1069
						.readByte((byte) -113);
		    }
		} else {
		    class74.anInt1482
			= Class54.aPacketStream_1069.readUShort(-2386);
		    Class54.aPacketStream_1069.currentOffset += 3;
		}
		class74.anInt1489
		    = Class54.aPacketStream_1069.readUShort(-2386);
		if (class74.anInt1489 == 65535)
		    class74.anInt1489 = -1;
		Class136.aClass74Array2499[i_88_] = class74;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -231) {
	    Class52.anInt1045
		= Class54.aPacketStream_1069.readByteA((byte) 107);
	    Class28.anInt673 = Class54.aPacketStream_1069.readByteS(128);
	    while ((Class54.aPacketStream_1069.currentOffset ^ 0xffffffff)
		   > (Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff)) {
		Class67_Sub1_Sub20.packetType
		    = Class54.aPacketStream_1069.readByte((byte) 78);
		Class67_Sub22.method1278(64);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (arg0 <= 37)
	    aClass67_Sub5_Sub10_Sub1_2108 = null;
	if (Class67_Sub1_Sub20.packetType == 56) {
	    int i_89_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_90_ = Class54.aPacketStream_1069.readLEShort2((byte) 117);
	    int i_91_ = Class54.aPacketStream_1069.readInt1((byte) 106);
	    int i_92_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if ((i_91_ >> 1948808126 ^ 0xffffffff) == -1) {
		if (i_91_ >> 2042536925 == 0) {
		    if ((i_91_ >> 747108316 ^ 0xffffffff) != -1) {
			int i_93_ = i_91_ & 0xffff;
			Class131_Sub7_Sub2 class131_sub7_sub2;
			if ((i_93_ ^ 0xffffffff)
			    == (Class67_Sub17.anInt3102 ^ 0xffffffff))
			    class131_sub7_sub2
				= Class122.aClass131_Sub7_Sub2_2309;
			else
			    class131_sub7_sub2
				= (Class67_Sub5_Sub18
				   .aClass131_Sub7_Sub2Array4810[i_93_]);
			if (class131_sub7_sub2 != null) {
			    if ((i_92_ ^ 0xffffffff) == -65536)
				i_92_ = -1;
			    boolean bool = true;
			    if (i_92_ != -1
				&& class131_sub7_sub2.anInt3739 != -1
				&& (Class120.method1666((Class67_Sub1.method622
							 (-17177, i_92_)
							 .anInt1639),
							-32).anInt856
				    < (Class120.method1666
				       ((Class67_Sub1.method622
					 (-17177, class131_sub7_sub2.anInt3739)
					 .anInt1639),
					-32)
				       .anInt856)))
				bool = false;
			    if (bool) {
				class131_sub7_sub2.anInt3739 = i_92_;
				class131_sub7_sub2.anInt3745 = 0;
				class131_sub7_sub2.anInt3780 = 1;
				class131_sub7_sub2.anInt3760 = i_90_;
				if ((class131_sub7_sub2.anInt3739 ^ 0xffffffff)
				    == -65536)
				    class131_sub7_sub2.anInt3739 = -1;
				class131_sub7_sub2.anInt3712 = 0;
				class131_sub7_sub2.anInt3701
				    = i_89_ + Class67_Sub1_Sub9.anInt3952;
				if (class131_sub7_sub2.anInt3701
				    > Class67_Sub1_Sub9.anInt3952)
				    class131_sub7_sub2.anInt3745 = -1;
				if ((class131_sub7_sub2.anInt3739
				     ^ 0xffffffff) != 0
				    && (Class67_Sub1_Sub9.anInt3952
					== class131_sub7_sub2.anInt3701)) {
				    int i_94_ = (Class67_Sub1.method622
						 (-17177,
						  class131_sub7_sub2.anInt3739)
						 .anInt1639);
				    if (i_94_ != -1) {
					Class41 class41
					    = Class120.method1666(i_94_, -32);
					if (class41 != null
					    && class41.anIntArray855 != null)
					    OutputStream_Sub1.method58
						(class41,
						 class131_sub7_sub2.anInt3726,
						 -107,
						 class131_sub7_sub2.anInt3733,
						 (class131_sub7_sub2
						  == (Class122
						      .aClass131_Sub7_Sub2_2309)),
						 0);
				    }
				}
			    }
			}
		    }
		} else {
		    int i_95_ = i_91_ & 0xffff;
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_95_];
		    if (class131_sub7_sub1 != null) {
			boolean bool = true;
			if ((i_92_ ^ 0xffffffff) == -65536)
			    i_92_ = -1;
			if (i_92_ != -1 && class131_sub7_sub1.anInt3739 != -1
			    && (Class120.method1666((Class67_Sub1.method622
						     (-17177, i_92_)
						     .anInt1639),
						    -32).anInt856
				< (Class120.method1666
				   ((Class67_Sub1.method622
				     (-17177, class131_sub7_sub1.anInt3739)
				     .anInt1639),
				    -32)
				   .anInt856)))
			    bool = false;
			if (bool) {
			    class131_sub7_sub1.anInt3712 = 0;
			    class131_sub7_sub1.anInt3701
				= i_89_ + Class67_Sub1_Sub9.anInt3952;
			    class131_sub7_sub1.anInt3760 = i_90_;
			    class131_sub7_sub1.anInt3739 = i_92_;
			    class131_sub7_sub1.anInt3780 = 1;
			    class131_sub7_sub1.anInt3745 = 0;
			    if ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)
				> (class131_sub7_sub1.anInt3701 ^ 0xffffffff))
				class131_sub7_sub1.anInt3745 = -1;
			    if (((class131_sub7_sub1.anInt3739 ^ 0xffffffff)
				 != 0)
				&& (Class67_Sub1_Sub9.anInt3952
				    == class131_sub7_sub1.anInt3701)) {
				int i_96_
				    = (Class67_Sub1.method622
				       (-17177, class131_sub7_sub1.anInt3739)
				       .anInt1639);
				if ((i_96_ ^ 0xffffffff) != 0) {
				    Class41 class41
					= Class120.method1666(i_96_, -32);
				    if (class41 != null
					&& class41.anIntArray855 != null)
					OutputStream_Sub1.method58
					    (class41,
					     class131_sub7_sub1.anInt3726,
					     -118,
					     class131_sub7_sub1.anInt3733,
					     false, 0);
				}
			    }
			}
		    }
		}
	    } else {
		int i_97_ = (0x34bc8d23 & i_91_) >> 1153920060;
		int i_98_ = (i_91_ >> -380813586 & 0x3fff) - Class58.baseX;
		int i_99_ = -Class137.baseY + (0x3fff & i_91_);
		if ((i_98_ ^ 0xffffffff) <= -1 && i_99_ >= 0 && i_98_ < 104
		    && (i_99_ ^ 0xffffffff) > -105) {
		    i_99_ = 64 + 128 * i_99_;
		    i_98_ = 128 * i_98_ - -64;
		    ObjectDef class131_sub1
			= (new ObjectDef
			   (i_92_, i_97_, i_98_, i_99_,
			    -i_90_ + Class131_Sub5.method1826(i_97_, i_98_,
							      i_99_,
							      (byte) -97),
			    i_89_, Class67_Sub1_Sub9.anInt3952));
		    Class102.aClass50_2000.method436
			(new Class67_Sub5_Sub15(class131_sub1), false);
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 104
	    || Class67_Sub1_Sub20.packetType == 121
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -98
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -15
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -203
	    || Class67_Sub1_Sub20.packetType == 135			//createGroundItem2
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -18 //newStillGraphics
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -17 //sendProjectile
	    || Class67_Sub1_Sub20.packetType == 240 			//clearGroundItem
	    || Class67_Sub1_Sub20.packetType == 33			//createGroundItem
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -21	//newObjectAnimation
	    || Class67_Sub1_Sub20.packetType == 195			//removeObject
	    || (Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -180) { //createObject
	    Class67_Sub22.method1278(64);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 38) { //send skill level
	    Class67_Sub1_Sub11.method666(1);
	    int i_100_
		= Class54.aPacketStream_1069.readByteA((byte) 110);
	    int i_101_
		= Class54.aPacketStream_1069.readInt1((byte) 106);
	    int i_102_ = Class54.aPacketStream_1069.readByte((byte) 84);
	    Class83.anIntArray1682[i_102_] = i_101_;
	    Class30.anIntArray700[i_102_] = i_100_;
	    Class139.anIntArray2538[i_102_] = 1;
	    for (int i_103_ = 0; (i_103_ ^ 0xffffffff) > -99; i_103_++) {
		if ((Class67_Sub5_Sub19.anIntArray4818[i_103_] ^ 0xffffffff)
		    >= (i_101_ ^ 0xffffffff))
		    Class139.anIntArray2538[i_102_] = 2 + i_103_;
	    }
	    Class78.anIntArray1599
		[Class75.method1379(31, Class67_Sub1_Sub21.anInt4165++)]
		= i_102_;
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 128) {
	    for (int i_104_ = 0; i_104_ < Class137.anIntArray2504.length;
		 i_104_++) {
		if (Class137.anIntArray2504[i_104_]
		    != Class96.anIntArray1914[i_104_]) {
		    Class137.anIntArray2504[i_104_]
			= Class96.anIntArray1914[i_104_];
		    Class142.method1952(i_104_, -69);
		    Class61.anIntArray1135
			[Class75.method1379(Class67_Sub5_Sub15.anInt4749++,
					    31)]
			= i_104_;
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -142) {
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    int i_105_ = Class54.aPacketStream_1069.readUShort(-2386);
	    RSString RSString
		= Class11.method143(i_105_, -32769)
		      .method951(89, Class54.aPacketStream_1069);
	    Class66.method600(i_105_, RSString, null, 19, -1,
			      Class67_Sub17.method1250((byte) -72, l)
				  .method500(0));
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 36) { //animateInterface
	    int i_106_ = Class54.aPacketStream_1069.readInt2((byte) 35);
	    int i_107_ = Class54.aPacketStream_1069.readLEShort((byte) 84);
	    int i_108_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if (Class67_Sub1_Sub30.method757(i_108_, (byte) -128))
		Class55_Sub3.method474((byte) -119, i_107_, i_106_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -132) {
	    for (int i_109_ = 0;
		 ((Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810.length
		   ^ 0xffffffff)
		  < (i_109_ ^ 0xffffffff));
		 i_109_++) {
		if (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_109_]
		    != null)
		    Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_109_]
			.anInt3735
			= -1;
	    }
	    for (int i_110_ = 0;
		 ((i_110_ ^ 0xffffffff)
		  > (Class128.aClass131_Sub7_Sub1Array2386.length
		     ^ 0xffffffff));
		 i_110_++) {
		if (Class128.aClass131_Sub7_Sub1Array2386[i_110_] != null)
		    Class128.aClass131_Sub7_Sub1Array2386[i_110_].anInt3735
			= -1;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 24) { //reset camera packet.
	    int i_111_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (Class67_Sub1_Sub30.method757(i_111_, (byte) -128))
		Class129.method1736(-1);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -43) {
	    byte[] is = new byte[Class67_Sub5_Sub1.lastPacketSize];
	    Class54.aPacketStream_1069
		.method1097(is, -1476, 0, Class67_Sub5_Sub1.lastPacketSize);
	    RSString RSString
		= Class34.method303(is, 0, Class67_Sub5_Sub1.lastPacketSize, 0);
	    if (Class120.aFrame2272 == null
		&& ((SignLink.anInt931 ^ 0xffffffff) == -4
		    || !SignLink.aString937.startsWith("win")
		    || Class67_Sub1_Sub37.aBoolean4406))
		Class67_Sub1_Sub19.method707(true, (byte) 117, RSString);
	    else {
		client.aRSString_2750 = RSString;
		Class67_Sub1_Sub16_Sub1.aBoolean5095 = true;
		Class67_Sub5_Sub2.aClass31_4475
		    = (Class124.aSignLink_2335.method405
		       (new String(RSString.method518(false), "ISO-8859-1"),
			(byte) -102));
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -177) {
	    int i_112_
		= Class54.aPacketStream_1069.readInt1((byte) 106);
	    int i_113_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_114_
		= Class54.aPacketStream_1069.readInt1((byte) 106);
	    if (Class67_Sub1_Sub30.method757(i_113_, (byte) -128)) {
		Class67_Sub22 class67_sub22
		    = ((Class67_Sub22)
		       Class67_Sub1_Sub33.aClass92_4325
			   .method1489((byte) -85, (long) i_112_));
		Class67_Sub22 class67_sub22_115_
		    = ((Class67_Sub22)
		       Class67_Sub1_Sub33.aClass92_4325
			   .method1489((byte) -53, (long) i_114_));
		if (class67_sub22_115_ != null)
		    Class67_Sub20.method1274(class67_sub22_115_,
					     (class67_sub22 == null
					      || ((class67_sub22_115_.anInt3185
						   ^ 0xffffffff)
						  != (class67_sub22.anInt3185
						      ^ 0xffffffff))),
					     15361);
		if (class67_sub22 != null) {
		    class67_sub22.method606((byte) -118);
		    Class67_Sub1_Sub33.aClass92_4325
			.method1488((byte) -89, class67_sub22, (long) i_114_);
		}
		Class7 class7 = Class3.method69((byte) 110, i_112_);
		if (class7 != null)
		    Class37.method326(class7, 79);
		class7 = Class3.method69((byte) 110, i_114_);
		if (class7 != null) {
		    Class37.method326(class7, 102);
		    Class67_Sub17.method1247(true, class7, 100);
		}
		if ((Class54.anInt1080 ^ 0xffffffff) != 0)
		    Class67_Sub1_Sub3.method634((byte) 62, Class54.anInt1080,
						1);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -215) { //sendFightCaveMapdata
	    ObjectDef.method1772(true, true);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 225) { //PlayerUpdate (very important one)
	    Class67_Sub1_Sub28.method749(-1);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -154) { //clearMapFlag
	    Class67_Sub1_Sub20.packetType = -1;
	    Class33_Sub2.mapFlag = 0;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 71) { //send sent private message
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    RSString RSString
		= Class67_Sub5_Sub10.method925(Class50.method434
						   ((Class54
						     .aPacketStream_1069),
						    111)
						   .method524((byte) 127));
	    Class87.method1465(true, RSString,
			       Class67_Sub17.method1250((byte) -72, l)
				   .method500(0),
			       6);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 54) { //clan chat message
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    Class54.aPacketStream_1069.readByte2((byte) 1);
	    long l_116_ = Class54.aPacketStream_1069.readLong(-9426);
	    long l_117_
		= (long) Class54.aPacketStream_1069.readUShort(-2386);
	    long l_118_
		= (long) Class54.aPacketStream_1069.readThreeBytes(65280);
	    boolean bool = false;
	    int i_119_
		= Class54.aPacketStream_1069.readByte((byte) -127);
	    long l_120_ = (l_117_ << -1147457312) + l_118_;
	while_29_:
	    do {
		for (int i_121_ = 0; i_121_ < 100; i_121_++) {
		    if (l_120_ == Class113.aLongArray2141[i_121_]) {
			bool = true;
			break while_29_;
		    }
		}
		if ((i_119_ ^ 0xffffffff) >= -2) {
		    if (Class78.aBoolean1602 && !Class23.aBoolean560
			|| Class67_Sub5_Sub16.aBoolean4783)
			bool = true;
		    else {
			for (int i_122_ = 0;
			     ((Class90.anInt1847 ^ 0xffffffff)
			      < (i_122_ ^ 0xffffffff));
			     i_122_++) {
			    if ((Class103.aLongArray2025[i_122_]
				 ^ 0xffffffffffffffffL)
				== (l ^ 0xffffffffffffffffL)) {
				bool = true;
				break;
			    }
			}
		    }
		}
	    } while (false);
	    if (!bool && (Class117.anInt2224 ^ 0xffffffff) == -1) {
		Class113.aLongArray2141[Class124.anInt2327] = l_120_;
		Class124.anInt2327 = (Class124.anInt2327 - -1) % 100;
		RSString RSString
		    = (Class67_Sub5_Sub10.method925
		       (Class50.method434
			    (Class54.aPacketStream_1069, 99)
			    .method524((byte) 127)));
		if ((i_119_ ^ 0xffffffff) != -3 && i_119_ != 3) {
		    if (i_119_ == 1)
			Canvas_Sub1.method45((Class67_Sub1_Sub27.method744
					      ((new RSString[]
						{ Class67_Sub25.aRSString_3254,
						  Class67_Sub17.method1250
						      ((byte) -72, l)
						      .method500(0) }),
					       -119)),
					     RSString,
					     Class67_Sub17.method1250
						 ((byte) -72, l_116_)
						 .method500(0),
					     false, 9);
		    else
			Canvas_Sub1.method45(Class67_Sub17.method1250
						 ((byte) -72, l).method500(0),
					     RSString,
					     Class67_Sub17.method1250
						 ((byte) -72, l_116_)
						 .method500(0),
					     false, 9);
		} else
		    Canvas_Sub1.method45
			(Class67_Sub1_Sub27.method744((new RSString[]
						       { Class95.aRSString_1904,
							 Class67_Sub17
							     .method1250
							     ((byte) -72, l)
							     .method500(0) }),
						      -93),
			 RSString,
			 Class67_Sub17.method1250((byte) -72, l_116_)
			     .method500(0),
			 false, 9);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 234) { // run energy
	    Class67_Sub1_Sub11.method666(1);
	    Class67_Sub9.anInt2969 = Class54.aPacketStream_1069.readByte((byte) 95);
	    Class67_Sub1_Sub20.packetType = -1;
	    Class86.anInt1763 = Class11.anInt409;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 126) {	//sendIgnores
	    Class90.anInt1847 = Class67_Sub5_Sub1.lastPacketSize / 8;
	    for (int i_123_ = 0;
		 (Class90.anInt1847 ^ 0xffffffff) < (i_123_ ^ 0xffffffff);
		 i_123_++) {
		Class103.aLongArray2025[i_123_]
		    = Class54.aPacketStream_1069.readLong(-9426);
		Class126_Sub3.aRSStringArray3445[i_123_]
		    = Class67_Sub17.method1250((byte) -72,
					       (Class103.aLongArray2025
						[i_123_]));
	    }
	    Class128.anInt2376 = Class11.anInt409;
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 155) {	//sendInterface
	    int i_124_ = Class54.aPacketStream_1069.readByte((byte) 91);
	    int i_125_ = Class54.aPacketStream_1069.readInt2((byte) 36);
	    int i_126_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_127_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (Class67_Sub1_Sub30.method757(i_126_, (byte) -128)) {
		Class67_Sub22 class67_sub22
		    = ((Class67_Sub22)
		       Class67_Sub1_Sub33.aClass92_4325
			   .method1489((byte) -85, (long) i_125_));
		if (class67_sub22 != null)
		    Class67_Sub20.method1274(class67_sub22,
					     i_127_ != class67_sub22.anInt3185,
					     15361);
		Class67_Sub1_Sub31.method759(i_124_, i_127_, i_125_,
					     (byte) 94);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 89) {
	    Class15.method169((byte) 94);
	    Class67_Sub1_Sub11.method666(1);
	    Class67_Sub5_Sub15.anInt4749 += 32;
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -233) {	//setPrivacyOptions
	    Class119.anInt2245
		= Class54.aPacketStream_1069.readByte((byte) -13);
	    Class67_Sub1_Sub18.anInt4125
		= Class54.aPacketStream_1069.readByte((byte) -50);
	    Class67_Sub1_Sub29.anInt4267
		= Class54.aPacketStream_1069.readByte((byte) -43);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 160) {
	    if ((Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff) == -1) //no string? use default string
		Class67_Sub1_Sub17.aRSString_4104 = Class67_Sub6.aRSString_2893;
	    else
		Class67_Sub1_Sub17.aRSString_4104
		    = Class54.aPacketStream_1069.readRSString(-1); //otherwise put a string.
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -133) {
	    int i_128_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_129_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_130_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_131_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_132_
		= Class54.aPacketStream_1069.readInt((byte) 126);
	    if (Class67_Sub1_Sub30.method757(i_129_, (byte) -128))
		Class55_Sub3_Sub1.method480(126, i_132_, i_128_, i_131_,
					    i_130_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -70) {
	    int i_133_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_134_
		= Class54.aPacketStream_1069.readInt((byte) 127);
	    int i_135_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if (Class67_Sub1_Sub30.method757(i_133_, (byte) -128))
		Class67_Sub1_Sub19.method710(i_134_, i_135_, (byte) 19);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -221) {
	    int i_136_ = Class54.aPacketStream_1069.readInt2((byte) 50);
	    int i_137_
		= Class54.aPacketStream_1069.readLEShort2((byte) -48);
	    int i_138_ = Class54.aPacketStream_1069.readUShort(-2386);
	    if (Class67_Sub1_Sub30.method757(i_138_, (byte) -128))
		Class67_Sub5_Sub7.method877((byte) -88, i_137_, i_136_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 162) {	//sendMapRegion (regular)
	    ObjectDef.method1772(true, false);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -172) {	//modifyText
	    int i_139_ = Class54.aPacketStream_1069.readInt2((byte) 101);
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    int i_140_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    iBuffer[0] = i_139_;
	    iBuffer[1] = i_140_;
	    if (Class67_Sub1_Sub30.method757(i_140_, (byte) -128))
		Class85.method1453((byte) -90, i_139_, RSString);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -103) {
	    int i_141_ = Class54.aPacketStream_1069.readLEShort2((byte) 99);
	    int i_142_ = Class54.aPacketStream_1069.readByteS(128);
	    int i_143_ = Class54.aPacketStream_1069.readUShort(-2386);
	    Class131_Sub7_Sub1 class131_sub7_sub1
		= Class128.aClass131_Sub7_Sub1Array2386[i_141_];
	    if (class131_sub7_sub1 != null)
		Class67_Sub5_Sub9.method900(i_142_, i_143_, (byte) -66,
					    class131_sub7_sub1);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -208) {
	    int i_144_ = Class54.aPacketStream_1069.readInt2((byte) 36);
	    int i_145_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_146_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_147_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if (Class67_Sub1_Sub30.method757(i_145_, (byte) -128))
		Class115.method1619(i_144_, 13,
				    (i_146_ << 1477740912) + i_147_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -51) {	//itemOnInterface
	    int i_148_ = Class54.aPacketStream_1069.readInt((byte) 125); //size??
	    int i_149_ = Class54.aPacketStream_1069.readInt2((byte) 93);
	    int i_150_ = Class54.aPacketStream_1069.readLEShortA((byte) -88); //item....?
	    if (i_150_ == 65535)
		i_150_ = -1;
	    int i_151_ = Class54.aPacketStream_1069.readLEShort2((byte) -61); //packetCount?
	    if (Class67_Sub1_Sub30.method757(i_151_, (byte) -128)) {
		Class7 class7 = Class3.method69((byte) 110, i_149_);
		if (!class7.aBoolean185) {
		    if ((i_150_ ^ 0xffffffff) == 0) {
			Class67_Sub1_Sub20.packetType = -1;
			class7.anInt329 = 0;
			return true;
		    }
		    Class76 class76 = method1596(i_150_, -28322);
		    class7.anInt330 = class76.anInt1545;
		    class7.anInt183 = i_150_;
		    class7.anInt329 = 4;
		    class7.anInt164 = class76.anInt1541;
		    class7.anInt338 = class76.anInt1557 * 100 / i_148_;
		    Class37.method326(class7, 101);
		} else {
		    Class99_Sub1.method1532(i_150_, i_148_, 119, i_149_);
		    Class76 class76 = method1596(i_150_, -28322);
		    Class55_Sub3_Sub1.method480(127, i_149_, class76.anInt1545,
						class76.anInt1541,
						class76.anInt1557);
		    Class67_Sub5_Sub3.method848(class76.anInt1512, i_149_,
						class76.anInt1516,
						class76.anInt1520,
						(byte) -102);
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 115) { //send client script.
	    int i_152_ = Class54.aPacketStream_1069.readUShort(-2386);
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    Object[] objects = new Object[RSString.method531((byte) -128) - -1];
	    for (int i_153_ = RSString.method531((byte) 10) - 1;
		 (i_153_ ^ 0xffffffff) <= -1; i_153_--) {
		if (RSString.method499(i_153_, -97) == 115)
		    objects[1 + i_153_]
			= Class54.aPacketStream_1069.readRSString(-1);
		else
		    objects[1 + i_153_]
			= new Integer(Class54.aPacketStream_1069
					  .readInt((byte) 127));
	    }
	    objects[0] = new Integer(Class54.aPacketStream_1069
					 .readInt((byte) 127));
	    if (Class67_Sub1_Sub30.method757(i_152_, (byte) -128)) {
		Class67_Sub30 class67_sub30 = new Class67_Sub30();
		class67_sub30.anObjectArray3356 = objects;
		Class81.method1429(class67_sub30, 67);
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 81) {
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    Class54.aPacketStream_1069.readByte2((byte) 1);
	    long l_154_ = Class54.aPacketStream_1069.readLong(-9426);
	    long l_155_
		= (long) Class54.aPacketStream_1069.readUShort(-2386);
	    long l_156_
		= (long) Class54.aPacketStream_1069.readThreeBytes(65280);
	    int i_157_ = Class54.aPacketStream_1069.readByte((byte) 82);
	    int i_158_ = Class54.aPacketStream_1069.readUShort(-2386);
	    long l_159_ = (l_155_ << -1050897568) - -l_156_;
	    boolean bool = false;
	while_30_:
	    do {
		for (int i_160_ = 0; (i_160_ ^ 0xffffffff) > -101; i_160_++) {
		    if ((l_159_ ^ 0xffffffffffffffffL)
			== (Class113.aLongArray2141[i_160_]
			    ^ 0xffffffffffffffffL)) {
			bool = true;
			break while_30_;
		    }
		}
		if (i_157_ <= 1) {
		    for (int i_161_ = 0; i_161_ < Class90.anInt1847;
			 i_161_++) {
			if (Class103.aLongArray2025[i_161_] == l) {
			    bool = true;
			    break;
			}
		    }
		}
	    } while (false);
	    if (!bool && (Class117.anInt2224 ^ 0xffffffff) == -1) {
		Class113.aLongArray2141[Class124.anInt2327] = l_159_;
		Class124.anInt2327 = (1 + Class124.anInt2327) % 100;
		RSString RSString
		    = Class11.method143(i_158_, -32769)
			  .method951(52, Class54.aPacketStream_1069);
		if (i_157_ == 2 || (i_157_ ^ 0xffffffff) == -4)
		    Class66.method600(i_158_, RSString,
				      Class67_Sub17.method1250
					  ((byte) -72, l_154_).method500(0),
				      20, -1,
				      (Class67_Sub1_Sub27.method744
				       ((new RSString[]
					 { Class95.aRSString_1904,
					   Class67_Sub17.method1250
					       ((byte) -72, l).method500(0) }),
					-128)));
		else if ((i_157_ ^ 0xffffffff) != -2)
		    Class66.method600(i_158_, RSString,
				      Class67_Sub17.method1250
					  ((byte) -72, l_154_).method500(0),
				      20, -1,
				      Class67_Sub17.method1250
					  ((byte) -72, l).method500(0));
		else
		    Class66.method600(i_158_, RSString,
				      Class67_Sub17.method1250
					  ((byte) -72, l_154_).method500(0),
				      20, -1,
				      (Class67_Sub1_Sub27.method744
				       ((new RSString[]
					 { Class67_Sub25.aRSString_3254,
					   Class67_Sub17.method1250
					       ((byte) -72, l).method500(0) }),
					-91)));
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -166) {	//setRightClickOptions
	    int i_162_
		= Class54.aPacketStream_1069.readLEShort2((byte) 123);
	    int i_163_
		= Class54.aPacketStream_1069.readLEShort2((byte) 114);
	    int i_164_
		= Class54.aPacketStream_1069.readInt((byte) 125);
	    if (i_163_ == 65535)
		i_163_ = -1;
	    int i_165_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_166_
		= Class54.aPacketStream_1069.readInt1((byte) 106);
	    if ((i_165_ ^ 0xffffffff) == -65536)
		i_165_ = -1;
	    if (Class67_Sub1_Sub30.method757(i_162_, (byte) -128)) {
		for (int i_167_ = i_165_;
		     (i_167_ ^ 0xffffffff) >= (i_163_ ^ 0xffffffff);
		     i_167_++) {
		    long l = ((long) i_164_ << 1408953248) + (long) i_167_;
		    Class67_Sub14 class67_sub14
			= (Class67_Sub14) Class67_Sub5_Sub4_Sub1
					      .aClass92_5113
					      .method1489((byte) -73, l);
		    Class67_Sub14 class67_sub14_168_;
		    if (class67_sub14 == null) {
			if (i_167_ == -1)
			    class67_sub14_168_
				= new Class67_Sub14(i_166_,
						    (Class3.method69
						     ((byte) 110, i_164_)
						     .aClass67_Sub14_309
						     .anInt3053));
			else
			    class67_sub14_168_ = new Class67_Sub14(i_166_, -1);
		    } else {
			class67_sub14_168_
			    = new Class67_Sub14(i_166_,
						class67_sub14.anInt3053);
			class67_sub14.method606((byte) -118);
		    }
		    Class67_Sub5_Sub4_Sub1.aClass92_5113
			.method1488((byte) -89, class67_sub14_168_, l);
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 86) {	//logout()
	    Class131_Sub4.method1819(126);
	    Class67_Sub1_Sub20.packetType = -1;
	    return false;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -112) {
	    int i_169_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_170_ = Class54.aPacketStream_1069.readInt2((byte) 55);
	    int i_171_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_172_
		= Class54.aPacketStream_1069.readLEShort2((byte) 104);
	    int i_173_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if (Class67_Sub1_Sub30.method757(i_169_, (byte) -128))
		Class28.method266(7, i_172_ << 6333936 | i_173_, i_171_, 100,
				  i_170_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -63) {	//sendFriend
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    boolean bool = true;
	    if ((l ^ 0xffffffffffffffffL) > -1L) {
		bool = false;
		l &= 0x7fffffffffffffffL;
	    }
	    int i_174_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_175_
		= Class54.aPacketStream_1069.readByte((byte) -38);
	    RSString RSString = Class67_Sub5_Sub5.aRSString_4523;
	    if ((i_174_ ^ 0xffffffff) < -1)
		RSString = Class54.aPacketStream_1069.readRSString(-1);
	    RSString RSString_176_
		= Class67_Sub17.method1250((byte) -72, l).method500(0);
	    for (int i_177_ = 0; i_177_ < Class67_Sub5_Sub17.anInt4795;
		 i_177_++) {
		if ((Class66.aLongArray1330[i_177_] ^ 0xffffffffffffffffL)
		    == (l ^ 0xffffffffffffffffL)) {
		    if ((Class67.anIntArray1335[i_177_] ^ 0xffffffff)
			!= (i_174_ ^ 0xffffffff)) {
			Class67.anIntArray1335[i_177_] = i_174_;
			if ((i_174_ ^ 0xffffffff) < -1)
			    Class87.method1465(true,
					       (Class67_Sub1_Sub27.method744
						((new RSString[]
						  { RSString_176_,
						    (Class67_Sub5_Sub14
						     .aRSString_4747) }),
						 -105)),
					       Class67_Sub5_Sub5.aRSString_4523,
					       5);
			if ((i_174_ ^ 0xffffffff) == -1)
			    Class87.method1465(true,
					       (Class67_Sub1_Sub27.method744
						((new RSString[]
						  { RSString_176_,
						    Class56.aRSString_1095 }),
						 -110)),
					       Class67_Sub5_Sub5.aRSString_4523,
					       5);
		    }
		    Class67_Sub1_Sub16_Sub1.aRSStringArray5092[i_177_]
			= RSString;
		    OutputStream_Sub1.anIntArray88[i_177_] = i_175_;
		    Class67_Sub5_Sub9.aBooleanArray4609[i_177_] = bool;
		    RSString_176_ = null;
		    break;
		}
	    }
	    if (RSString_176_ != null
		&& (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff) > -201) {
		Class66.aLongArray1330[Class67_Sub5_Sub17.anInt4795] = l;
		Class99_Sub1.aRSStringArray3384[Class67_Sub5_Sub17.anInt4795]
		    = RSString_176_;
		Class67.anIntArray1335[Class67_Sub5_Sub17.anInt4795] = i_174_;
		Class67_Sub1_Sub16_Sub1.aRSStringArray5092[(Class67_Sub5_Sub17
							   .anInt4795)]
		    = RSString;
		OutputStream_Sub1.anIntArray88[Class67_Sub5_Sub17.anInt4795]
		    = i_175_;
		Class67_Sub5_Sub9.aBooleanArray4609[(Class67_Sub5_Sub17
						     .anInt4795)]
		    = bool;
		Class67_Sub5_Sub17.anInt4795++;
	    }
	    int i_178_ = Class67_Sub5_Sub17.anInt4795;
	    Class128.anInt2376 = Class11.anInt409;
	    boolean bool_179_ = false;
	    while ((i_178_ ^ 0xffffffff) < -1) {
		i_178_--;
		bool_179_ = true;
		for (int i_180_ = 0;
		     (i_180_ ^ 0xffffffff) > (i_178_ ^ 0xffffffff); i_180_++) {
		    if ((((Class67_Sub23.anInt3202 ^ 0xffffffff)
			  != (Class67.anIntArray1335[i_180_] ^ 0xffffffff))
			 && (Class67.anIntArray1335[1 + i_180_]
			     == Class67_Sub23.anInt3202))
			|| (Class67.anIntArray1335[i_180_] == 0
			    && Class67.anIntArray1335[1 + i_180_] != 0)) {
			bool_179_ = false;
			int i_181_ = Class67.anIntArray1335[i_180_];
			Class67.anIntArray1335[i_180_]
			    = Class67.anIntArray1335[i_180_ - -1];
			Class67.anIntArray1335[1 + i_180_] = i_181_;
			RSString RSString_182_ = (Class67_Sub1_Sub16_Sub1
						.aRSStringArray5092[i_180_]);
			Class67_Sub1_Sub16_Sub1.aRSStringArray5092[i_180_]
			    = (Class67_Sub1_Sub16_Sub1.aRSStringArray5092
			       [1 + i_180_]);
			Class67_Sub1_Sub16_Sub1.aRSStringArray5092[i_180_ + 1]
			    = RSString_182_;
			RSString RSString_183_
			    = Class99_Sub1.aRSStringArray3384[i_180_];
			Class99_Sub1.aRSStringArray3384[i_180_]
			    = Class99_Sub1.aRSStringArray3384[1 + i_180_];
			Class99_Sub1.aRSStringArray3384[i_180_ + 1]
			    = RSString_183_;
			long l_184_ = Class66.aLongArray1330[i_180_];
			Class66.aLongArray1330[i_180_]
			    = Class66.aLongArray1330[i_180_ + 1];
			Class66.aLongArray1330[1 + i_180_] = l_184_;
			int i_185_ = OutputStream_Sub1.anIntArray88[i_180_];
			OutputStream_Sub1.anIntArray88[i_180_]
			    = OutputStream_Sub1.anIntArray88[1 + i_180_];
			OutputStream_Sub1.anIntArray88[1 + i_180_] = i_185_;
			boolean bool_186_
			    = Class67_Sub5_Sub9.aBooleanArray4609[i_180_];
			Class67_Sub5_Sub9.aBooleanArray4609[i_180_]
			    = Class67_Sub5_Sub9.aBooleanArray4609[i_180_ + 1];
			Class67_Sub5_Sub9.aBooleanArray4609[i_180_ + 1]
			    = bool_186_;
		    }
		}
		if (bool_179_)
		    break;
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 159) {
	    Class67_Sub1_Sub11.method666(1);
	    Class132.anInt2444 = Class54.aPacketStream_1069.readShort2((byte) 118);
	    Class67_Sub1_Sub20.packetType = -1;
	    Class86.anInt1763 = Class11.anInt409;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -22) {	//showChildInterface
	    int i_187_ = Class54.aPacketStream_1069.readByteC((byte) -80);
	    int i_188_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_189_ = Class54.aPacketStream_1069.readLEInt(4);
	    if (Class67_Sub1_Sub30.method757(i_188_, (byte) -128))
		Class131_Sub7.method1874(i_187_, 109, i_189_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 149) {	//sendCloseInterface
	    int i_190_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_191_ = Class54.aPacketStream_1069.readInt((byte) 125);
	    if (Class67_Sub1_Sub30.method757(i_190_, (byte) -128)) {
		Class67_Sub22 class67_sub22 = ((Class67_Sub22)Class67_Sub1_Sub33.aClass92_4325.method1489((byte) -95, (long) i_191_));
		if (class67_sub22 != null)
		    Class67_Sub20.method1274(class67_sub22, true, 15361);
		if (Class16.aClass7_470 != null) {
		    Class37.method326(Class16.aClass7_470, 95);
		    Class16.aClass7_470 = null;
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 196) {
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    int i_192_ = Class54.aPacketStream_1069.readUShort(-2386);
	    byte i_193_ = Class54.aPacketStream_1069.readByte2((byte) 1);
	    boolean bool = false;
	    if ((~0x7fffffffffffffffL & l ^ 0xffffffffffffffffL) != -1L)
		bool = true;
	    if (bool) {
		if (Class67_Sub1_Sub32.anInt4296 == 0) {
		    Class67_Sub1_Sub20.packetType = -1;
		    return true;
		}
		boolean bool_194_ = false;
		l &= 0x7fffffffffffffffL;
		int i_195_;
		for (i_195_ = 0;
		     ((i_195_ ^ 0xffffffff)
		      > (Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff));
		     i_195_++) {
		    if (Class69.aClass67_Sub25Array1380[i_195_].aLong1344 == l
			&& (Class69.aClass67_Sub25Array1380[i_195_].anInt3255
			    == i_192_))
			break;
		}
		if (Class67_Sub1_Sub32.anInt4296 > i_195_) {
		    for (/**/;
			 ((-1 + Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff)
			  < (i_195_ ^ 0xffffffff));
			 i_195_++)
			Class69.aClass67_Sub25Array1380[i_195_]
			    = Class69.aClass67_Sub25Array1380[1 + i_195_];
		    Class67_Sub1_Sub32.anInt4296--;
		    Class69.aClass67_Sub25Array1380[(Class67_Sub1_Sub32
						     .anInt4296)]
			= null;
		}
	    } else {
		RSString RSString
		    = Class54.aPacketStream_1069.readRSString(-1);
		Class67_Sub25 class67_sub25 = new Class67_Sub25();
		class67_sub25.aLong1344 = l;
		class67_sub25.aRSString_3249
		    = Class67_Sub17.method1250((byte) -72,
					       class67_sub25.aLong1344);
		class67_sub25.aRSString_3252 = RSString;
		class67_sub25.anInt3255 = i_192_;
		class67_sub25.aByte3247 = i_193_;
		int i_196_;
		for (i_196_ = Class67_Sub1_Sub32.anInt4296 + -1; i_196_ >= 0;
		     i_196_--) {
		    int i_197_
			= Class69.aClass67_Sub25Array1380[i_196_]
			      .aRSString_3249
			      .method537(-95, class67_sub25.aRSString_3249);
		    if ((i_197_ ^ 0xffffffff) == -1) {
			Class69.aClass67_Sub25Array1380[i_196_].anInt3255
			    = i_192_;
			Class69.aClass67_Sub25Array1380[i_196_].aByte3247
			    = i_193_;
			Class69.aClass67_Sub25Array1380[i_196_].aRSString_3252
			    = RSString;
			Class67_Sub1_Sub24.anInt4191 = Class11.anInt409;
			Class67_Sub1_Sub20.packetType = -1;
			if (Class119.aLong2248 == l)
			    Class136.aByte2497 = i_193_;
			return true;
		    }
		    if ((i_197_ ^ 0xffffffff) > -1)
			break;
		}
		if (Class69.aClass67_Sub25Array1380.length
		    <= Class67_Sub1_Sub32.anInt4296) {
		    Class67_Sub1_Sub20.packetType = -1;
		    return true;
		}
		for (int i_198_ = -1 + Class67_Sub1_Sub32.anInt4296;
		     (i_198_ ^ 0xffffffff) < (i_196_ ^ 0xffffffff); i_198_--)
		    Class69.aClass67_Sub25Array1380[i_198_ + 1]
			= Class69.aClass67_Sub25Array1380[i_198_];
		if ((Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff) == -1)
		    Class69.aClass67_Sub25Array1380 = new Class67_Sub25[100];
		Class69.aClass67_Sub25Array1380[1 + i_196_] = class67_sub25;
		if (Class119.aLong2248 == l)
		    Class136.aByte2497 = i_193_;
		Class67_Sub1_Sub32.anInt4296++;
	    }
	    Class67_Sub1_Sub24.anInt4191 = Class11.anInt409;
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 26) {	//sendCoords
	    Class28.anInt673
		= Class54.aPacketStream_1069.readByteC((byte) -80);
	    Class52.anInt1045
		= Class54.aPacketStream_1069.readByte((byte) -25);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -120) {
	    int i_199_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_200_ = Class54.aPacketStream_1069.readLEInt(4);
	    int i_201_
		= Class54.aPacketStream_1069.readShort2((byte) 100);
	    int i_202_
		= Class54.aPacketStream_1069.method1058((byte) -85);
	    if (Class67_Sub1_Sub30.method757(i_199_, (byte) -128))
		Class56.method484(0, i_201_, i_200_, i_202_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -248) {
	    long l = Class54.aPacketStream_1069.readLong(-9426);
	    long l_203_
		= (long) Class54.aPacketStream_1069.readUShort(-2386);
	    long l_204_
		= (long) Class54.aPacketStream_1069.readThreeBytes(65280);
	    long l_205_ = l_204_ + (l_203_ << -1304295008);
	    int i_206_
		= Class54.aPacketStream_1069.readByte((byte) 124);
	    int i_207_ = Class54.aPacketStream_1069.readUShort(-2386);
	    boolean bool = false;
	while_31_:
	    do {
		for (int i_208_ = 0; (i_208_ ^ 0xffffffff) > -101; i_208_++) {
		    if ((l_205_ ^ 0xffffffffffffffffL)
			== (Class113.aLongArray2141[i_208_]
			    ^ 0xffffffffffffffffL)) {
			bool = true;
			break while_31_;
		    }
		}
		if ((i_206_ ^ 0xffffffff) >= -2) {
		    for (int i_209_ = 0; i_209_ < Class90.anInt1847;
			 i_209_++) {
			if (l == Class103.aLongArray2025[i_209_]) {
			    bool = true;
			    break;
			}
		    }
		}
	    } while (false);
	    if (!bool && (Class117.anInt2224 ^ 0xffffffff) == -1) {
		Class113.aLongArray2141[Class124.anInt2327] = l_205_;
		Class124.anInt2327 = (1 + Class124.anInt2327) % 100;
		RSString RSString
		    = Class11.method143(i_207_, -32769)
			  .method951(46, Class54.aPacketStream_1069);
		if ((i_206_ ^ 0xffffffff) != -3) {
		    if (i_206_ != 1)
			Class66.method600(i_207_, RSString, null, 18, -1,
					  Class67_Sub17.method1250
					      ((byte) -72, l).method500(0));
		    else
			Class66.method600(i_207_, RSString, null, 18, -1,
					  (Class67_Sub1_Sub27.method744
					   ((new RSString[]
					     { Class67_Sub25.aRSString_3254,
					       Class67_Sub17.method1250
						   ((byte) -72, l)
						   .method500(0) }),
					    -125)));
		} else
		    Class66.method600(i_207_, RSString, null, 18, -1,
				      (Class67_Sub1_Sub27.method744
				       ((new RSString[]
					 { Class95.aRSString_1904,
					   Class67_Sub17.method1250
					       ((byte) -72, l).method500(0) }),
					-108)));
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -117) {	//updateGEProgress
	    int i_210_ = Class54.aPacketStream_1069.readByte((byte) 104); //slot
	    if (Class54.aPacketStream_1069.readByte((byte) 96) != 0) {
		Class54.aPacketStream_1069.currentOffset--;
		Class108.aClass34Array2082[i_210_]
		    = new Class34(Class54.aPacketStream_1069);
	    } else
		Class108.aClass34Array2082[i_210_] = new Class34();
	    Class67_Sub1_Sub20.packetType = -1;
	    Class103.anInt2023 = Class11.anInt409;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -33) { //npc update.
	    Class24.doNpcUpdate((byte) 6);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 169) {
	    Class67_Sub1_Sub18.method704(24, Class54.aPacketStream_1069);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 191) {
	    int i_211_
		= Class54.aPacketStream_1069.readLEShort2((byte) 110);
	    Class85.method1448((byte) 74, i_211_);
	    Class67_Sub1_Sub16_Sub1.anIntArray5101
		[Class75.method1379(Class67_Sub5_Sub2.anInt4472++, 31)]
		= Class75.method1379(32767, i_211_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 48) {
	    int i_212_ = Class54.aPacketStream_1069.readUShort(-2386);
	    RSString RSString = Class54.aPacketStream_1069.readRSString(-1);
	    int i_213_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if (Class67_Sub1_Sub30.method757(i_212_, (byte) -128))
		Class67_Sub19.method1267(RSString, i_213_, true);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 60) {					//sendConfig1
	    int i_214_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    byte i_215_ = Class54.aPacketStream_1069.readByteC2(-119);
	    PacketStream.method1100(10, i_214_, i_215_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -236) {
	    int i_216_ = Class54.aPacketStream_1069.readByteS(128);
	    int i_217_ = i_216_ & 0x3;
	    int i_218_ = i_216_ >> 260556802;
	    int i_219_ = Class123.anIntArray2316[i_218_];
	    int i_220_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_221_ = Class54.aPacketStream_1069.readInt((byte) 125);
	    int i_222_ = 0x3 & i_221_ >> -1095727972;
	    if (i_220_ == 65535)
		i_220_ = -1;
	    int i_223_ = (0xfffe776 & i_221_) >> -1111259762;
	    i_223_ -= Class58.baseX;
	    int i_224_ = i_221_ & 0x3fff;
	    i_224_ -= Class137.baseY;
	    Class70_Sub1.method1337(2047, i_223_, i_217_, i_220_, i_224_,
				    i_218_, i_222_, i_219_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -23) {
	    int i_225_ = Class54.aPacketStream_1069.readInt((byte) 125);
	    int i_226_ = Class54.aPacketStream_1069.readUShort(-2386);
	    Class7 class7;
	    if (i_225_ < 0)
		class7 = null;
	    else
		class7 = Class3.method69((byte) 110, i_225_);
	    if (i_225_ < -70000)
		i_226_ += 32768;
	    while ((Class54.aPacketStream_1069.currentOffset ^ 0xffffffff)
		   > (Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff)) {
		int i_227_ = Class54.aPacketStream_1069.method1070(-59);
		int i_228_ = 0;
		int i_229_ = Class54.aPacketStream_1069.readUShort(-2386);
		if (i_229_ != 0) {
		    i_228_ = Class54.aPacketStream_1069.readByte((byte) -90);
		    if ((i_228_ ^ 0xffffffff) == -256)
			i_228_ = Class54.aPacketStream_1069.readInt((byte) 125);
		}
		if (class7 != null && (i_227_ ^ 0xffffffff) <= -1
		    && ((class7.anIntArray264.length ^ 0xffffffff)
			< (i_227_ ^ 0xffffffff))) {
		    class7.anIntArray264[i_227_] = i_229_;
		    class7.anIntArray253[i_227_] = i_228_;
		}
		Class109.method1580(-1 + i_229_, i_226_, 94, i_228_, i_227_);
	    }
	    if (class7 != null)
		Class37.method326(class7, 87);
	    Class67_Sub1_Sub11.method666(1);
	    Class67_Sub1_Sub16_Sub1.anIntArray5101[Class75.method1379(31, Class67_Sub5_Sub2.anInt4472++)]	= Class75.method1379(32767, i_226_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if (Class67_Sub1_Sub20.packetType == 125) {
	    int i_230_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_231_
		= Class54.aPacketStream_1069.readByte((byte) 111);
	    int i_232_
		= Class54.aPacketStream_1069.readByte((byte) -40);
	    int i_233_ = Class54.aPacketStream_1069.readUShort(-2386);
	    int i_234_ = Class54.aPacketStream_1069.readByte((byte) 92);
	    int i_235_
		= Class54.aPacketStream_1069.readByte((byte) 109);
	    if (Class67_Sub1_Sub30.method757(i_230_, (byte) -128))
		Class14.method159(i_234_, i_233_, i_231_, i_235_, i_232_,
				  2047);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -131) {
	    int i_236_ = Class54.aPacketStream_1069.readLEInt(4);
	    int i_237_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_238_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if (i_238_ == 65535)
		i_238_ = -1;
	    if (Class67_Sub1_Sub30.method757(i_237_, (byte) -128))
		Class28.method266(1, i_238_, -1, 100, i_236_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -3) {
	    int i_239_
		= Class54.aPacketStream_1069.readInt1((byte) 106);
	    int i_240_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_241_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    if (Class67_Sub1_Sub30.method757(i_240_, (byte) -128))
		RSString.method525(6, i_239_, i_241_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -173) { //sound effect?
	    int i_242_ = Class54.aPacketStream_1069.readUShort(-2386); //song Id [65535 = turn off sound effect]
	    if (i_242_ == 65535)
		i_242_ = -1;
	    int i_243_ = Class54.aPacketStream_1069.readByte((byte) -104); //repeat Amount.
	    int i_244_ = Class54.aPacketStream_1069.readUShort(-2386); //delay of sound effect
	    Class132.method1904(true, i_243_, i_244_, i_242_);
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	if ((Class67_Sub1_Sub20.packetType ^ 0xffffffff) == -10) {
	    int i_245_
		= Class54.aPacketStream_1069.readLEShortA((byte) -88);
	    int i_246_ = Class54.aPacketStream_1069.readLEInt(4);
	    int i_247_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    int i_248_
		= Class54.aPacketStream_1069.readLEShort2((byte) -105);
	    int i_249_ = Class54.aPacketStream_1069.readShortA((byte) 22);
	    if ((i_248_ ^ 0xffffffff) == -65536)
		i_248_ = -1;
	    if ((i_249_ ^ 0xffffffff) == -65536)
		i_249_ = -1;
	    if (Class67_Sub1_Sub30.method757(i_247_, (byte) -128)) {
		for (int i_250_ = i_249_; i_250_ <= i_248_; i_250_++) {
		    long l = ((long) i_246_ << 1574220960) + (long) i_250_;
		    Class67_Sub14 class67_sub14
			= (Class67_Sub14) Class67_Sub5_Sub4_Sub1
					      .aClass92_5113
					      .method1489((byte) -94, l);
		    Class67_Sub14 class67_sub14_251_;
		    if (class67_sub14 == null) {
			if ((i_250_ ^ 0xffffffff) == 0)
			    class67_sub14_251_
				= new Class67_Sub14((Class3.method69
						     ((byte) 110, i_246_)
						     .aClass67_Sub14_309
						     .anInt3060),
						    i_245_);
			else
			    class67_sub14_251_ = new Class67_Sub14(0, i_245_);
		    } else {
			class67_sub14_251_
			    = new Class67_Sub14(class67_sub14.anInt3060,
						i_245_);
			class67_sub14.method606((byte) -118);
		    }
		    Class67_Sub5_Sub4_Sub1.aClass92_5113
			.method1488((byte) -89, class67_sub14_251_, l);
		}
	    }
	    Class67_Sub1_Sub20.packetType = -1;
	    return true;
	}
	Class104.method1563(null, ("T1 - " + Class67_Sub1_Sub20.packetType + ","
				   + Class67_Sub1_Sub16.anInt4073 + ","
				   + Class55_Sub3.anInt2815 + " - "
				   + Class67_Sub5_Sub1.lastPacketSize), 1);
	Class131_Sub4.method1819(78);
	return true;
    }
    
    public static void method1598(int arg0) {
	aClass67_Sub5_Sub10_Sub1_2108 = null;
	aRSString_2105 = null;
	aClass9_2113 = null;
	aRSString_2111 = null;
	aRSString_2118 = null;
	int i = 22 / ((-10 - arg0) / 50);
	anIntArray2115 = null;
	aRSString_2104 = null;
	packetSizes = null;
	aRSString_2103 = null;
	aBooleanArray2102 = null;
	anIntArrayArray2117 = null;
	aRSString_2110 = null;
	aClass99_2119 = null;
	aRSString_2106 = null;
    }
    
    public static RSString method1599(int arg0, int arg1, Class7 arg2) {
	if (arg1 != 0)
	    aRSString_2104 = null;
	anInt2114++;
	if (!client.method31(arg2).method1229((byte) -82, arg0)
	    && arg2.anObjectArray200 == null)
	    return null;
	if (arg2.aRSStringArray315 == null
	    || arg0 >= arg2.aRSStringArray315.length
	    || arg2.aRSStringArray315[arg0] == null
	    || (arg2.aRSStringArray315[arg0].method515(32).method531((byte) 71)
		== 0)) {
	    if (Class128.aBoolean2377)
		return (Class67_Sub1_Sub27.method744
			(new RSString[] { Class67_Sub5_Sub4_Sub1.aRSString_5110,
					 InputStream_Sub1.method47(arg0,
								   true) },
			 -119));
	    return null;
	}
	return arg2.aRSStringArray315[arg0];
    }
    
    public static void method1600(int arg0) {
	Class67_Sub1_Sub25.aClass136_4224.method1921((byte) 68);
	Class67_Sub5_Sub9.aClass136_4612.method1921((byte) -115);
	if (arg0 == 8)
	    anInt2116++;
    }
    
    static {
	aRSString_2103 = Class134.method1914("flash2:", (byte) 114);
	aRSString_2105 = Class134.method1914("weiss:", (byte) 53);
	anIntArray2115 = new int[32];
	anInt2107 = 0;
	aRSString_2111 = aRSString_2103;
	anIntArrayArray2117
	    = (new int[][]
	       { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
		 { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
		 { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
		 { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
	aRSString_2104
	    = Class134.method1914("Chargement de l(W-Bcran)2titre )2 ",
				  (byte) 65);
	aRSString_2118 = Class134.method1914("::errortest", (byte) 123);
	aRSString_2110 = aRSString_2103;
    }
}
