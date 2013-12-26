/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class93
{
    public long aLong1882;
    public long aLong1883;
    public File aFile1884;
    public RandomAccessFile aRandomAccessFile1885;
    
    public Class93(File file, String string, long l) throws IOException {
	if (l == -1L)
	    l = 9223372036854775807L;
	if ((file.length() ^ 0xffffffffffffffffL) <= (l ^ 0xffffffffffffffffL))
	    file.delete();
	aRandomAccessFile1885 = new RandomAccessFile(file, string);
	aFile1884 = file;
	aLong1882 = l;
	aLong1883 = 0L;
	int i = aRandomAccessFile1885.read();
	if (i != -1 && !string.equals("r")) {
	    aRandomAccessFile1885.seek(0L);
	    aRandomAccessFile1885.write(i);
	}
	aRandomAccessFile1885.seek(0L);
    }
    
    public int method1490(int arg0, byte[] arg1, int arg2, int arg3)
	throws IOException {
	int i = aRandomAccessFile1885.read(arg1, arg2, arg0);
	if ((i ^ 0xffffffff) < arg3)
	    aLong1883 += (long) i;
	return i;
    }
    
    public void method1491(int arg0) throws IOException {
	if (arg0 != -1)
	    aFile1884 = null;
	if (aRandomAccessFile1885 != null) {
	    aRandomAccessFile1885.close();
	    aRandomAccessFile1885 = null;
	}
    }
    
    public void method1492(int arg0, byte[] arg1, int arg2, byte arg3)
	throws IOException {
	if ((aLong1882 ^ 0xffffffffffffffffL)
	    > ((long) arg0 - -aLong1883 ^ 0xffffffffffffffffL)) {
	    aRandomAccessFile1885.seek(1L + aLong1882);
	    aRandomAccessFile1885.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile1885.write(arg1, arg2, arg0);
	if (arg3 < 78)
	    method1495((byte) 24);
	aLong1883 += (long) arg0;
    }
    
    public void method1493(int arg0, long arg1) throws IOException {
	if (arg0 != 0)
	    method1495((byte) 15);
	aRandomAccessFile1885.seek(arg1);
	aLong1883 = arg1;
    }
    
    public long method1494(int arg0) throws IOException {
	if (arg0 != 0)
	    return -77L;
	return aRandomAccessFile1885.length();
    }
    
    public File method1495(byte arg0) {
	if (arg0 >= -47)
	    return null;
	return aFile1884;
    }
    
    public void finalize() throws Throwable {
	if (aRandomAccessFile1885 != null) {
	    System.out.println
		("Warning! fileondisk " + aFile1884
		 + " not closed correctly using close(). Auto-closing instead. ");
	    method1491(-1);
	}
    }
}
