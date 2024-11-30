package com.lab111.labwork4.gui;

import javax.swing.*;
import java.awt.*;
import com.lab111.labwork4.factory.*;
import com.lab111.labwork4.furniture.chair.Chair;

public class FurnitureGUI extends JFrame {
    private FurnitureFactory factory;

    public FurnitureGUI() {
        setTitle("Furniture Creator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JComboBox<String> styleCombo = new JComboBox<>(new String[]{"Modern", "Victorian", "Minimalist"});
        JButton createButton = new JButton("Create Chair");
        JLabel resultLabel = new JLabel("Result will be shown here");

        panel.add(styleCombo);
        panel.add(createButton);
        panel.add(resultLabel);

        createButton.addActionListener(e -> {
            String style = (String) styleCombo.getSelectedItem();
            switch (style) {
                case "Modern":
                    factory = ModernFurnitureFactory.getInstance();
                    break;
                case "Victorian":
                    factory = new VictorianFurnitureFactory();
                    break;
                case "Minimalist":
                    factory = new MinimalistFurnitureFactory();
                    break;
            }
            Chair chair = factory.createChair();
            chair.sitOn();
            resultLabel.setText("Created " + style + " chair");
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FurnitureGUI().setVisible(true));
    }
}