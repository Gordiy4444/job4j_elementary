package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
    return right > left ? right : left;
  }
    public static int max(int left, int right,int ahead) {
        int tmp = max(right, ahead);
        return max(left, tmp);
    }
    public static int max(int left, int right,int ahead, int back) {
        int tmp = max(right, ahead, back);
         return max(left, tmp);
    }
  public static void main(String[] args) {
    int msg = Max.max(6, 5, 4, 3);
    System.out.println(msg);
 }
}
