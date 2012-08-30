package com.kp.malice.entities.persisted;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@SuppressWarnings("serial")
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "ALIAS_NAME")
public class AliasName extends RecordIdentifier implements Serializable {

    @Column(name = "DESCR")
    private String description;
    @Column(name = "SHORT_DESCR")
    private String shortDesc;

    public AliasName() {
    }

    public AliasName(RecordIdentifier timestampCreazione, String description, String shortDescription) {
        super(timestampCreazione);
        setDescription(description);
        setShortDesc(shortDescription);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

}