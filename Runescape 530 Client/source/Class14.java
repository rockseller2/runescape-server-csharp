import java.math.BigInteger;
import java.util.Random;
import java.util.zip.Inflater;

public class Class14
{
    public static int anInt438;
    public static int anInt439;
    public static int anInt440;
    public static int anInt441;
    public Inflater anInflater442;
    public static int anInt443;
    public static BigInteger aBigInteger444
	= (new BigInteger
	   ("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
    public static int anInt445;
    public static Random aRandom446;
    public static volatile int anInt447 = 0;
    public static int anInt448;
    public static RSString aRSString_449;
    
    public void method157(byte[] arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 > -51)
		method162(25, -69, -81, -62, true, 7);
	    anInt441++;
	    if ((arg2.buffer[arg2.currentOffset] ^ 0xffffffff) != -32
		|| arg2.buffer[arg2.currentOffset + 1] != -117)
		throw new RuntimeException("Invalid GZIP header!");
	    if (anInflater442 == null)
		anInflater442 = new Inflater(true);
	    try {
		anInflater442.setInput(arg2.buffer,
				       arg2.currentOffset + 10,
				       (arg2.buffer.length + -8 + -10
					+ -arg2.currentOffset));
		anInflater442.inflate(arg0);
	    } catch (Exception exception) {
		anInflater442.reset();
		throw new RuntimeException("Invalid GZIP compressed data!");
	    }
	    anInflater442.reset();
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("bi.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method158(int arg0) {
	if (arg0 < -86) {
	    anInt445++;
	    Class67_Sub24.aClass136_3234.method1922(0);
	}
    }
    
    public static void method159(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	Class129_Sub1.anInt3480 = arg0;
	Class67_Sub5_Sub19.anInt4828 = arg2;
	Applet_Sub1.anInt5 = arg3;
	if (arg5 != 2047)
	    anInt448 = 61;
	anInt443++;
	Class106.anInt2056 = arg4;
	Class114.anInt2151 = arg1;
	if (Applet_Sub1.anInt5 >= 100) {
	    int i = 64 + 128 * Class67_Sub5_Sub19.anInt4828;
	    int i_0_ = 64 + Class106.anInt2056 * 128;
	    int i_1_ = (Class131_Sub5.method1826(Canvas_Sub1.anInt59, i, i_0_,
						 (byte) 99)
			- Class114.anInt2151);
	    int i_2_ = i_0_ + -Class129.anInt2395;
	    int i_3_ = i_1_ - Class86.anInt1760;
	    int i_4_ = i - Class114.anInt2160;
	    int i_5_ = (int) Math.sqrt((double) (i_2_ * i_2_ + i_4_ * i_4_));
	    Class67_Sub1_Sub2.anInt3839
		= ((int) (Math.atan2((double) i_3_, (double) i_5_) * 325.949)
		   & 0x7ff);
	    Class67_Sub23.anInt3196
		= ((int) (-325.949 * Math.atan2((double) i_4_, (double) i_2_))
		   & 0x7ff);
	    if (Class67_Sub1_Sub2.anInt3839 < 128)
		Class67_Sub1_Sub2.anInt3839 = 128;
	    if ((Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff) < -384)
		Class67_Sub1_Sub2.anInt3839 = 383;
	}
	Class22.anInt530 = 2;
    }
    
    public Class14() {
	this(-1, 1000000, 1000000);
    }
    
    public static int method160(int arg0, byte arg1, int arg2, boolean arg3) {
	anInt438++;
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -42, (long) arg2));
	if (class67_sub8 == null)
	    return 0;
	int i = 0;
	for (int i_6_ = 0; ((class67_sub8.anIntArray2965.length ^ 0xffffffff)
			    < (i_6_ ^ 0xffffffff)); i_6_++) {
	    if ((class67_sub8.anIntArray2965[i_6_] ^ 0xffffffff) <= -1
		&& ((Class67_Sub1_Sub29.anInt4270 ^ 0xffffffff)
		    < (class67_sub8.anIntArray2965[i_6_] ^ 0xffffffff))) {
		Class76 class76
		    = PacketParser.method1596(class67_sub8.anIntArray2965[i_6_],
					  -28322);
		if (class76.aClass92_1551 != null) {
		    Class67_Sub19 class67_sub19
			= ((Class67_Sub19)
			   class76.aClass92_1551.method1489((byte) -113,
							    (long) arg0));
		    if (class67_sub19 != null) {
			if (arg3)
			    i += (class67_sub8.anIntArray2961[i_6_]
				  * class67_sub19.anInt3149);
			else
			    i += class67_sub19.anInt3149;
		    }
		}
	    }
	}
	if (arg1 != 11)
	    method159(87, 105, -29, -13, 113, 121);
	return i;
    }
    
    public static int method161(int arg0, int arg1, int arg2) {
	int i = 74 % ((arg0 - 80) / 35);
	int i_7_ = 0;
	while ((arg2 ^ 0xffffffff) < -1) {
	    i_7_ = i_7_ << 1319315201 | arg1 & 0x1;
	    arg2--;
	    arg1 >>>= 1;
	}
	anInt440++;
	return i_7_;
    }
    
    public static void method162(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4, int arg5) {
	anInt439++;
	if ((arg3 ^ 0xffffffff) > -2)
	    arg3 = 1;
	if (arg5 < 1)
	    arg5 = 1;
	Class114.anInt2156 = (short) arg5;
	if (arg2 == 64)
	    Class116.anInt2196 = (short) arg3;
    }
    
    public static void method163(int arg0) {
	aRSString_449 = null;
	if (arg0 == -8) {
	    aRandom446 = null;
	    aBigInteger444 = null;
	}
    }
    
    public Class14(int arg0, int arg1, int arg2) {
	/* empty */
    }
    
    static {
	aRandom446 = new Random();
	aRSString_449 = Class134.method1914("_labels", (byte) 24);
    }
}
