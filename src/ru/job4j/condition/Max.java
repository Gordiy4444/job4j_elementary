package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
    return right > left ? right : left;
  }
    public static int max(int left, int right,int ahead) {
        return  right > left > ahead ? right : left : ahead;
    }
  public static void main(String[] args) {
    int msg = Max.max(6, 5);
    System.out.println(msg);
 }
}
