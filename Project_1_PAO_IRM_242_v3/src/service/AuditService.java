package service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;
import java.nio.file.*;
import java.sql.Timestamp;
import java.util.Date;

public class AuditService {


    private static AuditService INSTANCE;

    private AuditService () {}

    public static AuditService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AuditService();
        }
        return INSTANCE;
    }


    private static final String DIRECTORY_PATH = "files/audit";
    private static final String FILE_PATH = DIRECTORY_PATH + "/audit.csv";

    public void logEvent (String actionName) {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.APPEND);
            Date date = new Date();
            long time = date.getTime();
            Timestamp timestamp = new Timestamp(time);
            writer.write(actionName + "," + timestamp + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
