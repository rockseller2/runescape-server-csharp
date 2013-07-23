/* Class67_Sub1_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class67_Sub1_Sub28 extends Class67_Sub1
{
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_4249;
    public static int anInt4250;
    public static int[] anIntArray4251
	= { 12543016, 15504954, 15914854, 16773818 };
    public static Class137 aClass137_4252 = new Class137(64);
    public static int anInt4253;
    public static int anInt4254;
    public static int[] anIntArray4255 = new int[128];
    public static RSString aRSString_4256
	= Class134.method1914("mapfunction", (byte) 30);
    public static boolean aBoolean4257 = false;
    public static int anInt4258 = 0;
    
    public static void method747(byte arg0) {
	aRSString_4256 = null;
	anIntArray4251 = null;
	aClass137_4252 = null;
	aClass67_Sub5_Sub19_4249 = null;
	anIntArray4255 = null;
	if (arg0 != -54)
	    method749(-30);
    }
    
    public static void method748(int arg0, boolean arg1) {
	if (arg1 != true)
	    aRSString_4256 = null;
	if (!Class67_Sub1_Sub38.aBoolean4431)
	    arg0 = -1;
	anInt4250++;
	if (arg0 != Class107.anInt2069) {
	    if ((arg0 ^ 0xffffffff) != 0) {
		Class32 class32 = Class126_Sub2.method1717(true, arg0);
		Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
		    = class32.method286(-6864);
		if (class67_sub5_sub19_sub1 != null) {
		    Class124.aSignLink_2335.method395
			(class67_sub5_sub19_sub1.anInt4825, (byte) 122,
			 class67_sub5_sub19_sub1.anInt4815,
			 Class67_Sub5_Sub12.aCanvas4698,
			 class67_sub5_sub19_sub1.method1010(),
			 new Point(class32.anInt725, class32.anInt714));
		    Class107.anInt2069 = arg0;
		} else
		    arg0 = -1;
	    }
	    if ((arg0 ^ 0xffffffff) == 0 && Class107.anInt2069 != -1) {
		Class124.aSignLink_2335.method395(-1, (byte) 100, -1,
						 (Class67_Sub5_Sub12
						  .aCanvas4698),
						 null, new Point());
		Class107.anInt2069 = -1;
	    }
	}
    }
    
    public static void method749(int arg0) {
	anInt4253++;
	Class55_Sub3.anInt2807 = 0;
	Class126_Sub2.anInt3439 = 0;
	Class70_Sub1.playerUpdatePackets(83); //player Update bit access bit flags
	Class12.updateSeenPlayers(false);
	Class100.updateNewPlayers((byte) 88);
	InputStream_Sub1.method49(-22028);
	for (int i = 0;
	     (Class55_Sub3.anInt2807 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    int i_0_ = Class67_Sub1_Sub2.anIntArray3830[i];
	    if (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_0_].anInt3789
		!= Class67_Sub1_Sub9.anInt3952) {
		if (((Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_0_]
		      .lastByte)
		     ^ 0xffffffff)
		    < -1)
		    Class126_Sub4.method1722(false,
					     (Class67_Sub5_Sub18
					      .aClass131_Sub7_Sub2Array4810
					      [i_0_]));
		Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_0_] = null;
	    }
	}
	if ((Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff)
	    != (Class54.aPacketStream_1069.currentOffset ^ 0xffffffff))
	    throw new RuntimeException("gpp1 pos:"
				       + (Class54.aPacketStream_1069
					  .currentOffset)
				       + " psize:"
				       + Class67_Sub5_Sub1.lastPacketSize);
	int i = 0;
	if (arg0 != -1)
	    method747((byte) -118);
	for (/**/; i < Class67_Sub1_Sub4.anInt3855; i++) {
	    if ((Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		 [Class3.anIntArray120[i]])
		== null)
		throw new RuntimeException("gpp2 pos:" + i + " size:"
					   + Class67_Sub1_Sub4.anInt3855);
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4254++;
	if (arg1 != 55)
	    anIntArray4255 = null;
	return Class67_Sub1_Sub35.anIntArray4344;
    }
    
    public static void method750(int arg0, int arg1, int arg2) {
	Class67_Sub1_Sub20.aBoolean4144 = true;
	Class8.anInt349 = arg0;
	Class99.anInt1964 = arg1;
	Class109.anInt2086 = arg2;
	Class119.anInt2260 = -1;
	Class131_Sub3.anInt3630 = -1;
    }
    
    public Class67_Sub1_Sub28() {
	super(0, true);
    }
}
