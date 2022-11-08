import lombok.Data;

@Data
public class Pessoa {

    private String nome;
    private TeleSena[] telesena;
    private double premio;

    public Pessoa(String nome) {
        this.nome = nome;
        this.telesena = new TeleSena[(int)(Math.random() * 15 + 1)];
    }

    TeleSena[] t1 = new TeleSena[2];

}


