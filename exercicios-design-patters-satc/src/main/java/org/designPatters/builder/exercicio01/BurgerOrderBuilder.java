package org.designPatters.builder.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class BurgerOrderBuilder {
    private BreadType bread;
    private ProteinType protein;
    private List<Ingredient> ingredients = new ArrayList<>();
    private String drink;

    public BurgerOrderBuilder withBread(BreadType bread) {
        this.bread = bread;
        return this;
    }

    public BurgerOrderBuilder withProtein(ProteinType protein) {
        this.protein = protein;
        return this;
    }

    public BurgerOrderBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public BurgerOrderBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public BurgerOrder build() {
        if (bread == null || protein == null) {
            throw new IllegalStateException("Pão e proteína são obrigatórios.");
        }
        return new BurgerOrder(bread, protein, ingredients, drink);
    }
}
