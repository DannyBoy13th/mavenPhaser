package Module4.Phaser;

/**
 * Created by Daniel Solo on 05.07.2016.
 */
public class Main {

    public static void main(String[] args) {

        SquareSumImpl areaCounter = new SquareSumImpl();
        int[] value = {1,6,4,25,75,15,10};
        Long res = areaCounter.getSquareSum(value, 5);
        System.out.println(res);
    }
}
