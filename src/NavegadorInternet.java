import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<Aba> abas;

    public NavegadorInternet() {
        this.abas = new ArrayList<>();
    }

    public void exibeAba(Aba aba) {

    }

    public Aba adicionaNovaAba() {
        Aba novaAba = new Aba();
        abas.add(novaAba);
        return novaAba;
    }

    public void atualizaPagina(Aba aba) {

    }
}
