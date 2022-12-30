public class Main {
    public static void main(String[] args) {
        cals(41, 23);
    }

    private static void cals(int x, int y) {
        int z = 0;
        int i = 0;
        while (true) {
            // 第０ビットを取得する
            char zeroBit = Integer.toBinaryString(y).charAt(Integer.toBinaryString(y).length() - 1);
            if (zeroBit == '1') {
                z = z + x;
            }
            // xを１ビット左シフト
            x = x << 1;
            // xを１ビット右シフト
            y = y >> 1;
            i = i + 1;
            if (i > 16) {
                break;
            }
        }
        System.out.println(z);
    }
}