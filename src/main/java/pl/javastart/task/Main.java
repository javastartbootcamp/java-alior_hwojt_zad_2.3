package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ingredient water = new Ingredient();
        water.name = "Woda gazowana";
        water.quantity = 200;
        Ingredient syrup = new Ingredient();
        syrup.name = "Syrop Mojito Mint Monin";
        syrup.quantity = 20;
        Ingredient limeJuice = new Ingredient();
        limeJuice.name = "Sok z limonki";
        limeJuice.quantity = 20;

        Drink mojito = new Drink();
        mojito.name = "Mojito bezalkoholowe";
        mojito.price = 38.90;
        mojito.alcoholic = false;
        mojito.ingredient1 = water;
        mojito.ingredient2 = syrup;
        mojito.ingredient3 = limeJuice;

        System.out.println("Drink: " + mojito.name);
        System.out.println("Cena: " + mojito.price + " zł");
        System.out.println("Czy zawiera alkohol? " + mojito.alcoholic);
        System.out.println("Składniki: \n" + mojito.ingredient1.name + "\n" + mojito.ingredient2.name + "\n" + mojito.ingredient3.name);
        System.out.println("Pojemność: " + (mojito.ingredient1.quantity + mojito.ingredient2.quantity + mojito.ingredient3.quantity));

    }
}
