package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(i == sideLength / 2 || j == sideLength / 2 ? "8" : " ");
            }
            System.out.println();
        }
    }
}
