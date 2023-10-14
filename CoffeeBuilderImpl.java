public class CoffeeBuilderImpl implements CoffeeBuilder{
    private String coffeetype;
    private boolean doublecoffee;
    private String milk;
    private boolean cream;
    private int sugar;
    private boolean cinammon;
    private boolean syrup;
    //Coffee coffee = new Coffee(coffeetype, doublecoffee, milk, cream, sugar, cinammon, syrup);
    @Override
    public CoffeeBuilderImpl setCoffeetype(String coffeetype) {
        this.coffeetype = coffeetype;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setDoublecoffe(boolean doublecoffe) {
        this.doublecoffee = doublecoffe;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setMilk(String milk) {
        this.milk = milk;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setCream(boolean cream) {
        this.cream = cream;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setSugar(int sugar) {
        this.sugar = sugar;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setCinammon(boolean cinammon) {
        this.cinammon = cinammon;
        return this;
    }
    @Override
    public CoffeeBuilderImpl setSyrup(boolean syrup) {
        this.syrup = syrup;
        return this;
    }

    public Coffee build() {
        return new Coffee(coffeetype, doublecoffee, milk, cream, sugar, cinammon, syrup);
    }
}
