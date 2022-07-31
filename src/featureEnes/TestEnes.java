package featureEnes;

public class TestEnes {
    public static void main(String[] args) {
        repeat(3,"Group 10");
    }

    public static void repeat(int n,String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
