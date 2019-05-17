package Users;


public interface User {
    void iD();
    String getId();
    void setId(String id);
    void balance();
    void sendMoney(int amount);
    void gainMoney(int amount);
}
