import lombok.Data;

@Data
public class Pessoa {

    private NomePessoa nomePessoa;
    private TeleSena[] telesenas;
    private double premio;


    public Pessoa(NomePessoa nomePessoa, int quantidadeTelesenasPessoa) {
        this.nomePessoa = nomePessoa;
        this.telesenas = new TeleSena[quantidadeTelesenasPessoa];
        //this.telesena = new TeleSena[(int)(Math.random() * 15 + 1)];

    }

    TeleSena[] t1 = new TeleSena[2];






}


