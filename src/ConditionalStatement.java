public class ConditionalStatement {
    public static void main(String[] args) {
        /*

        if(condition){
            trueblock
        }

        if(cond){
            true
        }else{
            false
        }

        if(cond){

        } else if (cond) {

        } else if (cond) {

        } else if (cond) {

        } else if (cond) {

        }else{

        }


        switch(choice){
            case 1:
                break;
            case 2:
                break;
            default:

        }

        */

        int a = 10, b = 20, c= 30;

        if(a > b){
            System.out.println(a);
        }

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        if(a >= b && a >= c){
            System.out.println(a);
        }else if(a <= b && b >= c){
            System.out.println(b);
        }else if(c >= b && a <= c){
            System.out.println(c);
        }else{
            System.out.println("no one");
        }

        char choice = '+';
//        if(choice == '+'){
//            System.out.println("+ selected");
//        }

        switch (choice){
            case '+':
                System.out.println("addition");
                break;
            case '-':
                System.out.println("sub");
                break;
            case '*':
                System.out.println("mul");
                break;
            case '/':
                System.out.println("div");
                break;
            default:
                System.out.println("Inavlid");
        }




    }
}
