

package gitapp;

/**
 *
 * @author Donald
 */

import javax.swing.*;
import java.awt.event.*;

public class GitApp {
    
    JFrame f = new JFrame("Log");
    JPanel p = new JPanel();
    JLabel l;
    JButton b,b1,b2;
    JTextField tx,tx1;

    GitApp(){
        
        p.setLayout(null);
        f.add(p);
        f.setLocation(500,100);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(500,300);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new GitApp();
    }
    
}
