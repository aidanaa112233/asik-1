package com.example.builder;

public class MarsMissionBuilder {
    private String rocket;
    private String rover = "Baiterek Standard Rover";
    private int crewSize = 1;
    private String energySource = "Solar Panel";
    private String researchFocus = "General";
    private boolean radiationShield = false;

    public MarsMissionBuilder setRocket(String rocket) {
        this.rocket = rocket;
        return this;
    }

    public MarsMissionBuilder setRover(String rover) {
        this.rover = rover;
        return this;
    }

    public MarsMissionBuilder setCrewSize(int crewSize) {
        this.crewSize = crewSize;
        return this;
    }

    public MarsMissionBuilder setEnergySource(String energySource) {
        this.energySource = energySource;
        return this;
    }

    public MarsMissionBuilder setResearchFocus(String researchFocus) {
        this.researchFocus = researchFocus;
        return this;
    }

    public MarsMissionBuilder setRadiationShield(boolean radiationShield) {
        this.radiationShield = radiationShield;
        return this;
    }

    public MarsMission build() {
        return new MarsMission(this);
    }

    public String getRocket() { return rocket; }
    public String getRover() { return rover; }
    public int getCrewSize() { return crewSize; }
    public String getEnergySource() { return energySource; }
    public String getResearchFocus() { return researchFocus; }
    public boolean isRadiationShield() { return radiationShield; }
}