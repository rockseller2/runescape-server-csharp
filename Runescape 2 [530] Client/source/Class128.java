import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class128
{
    public static int[] anIntArray2375;
    public static int anInt2376 = 0;
    public static boolean aBoolean2377 = false;
    public static int anInt2378;
    public static int anInt2379;
    public static int anInt2380;
    public static RSString aRSString_2381;
    public static int anInt2382;
    public static int anInt2383;
    public static int anInt2384;
    public static boolean aBoolean2385;
    public static Class131_Sub7_Sub1[] aClass131_Sub7_Sub1Array2386;
    public static int anInt2387;
    public static RSString aRSString_2388;
    
    public static void method1731(boolean arg0) {
	aClass131_Sub7_Sub1Array2386 = null;
	aRSString_2388 = null;
	anIntArray2375 = null;
	if (arg0 != true)
	    method1732(94, true);
	aRSString_2381 = null;
    }
    
    public static boolean method1732(int arg0, boolean arg1) {
	if (arg1 != true)
	    return false;
	anInt2384++;
	if (arg0 != 198 && arg0 != 230 && (arg0 ^ 0xffffffff) != -157
	    && (arg0 ^ 0xffffffff) != -141 && (arg0 ^ 0xffffffff) != -224)
	    return false;
	return true;
    }
    
    public static String method1733(byte arg0, Throwable arg1)
	throws IOException {
	anInt2380++;
	String string;
	if (!(arg1 instanceof RuntimeException_Sub1))
	    string = "";
	else {
	    RuntimeException_Sub1 runtimeexception_sub1
		= (RuntimeException_Sub1) arg1;
	    string = runtimeexception_sub1.aString2624 + " | ";
	    arg1 = runtimeexception_sub1.aThrowable2608;
	}
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	arg1.printStackTrace(printwriter);
	printwriter.close();
	if (arg0 != 7)
	    method1734(92, (byte) 23);
	String string_0_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_0_));
	String string_1_ = bufferedreader.readLine();
	for (;;) {
	    String string_2_ = bufferedreader.readLine();
	    if (string_2_ == null)
		break;
	    int i = string_2_.indexOf('(');
	    int i_3_ = string_2_.indexOf(')', 1 + i);
	    String string_4_;
	    if (i != -1)
		string_4_ = string_2_.substring(0, i);
	    else
		string_4_ = string_2_;
	    string_4_ = string_4_.trim();
	    string_4_ = string_4_.substring(string_4_.lastIndexOf(' ') - -1);
	    string_4_ = string_4_.substring(1 + string_4_.lastIndexOf('\t'));
	    string += string_4_;
	    if ((i ^ 0xffffffff) != 0 && (i_3_ ^ 0xffffffff) != 0) {
		int i_5_ = string_2_.indexOf(".java:", i);
		if ((i_5_ ^ 0xffffffff) <= -1)
		    string += string_2_.substring(i_5_ - -5, i_3_);
	    }
	    string += ' ';
	}
	string += "| " + (String) string_1_;
	return string;
    }
    
    public static boolean method1734(int arg0, byte arg1) {
	anInt2379++;
	if (arg1 != -105)
	    return false;
	if (arg0 < 48 || (arg0 ^ 0xffffffff) < -58)
	    return false;
	return true;
    }
    
    public static Class23 method1735(int arg0, Stream arg1) {
	anInt2387++;
	if (arg0 != 1)
	    anInt2383 = -41;
	Class23 class23 = new Class23();
	class23.anInt559 = arg1.readUShort(arg0 + -2387);
	class23.aClass67_Sub5_Sub12_567
	    = Class11.method143(class23.anInt559, -32769);
	return class23;
    }
    
    static {
	anIntArray2375 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	anInt2383 = 0;
	aRSString_2381 = Class134.method1914("<col=ffffff>", (byte) 77);
	aClass131_Sub7_Sub1Array2386 = new Class131_Sub7_Sub1[32768];
	aBoolean2385 = true;
	aRSString_2388
	    = Class134.method1914("Eingabeprozedur geladen)3", (byte) 99);
    }
}
