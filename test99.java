public class Test99 {
    public static void main(String[] args) {
        int i = 9,j = 9;
        while(i >= 1) {
            while (j<=i && j>0) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                j--;
            }
            System.out.println(" ");
            i--;
            j = i;
        }
    }
}
