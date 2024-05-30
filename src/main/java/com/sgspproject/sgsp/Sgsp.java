package com.sgspproject.sgsp;

import com.sgspproject.sgsp.view.Login;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Sgsp {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Login login = new Login();
        jf.add(login);
        jf.setSize(700, 500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
