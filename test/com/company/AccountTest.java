package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {


    Account account1;
    Account account2;
    Account account3;
    Account account4;

    @Test
    public void checkAlias() {


        assertTrue(account1.equals(account4));
    }

    @Test
    public void matchBal() {
        account1.deposit(100);
        Double accountbal = (account1.getBalance());
        assertTrue(accountbal.equals(202.56));
    }

    @Test
    public void arithExp() {
        assertThrows(ArithmeticException.class,()-> { account1.deposit(0);});
    }

    @Test
    public void withdrawExp() {
        account2.setAudit(new AuditStub());
        account2.withdraw(10, 2);
        Double accBal = account2.getBalance();
        if(accBal != null){
            assertTrue(accBal.equals(40.00));
        }
    }


    @Test
    public void addInterest() {
        double interesttest = account3.getBalance() * 0.035;
        interesttest = account3.getBalance() + interesttest;
        Double accBalance = account3.addInterest();
        assertTrue(accBalance.equals(interesttest));
    }

    @Test
    public void toZtring() {
        String account3string = account3.toString();
        String account3stringf = "93757\tEdward Demsey\t$759.32";
        assertTrue(account3string.equals(account3stringf));
    }



    /* before each and every test itll call setup and also teardown */
    @BeforeEach
    public void setup() {
    /* initialize variables */
        account1 = new Account("Ted Murphy", 72354, 102.56);
        account2 = new Account("Jane Smith", 69713, 40.00);
        account3 = new Account("Edward Demsey", 93757, 759.32);
        account4 = account1;
    }

    @Test
    public void path1() {
        //path 1,2,3,8
        int num1 = 5;
        int num2 = 6;
        int num3 = 6;
        int min;
        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else
        if (num2 < num3)
            min = num2;
        else
            min = num3;
        assertTrue(min == (num1));
    }

    @Test
    public void path2() {
        //path 1,2,4,8
        int num1 = 5;
        int num2 = 6;
        int num3 = 4;
        int min;
        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else
        if (num2 < num3)
            min = num2;
        else
            min = num3;
        assertTrue(min == (num3));
    }

    @Test
    public void path3() {
        //path 1,5,6,8
        int num1 = 5;
        int num2 = 3;
        int num3 = 4;
        int min;
        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else
        if (num2 < num3)
            min = num2;
        else
            min = num3;
        assertTrue(min == (num2));
    }

    @Test
    public void path4() {
        //path 1,5,6,8
        int num1 = 5;
        int num2 = 4;
        int num3 = 3;
        int min;
        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else
        if (num2 < num3)
            min = num2;
        else
            min = num3;
        assertTrue(min == (num3));
    }

    @AfterEach
    public void tearDown() {

    }

}
