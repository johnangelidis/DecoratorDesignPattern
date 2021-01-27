public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    @Override
    public double getCost(){
        return vehicle.getCost() + 150;
    }
    
}
