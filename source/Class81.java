/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81
{
    public int anInt1629 = 128;
    public static int anInt1630;
    public static int anInt1631;
    public int anInt1632;
    public static int anInt1633;
    public boolean aBoolean1634;
    public int anInt1635;
    public short[] aShortArray1636;
    public int anInt1637 = 0;
    public short[] aShortArray1638;
    public int anInt1639;
    public static int anInt1640;
    public static int anInt1641;
    public short[] aShortArray1642;
    public int anInt1643;
    public static RSString aRSString_1644;
    public int anInt1645;
    public short[] aShortArray1646;
    public static RSString aRSString_1647
	= Class134.method1914("<col=ff0000>", (byte) 44);
    public static Class134 aClass134_1648;
    public int anInt1649;
    public static RSString aRSString_1650;
    public static RSString aRSString_1651;
    public static RSString aRSString_1652;
    public static int anInt1653;
    public static RSString aRSString_1654;
    public static int anInt1655;
    public static int[] anIntArray1656;
    public static RSString aRSString_1657;
    public static RSString aRSString_1658;
    
    public void method1426(int arg0, Stream arg1, int arg2) {
	anInt1631++;
	if ((arg0 ^ 0xffffffff) == -2)
	    anInt1645 = arg1.readUShort(-2386);
	else if ((arg0 ^ 0xffffffff) == -3)
	    anInt1639 = arg1.readUShort(-2386);
	else if (arg0 != 4) {
	    if ((arg0 ^ 0xffffffff) != -6) {
		if (arg0 == 6)
		    anInt1637 = arg1.readUShort(-2386);
		else if (arg0 == 7)
		    anInt1643 = arg1.readByte((byte) 111);
		else if (arg0 != 8) {
		    if ((arg0 ^ 0xffffffff) == -10)
			aBoolean1634 = true;
		    else if ((arg0 ^ 0xffffffff) == -41) {
			int i = arg1.readByte((byte) 119);
			aShortArray1646 = new short[i];
			aShortArray1642 = new short[i];
			for (int i_0_ = 0;
			     (i ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
			    aShortArray1646[i_0_]
				= (short) arg1.readUShort(-2386);
			    aShortArray1642[i_0_]
				= (short) arg1.readUShort(-2386);
			}
		    } else if (arg0 == 41) {
			int i = arg1.readByte((byte) -119);
			aShortArray1636 = new short[i];
			aShortArray1638 = new short[i];
			for (int i_1_ = 0;
			     (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++) {
			    aShortArray1636[i_1_]
				= (short) arg1.readUShort(-2386);
			    aShortArray1638[i_1_]
				= (short) arg1.readUShort(-2386);
			}
		    }
		} else
		    anInt1649 = arg1.readByte((byte) 99);
	    } else
		anInt1629 = arg1.readUShort(-2386);
	} else
	    anInt1635 = arg1.readUShort(-2386);
	int i = 12 % ((arg2 - 24) / 55);
    }
    
    public void method1427(boolean arg0, Stream arg1) {
	anInt1630++;
	if (arg0 != false)
	    anInt1639 = 11;
	for (;;) {
	    int i = arg1.readByte((byte) 82);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method1426(i, arg1, -100);
	}
    }
    
    public Class131_Sub6 method1428(int arg0, byte arg1, int arg2, int arg3) {
	anInt1640++;
	Class131_Sub6 class131_sub6
	    = ((Class131_Sub6)
	       Class67_Sub5_Sub9.aClass136_4612.method1924((long) anInt1632,
							   false));
	if (arg1 > -43)
	    return null;
	if (class131_sub6 == null) {
	    Class131_Sub2 class131_sub2
		= Class131_Sub2.method1780(Class36.aClass9_774, anInt1645, 0);
	    if (class131_sub2 == null)
		return null;
	    if (aShortArray1646 != null) {
		for (int i = 0; aShortArray1646.length > i; i++)
		    class131_sub2.method1796(aShortArray1646[i],
					     aShortArray1642[i]);
	    }
	    if (aShortArray1636 != null) {
		for (int i = 0; aShortArray1636.length > i; i++)
		    class131_sub2.method1791(aShortArray1636[i],
					     aShortArray1638[i]);
	    }
	    class131_sub6
		= class131_sub2.method1787(anInt1643 + 64, 850 + anInt1649,
					   -30, -50, -30);
	    Class67_Sub5_Sub9.aClass136_4612
		.method1926((long) anInt1632, class131_sub6, (byte) -71);
	}
	Class131_Sub6 class131_sub6_2_;
	if (anInt1639 != -1 && (arg3 ^ 0xffffffff) != 0)
	    class131_sub6_2_
		= Class120.method1666(anInt1639, -32)
		      .method362(91, arg2, class131_sub6, arg3, arg0);
	else
	    class131_sub6_2_ = class131_sub6.method1833(true, true, true);
	if ((anInt1635 ^ 0xffffffff) != -129 || anInt1629 != 128)
	    class131_sub6_2_.method1845(anInt1635, anInt1629, anInt1635);
	if (anInt1637 != 0) {
	    if (anInt1637 == 90)
		class131_sub6_2_.method1839();
	    if ((anInt1637 ^ 0xffffffff) == -181)
		class131_sub6_2_.method1829();
	    if (anInt1637 == 270)
		class131_sub6_2_.method1848();
	}
	return class131_sub6_2_;
    }
    
    public static void method1429(Class67_Sub30 arg0, int arg1) {
	int i = 99 / ((16 - arg1) / 40);
	Class67_Sub5_Sub6.method871(arg0, -22368, 200000);
	anInt1633++;
    }
    
    public static void method1430(byte arg0) {
	aRSString_1657 = null;
	aRSString_1658 = null;
	aClass134_1648 = null;
	aRSString_1652 = null;
	aRSString_1651 = null;
	aRSString_1650 = null;
	if (arg0 >= -71)
	    method1429(null, -82);
	anIntArray1656 = null;
	aRSString_1654 = null;
	aRSString_1644 = null;
	aRSString_1647 = null;
    }
    
    public static void method1431(long arg0, int arg1) {
	try {
	    anInt1641++;
	    if (arg0 != 0L && arg1 >= 106) {
		Class10.anInt400++;
		Class70_Sub1.outStream.createFrame(2, 104);	//CLAN_CHAT
		Class70_Sub1.outStream.writeLong(2, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("li.F(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class81() {
	anInt1635 = 128;
	anInt1643 = 0;
	aBoolean1634 = false;
	anInt1639 = -1;
	anInt1649 = 0;
    }
    
    static {
	aRSString_1644 = Class134.method1914(")2", (byte) 52);
	aClass134_1648 = new Class134();
	aRSString_1652
	    = Class134.method1914("W-=hlen Sie eine Option", (byte) 124);
	anInt1653 = -1;
	aRSString_1657
	    = Class134.method1914("D-Bmarrage de la librairie 3D", (byte) 37);
	aRSString_1650 = Class134.method1914("flash3:", (byte) 10);
	aRSString_1651 = aRSString_1650;
	aRSString_1658 = Class134.method1914("(U1", (byte) 9);
	aRSString_1654 = aRSString_1650;
	anInt1655 = 2;
    }
}
