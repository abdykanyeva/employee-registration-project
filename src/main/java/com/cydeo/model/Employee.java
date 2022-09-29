package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {


//    @NotNull    ----> Field shouldn't be null
//    @NotEmpty   ----> Field shouldn't be ""
//    @NotBlank   ----> Field should not be blank

//    @NotNull  -> @NotNul
//    @NotEmpty -> @NotNull +@NotEmpty
//    @NotBlank --> @NotNull + @NotEmpty + @NotBlank

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
