package com.distribuidas.practicaws.services;

import com.distribuidas.practicaws.students.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServices {
    private static final Map<String, Student> st = new HashMap<>();
    private static final Map<Integer, Student> edad = new HashMap<>();
    @PostConstruct
    public void initialize() {

        Student sam = new Student();
        sam.setName("Sam");
        sam.setLastName("Nilve");
        sam.setAge(20);
        sam.setCivilStatus("Soltero");
        sam.setCountry("Ecuador");


        st.put(sam.getName(), sam);
        st.put(sam.getLastName(), sam);
        edad.put(sam.getAge(), sam);
        st.put(sam.getCivilStatus(), sam);
        st.put(sam.getCountry(), sam);
    }


    public Student getUsers(String name) {

        return st.get(name);
    }
}
