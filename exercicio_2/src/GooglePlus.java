public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando fotos no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando videos no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentários no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma chamada de vídeo no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma mídia no GooglePlus");
    }

    public void executaAcoes() {
        postarVideo();
        fazStreaming();
        compartilhar();
    }
}
