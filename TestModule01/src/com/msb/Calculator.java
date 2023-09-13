package com.msb;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入第一个数字: ");
            double num1 = scanner.nextDouble();

            System.out.print("请输入操作符 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("请输入第二个数字: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("错误：除数不能为零！");
                        continue; // 继续下一轮循环
                    }
                    break;
                default:
                    System.out.println("错误：无效的操作符！");
                    continue; // 继续下一轮循环
            }

            System.out.println("结果: " + result);

            System.out.print("是否继续计算？(y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                break; // 退出循环
            }
        }

        System.out.println("感谢使用！");
    }
}
