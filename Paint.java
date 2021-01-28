/**
 * A class for paint decoration
 */
public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Public class that creates a paint decoration for a given vehicle
     * @param vehicle
     */
    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Method that returns the name of a vehicle and describes the paint
     * @return String
     */
    @Override
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Method that returns the cost of a vehicle with the additional cost of paint
     * @return double
     */
    @Override
    public double getCost(){
        return vehicle.getCost() + 150;
    }
    
}
