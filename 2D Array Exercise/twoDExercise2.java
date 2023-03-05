public class twoDExercise2 {
    public static void main(String[] args) {
        
        int table[][] = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79}
        };
        int colSum = 0;
        int largestResult = 0;

        for (int i = 0; i < table.length; i++) {
            int colTotal = 0;
            for (int j = 0; j < table.length; j++) {
            colTotal = colTotal + table[j][i];
            }
            System.out.println("Sum of Column "+ (i+1) + ":\t" + colTotal);
            if (colTotal > largestResult){
                largestResult = colTotal;
                colSum = i+1;
            }
        }
        System.out.println("\nThe Largest Sum is Column " +colSum+ ": "+largestResult);
    }
}