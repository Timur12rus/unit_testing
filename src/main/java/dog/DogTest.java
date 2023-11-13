package dog;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @org.junit.jupiter.api.Test
    void testGetDogNameMethod() {
        Dog dog = new Dog("Alberts", 2);
        assertEquals("Alberts", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        Dog dog = new Dog("Alberts", 2);
        dog.setName("Roman");
        assertEquals("Alberts", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}