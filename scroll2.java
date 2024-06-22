import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class demo extends Frame implements AdjustmentListener
{
   JScrollBar js,js1,js2;
  demo()
   {
     setVisible(true);
     setSize(200,200);
    setLayout(null);
   js=new JScrollBar();
   js.setOrientation(1);
   js.setMaximum(255);
  js.setMinimum(0);
  js.setBounds(50,50,40,300);
  add(js);

  js2=new JScrollBar();
   js2.setOrientation(1);
   js2.setMaximum(255);
  js2.setMinimum(0);
  js2.setBounds(150,50,40,300);
  add(js2);
 
   js1=new JScrollBar();
   js1.setOrientation(1);
   js1.setMaximum(255);
   js1.setMinimum(0);
   js1.setBounds(100,50,40,300);
  add(js1);
 js.addAdjustmentListener(this);
 js1.addAdjustmentListener(this);
 js2.addAdjustmentListener(this);
   }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
    int a=js.getValue();
    int b=js1.getValue();
    int c=js2.getValue();
  Color c1=new Color(a,b,c);
    setBackground(c1);
 }
}
class jsss
{
 public static void main(String arg[])
 {
  demo ob=new demo();
 }
}