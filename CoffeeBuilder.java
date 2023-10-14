public interface CoffeeBuilder {
    CoffeeBuilderImpl setCoffeetype(String coffeetype);
    CoffeeBuilderImpl setDoublecoffe(boolean doublecoffe);
    CoffeeBuilderImpl setMilk(String milk);
    CoffeeBuilderImpl setCream(boolean cream);
    CoffeeBuilderImpl setSugar(int sugar);
    CoffeeBuilderImpl setCinammon(boolean cinammon);
    CoffeeBuilderImpl setSyrup(boolean syrup);
    Coffee build();


}
