// Class created by xCabbage [github.com/xcabbage] 
// for the trololus project [github.com/xcabbage/trololus]

package game.core;

import java.awt.Dimension;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;
import game.states.*;

public class Trololus extends StateBasedGame {

	static boolean fullscreen = false;
	static boolean ShowFPS = true;
	static game.util.FastGraphics utilGfx = new game.util.FastGraphics();
	static int width = 1000;
	static int height = 500;
	static int fpslimit = 60;
	static String title = "Trololus NightBuild.0";
	static public Dimension res;
	
	static public void cleanRes() throws SlickException{
		app.setDisplayMode((int) (res.width*.75), (int)(res.height*.75), fullscreen);
	}
	public Trololus(String title) {
		super(title);
	}

	public static AppGameContainer app;

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		addState(new MainState());
		addState(new MenuState());
	}

	public static void main(String[] args) throws SlickException {
		res = utilGfx.getRes();
		Pepta pepta = new Pepta();
		pepta.createPlayers();

		app = new AppGameContainer(new Trololus(title));
		cleanRes();
		app.setSmoothDeltas(true);
		app.setTargetFrameRate(fpslimit);
		app.setVSync(true);
		app.start();

	}

	@Override
	/**
	 * @see org.newdawn.slick.state.StateBasedGame#keyPressed(int, char)
	 */
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);

		if (key == Input.KEY_F4) {
			if (app != null) {
				try {

					if (!app.isFullscreen()) {
						System.out.println("Entering FullScreen mode.");
						app.setDisplayMode(utilGfx.getRes().width,
								utilGfx.getRes().height, true);

					} else {
						System.out.println("Returning from fullscreen.");
						app.setFullscreen(false);
						app.setDisplayMode(width, height, false);

					}
				} catch (SlickException e) {
					e.printStackTrace();
					;
				}
			}
		}

	}

}
