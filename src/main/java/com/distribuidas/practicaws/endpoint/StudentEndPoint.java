package com.distribuidas.practicaws.endpoint;
import com.distribuidas.practicaws.services.StudentServices;
import com.distribuidas.practicaws.students.GetStudentRequest;
import com.distribuidas.practicaws.students.GetStudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.io.Console;

@Endpoint
public class StudentEndPoint {

    @Autowired
    private StudentServices service;


    @PayloadRoot(namespace = "http://distribuidas.com/practicaws",
            localPart = "getstudentrequest")
    @ResponsePayload
    public GetStudentResponse getUserRequest(@RequestPayload GetStudentRequest request) {
        GetStudentResponse response = new GetStudentResponse();
        response.setStudentr(service.getUsers(request.getName()));

        return response;
    }
}
