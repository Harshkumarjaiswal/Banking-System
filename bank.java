import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bank extends JFrame implements ActionListener
{
 JLabel l1,lb,lb1;
 ImageIcon img,img1;
 Font f1,f2;
 JButton bt,ct;
 Container cn;
 bank()
{
 super("HP Bank");
 
 cn=getContentPane();
cn.setLayout(null);
 f1=new Font("TimesRoman",Font.BOLD,40);
 f2=new Font("CALIBIRI",Font.BOLD,15);

 l1=new JLabel("BANKING MANAGEMENT SYSTEM");
 l1.setFont(f1);
 l1.setBounds(400,250,1000,40);
 l1.setForeground(Color.BLACK);
 cn.add(l1);

 bt=new JButton("Exit");
 bt.setBounds(600,700,100,40);
 bt.setFont(f2);
 cn.add(bt);
bt.setForeground(Color.black);
 bt.setBackground(Color.white);
 ct=new JButton("Next");
 ct.setBounds(850,700,100,40);
 ct.setFont(f2);
 cn.add(ct);
 ct.setForeground(Color.black);
 ct.setBackground(Color.white);
 bt.addActionListener(this);
 ct.addActionListener(this);

 img=new ImageIcon("aa.jpg");
 lb=new JLabel(img);
 lb.setBounds(0,20,1750,980);
 cn.add(lb);


 setSize(1920,1080);
 setVisible(true);
}
 public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==ct)
{
new choose();
}
setVisible(false);
}

public static void main(String[]args)
{
 new bank();
}
}