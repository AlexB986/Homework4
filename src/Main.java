public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;

        if (age >= 18) {
            System.out.println("возраст человека равен " + age + " совершеннолетний ");
        } else {
            System.out.println("возраст человека равен " + age + " не достиг совершеннолетия ");
        }


    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = -5;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 80;

        if (speed >= 60) {
            System.out.println("скорость  " + speed + " км\\ч придется заплатить штраф");
        }
        else {
            System.out.println("скорость  " + speed + " км\\ч можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");

        int ageHumon = 25;

        if (ageHumon >=2 && ageHumon <=6){
            System.out.println("возраст человека равен " + ageHumon + " ему нужно ходить в детский сад.");
        }

        else if (ageHumon >=7 && ageHumon <=18) {
            System.out.println("возраст человека равен " + ageHumon + " ему нужно ходить в школу.");
        }

        else if (ageHumon >=18 && ageHumon <=24) {
            System.out.println("возраст человека равен " + ageHumon + " ему нужно ходить в университете.");
        }

        else if (ageHumon >=24) {
            System.out.println("возраст человека равен " + ageHumon + " ему нужно ходить на работу.");

        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 15;

        if (ageChild <= 5){
            System.out.println("возраст ребенка равен " + ageChild + " ему нельзя кататься на аттракционе");
        }
        else if (ageChild >=5 && ageChild <=14) {
            System.out.println("возраст ребенка равен " + ageChild + " кататься на аттракционе в сопровождении взрослого");
        }
        else if (ageChild > 14) {
            System.out.println("возраст ребенка равен " + ageChild + " кататься без сопровождения взрослого");

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seating = 60;
        int people = 107;

        if(wagonCapacity >= people && seating >= people ){
            System.out.println("есть  место сидячее  в вагоне");
        }
        else if (wagonCapacity >= people || seating >= people ) {
            System.out.println("есть  место стоячее  в вагоне");
        }
        else if (wagonCapacity <= people ){
            System.out.println("вагон  полностью забит.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 7;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else if (three > one && three > two) {
            System.out.println(three);
        }

    }
}