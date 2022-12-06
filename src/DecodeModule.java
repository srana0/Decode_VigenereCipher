
/**
* The Program will analyze the ciphertext and produce plaintext
* 
*
* @author  SUBHABRATA RANA
* @version 1.0
* @since   2022-10-13
* @assignment : 01 
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DecodeModule {

	public static void main(String[] args) {
		
		int alphabetArraySize=26;
		
		// Frequency Table for English Letters
		HashMap<Character, Double> englishFrequencyTable = new HashMap<Character, Double>();	
		 englishFrequencyTable.put('A', 8.2);
		 englishFrequencyTable.put('B', 1.5);
		 englishFrequencyTable.put('C', 2.8);
		 englishFrequencyTable.put('D', 4.2);
		 englishFrequencyTable.put('E', 12.7);
		 englishFrequencyTable.put('F', 2.2);
		 englishFrequencyTable.put('G', 2.0);
		 englishFrequencyTable.put('H', 6.1);
		 englishFrequencyTable.put('I', 7.0);
		 englishFrequencyTable.put('J', 0.1);	 
		 englishFrequencyTable.put('K', 0.8);
		 englishFrequencyTable.put('L', 4.0);
		 englishFrequencyTable.put('M', 2.4);
		 englishFrequencyTable.put('N', 6.7);
		 englishFrequencyTable.put('O', 7.5);
		 englishFrequencyTable.put('P', 1.9);
		 englishFrequencyTable.put('Q', 0.1);
		 englishFrequencyTable.put('R', 6.0);
		 englishFrequencyTable.put('S', 6.3);
		 englishFrequencyTable.put('T', 9.0);
		 englishFrequencyTable.put('U', 2.8);	 
		 englishFrequencyTable.put('V', 1.0);
		 englishFrequencyTable.put('W', 2.4);
		 englishFrequencyTable.put('X', 0.1);
		 englishFrequencyTable.put('Y', 2.0);
		 englishFrequencyTable.put('Z', 0.1);
		 
		 // Table contains the all English Letters and their position
		 HashMap<Character, Integer> englishLetterPositionTable = new HashMap<Character, Integer>();	
		 englishLetterPositionTable.put('A',0);
		 englishLetterPositionTable.put('B',1);
		 englishLetterPositionTable.put('C',2);
		 englishLetterPositionTable.put('D',3);
		 englishLetterPositionTable.put('E',4);
		 englishLetterPositionTable.put('F',5);
		 englishLetterPositionTable.put('G',6);
		 englishLetterPositionTable.put('H',7);
		 englishLetterPositionTable.put('I',8);
		 englishLetterPositionTable.put('J',9);	 
		 englishLetterPositionTable.put('K',10);
		 englishLetterPositionTable.put('L',11);
		 englishLetterPositionTable.put('M',12);
		 englishLetterPositionTable.put('N',13);
		 englishLetterPositionTable.put('O',14);
		 englishLetterPositionTable.put('P',15);
		 englishLetterPositionTable.put('Q',16);
		 englishLetterPositionTable.put('R',17);
		 englishLetterPositionTable.put('S',18);
		 englishLetterPositionTable.put('T',19);
		 englishLetterPositionTable.put('U',20);	 
		 englishLetterPositionTable.put('V',21);
		 englishLetterPositionTable.put('W',22);
		 englishLetterPositionTable.put('X',23);
		 englishLetterPositionTable.put('Y',24);
		 englishLetterPositionTable.put('Z',25);
		 
		 char [] englishAlphabets= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		 
		 String vigener_cipher="QAVHYFOVEDFMPBQKXNOCRGJJTZDZFDFMLNEBWFAEEXKELABKVZKTCGPOKZGZORFSEEXNBWXLKBBBRGRZMEVGSBKZIPOMYNECEFJDYXJVOBMYRFKBMRCPBKLTPPFYLPMFDLIHETHEBTUWFOVGSBPFYLPMFDTVBBJZITJGZNKVALJXUFEGHYACFOVEMVXREWVVFYZKBRYLRMYBCFMZRDTTJNGFMRYAXKKBQIBWRQLKKUPTHCNDQHHVJFDGEZSBUVYDYFBOXGUZPABTVYBTEQNLGERNQBETEEXNBWXLKBBBRMVWITXRDXEFARPBURTQMYRWXGUSPAUPGSBKZIPOPRFFPXUSZOALAEFGXULOOVFEFGXZPABTVYBLRAOLUKNTKBETMRBCQTKZDNEBKZNWPWRVWVEZSPXGUPFIMLEPTXIRCFVYNYAORETBWTRCBFFATBLNRCBIVEQLKDROXGUXYLPCRODXNNDMTJFPAWFJYQAIBFDAXRYBKRGTLGJGSBNEVGBKJVEVHWAPTUIHYPPZPVFLKUPCBIFEBGXYTPACNYDNRTPRGZIPOLZGJFGTNYXWROFQMYRQFKJGWXGXHLDXJCZHXEBYQAZFWXGUVDTHCNDQHHRJITKHHBPRXZKMYRQFKJGEBTTUTKZJBYQAVYLKWNRCBMYREBTTUTKZJBQQAVJZITJGZNBPVVX";
		
		 int key_length=5;
		 int message_length=vigener_cipher.length();
           
		 // We need to create bucket for each key place for holding the 
          //Now Filling 5 buckets: Each bucket holds the corresponding letters from the ciphertext
		 
		 // Fill Bucket 1	
		 HashMap<Character, Integer> firstBucket= new HashMap<Character, Integer>();
		 for(int i=0;i<message_length;i=i+5)
		 {
			 if(firstBucket.containsKey(vigener_cipher.charAt(i)))
			 {
				 int count=firstBucket.get(vigener_cipher.charAt(i));
				 firstBucket.put(vigener_cipher.charAt(i), count+1);
			 }
			 else
			 {
				 firstBucket.put(vigener_cipher.charAt(i), 1);
				
			 }	
		 }		 

  
	  // Fill Bucket 2	
		 HashMap<Character, Integer> secondBucket= new HashMap<Character, Integer>();
		 for(int i=1;i<message_length-1;i=i+5)
		 {
			 if(secondBucket.containsKey(vigener_cipher.charAt(i)))
			 {
				 int count=secondBucket.get(vigener_cipher.charAt(i));
				 secondBucket.put(vigener_cipher.charAt(i), count+1);
			 }
			 else
			 {
				 secondBucket.put(vigener_cipher.charAt(i), 1);
				
			 }	
		 }	  

	  
	  // Fill Bucket 3
		 HashMap<Character, Integer> thirdBucket= new HashMap<Character, Integer>();
		 for(int i=2;i<message_length-2;i=i+5)
		 {
			 if(thirdBucket.containsKey(vigener_cipher.charAt(i)))
			 {
				 int count=thirdBucket.get(vigener_cipher.charAt(i));
				 thirdBucket.put(vigener_cipher.charAt(i), count+1);	 
			
			 }
			 else
			 {
				 thirdBucket.put(vigener_cipher.charAt(i), 1);
				
			 }	   
		 
		 }	 	 
	
		  
		  
		  // Fill Bucket 4
			 HashMap<Character, Integer> fourthBucket= new HashMap<Character, Integer>();
			 for(int i=3;i<message_length-3;i=i+5)
			 {
				 if(fourthBucket.containsKey(vigener_cipher.charAt(i)))
				 {
					 int count=fourthBucket.get(vigener_cipher.charAt(i));
					 fourthBucket.put(vigener_cipher.charAt(i), count+1);	 
				
				 }
				 else
				 {
					 fourthBucket.put(vigener_cipher.charAt(i), 1);
					
				 }	   
			 
			 }	 	 
		
		  
			  // Fill Bucket 5
				 HashMap<Character, Integer> fifthBucket= new HashMap<Character, Integer>();
				 for(int i=4;i<message_length-4;i=i+5)
				 {
					 if(fifthBucket.containsKey(vigener_cipher.charAt(i)))
					 {
						 int count=fifthBucket.get(vigener_cipher.charAt(i));
						 fifthBucket.put(vigener_cipher.charAt(i), count+1);
					 }
					 else
					 {
						 fifthBucket.put(vigener_cipher.charAt(i), 1);
						
					 }	   
				 
				 }	 	 
		
			  
		  
			//___________________________________________________________________________________________________________________________________________
		    // Buckets are filled, time for frequency analysis
		    // Every bucket should has 26 char				  
			// Bucket 1	  
			 HashMap<Character, Double> firstBucket_Frequency= new HashMap<Character, Double>();			 
		  
				 Set<Character> keys = englishFrequencyTable.keySet();	
				 // Normalized the table, if any letter is missing, introduce it
							
				 double []shiftArray_1=new double[26];
				 int counter_1=0;
				 for (Character k : keys) 
				 {				
				 
				    if(firstBucket.containsKey(k))
				    {
				    	// Saving the frequency in the hash table. This is helpful to check the key corresponding value
				    	firstBucket_Frequency.put(k, Double.valueOf(firstBucket.get(k)));
				    	// Saving the frequency in the array
				    	shiftArray_1[counter_1]=Double.valueOf(firstBucket.get(k));
				    	counter_1++;
				    }
				    else
				    {
				    	firstBucket_Frequency.put(k,0.0);
				    	shiftArray_1[counter_1]=0.0;
				    	counter_1++;
				    }
					 
				 }

				 
				double sum1=0.0;
				double max_value_of_sum1=0.0;
				int index_of_shift1=0;
				for(int i=0;i<26;i++)
				{	
						
					 sum1=0.0;
					
					for(int k=0;k<alphabetArraySize;k++)
					{	
						sum1=sum1+( (shiftArray_1[k])* (englishFrequencyTable.get(englishAlphabets[k])));
						if(sum1>max_value_of_sum1)
						{
							max_value_of_sum1=sum1;
							index_of_shift1=i;
						}
					}
									
				
					//just shift
					// hold the first char of the array
					double first_frequency1=shiftArray_1[0];
					for(int j=0;j<alphabetArraySize;j++)
					{
							if(j<alphabetArraySize-1)
							{
								shiftArray_1[j]=shiftArray_1[j+1];
							}
							else if(j==alphabetArraySize-1)
							{
								shiftArray_1[j]=first_frequency1;
							}
					}					
				}
				 
			
//___________________________________________________________________________________________________________________________________________
				 
				// Bucket 2	  
				 HashMap<Character, Double> secondBucket_Frequency= new HashMap<Character, Double>();			 
			
					
					 double []shiftArray_2=new double[26];
					 int counter_2=0;
					 for (Character k : keys) 
					 {				
					 
					    if(secondBucket.containsKey(k))
					    {
					    	// Saving the frequency in the hash table. This is helpful to check the key corresponding value
					    	secondBucket_Frequency.put(k, Double.valueOf(secondBucket.get(k)));
					    	// Saving the frequency in the array
					    	shiftArray_2[counter_2]=Double.valueOf(secondBucket.get(k));
					    	counter_2++;
					    }
					    else
					    {
					    	secondBucket_Frequency.put(k,0.0);
					    	shiftArray_2[counter_2]=0.0;
					    	counter_2++;
					    }
						 
					 }
					 
					double sum2=0.0;
					double max_value_of_sum2=0.0;
					int index_of_shift2=0;
					for(int i=0;i<26;i++)
					{		
						
						 sum2=0.0;
						for(int k=0;k<alphabetArraySize;k++)
						{	
							sum2=sum2+( (shiftArray_2[k])* (englishFrequencyTable.get(englishAlphabets[k])));
							if(sum2>max_value_of_sum2)
							{
								max_value_of_sum2=sum2;
								index_of_shift2=i;
							}
						}
					
						double first_frequency2=shiftArray_2[0];
						for(int j=0;j<alphabetArraySize;j++)
						{
								if(j<alphabetArraySize-1)
								{
									shiftArray_2[j]=shiftArray_2[j+1];
								}
								else if(j==alphabetArraySize-1)
								{
									shiftArray_2[j]=first_frequency2;
								}
						}					
					}
				
					//___________________________________________________________________________________________________________________________________________
					 			 
			           // Bucket 3	  
					     HashMap<Character, Double> thirdBucket_Frequency= new HashMap<Character, Double>();
						 // Normalized the table, if any letter is missing, introduce it
						
						 double []shiftArray_3=new double[26];
						 int counter_3=0;
						 for (Character k : keys) 
						 {				
						 
						    if(thirdBucket.containsKey(k))
						    {
						    	// Saving the frequency in the hash table. This is helpful to check the key corresponding value
						    	thirdBucket_Frequency.put(k, Double.valueOf(thirdBucket.get(k)));
						    	// Saving the frequency in the array
						    	shiftArray_3[counter_3]=Double.valueOf(thirdBucket.get(k));
						    	counter_3++;
						    }
						    else
						    {
						    	thirdBucket_Frequency.put(k,0.0);
						    	shiftArray_3[counter_3]=0.0;
						    	counter_3++;
						    }
							 
						 }
						 
						double sum3=0.0;
						double max_value_of_sum3=0.0;
						int index_of_shift3=0;
						for(int i=0;i<26;i++)
						{		

							 sum3=0.0;
							for(int k=0;k<alphabetArraySize;k++)
							{	
								sum3=sum3+( (shiftArray_3[k])* (englishFrequencyTable.get(englishAlphabets[k])));
								if(sum3>max_value_of_sum3)
								{
									max_value_of_sum3=sum3;
									index_of_shift3=i;
								}
							}
					        //just shift
							// hold the first char of the array
							double first_frequency3=shiftArray_3[0];
							for(int j=0;j<alphabetArraySize;j++)
							{
									if(j<alphabetArraySize-1)
									{
										shiftArray_3[j]=shiftArray_3[j+1];
									}
									else if(j==alphabetArraySize-1)
									{
										shiftArray_3[j]=first_frequency3;
									}
							}					
						}
					 
					
						//___________________________________________________________________________________________________________________________________________
						 			 
				           // Bucket 4	  
					    	 HashMap<Character, Double> fourthBucket_Frequency= new HashMap<Character, Double>();								
							 // Normalized the table, if any letter is missing, introduce it							
							 double []shiftArray_4=new double[26];
							 int counter_4=0;
							 for (Character k : keys) 
							 {				
							 
							    if(fourthBucket.containsKey(k))
							    {
							    	// Saving the frequency in the hash table. This is helpful to check the key corresponding value
							    	fourthBucket_Frequency.put(k, Double.valueOf(fourthBucket.get(k)));
							    	// Saving the frequency in the array
							    	shiftArray_4[counter_4]=Double.valueOf(fourthBucket.get(k));
							    	counter_4++;
							    }
							    else
							    {
							    	fourthBucket_Frequency.put(k,0.0);
							    	shiftArray_4[counter_4]=0.0;
							    	counter_4++;
							    }
								 
							 }
							 
							double sum4=0.0;
							double max_value_of_sum4=0.0;
							int index_of_shift4=0;
							for(int i=0;i<26;i++)
     						{		
						
								 sum4=0.0;
								for(int k=0;k<alphabetArraySize;k++)
								{	
									sum4=sum4+( (shiftArray_4[k])* (englishFrequencyTable.get(englishAlphabets[k])));
									if(sum4>max_value_of_sum4)
									{
										max_value_of_sum4=sum4;
										index_of_shift4=i;
									}
								}
															
								//just shift
								// hold the first char of the array
								double first_frequency4=shiftArray_4[0];
								for(int j=0;j<alphabetArraySize;j++)
								{
										if(j<alphabetArraySize-1)
										{
											shiftArray_4[j]=shiftArray_4[j+1];
										}
										else if(j==alphabetArraySize-1)
										{
											shiftArray_4[j]=first_frequency4;
										}
								}					
							}
						//___________________________________________________________________________________________________________________________________________
					           // Bucket 5	  
							 HashMap<Character, Double> fifthBucket_Frequency= new HashMap<Character, Double>();	
								 // Normalized the table, if any letter is missing, introduce it
								 double []shiftArray_5=new double[26];
								 int counter_5=0;
								 for (Character k : keys) 
								 {				
								 
								    if(fifthBucket.containsKey(k))
								    {
								    	// Saving the frequency in the hash table. This is helpful to check the key corresponding value
								    	fifthBucket_Frequency.put(k, Double.valueOf(fifthBucket.get(k)));
								    	// Saving the frequency in the array
								    	shiftArray_5[counter_5]=Double.valueOf(fifthBucket.get(k));
								    	counter_5++;
								    }
								    else
								    {
								    	fifthBucket_Frequency.put(k,0.0);
								    	shiftArray_5[counter_5]=0.0;
								    	counter_5++;
								    }
									 
								 }
								 
								double sum5=0.0;
								double max_value_of_sum5=0.0;
								int index_of_shift5=0;
								for(int i=0;i<26;i++)
								{		
																			
									 sum5=0.0;								
									for(int k=0;k<alphabetArraySize;k++)
									{	
										sum5=sum5+( (shiftArray_5[k])* (englishFrequencyTable.get(englishAlphabets[k])));
										if(sum5>max_value_of_sum5)
										{
											max_value_of_sum5=sum5;
											index_of_shift5=i;
										}
									}
										
							        //just shift
									// hold the first char of the array
									double first_frequency5=shiftArray_5[0];
									for(int j=0;j<alphabetArraySize;j++)
									{
											if(j<alphabetArraySize-1)
											{
												shiftArray_5[j]=shiftArray_5[j+1];
											}
											else if(j==alphabetArraySize-1)
											{
												shiftArray_5[j]=first_frequency5;
											}
									}					
								}
								 
					//___________________________________________________________________________________________________________________________________________
					
					 // It time to Recover Keys, we will recover keys using values
				    // Recover Key 1
					 Integer i1=index_of_shift1;
				        char recoveredKey1='\0';
				        for(Map.Entry entry: englishLetterPositionTable.entrySet()){
				            if(i1.equals(entry.getValue())){
				            	recoveredKey1 =(Character)entry.getKey();
				                break; //breaking because its one to one map
				            }
				        }
				        
				        // Recover Key 2
						 Integer i2=index_of_shift2;
					        char recoveredKey2='\0';
					        for(Map.Entry entry: englishLetterPositionTable.entrySet()){
					            if(i2.equals(entry.getValue())){
					            	recoveredKey2 =(Character)entry.getKey();
					                break; //breaking because its one to one map
					            }
					        }
					        // Recover Key 3
					        Integer i3=index_of_shift3;
					        char recoveredKey3='\0';
					        for(Map.Entry entry: englishLetterPositionTable.entrySet()){
					            if(i3.equals(entry.getValue())){
					            	recoveredKey3 =(Character)entry.getKey();
					                break; //breaking because its one to one map
					            }
					        }

					        // Recover Key 4
					        Integer i4=index_of_shift4;
					        char recoveredKey4='\0';
					        for(Map.Entry entry: englishLetterPositionTable.entrySet()){
					            if(i4.equals(entry.getValue())){
					            	recoveredKey4 =(Character)entry.getKey();
					                break; //breaking because its one to one map
					            }
					        }
					        
					        // Recover Key 5
					        Integer i5=index_of_shift5;
					        char recoveredKey5='\0';
					        for(Map.Entry entry: englishLetterPositionTable.entrySet()){
					            if(i5.equals(entry.getValue())){
					            	recoveredKey5 =(Character)entry.getKey();
					                break; //breaking because its one to one map
					            }
					        }
				          
				           // System.out.println("KEY : \t" +recoveredKey1 +"\t"+ recoveredKey2+"\t"+recoveredKey3+ "\t"+recoveredKey4 +"\t"+recoveredKey5); 
				            //---------------------------------------------------------------------------------------------------------------------------------
				            // Decryption Process
				            //________________________________________________________________________________________________________________________
				            				         
				                String plaintext="";
				                String key=String.valueOf(recoveredKey1)+String.valueOf(recoveredKey2)+String.valueOf(recoveredKey3)+String.valueOf(recoveredKey4)+String.valueOf(recoveredKey5);
				                System.out.println("Key: "+key);
				                for (int i = 0,j=0 ; i < message_length; i++,j++)
				                {
				                	if(j==key_length)
				                	{
				                		j=0;
				                	}				                	
				                    // converting in range 0-25
				                    int x = (vigener_cipher.charAt(i)-key.charAt(j) + 26) %26;				             
				                    // convert into alphabets(ASCII)
				                    x += 'A';
				                    plaintext+=(char)(x);
				                   
				                }
				               
				                System.out.println("Plaintext : "+plaintext);	
				   	 
		} //main
	  

}
