import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Войн",250,50,"Blade Storm",
                new Weapon("Грань тьмы","двуручный топор"));
        Magical magical = new Magical("Волшебница",200,60,"Форма Архонта",
                new Weapon("Ужас бездны","посох"));
        Medic medic = new Medic("Discipline priest",300,0,"Великое исцеление",
                new Weapon("Staff of wizard","staff"));
        System.out.println();
        for (Hero hero : new Hero[]{magical,warrior,medic}) {
            System.out.println(hero.printInfo());
        }


    }
}