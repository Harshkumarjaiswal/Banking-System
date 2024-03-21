import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class choose extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l;
 JLabel lb,lb1,lb2;
 ImageIcon img,img1,img2;
 JButton bt,ct,dt;
 String a,b;
 Font f1,f2,f3;
 choose()
{
 super("HP Bank");
 setLayout(null);

 bt=new JButton("LOG IN");
 bt.setFont(f1);
 bt.setBounds(570,580,100,40);
 add(bt);
 bt.setForeground(Color.black);
 bt.setBackground(Color.white);
 ct=new JButton("LOG IN");
 ct.setFont(f1);
 ct.setBounds(880,580,100,40);
 add(ct);
 ct.setForeground(Color.black);
 ct.setBackground(Color.white);
dt=new JButton("Back");
 dt.setBounds(730,650,100,40);
 add(dt);
 dt.setForeground(Color.black);
 dt.setBackground(Color.white);


 img=new ImageIcon("admin1.jpg");
 lb=new JLabel(img);
 lb.setBounds(500,230,240,260);
 add(lb);

f1=new Font("Monospaced",Font.BOLD,30);
 l1=new JLabel("ADMIN");
 l1.setFont(f1);
 l1.setBounds(570,500,150,30);
 add(l1);
l1.setForeground(Color.black);

 img1=new ImageIcon("operator.jpg");
 lb1=new JLabel(img1);
 lb1.setBounds(800,230,240,260);
 add(lb1);
 f1=new Font("Monospaced",Font.BOLD,30);
 l2=new JLabel("OPERATOR");
 l2.setFont(f1);
 l2.setBounds(850,500,200,50);
 add(l2);
l2.setForeground(Color.black);

 f2=new Font("TimesRoman",Font.BOLD,50);
 l=new JLabel("WHO ARE YOU?");
 l.setFont(f2);
 l.setBounds(580,100,500,50);
 add(l);
 l.setForeground(Color.black);

 bt.addActionListener(this);
 ct.addActionListener(this);
dt.addActionListener(this);
 setSize(1920,1080);
 setVisible(true);
}
 public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==bt)
{
new bank1();
}
if(ae.getSource()==ct)
{
 new bank2();
}
if(ae.getSource()==dt)
{
 new bank();
}
setVisible(false);
}

 public static void main(String[]args)
{
 new choose();
}
}