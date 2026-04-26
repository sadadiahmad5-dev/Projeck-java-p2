public class ArraySampl {
    public static void main(String[] args) {

        
        int[][] twoD = new int[512][128];

       
        char[][][] threed = new char[8][16][24];

        
        String[][] dogs = {
            {"terry", "brown"},
            {"Kristin", "white"},
            {"toby", "gray"},
            {"fido", "black"}
        };

        
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i][0] + " - " + dogs[i][1]);
        }
    }
}
