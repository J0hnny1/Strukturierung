package u04_StringOperationen;


import util.Input;

public class S03_Palindrom {
    public static void main(String[] args) {

        String input = Input.readString("Text:");
        StringBuilder builder = new StringBuilder();

        for(int i = input.length()-1; 1>=0; i-- ) {
            builder.append(input.charAt(i));
            }

       // System.out.println("Palindrom" + (input.equals(builder.toString())));

        }

    }


