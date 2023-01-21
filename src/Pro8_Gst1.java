public class Pro8_Gst1 {
    public static void main(String[] args) {
        double p1 = 100, q1 = 3, g1 = 0.05;
        double p2 = 200, q2 = 2, g2 = 0.18;
        double p3 = 156, q3 = 6, g3 = 0.1;
        boolean P1 = true, P2 = false, P3 = true;

        double total1=0, total2=0, total3=0;
        System.out.println("+-----------Bill-----------+");
        System.out.println("Item#" +"     Cost"+"      Quant"+"   GST"+ "   total" );
        if(P1){
            total1 = (p1*q1)+(p1*q1)*g1;
            System.out.println("Item 1 | Rs. " + p1 + "   "+q1+"   "+g1+"   "+total1);
        }
        if (P2){
            total2 = (p2*q2)+(p2*q2)*g2;
            System.out.println("Item 2 | Rs. " + p2 + "   "+q2+"   "+g2+"   "+total2);
        }
        if (P3){
            total3 = (p3*q3)+(p3*q3)*g3;
            System.out.println("Item 3 | Rs. " + p3 + "   "+q3+"   "+g3+"   "+total3);
        }

        double subtotal = total1 + total2 + total3;
        double Total = subtotal + (subtotal * 0.18);

        System.out.println("     " +"         "+"           "+"      "+ "-------------------" );
        System.out.println("     " +"         "+"          "+"Subtotal "+ subtotal );
        System.out.println("     " +"         "+"           "+"     gst "+ "  0.18" );
        System.out.println("     " +"         "+"           "+"      "+ "-------------------" );
        System.out.println("     " +"         "+"          "+"   Total "+ Total );
    }
}
