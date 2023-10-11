public class ReprodutorMusical {
    private Musica musicaAtual;
    private boolean emReproducao;
    public void toca(Musica musica) {
        if (!emReproducao) {
            musicaAtual = musica;
            emReproducao = true;
            System.out.println("Tocando: " + musica.getTitulo());
        } else {
            System.out.println("Uma música já está em reprodução!");
        }
    }

    public void pausa() {
        if (emReproducao) {
            System.out.println("Pausando...");
            emReproducao = false;
        } else {
            System.out.println("Nenhuma música em reprodução");
        }
    }

    public void selecionaMusica(Musica musica) {

    }
    Musica getMusicaAtual() {
        return musicaAtual;
    }
}

