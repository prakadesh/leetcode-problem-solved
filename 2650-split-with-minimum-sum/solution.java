import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int splitNum(int num) {
        List<Integer> result = spilt(num);
        int one = 0, two = 0;
        int counter = result.size() - 1, power = 0;

        while (counter > -1) {
            one += result.get(counter) * Math.pow(10, power);
            counter -= 2;
            power++;
        }

        counter = result.size() - 2;
        power = 0;
        while (counter > -1) {
            two += result.get(counter) * Math.pow(10, power);
            counter -= 2;
            power++;
        }
        return one + two;
    }

    static List<Integer> spilt(int num) {
        int temp;
        List<Integer> result = new ArrayList<>();
        while (num >= 1) {
            temp = num % 10;
            num = num / 10;
            result.add(temp);
        }

        Collections.sort(result);

        return result;
    }
}
