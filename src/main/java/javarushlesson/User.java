package javarushlesson;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static Map<Integer, User> allUsers = new HashMap<>();

    private static int countId = 0;

    public User(String name, int age, Sex sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    // формирует список всех пользователей
    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    // формирует список пользователей по полу
    public static List<User> getAllUsers(Sex sex) {
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.sex == sex) {
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    // возвращает кол-во пользователей в общем списке, и считает кол-во по признаку пола пользователя
    public static int getHowManyUsers() {
        return allUsers().size();
    }

    // кол-во пользователей определенного пола
    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    //
    public static int getAllAgeUsers() {
        int countAge = 0;
        for (User user : allUsers.values()) {
            countAge += user.age;
        }
        return countAge;
    }

    // считает общую сумму по возрасту пользователей, так же учитывает по признаку пола
    public static int getAllAgeUsers(Sex sex) {
        int countAge = 0;
        for (User user : allUsers().values()) {
            if (user.getSex() == sex) {
                countAge += user.age;
            }
        }
        return countAge;
    }

    // считает средний возраст общий
    public static int getAverageAgeOfAllUsers() {
        return getAllAgeUsers() / getAllAgeUsers();
    }

    // считает средний возраст общий по признаку пола
    public static int getAverageAgeOfAllUsers(Sex sex) {
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public static Map<Integer, User> allUsers() {
        return allUsers;
    }

    public static void setAllUsers(Map<Integer, User> allUsers) {
        User.allUsers = allUsers;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        User.countId = countId;
    }
}
