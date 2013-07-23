import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class28_Sub2 extends Class28
{
    public boolean aBoolean2757 = false;
    public int anInt2758;
    public AudioFormat anAudioFormat2759;
    public SourceDataLine aSourceDataLine2760;
    public byte[] aByteArray2761;
    public static Class aClass2762;
    
    public int method262() {
	return anInt2758 - (aSourceDataLine2760.available()
			    >> (!Class25.aBoolean605 ? 1 : 2));
    }
    
    public void method269(int arg0) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass2762 == null
		     ? (aClass2762
			= method277("javax.sound.sampled.SourceDataLine"))
		     : aClass2762),
		    anAudioFormat2759,
		    arg0 << (!Class25.aBoolean605 ? 1 : 2)));
	    aSourceDataLine2760 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine2760.open();
	    aSourceDataLine2760.start();
	    anInt2758 = arg0;
	} catch (LineUnavailableException lineunavailableexception) {
	    if (Class67_Sub1_Sub13.method676(0, arg0) != 1)
		method269(Class67_Sub1_Sub31.method765(115, arg0));
	    else {
		aSourceDataLine2760 = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    public void method272(Component arg0) {
	Mixer.Info[] infos = AudioSystem.getMixerInfo();
	if (infos != null) {
	    int i = 0;
	    for (Mixer.Info[] infos_0_ = infos; infos_0_.length > i; i++) {
		Mixer.Info info = infos_0_[i];
		if (info != null) {
		    String string = info.getName();
		    if (null != string
			&& -1 >= (string.toLowerCase().indexOf("soundmax")
				  ^ 0xffffffff))
			aBoolean2757 = true;
		}
	    }
	}
	anAudioFormat2759
	    = new AudioFormat((float) Class89.anInt1833, 16,
			      Class25.aBoolean605 ? 2 : 1, true, false);
	aByteArray2761 = new byte[256 << (!Class25.aBoolean605 ? 1 : 2)];
    }
    
    public void method275() {
	if (null != aSourceDataLine2760) {
	    aSourceDataLine2760.close();
	    aSourceDataLine2760 = null;
	}
    }
    
    public void method263() throws LineUnavailableException {
	aSourceDataLine2760.flush();
	if (aBoolean2757) {
	    aSourceDataLine2760.close();
	    aSourceDataLine2760 = null;
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass2762 == null
		     ? (aClass2762
			= method277("javax.sound.sampled.SourceDataLine"))
		     : aClass2762),
		    anAudioFormat2759,
		    anInt2758 << (!Class25.aBoolean605 ? 1 : 2)));
	    aSourceDataLine2760 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine2760.open();
	    aSourceDataLine2760.start();
	}
    }
    
    public void method273() {
	int i = 256;
	if (Class25.aBoolean605)
	    i <<= 1;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = anIntArray651[i_1_];
	    if ((i_2_ + 8388608 & ~0xffffff) != 0)
		i_2_ = 0x7fffff ^ i_2_ >> 31;
	    aByteArray2761[i_1_ * 2] = (byte) (i_2_ >> 8);
	    aByteArray2761[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
	}
	aSourceDataLine2760.write(aByteArray2761, 0, i << 1);
    }
    
    public static Class method277(String arg0) {
	Class var_class;
	try {
	    var_class = Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
}
