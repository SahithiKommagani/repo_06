package Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl {
    private Service service;
    public ServiceImpl(Service service)
    {
        this.service=service;
    }
    public List<String > retrieve(String user)
    {
        List<String> filter=new ArrayList<>();
        List<String > todos=service.listAllUsers(user);
        for(String todo:todos)
        {
            if(todo.contains("Java")){
                filter.add(todo);
            }
        }
        return filter;
    }
   /* public int add(int a,int b)
    {
        return a+b;
    }*/
}
