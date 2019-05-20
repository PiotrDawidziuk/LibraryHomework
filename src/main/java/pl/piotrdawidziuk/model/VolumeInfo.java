package pl.piotrdawidziuk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class VolumeInfo {
	
	private List<IndustryIdentifier> industryIdentifiers;
    private String title;
    private String subtitle;
    private String publisher;
    private String publishedDate;
    private String description;
    private Integer pageCount;
    private ImageLinks imageLinks;
    private String language;
    private String previewLink;
    private Double averageRating;
    private List<String> authors;
    private List<String> categories;
}


