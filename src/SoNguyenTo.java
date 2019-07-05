import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int numbes;
        int count = 0;
        System.out.print("Nhap so nguyen to can hien ra: ");
        numbes = nhap.nextInt();
        for (int i = 0; count < numbes; i++) {
            if (SoNguyenTo(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
    }

    public static boolean SoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
