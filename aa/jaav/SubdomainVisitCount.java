import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SubdomainVisitCount {
	
//	    public List<String> subdomainVisits(String[] cpdomains) {
//	        
//	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		Map<String, Integer> mapresult = new HashMap(); 
		
		for (String st: list ){

			String[] curr= st.split(" ");
			String[] domnation = curr[1].split(".");
			String subdom = "";
			System.out.println(domnation[1]); 
			for (int i = 0;i<domnation.length;i++){
				subdom+=domnation[2-i];
				if (mapresult.containsKey(subdom)){
					mapresult.put(subdom, mapresult.get(subdom)+Integer.parseInt(curr[0]));
					System.out.println("**"); 
				}
				else{
					mapresult.put(subdom, mapresult.get(subdom));
					System.out.println("***"); 
				}
			}
			
		}
		

        Iterator iterator = mapresult.keySet().iterator();                
        while (iterator.hasNext()) {    
         Object key = iterator.next();    
         System.out.println("map.get(key) is :"+mapresult.get(key));    
        }   
		System.out.println("**"); 

	}

}
