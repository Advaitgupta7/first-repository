import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        float b = s.nextFloat(); 
        int c = s.nextInt();
        double d = (a * b * c) / 100;
        System.out.println("The Simple Interest is: " + String.format("%.2f",d));
        s.close();
    }
}
