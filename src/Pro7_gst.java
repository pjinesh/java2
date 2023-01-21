public class Pro7_gst {
    public static void main(String[] args) {
        double p1 = 100, q1 = 3, g1 = 0.05;
        double p2 = 200, q2 = 2, g2 = 0.18;
        double p3 = 156, q3 = 6, g3 = 0.1;

        double total1 = (p1+q1)+(p1*q1)*g1;
        double total2 = (p2+q2)+(p2*q2)*g2;
        double total3 = (p3+q3)+(p3*q3)*g3;

        double subtotal = total1 + total2 + total3;
        double Total = subtotal + (subtotal * 0.18);

        System.out.println("+-----------Bill-----------+");
        System.out.println("Item#" +"     Cost"+"      Quant"+"   GST"+ "   total" );
        System.out.println("Item 1 | Rs. " + p1 + "   "+q1+"   "+g1+"   "+total1);
        System.out.println("Item 2 | Rs. " + p2 + "   "+q2+"   "+g2+"   "+total2);
        System.out.println("Item 3 | Rs. " + p3 + "   "+q3+"   "+g3+"    "+total3);
        System.out.println("     " +"         "+"           "+"      "+ "-------------------" );
        System.out.println("     " +"         "+"           "+"Subtotal "+ subtotal );
        System.out.println("     " +"         "+"           "+"     gst "+ "  0.18" );
        System.out.println("     " +"         "+"           "+"      "+ "-------------------" );
        System.out.println("     " +"         "+"           "+"   Total "+ Total );




    }
}
