import java.util.Scanner;
public class BASAMAK {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int say1,top = 0,deg;
        System.out.println("basamak değerlerini toplayan program");
        System.out.println("lütfen sayı giriniz");
        say1 = inp.nextInt();
        while(say1>0){
            deg=say1%10;
            top+=deg;
            say1=say1/10;
        }
System.out.println("rakamların toplamı: "+top);
    }
}
