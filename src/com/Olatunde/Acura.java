package com.Olatunde;

/**
 * Created by tundo on 6/13/2017.
 */
@SuppressWarnings("ALL")
class Acura {
    private String name;
    private String driveType;
    //private boolean electric = true;
    private double price;
    private String model;
    private boolean electric = true;

    private String option1Name;
    private double option1Price;
    private String option2Name;
    private double option2Price;
    private String option3Name;
    private double option3Price;
    private String option4Name;
    private double option4Price;

    //private boolean addElectric;


    public Acura(String name, String driveType, String carType, boolean electric,double price, String model) {
        this.name = name;
        this.driveType = driveType;
        String carType1 = carType;
        this.electric = electric;
        this.price = price;
        this.model = model;
    }

    public void addOption1(String name, double price){
        this.option1Name = name;
        this.option1Price = price;
    }

    public void addOption2(String name, double price){
        this.option2Name = name;
        this.option2Price = price;
    }
    public void addOption3(String name, double price){
        this.option3Name = name;
        this.option3Price = price;
    }
    public void addOption4(String name, double price){
        this.option4Name = name;
        this.option4Price = price;
    }
/*
    public void addElectric(boolean electric) {
        this.addElectric = electric;
    }
*/
    public double initializeOptions() {
        double CarPrice = this.price;
        boolean ElectricOption = this.electric;
        System.out.println("Car name is " + this.name +  ": model type is: " + this.model);
        if(this.option1Name != null) {
            CarPrice += this.option1Price;
            System.out.println("Added " + this.option1Name + " for an addtional price of $" + this.option1Price);
        }
        if(this.option2Name != null) {
            CarPrice += this.option2Price;
            System.out.println("Added " + this.option2Name + " for an addtional price of $" + this.option2Price);
        }
        if(this.option3Name != null) {
            CarPrice += this.option3Price;
            System.out.println("Added " + this.option3Name + " for an addtional price of $" + this.option3Price);
        }
        if(this.option4Name != null) {
            CarPrice += this.option4Price;
            System.out.println("Added " + this.option4Name + " for an addtional price of $" + this.option4Price);
        }
        if(ElectricOption) {
            CarPrice += 4000;
            System.out.println("Added electric car option for an addtional price of $" + 4000);
        }
        return CarPrice;
    }
}
