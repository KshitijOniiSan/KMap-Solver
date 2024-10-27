import java.awt.Font;
import javax.swing.JLabel;
public class lab extends JLabel{
    lab(String l,int x,int y){
        setText(l);
        setBounds(x,y,400,50);
        setFont(new Font("Times new roman",Font.BOLD,25));
    }
}
