public class FuncMethods {
    public static void main(String[] args) {
        greetings();
        printPattern();
    }

    public static void greetings(){
        System.out.println("Good Morning from sattuPri");
    }

    public static void printPattern(){
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int patterns = 0;
            while (patterns < rows){
                System.out.print(" *");
                patterns++;
            }
            System.out.println();
            rows++;
        }
    }
}