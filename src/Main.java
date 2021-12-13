import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nThis is the world's worst bedtime story!!\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a place: ");
        String place1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.println("Enter a female celebrity: ");
        String femaleCelebrity = scanner.nextLine();
        System.out.println("Enter a body part: ");
        String bodyPart1 = scanner.nextLine();
        System.out.println("Enter another body part: ");
        String bodyPart2 = scanner.nextLine();
        System.out.println("Enter a human organ: ");
        String humanOrgan = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.println("Enter a male celebrity: ");
        String maleCelebrity = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        String adjective3 = scanner.nextLine();
        System.out.println("Enter another body part: ");
        String bodyPart3 = scanner.nextLine();
        System.out.println("Enter another body part: ");
        String bodyPart4 = scanner.nextLine();
        System.out.println("Enter another place: ");
        String place2 = scanner.nextLine();
        System.out.println("Enter a celebrity: ");
        String celebrity = scanner.nextLine();
        System.out.println("Enter an animal: ");
        String animal = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        System.out.println("Enter another body part: ");
        String bodyPart5 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        String adjective4 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        String adjective5 = scanner.nextLine();
        System.out.println("Enter a past-tense verb: ");
        String pastTenseVerb = scanner.nextLine();

        System.out.println("Once upon a time, in a place called " + place1 + ", \nthere was a " + adjective1 +
                " princess named " + femaleCelebrity + ". \nHer kingdom was huge, but her " + bodyPart1 + " was bigger.\n" +
                "She was beautiful from her " + bodyPart2 + " to her " + humanOrgan + ". \nOne day she saw a " + adjective2 +
                " prince named " + maleCelebrity + ". \nHe had a " + adjective3 + " face. As soon as his " + bodyPart3 +
                " \ntouched her " + bodyPart4 + " they fell in love. \nThey got married at " + place2 + " the following day.\n" +
                "Not long after, they had a baby. They decided \nto call him/her " + celebrity + ". \nHe/She looked like a " +
                animal + ". \nHe/She used to " + verb + " " + number + " times a day so that \nhis/her " + bodyPart5 + " would be " +
                adjective4 + " and " + adjective5 + ". \nAnd they " + pastTenseVerb + " happily ever after!");
    }
}
