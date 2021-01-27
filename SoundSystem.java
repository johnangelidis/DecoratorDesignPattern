public class SoundSystem extends VehicleDecorator{
    private Vehicle vehicle;

    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }

	@Override
	public String toString() {
		return vehicle.toString() + ", awesome sound";
	}

	@Override
	public double getCost() {
        return vehicle.getCost() + 350;
	}

}
    

