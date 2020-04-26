

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
        System.out.println("ia: " + ia + " ib: " + ib + " a: " + a + " b: " + b);
        String lSide = sn.substring(0, ib);
        String rSide = sn.substring(ia + 1, sn.length());
        rSide += "" + b;
        char[] crSide = rSide.toCharArray();
        for (int j = crSide.length - 1; j >= 0; j--) {
            nrSide += crSide[j];
        }
        System.out.println("lSide: " + lSide + " nrSide: " + nrSide);
        StringBuilder sb = new StringBuilder();

        System.out.println(sb);
        result = lSide + "" + a + "" + rSide;
        System.out.println("result " + result);
        return n;
    }
}
