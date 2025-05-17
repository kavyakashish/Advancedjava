package Arraylist;
public class PerformanceTest {
    public static void main(String[] args) {
        final int ITERATIONS = 10000;
        String text = "AIET";

        // Performance test for StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Performance test for StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("✅ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("✅ StringBuffer is faster than StringBuilder (which is unusual).");
        }
    }
}
