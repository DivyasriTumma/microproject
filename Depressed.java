import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.util.*;
public class Depressed extends JFrame{
	private JPanel panel2;
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Depressed frame = new Depressed();
					frame.setVisible(true);			
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Depressed() {
		setTitle("New Frame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(300, 150, 1000, 600);
		panel2 = new JPanel();
		panel2.setBorder(new LineBorder(Color.BLACK,5));
		panel2.setBackground(new Color(255,217,224));
		setContentPane(panel2);
		panel2.setLayout(null);
    	JButton b1=new JButton("LISTENING");
        JButton b2=new JButton("WATCHING");
        b1.setBounds(400, 300, 200, 50);
        b1.setBorder(new LineBorder(Color.BLACK,2));
        b2.setBorder(new LineBorder(Color.BLACK,2));
        b2.setBounds(400, 370, 200, 50);
		panel2.add(b1);
        panel2.add(b2);
        b1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		Random rand1 = new Random();
    	        int r1 = rand1.nextInt(5);
    	        switch(r1) {
    	        case 1:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=_xuI60USDjw");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 2:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=1ozmyl1ZEyY");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 3:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=J1KpuR2Khz8");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 4:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=VNydR_qKiH0");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 5:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=05HYHpDKR2k");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        }
			}
		});
        b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Random rand1 = new Random();
		        int r1 = rand1.nextInt(5);
		        switch(r1) {
		        case 1:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=bxr2wODX62w");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 2:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=5xVuYhf8MvE");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 3:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=8WwLPep9xNg");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 4:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=O-6f5wQXSu8");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 5:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=q3EOiOVt8OY");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        }
			}
		});
        JLabel lb1 = new JLabel("...PAIN IS TEMPORARY...");
		lb1.setForeground(Color.BLACK);
        lb1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lb1.setBounds(250, 50, 950, 40);
		panel2.add(lb1);
		JLabel lb2 = new JLabel("Like to listen a music or watch a video");
		lb2.setForeground(Color.BLACK);
        lb2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 25));
		lb2.setBounds(200, 200, 800, 30);
		panel2.add(lb2);
	}
}