package com.kartohan.kartohan_todo_list;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvLoader {
    public static void loadEnv() {
        Dotenv dotenv = Dotenv.load();
        System.setProperty("DB_URL", dotenv.get("DB_URL"));
        System.setProperty("DB_USER", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
    }
}
