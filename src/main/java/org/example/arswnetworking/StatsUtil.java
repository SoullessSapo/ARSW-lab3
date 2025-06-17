package org.example.arswnetworking;

public class StatsUtil {

    public static double mean(MyLinkedList<Double> list) {
        double sum = 0;
        for (Double val : list) sum += val;
        return sum / list.size();
    }

    public static double stddev(MyLinkedList<Double> list) {
        double mean = mean(list);
        double sum = 0;
        for (Double val : list) sum += Math.pow(val - mean, 2);
        return Math.sqrt(sum / (list.size() - 1)); // n-1 (sample stddev)
    }
}
