package u03_Zaehlschleife;

public class Z10_Zaehler {
    public static void main(String[] args) {
        int i;
        int j;

        for (i = 0; i < 999; i++ ){
            System.out.println(i);

            for (j = 0; j < i;){
                System.out.println(j);
            }
        }
    }
}
