import java.util.Scanner;

public class Ex2 {
    static float soThu1;

    static float soThu2;

    static float ketQua;

    static public void main(String[] args) {
        // Tạo 1 biến tạm để lưu trữ số nhập vào:
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNhập số thứ 1: ");
        soThu1 = scanner.nextFloat();

        System.out.println("\nNhập số thứ 2: ");
        soThu2 = scanner.nextFloat();

        ketQua = soThu1 * soThu2;

        System.out.println("\nKết quả là: " + ketQua);

        // Đừng quên đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}