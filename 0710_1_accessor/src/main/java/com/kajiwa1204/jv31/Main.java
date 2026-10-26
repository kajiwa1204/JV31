package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);

        System.out.println(user.getId());

        RecordClass rc = new RecordClass(2, "abc");
        System.out.println(rc.id());
        System.out.println(rc.name());

        ModernDataClass mdc = new ModernDataClass();
    }
}