import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Project4Gui extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JPanel panel;
	JLabel text1;
	JButton button;
	JButton button2;
	JButton choice1;
	JButton choice2;
	JLabel text2;
	JLabel text3;
	JLabel text4;
	JLabel text5;
	JLabel text6;
	JLabel text7;
	JLabel text8;
	JLabel text9;
	JLabel text10;
	JLabel cookie;
	ImageIcon cookiePic;
	JLabel dead;
	ImageIcon deadPic;
	int count = 0;
	int count2 = 0;
	
	public Project4Gui(){
	
		
		button = new JButton("dont click me");
		button2 = new JButton("I am the backup");
		choice1 = new JButton("Fight");
		choice2 = new JButton("give up");
		panel = new JPanel();
		text1 = new JLabel();
		text2 = new JLabel();
		text3 = new JLabel();
		text4 = new JLabel();
		text5 = new JLabel();
		text6 = new JLabel();
		text7 = new JLabel();
		text8 = new JLabel();
		text9 = new JLabel();
		text10 = new JLabel();
		cookiePic = new ImageIcon("teS5H3E.png");
		cookie = new JLabel(cookiePic);
		deadPic = new ImageIcon("skull.png");
		dead = new JLabel(deadPic);
		
		panel.setBackground(new Color(100,150,120));
		button.setBounds(10, 100, 100, 5);
		button.addActionListener(this);
		button2.setSize(50, 75);
		button2.addActionListener(this);
		choice1.addActionListener(this);
		choice2.addActionListener(this);
		
		panel.add(button);
		panel.add(button2).setVisible(false);
		panel.add(choice1).setVisible(false);
		panel.add(choice2).setVisible(false);
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		panel.add(text4);
		panel.add(text5);
		panel.add(text6);
		panel.add(text7);
		panel.add(text8);
		panel.add(text9);
		panel.add(text10);
		panel.add(cookie).setVisible(false);
		panel.add(dead).setVisible(false);
		
		this.setSize(750, 750);
		this.setResizable(true);
		//this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(panel);
		

	

	}
	public static void main(String[] args){new Project4Gui();}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		if(count == 1) {
			
			text1.setText("can you not read");
			
		}
		if(count == 2) {
			
			text1.setVisible(false);
			text2.setText("it litterally says don't click me");
			
		}
		if(count == 3) {
			
			text2.setVisible(false);
			text3.setText("stop touching me I'm serious");
			
		}
		if(count == 4) {
			
			text3.setVisible(false);
			panel.setLayout(null);
			button.setBounds(200, 400, 150, 30);
			
		}
		if(count == 5) {
			
			text5.setBounds(200, 450, 500, 30);
			text5.setText("I think you have some trauma that needs to be worked out bud");	
			
		}
		if(count == 6) {
			
			text5.setVisible(false);
			text6.setBounds(200, 450, 500, 30);
			text6.setText("stop or i'm gonna get my backup");
			text6.setVisible(true);
			
		}
		if(count == 7) {
			
			text6.setVisible(false);
			button2.setBounds(400, 300, 250, 40);
			button2.setVisible(true);
			
			}
		if(e.getSource() == button2 || count == 8) {
			
			count2++;
			panel.setBackground(new Color(137,0,0));
			button.setVisible(false);
			button2.setBounds(225, 275, 300, 50);
			button2.setText("It's me and you now");
			Font F1 = new Font(Font.SERIF, Font.BOLD, 20);
			button2.setFont(F1);
			text7.setText("you have two choices now.");
			text7.setBounds(285, 350, 200, 25);
			text8.setText("choose wisely :) ");
			text8.setBounds(310, 375, 200, 25);
			choice1.setBounds(150, 500, 200, 25);
			choice2.setBounds(400, 500, 200, 25);
			choice1.setVisible(true);
			choice2.setVisible(true);
			
		}
		if(e.getSource() == choice1) {
			
			button2.setVisible(false);
			choice1.setVisible(false);
			choice2.setVisible(false);
			text7.setVisible(false);
			text8.setVisible(false);
			text9.setText("YOU ARE DEAD");
			text9.setVisible(true);
			dead.setVisible(true);
			dead.setBounds(300, 200, 200, 200);
			text9.setBounds(200, 400, 450, 100);
			Font F2 = new Font(Font.SERIF, Font.BOLD, 50);
			text9.setFont(F2);
			
		}
		if(e.getSource() ==  choice2) {
			
			panel.setBackground(new Color(250, 100, 175));
			button2.setVisible(false);
			choice1.setVisible(false);
			choice2.setVisible(false);
			text7.setVisible(false);
			text8.setVisible(false);
			text9.setText("Good choice!");
			text10.setText("You want a cookie?");
			text9.setVisible(true);
			text10.setVisible(true);
			cookie.setVisible(true);
			cookie.setBounds(175, 200, 400, 400);
			cookie.setIcon(cookiePic);cookie.setIcon(cookiePic);
			text9.setBounds(300, 20, 450, 100);
			text10.setBounds(250, 70, 450, 100);
			Font F2 = new Font(Font.MONOSPACED, Font.BOLD, 24);
			Font F3 = new Font(Font.MONOSPACED, Font.BOLD, 24);
			text9.setFont(F2);
			text10.setFont(F3);
			
		}
	}
}
