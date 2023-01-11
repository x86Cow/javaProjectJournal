// IMPORTS

import java.util.ArrayList;


public class ProjectBook {
    private String title;
    private String description;
    private Entry entry = new Entry();
    private ArrayList<Entry> entries = new ArrayList<Entry>();


    public ProjectBook() {
        title = "unnamed";
        description = "No description";

        entry = new Entry();
        entries.add(entry);
    }
    
    public ProjectBook(String name, String desc) {
        title = name;
        description = desc;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getDescription() {
            return description;
    }

    // SETTERS
    public void setTitle(String name) {
        title = name;
    }
    
    public void SetDescription(String desc) {
        description = desc;
    }


    
}

