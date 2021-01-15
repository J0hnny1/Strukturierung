package u06_modulo;

public class M01_GeradeZahl {
    public static void main(String[] args) {
        int input = util.Input.readInt("Zu prüfende Zahl: ");
        if (input % 2 == 0){
            System.out.println("Gerade!");
        }
        else{
            System.out.println("Ungerade!");
        }
    }
}
