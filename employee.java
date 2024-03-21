import java. awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class employee extends JFrame implements ActionListener
{	
JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
JButton bt,ct;
ButtonGroup bg;
JRadioButton r1,r2,r3;
JComboBox cb1,cb2;
JList l1,l2;
JTextArea ta1,ta2;
JScrollPane jp1,jp2;
String Gender[]={"MAlE","FEMALE","OTHERS"};
String Post[]={"PO","CLERK","ACCOUNTANT","FIELD OFFICER","CASHIER","MANAGER","STAFF"};
Container cn;
Connection con;
Statement st;
String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
employee()
{
super("Employee details");
cn=getContentPane();
cn.setLayout(null);

a1=new JLabel("Employee Id");
a1.setBounds(10,50,100,25);
cn.add(a1);
t1=new JTextField(10);
t1.setBounds(150,50,200,25);
cn.add(t1);

a2=new JLabel("Employee Name");
a2.setBounds(10,100,100,25);
cn.add(a2);
t2=new JTextField(10);
t2.setBounds(150,100,200,25);
cn.add(t2);

a3=new JLabel("Email");
a3.setBounds(10,150,100,25);
cn.add(a3);
t3=new JTextField(10);
t3.setBounds(150,150,200,25);
cn.add(t3);

a4=new JLabel("Date Of Birth");
a4.setBounds(10,200,100,25);
cn.add(a4);
t4=new JTextField(10);
t4.setBounds(150,200,200,25);
cn.add(t4);

a5=new JLabel("Gender");
a5.setBounds(10,250,100,25);
cn.add(a5);
bg=new ButtonGroup();
r1=new JRadioButton("MALE");
r1.setBounds(150,250,100,25);
cn.add(r1);
r2=new JRadioButton("FEMALE");
r2.setBounds(280,250,100,25);
cn.add(r2);
r3=new JRadioButton("OTHERS");
r3.setBounds(400,250,100,25);
cn.add(r3);
bg.add(r1);
bg.add(r2);
bg.add(r3);

a6=new JLabel("Contact No");
a6.setBounds(10,300,100,25);
  cn.add(a6);
t6=new JTextField(10);
t6.setBounds(150,300,200,25);
cn.add(t6);

a7=new JLabel("Aadhar No");
a7.setBounds(10,350,100,25);
cn.add(a7);
t7=new JTextField(10);
t7.setBounds(150,350,200,25);
cn.add(t7);

a8=new JLabel("Address");
a8.setBounds(10,400,100,25);
cn.add(a8);
t8=new JTextField(10);
t8.setBounds(150,400,200,25);
cn.add(t8);

a9=new JLabel("Date of Joining");
a9.setBounds(10,450,100,25);
cn.add(a9);
t9=new JTextField(10);
t9.setBounds(150,450,200,25);
cn.add(t9);

a10=new JLabel("Employee Post");
a10.setBounds(10,500,100,25);
cn.add(a10);
cb1=new JComboBox(Post);
cb1.setBounds(150,500,200,25);
cn.add(cb1);

a11=new JLabel("Salary");
a11.setBounds(10,550,100,25);
   cn.add(a11);
t11=new JTextField(10);
t11.setBounds(150,550,200,25);
cn.add(t11);

a12=new JLabel("Password");
a12.setBounds(10,600,100,25);
cn.add(a12);
t12=new JTextField(10);
t12.setBounds(150,600,200,25);
cn.add(t12);

a13=new JLabel("Re-Password");
a13.setBounds(10,650,100,25);
cn.add(a13);
t13=new JTextField(10);
t13.setBounds(150,650,200,25);
cn.add(t13);



bt=new JButton("Submit");
bt.setBounds(500,720,100,25);
cn.add(bt);

ct=new JButton("Back");
ct.setBounds(100,720,100,25);
cn.add(ct);
 
bt.addActionListener(this);
ct.addActionListener(this);

setSize(1000,1000);
setLocation(230,0);
show();
}


public void actionPerformed(ActionEvent ae)
{
         
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}

catch(ClassNotFoundException ce)
{
  System.out.println(ce);
}


try
{
   con=DriverManager.getConnection("jdbc:odbc:bank");


if(ae.getSource()==bt)
{
 s1=t1.getText();
 s2=t2.getText();
 s3=t3.getText();
 s4=t4.getText();
 s6=t6.getText();
 s7=t7.getText();
 s8=t8.getText();
 s9=t9.getText();
 s11=t11.getText();
 s12=t12.getText();
 s13=t13.getText();

if(r1.isSelected())
{
s5="MALE";
} 

if(r2.isSelected())
{
s5="FEMALE";
}
if(r3.isSelected())
{
s5="OTHERS";
}

s10=(String)cb1.getSelectedItem();

st=con.createStatement();

int k=st.executeUpdate("Insert into employee values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')");


t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t11.setText("");
t12.setText("");
t13.setText("");


}

}
catch(SQLException e)
{
System.out.print(e);
}
 
setVisible(false); 
 
}
public static void main(String arg[])
{
new employee();
}
}
