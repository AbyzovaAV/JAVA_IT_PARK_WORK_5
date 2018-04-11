package com.company;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car("GLE", 20);

        mercedes.go(40);

        mercedes.addFuel(100);
        mercedes.addGas(40);

        System.out.println(mercedes.getMileage());
        System.out.println(mercedes.getFuelAmount());
        System.out.println(mercedes.getGasNitrousAmount());

        Motorcycle kama = new Motorcycle("d124", 15);

        ((Motorcycle) kama).go(30);

        kama.addFuel(80);
        ((Motorcycle) kama).addCarbideOil(30);

        System.out.println(mercedes.getMileage());
        System.out.println(mercedes.getFuelAmount());
        System.out.println(mercedes.getCarbideOilAmount());

        Aircraft boing = new Aircraft("B-875", 600);

        ((Aircraft) boing).go(300);

        kama.addFuel(250);
        kama.addAirKerosene(247);

        System.out.println(mercedes.getMileage());
        System.out.println(mercedes.getFuelAmount());
        System.out.println(mercedes.getAirKeroseneAmount());

        Tank daut = new Tank("BI/875", 60);

        ((Tank) daut).go(50);

        daut.addFuel(50);
        daut.addAirOil(10);

        System.out.println(mercedes.getMileage());
        System.out.println(mercedes.getFuelAmount());
        System.out.println(mercedes.getAirOilAmount());


    }

}
