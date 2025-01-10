public class newClass {
    private String name;
    private int num;

    public newClass(String name, int num){
        this.name = name;
        this.num = num;
    }

    public int getNum(){
        return num;
    }
    public void hello(){
        System.out.println("Hello");
    }
    public Boolean willIGetLucky(){
        if (((Math.random() * 2) - 1) == 1){
            return true;
        }
        return false;
    }

    public String info(){
        return "My name is " + name + " and I am " + num;
    }
}
