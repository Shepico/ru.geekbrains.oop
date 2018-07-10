package lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(600, 200, 400, 400);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
        JPanel southPanel = new JPanel(new GridLayout(1, 4));
        southPanel.setPreferredSize(new Dimension(1, 60));
        add(southPanel, BorderLayout.SOUTH);
//        southPanel.setBackground(Color.GREEN);
        for (int i = 0; i < 4; i++) {
            JButton btn = new JButton("#" + (i + 1));
            btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
            southPanel.add(btn);
//            btn.setBackground(Color.BLUE);
        }


        setVisible(true);
    }

//    public MyWindow() {
//        setBounds(600, 200, 400, 400);
//        setTitle("My Window");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//        JButton btn1 = new JButton("Button #1");
//        btn1.setPreferredSize(new Dimension(1, 100));
//        add(btn1, BorderLayout.NORTH);
//        JButton btn2 = new JButton("Button #2");
//        add(btn2, BorderLayout.SOUTH);
//        JTextArea textArea = new JTextArea();
//        add(textArea, BorderLayout.CENTER);
//
//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello!");
//            }
//        });
//        btn2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textArea.append("Hello\n");
//            }
//        });
//
//        setVisible(true);
//    }
}
