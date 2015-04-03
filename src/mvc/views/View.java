package mvc.views;
import javax.swing.*;
import java.awt.BorderLayout;

public class View {
	 	private JFrame frame;
	    private JLabel label1;
	    private JButton button1;
	    private JLabel label2;
	    private JButton button2;

	    
	    public View(String text){
	        frame = new JFrame("View");                                    
	        frame.getContentPane().setLayout(new BorderLayout());                                          
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
	        frame.setSize(200,200);        
	        frame.setVisible(true);
	        
	        label1 = new JLabel(text);
	        frame.getContentPane().add(label1, BorderLayout.EAST);
	        
	        button1 = new JButton("Button1");
	     //   button1.setActionCommand("one");
	        frame.getContentPane().add(button1, BorderLayout.SOUTH);     
	        
	        label2 = new JLabel(text);
	        frame.getContentPane().add(label2, BorderLayout.WEST);
	        
	        button2 = new JButton("Button2"); 
	    //    button2.setActionCommand("two");
	        frame.getContentPane().add(button2, BorderLayout.NORTH);        
	    }
	        
	    public JButton getButton1(){
	        return button1;
	    }
	    
	    public void setText1(String text){
	        label1.setText(text);
	    }
	    public JButton getButton2(){
	        return button2;
	    }
	    
	    public void setText2(String text){
	        label2.setText(text);
	    }
	    
	    
}
