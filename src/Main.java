public class Main {
    public static void main(String[] args) {
       //task1();
        task7();
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

        dog = dog + 4;
        cat = cat + 4 ;
        paper = paper + 4;
        System.out.println("change paranmetrs + 4");
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);

        dog = dog + 4;
        cat = cat + 4 ;
        paper = paper + 4;
        System.out.println("change paranmetrs + 4");
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6 ;
        paper = paper - 7639;
        System.out.println("change paranmetrs: - ");
        System.out.println("dog -> " + dog);
        System.out.println("cat -> " + cat);
        System.out.println("paper -> " + paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend_1 -> " + friend);
        friend = friend + 2 ;
        System.out.println("friend_2 -> " + friend);
        friend = friend / 7 ;
        System.out.println("friend_3 -> " + friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog_1 -> " + frog);
        frog = frog * 10 ;
        System.out.println("frog_2 -> " + frog);
        frog = frog / 3.5 ;
        System.out.println("frog_3 -> " + frog);
        frog = frog + 4 ;
        System.out.println("frog_4 -> " + frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightFirstFiter = 78.2;
        var weightSecondFiter = 82.7;
        var sumTwoFiters = weightFirstFiter + weightSecondFiter;
        var differenceFiters = weightSecondFiter - weightFirstFiter;
        System.out.println("Общий вес 2 бойцов -> " + sumTwoFiters);
        System.out.println("Разница в весе бойцов -> " + differenceFiters);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightFirstFiter = 78.2;
        var weightSecondFiter = 82.7;
        var lowToBig = weightSecondFiter - weightFirstFiter;
        var modFiters = weightSecondFiter % weightFirstFiter;
        System.out.println("Вычитание из большего веса меньшего -> " + lowToBig);
        System.out.println("С помощь функции остаток от деления -> " + modFiters);
    }

}