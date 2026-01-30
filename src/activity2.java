public class activity2 {

    public static void main(String[] args) {


        double kilograms = 70;
        double pounds = kilograms * 2.20462;
        System.out.println(kilograms + " kg = " + pounds + " pounds");


        double pints = 5;
        double litres = pints * 0.568261;
        System.out.println(pints + " pints = " + litres + " litres");


        int centuries = 1;
        int years = centuries * 100;
        int days = years * 365; // ignoring leap years for simplicity
        int hours = days * 24;
        System.out.println(centuries + " century = " + hours + " hours");


        double centimetres = 170;
        double totalInches = centimetres / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(centimetres + " cm = " + feet + " feet " + inches + " inches");
    }
}
