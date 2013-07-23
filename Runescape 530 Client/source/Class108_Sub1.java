/* Class108_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class108_Sub1 extends Class108
{
    public ByteBuffer aByteBuffer3409;
    
    public byte[] method1577(byte arg0) {
	byte[] is = new byte[aByteBuffer3409.capacity()];
	aByteBuffer3409.position(0);
	int i = 111 / ((40 - arg0) / 58);
	aByteBuffer3409.get(is);
	return is;
    }
    
    public void method1576(byte arg0, byte[] arg1) {
	if (arg0 == 60) {
	    aByteBuffer3409 = ByteBuffer.allocateDirect(arg1.length);
	    aByteBuffer3409.position(0);
	    aByteBuffer3409.put(arg1);
	}
    }
}
