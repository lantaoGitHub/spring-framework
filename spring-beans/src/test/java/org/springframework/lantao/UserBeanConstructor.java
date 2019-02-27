package org.springframework.lantao;

public class UserBeanConstructor {
    private String name;

    private int age;

    public UserBeanConstructor(String name, int age){
    	this.name = name;
    	this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
