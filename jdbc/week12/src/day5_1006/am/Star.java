package day5_1006.am;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star {
    private String name;
    private String loc;
    public String country;
}
