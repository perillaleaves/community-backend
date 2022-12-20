package perillaleaves.community.request;

public class UserFindLoginIdRequest {

    private String name;
    private String phone_number;

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public UserFindLoginIdRequest(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }
}
