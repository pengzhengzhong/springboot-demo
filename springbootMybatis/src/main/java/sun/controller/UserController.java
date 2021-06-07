package sun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.common.entity.RestfulResult;
import sun.common.utils.CommUtils;
import sun.entity.User;
import sun.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping("/findById")
    public void findById(HttpServletRequest request, HttpServletResponse response,
                                @RequestBody User user){

        RestfulResult restfulResult = new RestfulResult();
        try {
            restfulResult.setData(userServiceImpl.findById(user.getId()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping("/findAll")
    public void findAll(HttpServletRequest request, HttpServletResponse response){

        RestfulResult restfulResult = new RestfulResult();
        try {
            restfulResult.setData(userServiceImpl.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        }
        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request, HttpServletResponse response,
                         @RequestBody User user){

        RestfulResult restfulResult = new RestfulResult();
        int ret = userServiceImpl.insert(user);
        if (ret > 0)
            restfulResult.setData(user);

        CommUtils.printDataJason(response, restfulResult);
    }


}
