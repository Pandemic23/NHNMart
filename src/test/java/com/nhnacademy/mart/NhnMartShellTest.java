package  com.nhnacademy.mart;

import com.nhnacademy.mart.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhnMartShellTest {

    private NhnMart mart;

    @BeforeEach
    void setUp() {
        mart = new NhnMart();
        mart.prepareMart();
    }

    @Test
    void testMartInitialization() {
        assertNotNull(mart.getFoodStand(), "진열대가 비었습니다.");

    }

    @Test
    void testShoppingProcess() {
        // Create a BuyList with sample items
        BuyList buyList = new BuyList();
        buyList.add(new String[] {"양파", "2"});
        buyList.add(new String[] {"대파", "5"});

        // Create a Customer and simulate the shopping process
        Customer customer = new Customer(buyList);
        Basket basket = new Basket();
        customer.bring(basket);
        customer.payTox(mart.getCounter());


    }
}
