package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3 extends JFrame {
    private JComboBox<String> colorDropdown;
    private JLabel colorLabel;
    private JPanel circlePanel;

    public Lab3() {
        // Set up the main frame
        setTitle("Color Selector App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create components
        colorDropdown = new JComboBox<>(new String[] { "", "Red", "Blue", "Green" });
        colorLabel = new JLabel("Selected Color: ");
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the outline of the circle
                g.setColor(Color.BLACK);
                ((Graphics2D) g).setStroke(new BasicStroke(2));
                g.drawOval(150, 75, 100, 100);

                // Draw the filled circle with the selected color
                if (colorDropdown.getSelectedIndex() == 1) {
                    g.setColor(Color.RED);
                } else if (colorDropdown.getSelectedIndex() == 2) {
                    g.setColor(Color.BLUE);
                } else if (colorDropdown.getSelectedIndex() == 3) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(getBackground());
                }
                g.fillOval(150, 75, 100, 100);
            }
        };

        // Set layout for the colorPanel
        circlePanel.setBackground(Color.WHITE);

        // Add components to the frame
        add(colorDropdown, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);
        add(colorLabel, BorderLayout.SOUTH);

        // Add ActionListener to the colorDropdown
        colorDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the colorLabel and repaint the circlePanel
                colorLabel.setText("Selected Color: " + colorDropdown.getSelectedItem());
                circlePanel.repaint();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Lab3 colorSelectorApp = new Lab3();
                colorSelectorApp.setVisible(true);
            }
        });
    }
}
