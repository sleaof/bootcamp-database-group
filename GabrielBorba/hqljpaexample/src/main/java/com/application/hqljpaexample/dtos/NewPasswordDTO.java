package com.application.hqljpaexample.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class NewPasswordDTO {

    @NotNull()
    Long id;
    String password;
}
