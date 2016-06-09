import java.util.ArrayList;

/**
 * Created by svetlana on 6/8/16.
 */
public class testt {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        Double sum = 0.0;
        for (int x : number) {
            sum = sum + x;
        }
        Double middle = sum / number.length;
        int minIndex = 0;
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
                minIndex = i;
            }
        }
        number[minIndex] = middle.intValue();
        System.out.println(number);
    }
}