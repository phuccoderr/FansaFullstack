package com.fansa.admin.user.request;

import com.fansa.common.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTOUpdateRequest {
    private Long id;

    @NotBlank(message = "Email cannot be null")
    @Length(max=128, message = "Email must be less than 128 characters")
    @Email(message = "invalid Email")
    private String email;

    private String password;

    @NotEmpty(message = "name cannot be empty")
    private String name;

    private Boolean enabled;

    private Set<Role> roles = new HashSet<>();
}
