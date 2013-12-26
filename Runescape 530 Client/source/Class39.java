public class Class39
{
    public static long aLong812;
    public static long aLong813;
    
    public static synchronized long method337(int arg0) {
	if (arg0 != 19644)
	    method337(-96);
	long l = System.currentTimeMillis();
	if ((aLong812 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))
	    aLong813 += -l + aLong812;
	aLong812 = l;
	return l + aLong813;
    }
}
