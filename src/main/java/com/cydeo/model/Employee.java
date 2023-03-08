package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @NotBlank //this annotation covare also @NotNull and @NotEmpty
    @Size(max = 12,min = 2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
   // @NotNull
    private LocalDate birthDay;

   /* @NotBlank
    @Email*/
    private String email;

    /*@NotBlank
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.[A-Z]).{4,}")*/
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
