package Users;

public class BaseUser implements User {
    private String id = "";
    int money = 500;

    public BaseUser(String id){
        setId(id);
    }

    public void iD(){
        System.out.println(id);

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void balance(){

        System.out.println(money + " dollars");

    }

    public void sendMoney(int amount){
        money = money - amount;
    }

    public void gainMoney(int amount){

        money = money + amount;
    }

}
