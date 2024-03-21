import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class passbook extends JFrame implements ActionListener
{
JLabel a,b;
JTextField ta;
JButton bt;
JTextArea t;
ImageIcon x;
Statement s;
String Str="";
Connection con;
Container cn;
passbook()
{
super("Transaction Enquiry");
cn=getContentPane();
cn.setLayout(null);

a=new JLabel("Enter Account no.");
a.setBounds(50,20,100,30);
cn.add(a);
		
ta=new JTextField(10);
ta.setBounds(160,20,100,25);
cn.add(ta);
	
bt=new JButton("Search");
bt.setBounds(120,60,90,25);
cn.add(bt);
bt.addActionListener(this);

t=new JTextArea(5,85);
t.setBounds(10,110,1000,80);
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
Str="Account_No"+"\t\t"+"Date"+"\t\t"+"Deposited_by"+"\t\t"+"Amount"+"\t\t"+"Status"+"\t\t"+"Total_Amount"+"\n";
if(ae.getSource()==bt)
{
String no=ta.getText();
String Str1="select* from Transaction where(Account_no='"+no+"')";
ResultSet rs=s.executeQuery(Str1);
if(rs.next())
{
Str=Str+rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6);
t.setText(Str);
}
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
new passbook();
}
}