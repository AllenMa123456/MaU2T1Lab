public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Snuggles", 3, 10.3);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Benson", 7, 15.3);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
