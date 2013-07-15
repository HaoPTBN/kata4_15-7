package qsoft.service;

import qsoft.entity.BankAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/15/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignleLinkedList {

    private List<BankAccount> list;

    public List<BankAccount> getList() {
        return list;
    }

    public void setList(List<BankAccount> list) {
        this.list = list;
    }


    public SignleLinkedList() {
        init();
    }

    public SignleLinkedList(List<BankAccount> list) {
        this.list = new ArrayList<BankAccount>(list);
    }

    private void init() {
        this.list = new ArrayList<BankAccount>();
    }

    public void insertAfter(int index, BankAccount object) {
        this.list.add(index, object);
    }

    public void deleteAt(int index) {
        this.list.remove(index);
    }

    public BankAccount first() {
        return this.list.get(0);
    }
}
