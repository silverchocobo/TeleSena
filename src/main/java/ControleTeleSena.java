import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

@Data
public class ControleTeleSena {
    private Pessoa[] pessoa = new Pessoa[20];

    private TeleSena[] tele = new TeleSena[2];

    private TeleSena[] premiado = new TeleSena[1];
    private int vendas = 0;

    private double dinheiro = 0;

    private int vencedores = 0;

    private boolean fim = false;

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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < 60) {
            int random = randomGenerator.nextInt(60);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
            for (int i = 0; i < premiado[0].getT1().length; i++) {
                premiado[0].getT1()[i] = numbers.get(i);

            }
            System.out.println("A telesena premiada é: ");
            System.out.println(java.util.Arrays.toString(premiado[0].getT1()));

        }


    public void comprarTeleSena() {
        while (fim == false) {
            for (int i = 0; i < pessoa.length; i++) {
                for (int c = 0; c < pessoa[c].getTelesenas().length; c++) {
                    vendas = vendas + 1;
                    dinheiro = dinheiro + tele[0].getValorVenda();

                    for (int cont = 0; cont < tele.length; cont++) {
                        for (int q = 0; q < tele[cont].getT1().length; q++) {
                            tele[cont].getT1()[q] = (int) (Math.random() * 60 + 1);

                        }
                        for (int q = 0; q < tele[cont].getT2().length; q++) {
                            tele[cont].getT2()[q] = (int) (Math.random() * 60 + 1);

                        }
                        System.out.printf(java.util.Arrays.toString(tele[cont].getT1()));
                        System.out.printf(java.util.Arrays.toString(tele[cont].getT2()));

                        if (Arrays.equals(tele[cont].getT1(), premiado[0].getT1()) || Arrays.equals(tele[cont].getT2(), premiado[0].getT1())) {
                            pessoa[c].setVencedor(true);
                            setFim(true);
                            vencedores = vencedores + 1;
                        }

                    }
                }
            }
            System.out.println(vendas);
            System.out.println(dinheiro);
            System.out.println(fim);

        }
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].isVencedor()) {
                System.out.println(pessoa[i].getNomePessoa() + "venceu! ");
                pessoa[i].setPremio(dinheiro*0.8/vencedores);
            }
        }
    }

    public void imprimirInfo(){
        System.out.println("Número de vencedores: " + vencedores);
        System.out.println("Número de telesenas vendidas: " + vendas);
        System.out.println("Valor total arrecadado nas vendas: " + dinheiro );
        System.out.println("Valor do prêmio para cada vencedor: " + dinheiro*0.8/vencedores);
        System.out.println("Lucro do Silvio Santos: " + dinheiro*0.20);

    }
}
