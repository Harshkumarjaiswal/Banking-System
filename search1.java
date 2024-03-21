import java. awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class search1 extends JFrame implements ActionListener
{	
JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23;
JTextField t1,t1a,t1b,t2,t3,t4,t5,t6,t7,t8,t8a,t8b,t9,t10,t11,t12,t14,t15,t16,t18,t19,t20,t21,t22,t23;
JButton bt,ct,dt;
ButtonGroup bg;
JRadioButton r1,r2;
JComboBox cb1,cb2;
JList l1,l2;
JTextArea ta1,ta2;
JScrollPane jp1,jp2;
String Gender[]={"MAlE","FEMALE","OTHERS"};
String Account[]={"SAVINGS ACCOUNT","CURRENT ACCOUNT","FIXED DEPOSIT ACCOUNT","RECURRING DEPOSIT ACCOUNT"};
Container cn;
Connection con;
Statement s;
String s1,s1a,s1b,s2,s3,s4,s5,s6,s7,s8,s8a,s8b,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23;
search1()
{
super("Registration form");
cn=getContentPane();
cn.setLayout(null);

a1=new JLabel("Applicant Name");
a1.setBounds(10,50,100,25);
cn.add(a1);
t1=new JTextField(10);
t1.setBounds(150,50,150,25);
cn.add(t1);
t1a=new JTextField(10);
t1a.setBounds(310,50,150,25);
cn.add(t1a);
t1b=new JTextField(10);
t1b.setBounds(470,50,150,25);
cn.add(t1b);


a2=new JLabel("Phone No.");
a2.setBounds(10,100,80,25);
cn.add(a2);
t2=new JTextField(10);
t2.setBounds(150,100,150,25);
cn.add(t2);

a3=new JLabel("Email");
a3.setBounds(400,100,50,25);
cn.add(a3);
t3=new JTextField(10);
t3.setBounds(500,100,200,25);
cn.add(t3);

a4=new JLabel("Date Of Birth");
a4.setBounds(10,150,120,25);
cn.add(a4);
t4=new JTextField(10);
t4.setBounds(150,150,100,25);
cn.add(t4);

a5=new JLabel("Gender");
a5.setBounds(400,150,100,25);
cn.add(a5);
cb1=new JComboBox(Gender);
cb1.setBounds(550,150,100,25);
cn.add(cb1);

a6=new JLabel("PAN No");
a6.setBounds(10,200,150,25);
cn.add(a6);
t6=new JTextField(10);
t6.setBounds(150,200,150,25);
cn.add(t6);

a7=new JLabel("Aadhar no");
a7.setBounds(400,200,80,25);
cn.add(a7);
t7=new JTextField(10);
t7.setBounds(500,200,150,25);
cn.add(t7);

a8=new JLabel("Father's/Husband's Name");
a8.setBounds(10,250,180,25);
cn.add(a8);
t8=new JTextField(10);
t8.setBounds(200,250,150,25);
cn.add(t8);
t8a=new JTextField(10);
t8a.setBounds(360,250,150,25);
cn.add(t8a);
t8b=new JTextField(10);
t8b.setBounds(520,250,150,25);
cn.add(t8b);

a9=new JLabel("Date of Birth");
a9.setBounds(10,300,150,25);
cn.add(a9);
t9=new JTextField(10);
t9.setBounds(200,300,200,25);
cn.add(t9);

a10=new JLabel("PAN No");
a10.setBounds(420,300,80,25);
cn.add(a10);
t10=new JTextField(10);
t10.setBounds(520,300,200,25);
cn.add(t10);

a11=new JLabel("Aadhar No");
a11.setBounds(10,340,150,25);
cn.add(a11);
t11=new JTextField(10);
t11.setBounds(200,340,200,25);
cn.add(t11);

a12=new JLabel("Applicant Married status");
a12.setBounds(10,390,200,25);
cn.add(a12);
bg=new ButtonGroup();
r1=new JRadioButton("Yes");
r1.setBounds(250,390,50,25);
cn.add(r1);
r2=new JRadioButton("No");
r2.setBounds(350,390,50,25);
cn.add(r2);


   bg.add(r1);
   bg.add(r2);


a13=new JLabel("Correspondence Address");
a13.setBounds(100,450,150,25);
cn.add(a13);
ta1=new JTextArea(10,10);
ta1.setBounds(20,490,300,100);
cn.add(ta1);

a14=new JLabel("Pin");
a14.setBounds(10,620,50,25);
cn.add(a14);
t14=new JTextField(10);
t14.setBounds(70,620,80,25);
cn.add(t14);

a15=new JLabel("State");
a15.setBounds(180,620,50,25);
cn.add(a15);
t15=new JTextField(10);
t15.setBounds(250,620,80,25);
cn.add(t15);

a16=new JLabel("Country");
a16.setBounds(10,660,50,25);
cn.add(a16);
t16=new JTextField(10);
t16.setBounds(70,660,80,25);
cn.add(t16);

a17=new JLabel("Permanent Address");
a17.setBounds(550,450,150,25);
cn.add(a17);
ta2=new JTextArea(10,10);
ta2.setBounds(550,490,300,100);
cn.add(ta2);

a18=new JLabel("Pin");
a18.setBounds(550,620,50,25);
cn.add(a18);
t18=new JTextField(10);
t18.setBounds(620,620,80,25);
cn.add(t18);

a19=new JLabel("State");
a19.setBounds(720,620,50,25);
cn.add(a19);
t19=new JTextField(10);
t19.setBounds(790,620,80,25);
cn.add(t19);

a20=new JLabel("Country");
a20.setBounds(550,660,50,25);
cn.add(a20);
t20=new JTextField(10);
t20.setBounds(620,660,80,25);
cn.add(t20);

a21=new JLabel("Account Type");
a21.setBounds(10,710,100,25);
cn.add(a21);
cb2=new JComboBox(Account);
cb2.setBounds(130,710,150,25);
cn.add(cb2);

a22=new JLabel("Opening Balance");
a22.setBounds(320,710,100,25);
cn.add(a22);
t22=new JTextField(10);
t22.setBounds(420,710,150,25);
cn.add(t22);

a23=new JLabel("Account No");
a23.setBounds(10,20,100,25);
cn.add(a23);
t23=new JTextField(10);
t23.setBounds(150,20,200,25);
cn.add(t23);


bt=new JButton("Update");
bt.setBounds(600,750,100,25);
cn.add(bt);

ct=new JButton("Back");
ct.setBounds(150,750,100,25);
cn.add(ct);

dt=new JButton("Search");
dt.setBounds(400,20,100,25);
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
  String no=t23.getText();
String str1="select * from account where Account_No='"+no+"' ";
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
 s13=rs.getString(13);
 s14=rs.getString(14);
 s15=rs.getString(15);
 s16=rs.getString(16);
 s17=rs.getString(17);
 s18=rs.getString(18);
 s19=rs.getString(19);
 s20=rs.getString(20);
 s21=rs.getString(21);
 s22=rs.getString(22);
 

s12=rs.getString(12);
if(s12.equals("Yes"))
{
r1.setSelected(true);
}

if(s12.equals("No"))
{
r2.setSelected(true);
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
t11.setText(s11);
ta1.setText(s13);
t14.setText(s14);
t15.setText(s15);
t16.setText(s16);
ta2.setText(s17);
t18.setText(s18);
t19.setText(s19);
t20.setText(s20);
t22.setText(s22);
cb1.setSelectedItem(s5);
cb2.setSelectedItem(s21);
}
}
if(ae.getSource()==bt)
{s1=t1.getText();
 s1a=t1a.getText();
 s1b=t1b.getText();
 s2=t2.getText();
 s3=t3.getText();
 s4=t4.getText();

 s6=t6.getText();
 s7=t7.getText();
 s8=t8.getText();
 s8a=t8a.getText();
 s8b=t8b.getText();
 s9=t9.getText();
 s10=t10.getText();
 s11=t11.getText();
 s13=ta1.getText();
 s14=t14.getText();
 s15=t15.getText();
 s16=t16.getText();
 s17=ta2.getText();
 s18=t18.getText();
 s19=t19.getText();
 s20=t20.getText();

 s22=t22.getText();
 s23=t23.getText();

if(r1.isSelected())
{
s12="Yes";
} 

if(r2.isSelected())
{
s12="No";
}

s5=(String)cb1.getSelectedItem();
s21=(String)cb2.getSelectedItem();

s=con.createStatement();
String zz=s1+s1a+s1b;
String yy=s8+s8a+s8b;
int k=s.executeUpdate("update  account set Applicant_Name='"+zz+"',Phone_no='"+s2+"',email='"+s3+"',Date_of_Birth='"+s4+"',Gender='"+s5+"',PAN_No='"+s6+"',Aadhar_No='"+s7+"',Father_Husband_Name='"+yy+"',FDate_of_Birth='"+s9+"',FPAN_No='"+s10+"',FAadhar_No='"+s11+"',Applicant_Married_Status='"+s12+"',Correspondence_Address='"+s13+"',PIN='"+s14+"',State='"+s15+"',Country='"+s16+"',Permanent_Address='"+s17+"',PIN1='"+s18+"',State1='"+s19+"',Country1='"+s20+"',Account_Type='"+s21+"',Opening_Balance='"+s22+"' where account_no='"+s23+"' ");


t1.setText("");
t1a.setText("");
t1b.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t8a.setText("");
t8b.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
ta1.setText("");
t14.setText("");
t15.setText("");
t16.setText("");
ta2.setText("");
t18.setText("");
t19.setText("");
t20.setText("");
t22.setText("");
t23.setText("");
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
setVisible(false); 
}
public static void main(String arg[])
{
new search1();
}
}
