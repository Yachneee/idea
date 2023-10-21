package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileT {
    private int id;
    private String name;
    private long size;
    private Timestamp create_time;
    private String upload_ip;
    private String download_link;
}
