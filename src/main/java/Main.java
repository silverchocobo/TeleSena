public class Main {
    public static void main(String[] args) {
        TeleSena sorteio1 = new TeleSena(10);

        ControleTeleSena controleTeleSena = new ControleTeleSena();

        controleTeleSena.sortear();
        controleTeleSena.comprarTeleSena();



    }
}
