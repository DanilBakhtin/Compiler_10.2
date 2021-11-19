package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProgrammingLanguage pl = new ProgrammingLanguage();

        Compiler compiler = pl.choiceLanguage();
        System.out.println("Язык выбран успешно!");

        compiler.inputCode();
        compiler.run();
        System.out.println("Компиляция завершена!");

        System.out.println("Команды:\n" +
                "1. Завершение программы\n" +
                "2. Вывести таблицу лексем\n" +
                "3. Вывести таблицу идентификаторов\n" +
                "4. Вывести ДСР\n" +
                "5. Вывести триады\n" +
                "6. Вывести результат оптимизации\n" +
                "7. Вывести объектный код\n");

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Ввод пункта: ");
            String command = in.nextLine();
            switch (command) {
                case "1":
                    System.out.println("\nПрограмма завершена!");
                    System.exit(0);
                case "2":
                    compiler.LEX_table_output();
                    break;
                case "3":
                    compiler.ID_table_output();
                    break;
                case "4":
                    compiler.DSR_output();
                    break;
                case "5":
                    compiler.TRIADS_output();
                    break;
                case "6":
                    compiler.OPTIMIZATION_RESULT_output();
                    break;
                case "7":
                    compiler.OBJECT_CODE_output();
                    break;
                default:
                    System.out.println("Нет такой команды!");
            }
        }


    }
}
