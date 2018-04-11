public class Tank extends Transport{
    private double  airOilConsumption;
    private double  airOilAmount;

    public Tank(String model, int yearIssue, double fuelConsumption) {
        super(model, yearIssue, fuelConsumption);
        this.airOilConsumption = airOilConsumption;
    }


    public double getAirOilConsumption() {
        return airOilConsumption;
    }


    public double getAirOilAmount() {
        return airOilAmount;
    }

    public void addAirOil(double airOilAmount){
        this.airOilAmount += airOilAmount;
    }

    @Override
    public void go(int km) {
        super.go(km);
        this.airOilAmount = airOilAmount - km * (airOilConsumption/100);
    }
}
