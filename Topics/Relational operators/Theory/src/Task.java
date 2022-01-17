// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int h1 = scanner.nextInt();
    int h2 = scanner.nextInt();
    int h3 = scanner.nextInt();

    boolean res1 = h1 != h3;
    boolean res2 = h2 != h3;

    System.out.println(res1);
    System.out.println(res2);

  }
}