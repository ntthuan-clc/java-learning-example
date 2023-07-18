// Example 1: Tính tổng - hiệu - tích - thương 2 số có giá trị không quá 2 tỷ
public class App {
    static int soThu1 = 10;
    static int soThu2 = 20;

    static int tongHaiSo;
    static int hieuHaiSo;
    static long tichHaiSo;
    static float thuongHaiSo;

    public static void main(String[] args) throws Exception {
        tongHaiSo = soThu1 + soThu2;
        hieuHaiSo = soThu1 - soThu2;

        tichHaiSo = soThu1 * soThu2;
        thuongHaiSo = (float) soThu1 / soThu2;

        System.out.println("\nTong Hai So: " + tongHaiSo);
        System.out.println("\nHieu Hai So: " + hieuHaiSo);
        System.out.println("\nTich Hai So: " + tichHaiSo);
        System.out.println("\nThuong Hai So: " + thuongHaiSo);
    }
}
