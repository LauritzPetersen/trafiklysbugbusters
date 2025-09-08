import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lys = new Scanner(System.in);

        // variabel for tidspunkt for dagen
        String time = "";
        boolean timeofday = false;
        while (!timeofday) {
            System.out.println("indtast dag, aften eller nat.");
            time = lys.nextLine().toLowerCase();
            if (time.equals("aften") || time.equals("nat") || time.equals("dag")) {
                System.out.println("Du indtastede " + time + "\n");
                timeofday = true;
            } else {
                System.out.println("prøv igen" + "\n");
            }
        }

        //variabel for mængde af trafik
        String traf = "";
        boolean traffic = false;
        while (!traffic) {
            System.out.println("Er der meget eller lidt trafik");
            traf = lys.nextLine().toLowerCase();
            if (traf.equals("meget") || traf.equals("lidt")) {
                System.out.println("Du indtastede " + traf + "\n");
                traffic = true;
            } else {
                System.out.println("prøv igen" + "\n");
            }
        }


        // variabel for område
        String area = "";
        boolean areas = false;
        while (!areas) {
            System.out.println("indtast områdetype, bolig, erhverv eller blandet.");
            area = lys.nextLine().toLowerCase();
            if (area.equals("bolig") || area.equals("erhverv") || area.equals("blandet")) {
                System.out.println("Du indtastede " + area + "\n");
                areas = true;
            } else {
                System.out.println("prøv igen" + "\n");
            }
        }

        //variabel for nødsituation
        String emer = "";
        boolean emergency = false;
        while (!emergency) {
            System.out.println("Er det en nødsituation ja/nej");
            emer = lys.nextLine().toLowerCase();
            if (emer.equals("ja") || emer.equals("nej")) {
                System.out.println("Du indtastede " + emer + "\n");
                emergency = true;
            } else {
                System.out.println("prøv igen" + "\n");
            }
        }

    }
}