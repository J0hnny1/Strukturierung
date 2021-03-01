package u07_Felder;

public class F05_TextMitIndexSuche {
    public static void main(String[] args) {
        String a[] = new String[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = util.Input.readString("Name: ");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int n = util.Input.readInt("Name an Stelle:");
        System.out.println(a[n]);
    }
}
