package Assignment_6;

public class Q9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=1;j<=5;j++){
                if(j>=i) {
                    System.out.print(ch+" ");
                    ch++;
                }
                else {
                    System.out.print("  ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
