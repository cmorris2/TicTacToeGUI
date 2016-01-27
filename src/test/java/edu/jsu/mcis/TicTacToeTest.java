package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	TicTacToeModel model = new TicTacToeModel();
	TicTacToeVIEW view = new TicTacToeVIEW();
	TicTacToeController controller = new TicTacToeController(view, model);
	@Before
	
	@Test
	public void testInitialBoardIsEmpty() {
		assertTrue(false);
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		assertTrue(model.PlaceX(2,2)==1);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		assertTrue(model.PlaceO(2,0)==0);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
