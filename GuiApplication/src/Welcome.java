import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.image.*;

public class Welcome extends JFrame{
	private JLabel message;
	private JLabel containsImage;
	private ImageIcon image;
	private ImageIcon icon; 
	private JButton button;
	private JProgressBar bar;
	
	protected int counter = 0;
	Welcome(){
		super("Welcome");
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.BLACK);
		image = new ImageIcon("/home/reaper/Downloads/independence.jpeg");
		containsImage = new JLabel(image);
		panel1.add(containsImage);
		message = new JLabel();
		message.setText("A software made on the occassion of Independence Day");
		message.setForeground(Color.WHITE);
		panel1.add(message);
		add(panel1);
		
		button = new JButton("Next");
		panel1.add(button);
		
		bar = new JProgressBar(0, 100);
		panel1.add(bar);
		bar.setStringPainted(true);
		bar.setForeground(Color.GREEN);
//		int val = 0;
//		for(int i = 0; i < 5; i++) {
//			bar.setValue(val);
//			val = val + 10;
//			
//		}
//		
		
		Handler handler = new Handler();
		button.addActionListener(handler);
		
	}
	
	private class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				Thread runner = new Thread() {
                    public void run() {
                        counter = 0;
                        while (counter <= 100) {
                            Runnable runme = new Runnable() {
                                public void run() {
                                    bar.setValue(counter);
                                }
                            };
                            SwingUtilities.invokeLater(runme);
                            counter++;
                            try {
                                Thread.sleep(100);
                            } 
                            catch (Exception ex) {
                            
                            }
                        }
                        setVisible(false);
        				dispose();
        				MainPage obj = new MainPage();
        				obj.setSize(400,150);
        				obj.setVisible(true);
        				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        				obj.setLocationRelativeTo(null);
        				obj.setResizable(false);
                    }
                };
                runner.start();
                
				
			}
		}
	}
}
