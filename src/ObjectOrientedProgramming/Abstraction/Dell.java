package ObjectOrientedProgramming.Abstraction;

abstract class Dell {
    public Dell(){
        super();
    }

    public abstract void OS();

    public void welcome(String name) {
        System.out.println("Hey " + name+ " Welcome to Dell Universe!");
    }
}

