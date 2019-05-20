package pl.piotrdawidziuk.model;

import java.util.ArrayList;
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
	private long publishedDate;
	private String description;
	private int pageCount;
	private ImageLinks imageLinks;
	private String language;
	private String previewLink;
	private double averageRating;
	private ArrayList<String> authors;
	private ArrayList<String> categories;
	

}
