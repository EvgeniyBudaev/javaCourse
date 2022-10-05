package yandex.sprint8.CreateAPI.OwnerDogSerialization;

import com.google.gson.Gson;

class Practicum {
    public static void main(String[] args) {
        // создайте экземпляр класса Owner (владелец)
        Owner owner = new Owner("Evgeniy", "Budaev");

        // создайте экземпляр класса Dog (собака)
        Dog dog = new Dog("Bim", owner, 1);

        Gson gson = new Gson();
        // сериализуйте объект класса Dog в JSON
        String jsonString = gson.toJson(dog);

        System.out.println(jsonString);
    }
}



class Dog {
    private String name;

    public Dog(String name, Owner owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Owner owner;
    private int age;
}

class Owner {
    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String name;
    private String surname;
}