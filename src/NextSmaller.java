import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextSmaller {
    public static long nextSmaller(long n) {
        String sn = n + "";
        String result;
        char a = '0';
        char b = '0';
        int ia = 0;
        int ib = 0;
        int i = 0;
        char[] csn = sn.toCharArray();
        for (i = csn.length - 1; i > 0; i--) {
            if (csn[i] < csn[i - 1]) {
                a = csn[i];
                b = csn[i - 1];
                ia = i;
                ib = i - 1;
                break;
            }
        }
        String nrSide = "";
        //System.out.println("ia: " + ia + " ib: " + ib + " a: " + a + " b: " + b);
        String lSide = sn.substring(0, ib);
        String rSide = sn.substring(ia + 1, sn.length());
        rSide += "" + b;
        //System.out.println(rSide);
        int[] rSideArray = new int[rSide.length()];
        for (int j = 0; j < rSideArray.length; j++) {
            rSideArray[j] = Character.getNumericValue(rSide.charAt(j));
        }
        Arrays.sort(rSideArray);
        reverse(rSideArray);
        rSide = "";
        for (int item : rSideArray) {
            rSide += item;
        }
        //System.out.println("rSide " + rSide);
        result = ""+lSide+""+a+""+rSide;
        return Integer.parseInt(result);
    }

    private static void reverse(int[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int j = 0; j <= middle; j++) {
            int temp = input[j];
            input[j] = input[last - j];
            input[last - j] = temp;
        }
    }

}
