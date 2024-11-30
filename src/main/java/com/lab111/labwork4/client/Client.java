package com.lab111.labwork4.client;

import com.lab111.labwork4.factory.FurnitureFactory;
import com.lab111.labwork4.factory.ModernFurnitureFactory;
import com.lab111.labwork4.factory.VictorianFurnitureFactory;
import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;

import javax.swing.*;
import java.awt.*;

public class Client {
    private static FurnitureFactory modernFactory = new ModernFurnitureFactory();
    private static FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Furniture Factory");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        String[] styles = {"Modern", "Victorian"};
        JComboBox<String> styleComboBox = new JComboBox<>(styles);

        String[] furnitureTypes = {"Chair", "Table", "Sofa", "Bookshelf"};
        JComboBox<String> typeComboBox = new JComboBox<>(furnitureTypes);

        JButton createButton = new JButton("Create Furniture");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        createButton.addActionListener(e -> {
            String style = (String) styleComboBox.getSelectedItem();
            String type = (String) typeComboBox.getSelectedItem();
            FurnitureFactory factory = style.equals("Modern") ? modernFactory : victorianFactory;

            String result = createFurniture(factory, type);
            resultArea.setText(result);
        });

        panel.add(new JLabel("Style:"));
        panel.add(styleComboBox);
        panel.add(new JLabel("Furniture Type:"));
        panel.add(typeComboBox);
        panel.add(createButton);
        panel.add(new JScrollPane(resultArea));

        frame.add(panel);
        frame.setVisible(true);
    }

    private static String createFurniture(FurnitureFactory factory, String type) {
        switch (type) {
            case "Chair":
                Chair chair = factory.createChair();
                chair.sitOn();
                return "Created a " + factory.getClass().getSimpleName() + " chair. Material: " + chair.getMaterial();
            case "Table":
                Table table = factory.createTable();
                table.putOn();
                return "Created a " + factory.getClass().getSimpleName() + " table.";
            case "Sofa":
                Sofa sofa = factory.createSofa();
                sofa.lieOn();
                return "Created a " + factory.getClass().getSimpleName() + " sofa.";
            case "Bookshelf":
                Bookshelf bookshelf = factory.createBookshelf();
                bookshelf.storeBooks();
                return "Created a " + factory.getClass().getSimpleName() + " bookshelf.";
            default:
                return "Unknown furniture type.";
        }
    }
}