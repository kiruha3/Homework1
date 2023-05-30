public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);
        dog = dog + 2;
        cat = cat +2 ;
        paper = paper + 2;
        System.out.println("change paranmetrs ");
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);
    }

}