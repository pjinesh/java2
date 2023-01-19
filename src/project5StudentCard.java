public class project5StudentCard {

    public static void main(String[] args) {
        double Phy = 90 , Chem = 80 , Mat = 85;
        double Ave, Total;
        char Grade = 'A';
        Ave = (Phy + Chem + Mat) / 3;
        Total = Phy + Chem + Mat;

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
        System.out.println("|      Grade:   "+Grade+"            |");
        System.out.println("+----------------------------+");


    }
}
