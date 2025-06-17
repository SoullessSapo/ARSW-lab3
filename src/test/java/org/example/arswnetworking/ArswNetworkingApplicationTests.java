package org.example.arswnetworking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
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
    @Test
    void testMeanAndStdDevFromCsv() throws Exception {
        MyLinkedList<Double> col1 = new MyLinkedList<>();
        MyLinkedList<Double> col2 = new MyLinkedList<>();

        // Leer archivo desde resources
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("datos_tabla.csv"))
                ))) {
            String line = br.readLine(); // Saltar encabezado
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                col1.add(Double.parseDouble(values[0]));
                col2.add(Double.parseDouble(values[1]));
            }
        }

        // Comprobar resultados esperados
        assertEquals(550.6, StatsUtil.mean(col1), 0.01);
        assertEquals(572.03, StatsUtil.stddev(col1), 0.01);

        assertEquals(60.32, StatsUtil.mean(col2), 0.01);
        assertEquals(62.26, StatsUtil.stddev(col2), 0.01);
    }
}
