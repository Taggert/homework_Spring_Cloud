package com.accountservice.production.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserWeb {


    private String firstname;

    private String lastname;

    private String username;
}
