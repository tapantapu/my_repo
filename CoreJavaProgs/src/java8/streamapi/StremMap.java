package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremMap {
	public static void main(String[] args) {

		List<User> listUser = new ArrayList<User>();

		listUser.add(new User(1, "tapan", "1000", "tapan@gmail.com"));
		listUser.add(new User(1, "kumar", "1000", "tapan@gmail.com"));
		listUser.add(new User(1, "parida", "1000", "tapan@gmail.com"));
		listUser.add(new User(1, "ram", "1000", "ram@gmail.com"));
		// step-1
		List<UserDTO> listUserDTO = new ArrayList<>();
		for (User u : listUser) {
			listUserDTO.add(new UserDTO(u.getId(), u.getUserName(), u.getEmail()));
		}
		for (UserDTO ud : listUserDTO) {
			System.out.println(ud);
		}

		// step-2
		List<UserDTO> listUserDTO1 = listUser.stream()
				.map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
				.collect(Collectors.toList());

		listUserDTO1.forEach(System.out::println);

	}

}

class UserDTO {
	private int id;
	private String userName;
	private String email;

	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

}

class User {
	private int id;
	private String userName;
	private String password;
	private String email;

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

}