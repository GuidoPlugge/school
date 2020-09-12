package HvA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] vak = {"Fasten your Seatbelts", "Programming", "Databases", "Personal Skills", "Project Skills", "Infrastructure", "Embedded Systems"};
//studiepunten
        int[] studiepunten;
        studiepunten = new int[7];
        studiepunten[0] = 12;
        studiepunten[1] = 3;
        studiepunten[2] = 3;
        studiepunten[3] = 2;
        studiepunten[4] = 2;
        studiepunten[5] = 3;
        studiepunten[6] = 3;

        System.out.println("Voer behaalde cijfers in: ");
        Scanner input = new Scanner(System.in);



            for (String i : vak) {
                System.out.println(i + ": ");
                String outs = input.next();
                System.out.println("\t");

              // System.out.println("Vak/project: " + vak[0] + " Cijfer: " + outs + " Behaalde punten: " + studiepunten[0]);
           }




        //    System.out.println("Vak/project: " + vak[0] + " Cijfer: " + in + " Behaalde punten: " + studiepunten[0]);
    //   Vak/project: vak[] Cijfer: outs Behaalde punten: studiepunten[]



    }
}
