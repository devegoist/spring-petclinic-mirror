package com.devegoist.springpetclinicmirror.owner;

import com.devegoist.springpetclinicmirror.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@Entity
@Table(name = "types")
public class PetType extends NamedEntity {
}
