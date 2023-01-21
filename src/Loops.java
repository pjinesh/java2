public class Loops {
    public static void main(String[] args) {
        int a = 0;
        while(a > 0){
            System.out.println(a--);
        }
        a = 10;
        while(true){
            System.out.println(a--);
            if(a == 0){
                break;
            }
        }
        char start = 'y';
        a = 10;
        while(start == 'y'){
            a--;
            System.out.print("Do you want to continue? y or n : ");
            if(a==0){
                start = 'n';
                System.out.println(start);
            }else{
                System.out.println(start);
            }
        }
        a = 11;
        do{
            System.out.println(a--);
        }while (a < 10);

        int i = 0;
//        for (; i < 5; ) {
//            System.out.println(i++);
//        }
        for (i = 1; i <= 5;i++) {
            System.out.println(i);
        }

        for (i = 5; i >= 1;i--) {
            System.out.println(i);
        }

        for (int j = 0; j < 5 ; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
