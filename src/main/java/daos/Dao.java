package daos;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> findById(Integer id);

    List<T> findAll();

    void create(T t);

    void update(T t, String[] params);

    void delete(T t);
}
