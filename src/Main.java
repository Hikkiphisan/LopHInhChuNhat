import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai: ");
        double height = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(width,height);
        System.out.println("Tinh chu vi hinh chu nhat: " + rectangle1.getPerimeter());
        System.out.println("Tinh dien tich hinh chu nhat: " +  rectangle1.getArea());
    }
}