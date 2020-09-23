package hw_2;
import java.util.Scanner;

public class t_2_vector {

    public static void Main (String[] args) {
        int x, y, z, x1, y1, z1;
        float v_len = 0, scalar = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Введите числа x, y, z.");
        x = num.nextInt();
        y = num.nextInt();
        z = num.nextInt();

        System.out.println("Enter x2, y2, z2 ");
        x1 = num.nextInt();
        y1 = num.nextInt();
        z1 = num.nextInt();

        Vector_len(x, y, z, v_len);
        Vector_scalar(x, x1, y, y1, z, z1, scalar);


    }

    private static float Vector_len (int x, int y, int z, float v_len) {
        v_len = (float) Math.sqrt(x*x + y*y + z*z);
        System.out.println("Длина вектора: " + v_len);
        return v_len;
    }

    private static float Vector_scalar (int x, int x1, int y, int y1, int z, int z1, float scalar) {
        scalar = x*x1 + y*y1 + z*z1;
        System.out.println("Скалярное произведение вектора: " + scalar);
        return scalar;
    }

}
