public class Nomor1{
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);

        int tunjanganKesehatan;
        int jumlahAnggotaKeluarga;
        int jumlahTunjangan_per_jiwa = 100000;

        Scanner scanner = new Scanner(System.in);
 
        System.out.print(" masukkan jumlah anggota keluarga: ");   
        jumlah anggota = scanner.nextInt();
        System.out.print("besar tunjangan kesehatan: ");
        tunjanganKesehatan = scanner.nextInt();

        if (jumlahAnggotaKeluarga <= 3) {
            tunjanganKesehatan = jumlahTunjangan_per_jiwa;
        }  else if ( jumlahAnggotaKeluarga >= 3 ); {
            tunjanganKesehatan = 1 * jumlahTunjangan_per_jiwa;
        } else {
            tunjanganKesehatan = 50000;

        }

        System.out.println("Besar tunjangan kesehatan: Rp " + tunjanganKesehatan);

        }
    
    }
