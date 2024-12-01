package beginner.loops;

public class LoopsApp {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            System.out.println(i + ". BEING RIGHT SUCKS.");
            i++;

        }
        System.out.println("Value of i: " + i);
        System.out.println();

        int j = 1;
        do {
            System.out.println(j + ". BEING RIGHT SUCKS.");
            j++;
        } while (j <= 0);
        System.out.println("Value of j: " + j);
        System.out.println();

        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k + ". BEING RIGHT SUCKS.");
        }

        System.out.println();

        for (int l = 1; l <= 5; l++) {
            for (int m = 1; m <= 2; m++) {
                System.out.println("l="+ l + " m=" + m + ". BEING RIGHT SUCKS.");
            }
        }
    }

}
