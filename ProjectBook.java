// IMPORTS

import java.util.ArrayList;

// dates
import java.util.Date;  
import java.text.SimpleDateFormat;

public class ProjectBook {
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  

    private Date date;
    private String title;
    private String description;
    private Entry entry = new Entry();
    private ArrayList<Entry> entries = new ArrayList<Entry>();


    public ProjectBook() {
        title = "unnamed";
        description = "No description";
        date = new Date();

        entry = new Entry();
        entries.add(entry);
    }
    
    public ProjectBook(String name, String desc) {
        title = name;
        description = desc;
        date = new Date();
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return formatter.format(date);
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

