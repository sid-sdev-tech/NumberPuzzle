/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzle;

/**
 *
 * @author hp
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumPuzzle extends Frame implements ActionListener,WindowListener
{
    JFrame f = new JFrame("Number Puzzle");
    JLabel la = new JLabel(" Number Puzzle..");
    JLabel la1 = new JLabel(" ");
    JButton btn = new JButton(" RESET ");
    JButton[] button = new JButton[9]; 
    public NumPuzzle()
    {
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 22);
        Font font = new Font("Times New Roman", Font.BOLD, 25);
        button[0] = new JButton("4");button[1] = new JButton("3");button[2] = new JButton(" ");
        button[3] = new JButton("2");button[4] = new JButton("1");button[5] = new JButton("5");
        button[6] = new JButton("7");button[7] = new JButton("8");button[8] = new JButton("6");
        
        for(int i = 0;i<9;i++)
        {
            add(button[i]);
            button[i].setFont(f);
            button[i].setBackground(Color.white);
            button[i].addActionListener(this);
            
        }
        add(la);la.setFont(f);la.setBounds(150, 55, 185, 50);
        add(la1);la1.setFont(font);la1.setBounds(170, 500, 185, 50);
        la1.setForeground(Color.white);
        button[0].setBounds(80,115,100,110);button[1].setBounds(182,115,100,110);button[2].setBounds(285,115,100,110);
        button[3].setBounds(80,230,100,110);button[4].setBounds(182,230,100,110);button[5].setBounds(285,230,100,110);
        button[6].setBounds(80,345,100,110);button[7].setBounds(182,345,100,110);button[8].setBounds(285,345,100,110);
        add(btn);btn.setFont(f);
        btn.setBackground(Color.white);btn.setForeground(Color.red);
        btn.setBounds(140, 570, 185, 55);
        btn.addActionListener(this);addWindowListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Object o = ae.getSource();
 
        //System.out.println("Object o contains :- " + o);
        if(ae.getSource() == button[0])
        {
            String s = button[0].getText();String s0 = button[1].getText();String s1 = button[3].getText();
            if(s0.equals(" "))
            {
                button[1].setText(s);
                button[0].setText(s0);
            }
            else if(s1.equals(" "))
            {
                button[3].setText(s);
                button[0].setText(s1);
            }
        }
        
        if(ae.getSource() == button[1])
        {
            String s = button[1].getText();String s0 = button[0].getText();
            String s1 = button[2].getText();String s2 = button[4].getText();
            if(s0.equals(" "))
            {
                button[0].setText(s);
                button[1].setText(s0);
            }
            else if(s1.equals(" "))
            {
                button[2].setText(s);
                button[1].setText(s1);
            }
            else if(s2.equals(" "))
            {
                button[4].setText(s);
                button[1].setText(s2);
            }
        }
        
        if(ae.getSource()== button[2])
        {
            String b = button[2].getText();String b0 = button[1].getText();String b1 = button[5].getText();
            if(b0.equals(" "))
            {
                button[1].setText(b);
                button[2].setText(b0);
            }
            else if (b1.equals(" "))
            {
                button[5].setText(b);
                button[2].setText(b1);
            }
        }
        
        if(ae.getSource()== button[3])
        {
            String b = button[3].getText();String b2 = button[0].getText();
            String b3 = button[4].getText();String b4 = button[6].getText();
            if(b2.equals(" "))
            {
                button[0].setText(b);
                button[3].setText(b2);
            }
            else if(b3.equals(" "))
            {
               button[4].setText(b);
               button[3].setText(b3);
            }
            else if(b4.equals(" "))
            {
                button[6].setText(b);
                button[3].setText(b4);
            }
        }
        
        if(ae.getSource()==button[4])
        {
            String b5 = button[4].getText();String b6 = button[3].getText();
            String b7 = button[5].getText();String b8 = button[1].getText();
            String b9 = button[7].getText();
            
            if(b8.equals(" "))
            {
                button[1].setText(b5);
                button[4].setText(b8);
            }
            else if(b6.equals(" "))
            {
                button[3].setText(b5);
                button[4].setText(b6);
            }
            else if(b7.equals(" "))
            {
                button[5].setText(b5);
                button[4].setText(b7);
            }
            else if(b9.equals(" "))
            {
                button[7].setText(b5);
                button[4].setText(b9);
            }
        }
                
        if(ae.getSource()== button[5])
        {
            String s0 = button[2].getText();String s1 = button[4].getText();
            String s2 = button[8].getText();String s3 = button[5].getText();

            if(s0.equals(" "))
            {
                button[2].setText(s3);
                button[5].setText(s0);
            }
            else if(s1.equals(" "))
            {
                button[4].setText(s3);
                button[5].setText(s1);
            }
            if(s2.equals(" "))
                {
                    button[8].setText(s3);
                    button[5].setText(s2);
                }
        }
        if(ae.getSource()== button[6])
        {
            String s4 = button[6].getText();String s5 = button[3].getText();String s6 = button[7].getText();
            if(s5.equals(" "))
            {
                button[3].setText(s4);
                button[6].setText(s5);
            }
            else if(s6.equals(" "))
            {
                button[7].setText(s4);
                button[6].setText(s6);
            }
        }
        
        if(ae.getSource()== button[7])
        {
            String s7 = button[7].getText();String s8 = button[4].getText();
            String s9 = button[6].getText();String s10 = button[8].getText();
            
            if(s8.equals(" "))
            {
                button[4].setText(s7);
                button[7].setText(s8);
            }
            else if (s9.equals(" "))
            {
                button[6].setText(s7);
                button[7].setText(s9);
            }
            if(s10.equals(" "))
            {
                button[8].setText(s7);
                button[7].setText(s10);
            }
        }
        
        if(ae.getSource()==button[8])
        {
            String ss = button[8].getText();String ss0 = button[5].getText();String ss1 = button[7].getText();
            
            if(ss0.equals(" "))
            {
                button[5].setText(ss);
                button[8].setText(ss0);
            }
            else if (ss1.equals(" "))
            {
                button[7].setText(ss);
                button[8].setText(ss1);
            }
        }
        if(o == btn)
        {
            button[0].setText("4");button[1].setText("3");
            button[2].setText(" ");button[3].setText("2");
            button[4].setText("1");button[5].setText("5");
            button[6].setText("7");button[7].setText("8");
            button[8].setText("6");
            la1.setText(" ");
        }
      
        if(button[0].getText()=="1" && button[1].getText()== "2" && button[2].getText()=="3")
        {
            if(button[3].getText()=="4" && button[4].getText()=="5" && button[5].getText()=="6")
            {
                if(button[6].getText()=="7" && button[7].getText()=="8" && button[8].getText()==" ")
                {
                    la1.setText("You Win..!!");
                }
            }
        }
    }
    public void windowActivated(WindowEvent we)
    { }
    public void windowClosed(WindowEvent ce)
    { }
    public void windowClosing(WindowEvent we)
    {
        dispose();
    }
    public void windowDeactivated(WindowEvent we)
    { }
    public void windowDeiconified(WindowEvent de)
    { }
    public void windowIconified(WindowEvent ie)
    { }
    public void windowOpened(WindowEvent oe)
    { }
}

public class NumberPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        NumPuzzle np = new NumPuzzle();
        np.setTitle("Number Puzzle");
        np.setVisible(true);
        np.setSize(500,650);
        np.setBackground(new Color(255, 77, 77));
    }
}
