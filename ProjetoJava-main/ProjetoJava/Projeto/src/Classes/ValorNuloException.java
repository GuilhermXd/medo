package Classes;

public class ValorNuloException extends RuntimeException{
    public String getMessage(){
        return "A String possuí valor inválido(nulo)!";
    }
}
