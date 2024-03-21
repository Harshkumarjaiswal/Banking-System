import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bank1 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3;
 JLabel lb;
 ImageIcon img;
 JButton bt,ct;
 JTextField tf1,tf2;
 String a,b;
 Font f1,f2;
 bank1()
{
 super("HP Bank");
 setLayout(null);
 f1=new Font("Times New Roman",Font.BOLD,30);
 l1=new JLabel("ADMIN LOGIN HERE !!");
 l1.setFont(f1);
 l1.setBounds(120,50,350,30);
 add(l1);
l1.setForeground(Color.white);
 f2=new Font("CALIBIRI",Font.BOLD,30);
 l2=new JLabel("User Id");
 l2.setFont(f2);
 l2.setBounds(100,180,150,30);
 add(l2);
l2.setForeground(Color.white);
 tf1=new JTextField(50);
 tf1.setBounds(300,180,200,30);
 add(tf1);

 l3=new JLabel("Password");
 l3.setFont(f2);
 l3.setBounds(100,230,150,30);
 add(l3);
l3.setForeground(Color.white);
 tf2=new JTextField(50);
 tf2.setBounds(300,230,200,30);
 add(tf2);

 bt=new JButton("LOG IN");
 bt.setBounds(350,320,80,30);
 add(bt);
 ct=new JButton("BACK");
 ct.setBounds(150,320,80,30);
 add(ct);

 img=new ImageIcon("i.jpg");
 lb=new JLabel(img);
 lb.setBounds(0,0,600,600);
 add(lb);

 bt.addActionListener(this);
 ct.addActionListener(this);
 setSize(600,450);
 setLocation(400,150);
 setVisible(true);
}
 public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==bt)
{
 a=tf1.getText();
 b=tf2.getText();
 if(b.equals("1234") && a.equals("Admin"))
{
 new admin1();
}
}
if(ae.getSource()==ct)
{
 new choose();
}
setVisible(false);
}

 public static void main(String[]args)
{
 new bank1();
}
}