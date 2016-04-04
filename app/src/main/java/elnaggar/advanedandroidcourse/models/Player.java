package elnaggar.advanedandroidcourse.models;

/**
 * Created by Elnaggar on 29/01/2016.
 */
public class Player {
    private  int imageResourceId;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    private String name;
    private int age;
    public Player(){

    }
    public Player(int age) {
        this.age = age;
    }

    public Player(int age, String name, String position) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
