package chap13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chap07.Product;

public class ProductTest {

    @Test
    public void testConstructorAndGetters() {
        Product p = new Product("りんご", 150, 10);

        assertEquals("りんご", p.getName());
        assertEquals(150, p.getPrice());
        assertEquals(10, p.getStock());
    }

    @Test
    public void testSetPriceValid() {
        Product p = new Product("りんご", 150, 10);
        p.setPrice(200);

        assertEquals(200, p.getPrice());
    }

    @Test
    public void testSellDecreasesStock() {
        Product p = new Product("りんご", 150, 10);
        p.sell();

        assertEquals(9, p.getStock());
    }

    @Test
    public void testSetPriceNegative() {
        Product p = new Product("りんご", 150, 10);
        p.setPrice(-100);

        assertEquals(150, p.getPrice());
    }

    @Test
    public void testConstructorNegativeStock() {
        Product p = new Product("りんご", 150, -5);

        assertEquals(0, p.getStock());
    }

    @Test
    public void testSetPriceZero() {
        Product p = new Product("りんご", 150, 10);
        p.setPrice(0);

        assertEquals(0, p.getPrice());
    }

    @Test
    public void testSellBoundaryStock() {
        Product p = new Product("りんご", 150, 1);

        p.sell(); // 1 -> 0（売れる境界）
        assertEquals(0, p.getStock());

        p.sell(); // 0 -> 0（在庫切れの境界）
        assertEquals(0, p.getStock());
    }
}
