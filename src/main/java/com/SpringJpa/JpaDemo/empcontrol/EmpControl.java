package com.SpringJpa.JpaDemo.empcontrol;

import com.SpringJpa.JpaDemo.emprepo.EmpRepo;
import com.SpringJpa.JpaDemo.model.Empolyee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by melayer on 23/9/17.
 */
@RestController
public class EmpControl {

    @Autowired
    EmpRepo empRepo;

    @PostMapping(value = "/insert")
    String insert(@RequestBody Empolyee empolyee){
        empRepo.save(empolyee);
        return "Data Inserted";
    }

    @GetMapping(value = "/findone")
     Empolyee findone(@RequestParam  Integer id){
        Empolyee emp=empRepo.findOne(id);
        return emp;
    }

    @GetMapping(value = "/findall")
   List<Empolyee> findall(){
          List<Empolyee> emp= empRepo.findAll();
         return emp;
    }
    @GetMapping(value = "/byname")
    List<Empolyee> find(@RequestParam String name){
        List<Empolyee> em= empRepo.findByName(name);
        return em;
    }

    @GetMapping(value = "/fnamelname")
    List<Empolyee> fnmlnm(@RequestParam String name, @RequestParam String city){
        List<Empolyee> list=empRepo.findByNameAndCity(name,city);
        return list;
    }

    @GetMapping(value = "/fnmorlnm")
    List<Empolyee> fnmorlnm(@RequestParam String name, String city){
        List<Empolyee> list= empRepo.findByNameOrCity(name, city);
        return list;
    }

    @GetMapping(value = "/byidbetween")
    List<Empolyee> findByIdbet(@RequestParam Integer id, @RequestParam Integer id1){
        List<Empolyee> list=empRepo.findByIdBetween(id, id1);
        return list;
    }

    @GetMapping(value = "/byidlessthan")
    List<Empolyee> byidlessthan(@RequestParam Integer id){
        List<Empolyee> list=empRepo.findByIdLessThan(id);
        return list;
    }


    @GetMapping(value = "/findByIdGreaterThan")
    List<Empolyee> findByIdGreaterThan(@RequestParam Integer id){
        List<Empolyee> list=empRepo.findByIdGreaterThan(id);
        return list;
    }

    @GetMapping(value = "/findByIdAfter")
    List<Empolyee> findByIdAfter(@RequestParam Integer id){
        List<Empolyee> list=empRepo.findByIdAfter(id);
        return list;
    }

    @GetMapping(value = "/findByIdBefore")
    List<Empolyee> findByIdBefore(@RequestParam Integer id){
        List<Empolyee> list=empRepo.findByIdBefore(id);
        return list;
    }

    



}
