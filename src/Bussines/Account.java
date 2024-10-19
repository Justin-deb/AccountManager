
package Bussines;

import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class Account {
    private String name;
    private int ID;
    private String password;
    private double balance;

    public Account() {
    }

    public Account(String name, int ID, String password, double balance) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", ID=" + ID + ", password=" + password + ", balance=" + balance + '}';
    }
    
    public void saveFile(String information){

    }
    
    public ArrayList<Account> readFile(){
        return null;
    }
    
}
