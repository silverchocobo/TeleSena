public enum NomePessoa {
    PEDRO(1, "Pedro"),
    JOAO(2, "João"),
    MARIA(3, "Maria"),
    RODOLFO(4, "Rodolfo"),
    AGATHA(5, "Agatha"),
    SUZANA(6, "Suzana"),
    GABRIEL(7, "Gabriel"),
    LUIS(8, "Luís"),
    LEONARDO(9, "Leonardo"),
    JOANA(10, "Janaína"),
    MARIANA(11, "Mariana"),
    DAIANA(12, "Daiana"),
    CAMILA(13, "Camila"),
    BRUNO(14, "Bruno"),
    IGOR(15, "Igor"),
    ADRIANO(16, "Adriano"),
    MARCOS(17, "Marcos"),
    LUCAS(18, "Lucas"),
    LEANDRO(19, "Leandro"),
    TIAGO(20, "Tiago");

    private int numero;
    private String nome;

    NomePessoa(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
}
