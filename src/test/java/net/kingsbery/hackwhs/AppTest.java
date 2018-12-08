package net.kingsbery.hackwhs;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void today()
    {
      WhsDate date = new WhsDate(2018, 12, 8);
      assertEquals(WhsDayOfWeek.SATURDAY, date.getDayOfWeek());
    }

    @Test
    public void christmas()
    {
      WhsDate date = new WhsDate(2018, 12, 25);
      assertEquals(WhsDayOfWeek.TUESDAY, date.getDayOfWeek());
    }
}
