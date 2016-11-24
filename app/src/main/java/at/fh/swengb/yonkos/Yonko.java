package at.fh.swengb.yonkos;

import java.io.Serializable;

/**
 * Created by Acer on 24.11.2016.
 */

public class Yonko implements Serializable{

    private String firstName;
    private String lastName;
    private String crew;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Yonko() {
    }

    public Yonko(String firstName, String lastName, String crew, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.crew = crew;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yonko yonko = (Yonko) o;

        if (firstName != null ? !firstName.equals(yonko.firstName) : yonko.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(yonko.lastName) : yonko.lastName != null)
            return false;
        if (crew != null ? !crew.equals(yonko.crew) : yonko.crew != null) return false;
        return phoneNumber != null ? phoneNumber.equals(yonko.phoneNumber) : yonko.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (crew != null ? crew.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(firstName).append(" ")
                .append(lastName)
                .append('\n')
                .append(crew).append('\n')
                .append(phoneNumber);
        return sb.toString();
    }

}
