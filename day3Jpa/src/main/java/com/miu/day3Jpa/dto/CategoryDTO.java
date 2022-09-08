package com.miu.day3Jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CategoryDTO {

    private String name;


}
