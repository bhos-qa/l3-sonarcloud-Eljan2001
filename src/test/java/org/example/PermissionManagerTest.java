package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermissionManagerTest {
    PermissionManager manage = new PermissionManager();



    @Test
    void get() {
        manage.set(PermissionLevel.USER);
        Assertions.assertEquals("USER", manage.get());
        manage.set(PermissionLevel.ADMIN);
        Assertions.assertEquals("ADMIN", manage.get());
        manage.set(PermissionLevel.DEVELOPER);
        Assertions.assertEquals("DEVELOPER", manage.get());
    }


}