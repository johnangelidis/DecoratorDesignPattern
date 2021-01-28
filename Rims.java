/**
 * A child class for rims that extends the VehicleDecorator class
 */
public class Rims extends VehicleDecorator{
    private Vehicle vehicle;

    /**
     * Method that creates rims for a given vehicle
     * @param vehicle
     */
    public Rims(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Method that returns the name of a vehicle and describes the rims
     * @return String
     */
    @Override
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Method that returns the cost of a vehicle with the additional cost of rims
     * @return double
     */
	@Override
	public double getCost() {
		return vehicle.getCost() + 200; 
	}
}
