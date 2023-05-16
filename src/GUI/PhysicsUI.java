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

        JPanel mainPanel1 = new JPanel(new GridLayout(4, 1));
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


        JButton MomentButton = new JButton("3. Moment");
        MomentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {insertMomentValues();

            }
        });
        mainPanel1.add(MomentButton);

        JButton MomentumButton = new JButton("4. Momentum");
        MomentumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {insertMomentumValues();

            }
        });
        mainPanel1.add(MomentumButton);

    }



    public void showPotentialEnergyDialog() {
        JDialog dialog = new JDialog(this, "Potential Energy", true);
        dialog.setLayout(new GridLayout(3, 2));
        dialog.setSize(300, 150);
        dialog.getContentPane().setBackground(Color.lightGray);
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

        resultLabel.setText("Your answer is: " + potentialEnergy + "J");
    }


    public void showKineticEnergyDialog(){
        JDialog dialog = new JDialog(this,"Kinetic Energy",true);
        dialog.setLayout(new GridLayout(3,2));
        dialog.setSize(300,150);
        dialog.getContentPane().setBackground(Color.lightGray);
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


    public void insertMomentValues(){
        JDialog dialog =new JDialog(this,"Moment",true);
            dialog.setLayout(new GridLayout(3,3));
            dialog.setSize(300,150);
            dialog.setLocationRelativeTo(this);
            dialog.getContentPane().setBackground(Color.lightGray);

            dialog.add(new JLabel("Magnitude:"));
            massField = new JTextField();
            dialog.add(massField);

        dialog.add(new JLabel("Distance:"));
        heightField = new JTextField();
        dialog.add(heightField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMoment();
            }
        });

        dialog.add(calculateButton);
        resultLabel = new JLabel("");
        dialog.add(resultLabel);
        dialog.setVisible(true);
    }


    private void calculateMoment(){
        double magnitude = Double.parseDouble(massField.getText());
        double distance = Double.parseDouble(heightField.getText());

        MomentGUI moment = new MomentGUI(magnitude, distance);
        double momentValue = moment.calcMoment();

        resultLabel.setText("Your answer is: " + momentValue + "Nm");
    }
    public void insertMomentumValues(){
        JDialog dialog = new JDialog(this, "Momentum", true);
        dialog.setLayout(new GridLayout(4,4));
        dialog.setSize(300,150);
        dialog.setLocationRelativeTo(this);
        dialog.getContentPane().setBackground(Color.lightGray);

        dialog.add(new JLabel("Mass:"));
        massField = new JTextField();
        dialog.add(massField);

        dialog.add(new JLabel("Velocity:"));
        heightField = new JTextField();
        dialog.add(heightField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMomentum();
            }
        });


        dialog.add(calculateButton);
            resultLabel = new JLabel("");
            dialog.add(resultLabel);

            dialog.setVisible(true);
}
        private void calculateMomentum(){
            double mass = Double.parseDouble(massField.getText());
            double velocity = Double.parseDouble((heightField.getText()));

             MomentumGUI momentum = new MomentumGUI(mass, velocity);
             double momentumValue = momentum.calcMomentum();

        resultLabel.setText("Your answer is: " + momentumValue + "Kgm/s/s");
}
    }



