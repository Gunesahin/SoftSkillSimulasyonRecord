import java.util.Scanner;
public class HelloSoftSkill {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            System.out.print("Java dersinde kaç kişiydik : ");
            int Java = reader.nextInt();
            System.out.print("Soft Skill dersinde kaç kişiyiz : ");
            int SoftSkill = reader.nextInt();

            int Ortalama = (Java + SoftSkill)/2;
            System.out.println("Derse Katilanlarin Ortalamasi = " + Ortalama);

        }

    }

