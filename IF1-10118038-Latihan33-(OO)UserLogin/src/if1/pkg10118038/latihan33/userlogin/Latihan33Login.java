/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan User Login

 */
public class Latihan33Login {
    private static String usName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User("RizkiAdam", "terbaikselalu");
        
        System.out.print("Masukkan Username = ");
        String usName = sc.next();
        System.out.print("Masukkan Password = ");
        String passWord = sc.next();
        u.pengecekkanLogin(usName, passWord);   
    }
    
}
