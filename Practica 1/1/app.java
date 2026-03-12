import java.util.Scanner;

public class app {
    public static void forFn(int a, int b) {
        for(int i = a; i <= b; i++) {
            System.out.println("\t" + i);
        }
    }
    public static void whileFn(int a, int b) {
        int i = a;
        while(i <= b) {
            System.out.println("\t" + i);
            i++;
        }
    }
    public static void recursiveFn(int a, int b) {
        if(a > b) return;
        System.out.println("\t" + a);
        recursiveFn(a + 1, b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Ingresar a:");
        a = in.nextInt();
        System.out.print("Ingresar b:");
        b = in.nextInt();
        System.out.println("For function:");
        forFn(a, b);
        System.out.println("While function:");
        whileFn(a, b);
        System.out.println("Recursive function:");
        recursiveFn(a, b);
    }
}