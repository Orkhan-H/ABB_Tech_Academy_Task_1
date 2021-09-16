package modern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionModern {
    public static int carParkingRoof(ArrayList<Integer> cars, int k) {
        List<Integer> sortedCars = cars.stream().sorted().collect(Collectors.toList());
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < sortedCars.size(); i++) {
            if ((i + k - 1) < sortedCars.size()) {
                List<Integer> collect = sortedCars.subList(i, i + k);
                Integer integer = Collections.max(collect) - Collections.min(collect) + 1;
                solution.add(integer);
            }
        }
        return solution.stream().mapToInt(Integer::intValue).min().orElse(0);
    }
}
