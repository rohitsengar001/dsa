package foundation.recursion.towerofhanoi;

import java.util.Scanner;

public class TowerOFHanoi {

  public static void TOH(int n, char from_rod, char to_rod, char aux_rod) {
    if (n == 1) {
      System.out.println(
        "Move disk 1 from rod " + from_rod + " to rod " + to_rod
      );
      return;
    }
    TOH(n - 1, from_rod, aux_rod, to_rod);
    System.out.println(
      "Move Disk " +
      n +
      " from_rod " +
      from_rod +
      " to_rod " +
      to_rod +
      " via aux_rod " +
      aux_rod
    );
    TOH(n - 1, aux_rod, to_rod, from_rod);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    TOH(n, 'A', 'B', 'C');
  }
}
