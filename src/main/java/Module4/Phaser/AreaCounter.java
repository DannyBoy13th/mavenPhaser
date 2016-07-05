package Module4.Phaser;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Phaser;

/**
 * Created by Daniel Solo on 01.07.2016.
 */
public class AreaCounter implements Callable<Long> {
    int[] values;
    int start;
    int finish;
    List<Long> result;
    Phaser planner;

    public AreaCounter(int[] values, int start, int finish, List<Long> result, Phaser planner){
        this.values = values;
        this.start = start;
        this.finish = finish;
        this.result = result;
        this.planner = planner;
    }

    @Override
    public Long call() throws Exception {

        Long sum = 0L;

        for(int i = start; i < finish; i ++){
            sum += values[i] * values[i];
        }

        System.out.println(sum);

        result.add(sum);
        planner.arriveAndDeregister();

        return sum;
    }
}
