import java.awt.*;
class test1 extends Frame
  {
  Label lb;
  test1()
{
setLayout(new FlowLayout());
lb=new Label("Hello")
;
add(lb);
setSize(500,500);
setVisible(true);
}
public static void main(String arg[])
{
test1 obj=new test1();
}
}