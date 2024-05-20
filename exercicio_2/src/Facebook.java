public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando fotos no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando videos no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentários no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma chamada de vídeo no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma mídia no Facebook");
    }

    @Override
    public void executaAcoes() {
        super.executaAcoes();
        fazStreaming();
        compartilhar();
    }
}
