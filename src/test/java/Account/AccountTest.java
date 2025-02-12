package Account;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @BeforeClass
    public static void init(){
        System.out.println("Hilda Hermunen");
    }

    @Test
    public void testGetBalance(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit(){
       Account account = new Account();
       account.deposit(100);
       assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        Account account = new Account();
        account.deposit(100);
        account.withdraw(20);
        assertEquals(80, account.getBalance());
        account.withdraw(100);
        assertEquals(80, account.getBalance());
    }

}