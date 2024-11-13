import java.util.ArrayList;
import java.util.Arrays;


public class HeroManager{
    ArrayList heroes;


    public HeroManager(){
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero){
        heroes.add(hero);
    }

    public void removeHero(String name){
        heroes.removeIf(hero -> hero.getName().equals(name));

    }

    //bubble sort

    //insertionSort
    


}