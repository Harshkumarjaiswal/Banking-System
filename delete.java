import java. awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class delete extends JFrame implements ActionListener
{	
JLabel a;
JTextField m;
JButton bt,ct;
Connection con;
String s1;
Statement st;
Container cn;
delete()
{
super("Deletion form");
cn=getContentPane();
cn.setLayout(null);
a=new JLabel("Enter Account No");
a.setBounds(10,100,100,25);
cn.add(a);
m=new JTextField(10);
m.setBounds(120,100,150,25);
cn.add(m);
 
bt=new JButton("Delete");
bt.setBounds(500,300,100,25);
cn.add(bt);
ct=new JButton("Back");
ct.setBounds(250,300,100,25);
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
 s1=m.getText();
 


st=con.createStatement();

int k=st.executeUpdate("delete from account where Account_No=('"+s1+"')");



m.setText("");

}

}
catch(SQLException e)
{
System.out.print(e);
}
 if(ae.getSource()==ct)
{
new admin1();
}
setVisible(false); 
}
public static void main(String arg[])
{
new delete();
}
}
