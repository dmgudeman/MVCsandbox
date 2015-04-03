package mvc.controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.models.*;
import mvc.views.*;

public class Controller {
	private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
                          
    }
    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  model.incrementX();
            	  if (ae.getActionCommand().endsWith("ton1")){
            		  view.setText1(Integer.toString(model.getX()));
            	  }else {
            		  view.setText2(Integer.toString(model.getX()));
            	  }
            	  
              }
        };                
        view.getButton1().addActionListener(actionListener); 
        view.getButton2().addActionListener(actionListener); 
    }
    
   

}
