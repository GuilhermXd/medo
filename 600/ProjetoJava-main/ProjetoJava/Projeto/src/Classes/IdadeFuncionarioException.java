package Classes;

public class IdadeFuncionarioException extends RuntimeException{
    public String getMessage(){
        return "A idade do funcionário é inválida: 70>idade>18";
    }
}
