package Classes;

public class ValorNegativoException extends RuntimeException{
    public String getMessage(){
        return "Valor inserido é negativo!";
    }
}
