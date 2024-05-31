import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener
{
 private JTextField t1;
 private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_add,b_sub,b_mul,b_div,bp,b_ans,b_clear;
 private JPanel p1;
 
 float a=0,b=0,num;
    String eqn="",op="",temp="",ans="";
      char ex;

 public Index(String s)
 {
  super(s);
  

  t1=new JTextField("");
  
  b0=new JButton("0");
  b1=new JButton("1");
  b2=new JButton("2");
  b3=new JButton("3");
  b4=new JButton("4");
  b5=new JButton("5");
  b6=new JButton("6");
  b7=new JButton("7");
  b8=new JButton("8");
  b9=new JButton("9");
  b_add=new JButton("+");
  b_sub=new JButton("-");
  b_mul=new JButton("*");
  b_div=new JButton("/");
  b_ans=new JButton("=");
  bp=new JButton(".");
  b_clear=new JButton("clear");
  
  p1=new JPanel();
  setLayout(null);
  t1.setBounds(50,25,300,50);
  
  p1.setLayout(new GridLayout(4,4,10,10));
  p1.setBounds(50,100,300,300);
  b_clear.setBounds(150,420,100,50);
  p1.add(b7);p1.add(b8);p1.add(b9);p1.add(b_div);
  p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b_mul);
  p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b_sub);
  p1.add(bp);p1.add(b0);p1.add(b_ans);p1.add(b_add);
  
  add(t1);
  add(p1);
  add(b_clear);
  setSize(420,550);
  setVisible(true);
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  b0.addActionListener(this);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b_add.addActionListener(this);
  b_sub.addActionListener(this);
  b_mul.addActionListener(this);
  b_div.addActionListener(this);
  bp.addActionListener(this);
  b_clear.addActionListener(this);
  b_ans.addActionListener(this);

 }

  

 public void actionPerformed(ActionEvent e)
 {
    
    if(e.getSource()==b1)
    {
        eqn+=b1.getText();
        t1.setText(eqn);
    }
    if(e.getSource()==b2)
     {
         eqn+=b2.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b3)
     {
         eqn+=b3.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b4)
     {
         eqn+=b4.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b5)
     {
         eqn+=b5.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b6)
     {
         eqn+=b6.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b7)
     {
         eqn+=b7.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b8)
     {
         eqn+=b8.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b9)
     {
         eqn+=b9.getText();
         t1.setText(eqn);
     }

     if(e.getSource()==b0)
     {
        if(eqn!="")
         eqn+=b0.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==bp)
     {
         eqn+=bp.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b_add)
     {
        if(eqn!="")
         eqn+=b_add.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b_sub)
     {
        if(eqn!="")
         eqn+=b_sub.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b_mul)
     {
        if(eqn!="")
         eqn+=b_mul.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b_div)
     {
        if(eqn!="")
         eqn+=b_div.getText();
         t1.setText(eqn);
     }
     if(e.getSource()==b_clear)
     {
        eqn="";
         t1.setText(eqn);
     }
     if(e.getSource()==b_ans)
     {
        //t1.setText("temp");
        if(eqn!="")
         eqn+=b_ans.getText();
         int len=eqn.length();
        op=""; a=b=0;
     for(int i=0;i<len;i++)
     {
         ex=eqn.charAt(i);
         if(Character.isDigit(ex))
         {
             temp=String.valueOf(eqn.charAt(i));
             num =Integer.parseInt(temp);
             if(op.equals(""))
               a=(a*10)+num;
             else
               b=(b*10)+num;
         }
         else
         {
            if(String.valueOf(eqn.charAt(i)).equals("."))
            {
                temp=String.valueOf(eqn.charAt(++i));
             num =Integer.parseInt(temp);
             if(op.equals(""))
               a=((a*10)+num)/10;
             else
               b=((b*10)+num)/10;
            }

            else if(!String.valueOf(eqn.charAt(i)).equals("=") &&op.equals(""))
                op=String.valueOf(eqn.charAt(i));
             
            else if(!String.valueOf(eqn.charAt(i)).equals("="))
                 {
                   if(op.equals("+"))
                       a=a+b;
                    if(op.equals("-"))
                       a=a-b;
                    if(op.equals("*"))
                       a=a*b;
                    if(op.equals("/"))
                        a=a/b;
                 b=0;
                op=String.valueOf(eqn.charAt(i));
               }   
               else
               {
                  
                   if(op.equals("+"))
                   {
                    ans=String.valueOf((a+b));
                    t1.setText(ans);
                    eqn=ans;
                   }
                       
                    if(op.equals("-"))
                    {
                        ans=String.valueOf((a-b));
                        t1.setText(ans);
                        eqn=ans;
                       }

                    if(op.equals("*"))
                    {
                    ans=String.valueOf((a*b));
                    t1.setText(ans);
                    eqn=ans;
                   }

                    if(op.equals("/"))
                    {
                        ans=String.valueOf((a/b));
                        t1.setText(ans);
                        eqn=ans;
                       }
               }
        
         }    
        } 
    }
    
 } public static void main(String arg[])
 {
  new Index("calculator");
 }

 

}


