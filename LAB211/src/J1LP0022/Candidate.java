package J1LP0022;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:30 PM
 * Description :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candidate {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Birthday;
    private String Address;
    private String Phone;
    private String Email;
    private int candidateType;
}
