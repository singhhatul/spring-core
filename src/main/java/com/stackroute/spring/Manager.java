package com.stackroute.spring;

public class Manager {
    private int id;
    private String name;
    private  Surveyor surveyor;

    public Manager() {
    }

    public Manager(int id, String name, Surveyor surveyor) {
        this.id = id;
        this.name = name;
        this.surveyor = surveyor;
    }

//    public Manager(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Surveyor getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(Surveyor surveyor) {
        this.surveyor = surveyor;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surveyor=" + surveyor +
                '}';
    }
}
