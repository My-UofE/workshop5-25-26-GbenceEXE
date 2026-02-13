import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
    public static void main(String[] args) {
        int nVals = args.length;
        int[] myVals = new int[nVals];
        for (int i = 0; i < nVals; i++) {
            myVals[i] = Integer.parseInt(args[i]);
        }
        System.out.println("original values: " + Arrays.toString(myVals));
        
        ArrayList<Integer> uniqueVals = new ArrayList<>();
        for (int n : myVals) {
            if (!uniqueVals.contains(n)) {
                uniqueVals.add(n);
            }
        }
        System.out.println("unique values: " + uniqueVals.toString());
    }
}