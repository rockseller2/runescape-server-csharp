import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class117 implements Runnable
{
    public static int anInt2201 = 0;
    public static int anInt2202;
    public OutputStream anOutputStream2203;
    public static int anInt2204 = 0;
    public static int anInt2205;
    public InputStream anInputStream2206;
    public static RSString aRSString_2207
	= Class134.method1914("Librairie 3D d-Bmarr-Be", (byte) 42);
    public static int anInt2208;
    public SignLink aSignLink_2209;
    public static int anInt2210;
    public static int anInt2211;
    public static int anInt2212;
    public boolean aBoolean2213;
    public Class31 aClass31_2214;
    public int anInt2215 = 0;
    public Socket aSocket2216;
    public int anInt2217;
    public static RSString aRSString_2218;
    public static int anInt2219;
    public static int anInt2220;
    public static int anInt2221;
    public static RSString aRSString_2222;
    public static RSString aRSString_2223
	= Class134.method1914("blinken3:", (byte) 25);
    public static int anInt2224;
    public boolean aBoolean2225;
    public static int anInt2226;
    public static RSString aRSString_2227;
    public byte[] aByteArray2228;
    public static int anInt2229;
    
    public void run() {
	try {
	    for (;;) {
		int i;
		int i_0_;
		synchronized (this) {
		    if (anInt2217 == anInt2215) {
			if (aBoolean2213)
			    break;
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    if ((anInt2215 ^ 0xffffffff) <= (anInt2217 ^ 0xffffffff))
			i = -anInt2217 + anInt2215;
		    else
			i = -anInt2217 + 5000;
		    i_0_ = anInt2217;
		}
		if ((i ^ 0xffffffff) < -1) {
		    try {
			anOutputStream2203.write(aByteArray2228, i_0_, i);
		    } catch (IOException ioexception) {
			aBoolean2225 = true;
		    }
		    anInt2217 = (anInt2217 - -i) % 5000;
		    try {
			if (anInt2217 == anInt2215)
			    anOutputStream2203.flush();
		    } catch (IOException ioexception) {
			aBoolean2225 = true;
		    }
		}
	    }
	    try {
		if (anInputStream2206 != null)
		    anInputStream2206.close();
		if (anOutputStream2203 != null)
		    anOutputStream2203.close();
		if (aSocket2216 != null)
		    aSocket2216.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	    aByteArray2228 = null;
	} catch (Exception exception) {
	    Class104.method1563(exception, null, 1);
	}
	anInt2220++;
    }
    
    public void finalize() {
	method1632((byte) 126);
	anInt2226++;
    }
    
    public int method1626(int arg0) throws IOException {
	int i = -100 % ((arg0 - 60) / 37);
	anInt2219++;
	if (aBoolean2213)
	    return 0;
	return anInputStream2206.available();
    }
    
    public void method1627(int arg0) throws IOException {
	anInt2208++;
	if (arg0 != 5000)
	    aSocket2216 = null;
	if (!aBoolean2213) {
	    if (aBoolean2225) {
		aBoolean2225 = false;
		throw new IOException();
	    }
	}
    }
    
    public void method1628(int arg0) {
	if (arg0 == 3) {
	    anInt2202++;
	    if (!aBoolean2213) {
		anInputStream2206 = new InputStream_Sub1();
		anOutputStream2203 = new OutputStream_Sub1();
	    }
	}
    }
    
    public void method1629(byte arg0, byte[] arg1, int arg2, int arg3)
	throws IOException {
	if (arg0 != -115)
	    aRSString_2223 = null;
	anInt2212++;
	if (!aBoolean2213) {
	    while ((arg3 ^ 0xffffffff) < -1) {
		int i = anInputStream2206.read(arg1, arg2, arg3);
		if (i <= 0)
		    throw new EOFException();
		arg3 -= i;
		arg2 += i;
	    }
	}
    }
    
    public static void method1630(int arg0, int arg1, int arg2) {
	anInt2229++;
	Class98 class98 = Class67_Sub29.method1312(31473, arg0);
	int i = class98.anInt1944;
	int i_1_ = class98.anInt1950;
	int i_2_ = class98.anInt1949;
	int i_3_ = Class67_Sub1_Sub15.anIntArray4050[-i + i_2_];
	if (arg1 > arg2 || (arg2 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
	    arg2 = 0;
	i_3_ <<= i;
	Class4.method75(112, i_1_,
			arg2 << i & i_3_ | (Class137.anIntArray2504[i_1_]
					    & (i_3_ ^ 0xffffffff)));
    }
    
    public int method1631(int arg0) throws IOException {
	if (arg0 != 17506)
	    anInt2224 = 78;
	anInt2221++;
	if (aBoolean2213)
	    return 0;
	return anInputStream2206.read();
    }
    
    public void method1632(byte arg0) {
	anInt2211++;
	if (!aBoolean2213) {
	    synchronized (this) {
		aBoolean2213 = true;
		int i = 56 / ((arg0 - 56) / 53);
		this.notifyAll();
	    }
	    if (aClass31_2214 != null) {
		while ((aClass31_2214.anInt706 ^ 0xffffffff) == -1)
		    Class67_Sub1_Sub23.method726(-107, 1L);
		if ((aClass31_2214.anInt706 ^ 0xffffffff) == -2) {
		    try {
			((Thread) aClass31_2214.anObject705).join();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    aClass31_2214 = null;
	}
    }
    
    public static void method1633(boolean arg0, byte arg1, int arg2, int arg3,
				  boolean arg4) {
	int i = 109 / ((40 - arg1) / 38);
	Class67_Sub1_Sub16.method691(0, arg3,
				     (-1
				      + Class73.aClass70_Sub1Array1474.length),
				     arg2, arg4, false, arg0);
	anInt2210++;
    }
    
    public void queueBytesToSend(int arg0, byte[] arg1, int arg2, byte arg3)
	throws IOException {
	anInt2205++;
	if (!aBoolean2213) {
	    if (aBoolean2225) {
		aBoolean2225 = false;
		throw new IOException();
	    }
	    if (aByteArray2228 == null)
		aByteArray2228 = new byte[5000];
	    synchronized (this) {
		for (int i = 0; (i ^ 0xffffffff) > (arg2 ^ 0xffffffff); i++) {
		    aByteArray2228[anInt2215] = arg1[arg0 + i];
		    anInt2215 = (anInt2215 - -1) % 5000;
		    if (((anInt2217 + 4900) % 5000 ^ 0xffffffff)
			== (anInt2215 ^ 0xffffffff))
			throw new IOException();
		}
		if (arg3 <= 59)
		    method1630(100, -37, -9);
		if (aClass31_2214 == null)
		    aClass31_2214 = aSignLink_2209.method404(2, this, 3);
		this.notifyAll();
	    }
	}
    }
    
    public static void method1635(int arg0) {
	aRSString_2207 = null;
	aRSString_2227 = null;
	aRSString_2218 = null;
	if (arg0 >= -3)
	    method1633(false, (byte) 114, -29, -113, false);
	aRSString_2222 = null;
	aRSString_2223 = null;
    }
    
    public Class117(Socket arg0, SignLink arg1) throws IOException {
	aBoolean2213 = false;
	anInt2217 = 0;
	aBoolean2225 = false;
	try {
	    aSignLink_2209 = arg1;
	    aSocket2216 = arg0;
	    aSocket2216.setSoTimeout(30000);
	    aSocket2216.setTcpNoDelay(true);
	    anInputStream2206 = aSocket2216.getInputStream();
	    anOutputStream2203 = aSocket2216.getOutputStream();
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("se.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aRSString_2218 = Class134.method1914(")4", (byte) 118);
	anInt2224 = 0;
	aRSString_2222 = Class134.method1914("Sprites charg-Bs", (byte) 125);
	aRSString_2227 = Class134.method1914("Angreifen", (byte) 73);
    }
}
