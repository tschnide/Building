
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BuildingApp extends JFrame {

	public static void main(String[] args) {
		new BuildingApp().run();
	}
	
	public void run() {
		setBounds(100, 10, 1000, 1000);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	   	Building a = new Building(50, 100);
	   	add(a);
	   	setVisible(true);
	}

}
