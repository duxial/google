public class Pyramidtest{
    public static void main(String args[]){
        int col = Integer.parseInt(args[0]);
        for(int i=1;i<=col;i++){//i��ʾ����
            //��ӡ�ո�
            for(int k=0;k<col-i;k++){
                System.out.print(" ");
            }
            //��ӡ����
            for(int m=0;m<2*i-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}	