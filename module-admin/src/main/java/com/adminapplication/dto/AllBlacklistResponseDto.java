package com.adminapplication.dto;

import com.core.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllBlacklistsResponseDto {
    private Integer id;
    private String username;
    private Integer category;
    private String createdAt;
}
