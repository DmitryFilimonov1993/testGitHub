package com.example.myapp;

import java.util.ArrayList;
import java.util.List;

public class Person {

   private String name;
   private String age;

    public Person() {
        init();
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    private int photoId;

   private List<Person> personList;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;

    }

    private void init(){

        personList = new ArrayList<>();
        personList.add(new Person("Dima", "26", R.drawable.ic_launcher_background));
        personList.add(new Person("Lena", "26", R.drawable.ic_launcher_background));
        personList.add(new Person("Max", "0", R.drawable.ic_launcher_background));
        personList.add(new Person("Anna", "12", R.drawable.ic_launcher_background));
        personList.add(new Person("Nicol", "10", R.drawable.ic_launcher_background));
        personList.add(new Person("Tany", "20", R.drawable.ic_launcher_background));
        personList.add(new Person("Tom", "13", R.drawable.ic_launcher_background));
        personList.add(new Person("Kevin", "14", R.drawable.ic_launcher_background));
        personList.add(new Person("Andrew", "23", R.drawable.ic_launcher_background));
        personList.add(new Person("Lida", "13", R.drawable.ic_launcher_background));
        personList.add(new Person("Yura", "42", R.drawable.ic_launcher_background));
        personList.add(new Person("Max", "0", R.drawable.ic_launcher_background));

    }

}
