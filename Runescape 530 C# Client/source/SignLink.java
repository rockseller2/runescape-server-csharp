/* SignLink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.io.File;

public class SignLink implements Runnable
{
    public Thread aThread926;
    public Class93[] aClass93Array927;
    public Class31 aClass31_928;
    public Interface1 anInterface1_929;
    public EventQueue anEventQueue930;
    public static int anInt931 = 3;
    public static String aString932;
    public Class93 aClass93_933 = null;
    public static String aString934;
    public Class31 aClass31_935;
    public static String aString936;
    public static String aString937;
    public Class93 aClass93_938;
    public static String aString939;
    public Applet anApplet940;
    public static String aString941;
    public boolean aBoolean942;
    public static String aString943;
    public static Method aMethod944;
    public Class93 aClass93_945;
    public static volatile long aLong946;
    public static Method aMethod947;
    
    public Class31 method394(int arg0, URL arg1) {
	int i = -3 % ((arg0 - 2) / 62);
	return method399(0, arg1, 0, 0, 4);
    }
    
    public Class31 method395(int arg0, byte arg1, int arg2, Component arg3,
			     int[] arg4, Point arg5) {
	if (arg1 < 99)
	    return null;
	return method399(arg0, new Object[] { arg3, arg4, arg5 }, 0, arg2, 17);
    }
    
    public void run() {
	for (;;) {
	    Class31 class31;
	    synchronized (this) {
		for (;;) {
		    if (aBoolean942)
			return;
		    if (aClass31_928 != null) {
			class31 = aClass31_928;
			aClass31_928 = aClass31_928.aClass31_710;
			if (aClass31_928 == null)
			    aClass31_935 = null;
			break;
		    }
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		int i = class31.anInt709;
		if (i != 1) {
		    if (i == 2) {
			Thread thread
			    = new Thread((Runnable) class31.anObject708);
			thread.setDaemon(true);
			thread.start();
			thread.setPriority(class31.anInt707);
			class31.anObject705 = thread;
		    } else if ((i ^ 0xffffffff) != -5) {
			if (i == 8) {
			    Object[] objects = (Object[]) class31.anObject708;
			    class31.anObject705
				= (((Class) objects[0]).getDeclaredMethod
				   ((String) objects[1],
				    (Class[]) objects[2]));
			} else {
			    if ((i ^ 0xffffffff) != -10)
				throw new Exception();
			    Object[] objects = (Object[]) class31.anObject708;
			    class31.anObject705
				= ((Class) objects[0])
				      .getDeclaredField((String) objects[1]);
			}
		    } else {
			if ((Class39.method337(19644) ^ 0xffffffffffffffffL)
			    > (aLong946 ^ 0xffffffffffffffffL))
			    throw new IOException();
			class31.anObject705
			    = new DataInputStream(((URL) class31.anObject708)
						      .openStream());
		    }
		} else {
		    if (Class39.method337(19644) < aLong946)
			throw new IOException();
		    class31.anObject705
			= new Socket(InetAddress.getByName((String)
							   (class31
							    .anObject708)),
				     class31.anInt707);
		}
		class31.anInt706 = 1;
	    } catch (Throwable throwable) {
		class31.anInt706 = 2;
	    }
	}
    }
    
    public Class31 method396(String arg0, boolean arg1) {
	if (arg1 != true)
	    return null;
	return method399(0, arg0, 0, 0, 12);
    }
    
    public Class31 method397(Class[] arg0, int arg1, String arg2, Class arg3) {
	if (arg1 != -21828)
	    //method395(-128, (byte) -47, -91, null, null, null);
	    signlink530(-119, null, 20, -51);
	return method399(0, new Object[] { arg3, arg2, arg0 }, 0, 0, 8);
    }
    
    public File aFile2104;
    public File aFile2086 = null;
    
    public void signlink530(int i, String string, int i2, int i3) {
	i = 32;
	String[] cacheDirs = { "c:/cache530/rs2" };
	for (int dirId = 0; dirId < cacheDirs.length; dirId++) {
            try {
                File file = new File(cacheDirs[dirId]);
                if (!file.exists()) {
                    boolean bool = file.mkdir();
                    if (!bool) {
                        continue;
                    }
                }
                if (aClass93_933 == null) {
                    try {
                        File randomFile = new File(file, "random.dat");
                        if (!randomFile.exists()) {
                            randomFile.createNewFile();
                        }
                        if (randomFile.exists()) {
                            aClass93_933 = new Class93(randomFile, "rw", 25L);
                        }
                    } catch (Exception exception) {
                        aClass93_933 = null;
                    }
                }
                if (aFile2104 == null) {
                    try {
                        if (!file.exists()) {
                            boolean bool = file.mkdir();
                            if (!bool) {
                                continue;
                            }
                        }
                        File mainCache = new File(file, "main_file_cache.dat2");
                        if (!mainCache.exists()) {
                            mainCache.createNewFile();
                        }
                        aClass93_945 = new Class93(mainCache, "rw", 104857600L);
                        aClass93Array927 = new Class93[i3];
                        for (int id = 0; id < i3; id++) {
                            aClass93Array927[id] = (new Class93 (new File(file, ("main_file_cache.idx" + id)), "rw", 1048576L));
                        }
                        aClass93_938 = (new Class93(new File(file, "main_file_cache.idx255"), "rw", 1048576L));
                        aFile2086 = aFile2104 = file;
                    } catch (Exception exception) {
                        System.out.println("Unable to find cache files.");
                        try {
                            aClass93_945.method1491(110);
                            for (int id = 0; id < i3; id++)
                                aClass93Array927[id].method1491(110);
                            aClass93_938.method1491(110);
                       } catch (Exception exception_18_) {
                        }
                        aFile2086 = aFile2104 = null;
                        aClass93Array927 = null;
                        aClass93_933 = aClass93_938 = null;
                    }
                }
            } catch (Exception exception) {
            }
            if (aClass93_933 != null &&  aFile2104 != null)
                return;
        }
	if (aFile2104 == null)
	    throw new RuntimeException();
    }
    
    public Class31 method398(Component arg0, boolean arg1, boolean arg2) {
	if (arg1 != true)
	    method394(-84, null);
	return method399(arg2 ? 1 : 0, arg0, 0, 0, 15);
    }
    
    public Class31 method399(int arg0, Object arg1, int arg2, int arg3,
			     int arg4) {
	Class31 class31 = new Class31();
	class31.anInt707 = arg0;
	class31.anObject708 = arg1;
	class31.anInt709 = arg4;
	synchronized (this) {
	    if (aClass31_935 != null) {
		aClass31_935.aClass31_710 = class31;
		aClass31_935 = class31;
	    } else
		aClass31_935 = aClass31_928 = class31;
	    this.notify();
	    if (arg2 != 0)
		method405(null, (byte) 39);
	}
	return class31;
    }
    
    public void method400(int arg0) {
	synchronized (this) {
	    aBoolean942 = true;
	    this.notifyAll();
	}
	try {
	    aThread926.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	if (aClass93_945 != null) {
	    try {
		aClass93_945.method1491(-1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (arg0 < 10)
	    run();
	if (aClass93_938 != null) {
	    try {
		aClass93_938.method1491(-1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass93Array927 != null) {
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aClass93Array927.length ^ 0xffffffff);
		 i++) {
		if (aClass93Array927[i] != null) {
		    try {
			aClass93Array927[i].method1491(-1);
		    } catch (IOException ioexception) {
			/* empty */
		    }
		}
	    }
	}
	do {
	    if (aClass93_933 != null) {
		try {
		    aClass93_933.method1491(-1);
		} catch (IOException ioexception) {
		    break;
		}
		break;
	    }
	} while (false);
    }
    
    public Class31 method401(Class arg0, String arg1, int arg2) {
	if (arg2 != -26556)
	    aMethod947 = null;
	return method399(0, new Object[] { arg0, arg1 }, arg2 ^ ~0x67bb, 0, 9);
    }
    
    public void method402(boolean arg0) {
	aLong946 = Class39.method337(19644) - -5000L;
	if (arg0 != false)
	    method400(-128);
    }
    
    public Class31 method403(int arg0, boolean arg1, String arg2) {
	if (arg1 != false)
	    aMethod947 = null;
	return method399(arg0, arg2, 0, 0, 1);
    }
    
    public Class31 method404(int arg0, Runnable arg1, int arg2) {
	if (arg0 != 2)
	    return null;
	return method399(arg2, arg1, 0, 0, 2);
    }
    
    public Class31 method405(String arg0, byte arg1) {
	if (arg1 != -102)
	    method397(null, -110, null, null);
	return method399(0, arg0, 0, 0, 16);
    }
    
    public Interface1 method406(int arg0) {
	int i = 106 / ((-34 - arg0) / 35);
	return anInterface1_929;
    }
    
    public Class31 method407(byte arg0, int arg1) {
	if (arg0 != 26)
	    return null;
	return method399(arg1, null, 0, 0, 3);
    }
    
    public Class31 method408(int arg0, boolean arg1, int arg2,
			     Component arg3) {
	if (arg1 != false)
	    aString936 = null;
	Point point = arg3.getLocationOnScreen();
	return method399(arg0 + point.x, null, 0, point.y + arg2, 14);
    }
    
    public SignLink(Applet arg0, int arg1, String arg2, int arg3)
	throws Exception {
	aClass31_928 = null;
	aBoolean942 = false;
	aClass31_935 = null;
	anApplet940 = null;
	aClass93_945 = null;
	aClass93_938 = null;
	anApplet940 = arg0;
	aString941 = "Unknown";
	aString936 = "1.1";
	try {
	    aString941 = System.getProperty("java.vendor");
	    aString936 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aString943 = System.getProperty("os.name");
	} catch (Exception exception) {
	    aString943 = "Unknown";
	}
	aString937 = aString943.toLowerCase();
	try {
	    aString939 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    aString939 = "";
	}
	try {
	    aString932 = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    aString932 = "";
	}
	try {
	    aString934 = System.getProperty("user.home");
	    if (aString934 != null)
		aString934 += "/";
	} catch (Exception exception) {
	    /* empty */
	}
	if (aString934 == null)
	    aString934 = "~/";
	try {
	    anEventQueue930
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    if (arg0 == null)
		aMethod944
		    = (Class.forName("java.awt.Component").getDeclaredMethod
		       ("setFocusTraversalKeysEnabled",
			new Class[] { Boolean.TYPE }));
	    else
		aMethod944
		    = arg0.getClass().getMethod("setFocusTraversalKeysEnabled",
						new Class[] { Boolean.TYPE });
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (arg0 == null)
		aMethod947
		    = (Class.forName("java.awt.Container").getDeclaredMethod
		       ("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
	    else
		aMethod947
		    = arg0.getClass().getMethod("setFocusCycleRoot",
						new Class[] { Boolean.TYPE });
	} catch (Exception exception) {
	    /* empty */
	}
	signlink530(arg1, arg2, 34, arg3);
	aBoolean942 = false;
	aThread926 = new Thread(this);
	aThread926.setPriority(10);
	aThread926.setDaemon(true);
	aThread926.start();
    }
    
    static {
	new Hashtable(16);
	aLong946 = 0L;
    }
}
