package Users;

public class Employer extends BaseUser {


    public Employer(String name) {
        super(name);
    }

    public void iD(){
        System.out.println(getId() + " Employer");

    }
}
