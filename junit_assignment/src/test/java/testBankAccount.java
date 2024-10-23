import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.*;

public class testBankAccount {
    @Test
    public void testDeposit() {
        BankAccount account=new BankAccount(2000.0);
        assertEquals("1500.0 is successfully credited and your current balance is 3500.0", account.deposit(1500.0));
    }

    @Test
    public void testWithdrawException(){
        BankAccount account =new BankAccount(2000);
        assertThrows(InsufficientFundsException.class, ()->{account.withdraw(2500);});
    }

    @Test
    public void testWithdraw() throws InsufficientFundsException{
        BankAccount account =new BankAccount(2000);
        assertEquals("1500.0 is successfully debited and your current balance is 500.0", account.withdraw(1500));
    }
}
