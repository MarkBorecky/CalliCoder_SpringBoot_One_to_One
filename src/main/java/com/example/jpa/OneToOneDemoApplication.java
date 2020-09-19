package com.example.jpa;

import com.example.jpa.Model.Gender;
import com.example.jpa.Model.User;
import com.example.jpa.Model.UserProfile;
import com.example.jpa.Repository.UserProfileRepository;
import com.example.jpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneDemoApplication { //implements CommandLineRunner {

//    private UserProfileRepository userProfileRepository;
//    private UserRepository userRepository;
//
//    @Autowired
//    public OneToOneDemoApplication(UserProfileRepository userProfileRepository, UserRepository userRepository) {
//        this.userProfileRepository = userProfileRepository;
//        this.userRepository = userRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(OneToOneDemoApplication.class, args);
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        userProfileRepository.deleteAllInBatch();
//        userRepository.deleteAllInBatch();
//
//        User u = new User.Builder()
//                .setFirstName("Marek")
//                .setLastName("Borecki")
//                .setEmail("marek.borecki88@gmail.com")
//                .setPassword("password123")
//                .build();
//
//        UserProfile up = new UserProfile.Builder()
//                .setPhoneNumber("+48897234723")
//                .setGender(Gender.MALE)
//                .setDateOfBirth("1988-08-16")
//                .setAddress1("85")
//                .setCity("Lipiny")
//                .setState("LODZKIE")
//                .setCountry("Poland")
//                .setZipCode("92-701")
//                .build();
//        u.setUserProfile(up);
//        up.setUser(u);
//        userRepository.save(u);
//    }
}
