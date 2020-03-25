package com.ekta;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    @Test
    public void fifteenAndTenMod() throws Exception {
        final long result = new App().modulo(15, 10);
        assertThat(result, is(5L));
    }

    @Test
    public void fiftySixAndTenHCF() throws Exception {
        final long result = new App().hcf(10, 56);
        assertThat(result, is(2L));
    }
}
