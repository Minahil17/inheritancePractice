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
        return "Hiss";
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
    public String takeFlight(int minutes, int elevation) {
        return "\tThe flight duration is: " + minutes + "minutes" + "\n\tThe flight elevation is: " + elevation + "m";
    }
}