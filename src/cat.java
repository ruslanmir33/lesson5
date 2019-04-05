public class cat {
   private String name;
   private String color;
   static int age;

    public cat() {
    }

    public cat(String name, String color, int age) {
//        private  default(package) protected public
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public cat(String name) {
        this.name = name;
        color = "White";
        age = 0;
    }

    public void info() {
        System.out.println("Cat name: " + name + " color: " + color + " age " + age);
    }

    public void jump() {
        System.out.println("Кот " + name + " прыгнул!");
    }

    public void sleep() {
        System.out.println("Кот " + name + " уснул. ");
    }
    public void eat(){
        System.out.println("Кот кушет ");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Возраст не может быть отрицательным!");
        }else {
            this.age = age;
        }

    }
}
