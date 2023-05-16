package com.csaba79coder.kevinspringdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserNewRegistrationDto {

    private String email;
    private String username;
    private String password;
    private String repeatedPassword;
}
