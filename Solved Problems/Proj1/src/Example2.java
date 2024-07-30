import java.util.ArrayList;

public class Example2 {
    public static boolean[] maxCandies(int n, int[] children, int extraCandies) {
        int maxCandies = 0;
        for (int i : children) {
            maxCandies = Math.max(maxCandies, i);
        }
        
        ArrayList<Boolean> output = new ArrayList<>();
        for (int i : children) {
            if (i + extraCandies >= maxCandies) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        
        boolean[] result = new boolean[output.size()];
        for (int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }
        
        return result;
    }
}
