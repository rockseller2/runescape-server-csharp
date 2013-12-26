/* Login_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Login_Sub1 extends Login implements MouseWheelListener
{
    public int anInt3376 = 0;
    
    public synchronized int method1414(byte arg0) {
	if (arg0 != -56)
	    anInt3376 = -19;
	int i = anInt3376;
	anInt3376 = 0;
	return i;
    }
    
    public void method1417(boolean arg0, Component arg1) {
	arg1.addMouseWheelListener(this);
	if (arg0)
	    method1417(true, null);
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
	anInt3376 += arg0.getWheelRotation();
    }
    
    public void method1420(byte arg0, Component arg1) {
	arg1.removeMouseWheelListener(this);
	if (arg0 != 52)
	    method1417(false, null);
    }
}
