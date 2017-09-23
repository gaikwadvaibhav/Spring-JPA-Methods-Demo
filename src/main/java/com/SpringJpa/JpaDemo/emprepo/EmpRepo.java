package com.SpringJpa.JpaDemo.emprepo;

import com.SpringJpa.JpaDemo.model.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by melayer on 23/9/17.
 */
@Repository
public interface EmpRepo extends JpaRepository<Empolyee,Integer> {
    List<Empolyee> findByName(String name);

    List<Empolyee> findByNameAndCity(String name, String city);

    List<Empolyee> findByNameOrCity(String name, String city);

    List<Empolyee> findByIdBetween(Integer integer,Integer id1);

    List<Empolyee> findByIdLessThan(Integer id);
//
    List<Empolyee> findByIdGreaterThan(Integer id);

    List<Empolyee> findByIdAfter(Integer id);
//
    List<Empolyee> findByIdBefore(Integer id);

    List<Empolyee> findByNameLike(String name);

    List<Empolyee> findByNameNotLike(String name);
//
    List<Empolyee> findByNameStartingWith(String name);

    List<Empolyee> findByNameEndingWith(String name);

    List<Empolyee> findByNameContaining(String name);

    List<Empolyee> findByIdOrderByNameDesc(Integer id);











}
