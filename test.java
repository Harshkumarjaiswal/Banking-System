import java.awt.*;
class test extends Frame
  {
  Label lb;
  test()
{
setLayout(new FlowLayout());
lb=new Label("Hello");
add(lb);
setSize(500,500);
setVisible(true);
}
public static void main(String arg[])
{
test obj=new test();
}
}