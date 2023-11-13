package javarushlesson;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAllUsersTest() {
        // ������� �������� ������
        User user = new User("�������", 35, Sex.MALE);
        User user1 = new User("������", 34, Sex.FEMALE);
        User user2 = new User("������", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers();

        // ������� ������ actual � ���� �������� ������ ��� ���������
        // �� ��� �� ������������ ����� ������ �������
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
//        actual.add(user2);

        // ��������� ����, � ������ ���� ������ expected � actual �� ����� �����
        // ���� ����� ��������, � ����������� ����� ������ � �������
        assertEquals(expected, actual);
    }

    @Test
    void getAllUsersTest_NO_NULL() {
        // ������� �������� �� NULL
        List<User> expected = User.getAllUsers();
        assertNotNull(expected);
    }
}