import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int answer = 0;

        if (n > 2) {
            if (m > 6) {
                answer = m - 2;
            } else {
                answer = Math.min(m, 4);
            }

        } else if (n > 1) { // n == 2
            answer = Math.min((m + 1) / 2, 4);
        } else { // n == 1
            answer = 1;
        }

        System.out.println(answer);
    }

}
