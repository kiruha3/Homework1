public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int firstInt = 1;
        byte firstByte = 1;
        short firstShort = 1;
        long firstLong = 1;
        float firstFloat = 1.0f;
        double firstDouble = 1.0;
        System.out.println("Значение переменной firstInt с типом int равно "+ firstInt);
        System.out.println("Значение переменной firstByte с типом byte равно "+ firstByte);
        System.out.println("Значение переменной firstShort  с типом short равно "+ firstShort);
        System.out.println("Значение переменной firstLong с типом long равно "+ firstLong);
        System.out.println("Значение переменной firstFloat  с типом float равно "+ firstFloat);
        System.out.println("Значение переменной firstDouble с типом double равно "+ firstDouble);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int firstInt = 27897;
        byte firstByte = 67;
        short firstShort = 569;
        short secondShort = -159;
        long firstLong = 987678965549L;
        float firstFloat = 2.786f;
        float secondFloat = 27.12f;
        System.out.println("Значение переменной firstInt с типом int равно "+ firstInt);
        System.out.println("Значение переменной firstByte с типом byte равно "+ firstByte);
        System.out.println("Значение переменной firstShort  с типом short равно "+ firstShort);
        System.out.println("Значение переменной secondShort  с типом short равно "+ secondShort);
        System.out.println("Значение переменной firstLong с типом long равно "+ firstLong);
        System.out.println("Значение переменной firstFloat  с типом float равно "+ firstFloat);
        System.out.println("Значение переменной secondFloat с типом double равно "+ secondFloat);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ekaterinaAndreevna = 30;
        byte annaSergeyevna = 27;
        byte ludmilaPavlova = 23;
        int packPaper = 480;
        float result = (float) packPaper / (ekaterinaAndreevna + annaSergeyevna + ludmilaPavlova);
        System.out.println("На каждого ученика рассчитано "+ result +" листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int efficiencyPerTwoMin = 16;
        int efficiencyPerOneMin = efficiencyPerTwoMin / 2;
        int efficiencyPerTwentyMin = efficiencyPerOneMin * 20;
        int efficiencyPerDay = efficiencyPerOneMin * ( 60 * 24 );
        int efficiencyPer3Day = efficiencyPerDay * 3;
        int efficiencyPerMonth = efficiencyPerDay * 30;
        System.out.println("За 20 минут машина произвела " + efficiencyPerTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + efficiencyPer3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + efficiencyPerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int allCan = 120;
        int countRoom = 120 / (2+4) ;
        int whiteCan = 2 * countRoom;
        int brownCan = 4 * countRoom;
        System.out.println("В школе, где "+ allCan +" классов, нужно " + whiteCan + " банок белой краски и " + brownCan + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int kalPerBanana = 80;
        float milil100Milk = 105;
        int bricketPlombir = 100;
        int eggs = 70;
        float mix = 5 * kalPerBanana + ( milil100Milk / 100 * 200 ) + (2 * bricketPlombir) + (4 * eggs);
        int grPerKg = 1000;
        float mixKilo = mix / grPerKg;
        System.out.println("Спортивный завтрак в киллограммах -> "+ mixKilo);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int needKilo = 7;
        int minWeight = 250;
        int maxWeight = 500;
        float dayIfMinWeight = (float) (needKilo * 1000) / minWeight;
        float dayIfMaxWeight = (float) (needKilo * 1000) / maxWeight;
        float midCountDay = (dayIfMinWeight + dayIfMaxWeight) / 2;
        System.out.println("Для достижения цели может потребуется количество дней в среднем -> "+ midCountDay);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentUp = 1.1f;
        float mashaUp = masha * percentUp;
        float denisUp = denis * percentUp;
        float kristinaUp = kristina * percentUp;
        float differenceBetweenZpMasha = mashaUp * 12 - masha * 12;
        float differenceBetweenZpDenis = denisUp * 12 - denis * 12;
        float differenceBetweenZpKristina = kristinaUp * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + differenceBetweenZpMasha + " рублей");
        System.out.println("Маша теперь получает " + denisUp + " рублей. Годовой доход вырос на " + differenceBetweenZpDenis + " рублей");
        System.out.println("Маша теперь получает " + kristinaUp + " рублей. Годовой доход вырос на " + differenceBetweenZpKristina + " рублей");
    }
}