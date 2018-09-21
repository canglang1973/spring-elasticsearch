package com.winxuan.elasticsearch.repository;

import com.winxuan.elasticsearch.model.OpenApiLog;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author leitao.
 * @category
 * @time: 2018/9/21 0021-16:54
 * @version: 1.0
 * @description:
 **/
@Repository
public class LogRepository implements ElasticsearchRepository<OpenApiLog, Integer> {
    @Override
    public <S extends OpenApiLog> S index(S s) {
        return null;
    }

    @Override
    public Iterable<OpenApiLog> search(QueryBuilder queryBuilder) {
        return null;
    }

    @Override
    public Page<OpenApiLog> search(QueryBuilder queryBuilder, Pageable pageable) {
        return null;
    }

    @Override
    public Page<OpenApiLog> search(SearchQuery searchQuery) {
        return null;
    }

    @Override
    public Page<OpenApiLog> searchSimilar(OpenApiLog openApiLog, String[] strings, Pageable pageable) {
        return null;
    }

    @Override
    public void refresh() {

    }

    @Override
    public Class<OpenApiLog> getEntityClass() {
        return null;
    }

    @Override
    public Iterable<OpenApiLog> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<OpenApiLog> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OpenApiLog> S save(S s) {
        return null;
    }

    @Override
    public <S extends OpenApiLog> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<OpenApiLog> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<OpenApiLog> findAll() {
        return null;
    }

    @Override
    public Iterable<OpenApiLog> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(OpenApiLog openApiLog) {

    }

    @Override
    public void deleteAll(Iterable<? extends OpenApiLog> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
