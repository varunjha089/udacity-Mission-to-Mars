package com.company.varunjha089;

import java.util.Random;

public class Rocket implements SpaceShip{

    int costOfRocket;                  // Rocket cost = $120 Million
    int weightOfRocket;                // Rocket weight = 18000 kilograms
    int rocketMaximumWeight;             // Rocket Max weight (with cargo) in kilograms
    int cargoCarried;                // Rocket cargo Carried in kilograms
    int currentWeight;               // Rocket current Weight (with cargo) in kilograms
    int cargoLimit;                  // Rocket cargo Limit in kilograms

    double rateOfExplosion;            // rate of launch explosion
    double crashRate;                // rate of landing crash
    double chanceOfLaunchExplosion;    // Chance of launch explosion
    double chanceOfLandingCrash;       // Chance of landing crash
    double randomNumber;                   // random number between 0 and 0.9999999999....

    String rocketStatus;             // not loaded, loaded, exploded, launched, crashed, landed

    // Constructor
    Rocket() {
        currentWeight = 0;
        cargoCarried = 0;
        chanceOfLaunchExplosion = 0.0;         // Chance of launch explosion = 5% * (cargo carried / cargo limit)
        chanceOfLandingCrash = 0.0;            // Chance of landing crash = 1% * (cargo carried / cargo limit)
        cargoLimit = 0;                      // in kilograms
        rocketStatus = "not loaded";
        randomNumber = new Random().nextDouble();     // generates a new random number between 0 and 0.9999999999....
    }
    // launch and land methods in the Rocket class should always return true, will be override in U1 and U2 classes.
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    // a method that takes an Item as an argument and returns true if the rocket can carry such item
    // or false if it will exceed the weight limit.
    public boolean canCarry(Item cargo) {
        return (this.currentWeight + cargo.weight) <= rocketMaximumWeight;
    }
    // a method that also takes an Item object and updates the current weight of the rocket.
    public void carry(Item cargo) {
        this.currentWeight = this.currentWeight + cargo.weight;
        this.cargoCarried =  this.currentWeight - this.weightOfRocket;         // and update rocket cargo carried

    }
}
