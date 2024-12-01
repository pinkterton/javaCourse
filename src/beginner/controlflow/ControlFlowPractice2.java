package beginner.controlflow;

public class ControlFlowPractice2 {

    public static void main(String[] args) {
        char answerInventor = 'A';

        System.out.println("Who's the inventor of the light bulb?");
        switch (answerInventor) {
            case 'C':
                System.out.println("You're right");
                break;
            default:
                System.out.println("You're wrong");
        }
    }
}
