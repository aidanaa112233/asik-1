package com.example.builder;

public class MarsMission {
    private final String rocket;
    private final String rover;
    private final int crewSize;
    private final String energySource;
    private final String researchFocus;
    private final boolean radiationShield;

    public MarsMission(MarsMissionBuilder builder) {
        if (builder.getCrewSize() <= 0) {
            throw new IllegalArgumentException("Crew size must be greater than zero!");
        }

        this.rocket = builder.getRocket();
        this.rover = builder.getRover();
        this.crewSize = builder.getCrewSize();
        this.energySource = builder.getEnergySource();
        this.researchFocus = builder.getResearchFocus();
        this.radiationShield = builder.isRadiationShield();
    }

    public void displayMissionDetails() {
        System.out.println("--- KazakhSpace Mars Mission Details ---");
        System.out.println("Launch Vehicle: " + rocket);
        System.out.println("Developed Rover: " + rover);
        System.out.println("Crew Size: " + crewSize);
        System.out.println("Energy Source: " + energySource);
        System.out.println("Research Focus: " + researchFocus);
        System.out.println("Radiation Shield: " + (radiationShield ? "Enabled" : "Disabled"));
        System.out.println("----------------------------------------");
    }
}