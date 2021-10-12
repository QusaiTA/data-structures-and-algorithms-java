package queueAndStack;

public class AnimalShelter {

    private QueueGeneric<Animals> dogs ;
    private QueueGeneric<Animals> cats ;

    public AnimalShelter() {
        this.dogs = new QueueGeneric<>();
        this.cats = new QueueGeneric<>();
    }

    public void enQueue(Animals animals){

        if(animals.getType().equalsIgnoreCase("dogs")){
            dogs.enqueue(animals);
        } else if(animals.getType().equalsIgnoreCase("cats")){
            cats.enqueue(animals);
        }else {
            System.out.println("is not an animal");
        }

    }

    public String deQueue(String pref) throws Exception {
        if(pref.equalsIgnoreCase("dogs") && !dogs.isEmpty()){
            dogs.dequeue();
            return pref;

        } else if(pref.equalsIgnoreCase("cats") && !cats.isEmpty()){
            cats.dequeue();
            return pref;
        } else {
            return "not an animal" ;
        }

    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}
