/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CollectionExample.entitydaoImpl;

import com.leapfrog.CollectionExample.entity.Students;
import com.leapfrog.CollectionExampledao.StudentDAO;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class StudentDAOImpl implements StudentDAO{
 ArrayList<Students> StudentsList = new ArrayList<>();
 
    @Override
    public boolean insert(Students stu) {
       return StudentsList.add(stu);
    }

    @Override
    public ArrayList<Students> getall() {
        return StudentsList;
    }

    @Override
    public boolean delete(int id) {
       for(Students s: StudentsList){
           if(s.getId()==id)
             return  StudentsList.remove(s);
          
       }
     return false;
    }

    @Override
    public Students getById(int id) {
        for(Students s: StudentsList){
            if(s.getId()==id)
            return s;
        }
     return null;
    } 
  


}
    

