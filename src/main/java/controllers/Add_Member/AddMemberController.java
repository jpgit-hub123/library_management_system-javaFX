package controllers.Add_Member;

import javafx.scene.control.Alert;
import model.Member;

public class AddMemberController {

    private static Member[] memberArray = new Member[0];

    public static Member[] getMemberArray() {
        return memberArray;
    }

    public static void setMemberArray(Member[] memberArray) {
        AddMemberController.memberArray = memberArray;
    }

    public String registerNewMember(String memberID, String fullName, String email, String phoneNumber, String address) {
        String generatedPassword = generatePasswordOfTheMember(memberID, phoneNumber);
        saveMembersOnLibrary(new Member(memberID, fullName, email, phoneNumber, address, generatedPassword));
        return generatedPassword;
    }

    private void saveMembersOnLibrary(Member member) {
        extendMemberArray(member);
    }

    private void extendMemberArray(Member member) {
        Member[] temporaryMemberArray = new Member[memberArray.length + 1];

        for (int i = 0; i < memberArray.length; i++) {
            temporaryMemberArray[i] = memberArray[i];
        }

        temporaryMemberArray[temporaryMemberArray.length-1] = member;

        memberArray = temporaryMemberArray;
    }

    public void setPopUpMessage(String password) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ALERT");
        alert.setHeaderText("Great! Your Password: " + password);
        alert.setContentText("You are successfully registered into the Library");
        alert.showAndWait();
    }


    public String generatePasswordOfTheMember(String memberId, String phoneNumber) {
        return memberId + phoneNumber;
    }
}
