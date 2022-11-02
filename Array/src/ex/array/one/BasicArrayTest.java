package ex.array.one;

public class BasicArrayTest {
    public static void main(String[] args) {
        int arrayName[];
        arrayName = new int[10];

        double doubles[] = new double[] {1,2,3,4,5};
        int n = 10;
        boolean boolenas[] = new boolean[n];

        arrayName[0] =100;
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

    }
}