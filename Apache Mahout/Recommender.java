import java.io.File;                                                                   
import java.util.List; 
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel; 
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood; 
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender; 
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity; 
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender; 
import org.apache.mahout.cf.taste.similarity.UserSimilarity; 


public class Recommender { 
     public static void main(String args[]){ 
	System.out.println("Started execution");
          try{ 
	//Creating data model 
	DataModel datamodel = new FileDataModel(new File("data.csv")); 
	System.out.println("\nCreated data model");
System.out.println(datamodel);
	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new PearsonCorrelationSimilarity(datamodel);
System.out.println("\nCreated user similarity");
System.out.println(usersimilarity);
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
System.out.println("\nCreated user neighbourhood");
System.out.println(userneighborhood);
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 
System.out.println("\n\nRecommender");
System.out.println(recommender);	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 
System.out.println("\n\nRecommendations");
System.out.println(recommendations);
	System.out.println("\n\nCreated recommendations");
	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 
	System.out.println("\n\ncompleted execution"); 
     } 
} 
