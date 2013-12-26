/* Class67_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub11_Sub1 extends Class67_Sub11
{
    public Class50 aClass50_4843 = new Class50();
    public Class50 aClass50_4844 = new Class50();
    public int anInt4845;
    public int anInt4846 = -1;
    
    public void method1129(Class67_Sub2 arg0) {
	arg0.method606((byte) -118);
	arg0.method814();
	Class67 class67 = aClass50_4844.aClass67_1014.aClass67_1340;
	if (class67 == aClass50_4844.aClass67_1014)
	    anInt4846 = -1;
	else
	    anInt4846 = ((Class67_Sub2) class67).anInt2841;
    }
    
    public int method1128() {
	return 0;
    }
    
    public synchronized void method1127(int[] arg0, int arg1, int arg2) {
	do {
	    if (anInt4846 < 0) {
		method1134(arg0, arg1, arg2);
		break;
	    }
	    if (anInt4845 + arg2 < anInt4846) {
		anInt4845 += arg2;
		method1134(arg0, arg1, arg2);
		break;
	    }
	    int i = anInt4846 - anInt4845;
	    method1134(arg0, arg1, i);
	    arg1 += i;
	    arg2 -= i;
	    anInt4845 += i;
	    method1135();
	    Class67_Sub2 class67_sub2
		= (Class67_Sub2) aClass50_4844.method445(0);
	    synchronized (class67_sub2) {
		int i_0_ = class67_sub2.method813(this);
		if (i_0_ < 0) {
		    class67_sub2.anInt2841 = 0;
		    method1129(class67_sub2);
		} else {
		    class67_sub2.anInt2841 = i_0_;
		    method1130(class67_sub2.aClass67_1340, class67_sub2);
		}
	    }
	} while (arg2 != 0);
    }
    
    public void method1130(Class67 arg0, Class67_Sub2 arg1) {
	for (/**/;
	     (arg0 != aClass50_4844.aClass67_1014
	      && ((Class67_Sub2) arg0).anInt2841 <= arg1.anInt2841);
	     arg0 = arg0.aClass67_1340) {
	    /* empty */
	}
	Class67_Sub5_Sub13.method960(arg1, arg0, 27578);
	anInt4846 = (((Class67_Sub2) aClass50_4844.aClass67_1014.aClass67_1340)
		     .anInt2841);
    }
    
    public void method1131(int arg0) {
	for (Class67_Sub11 class67_sub11
		 = (Class67_Sub11) aClass50_4843.method445(0);
	     class67_sub11 != null;
	     class67_sub11 = (Class67_Sub11) aClass50_4843.method432(0))
	    class67_sub11.method1123(arg0);
    }
    
    public synchronized void method1132(Class67_Sub11 arg0) {
	aClass50_4843.method441(arg0, (byte) 52);
    }
    
    public synchronized void method1133(Class67_Sub11 arg0) {
	arg0.method606((byte) -118);
    }
    
    public Class67_Sub11 method1122() {
	return (Class67_Sub11) aClass50_4843.method445(0);
    }
    
    public Class67_Sub11 method1124() {
	return (Class67_Sub11) aClass50_4843.method432(0);
    }
    
    public void method1134(int[] arg0, int arg1, int arg2) {
	for (Class67_Sub11 class67_sub11
		 = (Class67_Sub11) aClass50_4843.method445(0);
	     class67_sub11 != null;
	     class67_sub11 = (Class67_Sub11) aClass50_4843.method432(0))
	    class67_sub11.method1125(arg0, arg1, arg2);
    }
    
    public void method1135() {
	if (anInt4845 > 0) {
	    for (Class67_Sub2 class67_sub2
		     = (Class67_Sub2) aClass50_4844.method445(0);
		 class67_sub2 != null;
		 class67_sub2 = (Class67_Sub2) aClass50_4844.method432(0))
		class67_sub2.anInt2841 -= anInt4845;
	    anInt4846 -= anInt4845;
	    anInt4845 = 0;
	}
    }
    
    public synchronized void method1123(int arg0) {
	do {
	    if (anInt4846 < 0) {
		method1131(arg0);
		break;
	    }
	    if (anInt4845 + arg0 < anInt4846) {
		anInt4845 += arg0;
		method1131(arg0);
		break;
	    }
	    int i = anInt4846 - anInt4845;
	    method1131(i);
	    arg0 -= i;
	    anInt4845 += i;
	    method1135();
	    Class67_Sub2 class67_sub2
		= (Class67_Sub2) aClass50_4844.method445(0);
	    synchronized (class67_sub2) {
		int i_1_ = class67_sub2.method813(this);
		if (i_1_ < 0) {
		    class67_sub2.anInt2841 = 0;
		    method1129(class67_sub2);
		} else {
		    class67_sub2.anInt2841 = i_1_;
		    method1130(class67_sub2.aClass67_1340, class67_sub2);
		}
	    }
	} while (arg0 != 0);
    }
    
    public Class67_Sub11_Sub1() {
	anInt4845 = 0;
    }
}
