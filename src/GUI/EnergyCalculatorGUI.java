//package GUI;
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import GUI.KineticEnergy;
//
//public class EnergyCalculatorGUI extends JFrame {
//
//    private final JRadioButton kineticEnergyRadioButton;
//
//    private final JRadioButton PotentialEnergyRadioButton;
//    private final JRadioButton UpthrustRadioButton;
//    private final JRadioButton MomentRadioButton;
//    private final JRadioButton MomentumRadioButton;
//
//    private final JButton calculateButton;
//    private final JLabel resultLabel;
//
//    private KineticEnergy kineticEnergy;
//
//    private JTextField massField1;
//    private JTextField heightField1;
//    private JButton calculateButtonDialog;
//
//
//    public EnergyCalculatorGUI() {
////
//        setTitle("Physics Calculator ");
//        setPreferredSize(new Dimension(400, 250));
////
//        JLabel label = new JLabel("what do you want to calculate");
//        kineticEnergyRadioButton = new JRadioButton("Kinetic Energy");
//        PotentialEnergyRadioButton = new JRadioButton("Potential Energy");
//        UpthrustRadioButton = new JRadioButton("Upthrust");
//        MomentRadioButton = new JRadioButton("Moment");
//        MomentumRadioButton = new JRadioButton("momentum");
////     JRadioButton momentumRadioButton = new JRadioButton("Momentum");
//        calculateButton = new JButton("calculate");
//        resultLabel = new JLabel();
////        resultLabel.setForeground(Color.blue);
//
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(kineticEnergyRadioButton);
//        buttonGroup.add(PotentialEnergyRadioButton);
//        buttonGroup.add(UpthrustRadioButton);
//        buttonGroup.add(MomentRadioButton);
//        buttonGroup.add(MomentumRadioButton);
//
//
//        JPanel panel1 = new JPanel(new GridLayout(10, 4));
//        panel1.add(label);
//        panel1.add(kineticEnergyRadioButton);
//        panel1.add(PotentialEnergyRadioButton);
//        panel1.add(UpthrustRadioButton);
//        panel1.add(MomentRadioButton);
//        panel1.add(MomentumRadioButton);
//        panel1.add(calculateButton);
//
//        Color backgroundColor = new Color(11, 61, 110);
//        panel1.setBackground(backgroundColor);
//        calculateButton.setBackground(backgroundColor);
////        resultLabel.setForeground(Color.black);
//
//        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        panel3.add(new JLabel("Result"));
//        panel3.add(resultLabel);
//
//
//        getContentPane().setLayout(new BorderLayout());
//        getContentPane().add(panel1, BorderLayout.NORTH);
//        getContentPane().add(panel3, BorderLayout.SOUTH);
//
//        JButton calculateButton = new JButton("Calculate");
//        calculateButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//              double mass = Double.parseDouble(massField1.getText());
//              double velocity = Double.parseDouble(heightField1.getText());
//              double KineticEnergyValue = kineticEnergy.calcKe(mass,velocity);
//              resultLabel.setText("KineticEnergy =" +kineticEnergyValue);
//
//            }
//        });
////        DISPOSE_ON_CLOSE.add(calculateButton);
////        calculateButton.addActionListener(this);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setVisible(true);
//        setResizable(true);
//
//    }
//
//
//    public void showKineticEnergyDialog() {
//        JDialog dialog = new JDialog(this, "KineticEnergy", true);
//        dialog.setLayout(new GridLayout(3, 1));
//        dialog.setSize(300, 150);
//        dialog.setLocationRelativeTo(this);
//
//
//        dialog.add(new JLabel("Mass:"));
//        JTextField massField1 = new JTextField();
//        dialog.add(massField1);
//
//        dialog.add(new JLabel("Height:"));
//        JTextField heightField1 = new JTextField();
//        dialog.add(heightField1);
//
//
//        calculateButtonDialog = new JButton("Calculate");
//        calculateButtonDialog.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                showKineticEnergyDialog();
//            }
//        });
//        dialog.add(calculateButtonDialog);
//
//        resultLabel = new JLabel("");
//        dialog.add(resultLabel);
//
//        dialog.setVisible(true);
//    }
//
//
//}
//
////    private void calculatePotentialEnergy() {
////        double mass = Double.parseDouble(massField.getText());
////        double height = Double.parseDouble(heightField.getText());
////
////        PotentialEnergy pe = new PotentialEnergy(mass, height);
////        double KineticEnergy = pe.calcPE(mass);
////
////        resultLabel.setText("Your answer is: " + KineticEnergy);
//
////    }












