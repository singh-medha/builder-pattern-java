
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    NutritionFacts cocaCola = new NutritionFacts.Builder(250, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();

    IO.println(String.format("Calories in coca cola is %1$d.", cocaCola.getCalories()));

    DominosPizza pizza = new DominosPizza.Builder(DominosPizza.Size.REGULAR)
            .addTopping(Pizza.Topping.SAUSAGE)
            .addTopping(Pizza.Topping.ONION)
            .build();

    IO.println("Dominos pizza ordered!");

    PizzaHutPizza pizzaHutPizza = new PizzaHutPizza.Builder()
            .addTopping(Pizza.Topping.HAM)
            .sauceInside()
            .build();

    IO.println("Pizza hut pizza ordered!");
}
