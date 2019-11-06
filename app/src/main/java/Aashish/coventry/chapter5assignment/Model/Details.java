package Aashish.coventry.chapter5assignment.Model;

public class Details {
    private String name;
    private String gender;
    private String age;
    private int imageId;

    public Details(String name,String age, String gender, int imageId) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.imageId = imageId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
