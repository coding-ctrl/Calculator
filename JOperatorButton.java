import javax.swing.*;
import java.awt.*;
public class JOperatorButton extends JButton {
    public JOperatorButton(String text){
        super.setText(text);
        this.setBackground(Color.gray);
        this.setFont(new Font("Courier", Font.PLAIN,20));
    }
}
