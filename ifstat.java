public class ifstat {
    public static void main(String[] args) {
        // boolean isMale = false;   
        // boolean isTall = true;
        
        // if (isMale && isTall) {
        //     System.out.println("You are a male and you're tall");
        // } else {
        //     System.out.println("You are either not male or not tall or both");
        // }

        System.out.println(max(33, 9, 15)); 
    }

    public static int max(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }

        
    }
}
