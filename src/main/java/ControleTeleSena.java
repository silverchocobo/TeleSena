import lombok.Data;

@Data
public class ControleTeleSena {
    private Pessoa[] pessoa = new Pessoa[20];
    private int vendas = 0;

    public ControleTeleSena() {
        this.pessoa = pessoa;
        NomePessoa[] nomePessoas = NomePessoa.values();

        for (int i=0; i<20; i++) {
            int quantidadeTelesenasPessoa = (int)(Math.random() * 15 + 1);
            pessoa[i] = new Pessoa(nomePessoas[i], quantidadeTelesenasPessoa);

        }


    }

    public void comprarTeleSena(){
        for (int i = 0; i<pessoa.length;i++){
            for (int c =0;c<pessoa[i].getTelesenas().length;i++){
                vendas = vendas + 10;
            }
        }
        System.out.println(vendas);
    }



}