package ie.tudublin;

public class Cat {
    private int nineLives = 9;
    //private String name;

    public int getNumLives() {
        return this.nineLives;
    }
    public void Kill(){
        if(nineLives-- == 0){
            System.out.println("Dead");
        }
        else {
            System.out.println("Ouch");
        }
    }

}
