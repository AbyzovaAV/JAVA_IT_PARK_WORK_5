public class Aircraft extends Transport {
    private double airKeroseneConsumption;
    private double airKeroseneAmount;

    public Aircraft(String model, int yearIssue, double fuelConsumption) {
        super(model, yearIssue, fuelConsumption);
        this.airKeroseneConsumption = airKeroseneConsumption;
    }

    public double getAirKeroseneConsumption(){
        return airKeroseneConsumption;
    }

    public double getAirKeroseneAmount(){
        return airKeroseneAmount;
    }

    public void addAirKerosene(double airKeroseneAmount){
        this.airKeroseneAmount += airKeroseneAmount;
    }

    @Override
    public void go(int km) {
        super.go(km);
        this.airKeroseneAmount = airKeroseneAmount - km * (airKeroseneConsumption/100);
    }
}

