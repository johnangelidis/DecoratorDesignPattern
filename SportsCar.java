public class SportsCar extends Vehicle {

    public SportsCar(){
        this.description = "Sports Car";
    }
    
    @Override
    public double getCost() {
        return 30000;
    }
    
}
