public class Pro7_Salary {
    public static void main(String[] args) {
        double Salary = 16000, med = 0.5, pf = 0.02, hra = 0.2,
                da = 0.4, ins = 0.3;
        double Gross = Salary + (Salary * hra) + (Salary *da) + (Salary * med);
        Double Ded = (Gross*pf) + (Gross*ins);
        Double Net = Gross - Ded;
        System.out.print("Salary ");
        System.out.println(Net);

        System.out.println("(25000 > ) " + ((Net>=25000)?'A':' '));
        System.out.println("(25000 - 20000) " + ((Net<25000)&&(Net>=20000)?'B':' '));
        System.out.println("(20000 - 15000) " + ((Net<20000)&&(Net>=15000)?'C':' '));
        System.out.println("(15000 - 10000) " + ((Net<15000)&&(Net>=10000)?'D':' '));
        System.out.println("(10000 - 5000) " + ((Net<10000)&&(Net>=5000)?'E':' '));
    }
}
