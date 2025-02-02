package user;

public class Login {
    public int logg(String username, String password) {
        if (username.equals("admin") && password.equals("password01")) {
            return 1; // 管理员
        } else if (username.equals("visitor") && password.equals("password02")) {
            return 2; // 读者
        } else {
            return 0; // 登录失败
        }
    }
}