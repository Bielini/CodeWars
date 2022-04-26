package longest_slide_down;

public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {

        int sum = 0;
        int j = 0;
        for (int i = 0; i < pyramid.length; i++) {
            if(i==0){
                System.out.println(pyramid[i][j]);
            }
        }
        return 0;
    }
}