package org.example;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трех целых чисел
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Проверка условий
        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else if ((a == b) && (b == c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if ((a == b) || (b == c) || (c == a)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }

        scanner.close();
    }
}
