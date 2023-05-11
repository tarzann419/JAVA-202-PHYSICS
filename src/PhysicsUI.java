import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsUI extends JFrame {
    private JTextField massField;
    private JTextField heightField;
    private JLabel resultLabel;

    public PhysicsUI() {
        setTitle("Physics Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(3, 1));

        JButton potentialEnergyButton = new JButton("Potential Energy");
        potentialEnergyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPotentialEnergyDialog();
            }
        });
        mainPanel.add(potentialEnergyButton);

        JButton particularsButton = new JButton("Particulars");
        particularsButton.setEnabled(false);
        mainPanel.add(particularsButton);

        add(mainPanel);
    }

    private void showPotentialEnergyDialog() {
        JDialog dialog = new JDialog(this, "Potential Energy", true);
        dialog.setLayout(new GridLayout(3, 2));
        dialog.setSize(300, 150);
        dialog.setLocationRelativeTo(this);

        dialog.add(new JLabel("Mass:"));
        massField = new JTextField();
        dialog.add(massField);

        dialog.add(new JLabel("Height:"));
        heightField = new JTextField();
        dialog.add(heightField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePotentialEnergy();
            }
        });
        dialog.add(calculateButton);

        resultLabel = new JLabel("");
        dialog.add(resultLabel);

        dialog.setVisible(true);
    }

    private void calculatePotentialEnergy() {
        double mass = Double.parseDouble(massField.getText());
        double height = Double.parseDouble(heightField.getText());

        PotentialEnergy pe = new PotentialEnergy(mass, height);
        double potentialEnergy = pe.calcPE(mass);

        resultLabel.setText("Your answer is: " + potentialEnergy);
    }


}
