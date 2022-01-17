import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int startIncl = a, endExcl = b;

        int sum = 0;
        for (int i = startIncl; i <= endExcl; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}