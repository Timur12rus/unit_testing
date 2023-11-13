package javarushlesson;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAllUsersTest() {
        // создаем тестовые данные
        User user = new User("≈вгений", 35, Sex.MALE);
        User user1 = new User("ћарина", 34, Sex.FEMALE);
        User user2 = new User("јлинна", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers();

        // создаем список actual в него помещаем данные дл€ сравнени€
        // то что мы предполагаем метод должен вернуть
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
//        actual.add(user2);

        // запускаем тест, в случае если список expected и actual не будут равны
        // тест будет провален, о результатах теста читаем в консоли
        assertEquals(expected, actual);
    }

    @Test
    void getAllUsersTest_NO_NULL() {
        // добавим проверку на NULL
        List<User> expected = User.getAllUsers();
        assertNotNull(expected);
    }
}