package Users;

public class Costumer extends BaseUser {


    public Costumer(String id) {
        super(id);
    }

    public void iD(){
        System.out.println(getId()+ " Costumer");

    }
}
