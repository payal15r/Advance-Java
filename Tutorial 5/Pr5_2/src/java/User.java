import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
@ManagedBean  
@RequestScoped  
public class User {  
String name;  
Integer age;  
public String getName() {  
return name;  
}  
public void setName(String name) {  
this.name = name;  
}  
public Integer getAge() {  
return age;  
}  
public void setAge(Integer age) {  
this.age = age;  
}  
}