package com.Olatunde;

/**
 * Created by tundo on 6/14/2017.
 */
public class TwoDoorCar extends Acura{
    private String additionalfeature1Name;
    private double additionalfeature1Price;

    private String additionalfeature2Name;
    private double additionalfeature2Price;

    public TwoDoorCar(String name, String driveType, String carType, boolean electric, double price, String model) {
        super(name, driveType, carType, electric, price, model);
    }

    public void extraFeature1(String name, double price) {
        this.additionalfeature1Name = name;
        this.additionalfeature1Price = price;
    }

    public void extraFeature2(String name, double price) {
        this.additionalfeature2Name = name;
        this.additionalfeature2Price = price;
    }

    public double initializeOptions() {
        double CarPrice = super.initializeOptions();
        if (this.additionalfeature1Name != null) {
            CarPrice += this.additionalfeature1Price;
            System.out.println("Added " + this.additionalfeature1Name + " for an addtional price of $" + this.additionalfeature1Price);
        }
        if (this.additionalfeature2Name != null) {
            CarPrice += this.additionalfeature2Price;
            System.out.println("Added " + this.additionalfeature2Name + " for an addtional price of $" + this.additionalfeature2Price);
        }
        return CarPrice;
    }


}
