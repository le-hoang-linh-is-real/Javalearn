import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        // Khởi tạo một đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        // In ra câu chào với tên người dùng
        System.out.println("Xin chào, " + name + "! Chào mừng bạn đến với chương trình Java đầu tiên của bạn.");

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
