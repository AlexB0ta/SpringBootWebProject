package com.example.proiectbd.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    List<T> list();

    Object get(int id);

    void delete(int id);

}