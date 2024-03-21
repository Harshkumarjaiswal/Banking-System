import java. awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Employee_update extends JFrame implements ActionListener
{	
JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
JButton bt,ct,dt;
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
Statement s;
String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,no;
Employee_update()
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

a8=new JLabel("PAN No");
a8.setBounds(10,400,100,25);
cn.add(a8);
t8=new JTextField(10);
t8.setBounds(150,400,200,25);
cn.add(t8);

a9=new JLabel("Address");
a9.setBounds(10,450,100,25);
cn.add(a9);
t9=new JTextField();
t9.setBounds(150,450,200,50);
cn.add(t9);

a10=new JLabel("Date of Joinig");
a10.setBounds(10,500,100,25);
cn.add(a10);
t10=new JTextField(10);
t10.setBounds(150,500,200,25);
cn.add(t10);

a11=new JLabel("Employee Post");
a11.setBounds(10,550,100,25);
cn.add(a11);
cb1=new JComboBox(Post);
cb1.setBounds(150,550,200,25);
cn.add(cb1);

a12=new JLabel("Salary");
a12.setBounds(10,600,100,25);
cn.add(a12);
t12=new JTextField(10);
t12.setBounds(150,600,200,25);
cn.add(t12);

a13=new JLabel("Password");
a13.setBounds(10,650,100,25);
cn.add(a13);
t13=new JTextField(10);
t13.setBounds(150,650,200,25);
cn.add(t13);

a14=new JLabel("Re-Password");
a14.setBounds(10,700,100,25);
cn.add(a14);
t14=new JTextField(10);
t14.setBounds(150,700,200,25);
cn.add(t14);


bt=new JButton("Update");
bt.setBounds(600,750,100,25);
cn.add(bt);

ct=new JButton("Back");
ct.setBounds(150,750,100,25);
cn.add(ct);

dt=new JButton("Search");
dt.setBounds(550,50,100,25);
cn.add(dt);
 
bt.addActionListener(this);
ct.addActionListener(this);
dt.addActionListener(this);
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
s=con.createStatement();

if(ae.getSource()==dt)
{
no=t1.getText();
String str1="select * from employee where Employee_Id='"+no+"' ";
ResultSet rs=s.executeQuery(str1);
//System.out.println(rs.next());
if(rs.next())
{
 s1=rs.getString(1);
 s2=rs.getString(2);
 s3=rs.getString(3);
 s4=rs.getString(4);
 s5=rs.getString(5);
 s6=rs.getString(6);
 s7=rs.getString(7);
 s8=rs.getString(8);
 s9=rs.getString(9);
 s10=rs.getString(10);
 s11=rs.getString(11);
 s12=rs.getString(12);
 s13=rs.getString(13);
 s14=rs.getString(14);

if(s5.equals("MALE"))
{
r1.setSelected(true);
}
if(s5.equals("FEMALE"))
{
r2.setSelected(true);
}
if(s5.equals("OTHERS"))
{
r3.setSelected(true);
}

t1.setText(s1);
t2.setText(s2);
t3.setText(s3);
t4.setText(s4);
t6.setText(s6);
t7.setText(s7);
t8.setText(s8);
t9.setText(s9);
t10.setText(s10);
cb1.setSelectedItem(s11);
t12.setText(s12);
t13.setText(s13);
t14.setText(s14);
}
}
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
 s10=t10.getText();
 s12=t12.getText();
 s13=t13.getText();
 s14=t14.getText();

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
s11=(String)cb1.getSelectedItem();

s=con.createStatement();
int k=s.executeUpdate("update  employee set Employee_Id='"+s1+"',Employee_Name='"+s2+"',Email='"+s3+"',DOB='"+s4+"',Gender='"+s5+"',Contact='"+s6+"',Aadhar_No='"+s7+"',PAN_No='"+s8+"',Address='"+s9+"',Date_of_Joinig='"+s10+"',Post='"+s11+"',Salary='"+s12+"',Password='"+s13+"',Re_Password='"+s14+"' where Employee_Id='"+s1+"' ");

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
t5.setText("");
t11.setText("");
}
if(ae.getSource()==ct)
{
new admin1();
}
}
catch(SQLException e)
{
System.out.print(e);
} 
}
public static void main(String arg[])
{
new Employee_update();
}
}
