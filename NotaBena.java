import javax.swing.*;

public class NotaBena extends JFrame 
{
  public static void main( String args[] ) 
  {
    JFrame frame = new NotaBena();
    frame.setSize( 300, 125 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Is it Bob's birthday?");
    JPanel framed = new Framed();
    frame.setContentPane( framed );
    frame.setVisible( true );
    frame.setLocation(frame.getX()+500,frame.getY()+300);
  }
}
