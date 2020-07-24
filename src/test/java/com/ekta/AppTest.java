package com.ekta;

import org.junit.Test;

import static com.ekta.App.add;
import static com.ekta.App.hcf;
import static com.ekta.App.modulo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testMod() throws Exception {
        long result = modulo(15, 10);
        assertThat(result, is(5L));

    }

    @Test
    public void testHCF() throws Exception {
        final long result1 = hcf(10, 56);
        assertThat(result1, is(2L));
        long result2 = hcf(2, 3);
        assertEquals(1L, result2);
    }

    @Test
    public void testAdd() throws Exception {
        long result = add(13, 26);
        assertEquals(result, 39L);
    }
}
