package J1LP0022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:29 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        int choice=0;
        do{
            System.out.print("Enter candidate ID: ");
            String id = sc.nextLine();
                System.out.println("Enter the first name: ");
                String firstName = sc.nextLine();
                System.out.println("Enter the last name: ");
                String lastName = sc.nextLine();
                System.out.println("Enter the birthday: ");
                String birthday = sc.nextLine();
                System.out.println("Enter the address: ");
                String address = sc.nextLine();
                System.out.println("Enter the phone: ");
                String phone = sc.nextLine();
                System.out.println("Enter the email: ");
                String email = sc.nextLine();
                System.out.println("Enter the candidate type: ");
                int candidateType = sc.nextInt();;
                if (candidateType==1){
                    System.out.println("Enter the year experience: ");
                    int expInYears = sc.nextInt();
                    System.out.println("Enter the pro skill: ");
                    String proSkill = sc.nextLine();
                    Candidate candidate = new Candidate(id, firstName, lastName, birthday, address, phone, email, candidateType);
                    candidates.add(new ExperienceCandidate(candidate.getId(),candidate.getFirstName(), candidate.getLastName(),
                            candidate.getBirthday(), candidate.getAddress(),
                            candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType(),expInYears, proSkill));
                }



        }while (choice != 0);
        System.out.println("Enter the number of candidates: ");
        System.out.println(candidates.get(0));
    }

}
