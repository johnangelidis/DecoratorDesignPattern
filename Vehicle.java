/***
 * Abstract class for vehicles
 */
public abstract class Vehicle{
    protected String description;

    /***
     * Method that returns a description of the vehicle
     * @return String description
     */
    public String toString(){
        return description;
    }

    /***
     * Abstract class to be implemented in children classes
     */
    public abstract double getCost();
}