package hw1;
// проверить, что х положительное
public class task2 {
    private static boolean isPositive(int x) {
        return x>0;
    }
    public static void main(String[] args) {
        boolean result = isPositive(5);
        System.out.println(result);  
    }
}
