import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello, I am your tele-therapist Tia. Nice to meet you. ");
        Scanner userInput = new Scanner(System.in);
        String userAnswer = userInput.nextLine();

        System.out.println("I'd like to get started by asking you some questions. How are you feeling today? ");
        userAnswer = userInput.nextLine();
        if (userAnswer.contains("great") || userAnswer.contains("good") || userAnswer.contains(
                "awesome") || userAnswer.contains("well")) {
            System.out.println("Glad to hear it. ");
        } else if (userAnswer.contains("ok") || userAnswer.contains("okay") || userAnswer.contains("fine")) {
            System.out.println("Just " + userAnswer + "? ");

            userAnswer = userInput.nextLine();
            System.out.println("Ok. Tell me a little bit more about what's going on. ");

            userAnswer = userInput.nextLine();

        }
    }

}
