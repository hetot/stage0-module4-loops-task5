package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int r = height - 1;
        int l = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(j >= l && j <= r ? "8" : " ");
            }
            System.out.println();
            if (height % 2 == 0 && (i == height / 2 - 1)) {
                continue;
            }
            if (i >= (height / 2)) {
                r++;
                l--;
            } else {
                r--;
                l++;
            }
        }
    }
}
