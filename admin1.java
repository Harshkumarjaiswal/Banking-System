import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class admin1 extends JFrame implements ActionListener
{
 JLabel l1,lb;
 ImageIcon img;
 Font f1,f2;
 JButton bt,ct;
 JMenuBar mb;
 JMenu a,b,c;
 JMenuItem a1,a2,a3,a4,a5,a6,b1,b2,b3,b4,b5,c1,c2,c3,c4;
 Container cn;
 admin1()
{
 super("Banking");
 
 cn=getContentPane();
cn.setLayout(null);
 f1=new Font("TimesRoman",Font.BOLD,40);
 f2=new Font("CALIBIRI",Font.BOLD,15);

 l1=new JLabel("ADMIN PAGE");
 l1.setFont(f1);
 l1.setBounds(600,250,800,40);
 l1.setForeground(Color.BLACK);
 cn.add(l1);

 bt=new JButton("Exit");
 bt.setBounds(600,700,100,40);
 bt.setFont(f2);
 cn.add(bt);
 ct=new JButton("Back");
 ct.setBounds(850,700,100,40);
 ct.setFont(f2);
 cn.add(ct);
 bt.addActionListener(this);
 ct.addActionListener(this);

mb=new JMenuBar();
a=new JMenu("Account");mb.add(a);
a1=new JMenuItem("CREATE");a.add(a1);
a2=new JMenuItem("UPDATE");a.add(a2);
a3=new JMenuItem("VIEW A/C");a.add(a3);
a4=new JMenuItem("SEARCH");a.add(a4);
a5=new JMenuItem("DELETE");a.add(a5);
a6=new JMenuItem("EXIT");a.add(a6);
 
b=new JMenu("Employee");mb.add(b);
b1=new JMenuItem("CREATE");b.add(b1);
b2=new JMenuItem("UPDATE");b.add(b2);
b3=new JMenuItem("VIEW A/C");b.add(b3);
b4=new JMenuItem("SEARCH");b.add(b4);
b5=new JMenuItem("DELETE");b.add(b5);
 

c=new JMenu("Transaction");mb.add(c);
c1=new JMenuItem("DEPOSIT");c.add(c1);
c2=new JMenuItem("WITHDRAWL");c.add(c2);
c3=new JMenuItem("ENQUIRY");c.add(c3);

 
a1.addActionListener(this);
a2.addActionListener(this);
a3.addActionListener(this);
a4.addActionListener(this);
a5.addActionListener(this);
a6.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
c1.addActionListener(this);
c2.addActionListener(this);
c3.addActionListener(this);


mb.setBounds(0,0,500,30);
setJMenuBar(mb);

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
if(ae.getSource()==bt)
{
System.exit(0);
}
 if(ae.getSource()==a1)
{
new account();
}
 if(ae.getSource()==a2)
{
new search1();
} if(ae.getSource()==a3)
{
new view();
} if(ae.getSource()==a4)
{
new search();
} if(ae.getSource()==a5)
{
new delete();
} if(ae.getSource()==a6)
{
System.exit(0);
} 
if(ae.getSource()==b1)
{
new employee();
} if(ae.getSource()==b2)
{
new Employee_update();
} if(ae.getSource()==b3)
{
new view_employee();
} if(ae.getSource()==b4)
{
new search_employee();
} 
if(ae.getSource()==b5)
{
new delete_employee();
}
 if(ae.getSource()==c1)
{
new deposit();
} if(ae.getSource()==c2)
{
new withdraw();
} if(ae.getSource()==c3)
{
new passbook();
}
}

public static void main(String[]args)
{
 new admin1();
}
}