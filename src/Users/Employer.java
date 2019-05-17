package Users;

public class Employer extends BaseUser {


    public Employer(String id) {
        super(id);
    }

    public void iD(){
        System.out.println(getId() + " Employer");

    }
}
