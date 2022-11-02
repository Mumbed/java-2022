package ex.array.one;

public class EArrayTest {
//    String [][] test;
//    test = new String[2][];
//
    public static void main(String[] args){
        int [][] integers;
        integers = new int[2][3];


        for(int g = 0; g < integers.length; g++) {
            for(int e = 0; e < integers[g].length; e++) {
                integers[g][e] = g * 10 + e;
            }
            System.out.println();
        }
        for(int []a :integers) {
            for(int n :a){
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
