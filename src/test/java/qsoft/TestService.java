package qsoft;

import org.junit.Assert;
import org.junit.Test;
import qsoft.entity.BankAccount;
import qsoft.service.SignleLinkedList;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/15/13
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestService {

    private SignleLinkedList signleLinkedList;

    @Test
    public void testCreateSingleLinkedList() {
        signleLinkedList = new SignleLinkedList();
        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());
        assertEquals(0, signleLinkedList.getList().size());
    }

    @Test
    public void testCreateSingleLinkedListFromArrayObject() {
        int sizeList = 4;
        List<BankAccount> listObject = getListObject(sizeList);
        signleLinkedList = new SignleLinkedList(listObject);
        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());
        assertEquals(sizeList, signleLinkedList.getList().size());

        assertEquals(1, signleLinkedList.getList().get(0).getId());
        assertEquals("10001", signleLinkedList.getList().get(0).getNumberAccount());
    }


    private List<BankAccount> getListObject(int index) {
        List<BankAccount> list = new ArrayList<BankAccount>();
        for (int i = 1; i <= index; i++) {
            BankAccount obj = new BankAccount(i, "1000" + i);
            list.add(obj);
        }
        return list;
    }

    @Test
    public void testGetSizeList() {
        int sizeList = 10;
        List<BankAccount> listObject = getListObject(sizeList);
        signleLinkedList = new SignleLinkedList(listObject);

        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());
        assertEquals(10, signleLinkedList.getList().size());
//        assertEquals(2, signleLinkedList.getList().size());
    }

    @Test
    public void testInsertAfter() {
        int sizeList = 10;
        List<BankAccount> listObject = getListObject(sizeList);
        signleLinkedList = new SignleLinkedList(listObject);

        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());
        assertEquals(sizeList, signleLinkedList.getList().size());
        assertEquals(6, signleLinkedList.getList().get(5).getId());

        BankAccount object = new BankAccount(20, "20020");
        signleLinkedList.insertAfter(5, object);
        assertEquals(20, signleLinkedList.getList().get(5).getId());
        assertEquals(11, signleLinkedList.getList().size());
    }

    @Test
    public void testDeleteIndex() {
        int sizeList = 10;
        List<BankAccount> listObject = getListObject(sizeList);
        signleLinkedList = new SignleLinkedList(listObject);

        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());
        assertEquals(sizeList, signleLinkedList.getList().size());
        assertEquals(6, signleLinkedList.getList().get(5).getId());
        assertEquals(7, signleLinkedList.getList().get(6).getId());

        signleLinkedList.deleteAt(5);
        assertEquals(7, signleLinkedList.getList().get(5).getId());
        assertEquals(8, signleLinkedList.getList().get(6).getId());
    }
    @Test
    public void testFirst() {
        int sizeList = 10;
        List<BankAccount> listObject = getListObject(sizeList);
        signleLinkedList = new SignleLinkedList(listObject);

        Assert.assertNotNull(signleLinkedList);
        Assert.assertNotNull(signleLinkedList.getList());

        Assert.assertNotNull(signleLinkedList.first());
        assertEquals(1, signleLinkedList.first().getId());
        assertEquals("10001", signleLinkedList.first().getNumberAccount());

    }
}
