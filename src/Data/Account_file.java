package Data;

import Bussines.Account;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author justin
 */
public class Account_file {

    public ArrayList<Account> read() {
        try {
            FileReader archive = new FileReader("users.txt");
            BufferedReader read = new BufferedReader(archive);
            String line = "";
            String chain = "";
            String[] separedChain;
            ArrayList<Account> listUser = new ArrayList<Account>();
            Account account = new Account();

            while ((line = read.readLine()) != null) {
                chain = line;
                separedChain = chain.split("/");
                account = new Account(separedChain[0],separedChain[1], Integer.parseInt(separedChain[2]), separedChain[3], Double.parseDouble(separedChain[4]));
                listUser.add(account);
            }
            archive.close();
            read.close();
            return listUser;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
            return null;
        }    
    }
    
    public void writeFile(String nameArchive, String data){
        try{
            FileWriter archive = new FileWriter(nameArchive);
            BufferedWriter information = new BufferedWriter(archive);
            information.write(data);
            information.close();
            archive.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }
}
