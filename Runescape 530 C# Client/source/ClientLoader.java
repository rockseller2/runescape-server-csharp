import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.awt.Container;
import java.awt.Dimension;
import java.net.URL;
import java.net.*;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientLoader extends Applet
{
  public static int anInt2646;
  public static Properties props = new Properties();
  public JFrame frame;
  String URL = "URL";
  private JPanel jp = new JPanel();
  public static String[][] strArray = new String[100][100];
  public static String world;

  public static void main(String[] paramArrayOfString)
  {
    new ClientLoader(paramArrayOfString[0]);
  }

  public ClientLoader(String wld) {
    try {
      this.world = wld;
      this.frame = new JFrame("Runescape C# 530 Client.");
      this.frame.setLayout(new BorderLayout());
      this.frame.setResizable(true);
      this.jp.setLayout(new BorderLayout());
      this.jp.add(this);
      this.jp.setPreferredSize(new Dimension(765, 503));
      this.frame.getContentPane().add(this.jp, "Center");
      this.frame.pack();
      this.frame.setVisible(true);
      props.put("worldid", wld);
      props.put("members", "1");
      props.put("modewhat", "0");
      props.put("modewhere", "0");
      props.put("safemode", "0");
      props.put("game", "0");
      props.put("js", "1");
      props.put("lang", "0");
      props.put("affid", "0");
      props.put("lowmem", "0");
      props.put("settings", "kKmok3kJqOeN6D3mDdihco3oPeYN2KFy6W5--vZUbNA");
      SignLink sn = new SignLink(this, 32, "runescape", 28);
      client.providesignlink(sn);
      client localclient = new client();
      localclient.init();
    } catch (Exception localException) {
      localException.printStackTrace();
    }
  }
  public String getParameter(String paramString)
  {
    return ((String)props.get(paramString));
  }

  public URL getDocumentBase() {
    return getCodeBase();
  }

  public URL getCodeBase() {
    try {
      return new URL("http://127.0.0.1");
      //return new URL("127.0.0.1");
    } catch (MalformedURLException localException) {
    	System.out.println("World List Loading might not be working or something else is wrong.");
    	System.out.println("Stack Trace:");
      localException.printStackTrace();

      return null;
    }
  }
}