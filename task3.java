package hw1;
// напечатать строку source repeat раз
public class task3 {
    private static void printString(String source, int repeat) {
        for (int i=0; i<repeat; i++) {
            System.out.println(source);
        }
    }
    public static void main(String[] args) {
    printString("Hi", 4);    
    }
}
