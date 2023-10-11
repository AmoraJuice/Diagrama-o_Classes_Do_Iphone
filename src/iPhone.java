public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;
    public iPhone() {
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
    return navegador;
    }
}
