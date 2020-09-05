package LabMethodParameters;

public class MethodParams {

    public static void main(String[] args) {
        MethodParams mp = new MethodParams();

        System.out.println(mp.intToDouble(3));
        System.out.println(mp.sum(3.36901, 2, 76));

        float[] f = mp.square(2, 5, 7, 9);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

        String[] arr1 = {"apple", "baby", "car", "wisk"};
        String[] arr2 = {"cherry", "deer", "film",  "maple"};

        System.out.println(mp.findFirstLetter(arr1, arr2));
    }

    public double intToDouble(int num) {
        return (double) num;
    }

    public double sum(double num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public float[] square(int num1, int num2, int num3, int num4) {
        float[] f = { num1 * num1, num2 * num2, num3 * num3, num4 * num4 };

        return f;
    }

    public String findFirstLetter(String[] s1, String[] s2) {

        String firstLetter1;
        String firstLetter2;
        String firstValue = s1[0];
        String secondValue = s2[0];

        firstLetter1 = firstValue.substring(0,1);
        firstLetter2 = secondValue.substring(0,1);

        return firstLetter1 + " " +  firstLetter2;
    }
}
