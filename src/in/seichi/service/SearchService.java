package in.seichi.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import in.seichi.meta.AnimeMeta;
import in.seichi.model.Anime;


public class SearchService {
	
	public String execute() {
		AnimeMeta anime = AnimeMeta.get();
		List<Anime> animes = Datastore.query(anime)
			.filter(anime.title.equal("アニメ1").getFilters())
			.asList();
		
		StringBuilder result = new StringBuilder();
		for (Anime a : animes) {
			result.append(a.getTitle()).append("\n");
		}
		
		return result.toString();
	}
}
