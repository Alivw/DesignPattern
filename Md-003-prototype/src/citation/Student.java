package citation;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-20 16:34
 **/
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
