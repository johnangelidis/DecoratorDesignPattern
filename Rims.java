public class Rims extends VehicleDecorator{
    private Vehicle vehicle;

    public Rims(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

	@Override
	public double getCost() {
		return vehicle.getCost() + 200; 
	}
}
