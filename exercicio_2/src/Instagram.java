public class Instagram extends RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando fotos no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando videos no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentários no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Instagram");
    }

    @Override
    public void executaAcoes() {
        postarVideo();
        postarComentario();
    }
}
