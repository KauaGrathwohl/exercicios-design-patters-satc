package org.designPatters.builder.exercicio01;

public class BurgerOrder {
    private BreadType bread;
    private ProteinType protein;
    private List<Ingredient> ingredients;
    private String drink;

    public BurgerOrder(BreadType bread, ProteinType protein, List<Ingredient> ingredients, String drink) {
        this.bread = bread;
        this.protein = protein;
        this.ingredients = ingredients;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "=== Pedido de Hambúrguer ===\n" +
                "Pão: " + bread + "\n" +
                "Proteína: " + protein + "\n" +
                "Ingredientes: " + (ingredients.isEmpty() ? "Nenhum" : ingredients) + "\n" +
                "Bebida: " + (drink == null ? "Nenhuma" : drink);
    }
}
