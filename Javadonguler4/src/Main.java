import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("kombinasyon hesaplama");
        Scanner input=new Scanner(System.in);
             System.out.println("n degerini giriniz:");
        int n=input.nextInt();
        int total1=1;
        for (int i=1; i<=n; i++)
        {  total1=total1*i;}
             System.out.println("r degerini giriniz:");
        int r=input.nextInt();
        int total2=1;
        for (int j=1; j<=r; j++)
        {  total2=total2*j;}

        int total3=1;
        for (int k=1; k<=(n-r); k++)
        {  total3=total3*k;}


        int com=total1/(total2*total3);
            System.out.println("N’in r’li kombinasyonu :" +com );

    }
}
