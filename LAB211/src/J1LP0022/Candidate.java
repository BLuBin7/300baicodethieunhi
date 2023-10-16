package J1LP0022;

/**
 * Created by Binh
 * Date : 8/11/2023 - 11:30 PM
 * Description :
 */

public class Candidate {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Birthday;
    private String Address;
    private String Phone;
    private String Email;
    private int candidateType;

    public Candidate() {
    }

    public Candidate(String id, String firstName, String lastName, String birthday, String address, String phone, String email, int candidateType) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Birthday = birthday;
        Address = address;
        Phone = phone;
        Email = email;
        this.candidateType = candidateType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }
}
