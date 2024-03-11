package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void nestedBracketsAreAllowed() {
        assertTrue(hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsMustFollowOpenCloseOrder() {
        assertFalse(hasBalancedBrackets("]["));
    }

}
