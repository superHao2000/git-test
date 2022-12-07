package com.at.bean;

public class Preson {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Say() {
        System.out.println("hello git1");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("master test second");
    }

    @Override
    public String toString() {
        return "Preson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
