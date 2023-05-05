public class Moment extends Physics{
    double magnitude;

    double distance;

    public Moment(double magnitude, double distance){
        super(magnitude, distance);
        this.magnitude = magnitude;
        this.distance = distance;

    }

    public static double calcMoment(double magnitude, double distance)
    {
        return magnitude * distance;
    }
}
