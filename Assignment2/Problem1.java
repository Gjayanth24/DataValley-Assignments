//sum of divisiblility of 2 and 5
public class Problem1 {
    public static void main(String[] args) {
        int[] values = { 100, 52, 43, 99, 42, 40, 91 };
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0 && values[i] % 5 == 0)
                result += values[i];
        }
        System.out.println(result);
    }

}
