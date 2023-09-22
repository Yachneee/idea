package day1_911.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
public class Pra5 {
    public static void main(String[] args) throws ParseException {
        LocalDate now=LocalDate.now();
        Map<String, LocalDate> map = new HashMap<>(Map.of("张三",LocalDate.of(2001,9,15),
                "李四",LocalDate.of(2001,9,19),
                "王五",LocalDate.of(2001,9,5),
                "孙六",LocalDate.of(2001,9,8),
                "钱七",LocalDate.of(2001,9,17)));
        List<Map.Entry<String, LocalDate>> list = map.entrySet().stream().filter(entry -> {
            LocalDate localDate = entry.getValue().plusYears(now.getYear() - entry.getValue().getYear());
            if (localDate.isBefore(now)) {
                System.out.println(entry.getKey() + "的生日已经过了");
                return false;
            } else {
                System.out.println(entry.getKey() + "的生日还有 " + localDate.compareTo(now) + " 天");
            }
            return now.plusDays(7).isAfter(localDate);
        }).toList();
        System.out.println(list);
    }
}
