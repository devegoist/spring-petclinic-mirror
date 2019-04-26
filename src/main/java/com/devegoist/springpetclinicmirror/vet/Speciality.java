package com.devegoist.springpetclinicmirror.vet;

import com.devegoist.springpetclinicmirror.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@Entity
@Table(name = "specialities")
public class Speciality extends NamedEntity implements Serializable {

}
