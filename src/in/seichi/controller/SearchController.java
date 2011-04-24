package in.seichi.controller;

import in.seichi.service.SearchService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class SearchController extends Controller {

    @Override
    public Navigation run() throws Exception {
    	SearchService service = new SearchService();
    	String result = service.execute();
    	
    	response.setCharacterEncoding("utf-8");
    	response.getWriter().write(result);

        return null;
    }
}
