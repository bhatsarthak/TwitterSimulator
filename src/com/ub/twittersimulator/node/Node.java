/**
 * 
 */
package com.ub.twittersimulator.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abhi
 *
 */

/*
 * Class contains fields and methods detailing node information.
 */
public class Node {

	private Integer nodeId;
	private String userName;
	private String handle;
	private Integer socialCount;
	private Integer infoCount;
	private List<String> tweets;
	private List<String> newsFeed;
	private List<Integer> following;
	private List<Integer> followers;
	
	public Node(){
		socialCount = 0;
		infoCount = 0;
		following = new ArrayList<Integer>();
		followers = new ArrayList<Integer>();
		tweets = new ArrayList<String>();
		newsFeed = new ArrayList<String>();
	}
	
	
	/**
	 * @return the socialCount
	 */
	public Integer getSocialCount() {
		return socialCount;
	}
	/**
	 * @param socialCount the socialCount to set
	 */
	public void setSocialCount(Integer socialCount) {
		this.socialCount = socialCount;
	}
	/**
	 * @return the infoCount
	 */
	public Integer getInfoCount() {
		return infoCount;
	}
	/**
	 * @param infoCount the infoCount to set
	 */
	public void setInfoCount(Integer infoCount) {
		this.infoCount = infoCount;
	}
	/**
	 * @return the nodeId
	 */
	public Integer getNodeId() {
		return nodeId;
	}
	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the handle
	 */
	public String getHandle() {
		return handle;
	}
	/**
	 * @param handle the handle to set
	 */
	public void setHandle(String handle) {
		this.handle = handle;
	}
	/**
	 * @return the nodeType
	 */

	/**
	 * @return the tweets
	 */
	public List<String> getTweets() {
		return tweets;
	}
	/**
	 * @param tweets the tweets to set
	 */
	public void setTweets(List<String> tweets) {
		this.tweets = tweets;
	}
	/**
	 * @return the newsFeed
	 */
	public List<String> getNewsFeed() {
		return newsFeed;
	}
	/**
	 * @param newsFeed the newsFeed to set
	 */
	public void setNewsFeed(List<String> newsFeed) {
		this.newsFeed = newsFeed;
	}
	/**
	 * @return the following
	 */
	public List<Integer> getFollowing() {
		return following;
	}
	/**
	 * @param following the following to set
	 */
	public void setFollowing(List<Integer> following) {
		this.following = following;
	}
	/**
	 * @return the followers
	 */
	public List<Integer> getFollowers() {
		return followers;
	}
	/**
	 * @param followers the followers to set
	 */
	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}
	
	
} 
