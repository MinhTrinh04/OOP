package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    //Section 5: Classifier Member & Instance Member
    private int id;
    private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
    public int getId() {
    	return id;
    }
    
    public void setTitle(String titleSet){ 
    	title = titleSet; 
    }
    public void setCategory(String categorySet){ 
    	category = categorySet; 
    }
    public void setDirector(String directorSet){ 
    	director = directorSet; 
    }
    public void setLength(int lengthSet){ 
    	length = lengthSet; 
    }
    public void setCost(float costSet){ 
    	cost = costSet; 
    }

    
    
    
    
    
    
    
    
    
}
