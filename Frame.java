package ru.time2store.dmath;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame {
    JTextArea subsetC;
    JTextField subsetA;
    JTextField subsetB;
    MyArray subset = new MyArray();

    // Контсруктор окна GUI
    Frame() {

        JFrame jfrm = new JFrame("Лабораторная работа №1 по дискретной математике");

        jfrm.setPreferredSize(new Dimension(600, 300));
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lb1 = new JLabel("Введите множество А (вводится латинскими буквами):");
        JLabel lb2 = new JLabel("Введите множество B (вводится латинскими буквами):");

        JButton bt1 = new JButton("Выполнить операции над множествами");

        ActionListener actionListener = new TestActionListener();
        bt1.addActionListener(actionListener);

        subsetA = new JTextField(50);
        subsetB = new JTextField(50);
        subsetC = new JTextArea(7, 50);

        jfrm.add(lb1);
        jfrm.add(subsetA);
        jfrm.add(lb2);
        jfrm.add(subsetB);
        jfrm.add(bt1);
        jfrm.add(subsetC);

        jfrm.pack();
        jfrm.setVisible(true);

    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            subset.setArray(subsetA.getText(), subsetB.getText());
            subsetC.setText(subset.showSubset() + '\n' + subset.aIsSubsetB() + '\n' + subset.sum() + '\n'
                    + subset.intersection() + '\n' + subset.diff() + '\n' + subset.simmetricDiff());
        }
    }
}

