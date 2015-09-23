/**
 * 
 */
package org.dimigo.exception;

/*
 *
 * <pre>
 * org.dimigo.exception
 *      |_ MovieTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MovieTest m = new MovieTest();
		
		try{
			Movie[] movies = {
					new Movie("베테랑", 15),
					new Movie("앤트맨", 12),
					new Movie("사도", 12)
			};
			int age = 13;
			
			for(Movie movie : movies) {
				try {
					m.buyTicket(movie, age);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void buyTicket(Movie movie, int age) throws AgeCheckException {
		if( age > movie.getLimitAge() )
		System.out.println(movie.getTitle() + "영화 즐감하세요");
		
		else{
			throw new AgeCheckException(movie);
		}
	}
}
