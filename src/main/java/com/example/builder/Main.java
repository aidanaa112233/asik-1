package com.example.builder;

public class Main {
    public static void main(String[] args) {
        MissionDirector director = new MissionDirector();

        System.out.println("Initializing standard mission configured via 'Ghalam LLP' Director:");
        MarsMission standardMission = director.buildGhalamScientificMission();
        standardMission.displayMissionDetails();

        System.out.println("\nInitializing custom national mission via Fluent API:");
        MarsMission customMission = new MarsMissionBuilder()
                .setRocket("KazSat-Heavy Launcher")
                .setRover("Ulytau Rover")
                .setCrewSize(5)
                .setEnergySource("Hybrid Nuclear-Solar")
                .setResearchFocus("Astrobiology & Atmospheric Study")
                .setRadiationShield(true)
                .build();

        customMission.displayMissionDetails();
    }
}