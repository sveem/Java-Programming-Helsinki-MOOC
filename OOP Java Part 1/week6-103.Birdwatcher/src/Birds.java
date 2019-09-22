public class Birds {
    private String name;
    private String latName;
    private int observation;
    
    public Birds(String name, String latName) {
        this.name = name;
        this.latName = latName;
        this.observation = 0;
    }
    
    public void Observed(){
        this.observation++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "\n" + this.name + " (" + this.latName + "): " + this.observation + " observations";
    }
}