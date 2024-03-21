package main;

import java.time.LocalDateTime;
import java.util.Date;

public class Person {
    private String name;
    private String dni;
    private String address;
    private String phone;
    private Date birthdate;

    public int calculateAge() {
        return LocalDateTime.now().getYear() - birthdate.getYear();
    }
}
