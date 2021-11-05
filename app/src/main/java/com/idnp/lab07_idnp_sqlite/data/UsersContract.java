package com.idnp.lab07_idnp_sqlite.data;

import android.provider.BaseColumns;

public class UsersContract {
    public static abstract class UserEntry implements BaseColumns {
        public static String TABLE_NAME="user";
        public static String ID="id";
        public static String NAME="names";
        public static String LASTNAME="lastname";
        public static String DNI="dni";
        public static String EMAIL="email";
        public static String PHONE_NUMBER="phoneNumber";
        public static String BIRTH_DATE="birthDate";
    }
}
