import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Framed extends JPanel 
{
  JLabel b =new JLabel("Don't forget:");
  JLabel c = new JLabel("Think of Bob");
	
  Date today = Calendar.getInstance().getTime();
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");
  String now = sdf.format(today);

  public Framed() 
  {
	  String list = now;
	    JLabel find = new JLabel();		
		switch (list)
		{
		case "22-01":
			find.setText("It's Bobs Birthday!");
			break;
		case "23-01":
			find.setText("A day too late!");
			break;
		default:
			find.setText("whoops something went wrong!");
	}	
		add( find );
		add( b );
		add( c );
  	}
}
