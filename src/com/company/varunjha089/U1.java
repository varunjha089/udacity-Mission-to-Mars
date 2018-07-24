package com.company.varunjha089;

public class U1 extends Rocket {
    // Constructor
    U1() {
        costOfRocket = 100;                    // Rocket cost = $100 Million
        weightOfRocket = 10000;                // Rocket weight = 10000 kilograms
        rocketMaximumWeight = 18000;             // Rocket Max weight (with cargo) = 18000 kilograms
        rateOfExplosion = 0.49;                // 5% rate of launch explosion
        crashRate = 0.53;                    // 1% rate of landing crash
        cargoLimit = rocketMaximumWeight - weightOfRocket;
        currentWeight = weightOfRocket;
    }

    // override the launch method to calculate the corresponding chance of exploding
    public boolean launch() {
        this.chanceOfLaunchExplosion = rateOfExplosion *  ( (double)cargoCarried / (double)cargoLimit);
        return !(this.chanceOfLaunchExplosion >= this.randomNumber);
    }

    // override the land method to calculate the corresponding chance of crash
    public boolean land() {
        this.chanceOfLandingCrash = crashRate * ((double)cargoCarried / (double)cargoLimit);
        return !(this.chanceOfLandingCrash >= this.randomNumber);
    }
}
