package Oop.Methodoverloading;

public class Bank {
    double getRateOfInterest(int a){
        return 7 ;
    }
}
class SBI extends Bank{
    double getRateOfInterest() {
        return 8 ;
    }
}
class ICICI extends Bank{
    double getRateOfInterest(){
        return 9 ;
    }
}
class BankImpl{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getRateOfInterest();
        ICICI icici = new ICICI();
        icici.getRateOfInterest();
        System.out.println("Rate of interest for SBI : "+sbi.getRateOfInterest());
        System.out.println("Rate of interest for ICICI : "+icici.getRateOfInterest());
    }
}