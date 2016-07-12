/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CollectionExampledao;

import com.leapfrog.CollectionExample.entity.Students;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface StudentDAO {
    boolean insert (Students stu);
    ArrayList<Students> getall();
    public boolean delete(int id);
    Students getById (int id);
    
}
