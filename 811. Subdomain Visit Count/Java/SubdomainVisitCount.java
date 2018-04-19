
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SubdomainVisitCount {
	
	    public List<String> subdomainVisits(String[] cpdomains) {

			Map<String, Integer> mapresult = new HashMap(); 
			
			for (String st: cpdomains ){

				String[] curr= st.split(" ");
				String[] domnation = curr[1].split("\\.");
				String subdom = "";
	 
				for (int i = 0;i<domnation.length;i++){
					subdom=domnation[domnation.length-1-i]+((subdom.equals(""))?(subdom):("."+subdom));
					if (mapresult.containsKey(subdom)){
						mapresult.put(subdom, mapresult.get(subdom)+Integer.parseInt(curr[0]));
					}
					else{
						mapresult.put(subdom, Integer.parseInt(curr[0]));
					}
				}
				
			}
			
			List<String> listresult = new ArrayList();			
			for (String d : mapresult.keySet()) {
				listresult.add(mapresult.get(d) + " " + d);
				};
   
	        
	        return listresult;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		SubdomainVisitCount svc = new SubdomainVisitCount();
		


	}

}
