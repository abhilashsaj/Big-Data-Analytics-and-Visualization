import java.io.File;                                                                   
import java.util.List; 
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel; 
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood; 
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender; 
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity; 
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity; 
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.GenericUserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.SpearmanCorrelationSimilarity;

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
	DataModel datamodel = new FileDataModel(new File("Sample_Data.csv")); 
	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new PearsonCorrelationSimilarity(datamodel);
	System.out.println("\nCreated user similarity for Pearson Correlation");
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 
	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 


	try{ 
	//Creating data model 
	DataModel datamodel = new FileDataModel(new File("Sample_Data.csv")); 

	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new LogLikelihoodSimilarity(datamodel);
	System.out.println("\nCreated user similarity for LogLikelihood Similarity");
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 
	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 

	try{ 
	//Creating data model 
	DataModel datamodel = new FileDataModel(new File("Sample_Data.csv")); 

	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new TanimotoCoefficientSimilarity(datamodel);
	System.out.println("\nCreated user similarity for TanimotoCoefficient Similarity");
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 

	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 

	try{ 
	//Creating data model 
	DataModel datamodel = new FileDataModel(new File("Sample_Data.csv")); 

	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new EuclideanDistanceSimilarity(datamodel);
	System.out.println("\nCreated user similarity for EuclideanDistance Similarity");
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 
	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 

	
	try{ 
	//Creating data model 
	DataModel datamodel = new FileDataModel(new File("Sample_Data.csv")); 

	//Creating UserSimilarity object. 
	UserSimilarity usersimilarity = new SpearmanCorrelationSimilarity(datamodel);
	System.out.println("\nCreated user similarity for SpearmanCorrelation Similarity");
 	//Creating UserNeighbourHHood object. 
	UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(0.1, 	usersimilarity, datamodel); 
	//Create UserRecomender 
	UserBasedRecommender recommender = new 	GenericUserBasedRecommender(datamodel, userneighborhood, usersimilarity); 	
	List<RecommendedItem> recommendations = recommender.recommend(2, 3); 
	for (RecommendedItem recommendation : recommendations) { 
	       System.out.println(recommendation); 
	}
         }catch(Exception e) { 
	  System.out.println(e); 
	  } 

	

     } 
} 
