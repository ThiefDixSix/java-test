package scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("你好！请问你叫什么名字？\n");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")){
                System.out.println("下次再见！" );
                break;
            }

            System.out.println("很高兴认识你，" + input + "！");
            System.out.println("欢迎学习 Java 编程！请输入内容（输入 'exit' 退出程序）：");
        }


    }
}
