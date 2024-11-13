public class Hero{

    String name;
    int powerLevel;
    String affiliation;

    public Hero(){

    }

    public Hero(String name, int powerLevel, String affiliation){
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;

    }

    public String getName(){
        return name;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public String getAffiliations(){
        return affiliation;
    }

    public toString(){
        System.out.println("Name: "+ name);
        System.out.println("Power Level: "+ powerLevel);
        System.out.println("Affiliations: "+ affiliation);
        System.out.println();

    }
}