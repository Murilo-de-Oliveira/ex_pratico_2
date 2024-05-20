public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando fotos no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando videos no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentários no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Uma mídia foi compartilhada no Twitter");
    }
    public void executaAcoes() {
        super.executaAcoes();
        compartilhar();
    }
}
