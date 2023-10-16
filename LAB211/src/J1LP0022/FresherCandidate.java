package J1LP0022;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:40 PM
 * Description :
 */

public class FresherCandidate extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public FresherCandidate(String id, String firstName, String lastName, String birthday, String address, String phone, String email, int candidateType, String graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthday, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
