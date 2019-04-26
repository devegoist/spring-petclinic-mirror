package com.devegoist.springpetclinicmirror.vet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@XmlRootElement
public class Vets {

    private List<Vets> vets;

    @XmlElement
    public List<Vets> getVetList() {
        if (vets == null) {
            vets = new ArrayList<>();
        }
        return vets;
    }
}
