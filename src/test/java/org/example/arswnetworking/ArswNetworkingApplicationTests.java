package org.example.arswnetworking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArswNetworkingApplicationTests {

    @Test
    void testMeanAndStdDev() {
        MyLinkedList<Double> list = new MyLinkedList<>();
        double[] data = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        for (double d : data) list.add(d);

        double mean = StatsUtil.mean(list);
        double std = StatsUtil.stddev(list);

        assertEquals(550.6, mean, 0.01);
        assertEquals(572.03, std, 0.01);
    }
}
