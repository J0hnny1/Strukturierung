package u06_modulo;

public class M03_TeilbarOhneRest {
    public static void main(String[] args) {
        int a = util.Input.readInt("Zahl1 ");
        int b = util.Input.readInt("Zahl2: ");
        if (a % b == 0){
            System.out.println("Ohne Rest teilbar!");
        }
        else{
            System.out.println("Es bleibt der Rest " + a % b);
        }
    }
}
