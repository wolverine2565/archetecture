package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @org.junit.jupiter.api.Test
    void getUser() {
        User testUser = new User("Александр");
        AccessRepo accessRepoTest = new AccessRepo(testUser, new Group("Архитектура ПО"));
        assertEquals(testUser, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void setUser() {
        AccessRepo accessRepoTest = new AccessRepo(new User("Александр"), new Group("Архитектура ПО"));
        User testUser2 = new User("Иванов Александр");
        accessRepoTest.setUser(testUser2);
        assertEquals(testUser2, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void getGroup() {
        Group groupTest = new Group("Архитектура ПО");
        AccessRepo accessRepoTest = new AccessRepo(new User("Александр"), groupTest);
        assertEquals(groupTest, accessRepoTest.getGroup());

    }

    @org.junit.jupiter.api.Test
    void setGroup() {
        AccessRepo accessRepoTest = new AccessRepo(new User("Александр"), new Group("Архитектура ПО"));
        Group testGroup = new Group("Архитерктура");
        accessRepoTest.setGroup(testGroup);
        assertEquals(testGroup, accessRepoTest.getGroup());
    }
}