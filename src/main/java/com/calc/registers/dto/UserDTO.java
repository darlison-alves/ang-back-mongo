package com.calc.registers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotEmpty
    private String name;

    @Email
    private String email;

    @NotEmpty
    private String phone;
}
