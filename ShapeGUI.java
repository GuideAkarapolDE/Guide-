import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeGUI {

    private JFrame frame;
    private JTextArea outputArea;

    public ShapeGUI() {
        frame = new JFrame("Shape Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));

        JButton btnTriangle = new JButton("Triangle");
        JButton btnRhombus = new JButton("Rhombus");

        buttonPanel.add(btnTriangle);
        buttonPanel.add(btnRhombus);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Action Listeners for buttons
        btnTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shape triangle = new Triangle(51, 82, 69, 41, 30);
                outputArea.setText("Triangle\n");
                outputArea.append("-------------------------\n");
                outputArea.append("Area: " + triangle.getArea() + " m\n");
                outputArea.append("Perimeter: " + triangle.getParemiter() + " m\n");
            }
        });

        btnRhombus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shape rhombus = new Rhombus(74, 96, 86);
                outputArea.setText("Rhombus\n");
                outputArea.append("-------------------------\n");
                outputArea.append("Area: " + rhombus.getArea() + " m\n");
                outputArea.append("Perimeter: " + rhombus.getParemiter() + " m\n");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeGUI();
    }
}
