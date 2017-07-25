package jp.ac.tama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import jp.ac.tama.DAO.dao;
/**
 * Created by kajiwarayutaka on 2017/07/10.
 */
@RestController
@RequestMapping("/")
public class SiginController {

    @Autowired
    private dao dao;

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String index(@RequestBody Integer cost){
        System.out.println(cost);
        dao.insertUser(cost);
        return "サインインの処理を実装していきます。";
    }


}
