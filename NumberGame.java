

package com.mycompany.numbergame;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGame extends JFrame implements ActionListener {
    JButton b;
    JTextField t1,t2,t3;
    int min,max,ran;
    JLabel att,score;
    int k=3;
    int z;

    NumberGame(){
        setLayout(null);
         min =1;
         max =100;
         ran = (int)(Math.random()*(max-min+1)+min);
         
         //ran = Integer.parseInt(t1.setText());
        JLabel heading  =new JLabel("Number Game");
        heading.setFont(new Font("Railway",Font.BOLD,25));
        heading.setBounds(150,20,700,20);
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel guess  =new JLabel("Guess");
        guess.setFont(new Font("Railway",Font.BOLD,25));
        guess.setBounds(20,100,700,20);
        guess.setForeground(Color.red);
        add(guess);
        
        att  =new JLabel("No_Of_Attemps");
        att.setFont(new Font("Railway",Font.BOLD,25));
        att.setBounds(20,250,800,25);
        att.setForeground(Color.red);
        add(att);
        att.setText("no_of_attemps : "+k);
        
        score = new JLabel("Score");
        score.setFont(new Font("Railway",Font.BOLD,25));
        score.setBounds(20,300,800,25);
        score.setForeground(Color.red);
        
        
        add(score);
        
        
        
        
        
        
        
        
        
        
        t2 = new JTextField();
        t1 = new JTextField();
        t1.setFont(new Font("Railway",Font.BOLD,25));
        t1.setBounds(120,100,200,25);
        t1.setBackground(Color.white);
        t1.setForeground(Color.black);
        add(t1);
        
        b = new JButton("Check");
        b.setFont(new Font("Railway",Font.BOLD,25));
        b.setBounds(120,200,150,30);
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        add(b);
        b.addActionListener(this);
        
        System.out.println(ran);
        setSize(500,500);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setTitle("Number Game");
        
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b){
            
            try{
                int i = Integer.parseInt(t1.getText());
                //while(i==ran){
                int j =0;
                if(i<0 || i>100){
                    JOptionPane.showMessageDialog(null,"Enter Between Range 1 to 100");
                }
                else
                {
                
                if(i==ran){
                    k--;
                     
                t2.setText("Perfect Guess");
                t2.setBounds(100,330,200,25);
                t2.setBackground(Color.white);
                t2.setForeground(Color.black);
                t2.setFont(new Font("Railway",Font.BOLD,18));
                add(t2);
                try{
                int l = Integer.parseInt(t1.getText());
                score.setText("Score : " +l/k);
                }catch(Exception e){
                    System.out.println(e);
                    
                }
                }
                
                else if(i<ran){
                    k--;
                     
                t2.setText("Too Low");
                t2.setBounds(100,330,200,25);
                t2.setBackground(Color.white);
                t2.setForeground(Color.black);
                t2.setFont(new Font("Railway",Font.BOLD,18));
                add(t2);
                try{
                int l = Integer.parseInt(t1.getText());
                score.setText("Score : " +l/k);
                }catch(Exception e){
                    System.out.println(e);
                    
                }
                }
                
                if(i>ran){
                    k--;
                    
                t2.setText("Too High");
                t2.setBounds(100,330,200,25);
                t2.setBackground(Color.white);
                t2.setForeground(Color.black);
                t2.setFont(new Font("Railway",Font.BOLD,18));
                add(t2);
                try{
                int l = Integer.parseInt(t1.getText());
                score.setText("Score : " +l/k);
                }catch(Exception e){
                    System.out.println(e);
                    
                }
                }
                
                }
               
                
                
                
                
                
            }catch(Exception e){
                System.out.println(e);
            }
            }
       
        
        att.setText("no_of_attemps : "+k);
        
        if(k==0 ){
            score.setText("Score : "+ t1.getText());
                    JOptionPane.showMessageDialog(null,"You Tried Well");
                    System.exit(0);
                    
                    
                }
        
        
    }

    public static void main(String[] args) {
        new NumberGame();
        
        
    }
}
