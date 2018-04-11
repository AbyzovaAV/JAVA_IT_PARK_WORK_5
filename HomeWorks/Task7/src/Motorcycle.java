public class Motorcycle extends Transport {
    private double carbideOilConsumption;
    private double carbideOilAmount;

    public Motorcycle(String model, int yearIssue, double fuelConsumption) {
        super(model, yearIssue, fuelConsumption);
        this.carbideOilConsumption = carbideOilConsumption;
    }

    public double getCarbideOilConsumption() {
        return carbideOilConsumption;
    }

    public double getCarbideOilAmount() {
        return carbideOilAmount;
    }

    public void addCarbideOil(double carbideOilAmount) {
        this.carbideOilAmount += carbideOilAmount;
    }

    @Override
    public void go(int km) {
        super.go(km);
        this.carbideOilAmount = this.carbideOilAmount - km * (this.carbideOilConsumption/100);
    }
}
