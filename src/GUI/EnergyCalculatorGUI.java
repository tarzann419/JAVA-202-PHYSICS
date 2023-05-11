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
    private final JButton calculateButton;
    private final JLabel resultLabel;

    public EnergyCalculatorGUI() {
        setTitle("Welcome");
        setPreferredSize(new Dimension(400,500));
        JLabel label = new JLabel("what do you want to calculate");
        kineticEnergyRadioButton = new JRadioButton("Kinetic Energy");
        PotentialEnergyRadioButton = new JRadioButton("Potential Energy");
        UpthrustRadioButton = new JRadioButton("Upthrust");
        MomentRadioButton = new JRadioButton("Moment");
        MomentumRadioButton = new JRadioButton("momentum");

        calculateButton = new JButton("calculate");
        resultLabel = new JLabel();
        resultLabel.setForeground(Color.blue);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(kineticEnergyRadioButton);
        buttonGroup.add(PotentialEnergyRadioButton);
        buttonGroup.add(UpthrustRadioButton);
        buttonGroup.add(MomentRadioButton);
        buttonGroup.add(MomentumRadioButton);


        JPanel panel1 = new JPanel(new GridLayout(10, 4));
        panel1.add(label);
        panel1.add(kineticEnergyRadioButton);
        panel1.add(PotentialEnergyRadioButton);
        panel1.add(UpthrustRadioButton);
        panel1.add(MomentRadioButton);
        panel1.add(MomentumRadioButton);
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

    }
    public void actionPerformed(ActionEvent e){
        if (kineticEnergyRadioButton.isSelected()){
            double mass = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of mass:"));

            double velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of veloctiy"));

            KineticEnergy ke  =new KineticEnergy (mass, velocity);
            resultLabel.setText(String.format("The value of kinetic energy is %f", ke.calcKe()));

            Color backgroundColor =  new Color(11,61,100);

        }
    }
}







