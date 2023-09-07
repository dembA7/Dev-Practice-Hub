public class bidimensionalArray2 {
    public static void main(String[] args) {
        int [][] matriz = {
            {10, 15, 28, 19, 21},
            {5, 25, 37, 41, 15},
            {7, 19, 32, 14, 90},
            {85, 2, 7, 40, 27}
        };

        for (int[]k:matriz){
            for (int l:k){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
