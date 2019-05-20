package pl.piotrdawidziuk.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {
	
	private String isbn;
	private String title;
	private String subtitle;
	private String publisher;
	private long publishedDate;
	private String description;
	private int pageCount;
	private String thumbnailUrl;
	private String language;
	private String previewLink;
	private double averageRating;
	private ArrayList<String> authors;
	private ArrayList<String> categories;
	
}
