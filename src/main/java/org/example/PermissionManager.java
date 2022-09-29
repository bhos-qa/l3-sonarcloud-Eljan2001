package org.example;

enum PermissionLevel{
    ADMIN, DEVELOPER, USER
}

class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel set(PermissionLevel level){
        this.mCurrentLevel = level;
        return this.mCurrentLevel;
    }

    public String get() {
        return switch (this.mCurrentLevel) {
            case USER -> "User";
            case DEVELOPER -> "Developer";
            case ADMIN -> "Admin";
        };
    }
}