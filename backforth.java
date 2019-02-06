/*
ID: overidon
LANG: JAVA
TASK: backforth

*/

package backforth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class backforth {
	
	static boolean debug = true; 

	public static void main(String[] args) throws IOException {

	    BufferedReader f = new BufferedReader(new FileReader("/Users/tylerjaggers/Documents/ECLIPSE_WKSPS/USACO/backforth/src/backforth/backforth.in"));

        // input file name goes above
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/tylerjaggers/Documents/ECLIPSE_WKSPS/USACO/backforth/src/backforth/backforth.out")));

        /*
         * 
         * MONDAY -> MEASURE BOTH TANKS  -> THEY SHOULD BOTH be 1000 gallons of milk 
         * 
         * TUESDAY -> Take bucket from BarnA -> Fill it with milk -> empty it in BarnB then leave bucket there
         * WEDNESDAY -> Take any bucket from barnB -> Fill it with milk -> empty it in barnA -> leave bucket at barnA 
         * 
         * THURSDAY -> Take bucket from BarnA -> Fill it with milk -> empty it in BarnB then leave bucket there
         * FRIDAY -> Take any bucket from barnB -> Fill it with milk -> empty it in barnA -> leave bucket at barnA 
         * SATURDAY -> take measurement of barnA's tank 
         */
        
        
        StringTokenizer st = new StringTokenizer(f.readLine());

        if (debug){
            System.out.println("");
            System.out.println("BUCKET DETAILS: ");
            System.out.print("BARN_A: ");
        }

        int[] barnAClean = new int[10];
        int[] barnBClean = new int[10];


        int incrementer = 0;

        while (st.hasMoreTokens() ){

            int n = Integer.parseInt(st.nextToken());

            if (debug ){
                System.out.print(n + ", ");
            }

            barnAClean[incrementer] = n;

            incrementer++;

        }

        incrementer = 0;
        StringTokenizer st0 = new StringTokenizer(f.readLine());

        if (debug){
            System.out.println("");
            System.out.print("BARN_B: ");
        }


        while (st0.hasMoreTokens() ){

            int n = Integer.parseInt(st0.nextToken());

            if (debug ){
                System.out.print(n + ", ");
            }

            barnBClean[incrementer] = n;

            incrementer++;

        }

        if (debug){
            System.out.println("");
            System.out.println("");
        }


        // let's make a tree using the clean barn data
        Tree tree0 = new Tree(barnAClean, barnBClean);

        if (debug){
            System.out.println("The number of readings are: " + tree0.readings.size());
            System.out.println("Those readings are speficially: " + tree0.readings);
        }

        out.print(tree0.readings.size());
        out.println("");

        f.close();
        out.close();

	        
    // end of main driver method
	}
	
	
// end of backforth class 
}

class Tree {
	
	HashSet <Integer> readings = new HashSet <Integer>();
	ArrayList< Integer> init_A = new ArrayList<Integer>();
	ArrayList< Integer> init_B = new ArrayList<Integer>();
	
	boolean debug = true; 
	
	public Tree( int[] bucketArr0, int[] bucketArr1) {
		
		for (int i = 0; i < 10; i++){
			
			init_A.add( bucketArr0[i] );
			init_B.add( bucketArr1[i]  );

		}
		
		if (this.debug){
			System.out.println(init_A);
			System.out.println(init_B);
	        System.out.println("");
			System.out.println("******* .........TODAY IS MONDAY........ *********");
	        System.out.println("**** Tree 0 will now report information on the buckets at barn A *******");
		}
		
		HashSet<Integer> options = this.reportUniqueOptions(init_A);
		
		if (this.debug){
			System.out.println("the choices for NODE HEADS are: " + options );
			System.out.println("The tree will make a NODE HEAD for each unique option...");
		}
		
		// use a loop to build the heads.. the rest of the work should be recursive... 
		for ( int key : options ){
			new Node(init_A, init_B, 1, key, 1000, 1000);
		}
		
		
		
	// end of the Tree constructor 	
	}
	
	
	public HashSet<Integer> reportUniqueOptions( ArrayList<Integer> targetList) {
		
		HashSet <Integer> unique = new HashSet<Integer>();
		
		for (int i = 0; i < targetList.size(); i++){
			
			if ( unique.contains(targetList.get(i))){
				continue;
			}
			
			unique.add(targetList.get(i));
		}
		
		for (int i = 0; i < targetList.size(); i++){
			
			if ( unique.contains(targetList.get(i))){
				continue;
			}
			
			unique.add(targetList.get(i));
		}
		
		if (this.debug){
			System.out.println("There are "  + unique.size() + " unique buckets to choose from.");
			System.out.println("The unique options are..." + unique);
		}

		return unique;
	}	
	
	
	// Create a recursive replication algorithm
	class Node {
		
