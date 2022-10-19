
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class cerminxy {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");

        System.out.println(" *Masukkan Nilai X ");
        System.out.println(" ********************************* ");

        double x = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai Y ");
        System.out.println(" ******************************* ");

        double y = sc.nextInt();


        double x1 =  - x;
        double y1 =  - y;

        System.out.println(" ************************************************* ");
        System.out.println(" *Maka Hasil Pencerminan A'(X'Y')***************** ");
        System.out.println(" *Maka A("+x+","+y+") Pada Sumbu X *************** ");
        System.out.println(" *Nilai X' = " + x1);
        System.out.println(" *Nilai Y' = " + y);
        System.out.println(" *Maka A("+x+","+y+") Pada Sumbu Y *************** ");
        System.out.println(" *Nilai X' = " + x);
        System.out.println(" *Nilai Y' = " + y1);
        System.out.println(" ************************************************* ");
    }
}
