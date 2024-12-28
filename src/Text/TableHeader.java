package Text;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(new Color(131, 145, 146));
        setFont(new Font("sanserif", 1, 22));
        setForeground(new Color(0, 77, 102));
        setBorder(new EmptyBorder(0, 0, 0, 0));
    }
}
