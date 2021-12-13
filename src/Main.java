import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the world's worst bedtime story!!\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a place: ");
        String place1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.println("Enter a female celebrity: ");
        String femaleCelebrity = scanner.nextLine();
        System.out.println("Enter a body part: ");
        String bodyPart1 = scanner.nextLine();
        System.out.println("Enter a body part: ");
        String bodyPart2 = scanner.nextLine();
        System.out.println("Enter a human organ: ");
        String humanOrgan = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.println("Enter a male celebrity: ");
        String maleCelebrity = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective3 = scanner.nextLine();
        System.out.println("Enter a body part: ");
        String bodyPart3 = scanner.nextLine();
        System.out.println("Enter a body part: ");
        String bodyPart4 = scanner.nextLine();
        System.out.println("Enter a place: ");
        String place2 = scanner.nextLine();
        System.out.println("Enter a celebrity: ");
        String celebrity = scanner.nextLine();
        System.out.println("Enter an animal: ");
        String animal = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter a body part: ");
        String bodyPart5 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective4 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective5 = scanner.nextLine();
        System.out.println("Enter an past-tense verb: ");
        String pastTenseVerb = scanner.nextLine();

        System.out.println("Once upon a time, in a place called " + place1 + ", there was a " + adjective1 +
                " princess named " + femaleCelebrity + ". Her kingdom was huge, but her " + bodyPart1 + " was bigger. " +
                "She was beautiful from her " + bodyPart2 + " to her " + humanOrgan + ". One day she saw a " + adjective2 +
                " prince named " + maleCelebrity + ". He had a " + adjective3 + " face. As soon as his " + bodyPart3 +
                " touched her " + bodyPart4 + " they fell in love. They got married at " + place2 + " the following day.\n" +
                "Not long after, they had a baby. They decided to call him/her " + celebrity + ". He/She looked like a " +
                animal + ". He/She used to " + verb + number + " times a day so that his/her " + bodyPart5 + " would be " +
                adjective4 + " and " + adjective5 + ". Andy they " + pastTenseVerb + " happily ever after!");
    }
}
