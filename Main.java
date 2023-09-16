public class Main {

    public static void main(String[] args) {
        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is - negative!");
        }
    }


    public static void bartender(String name) {
        switch (name) {
            case "André":
                System.out.println("André drinkt graag 7Up");
                break;
            case "Grace":
                System.out.println("Grace drinkt graag thee");
                break;
            case "Henk":
                System.out.println("Henk drinkt graag Coca Cola");
                break;
            default:
                System.out.println("Drinkt graag water");
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println("De som is: " + (input1 + input2));
    }


}
