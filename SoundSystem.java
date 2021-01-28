/**
 * Child class for a sound systems that extends the parent class VehicleDecorator
 */
public class SoundSystem extends VehicleDecorator{
    private Vehicle vehicle;

	/**
	 * Creates a sound system for a given vehicle
	 * @param vehicle
	 */
    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    /**
     * Method that returns the name of a vehicle and describes the sound system
     * @return String
     */
	@Override
	public String toString() {
		return vehicle.toString() + ", awesome sound";
	}
    /**
     * Method that returns the cost of a vehicle with the additional cost of a sound system
     * @return double
     */
	@Override
	public double getCost() {
        return vehicle.getCost() + 350;
	}

}
    

