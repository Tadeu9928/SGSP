/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sgspproject.sgsp;

import com.sgspproject.sgsp.view.Login;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jonat
 */
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
