package qsoft.entity;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/15/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {

    private int id;
    private String numberAccount;

    public BankAccount() {

    }

    public BankAccount(int id, String numberAccount) {
        this.id = id;
        this.numberAccount = numberAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }
}
