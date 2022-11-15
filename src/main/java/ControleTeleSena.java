import lombok.Data;

import java.util.Arrays;

@Data
public class ControleTeleSena {
    private Pessoa[] pessoa = new Pessoa[20];

    private TeleSena[] tele = new TeleSena[2];

    private TeleSena[] premiado = new TeleSena[1];
    private int vendas = 0;

    private int dinheiro = 0;

    public ControleTeleSena() {
        this.pessoa = pessoa;
        this.tele = tele;

        NomePessoa[] nomePessoas = NomePessoa.values();

        tele[0] = new TeleSena(10);
        tele[1] = new TeleSena(10);

        premiado[0] = new TeleSena(10);


        for (int i = 0; i < 20; i++) {
            int quantidadeTelesenasPessoa = (int) (Math.random() * 15 + 1);
            pessoa[i] = new Pessoa(nomePessoas[i], quantidadeTelesenasPessoa);

        }

    }

    public void sortear() {
        for (int i = 0; i < premiado[0].getT1().length; i++) {
            premiado[0].getT1()[i] = (int) (Math.random() * 60 + 1);
        }
        System.out.println("A telesena premiada é: ");
        System.out.println(java.util.Arrays.toString(premiado[0].getT1()));

    }

    public void comprarTeleSena() {
        for (int i = 0; i < pessoa.length; i++) {
            for (int c = 0; c < pessoa[c].getTelesenas().length; c++) {
                vendas = vendas + 1;
                dinheiro = dinheiro + 10;

                for (int cont = 0; cont < tele.length; cont++) {
                    for (int q = 0; q < tele[cont].getT1().length; q++) {
                        tele[cont].getT1()[q] = (int) (Math.random() * 60 + 1);
                    }
                    for (int q = 0; q < tele[cont].getT2().length; q++) {
                        tele[cont].getT2()[q] = (int) (Math.random() * 60 + 1);

                    }
                    System.out.printf(java.util.Arrays.toString(tele[cont].getT1()));
                    System.out.printf(java.util.Arrays.toString(tele[cont].getT2()));

                    if (Arrays.equals(tele[cont].getT1(), tele[cont].getT2())) {
                        pessoa[c].setVencedor(true);
                    }

                }
            }
        }
        System.out.println(vendas);
        System.out.println(dinheiro);
        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].isVencedor()){
                System.out.println(pessoa[i].getNomePessoa());
            }
        }
    }
}
