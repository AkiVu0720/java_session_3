import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;boolean flag1 = true;
        do {
            System.out.println("\n");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("length: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.print("Width: ");
                    int width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:

                    do {
                        System.out.println("The corner is square at 4 different angles");
                        System.out.println("1. botton-left");
                        System.out.println("2. botton-right");
                        System.out.println("3. top-left");
                        System.out.println("4. top-right");

                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2){
                            case 1:
                                squareTriangleBottonLeft(scanner);
                                break;
                            case 2:
                                squareTriangleBottonRight(scanner);
                                break;
                            case 3:
                                squareTriangleTopLeft(scanner);
                                break;
                            case 4:
                                squareTriangleTopRight(scanner);
                                break;
                            case 0:
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Please choose from 0-4");
                                break;
                        }
                    }while (flag1);

                    break;
                case 3:break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose from 1-4");
                    break;
            }
        }while (flag);
    }
    public static void squareTriangleBottonLeft(Scanner scanner){
        System.out.print("length: ");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void squareTriangleBottonRight(Scanner scanner){
        System.out.print("length: ");
        int heightBottomRight = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=heightBottomRight; i++) {
            //In theo dòng
            //In khoảng trắng
            for (int j = 1; j <= heightBottomRight - i; j++) {
                System.out.printf(" \t");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
    public static void squareTriangleTopLeft(Scanner scanner){
        System.out.print("length: ");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = height; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void squareTriangleTopRight(Scanner scanner){
        System.out.print("length: ");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = height; i >= 1; i--) {
            //In theo dòng
            //In khoảng trắng
            for (int j = 1; j <= height - i; j++) {
                System.out.printf(" \t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*\t");
            }
            //Hết dòng xuống dòng
            System.out.printf("\n");
        }
    }
}
