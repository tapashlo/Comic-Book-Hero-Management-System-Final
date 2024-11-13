public enum Affiliation{
    AVENGERS("Earth's Mightiest Heroes"),
    JUSTICE_LEAGUE("Protector's pf Earth"),
    X_MEN("Mutant Heroes"),
    FANTASTIC_FOUR("The First Family")

    private String description;

    Affiliation(String description){
        this.description = description;

    }

    public String getDescription(){
        return description;
    }
}