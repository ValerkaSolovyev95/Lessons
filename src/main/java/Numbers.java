import java.util.Scanner;

public class Numbers {
    public static int getRandomNumber(int k){
        return (int)(Math.random() * k);
    }
    public static int getRandomNumberScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициент");
        int k = scanner.nextInt();
        return (int)(Math.random() * k);
    }

    public static void main(String[] args) {
        System.out.println(Numbers.getRandomNumber(5));
        System.out.println(Numbers.getRandomNumberScanner());
    }
}
