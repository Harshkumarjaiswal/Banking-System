import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener
{
 Label l1,l2,l3;
 Button bt;
 TextField tf1,tf2;
 String a,b;
 Font f1,f2;
 Login()
{
 setLayout(null);
 f1=new Font("Times New Roman",Font.ITALIC,50);
 l1=new Label("LOGIN PAGE");
 l1.setFont(f1);
 l1.setBounds(200,100,500,50);
 add(l1);

 f2=new Font("CALIBIRI",Font.BOLD,30);
 l2=new Label("NAME");
 l2.setFont(f2);
 l2.setBounds(200,200,100,30);
 add(l2);
 tf1=new TextField(50);
 tf1.setBounds(400,200,100,30);
 add(tf1);

 l3=new Label("Password");
 l3.setFont(f2);
 l3.setBounds(200,250,200,30);
 add(l3);
 tf2=new TextField(50);
 tf2.setBounds(400,250,100,30);
 add(tf2);

 bt=new Button("LOG IN");
 bt.setBounds(400,350,50,30);
 add(bt);
 bt.addActionListener(this);
 setSize(1000,1000);
 setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==bt)
{
 a=tf1.getText();
 b=tf2.getText();
 if(b.equals("1234"))
{
// new addframe();
}
 else
{
 new Login();
}
}
}
 public static void main(String[]args)
{
 new Login();
}
}