import java.util.Scanner;

public class eof{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String in = sc.nextLine();
            System.out.printf("%d ", i);
            System.out.println(in);
            i++;
        }
    }
}