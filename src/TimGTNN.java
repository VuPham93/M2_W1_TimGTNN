import java.util.Scanner;

public class TimGTNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int a: array) {
            if (min > a) {
                min = a;
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }
}
