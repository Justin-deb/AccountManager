
package Bussines;

import Data.Account_file;
import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class Account {
    private String name;
    private String userName;
    private int ID;
    private String password;
    private double balance;

    public Account() {
    }

    public Account(String name,String userName, int ID, String password, double balance) {
        this.name = name;
        this.userName = userName;
        this.ID = ID;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", userName=" + userName + ", ID=" + ID + ", password=" + password + ", balance=" + balance + '}';
    }

    
    public void saveFile(String information){
        Account_file af = new Account_file();
        af.writeFile("users.txt", information);
    }
    
    public ArrayList<Account> readFile(){
        Account_file af = new Account_file();
        return af.read();
    }
    
}
