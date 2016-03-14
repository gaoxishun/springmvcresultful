package controller;

import cn.javass.spring.mvc.bind.annotation.RequestJsonParam;
import com.alibaba.fastjson.JSON;
import model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by gaoxs on 2016/3/11.
 */
@Controller
@RequestMapping(value="/parameter")
public class RequestParamController {

    @RequestMapping(params = "create", method = RequestMethod.GET)
    public String showForm() {
        System.out.println("=========");
        return "success";
    }

    @RequestMapping(value = "/path/{userId}/create", method = RequestMethod.GET)
    public String showForm2(@PathVariable(value = "userId") String userid) {
        System.out.println("#########="+userid);
        return "success";
    }

    @RequestMapping(value = "/requestparma", method = RequestMethod.GET)
    public String showForm3(@RequestParam(value = "role") String role) {
        System.out.println("#####role####="+role);
        return "success";
    }


    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    @ResponseBody
    public void saveUser(@RequestBody List<UserModel> users) {
        for (UserModel userModel : users) {
            System.out.println(userModel.toString()+"==============");
        }

    }

    @RequestMapping(value = "/saveJson",method = RequestMethod.POST)
    @ResponseBody
    public Object saveJson(@RequestBody List<UserModel> users) {
        for (UserModel userModel : users) {
            System.out.println(userModel.toString()+"==============");
        }
        System.out.println(JSON.toJSON(users)+"====");
        return users;
    }
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String json() {
        return "testJson";
    }
  }
