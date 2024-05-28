import java.util.HashMap;
import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redeSocial) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redeSocial;
    }
}
