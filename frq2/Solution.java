public class Bottle{
    private double capacity;
    private double filled;
  
    public Bottle(double cap){
        capacity = cap;
        filled = cap;
    }

    public double updateAmount(double removed){
        if((filled-removed) < (capacity/4)){
            filled = capacity;
            return capacity;
        }
        filled -= removed;
        return filled;
    }
}