		ArrayList< Integer> sys_A = new ArrayList<Integer>();
		ArrayList< Integer> sys_B = new ArrayList<Integer>();
		
		int depth;
		
		int tankALevel;
		int tankBLevel; 
		
		HashSet< Integer > unique = new HashSet<Integer>();
		
		String name; 
		
		boolean debug = true; 
		
		public Node ( ArrayList<Integer> inputSystemA, ArrayList<Integer> inputSystemB, int depth, int selection, int tankALevel, int tankBLevel ) {
			
			this.depth = depth; 
			
			this.tankALevel = tankALevel;
			this.tankBLevel = tankBLevel;
			
			this.name = "0x" + Integer.toString(this.depth) + Integer.toString(selection);
			
			for (int i = 0; i < inputSystemA.size(); i++){
				
				sys_A.add(inputSystemA.get(i));
			}
			
			for (int i = 0; i < inputSystemB.size(); i++){
				
				sys_B.add(inputSystemB.get(i));
			}
			
		

			if (this.depth == 1){
				
				if (this.debug){
					System.out.println("");
					System.out.println("**********......... TODAY IS TUESDAY ...... *********");
					System.out.println("From the perspective of this node...named " + this.name + "  of depth: " + this.depth + " it is now... Tuesday.");
					System.out.println("The current reading of the tankA is: " + this.tankALevel + " gallons.");
					System.out.println("The current reading of the tankB is: " + this.tankBLevel + " gallons.");
					System.out.println("This node was generated with " + selection + " as its selection... ");
					System.out.println("Since it is Tuesday... this node should take milk from tankA and give it to tankB... and leave the bucket at tankB. ");
				}
				
				// transfer the milk..... from A to B 
				this.transferMilk(0, 1, selection);
				
				// the next choice should be from the options from area B 
				this.reportUniqueOptions(this.sys_B);
				
				if (this.debug){
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
					System.out.println("...... --->>>>>> creating child node now....");
				}
				
				for ( int key : this.unique){
					new Node(sys_A, sys_B, 2, key, this.tankALevel, this.tankBLevel);
				}	
			}
			
			if (this.depth == 2){
				
				if (this.debug){
					System.out.println("");
					System.out.println("**********......... TODAY IS WEDNESDAY ...... *********");
					System.out.println("From the perspective of this node...named " + this.name + "  of depth: " + this.depth + " it is now... Wednesday.");
					System.out.println("The current reading of the tankA is: " + this.tankALevel + " gallons.");
					System.out.println("The current reading of the tankB is: " + this.tankBLevel + " gallons.");
					System.out.println("Since it is Wednesday... this node should take milk from tankB and give it to tankA... and leave the bucket at tankA. ");
					System.out.println("This node was generated with " + selection + " as its selection... ");
					System.out.println("AFTER PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
				}
			
				
				// transfer the milk..... from B to A 
				this.transferMilk(1, 0, selection);
				
				if (this.debug){
					System.out.println("AFTER PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
				}

				// since a bucket was given to tank A area... we then use a bucket from the A area for moving onto Thursday
				this.reportUniqueOptions(this.sys_A);
				
				if (this.debug){
					System.out.println("...... --->>>>>> creating child node now....");
				}
				
				for ( int key : this.unique){
					
					new Node(sys_A, sys_B, 3, key, this.tankALevel, this.tankBLevel);
				}
			// end of depth 2	
			}
			
			if (this.depth == 3){
				
				if (this.debug){
					System.out.println("");
					System.out.println("**********......... TODAY IS THURSDAY ...... *********");
					System.out.println("From the perspective of this node...named " + this.name + "  of depth: " + this.depth + " it is now... Thursday.");
					System.out.println("The current reading of the tankA is: " + this.tankALevel + " gallons.");
					System.out.println("The current reading of the tankB is: " + this.tankBLevel + " gallons.");
					System.out.println("Since it is Thursday... this node should take milk from tankA and give it to tankB... and leave the bucket at tankB. ");
					System.out.println("This node was generated with " + selection + " as its selection... ");
					System.out.println("AFTER PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
				}
				
				// transfer the milk..... from A to B 
				this.transferMilk(0, 1, selection);
				
				if (this.debug){
					System.out.println("AFTER PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
					
				}
				
				// since a bucket was given to tank B area... we then use a bucket from the B area for moving onto FRIDAY
				this.reportUniqueOptions(this.sys_B);
				
				if (this.debug){
					System.out.println("...... --->>>>>> creating child node now....");
				}
				
				for ( int key : this.unique){
					new Node(sys_A, sys_B, 4, key, this.tankALevel, this.tankBLevel);
				}
			// end of depth 3
			}
			
			
			if (this.depth == 4){
				
				if (this.debug){
					System.out.println("");
					System.out.println("**********......... TODAY IS FRIDAY -- ALMOST the weekend!!! :D  ...... *********");
					System.out.println("From the perspective of this node...named " + this.name + "  of depth: " + this.depth + " it is now... FRIDAY!!!!.");
					System.out.println("The current reading of the tankA is: " + this.tankALevel + " gallons.");
					System.out.println("The current reading of the tankB is: " + this.tankBLevel + " gallons.");
					System.out.println("Since it is Friday!!!... this node should take milk from tankB and give it to tankA... and leave the bucket at tankA. ");
					System.out.println("This node was generated with " + selection + " as its selection... ");
					
					// no more children are needed... no need for reporting unique items either... 
					System.out.println("BEFORE PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
					
				}
				
				// transfer the milk..... from B to A 
				this.transferMilk(1, 0, selection);
				
				if (this.debug){
					System.out.println("AFTER PASSING THE BUCKET: " + selection);
					System.out.println("The system of buckets for tankA is: " + this.sys_A);
					System.out.println("The system of buckets for tankB is: " + this.sys_B);
					System.out.println("...... --->>>>>> it's TIME TO REPORT back to to the TREEE!!!! yes!!!!....");
					System.out.println("The new tank reading for tankA is: " + this.tankALevel);
					
				}
				

				if (!readings.contains(this.tankALevel)){
					readings.add(this.tankALevel);
				}
				
			// end of depth 3
			}
			
		}
		
		public void transferMilk (int tankFrom, int tankTo, int amount) {
			
			if (this.debug){
				System.out.println("");
				System.out.println("***** ..... milk transfer in progress..... ******");
				System.out.println("Before the transfer this node named: " + this.name + " has a the following milk levels: " );
				System.out.println("tankA level: " + this.tankALevel);
				System.out.println("tankB level: " + this.tankBLevel);
				
			}
			
			// OPTIMIZATION POTENTIAL here... 
			if ( tankFrom == 0){
				this.tankALevel -= amount; 
				this.tankBLevel += amount; 
				
				for (int i = 0; i < this.sys_A.size(); i++){
					if (this.sys_A.get(i) == amount){
	
						this.sys_B.add(amount);
						this.sys_A.remove(i);
						break;
					}
				}
			} else {
				this.tankBLevel -= amount; 
				this.tankALevel += amount; 
				
				for (int i = 0; i < this.sys_B.size(); i++){
					if (this.sys_B.get(i) == amount){
						this.sys_A.add(amount);
						this.sys_B.remove(i);
						break;
					}
				}
			}
			

			if (this.debug){
				System.out.println("AFTER the transfer this node named: " + this.name + " has a the following milk levels: " );
				System.out.println("tankA level: " + this.tankALevel);
				System.out.println("tankB level: " + this.tankBLevel);
				
			}
			
			
			
		}
		public HashSet<Integer> reportUniqueOptions( ArrayList<Integer> targetList) {
			
			
			for (int i = 0; i < targetList.size(); i++){
				
				if ( this.unique.contains(targetList.get(i))){
					continue;
				}
				
				this.unique.add(targetList.get(i));
			}
			
			if (this.debug){
				System.out.println("There are "  + this.unique.size() + " unique buckets to choose from.");
				System.out.println("The unique options are..." + this.unique);
			}
			
			return unique;
		}	
		
		
	// end of Node Inner class ... 
	}
	
// end of Tree class 
}
