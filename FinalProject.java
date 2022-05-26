import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class FinalProject extends JFrame {
	private JPanel panel1;
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					FinalProject frame1 = new FinalProject();
					frame1.setVisible(true);					
				} 
				catch (Exception e){
					e.printStackTrace();
				}
		    }
		});
	}
	public FinalProject() {
		setTitle("OUR PROJECT");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(100, 100, 450, 300);
		panel1 = new JPanel();
		panel1.setBorder(new LineBorder(Color.BLACK,17));
		panel1.setBackground(new Color(193,227,254));
		setContentPane(panel1);
		panel1.setLayout(null);
		JButton button1 = new JButton("...HAPPY...");
		JButton button2 = new JButton("...SAD...");
		JButton button3 = new JButton("...ANGRY...");
		JButton button4 = new JButton("...DEPRESSED...");
		JButton button5 = new JButton("...CONFUSED...");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Happy frame = new Happy();
				frame.setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
	    });
		button1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button1.setBounds(650, 330, 250, 50);
		panel1.add(button1);
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Sad frame = new Sad();
				frame.setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
	    });
		button2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button2.setBounds(650, 400, 250, 50);
		panel1.add(button2);
		
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Angry frame = new Angry();
				frame.setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
	    });
		button3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button3.setBounds(650, 470, 250, 50);
		panel1.add(button3);
		
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Depressed frame = new Depressed();
				frame.setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
	    });
		button4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button4.setBounds(650, 540, 250, 50);
		panel1.add(button4);
		
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Confused frame = new Confused();
				frame.setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
	    });
		button5.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button5.setBounds(650, 610, 250, 50);
		panel1.add(button5);
		JLabel lb1 = new JLabel(".............WELCOME............");
		JLabel lb2 = new JLabel("Click any button");
		lb1.setForeground(Color.BLACK);
        lb1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lb1.setBounds(380, 100, 1000, 39);
		panel1.add(lb1);
		lb2.setForeground(Color.BLACK);
        lb2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lb2.setBounds(600, 230, 1000, 39);
		panel1.add(lb2);
	}
}
