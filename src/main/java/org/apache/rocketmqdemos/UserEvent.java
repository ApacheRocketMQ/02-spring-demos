package org.apache.rocketmqdemos;

public class UserEvent {
    private String userName;
    private Byte userAge;

    public String getUserName() {
        return userName;
    }

    public UserEvent setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Byte getUserAge() {
        return userAge;
    }

    public UserEvent setUserAge(Byte userAge) {
        this.userAge = userAge;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
