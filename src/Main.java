public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println(" Человек достиг совершеннолетия, если ему исполнилось " + age);
        }
        int age1 = 17;
        if (age <= 18) {
            System.out.println(" Если возраст человека равен " + age1 + " то он не достиг совершеннолетия, нужно немного подождать ");
        }
// задача 2
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        } else if (temperature >= 5) {
            System.out.println(" На улице тепло, шапку можно не надевать");
        }
// задача 3
        int speed = 60;
        if (speed >= 60 && (speed <= 60)) {
            System.out.println(" Если скорость превышает больше " + speed + " то придет штраф, если скорость меньше" + speed +
                    "то штрафа не будет");
        }
// задача 4
        int age3 = 2;
        if (age3 <= 2) {
            System.out.println(" Если возраст человека равен - " + age3 + ", то ему пора спать");
        }
        if (age3 >= 2 && age3 <= 6) {
            System.out.println(" Если возраст человека больше - " + age3 + ", то ему нужно ходить в детский сад ");
        }
        if (age3 >= 7 && age3 <= 18) {
            System.out.println(" Если возраст человека больше - " + age3 + ", то ему нужно ходить в детский сад ");
        }
        if (age3 >= 18 && age3 <= 24) {
            System.out.println(" Если возраст человека больше - " + age3 + ", то ему нужно ходить в униврситет");
        }
        if (age3 >= 24 && age3 <= 60) {
            System.out.println("Если возраст человека -" + age3 + ", то ему нужно ходить на работу");
        }
        if (age3 >= 60) {
            System.out.println("Если возраст человека равен - " + age3 + ", то ему уже пора отдыхать");
        }
// задача 5
        int age4 = 5;
        if (age4 <= 5) {
            System.out.println(" Если возраст человека меньше -" + age4 + " то на аттракцион нельзя ");
        }
        if (age4 >= 5 && age4 <= 14) {
            System.out.println("Если возраст человека больше -" + age4 + " то ему можно на аттракцион в сопровождении взрослого");
        }
        if (age4 >= 14) {
            System.out.println(" Если человеку больше -" + age4 + "то ему можно без соправождения взрослого");
        }
// задача 6
        int allplaces = 102;
        int sidownplaces = 60;
        int otherplaces = allplaces - sidownplaces;
        if (sidownplaces >= 60) {
            System.out.println(" Остались только стоячие ");
        } else {
            System.out.println(" Сидячия места есть ");
        }

        // Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
    }