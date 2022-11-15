import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class TeleSena {
    private double valorVenda = 10;
    private int[] t1;
    private int[] t2;

    public TeleSena(double valorVenda) {
        this.valorVenda = valorVenda;
        this.t1 = new int[25];
        this.t2 = new int[25];
    }




}

