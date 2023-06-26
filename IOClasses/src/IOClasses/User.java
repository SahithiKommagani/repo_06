package IOClasses;

import java.io.Serializable;

public class User  implements  Serializable{
private String name;
private String Address;
 private transient String password; //transient variable doesnot serialize when object is serialized
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public User(String name, String address, String password) {
	this.name = name;
	Address = address;
	this.password = password;
}
public void setAddress(String address) {
	Address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [name=" + name + ", Address=" + Address + "]";
}

}
