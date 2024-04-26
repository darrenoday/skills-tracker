package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

@GetMapping(value="")
@ResponseBody
    public String main(){
    return "<h1> 'Skills Tracker' </h1>" +
            "<h2></h2" +
            "<ol>" +
            "<li> Java </li>" +
            "<li> JavaScript </li>" +
            "<li> Thoughts and Prayers" +
            "</ol>";
}
@GetMapping("form")
@ResponseBody
    public String skillsForm(){
    return


                    "<form method='post'>" +

            "<input type='submit' value='Submit'>  " +
            "<input type= 'text' name=\"nameInput\">\n" +
            //"  <option value=\"\">--Please choose an option--</option>\n" +
            //"  <option value=\"dog\">Dog</option>\n" +
            //"  <option value=\"cat\">Cat</option>\n" +
           // "  <option value=\"hamster\">Hamster</option>" +
            "</form>";

}
@PostMapping(value="form")
@ResponseBody

    public String responseForm(@RequestParam String nameInput){
    return "Hi " + nameInput;
}
}
