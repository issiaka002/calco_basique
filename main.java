
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        Calculatrice calco = new Calculatrice();
        calco.addition(2, 2, 2, 2, 2);
        System.out.println(calco.getResultat());
        calco.soustraction(2, 5, 4);
        System.out.println(calco.getResultat());
    }
}
