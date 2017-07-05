/**
 * Created by yongmok on 2017. 7. 5..
 */
public class starRev3 {
    public static void main(String[] args){
        for(int a = 3 ; a>0;a--){
            for(int space = 0; space <3-a;space++){
                System.out.print(" ");
            }
            for(int b=0  ; b<2*a-1 ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}