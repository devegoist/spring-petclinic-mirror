package com.devegoist.springpetclinicmirror.vet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@Controller
public class VetController {

    @GetMapping("/vets.html")
    public String showVetList(Map<String, Object> model) {
        Vets vets = new Vets();
//        vets.getVetsList().addAll(this.vets.findall());
        model.put("vets", vets);
        return "vets/vetList";
    }
}
