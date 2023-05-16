package GUI;

public class MomentumGUI {
    double mass;
    double velocity;

    public MomentumGUI(double mass, double velocity){
        this.mass = mass;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }
public void setMass(double mass){
        this.mass = mass;
}
    public double getVelocity() {
        return velocity;
    }
    public void setVelocity(double velocity){
        this.velocity = velocity;
    }

    public double calcMomentum (){
        return mass * velocity;
    }
}
