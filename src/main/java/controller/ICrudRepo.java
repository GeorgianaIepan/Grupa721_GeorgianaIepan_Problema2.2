package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface ICrudRepo<E> {

    E findOne(int id);

    List<E> findAll();

    void create(E entity);

    void update(int id);

    void delete(int id);
}
