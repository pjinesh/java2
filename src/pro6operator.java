public class pro6operator {
    public static void main(String[] args) {
        double Phy = 90 , Chem = 0 , Mat = 85;
        double Ave, Total;

        Total = Phy + Chem + Mat;
        Ave = Total / 3;
        double a=80, b=60, c=45, d=35;
        Boolean P = (Ave >= a), Q = ((Ave < a) && (Ave>=b)), R = ((Ave < b) && (Ave>=c)),
                S = ((Ave < c) && (Ave>=d)), T = (Ave < d);

        System.out.println("+----------------------------+");
        System.out.println("|       Name:   \"Jinesh\"     |");
        System.out.println("|        Age:   \"25\"         |");
        System.out.println("|       City:   \"Surat\"      |");
        System.out.println("|    Country:   \"India\"      |");
        System.out.println("|    Physics:   "+Phy+"         |");
        System.out.println("|  Chemistry:   "+Chem+"         |");
        System.out.println("|      Maths:   "+Mat+"         |");
        System.out.println("|      Total:   "+Total+"        |");
        System.out.println("|    Average:   "+Ave+"         |");
//        System.out.println("|      Grade:   "+Gr+"            |");
        System.out.println("+----------------------------+");

        System.out.println("(100 - 80)"+" - "+ P);
        System.out.println(P? "Grade A" :'-');
        System.out.println("( 80 - 60)"+" - "+ Q);
        System.out.println(Q? "Grade B" :'-');
        System.out.println("( 60 - 45)"+" - "+ R);
        System.out.println(R? "Grade C" :'-');
        System.out.println("( 45 - 35)"+" - "+ S);
        System.out.println(S? "Grade D" :'-');
        System.out.println("( 35 -  0)"+" - "+ T);
        System.out.println(T? "Grade E" :'-');





    }
}
