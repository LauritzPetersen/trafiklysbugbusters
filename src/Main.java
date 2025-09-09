import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lys = new Scanner(System.in);

        //velkomst/introduktion af program
        System.out.println("Indtast følgende værdier og udregn trafiklysets farve og om kørsel er tilladt");
        System.out.println("-----------------------------------------------------------------------------" + "\n");


        // variabel for tidspunkt på dagen
        String time = ""; // variabel gemmes udenfor loopet så den er tilgængelig for resten ad programmet
        boolean timeofday = false;
        while (!timeofday) { // så længe timeofday er !timeofday(sand) kører loopet
            System.out.println("indtast dag, aften eller nat.");
            time = lys.nextLine().toLowerCase();
            if (time.equals("aften") || time.equals("nat") || time.equals("dag")) {
                System.out.println("Du indtastede " + time + "\n");

                /* hvis variablen "time" er lig de ovenstående værdier i vores "if" ændres timeofday til
                "true" hvilket betyder at !timeofday nu er "false" og loopet slutter */
                timeofday = true;
            }
            else {
                System.out.println("prøv igen" + "\n");
            }
        }

        //variabel for mængde af trafik
        String traf = ""; // variabel gemmes udenfor loopet så den er tilgængelig for resten ad programmet
        boolean traffic = false;
        while (!traffic) {// så længe traffic er !traffic(sand) kører loopet
            System.out.println("Er der meget eller lidt trafik");
            traf = lys.nextLine().toLowerCase();
            if (traf.equals("meget") || traf.equals("lidt")) {
                System.out.println("Du indtastede " + traf + "\n");

                /* hvis variablen "traf" er lig de ovenstående værdier i vores "if" ændres traffic til
                "true" hvilket betyder at !traffic nu er "false" og loopet slutter */
                traffic = true;
            }
            else {
                System.out.println("prøv igen" + "\n");
            }
        }


        //variabel for område
        String area = ""; // variabel gemmes udenfor loopet så den er tilgængelig for resten ad programmet
        boolean areas = false;
        while (!areas) { // så længe areas er !areas(sand) kører loopet
            System.out.println("indtast områdetype, bolig, erhverv eller blandet.");
            area = lys.nextLine().toLowerCase();
            if (area.equals("bolig") || area.equals("erhverv") || area.equals("blandet")) {
                System.out.println("Du indtastede " + area + "\n");

                /* hvis variablen "area" er lig de ovenstående værdier i vores "if" ændres areas til
                "true" hvilket betyder at !areas nu er "false" og loopet slutter */
                areas = true;
            }
            else {
                System.out.println("prøv igen" + "\n");
            }
        }

        //variabel for nødsituation
        String emer = ""; // variabel gemmes udenfor loopet så den er tilgængelig for resten ad programmet
        boolean emergency = false;
        while (!emergency) {// så længe emergency er !emergency(sand) kører loopet
            System.out.println("Er det en nødsituation ja/nej");
            emer = lys.nextLine().toLowerCase();
            if (emer.equals("ja") || emer.equals("nej")) {
                System.out.println("Du indtastede " + emer + "\n");

                /* hvis variablen "emer" er lig de ovenstående værdier i vores "if" ændres emergency til
                "true" hvilket betyder at !emergency nu er "false" og loopet slutter */
                emergency = true;
            }
            else {
                System.out.println("prøv igen" + "\n");
            }
        }

        //betingelser for trafiklys

        //betingelse for grønt lys
        if ((time.equals("dag") && traf.equals("lidt")) || emer.equals("ja")) {
            System.out.println("Lyset er grønt");
            System.out.println("---------------" + "\n");
        }
        // betingelse for gult lys
        else if (time.equals("aften") || (time.equals("nat") && traf.equals("lidt"))) {
            System.out.println("Lyset er gult");
            System.out.println("---------------" + "\n");
        }
        //betingelse for rødt lys
        else if ((time.equals("nat") && traf.equals("meget")) || (area.equals("bolig") && traf.equals("meget"))) {
            System.out.println("Lyset er rødt");
            System.out.println("---------------" + "\n");
        }
        // hvis ingen af de ovenstående betingelser er opfyldt
        else {
            System.out.println("Trafiklyset er gået i stykker.");
            System.out.println("---------------" + "\n");
        }

        //betingelser for adgang

        // betinglser for tilladt adgang
        if (area.equals("erhverv") || (area.equals("blandet") && traf.equals("lidt"))) {
            System.out.println("Adgang tilladt");
            System.out.println("---------------");
        }
        // hvis tilladt adgang betingelsen ikke er opfyldt er adgang nægtet
        else{
            System.out.println("Adgang forbudt");
            System.out.println("---------------");
        }
    }
}
