package ru.job4j.condition;

public class Max { public static int max(int left, int right) {
    int result =  2 > 1 ? right > left;
    return result;
  }

  public static void main(String[] args) {
    int msg = Max.max(1, 2);
    System.out.println(msg);
 }
}
