package Main;

import java.util.Scanner;

public class ProgrammingLanguage {


    public Compiler choiceLanguage(){

        Scanner in = new Scanner(System.in);
        System.out.print("Ввод ЯП: ");
        String lang = in.nextLine();

        if (lang.equals("Java"))
            return useJava();
        else if (lang.equals("PHP"))
            return usePHP();
        else if (lang.equals("JS"))
            return useJS();
        else if (lang.equals("Pascal"))
            return usePascal();
        else {
            System.out.println("Язык " + lang + " не поддерживается!");
            return null;
        }

    }
    public Compiler useJava(){
        return new JavaCompiler();
    }

    public Compiler usePHP(){
        return new PHPCompiler();
    }

    public Compiler useJS(){
        return new JSCompiler();
    }

    public Compiler usePascal(){
        return new PascalCompiler();
    }
}
