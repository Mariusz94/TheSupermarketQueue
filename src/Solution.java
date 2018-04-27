import java.lang.reflect.Array;
import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        if (customers.length==0) return 0;

        if (customers.length<n){
            Arrays.sort(customers);
            return customers[customers.length-1];
        }

        int[] tills = new int[n];

        for (int i = 0; i < tills.length; i++) {
            tills[i] = customers[i];
        }
        for (int i = 0; i < customers.length-n ; i++) {
            Arrays.sort(tills);
            tills[0] += customers[tills.length+i];
        }
        Arrays.sort(tills);

        return tills[tills.length-1];
    }

}