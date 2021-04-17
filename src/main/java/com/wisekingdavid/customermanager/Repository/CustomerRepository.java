package com.wisekingdavid.customermanager.Repository;

import com.wisekingdavid.customermanager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Override
//    public List<Customer> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<Customer> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public List<Customer> findAllById(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Customer customer) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Customer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public <S extends Customer> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> List<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Customer> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Customer> S saveAndFlush(S s) {
//        return null;
//    }
//
//    @Override
//    public void deleteInBatch(Iterable<Customer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Customer getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Customer> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Customer> boolean exists(Example<S> example) {
//        return false;
//    }
}
