public class Transport {
    private String model;//модель
    private int yearIssue;//год выпуска
    protected int mileage;//пробег
    protected double fuelConsumption;//потребление топлива
    protected double fuelAmount;//кол-во топлива

    public Transport(String model, int yearIssue, double fuelConsumption){
        this.model = model;
        this.yearIssue = yearIssue;
        this.mileage = 0;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel(){
        return model;
    }

    public int getYearIssue(){
        return yearIssue;
    }

    public int getMileage(){
        return mileage;
    }

    public double getFuelConsumption(){
        return fuelConsumption;
    }

    public double getFuelAmount(){
        return fuelAmount;
    }
    public void go(int km){
        this.mileage = mileage + km;
        this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption/100);
    }
}

