public class Class35
{
    public int anInt754;
    public int anInt755;
    public int anInt756;
    public int[] anIntArray757;
    public int anInt758 = 2;
    public int[] anIntArray759 = new int[2];
    public int anInt760;
    public int anInt761;
    public int anInt762;
    public int anInt763;
    public int anInt764;
    
    public void method310() {
	anInt761 = 0;
	anInt763 = 0;
	anInt762 = 0;
	anInt760 = 0;
	anInt764 = 0;
    }
    
    public void method311(Stream arg0) {
	anInt755 = arg0.readByte((byte) -47);
	anInt754 = arg0.readInt((byte) 126);
	anInt756 = arg0.readInt((byte) 127);
	method312(arg0);
    }
    
    public Class35() {
	anIntArray757 = new int[2];
	anIntArray759[0] = 0;
	anIntArray759[1] = 65535;
	anIntArray757[0] = 0;
	anIntArray757[1] = 65535;
    }
    
    public void method312(Stream arg0) {
	anInt758 = arg0.readByte((byte) 89);
	anIntArray759 = new int[anInt758];
	anIntArray757 = new int[anInt758];
	for (int i = 0; i < anInt758; i++) {
	    anIntArray759[i] = arg0.readUShort(-2386);
	    anIntArray757[i] = arg0.readUShort(-2386);
	}
    }
    
    public int method313(int arg0) {
	if (anInt764 >= anInt761) {
	    anInt760 = anIntArray757[anInt763++] << 15;
	    if (anInt763 >= anInt758)
		anInt763 = anInt758 - 1;
	    anInt761 = (int) ((double) anIntArray759[anInt763] / 65536.0
			      * (double) arg0);
	    if (anInt761 > anInt764)
		anInt762 = (((anIntArray757[anInt763] << 15) - anInt760)
			    / (anInt761 - anInt764));
	}
	anInt760 += anInt762;
	anInt764++;
	return anInt760 - anInt762 >> 15;
    }
}
