package org.example.story2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareTimer {
    private DummyData dummyData;

    public void checkByMillis() {
        long start = System.currentTimeMillis();
        dummyData = makeObjects();
        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("milli = " + elapsed);
    }

    public void checkByNanos() {
        long start = System.nanoTime();
        dummyData = makeObjects();
        long end = System.nanoTime();

        double elapsed = (end - start) / 1000000.0;

        System.out.println("nano = " + elapsed);
    }

    private DummyData makeObjects() {
        Map<String,String> map = new HashMap<>(20000000);
        List<String> list = new ArrayList<>(20000000);
        return new DummyData(map,list);
    }
}
