package SchiefeEbene;

import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Ausgabe {


        public static void speichern(Kraft[] kraftArray, String file) throws IOException {
            File f = new File(".", file);                                           //Create file in current directory, with specified name.
            if (!f.exists()) f.createNewFile();                                                //Create empty file if not exists

            if (!f.canWrite()) {                                                               //Checks if application can write to that file
                System.err.println("No permission to write to file");                            //aborts the programm if not access is granted
                return;
            }

            FileWriter writer = new FileWriter(f);                                                    //Creating new FileWriter instance


            for (Kraft k : kraftArray) writer.append(k.getName()).append(';');                 //Adding name1,name2,name3... into the first column

            writer.append("\n");                                                               //Change/Create new column

            for (Kraft k : kraftArray) writer.append(k.getVec().toString()).append(';');      //Adding vektor data for each 'Kraft'


            writer.flush();                                                                    //Deletes all not written or stuck data!
            writer.close();                                                                    //Closes the stream so the computer knows not to wait for any more data!
        }

        public static void main(String[] args) throws IOException {
            var v = new Vektor(69, 420, 911, 88);
            Kraft[] k = { new Kraft("A", v), new Kraft("MOG", v), new Kraft("SUS", v), new Kraft("420", v) };

            speichern(k, "data.csv");
        }


}
