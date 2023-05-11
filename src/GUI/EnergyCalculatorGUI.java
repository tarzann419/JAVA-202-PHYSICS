package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EnergyCalculatorGUI extends JFrame implements ActionListener {
    private final JRadioButton kineticEnergyRadioButton;
    private final JRadioButton PotentialEnergyRadioButton;
    private final JRadioButton UpthrustRadioButton;
    private final JRadioButton MomentRadioButton;
    private final JRadioButton MomentumRadioButton;

    private final JRadioButton  ForceRadioButton;
    private final JButton calculateButton;
    private final JLabel resultLabel;

    public EnergyCalculatorGUI() {
        setTitle("Welcome");
        setPreferredSize(new Dimension(500,500));
        JLabel label = new JLabel("what do you want to calculate");
        kineticEnergyRadioButton = new JRadioButton("Kinetic Energy");
        PotentialEnergyRadioButton = new JRadioButton("Potential Energy");
        UpthrustRadioButton = new JRadioButton("Upthrust");
        MomentRadioButton = new JRadioButton("Moment");
        MomentumRadioButton = new JRadioButton("Momentum");
        ForceRadioButton = new JRadioButton("Force");

        calculateButton = new JButton("calculate");
        resultLabel = new JLabel();
        resultLabel.setForeground(Color.blue);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(kineticEnergyRadioButton);
        buttonGroup.add(PotentialEnergyRadioButton);
        buttonGroup.add(UpthrustRadioButton);
        buttonGroup.add(MomentRadioButton);
        buttonGroup.add(MomentumRadioButton);
        buttonGroup.add(ForceRadioButton);


        JPanel panel1 = new JPanel(new GridLayout(10, 4));
        panel1.add(label);
        panel1.add(kineticEnergyRadioButton);
        panel1.add(PotentialEnergyRadioButton);
        panel1.add(UpthrustRadioButton);
        panel1.add(MomentRadioButton);
        panel1.add(MomentumRadioButton);
        panel1.add(ForceRadioButton);
        panel1.add(calculateButton);

          Color backgroundColor = new Color(11, 61, 110);
          panel1.setBackground(backgroundColor);
          calculateButton.setBackground(backgroundColor);
          resultLabel.setForeground(Color.black);


        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(new JLabel("Result"));
        panel3.add(resultLabel);


        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel3, BorderLayout.SOUTH);

        calculateButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(true);

    }
    public void actionPerformed(ActionEvent e){
        if (kineticEnergyRadioButton.isSelected()){

            // Creates the panel for the mass input dialog
            JPanel massPanel1= new JPanel();
            Color backgroundColor = new Color(11,61,100);
            massPanel1.setBackground(backgroundColor);
            massPanel1.setForeground(backgroundColor);
            massPanel1.setPreferredSize(new Dimension(300,300));
            massPanel1.add(new JLabel("Mass"));
            JTextField massField = new JTextField(15);
            massPanel1.add(massField);

            // Create the panel for velocity input dialog
//            JPanel velocity1 = new JPanel();
//            Color backgroundColor1 = new Color(11,61,100);
//            velocity1.setBackground(backgroundColor1);
//            velocity1.setBackground(backgroundColor1);
//            velocity1.setPreferredSize(new Dimension(300,300));
//            velocity1.add(new JLabel("Velocity"));
//            JTextField velocityField = new JTextField(15);
//            velocityField.add(velocityField);

            // show the mass input dialog
            int massOption = JOptionPane.showOptionDialog(null,massPanel1,"Enter mass",
                               JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);

//            double mass = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of mass:"));
//
//            double velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of veloctiy"));
//
//            KineticEnergy ke  =new KineticEnergy (mass, velocity);
//            resultLabel.setText(String.format("The value of kinetic energy is %f", ke.calcKe()));
//"
//            Color backgroundColor =  new Color(11,61,100);

        }
    }
}







