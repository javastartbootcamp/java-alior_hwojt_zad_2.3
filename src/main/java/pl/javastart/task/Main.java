package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito bezalkoholowe";
        mojito.price = 38.90;
        mojito.alcoholic = false;
        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "Woda gazowana";
        ingredient1.quantity = 200;
        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "Syropu Mojito Mint Monin";
        ingredient2.quantity = 20;
        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "Sok z limonki";
        ingredient3.quantity = 20;

        System.out.println("Drink: " + mojito.name);
        System.out.println("Cena: " + mojito.price + " zł");
        System.out.println("Czy zawiera alkohol? " + mojito.alcoholic);
        System.out.println("Składniki: \n" + ingredient1.name + "\n" + ingredient2.name + "\n" + ingredient3.name);
        System.out.println("Pojemność: " + (ingredient1.quantity + ingredient2.quantity + ingredient3.quantity));

    }
}
