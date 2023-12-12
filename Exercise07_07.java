public class Exercise07_07 {
    public static void main(String[] args) {
        int rNum = 0;
        int[] count = new int[10];
        for (int i = 0; i < 100; i++) {
            rNum = (int) (Math.random() * 10);
            count[rNum]++;
        }

        for (int j = 0; j < count.length; j++) {
            System.out.print(count[j] + " counts of ");
            System.out.println(j);
        }


    }

}