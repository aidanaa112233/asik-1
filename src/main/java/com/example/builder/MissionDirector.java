package com.example.builder;

public class MissionDirector {

    public MarsMission buildGhalamScientificMission() {
        return new MarsMissionBuilder()
                .setRocket("Baiterek-M Launch Vehicle")
                .setRover("Astana-Explorer (Built by Ghalam LLP)")
                .setCrewSize(3)
                .setEnergySource("Kazakhstan-Adapted Solar Array")
                .setResearchFocus("Soil & Climate Analysis")
                .setRadiationShield(true)
                .build();
    }
}