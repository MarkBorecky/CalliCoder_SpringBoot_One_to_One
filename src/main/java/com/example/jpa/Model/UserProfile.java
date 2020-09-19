package com.example.jpa.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number")
    @Size(max = 15)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dateOfBirth;

    @Size(max = 100)
    private String address1;

    @Size(max = 100)
    private String address2;

    @Size(max = 100)
    private String street;

    @Size(max = 100)
    private String city;

    @Size(max = 100)
    private String state;

    @Size(max = 100)
    private String country;

    @Column(name = "zip_code")
    @Size(max = 32)
    private String zipCode;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    private UserProfile() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static class Builder {
        static Calendar calendar = Calendar.getInstance();
        private String phoneNumber;
        private Gender gender;
        private Date dateOfBirth;
        private String address1;
        private String address2;
        private String street;
        private String city;
        private String state;
        private String country;
        private String zipCode;

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }
        public Builder setDateOfBirth(String strDateOfBirth) {
            String[] split = strDateOfBirth.split("-");
            calendar.set(
                    Integer.valueOf(split[0]),
                    Integer.valueOf(split[1]),
                    Integer.valueOf(split[2])
            );
            this.dateOfBirth = calendar.getTime();
            return this;
        }
        public Builder setAddress1(String address1) {
            this.address1 = address1;
            return this;
        }
        public Builder setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }
        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setState(String state) {
            this.state = state;
            return this;
        }
        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }
        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public UserProfile build() {
            UserProfile up = new UserProfile();
            phoneNumber = this.phoneNumber;
            gender = this.gender;
            dateOfBirth = this.dateOfBirth;
            address1 = this.address1;
            address2 = this.address2;
            street = this.street;
            city = this.city;
            state = this.state;
            country = this.country;
            zipCode = this.zipCode;
            return up;
        }

    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", user=" + user +
                '}';
    }
}


