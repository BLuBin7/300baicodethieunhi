package J1LP0022;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:39 PM
 * Description :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ExperienceCandidate extends Candidate {
    private int expInYears;
    private String proSkill;

}
