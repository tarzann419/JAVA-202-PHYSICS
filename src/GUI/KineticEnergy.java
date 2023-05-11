package GUI;

public class KineticEnergy {
    private double mass;
    private double velocity;
    public KineticEnergy(double mass , double velocity){
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
    public void  setVelocity(double velocity){
        this.velocity = velocity;
    }
    public double calcKe(){
        return  0.5 * mass*velocity*velocity;
    }
}

