package com.hanaplibro.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Identifier {
    @JsonProperty("isbn_13")
    private List<String> isbn13;

    @JsonProperty("isbn_10")
    private List<String> isbn10;

    public void setIsbn13(List<String> isbn13) {
        this.isbn13 = isbn13;
    }

    public List<String> getIsbn13() {
        return isbn13;
    }

    public void setIsbn10(List<String> isbn10) {
        this.isbn10 = isbn10;
    }

    public List<String> getIsbn10() {
        return isbn10;
    }
}