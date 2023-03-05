public class ArrayExercise2 {
    public static void main(String[] args) {

        int elements[] = {1,8,10,7,4,112,43,144,18,11};

        for (int i = 0; i < elements.length; i++) {
            System.out.printf("%4d ",i);
            
        }
        System.out.println("\n" + "-".repeat(50));
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("%4d|",elements[i]);           
        }
        System.out.println("\n" + "-".repeat(50));
    }
}