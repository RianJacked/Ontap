import java.util.Scanner;

public class number {
    public static void main(String[] args){
    int number=0;
    int count = 0;
    int sum = 0;
    int countReal = 0;
    int max = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println ("Nhap so tu nhien( Ket thuc bang -1): ");
    while (number != -1){
        sum = number + sum;
        number = scanner.nextInt();
        if (max < number){
            max = number;
        }
        count++;
        countReal = count - 1;
    }
    scanner.close();

    System.out.println("Count: " + countReal);
    System.out.println("Sum: " + sum);
    System.out.println("Max: " + max);
    }
}
