package huawei.poc.micro.provider.domain;


import lombok.Data;

/**
 * Created by albert on 2016/12/20.
 */
@Data
public class User {
    private long userId;
    private String userName;
    private String password;
    private String mobile;
    private String address;

    public User() {
    }
    public User(long userId){
        this(userId, "albert", "pwd", "13322222222", "张江高科");
    }
    public User(long userId, String userName, String password, String mobile, String address) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }

}
