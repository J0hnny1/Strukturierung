package u04_StringOperationen;

import util.Input;

public class S04_LeerzeichenEntfernen {
    public static void main(String[] args) {

        String input = Input.readString("input:");
        int length = input.length();

        String replaced = input.replace(" ","");

        System.out.println(replaced);

    }
}
