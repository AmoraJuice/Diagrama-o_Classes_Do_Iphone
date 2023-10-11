public class Main {
    public static <InterruptedExeception extends Throwable> void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        //Reprodutor Musical
        Musica musica1 = new Musica("Colors Flying High", "Lyn", "4:01");
        Musica musica2 = new Musica("Wasting Time", "Windows 96", "3:58");
        Musica musica3 = new Musica("Deep Swim", "Windows 96", "3:58");

    reprodutor.toca(musica2);

    try {
        Thread.sleep(2500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    reprodutor.pausa();

    reprodutor.toca(musica3);

    reprodutor.pausa();

    // Aparelho Telefonico
        telefone.liga("123-456-769");

    try {
        Thread.sleep (2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        telefone.atende();

    // Navegador Internet
        Aba aba1 = navegador.adicionaNovaAba();
        Aba aba2 = navegador.adicionaNovaAba();

        aba1.setUrl("https://web.dio.me/home");
        aba2.setUrl("http://www.google.com");

        navegador.exibeAba(aba1);

    try {
        Thread.sleep(2500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    navegador.atualizaPagina(aba1);
    }
}
