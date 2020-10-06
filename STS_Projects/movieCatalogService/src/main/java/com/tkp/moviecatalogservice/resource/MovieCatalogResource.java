package com.tkp.moviecatalogservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	/*//Step-1
	 * @RequestMapping("/{userId}") public List<CatalogItem>
	 * getCatalog(@PathVariable("userId") String userId) {
	 * 
	 * return Collections.singletonList(new CatalogItem("DDL", "Test", 3));
	 * 
	 * }
	 */
	
	//get all rated Movie Ids
	//For each Movie id call movie info service and get details
	//put them all together 

}
