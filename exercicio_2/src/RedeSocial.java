import exceptions.AcessoInvalidoException;
import exceptions.ValorInvalidoException;

import java.util.Objects;

public abstract class RedeSocial{
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws ValorInvalidoException{
        if(senha.length() < 8){
            throw new ValorInvalidoException("O valor inserido para senha é inválido");
        }
        if(numAmigos < 0){
            throw new ValorInvalidoException("O valor do número de amigos é inválido");
        }
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public void acessarRede(String senha) throws AcessoInvalidoException {
        if(Objects.equals(senha, this.senha)){
            System.out.println("Acessando...");
        }
        else{
            throw new AcessoInvalidoException("Senha errada. Acesso inválido");
        }
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.print("Você curtiu uma publicação no ");
    };
    public abstract void executaAcoes();
}
