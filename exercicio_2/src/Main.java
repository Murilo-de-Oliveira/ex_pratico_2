import exceptions.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<RedeSocial> redesSociais1 = new HashSet<>();

        try{
            Facebook facebook = new Facebook("1234567",12);
            redesSociais1.add(facebook);
        }
        catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            GooglePlus googlePlus = new GooglePlus("12345678",12);
            redesSociais1.add(googlePlus);
        }
        catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            Twitter twitter = new Twitter("SenhaSegura",40);
            redesSociais1.add(twitter);
        }
        catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            Instagram instagram = new Instagram("SenhaSegura",-2);
            redesSociais1.add(instagram);
        }
        catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        Usuario usuario1 = new Usuario(
                "Deftonerson Scrobblers da Silva",
                "deftonerson@gmail.com",
                redesSociais1
        );

        try{
            RedeSocial[] rede = usuario1.redesSociais.toArray(new RedeSocial[0]);
            rede[0].acessarRede("SenhaErrada");
        }
        catch (AcessoInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        for(RedeSocial rede : usuario1.redesSociais){
            rede.executaAcoes();
            System.out.println();
        }
    }
}