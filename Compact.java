/***
 * Child class for compact cars that extends the vehicle parent class
 */
public class Compact extends Vehicle{

    /***
     * Public method that initializes the description to "Compact"
     */
    public Compact(){
        this.description = "Compact";
    }
    
    /***
     * Method that returns the cost of a compact car
     * @return double 
     */
    @Override
    public double getCost() {
        return 15000;
    }
    
}
