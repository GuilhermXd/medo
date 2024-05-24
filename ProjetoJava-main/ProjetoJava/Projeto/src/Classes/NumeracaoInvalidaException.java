package Classes;

public class NumeracaoInvalidaException extends RuntimeException{
    public String getMessage(){
        return "Numeração inválida: 35<numeracao<47";
    }
}
