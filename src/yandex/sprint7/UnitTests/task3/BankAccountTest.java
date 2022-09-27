//package yandex.sprint7.UnitTests.task3;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class BankAccountTest {
//
//    @Test
//    public void shouldNotBeBlockedWhenCreated() {
//        BankAccount account = new BankAccount("a", "b");
//        assertFalse(account.isBlocked());
//    }
//
//    @Test
//    public void shouldReturnZeroAmountAfterActivation() {
//        BankAccount account = new BankAccount("a", "b");
//        account.activate("RUB");
//        assertEquals(0, account.getAmount());
//        assertEquals("RUB", account.getCurrency());
//    }
//
//    @Test
//    public void shouldBeBlockedAfterBlockIsCalled() {
//        BankAccount account = new BankAccount("a", "b");
//        account.block();
//        assertTrue(account.isBlocked());
//    }
//
//    @Test
//    public void shouldReturnFirstNameThenSecondName() {
//        BankAccount account = new BankAccount("testFirstName", "testLastName");
//        assertArrayEquals(new String[] {"testFirstName", "testLastName"}, account.getFullName());
//    }
//
//    @Test
//    public void shouldReturnNullAmountWhenNotActive() {
//        BankAccount account = new BankAccount("a", "b");
//        final IllegalStateException exception = assertThrows(IllegalStateException.class,
//                new Executable() {
//                    @Override
//                    public void execute() {
//                        account.getAmount();
//                    }
//                });
//        assertNull(account.getCurrency(), exception.getMessage());
//    }
//}