/***
 * Child class for sports cars that extends the vehicle parent class
 */
public class SportsCar extends Vehicle {

    /***
     * Public method that initializes the description to "Sports Car"
     */
    public SportsCar(){
        this.description = "Sports Car";
    }
    
    /***
     * Method that returns the cost of a sports car
     * @return double 
     */
    @Override
    public double getCost() {
        return 30000;
    }
    
}
