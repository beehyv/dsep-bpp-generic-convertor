package com.beehyv.dsep.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Id", description = "Id")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Id {
    @JsonProperty("id")
    private Integer id;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
       this.id = id;
    }
}
