package Q_04;

public class objpost {
    public static void main(String[] args) {
        Post post = new Post("Eu não sou aquele que está errado, o que está errado é este mundo.", "https://www.pensador.com/autor/tokyo_ghoul/");

        post.curtir();
        post.curtir();
        post.curtir();
        System.out.println("Número de curtidas: " + post.getNumeroCurtidas());

        post.compartilhar();
        post.compartilhar();
        System.out.println("Número de compartilhamentos: " + post.getNumeroCompartilhamentos());
    }
}
