//Driver Class
import java.util.Scanner;
public class TesSiswa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
       
        Siswa jordy = new Siswa(id, nama, ipk);
        //Nilai diatas 75 lulus


        if (jordy.getIpk() >= 75) {
            System.out.println(jordy.getNama() + " Lulus");
        }
        else{ 
            System.out.println(jordy.getNama() + " Tidak Lulus");
        }

        //Nilai Huruf
        if (jordy.getIpk() < 60) {
            System.out.println("E");
        }
        else if (jordy.getIpk()> 60 && jordy.getIpk() <=70) {
            System.out.println("D");
        }
        else if (jordy.getIpk()> 70 && jordy.getIpk() <=80) {
            System.out.println("C");
        }
        else if (jordy.getIpk()> 80 && jordy.getIpk() <=90) {
            System.out.println("B");
        }
        else if (jordy.getIpk()> 90 && jordy.getIpk() <=100) {
            System.out.println("A");
        }

        



        in.close();
    }
    
}