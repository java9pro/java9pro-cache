package com.cache.java9pro;

public class Mobile {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    String id;
    String model;
    String ram;
    public Mobile(String id, String model, String ram) {
        this.id=id;
        this.model=model;
        this.ram=ram;
    }
}
