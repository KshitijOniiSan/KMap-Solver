import java.awt.Color;
import java.awt.event.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class frame extends JFrame implements ActionListener{
    butt[][] b=new butt[4][4];
    int array[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    Eval Evaluate = new Eval();
    ResetButton Reset=new ResetButton();
    frame(){
        setSize(600,600);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(32,250,255));
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                b[i][j]=new butt(200+i*50,200+j*50);
                b[i][j].addActionListener(this);
            }
        }
        int ch=4;
        switch(ch){
            case 2:
            for(int i=1;i<ch+1;i++){
                for(int j=1;j<ch+1;j++){
                    add(b[i][j]);
                }
            }

            break;
            case 4:
                for(int i=0;i<ch;i++){
                    for(int j=0;j<ch;j++){
                        add(b[i][j]);
                    }
                }
        }
        add(new lab("K-Map Solver",225,0));
        add(Evaluate);
        Reset.addActionListener(this);
        add(Reset);        
        String[] options = {"2","3","4"};
        JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(options));
        comboBox.setBounds(200, 130, 140, 20);
        add(comboBox);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(e.getSource()==b[i][j]){
                    b[i][j].onclick();
                    array[i][j]=(array[i][j]+1)%2;
                }
                if(e.getSource()==Reset){
                    b[i][j].reset();
                }
                if(e.getSource()==Evaluate){
                    
                }
            }
        }
    }
}
