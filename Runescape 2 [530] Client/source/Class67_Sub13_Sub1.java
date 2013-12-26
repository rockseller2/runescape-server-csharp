/* Class67_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub13_Sub1 extends Class67_Sub13
{
    public byte[] aByteArray4956;
    public int anInt4957;
    public int anInt4958;
    public boolean aBoolean4959;
    public int anInt4960;
    
    public Class67_Sub13_Sub1 method1222(Class54 arg0) {
	aByteArray4956 = arg0.method459(aByteArray4956, false);
	anInt4958 = arg0.method457((byte) -81, anInt4958);
	if (anInt4957 == anInt4960)
	    anInt4957 = anInt4960 = arg0.method456(anInt4957, (byte) 125);
	else {
	    anInt4957 = arg0.method456(anInt4957, (byte) 57);
	    anInt4960 = arg0.method456(anInt4960, (byte) 73);
	    if (anInt4957 == anInt4960)
		anInt4957--;
	}
	return this;
    }
    
    public Class67_Sub13_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
	anInt4958 = arg0;
	aByteArray4956 = arg1;
	anInt4957 = arg2;
	anInt4960 = arg3;
    }
    
    public Class67_Sub13_Sub1(int arg0, byte[] arg1, int arg2, int arg3,
			      boolean arg4) {
	anInt4958 = arg0;
	aByteArray4956 = arg1;
	anInt4957 = arg2;
	anInt4960 = arg3;
	aBoolean4959 = arg4;
    }
}
