public class Coffee {
    private String coffeetype;
    private boolean doublecoffee;
    private String milk;
    private boolean cream;
    private int sugar;
    private boolean cinammon;
    private boolean syrup;

    public Coffee(String coffeetype, boolean doublecoffee, String milk, boolean cream, int sugar, boolean cinammon, boolean syrup){
        this.cinammon = cinammon;
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
        this.syrup = syrup;
        this.coffeetype = coffeetype;
        this.doublecoffee = doublecoffee;
    }
    public String print() {
        String info = "";
        info += "Type of coffee - " + coffeetype + "\n";
        info += "Double coffee -  " + doublecoffee + "\n";
        info += "Milk - " + milk + "\n";
        info += "Cream - " + cream + "\n";
        info += "Sugar - " + sugar + "\n";
        info += "Cinammon - " + cinammon + "\n";
        info += "Syrup - " + syrup + "\n";
        return info;
    }
    public String getCoffeetype(String coffeetype) {
        return coffeetype;
    }

    public boolean getDoublecoffee(boolean doublecoffee) {
        return doublecoffee;
    }

    public String getMilk(String milk) {
        return milk;
    }

    public boolean getCream(boolean cream) {
        return cream;
    }

    public int getSugar(int sugar) {
        return sugar;
    }

    public boolean getCinammon (boolean cinammon) {
        return cinammon;
    }

    public boolean getSyrup(boolean syrup) {
        return syrup;
    }

}
