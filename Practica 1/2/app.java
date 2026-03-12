public class app {
    static private int[] generateList(int x) {
        int[] list = new int[x];
        for (int i = 0; i <= x; i++) {
            list[i] = i * x;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(generateList(5)));
    }
}