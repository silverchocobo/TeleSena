import lombok.Data;

@Data
public class Pessoa {

    private NomePessoa nomePessoa;
    private TeleSena[] telesenas;
    private double premio;
    private boolean vencedor;

    public Pessoa(NomePessoa nomePessoa, int quantidadeTelesenasPessoa) {
        this.nomePessoa = nomePessoa;
        this.telesenas = new TeleSena[quantidadeTelesenasPessoa];

    }








}



