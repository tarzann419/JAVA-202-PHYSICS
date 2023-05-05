public class Moment extends Physics{

    public Moment(double magnitude, double distance){
        super(magnitude, distance);
    }

    public double calcMoment(double magnitude, double distance)
    {
        return magnitude * distance;
    }
}
