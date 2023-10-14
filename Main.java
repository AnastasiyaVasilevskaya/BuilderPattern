public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new CoffeeBuilderImpl().setCoffeetype("Latte").setSugar(5).build();
        CoffeeBuilderImpl bilder = new CoffeeBuilderImpl();
        Coffee coffee2 = bilder.build();

        System.out.println("Ваш кофе: \n" + coffee1.print());
        System.out.println("Молоко - " + coffee2.getMilk("Soevoe") + "," + "Сливки - " + coffee2.getCream(true));
    }
}