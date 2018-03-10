//Author: Jacob Liddicoat
//Date created: Mar 10, 2018
public class Tester
 {
  double d1 = 37.9;
  double d2 = 1004.128;
  int i1 = 12;
  int i2 = 18;
  public static void main(String args[])
   {
    System.out.println(Problem 1: 57.2 * (i1 / i2) + 1); //1.0
    System.out.println(Problem 2: 57.2 * ((double)i1 / i2) + 1); //39.13333333333333
    System.out.println(Problem 3: 15 - i1 * (d1 * 3) + 4); //-1345.39999999999
    System.out.println(Problem 4: 15 - i1 * (int)(d1 * 3) + 4); //-1337
    System.out.println(Problem 5: 15 - i1 * ((int)d1 * 3) + 4);//-1313
   }
  }
