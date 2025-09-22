import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("people_database_example.txt"));
        String Database = "";
        String stringa;
        while ((stringa = reader.readLine()) != null) {
            Database += stringa;
        }
        reader.close();
        ArrayList<String> dati = new ArrayList<String>();
        for (int i = 0; i < Database.split("<Person").length - 1; i++) { 
            String email = Database.split("<Email>")[i+1];
            email = email.split("</Email>")[0];
            dati.add(email);
        }
        for (int i = 0; i<dati.size(); i++) {
            System.out.println("\n" + dati.get(i));
        }
    }
}