package com.devegoist.springpetclinicmirror.model;

import javax.persistence.MappedSuperclass;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
