package com.Olatunde;

class Main {

    public static void main(String[] args) {
	// write your code here
        Acura TL =  new Acura("Acura","SH-AWD","gasoline",false,22000.0,"TL");
        TL.addOption1("Navigation",3000.0);
        TL.addOption2("Sunroof",300.0);
        TL.addOption4("Bose Speaker", 1000.0);
        TL.addOption3("Charging dock",3000.0);
        System.out.print("Total Price of the car is $" + TL.initializeOptions() + "\n\n");

        TwoDoorCar Tiburon1 = new TwoDoorCar("Tesla","AWD","EV",true,1060,"Model 3");
        Tiburon1.extraFeature2("Moonroof", 5000);
        Tiburon1.addOption3("Speaker", 4000);
        Tiburon1.addOption1("75KWh Battery Pack", 30000.0);
        Tiburon1.extraFeature1("Spoiler", 1000);
        System.out.println("Total Price of the Tiburon is $" + Tiburon1.initializeOptions());

    }
}
