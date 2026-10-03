package model;

public class Member {

    private String memberID;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;

    public Member(String memberID, String fullName, String email, String phoneNumber, String address, String password) {
        this.memberID = memberID;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
