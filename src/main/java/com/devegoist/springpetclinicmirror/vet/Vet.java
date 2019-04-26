package com.devegoist.springpetclinicmirror.vet;

import com.devegoist.springpetclinicmirror.model.Person;

import javax.persistence.*;
import java.util.Set;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;
}
