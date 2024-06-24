public class Safari implements NavegadorInternet {
    public void adicionarNovaAba() {
        System.out.println("Safari - Nova aba adicionada.\n");
    }

    public void atualizarPagina() {
        System.out.println("Safari - Atualizando a página.\n");
    }

    public void exibirPagina(String url) {
        System.out.println("Safari - Exibindo a página no endereço: ("+url+").\n");
    }
}
