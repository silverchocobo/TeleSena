public class ControleTeleSena extends TeleSena {
    Pessoa[] pessoa;
    int vendas = 0;


    public ControleTeleSena(Pessoa[] pessoa, double valorVenda,int [] t1, int [] t2) {
        super(valorVenda);
        this.pessoa = pessoa;

        pessoa[0] = new Pessoa("Pedro");
        pessoa[1] = new Pessoa("João");
        pessoa[2] = new Pessoa("Pedro");
        pessoa[3] = new Pessoa("Maria");
        pessoa[4] = new Pessoa("Rodolfo");
        pessoa[5] = new Pessoa("Agatha");
        pessoa[6] = new Pessoa("Suzana");
        pessoa[7] = new Pessoa("Gabriel");
        pessoa[8] = new Pessoa("Luís");
        pessoa[9] = new Pessoa("Leonardo");
        pessoa[10] = new Pessoa("Gabriel");
        pessoa[11] = new Pessoa("Joana");
        pessoa[12] = new Pessoa("Janaína");
        pessoa[13] = new Pessoa("Mariana");
        pessoa[14] = new Pessoa("Daiana");
        pessoa[15] = new Pessoa("Camila");
        pessoa[16] = new Pessoa("Bruno");
        pessoa[17] = new Pessoa("Igor");
        pessoa[18] = new Pessoa("Adriano");
        pessoa[19] = new Pessoa("Marcos");
    }


    public void comprarTeleSena(){
        for (int i = 0; i<pessoa.length;i++){
            for (int c =0;c<pessoa[i].getTelesena().length;i++){
                vendas = vendas + 10;
            }
        }
        System.out.println(vendas);




        }



}
