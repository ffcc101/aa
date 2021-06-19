package biancheng.第八题;

public class Student {
    private String name;
    private int sid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public Student(){}
    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Student)){
            return false;
        }

        if (((Student) obj).sid==this.sid&&((Student) obj).name.equals(this.name)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Student s1=new Student("张三",11);
        Student s2=new Student("张三",11);
        System.out.println(s1.equals(s2));
    }
}
