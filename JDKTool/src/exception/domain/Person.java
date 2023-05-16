package exception.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private Integer id;
    private String pname;
    private IDCard idCard;
}
