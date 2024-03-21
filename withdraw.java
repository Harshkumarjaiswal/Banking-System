import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class withdraw extends JFrame implements ActionListener
{
JLabel a,b,c,d,e;
JTextField t1,t2,t3,t4;
JButton bt,ct;
JTextArea t;
ImageIcon x;
Statement s,st;
String Str="";
String s1,s2,s3,s4,s5,s22,s23,dd,s7,no,pk;
Integer i,j,add;
Connection con;
Container cn;
withdraw()
{
super("Withdraw");
cn=getContentPane();
cn.setLayout(null);
		
a=new JLabel("Enter Account no.");
a.setBounds(50,20,100,30);
cn.add(a);
t1=new JTextField(10);
t1.setBounds(180,20,150,25);
cn.add(t1);

b=new JLabel("Date");
b.setBounds(50,500,100,30);
cn.add(b);
t2=new JTextField(10);
t2.setBounds(180,500,150,25);
cn.add(t2);

c=new JLabel("Withdrawl by");
c.setBounds(50,550,150,30);
cn.add(c);
t3=new JTextField(10);
t3.setBounds(180,550,150,25);
cn.add(t3);

d=new JLabel("Amount to withdraw");
d.setBounds(50,600,150,30);
cn.add(d);
t4=new JTextField(10);
t4.setBounds(180,600,150,25);
cn.add(t4);
			
bt=new JButton("Search");
bt.setBounds(350,20,90,25);
cn.add(bt);
ct=new JButton("Withdraw");
ct.setBounds(300,650,90,25);
cn.add(ct);
bt.addActionListener(this);
ct.addActionListener(this);

t=new JTextArea(5,85);
t.setBounds(10,50,1000,400);
cn.add(t);

x=new ImageIcon("a.jpg");
b=new JLabel(x);
b.setBounds(100,250,800,400);
cn.add(b);

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
}
		
try
{
con=DriverManager.getConnection("jdbc:odbc:bank");
s=con.createStatement();
if(ae.getSource()==bt)
{
 no=t1.getText();
String Str1="select* from account where(Account_no='"+no+"')";
ResultSet rs=s.executeQuery(Str1);
if(rs.next())
{
s7=rs.getString(22);

Str="Name"+"\t\t"+rs.getString(1)+"\n\n"+"Phone No"+"\t\t"+rs.getString(2)+"\n\n"+"EMAIL"+"\t\t"+rs.getString(3)+"\n\n"+"Date Of Birth"+"\t\t"+rs.getString(4)+"\n\n"+"PAN NO"+"\t\t"+rs.getString(6)+"\n\n"+"Aadhar No"+"\t\t"+rs.getString(7)+"\n\n"+"Correspondence Address"+"\t"+rs.getString(13)+"\n\n"+"State"+"\t\t"+rs.getString(15)+"\n\n"+"PIN"+"\t\t"+rs.getString(14)+"\n\n"+"Country"+"\t\t"+rs.getString(16)+"\n\n"+"Account Type"+"\t\t"+rs.getString(21)+"\n\n"+"Balance"+"\t\t"+s7;

t.setText(Str);


System.out.println(s7);
i=Integer.parseInt(s7);

}
}
con=DriverManager.getConnection("jdbc:odbc:bank");

if(ae.getSource()==ct)
{
 s1=t1.getText();
 s2=t2.getText();
 s3=t3.getText();
 s4=t4.getText();
j=Integer.parseInt(s4);
  add=i-j;
pk="debit";
dd=String.valueOf(add);

s=con.createStatement();
st=con.createStatement();
int k=s.executeUpdate("Insert into Transaction values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+pk+"','"+dd+"')");
int j=st.executeUpdate("update  account set Opening_Balance='"+dd+"' where account_no='"+no+"' ");

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t.setText("");
}
}
catch(SQLException e)
{
System.out.println(e);
}
//setVisible(false); 
}
public static void main(String arg[])
{
new withdraw();
}
}