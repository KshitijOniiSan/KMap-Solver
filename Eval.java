import javax.swing.JButton;
import java.awt.Font;

public class Eval extends JButton{
    Eval(){
        setBounds(400,400,75,30);
        setFont(new Font("Arial",Font.PLAIN,10));
        setText("Evaluate");
        setFocusable(false);
    }
    
}