package com.qa;

public class Reptile extends Animal{

    public Reptile(String species, String gender, int age, String location, String habitat, double weight, boolean hasScales, boolean isColdBlooded){
        super(species, gender, age, location, habitat,weight);
        this.setColdBlooded(isColdBlooded);
        this.setHasScales(hasScales);
    }

    public Reptile(){
        this("Reptile", "unknown", 0, "unknown", "unknown", 0.0, false, false);
    }

    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public String toString() {
        String info = super.toString();
        info = info + "\n\tHas Scales?: " + this.hasScales + "\n\tCold-Blooded?: " + this.isColdBlooded;
        return info;


    }

    private boolean hasScales;

    public boolean getHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }


    private boolean isColdBlooded;

    public boolean getIsColdBlooded() {
        return isColdBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        isColdBlooded = coldBlooded;
    }

    @Override
    public String takeFlight(int minutes, int elevation) throws FlightException {
        // add validation for max mins or max height - create an exception for flying too high or going too far!
        int maxElevation = 100;
        int maxMinutes = 60;
        if(elevation > maxElevation){
            throw new FlightException("Flight elevation exceeds the maximum limit of " + maxElevation + " meters.");
        }
        else
            return "\tThe flight duration is: " + minutes + "minutes" + "\n\tThe flight elevation is: " + elevation + "m";
    }
}
// Check if the elevation exceeds the maximum allowed value
//        if (elevation > maxElevation) {
//        throw new FlightException("Flight elevation exceeds the maximum limit of " + maxElevation + " meters.");
//        }
//
//                // Check if the flight duration exceeds the maximum allowed time
//                if (minutes > maxDuration) {
//        throw new FlightException("Flight duration exceeds the maximum limit of " + maxDuration + " minutes.");
//        }
//
//                // Return flight details if no exceptions are thrown
//                return "\tThe flight duration is: " + minutes + " minutes" +
//        "\n\tThe flight elevation is: " + elevation + " meters";
//        }
//        }

