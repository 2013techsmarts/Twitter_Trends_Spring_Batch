package org.smarttechie.twitter.model;

public class TwitterTrend {
	
	/**
	 * Holds name
	 */
	private String name;
	
	/**
	 * Holds query property
	 */
	private String query;
	
	/**
	 * Holds url property
	 */
	private String url;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name = ").append(getName()).append("query = ").append(getQuery()).append("url = ").append(getUrl());
		return sb.toString();
	}
}
