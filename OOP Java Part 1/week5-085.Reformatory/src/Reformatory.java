public class Reformatory {
    private int numberOfAllMeasurments;
    
    public Reformatory() {
        this.numberOfAllMeasurments = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.numberOfAllMeasurments++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int newPersonWeigth = person.getWeight();
        person.setWeight(newPersonWeigth + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.numberOfAllMeasurments;
    }
}
