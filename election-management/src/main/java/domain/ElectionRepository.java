package domain;

import java.util.List;

public interface ElectionRepository {
    void submit(Election election);

    List<Election> findAll();

    default void delete(String id) {
    }

}