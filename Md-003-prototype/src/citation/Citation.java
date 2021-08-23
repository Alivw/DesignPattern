package citation;

import java.io.Serializable;

/**
 * @Description: 奖状类
 * @Author: Awei
 * @Create: 2021-08-20 16:09
 **/
public class Citation implements Cloneable , Serializable {

    private String name;

    private Student stu;

    public String getName() {
        return name;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(stu.getName() + " 同学：在2021学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
