import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.util.*;
public class Confused extends JFrame{
	private JPanel panel2;
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Confused frame = new Confused();
					frame.setVisible(true);			
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Confused() {
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
    					URI uri= new URI("https://www.youtube.com./watch?v=DFzoKeYht74");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 3:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=65P3H1idDQE");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 4:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=caiyHdnXMq8");
    		            java.awt.Desktop.getDesktop().browse(uri);
    		            System.out.println("Web page opened in browser");
    		        } 
    				catch (Exception ee) {
    					ee.printStackTrace();
    		        }
    	        	break;
    	        case 5:
    	        	try {
    					URI uri= new URI("https://www.youtube.com./watch?v=_xuI60USDjw");
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
						URI uri= new URI("https://www.youtube.com./watch?v=vEmjq5hzKyk");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 2:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=TZOMRTlzbRs&t=2s");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 3:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=lZcmLaY7fG0");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 4:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=BModIXQTshA");
			            java.awt.Desktop.getDesktop().browse(uri);
			            System.out.println("Web page opened in browser");
			        } 
					catch (Exception ee) {
						ee.printStackTrace();
			        }
		        	break;
		        case 5:
		        	try {
						URI uri= new URI("https://www.youtube.com./watch?v=lbm5LdPq30s");
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
        JLabel lb1 = new JLabel("...NEVER EVER GIVE UP...");
		lb1.setForeground(Color.BLACK);
        lb1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lb1.setBounds(200, 50, 950, 33);
		panel2.add(lb1);
		JLabel lb2 = new JLabel("Like to listen a music or watch a video");
		lb2.setForeground(Color.BLACK);
        lb2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 25));
		lb2.setBounds(200, 200, 800, 30);
		panel2.add(lb2);
	}
}