package com.wangjie.spring.controller;

import com.wangjie.spring.dao.UserMapper;
import com.wangjie.spring.model.QueryCondition;
import com.wangjie.spring.model.User;
import com.wangjie.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


/**
 * Created by wangjie on 2016/4/20 0020.
 */
@Controller
@RequestMapping("/user")
public class UserController {


   /* @ModelAttribute
    public void populateModel(@RequestParam String abc, Model model){
        model.addAttribute("attributeName",abc);
    }*/

    //@Resource(name="UserMapper")
   /* @Resource(name="userMapper")*/
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;

   @ModelAttribute(value = "myUser")
    public User populateModel(){
        User user=new User();
        user.setUsername("feilong");
        user.setPassword("123");
        return user;
    }

    @RequestMapping(value = "/handle")
    public void handle(){
        int b=6/0;
    }

    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public String testPost(String sex, User user) {

        System.out.println(user);
        System.out.println("123");
        System.out.println(sex);
        return "helloWorld";

    }

    @RequestMapping(value = "/testPost2",method = RequestMethod.GET)
    public void testPost2(
              String requestString
    ){
        System.out.println("123");
        System.out.println(requestString);
    }

    @RequestMapping(value = "/findQuestionInfoDtoPage")
    public void findQuestionInfoDtoPage(
            @RequestParam(value="sex",required=false) String  sex,
//            @ModelAttribute QueryCondition queryCondition
            @RequestParam QueryCondition queryCondition

    ){

        System.out.println("hehe");
        System.out.println(sex);
        System.out.println(queryCondition);
        System.out.println("111");
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    @RequestMapping("testUser")
    public void String(){

        User user=new User();
        user.setPassword("888");
        user.setUsername("88888");
        userMapper.insert(user);
        System.out.println("12222");

       /* int b=1/0;*/

        User user1=new User();
        user1.setPassword("777");
        user1.setUsername("777");
        userMapper.insert(user1);



    }

    @RequestMapping(value = "/validate")
    public String validate(@Valid User user, BindingResult result){

        System.out.println("run");
        if (result.hasErrors())
            return "helloWorld";
        return "showUser";
    }

    @RequestMapping(value = "/helloWorld2")
    public String helloWorld2(@ModelAttribute("myUser") User user){
        int b=2/0;
		return "helloWorld";
    }

    @ResponseBody
    @RequestMapping(value="/helloWorld1")
    public String helloWorld(String abc) {

        return "helloWorld";
    }

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {

        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @ResponseBody
    @RequestMapping("/getJsonFormat")
    public User getJsonFormat() {
        System.out.println("get Json Data...");
        User user = new User();
        user.setId(123);
        user.setPassword("456");
        user.setUsername("feilong");
        return user;
    }


}