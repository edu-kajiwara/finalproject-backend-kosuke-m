package jp.ac.tama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kajiwarayutaka on 2017/07/10.
 */
@Controller
@RequestMapping("/")
public class SiginController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index(){

        return "サインインの処理を実装していきます。";
    }

}
