package org.designPatters.builder.exercicio01;

import java.util.Scanner;

public class BuilderExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BurgerOrderBuilder builder = new BurgerOrderBuilder();

        System.out.println("Escolha o tipo de pão (WHITE, WHOLEGRAIN, BRIOCHE): ");
        builder.withBread(BreadType.valueOf(scanner.nextLine().toUpperCase()));

        System.out.println("Escolha a proteína (BEEF, CHICKEN, VEGETARIAN): ");
        builder.withProtein(ProteinType.valueOf(scanner.nextLine().toUpperCase()));

        System.out.println("Deseja adicionar queijo? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) builder.addIngredient(Ingredient.CHEESE);

        System.out.println("Deseja adicionar alface? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) builder.addIngredient(Ingredient.LETTUCE);

        System.out.println("Deseja adicionar tomate? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) builder.addIngredient(Ingredient.TOMATO);

        System.out.println("Deseja adicionar cebola? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) builder.addIngredient(Ingredient.ONION);

        System.out.println("Deseja adicionar molho especial? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) builder.addIngredient(Ingredient.SPECIAL_SAUCE);

        System.out.println("Deseja adicionar uma bebida? (digite o nome ou pressione Enter para pular)");
        String drink = scanner.nextLine();
        if (!drink.isBlank()) builder.withDrink(drink);

        BurgerOrder pedido = builder.build();
        System.out.println("\n" + pedido);
    }
}
