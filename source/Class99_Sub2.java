/* Class99_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class99_Sub2 extends Class99
{
    public Component aComponent3408;
    
    public void method1520(int arg0, int arg1, Component arg2, byte arg3) {
	if (arg3 > -16)
	    method1520(40, 21, null, (byte) 77);
	anIntArray1967 = new int[arg1 * arg0 + 1];
	anInt1958 = arg0;
	anInt1962 = arg1;
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray1967, anIntArray1967.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       (directcolormodel.createCompatibleSampleModel(anInt1962,
							     anInt1958),
		databufferint, null));
	anImage1955 = new BufferedImage(directcolormodel, writableraster,
					false, new Hashtable());
	aComponent3408 = arg2;
	method1524(0);
    }
    
    public void method1518(int arg0, int arg1, int arg2, Graphics arg3) {
	arg3.drawImage(anImage1955, arg1, arg2, aComponent3408);
	if (arg0 != 1000)
	    method1518(86, 97, 53, null);
    }
    
    public void method1522(byte arg0, int arg1, int arg2, int arg3, int arg4,
			   Graphics arg5) {
	if (arg0 != -6)
	    method1520(-83, -22, null, (byte) -103);
	Shape shape = arg5.getClip();
	arg5.clipRect(arg3, arg4, arg2, arg1);
	arg5.drawImage(anImage1955, 0, 0, aComponent3408);
	arg5.setClip(shape);
    }
}
