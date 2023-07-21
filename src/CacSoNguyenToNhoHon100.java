import java.util.Scanner;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các sô nguyên tố dưới 100");
        for (int i = 0; i <= 100; i++) {
            if (isPreim(i)){
                System.out.printf("%d ",i);
            }
        }

    }

    public  static  boolean isPreim(int numberCheck){
        if (numberCheck < 2){
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(numberCheck); i++) {
            if (numberCheck % i == 0){
                return false;
            }
        }
        return  true;

    }
}
