package ru.addressbook;

public class GroupContactForm {
    private final String firstmane;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String address;

    public GroupContactForm(String firstmane, String middlename, String lastname, String nickname, String company, String address) {
        this.firstmane = firstmane;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.address = address;
    }

    public String getFirstmane() {
        return firstmane;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}
