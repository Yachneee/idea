package day2_926.utils;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class Log {

    private int logId;
    private String description;
    private Timestamp operationTime;
}