package org.example;

import java.util.List;

public interface JdbcOperation<T, K> {
    void insert(T entity);
    void update(TechnicalAchievement entity, String primaryKey);

    void delete(String primaryKey);

    List<T> queryAll();

    List<org.example.TechnicalAchievement> queryWithPagination(int page, int pageSize);
    List<org.example.TechnicalAchievement>searchByCondition(int ID, String name, String domain, String description, String Ethical,String socialImpact,String Risk);
}
