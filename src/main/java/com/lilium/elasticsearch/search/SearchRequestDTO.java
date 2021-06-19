package com.lilium.elasticsearch.search;

import java.util.List;

public class SearchRequestDTO {
    private List<String> fields;
    private String searchTerm;

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
