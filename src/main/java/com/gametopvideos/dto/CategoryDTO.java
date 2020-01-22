package com.gametopvideos.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CategoryDTO {

    private Long id;
    private String name;
    private List<VideoDTO> videos;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id) {
        this.id = id;
    }
}
