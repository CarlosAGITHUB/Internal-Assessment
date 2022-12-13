package com.wakanda;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton ButtonMicro;
    private JPanel MainMenu;

    public App() {
        ButtonMicro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Microeconomics");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        sliderDemo slider = new sliderDemo();
    }

    public static class sliderDemo implements ChangeListener {
        JFrame frame;
        JPanel panel;
        JLabel label;
        JSlider slider;

        sliderDemo() {
            frame = new JFrame("Slider Demo");
            panel = new JPanel();
            label = new JLabel();
            slider = new JSlider(0, 100, 50);

            slider.setPreferredSize(new Dimension(400, 200));

            slider.setPaintTicks(true);
            slider.setMinorTickSpacing(10);

            slider.setPaintTrack(true);
            slider.setMajorTickSpacing(25);

            slider.setPaintLabels(true);
            slider.setFont(new Font("Courier New", Font.PLAIN, 15));
            label.setFont(new Font("Courier New", Font.BOLD, 25));

            label.setText("" + slider.getValue());
            slider.addChangeListener(this);

            panel.add(slider);
            panel.add(label);
            frame.add(panel);
            frame.setSize(420, 420);
            frame.setVisible(true);

        }

        @Override
        public void stateChanged(ChangeEvent e) {
            label.setText("" + slider.getValue());

        }
    }
}