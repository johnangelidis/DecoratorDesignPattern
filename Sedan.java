/***
 * Child class for sedans that extends the vehicle parent class
 */
public class Sedan extends Vehicle {

    /***
     * Public method that initializes the description to "Sedan"
     */
    public Sedan(){
        this.description = "Sedan";
    }

    /***
     * Method that returns the cost of a sedan
     * @return double 
     */
    @Override
    public double getCost() {
        return 20000;
    }
    
}
