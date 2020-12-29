import java.util.Scanner;

public class Numbers extends Base {

    public Numbers(){};

    public int setInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }
}
