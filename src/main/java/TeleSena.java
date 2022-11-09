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

    public void sortear(){
        for (int i=0;i< t1.length;i++){
            t1[i] = (int)(Math.random() * 60 + 1);
        }
        System.out.println(java.util.Arrays.toString(t1));
        for (int i=0;i< t2.length;i++){
            t2[i] = (int)(Math.random() * 60 + 1);
        }
        System.out.println(java.util.Arrays.toString(t2));

    }


}
