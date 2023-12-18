/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSEJU
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
        
public class Test_JTable  {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame f;    
    
    f=new JFrame();    
    String data[][]={ {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Amitttt","670000"},    
                          {"102","Jai","780000"},
                          {"101","Amitttt","670000"}, 
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,20,0);          
    //JScrollPane sp=new JScrollPane(jt);    
    //f.add(sp);
    
    JPanel myPanel = new JPanel( new BorderLayout() );
myPanel.add( jt.getTableHeader(), BorderLayout.NORTH );
myPanel.add( jt, BorderLayout.CENTER );

    f.add(jt);
    f.setSize(100,150);    
    f.setVisible(true);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}




