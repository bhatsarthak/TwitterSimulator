/**
 * 
 */
package com.ub.twittersimulator.main;

import java.util.List;
import java.util.Scanner;

import com.ub.twittersimulator.node.NetworkGenerator;
import com.ub.twittersimulator.node.Node;
import com.ub.twittersimulator.node.NodeStatistics;

/**
 * @author abhi
 *
 */
public class Main {

	public static void main(String args[]){
		
		
		Scanner in = new Scanner(System.in);
		
		int networkSize = 0;
		int initialNetworkSize = 0;
		int links = 0;
		int nodeId = 0;
		String response;
		List<Node> nodeList = null;
		
		try{
			
			System.out.println("Enter network size: ");
			networkSize = in.nextInt();
						
			System.out.println("Enter initial network size: ");
			initialNetworkSize = in.nextInt();
			
			System.out.println("Enter number of links to be formed: ");
			links = in.nextInt();
			
			NetworkGenerator netGen = new NetworkGenerator();
			nodeList = netGen.createNodes(networkSize, initialNetworkSize, links);
			
			System.out.println("Network of size "+networkSize+" is generated. \n");
			
			while(true){
				System.out.println("Enter node id to retrieve node statistics: ");
				nodeId = in.nextInt();
				
				NodeStatistics stats = new NodeStatistics();
				stats.printNodeInformation(nodeList, nodeId);
				
				System.out.println("Do you want to exit the program? (Y/N)");
				response = in.next();
				if(response.equalsIgnoreCase("y")){
					break;
				}
			}
	
			
		}
		catch(Exception e){
			System.out.println("Incorrect input");
		}
	
	}
}