/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan33.userlogin;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan User Login
 */
public class User {
    private final String username;
    private final String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return this.username.equals(parUserName) && this.password.equals(parPassword);
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if(status) {
            System.out.println("\n******HALLO " + parUserName.toUpperCase() + "******\nSelamat Datang di Aplikasi ini");
        } else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
