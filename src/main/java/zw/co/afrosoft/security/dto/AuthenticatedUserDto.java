package zw.co.afrosoft.security.dto;

import zw.co.afrosoft.model.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class AuthenticatedUserDto {

	private String firstName;

	private String username;

	private String password;

	private UserRole userRole;

}
