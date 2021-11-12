import java.util.Scanner;

public class Evoting {
    public static void main(String[] args) {
        String calon[] = new String[100];
        String suara;

        int n, tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, i = 1, j = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("======================================================" + "\n");
        System.out.println("              Program Pemilihan Ketua Umum             ");
        System.out.print("======================================================" + "\n");

        System.out.println("Masukkan Nama Calon Ketua Umum :");
        for (i = 1; i <= 3; i++) {
            System.out.print(i + ".");
            calon[i] = input.next();
        }
        System.out.print("\n");

        System.out.println("Daftar Nama Calon Ketua Umum :");
        for (i = 1; i <= 3; i++) {
            System.out.println(i + "." + calon[i]);
        }
        System.out.print("\n");

        System.out.print("Masukkan Jumlah Mahasiswa = ");
        n = input.nextInt();

        System.out.println("Masukkan Nomor Suara : ");
        do {
            System.out.print("Ke-" + j + " = ");
            suara = input.next();
            if (suara.equals("1")) {
                tot1 = tot1 + 1;
            } else if (suara.equals("2")) {
                tot2 = tot2 + 1;
            } else if (suara.equals("3")) {
                tot3 = tot3 + 1;
            } else {
                tot4 = tot4 + 1;
            }
            j++;
        } while (j <= n);
        System.out.print("\n");

        System.out.print("======================================================" + "\n");
        if ((tot1 > tot2) && (tot1 > tot3) && (tot1 > tot4)) {
            System.out.print(calon[1] + " terpilih menjadi ketua umum!");
        } else if  ((tot2 > tot1) && (tot2 > tot3) && (tot2 > tot4)) {
            System.out.print(calon[2] + " terpilih menjadi ketua umum!");
        } else if ((tot3 > tot1) && (tot3 > tot2) && (tot3 > tot4)) {
            System.out.print(calon[3] + " terpilih menjadi ketua umum!");
        } else if ((tot4 > tot1) && (tot1 > tot2) && (tot1 > tot3)) {
            System.out.print(calon[1] + " terpilih menjadi ketua umum!");
        } else if ((tot4 > tot2) && (tot2 > tot1) && (tot2 > tot3)) {
            System.out.print(calon[2] + " terpilih menjadi ketua umum!");
        } else if ((tot4 > tot3) && (tot3 > tot1) && (tot3 > tot2)) {
            System.out.print(calon[3] + " terpilih menjadi ketua umum!");
        } else if ((tot4 > tot1) && (tot1 == tot2) && (tot1 > tot3)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[2]);
        } else if ((tot4 > tot2) && (tot2 == tot3) && (tot2 > tot1)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[2] + " sama dengan total suara " + calon[3]);
        } else if ((tot4 > tot3) && (tot3 == tot1) && (tot3 > tot2)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[3]);
        } else if ((tot4 > tot1) && (tot1 == tot2) && (tot1 == tot3)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[2] + " dan " + calon[3]);
        } else if ((tot1 == tot2) && (tot1 > tot3) && (tot1 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[2]);
        } else if ((tot2 == tot3) && (tot2 > tot1) && (tot2 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[2] + " sama dengan total suara " + calon[3]);
        } else if ((tot1 == tot3) && (tot1 > tot2) && (tot1 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[3]);
        } else if ((tot1 == tot2) && (tot1 == tot3) && (tot1 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[2] + " dan " + calon[3]);
        } else if ((tot2 == tot3) && (tot2 == tot1) && (tot2 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[2] + " sama dengan total suara " + calon[3] + " dan " + calon[1]);
        } else if ((tot1 == tot3) && (tot1 == tot2) && (tot1 > tot4)) {
            System.out.print("Lakukan voting kembali!\nKarena total suara " + calon[1] + " sama dengan total suara " + calon[3] + " dan " + calon[2]);
        }
        
        System.out.println("\n======================================================");
        System.out.println("\nDetail : ");
        System.out.println("1." + calon[1] + "\t\t dengan total suara = " + tot1);
        System.out.println("2." + calon[2] + "\t\t dengan total suara = " + tot2);
        System.out.println("3." + calon[3] + "\t\t dengan total suara = " + tot3);
        System.out.println("4.Golput\t dengan total suara = " + tot4);
        System.out.println("\n------------------------------------------------------" + "\n");
        input.close();
    }
}