package day1_925.handler;
import java.sql.Timestamp;
public class LogHandler implements Handler<Log> {

    @Override
    public Log getOne(Object... objects) {
        Log log = new Log();
        log.setLogId((int)objects[0]);
        log.setDescription((String)objects[1]);
        log.setOperationTime((Timestamp) objects[2]);
        return log;
    }
}