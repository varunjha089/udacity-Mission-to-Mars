package com.company.varunjha089;

public class U2 extends Rocket {
    // Constructor
    U2() {
        costOfRocket = 120;                    // Rocket cost = $120 Million
        weightOfRocket = 18000;                // Rocket weight = 18000 kilograms
        rocketMaximumWeight = 29000;             // Rocket Max weight (with cargo) = 29000 kilograms
        rateOfExplosion = 0.45;                // 4% rate of launch explosion
        crashRate = 0.55;                    // 8% rate of landing crash
        cargoLimit = rocketMaximumWeight - weightOfRocket;
        currentWeight = weightOfRocket;
        //random = new Random().nextDouble();     // generates a new random number between 0 and 0.9999999999....
    }
    // override the launch method to calculate the corresponding chance of exploding
    public boolean launch() {
        this.chanceOfLaunchExplosion = rateOfExplosion * ((double)cargoCarried / (double)cargoLimit);
        return !(this.chanceOfLaunchExplosion >= this.randomNumber);
    }
    // override the land method to calculate the corresponding chance of crash
    public boolean land() {
        this.chanceOfLandingCrash = crashRate * ((double)cargoCarried / (double)cargoLimit);
        return !(this.chanceOfLandingCrash >= this.randomNumber);
    }
}
