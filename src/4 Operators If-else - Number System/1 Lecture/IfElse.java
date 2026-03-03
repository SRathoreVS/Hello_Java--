public class IfElse {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Manya";

        if(isMale){
            System.out.println("Mr. "+ name);
        }else {
            System.out.println("Ms. "+ name);
        }

        boolean isSenior = false;
        boolean isAdult = false;

        if(isSenior){
            System.out.println("Hello Senior citizen");
        } else if (isAdult) {
            System.out.println("You are an Adult not senior");
        } else {
            System.out.println("you are neither senior or adult , but a child");
        }
    }
}