package be.ifosup;

public class Vehicule {

private String usage;           //transport de personnes/de marchandise ou mixte

    public Vehicule(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
