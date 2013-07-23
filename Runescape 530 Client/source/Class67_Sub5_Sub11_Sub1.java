/* Class67_Sub5_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class67_Sub5_Sub11_Sub1 extends Class67_Sub5_Sub11
{
    public SoftReference aSoftReference5137;
    
    public Object method935(boolean arg0) {
	if (arg0 != true)
	    aSoftReference5137 = null;
	return aSoftReference5137.get();
    }
    
    public boolean method938(boolean arg0) {
	if (arg0 != true)
	    aSoftReference5137 = null;
	return true;
    }
    
    public Class67_Sub5_Sub11_Sub1(Object arg0) {
	aSoftReference5137 = new SoftReference(arg0);
    }
}
