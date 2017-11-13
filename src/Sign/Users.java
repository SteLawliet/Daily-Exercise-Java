package Sign;

import java.util.Objects;

/**
 * Created by Stelawliet on 17/9/23.
 */
public class Users {
    private int uId;
    private String uName;
    private String uPassword;
    private String Info;

    public Users(){

    }

    public Users(String uName, String uPassword) {
        this.uName = uName;
        this.uPassword = uPassword;
    }

    public Users(int uId, String uName, String uPassword, String info) {

        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        Info = info;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return uId == users.uId &&
                Objects.equals(uName, users.uName) &&
                Objects.equals(uPassword, users.uPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uId, uName, uPassword);
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", Info='" + Info + '\'' +
                '}';
    }


}
