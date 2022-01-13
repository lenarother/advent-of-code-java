import java.nio.file.Paths;
import static java.nio.file.Files.readAllLines;


public class Solution {

    public int solve1(String filename) throws Exception {
        var path = Paths.get(filename);
        String data = readAllLines(path).get(0);
        int result = countFloors(data);
        return result;
    }

    public int solve2(String filename) throws Exception {
        var path = Paths.get(filename);
        String data = readAllLines(path).get(0);
        int result = findBasement(data);
        return result;
    }

    public int countFloors(String floors) {
        int count = 0;
        for (char i: floors.toCharArray()) {
            if (i == '(') count ++;
            if (i == ')') count --;
        }
        return count;
    }

    public int findBasement(String floors) {
        int basement = 0;
        int counter = 1;
        for (char i: floors.toCharArray()) {
            if (i == '(') basement ++;
            if (i == ')') basement --;
            if (basement == -1) return counter;
            counter += 1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        System.out.println(s.solve1("day_01/input.txt"));
        System.out.println(s.solve2("day_01/input.txt"));

    }

}
