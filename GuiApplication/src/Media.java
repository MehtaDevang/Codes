import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import java.net.*;
import java.io.*;
import javax.sound.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class Media extends JFrame{
	private JMenu menu;
	private JMenu edit;
	private JMenuBar menubar;
	private JMenuItem exit;
	private JMenuItem open;
	private JButton music;
	private JLabel message;
	private JLabel item;
	private JLabel price;
	GridBagConstraints gb = new GridBagConstraints();
	private JFileChooser chooser;
	
	Media(){
		super("Play Video");
		setLayout(new GridBagLayout());
		
		menubar = new JMenuBar();
		menu = new JMenu("File");
		menubar.add(menu);
		edit = new JMenu("Edit");
		menubar.add(edit);
		
		open = new JMenuItem("Open Video");
		menu.add(open);
		exit = new JMenuItem("Exit");
		menu.add(exit);
		add(menubar);
		setJMenuBar(menubar);
		
		music = new JButton("Play Music");
		gb.gridx = 0;
		gb.gridy = 3;
		add(music, gb);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		int xPos = (d.width/2) - getWidth()/2;
		int yPos = (d.height/2) - getHeight()/2;
		
		
		
		Handler handler = new Handler();
		exit.addActionListener(handler);
		open.addActionListener(handler);
		music.addActionListener(handler);
		
		
	}
	
	private class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == exit) {
				System.exit(0);
			}
			else if(e.getSource() == open) {
				chooser = new JFileChooser();
				int op = chooser.showOpenDialog(null);
				File f = new File("f");
				if(op == JFileChooser.APPROVE_OPTION) {
					f = chooser.getSelectedFile();
					message = new JLabel();
					message.setText("" + f.getName());
					add(message);
				}
			}
			else if(e.getSource() == music) {

			}
		}
		
	}
}


