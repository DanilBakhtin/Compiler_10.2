package Main;

import java.util.Scanner;

/**
 * Абстрактный класс Компилятор
 */
public abstract class Compiler {


    //Ввод кода
    public void inputCode(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод кода: ");
        startCode = in.nextLine();
    }

    /**
     * Исходный код
     */
    protected String startCode;
    /**
     * Машинный код
     */
    protected String machineCode;
    /**
     * Объектный код
     */
    protected String objectCode;

    /**
     * Абстрактные методы класса
     */
    //пуск программы
    public abstract void run();

    //лекцический анализ
    public abstract void lexicalAnalysis();

    //синтаксический анализ(парсинг)
    public abstract void syntacticAnalysis();

    //семантический анализ
    public abstract void semanticAnalysis();

    //Машинный код
    public abstract void machineCode();

    //Сообщения об ошибках
    public abstract void errorsMessage();

    //вывод таблицы лексем
    public abstract void LEX_table_output();

    //вывод таблицы идентификаторов
    public abstract void ID_table_output();

    //вывод ДСР
    public abstract void DSR_output();

    //вывод триад
    public abstract void TRIADS_output();

    //вывод результатов оптимизации
    public abstract void OPTIMIZATION_RESULT_output();

    //вывод объектного кода
    public abstract void OBJECT_CODE_output();


}
