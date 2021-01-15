package u06_modulo;

public class M02_TeilbarDurch5 {
    public static void main(String[] args) {
        int input = util.Input.readInt("Zu prüfende Zahl: ");
        if (input % 5 == 0){
            System.out.println("Teilbar durch 5!");
        }
        else{
            System.out.println("Nicht teilbar durch 5!");
        }
    }
}
