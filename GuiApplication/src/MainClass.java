import java.awt.*;
import javax.swing.*;

public class MainClass extends JFrame{
	public static void main(String[] args) {
		Welcome obj = new Welcome();
		obj.setSize(450, 300);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);
		obj.setResizable(true);
//		obj.setLocation(400, 200);
		obj.setLocationRelativeTo(null);
	}
}
