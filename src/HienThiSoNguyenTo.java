import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap so luong so nguyen to muon hien thi");
        int number = Integer.parseInt(scanner.nextLine());
        if (isPreim(number)){
            System.out.println(" soo nguyen to");
        }else {
            System.out.println("Ko phai so nguyen to");
        }
        int count = 0;
        int preim = 2;
        while (count!=number){
            if (isPreim(preim)){
                System.out.printf("%d ", preim);
                count++;
            }
            preim++;
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
