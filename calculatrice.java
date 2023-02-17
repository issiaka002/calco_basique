public class Calculatrice{
    String operande;
    double resultat;
    
    public void effectuer(String operande, double... nombres){
        for(double nbre : nombres){
            switch(operande){
                case "+":
                    resultat +=nbre;
                    break;
                case "-":
                    resultat -=nbre;
                    break;
                case "*":
                    resultat *=nbre;
                    break;
            }
        }
    }
    
    public void addition(double... nombres){
        effectuer("+", nombres);
    }
    public void soustraction(double... nombres){
        effectuer("-", nombres);
    }
    public void multiplication(double... nombres){
        effectuer("*", nombres);
    }
    public double getResultat(){
        return resultat;
    }
}