/**
 * 
 */
package org.dimigo.exception;

/*
 *
 * <pre>
 * org.dimigo.exception
 *      |_ AgeCheckException
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class AgeCheckException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public AgeCheckException() {}
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}
