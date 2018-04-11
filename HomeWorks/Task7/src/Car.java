public class Car extends Transport {
    private double gasConsumption;
    private double gasNitrousAmount ;

    public Car(String model, int yearIssue, double fuelConsumption) {
        super(model, yearIssue, fuelConsumption);
        this.gasConsumption = gasConsumption;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public double getGasNitrousAmount() {
        return gasNitrousAmount;
    }

    public void addGas(double gasNitrousAmount){
        this.gasNitrousAmount += gasNitrousAmount;
    }

    @Override
    public void go(int km) {
        super.go(km);
        this.gasNitrousAmount = this.gasNitrousAmount - km *(this.gasConsumption/100);
    }
}
