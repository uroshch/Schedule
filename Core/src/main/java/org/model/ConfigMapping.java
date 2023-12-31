package org.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConfigMapping {
    private Integer index;
    private String custom;
    private String original;

    public ConfigMapping(Integer index, String custom, String original) {
        this.index = index;
        this.custom = custom;
        this.original = original;
    }
}
