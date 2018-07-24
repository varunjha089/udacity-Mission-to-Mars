package com.company.varunjha089;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        ArrayList<Item> itemsForPhaseOne = new ArrayList<>();          // create ArrayList object itemsForPhaseOne
        ArrayList <Item> itemsForPhaseTwo = new ArrayList<>();         // create ArrayList object itemsForPhaseTwo
        Simulation simulation = new Simulation();                      // Create a Simulation object
        ArrayList <U1> fleetU1PhaseOne;                                // declare ArrayList object fleetU1 for phase1
        ArrayList <U2> fleetU2PhaseOne;                                // declare ArrayList object fleetU2 for phase1
        ArrayList <U1> fleetU1PhaseTwo;                                // declare ArrayList object fleetU1 for phase2
        ArrayList <U2> fleetU2PhaseTwo;                                // declare ArrayList object fleetU2 for phase2

        // Load items from files
        itemsForPhaseOne = simulation.loadItems(itemsForPhaseOne , 1);           // Load Items for Phase-1
        itemsForPhaseTwo = simulation.loadItems(itemsForPhaseTwo , 2);           // Load Items for Phase-2

        // Load Fleet for phase 1
        fleetU1PhaseOne = simulation.loadU1(itemsForPhaseOne);               // Load a fleet of U1 rockets for Phase-1
        int U1Rockets = fleetU1PhaseOne.size();
        System.out.println("Phase 1 fleet U1 has " + U1Rockets + " rockets");
        fleetU2PhaseOne = simulation.loadU2(itemsForPhaseOne);               // Load a fleet of U2 rockets for Phase-1
        int U2Rockets = fleetU2PhaseOne.size();
        System.out.println("Phase 1 fleet U2 has " + U2Rockets + " rockets");

        // Load Fleet for phase 2
        fleetU1PhaseTwo = simulation.loadU1(itemsForPhaseTwo);               // Load a fleet of U1 rockets for Phase-1
        U1Rockets = fleetU1PhaseTwo.size();
        System.out.println("Phase 2 fleet U1 has " + U1Rockets + " rockets");
        fleetU2PhaseTwo = simulation.loadU2(itemsForPhaseTwo);               // Load a fleet of U2 rockets for Phase-1
        U2Rockets = fleetU2PhaseTwo.size();
        System.out.println("Phase 2 fleet U2 has " + U2Rockets + " rockets");

        // Phase 1 -- running the simulation using the U1 rockets and displaying the total required budget
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("                        Simulation Phase 1 with U1 rockets START ");
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        int totalBudgetPhaseOneU1 = simulation.runSimulation(fleetU1PhaseOne);
        System.out.println("Total cost of Phase 1 using the fleet of U1 rockets: budget = $" + totalBudgetPhaseOneU1 + " millions");

        // Phase 2 -- running the simulation using the U1 rockets and displaying the total required budget
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("                        Simulation Phase 2 with U1 rockets START\n");
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        int totalBudgetPhaseTwoU1 = simulation.runSimulation(fleetU1PhaseTwo);
        System.out.println("Simulation Phase 2 using the fleet of U1 rockets: budget = $" + totalBudgetPhaseTwoU1 + " millions");

        int totalBudgetOfRocketU1 = totalBudgetPhaseOneU1 + totalBudgetPhaseTwoU1;
        System.out.println("Simulation using the fleet of U1 rockets: total budget = $" + totalBudgetOfRocketU1 + " millions");

        // Phase 1 -- running the simulation using the U2 rockets and displaying the total required budget
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("                          Simulation Phase 1 with U2 rockets START");
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        int totalBudgetPhaseOneU2 = simulation.runSimulation(fleetU2PhaseOne);
        System.out.println("Simulation Phase 1 using the fleet of U1 rockets: budget = $" + totalBudgetPhaseOneU2 + " millions");

        // Phase 2 -- running the simulation using the U2 rockets and displaying the total required budget
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("                          Simulation Phase 2 with U2 rockets START");
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        int totalBudgetPhaseTwoU2 = simulation.runSimulation(fleetU2PhaseTwo);
        System.out.println("Simulation Phase 2 using the fleet of U2 rockets: budget = $" + totalBudgetPhaseTwoU2 + " millions");

        int totalBudgetOfRocketU2 = totalBudgetPhaseOneU2 + totalBudgetPhaseTwoU2;
        System.out.println("Simulation using the fleet of U2 rockets: total budget = $" + totalBudgetOfRocketU2 + " millions");
    }
}