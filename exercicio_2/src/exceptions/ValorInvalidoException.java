package exceptions;

public class ValorInvalidoException extends RuntimeException{
    //exception de runtime
    public ValorInvalidoException(String mensagem){
        super(mensagem);
    }
}
