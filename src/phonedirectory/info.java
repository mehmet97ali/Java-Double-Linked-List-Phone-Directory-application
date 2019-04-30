package phonedirectory;

import java.util.ArrayList;
import java.util.List;

public class info {
    public String nameSurname;
    public ArrayList<String> phoneNumbers = new ArrayList<String>();
    
    public info(String nameSurname,ArrayList phoneNumbers){
        this.nameSurname=nameSurname;
        this.phoneNumbers=phoneNumbers;
    }
}
