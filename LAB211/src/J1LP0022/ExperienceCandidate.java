package J1LP0022;

import lombok.*;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:39 PM
 * Description :
 */
@Data
@NoArgsConstructor
public class ExperienceCandidate extends Candidate {
    private int expInYears;
    private String proSkill;

    public ExperienceCandidate(String Id, String FirstName, String LastName, String Birthday, String Address, String Phone, String Email, int candidateType, int expInYears, String proSkill) {
        super(Id, FirstName, LastName, Birthday, Address, Phone, Email, candidateType);
        this.expInYears = expInYears;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExperienceCandidate{" +
                "expInYears=" + expInYears +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
