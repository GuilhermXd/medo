package Classes;

public class IdadeClienteInvalida extends RuntimeException{
    public String getMessage(){
        return "Cliente possui idade inválida (idade>70)";
    }
}
