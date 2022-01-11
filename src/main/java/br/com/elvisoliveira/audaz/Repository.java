package br.com.elvisoliveira.audaz;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repository<T> {

    List<T> fakeDatabase = new ArrayList<>();

    public void insert(T model) {
        fakeDatabase.add(model);
    }

    public void update(T model) {
        System.out.println("update");
    }

    // public T getById(UUID id) {}

    public List<T> getAll() {
        return fakeDatabase;
    }

}
