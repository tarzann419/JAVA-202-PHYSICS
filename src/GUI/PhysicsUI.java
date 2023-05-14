package GUI;
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
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel mainPanel1 = new JPanel(new GridLayout(3, 1));
        mainPanel1.setBackground(Color.darkGray);


        JButton potentialEnergyButton = new JButton("1.Potential Energy");
        potentialEnergyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPotentialEnergyDialog();
            }
        });
        mainPanel1.add(potentialEnergyButton);


        add(mainPanel1);

        JButton kineticEnergyButton = new JButton("2.Kinetic Energy");
        kineticEnergyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showKineticEnergyDialog();
            }
        });
        mainPanel1.add(kineticEnergyButton);

        JButton momentumButton = new JButton("3.Momentum");
        momentumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMomentumDialog();
            }
        });
        mainPanel1.add(momentumButton);

    }



    private void showPotentialEnergyDialog() {
        JDialog dialog = new JDialog(this, "Potential Energy", true);
        dialog.setLayout(new GridLayout(3, 2));
        dialog.setSize(300, 150);
        dialog.getContentPane().setBackground(Color.darkGray);
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


    public void showKineticEnergyDialog(){
        JDialog dialog = new JDialog(this,"Kinetic Energy",true);
        dialog.setLayout(new GridLayout(3,2));
        dialog.setSize(300,150);
        dialog.getContentPane().setBackground(Color.darkGray);
        dialog.setLocationRelativeTo(this);


        dialog.add(new JLabel("Mass"));
        massField = new JTextField();
        dialog.add(massField);


        dialog.add(new JLabel("Velocity"));
        heightField = new JTextField();
        dialog.add(heightField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateKineticEnergy();

            }
        });

        dialog.add(calculateButton);
         resultLabel = new JLabel("");
         dialog.add(resultLabel);

         dialog.setVisible(true);


    }

    private void calculateKineticEnergy(){
        double mass = Double.parseDouble(massField.getText());
        double velocity = Double.parseDouble(heightField.getText());

        KineticEnergy  ke = new KineticEnergy(mass,velocity);
        double kineticEnergy  = ke.calcKe();

        resultLabel.setText("THE ANSWER IS :" + kineticEnergy + "J");
    }

    private void showMomentumDialog(){
        JDialog dialog = new JDialog(this,"Momentum",true);
        dialog.setLayout(new GridLayout(3,2));
        dialog.setSize(300,150);
        dialog.getContentPane().setBackground(Color.darkGray);
        dialog.setLocationRelativeTo(this);


        dialog.add(new JLabel("Mass"));
        massField =new JTextField();
        dialog.add(massField);


        dialog.add(new JLabel("Velocity"));
        heightField = new JTextField();
        dialog.add(heightField);
    }



}