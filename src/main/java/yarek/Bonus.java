package yarek;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
public class Bonus implements Serializable {
    public String id;
    public String bonus;
    public String aaa;
}
