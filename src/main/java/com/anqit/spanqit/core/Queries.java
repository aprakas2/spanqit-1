package com.anqit.spanqit.core;

/**
 * A class with static methods to create SPARQL queries
 * 
 * @author Ankit
 *
 * @see <a href="http://www.w3.org/TR/2013/REC-sparql11-query-20130321/"> SPARQL
 *      Query Language</a>
 */
public class Queries {
	// prevent instantiation of this class
	private Queries() {

	}

	/**
	 * Create a SPARQL Select query
	 * 
	 * @return a new SPARQL Select query
	 * 
	 * @see <a
	 *      href="http://www.w3.org/TR/2013/REC-sparql11-query-20130321/#select">SPARQL
	 *      Select Query</a>
	 */
	public static SelectQuery SELECT() {
		return new SelectQuery();
	}

	/**
	 * Create a SPARQL Construct query
	 * 
	 * @return a new Construct query
	 * 
	 * @see <a
	 *      href="http://www.w3.org/TR/2013/REC-sparql11-query-20130321/#construct">SPARQL
	 *      Construct Query</a>
	 */
	public static ConstructQuery CONSTRUCT() {
		return new ConstructQuery();
	}
}