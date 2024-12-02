package com.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerUtil {
    private static final String LOG_FILE_PATH = "logs/app.log";

    public static void logInfo(String message) {
        log("INFO", message);
    }

    public static void logError(String message) {
        log("ERROR", message);
    }

    private static void log(String level, String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE_PATH, true);
             PrintWriter out = new PrintWriter(fw)) {

            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            out.printf("%s [%s] - %s%n", timestamp, level, message);
        } catch (IOException e) {
            System.out.println("Failed to log message: " + e.getMessage());
        }
    }
}
